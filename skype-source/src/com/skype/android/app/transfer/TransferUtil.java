// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.util.g;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import com.skype.Account;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.Transfer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.chat.OfficeNotInstalledActivity;
import com.skype.android.config.FileUtil;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferType, PathRetriever, InstalledAppVerifier

public class TransferUtil
{

    public static final int APP_DOWNLOAD_CANCELED = 1;
    private static final String INTENT_TYPE_IMAGE = "image/";
    public static final int ONE_GIGABYTE = 0x40000000;
    public static final int ONE_KILOBYTE = 1024;
    public static final int ONE_MEGABYTE = 0x100000;
    public static final String SEPARATOR = " / ";
    private static final Logger log = Logger.getLogger("TransferUtil");
    private Provider accountProvider;
    private Analytics analytics;
    private Context context;
    private ObjectIdMap map;
    private TimeAnomalyTelemetry timeAnomalyTelemetry;
    private TimeUtil timeUtil;

    public TransferUtil(Context context1, AccountProvider accountprovider, ObjectIdMap objectidmap, TimeUtil timeutil, TimeAnomalyTelemetry timeanomalytelemetry, Analytics analytics1)
    {
        context = context1;
        accountProvider = accountprovider;
        map = objectidmap;
        timeUtil = timeutil;
        timeAnomalyTelemetry = timeanomalytelemetry;
        analytics = analytics1;
    }

    public static float byteToUnit(long l, float f)
    {
        return (float)l / f;
    }

    private transient String getString(int i, Object aobj[])
    {
        return context.getString(i, aobj);
    }

    public static g queryFileSize(long l)
    {
        if (l < 1024L)
        {
            return new g(Integer.valueOf(0x7f0803d0), String.format("%.0f", new Object[] {
                Float.valueOf(l)
            }));
        }
        String s;
        int i;
        if (l < 0x100000L)
        {
            s = String.format("%.0f", new Object[] {
                Float.valueOf(byteToUnit(l, 1024F))
            });
            i = 0x7f0803d2;
        } else
        if (l < 0x40000000L)
        {
            s = String.format("%.2f", new Object[] {
                Float.valueOf(byteToUnit(l, 1048576F))
            });
            i = 0x7f0803d3;
        } else
        {
            s = String.format("%.2f", new Object[] {
                Float.valueOf(byteToUnit(l, 1.073742E+09F))
            });
            i = 0x7f0803d1;
        }
        return new g(Integer.valueOf(i), s);
    }

    public static final TransferType queryFileType(String s, String s1)
    {
        if (s != null)
        {
            if (s.startsWith("image"))
            {
                return TransferType.IMAGE;
            }
            if (s.startsWith("audio"))
            {
                return TransferType.AUDIO;
            }
            if (s.startsWith("video"))
            {
                return TransferType.VIDEO;
            }
            if (s.contains("pdf"))
            {
                return TransferType.PDF;
            }
            if (s.contains("vcard"))
            {
                return TransferType.VCARD;
            }
        }
        return TransferType.getDocType(s1);
    }

    public String consolidateFileName(Transfer transfer)
    {
        return FileUtil.consolidateFileName(transfer.getFilenameProp(), getDownloadsDirectory());
    }

    public File getDownloadsDirectory()
    {
        return FileUtil.getDownloadsDirectory();
    }

    public File getFileDirectory(Transfer transfer)
    {
        transfer = transfer.getFilepathProp();
        if (!TextUtils.isEmpty(transfer))
        {
            if ((transfer = new File(transfer)).exists())
            {
                return transfer.getParentFile();
            }
        }
        return null;
    }

    String[] getFiles(Uri uri)
    {
        Object obj = null;
        String as[] = obj;
        if (uri != null)
        {
            uri = PathRetriever.getPath(context, uri, false);
            as = obj;
            if (uri != null)
            {
                as = obj;
                if ((new File(uri)).exists())
                {
                    as = new String[1];
                    as[0] = uri;
                }
            }
        }
        return as;
    }

    public String getLocalFilename(Transfer transfer)
    {
        String s = transfer.getFilepathProp();
        if (TextUtils.isEmpty(s))
        {
            return transfer.getFilenameProp();
        } else
        {
            return s.substring(s.lastIndexOf(File.separator) + 1, s.length());
        }
    }

    public CharSequence getMessageNotification(Message message)
    {
        List list = getTransfers(message);
        if (message.getAuthorProp().equals(((Account)accountProvider.get()).getSkypenameProp()))
        {
            if (list.size() == 1)
            {
                if (isCompleted((Transfer)list.get(0)))
                {
                    return context.getResources().getQuantityString(0x7f0b0012, 1, new Object[] {
                        Integer.valueOf(1)
                    });
                } else
                {
                    return getString(0x7f0803cc, new Object[0]);
                }
            } else
            {
                return context.getResources().getQuantityString(0x7f0b0012, 1, new Object[] {
                    Integer.valueOf(1)
                });
            }
        }
        if (getOngoingTransfers(list).size() != 0)
        {
            return getString(0x7f0803c4, new Object[0]);
        }
        if (getTransfersByStatus(list, com.skype.Transfer.STATUS.CONNECTING).size() != 0)
        {
            return getString(0x7f0803cf, new Object[0]);
        }
        int i = getTransfersByStatus(list, com.skype.Transfer.STATUS.COMPLETED).size();
        if (i != 0)
        {
            return context.getResources().getQuantityString(0x7f0b0011, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            return context.getResources().getQuantityString(0x7f0b0010, list.size(), new Object[] {
                Integer.valueOf(list.size())
            });
        }
    }

    public List getOngoingTransfers(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (list.hasNext())
            {
                Transfer transfer = (Transfer)list.next();
                static final class _cls2
                {

                    static final int $SwitchMap$com$skype$Transfer$STATUS[];

                    static 
                    {
                        $SwitchMap$com$skype$Transfer$STATUS = new int[com.skype.Transfer.STATUS.values().length];
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING_OVER_RELAY.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED_BY_REMOTE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.FAILED.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.COMPLETED.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2..SwitchMap.com.skype.Transfer.STATUS[transfer.getStatusProp().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                    arraylist.add(transfer);
                    break;
                }
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public List getRealTransfers(List list)
    {
        list.remove(getSharedFileController(list));
        return list;
    }

    public Transfer getSharedFileController(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Transfer transfer = (Transfer)list.next();
            if (transfer.getPartnerHandleProp().equalsIgnoreCase(((Account)accountProvider.get()).getSkypenameProp()) && transfer.getStatusProp() == com.skype.Transfer.STATUS.WAITING_FOR_ACCEPT)
            {
                return transfer;
            }
        }

        return null;
    }

    public List getTransfers(Message message)
    {
        ArrayList arraylist = new ArrayList();
        message = message.getTransfers().m_transferObjectIDList;
        int j = message.length;
        for (int i = 0; i < j; i++)
        {
            int k = message[i];
            arraylist.add((Transfer)map.a(k, com/skype/Transfer));
        }

        return arraylist;
    }

    public List getTransfersByStatus(List list, com.skype.Transfer.STATUS status)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Transfer transfer = (Transfer)list.next();
            if (transfer.getStatusProp() == status)
            {
                arraylist.add(transfer);
            }
        } while (true);
        return arraylist;
    }

    public boolean isCompleted(Transfer transfer)
    {
        switch (_cls2..SwitchMap.com.skype.Transfer.STATUS[transfer.getStatusProp().ordinal()])
        {
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public boolean isIncoming(Transfer transfer)
    {
        return transfer.getTypeProp() == com.skype.Transfer.TYPE.INCOMING;
    }

    public void openFile(Transfer transfer, Activity activity)
    {
        Intent intent;
        String s;
        Uri uri;
        TransferType transfertype;
        intent = new Intent("android.intent.action.VIEW");
        s = transfer.getFilepathProp();
        uri = Uri.fromFile(new File(s));
        transfer = new SkypeTelemetryEvent(LogEvent.f);
        transfertype = TransferType.getDocType(s);
        if (transfertype.getAppinfo() != null) goto _L2; else goto _L1
_L1:
        if (s == null || uri == null)
        {
            try
            {
                throw new RuntimeException();
            }
            // Misplaced declaration of an exception variable
            catch (Transfer transfer)
            {
                showFileNotRecognizedDialog(activity, false);
            }
            return;
        }
        s = s.substring(s.lastIndexOf(".") + 1, s.length());
        intent.setDataAndType(uri, MimeTypeMap.getSingleton().getMimeTypeFromExtension(s));
        intent.addFlags(0x10000000);
        context.startActivity(intent);
_L3:
        analytics.a(transfer);
        return;
_L2:
label0:
        {
            if (!InstalledAppVerifier.customPackageExists(context, transfertype.getAppinfo().appPackage))
            {
                break label0;
            }
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(transfertype.getAppinfo().appProtocol).append("ofe|u|").append(s).toString()));
            intent1.addFlags(0x10000000);
            context.startActivity(intent1);
        }
          goto _L3
        Intent intent2 = new Intent(context, com/skype/android/app/chat/OfficeNotInstalledActivity);
        intent2.putExtra("path", s);
        intent2.addFlags(0x10000000);
        activity.startActivityForResult(intent2, 1);
        transfer.put(LogAttributeName.c, Boolean.valueOf(true));
          goto _L3
    }

    public String queryFileSizeString(long l)
    {
        g g1 = queryFileSize(l);
        return getString(((Integer)g1.a).intValue(), new Object[] {
            g1.b
        });
    }

    public String queryFinishTimeString(int i)
    {
        if (i <= 0)
        {
            return "";
        }
        if (i < 10)
        {
            return getString(0x7f0803ce, new Object[0]);
        }
        String s;
        try
        {
            s = timeUtil.a(i, true).toString();
        }
        catch (TimeAnomalyException timeanomalyexception)
        {
            timeAnomalyTelemetry.a(timeanomalyexception, Integer.valueOf(i), "TransferUtil#queryFinishTimeString");
            return "";
        }
        return s;
    }

    public void sendFiles(Uri uri, Conversation conversation)
    {
        uri = getFiles(uri);
        if (uri != null)
        {
            conversation.postFiles(uri, "");
            return;
        } else
        {
            uri = getString(0x7f080385, new Object[0]);
            Toast.makeText(context, uri, 1).show();
            return;
        }
    }

    public void showFileNotRecognizedDialog(final Activity activityContext, final boolean finishactivitynndismiss)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityContext);
        builder.setTitle(0x7f0803d4);
        String s = getDownloadsDirectory().toString();
        s = s.substring(s.lastIndexOf(File.separator) + 1, s.length());
        builder.setMessage(context.getString(0x7f080445, new Object[] {
            s
        }));
        builder.setNegativeButton(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final TransferUtil this$0;
            final Activity val$activityContext;
            final boolean val$finishactivitynndismiss;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (finishactivitynndismiss)
                {
                    activityContext.finish();
                }
            }

            
            {
                this$0 = TransferUtil.this;
                finishactivitynndismiss = flag;
                activityContext = activity;
                super();
            }
        });
        builder.create().show();
    }

}

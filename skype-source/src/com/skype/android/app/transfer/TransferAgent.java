// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.MessageImpl;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.Transfer;
import com.skype.android.SkypeConstants;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.Agent;
import com.skype.android.app.NotificationId;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.ViewUtil;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil, TransferQueue

public class TransferAgent extends Agent
    implements SkypeConstants
{
    private static final class a
    {

        Conversation conversation;
        Message message;

        private a()
        {
        }

    }


    private static final int TRANSFER_ENDED_NOTIFICATION_ID = NotificationId.newId();
    private static final int TRANSFER_INCOMING_ONGOING_NOTIFICATION_ID = NotificationId.newId();
    private static final int TRANSFER_OUTGOING_ONGOING_NOTIFICATION_ID = NotificationId.newId();
    Analytics analytics;
    private android.support.v4.app.x.d builder;
    private Context context;
    SkyLib lib;
    ObjectIdMap map;
    NotificationManager notificationManager;
    private SparseArray transferHolderCollection;
    TransferQueue transferQueue;
    TransferUtil transferUtil;

    public TransferAgent(Application application)
    {
        super(application);
        context = application;
        transferHolderCollection = new SparseArray();
        builder = createNotificationBuilder();
    }

    private void cancelAllOngoingNotifications(int i)
    {
        notificationManager.cancel(TRANSFER_INCOMING_ONGOING_NOTIFICATION_ID | i);
        notificationManager.cancel(TRANSFER_OUTGOING_ONGOING_NOTIFICATION_ID | i);
    }

    private android.support.v4.app.x.d createNotificationBuilder()
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.b(true);
        return d;
    }

    private AnalyticsEvent eventForTransfer(Transfer transfer)
    {
        if (transfer == null)
        {
            return null;
        }
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$Transfer$STATUS[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_BYTESPERSECOND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_BYTESTRANSFERRED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_FINISHTIME.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_STATUS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                $SwitchMap$com$skype$Transfer$STATUS = new int[com.skype.Transfer.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CONNECTING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.WAITING_FOR_ACCEPT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.PAUSED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED_BY_REMOTE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.COMPLETED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.FAILED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING_OVER_RELAY.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.REMOTELY_PAUSED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.NEW.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        switch (_cls1..SwitchMap.com.skype.Transfer.STATUS[transfer.getStatusProp().ordinal()])
        {
        case 8: // '\b'
        case 9: // '\t'
        default:
            return null;

        case 3: // '\003'
            if (flag)
            {
                return AnalyticsEvent.aR;
            } else
            {
                return AnalyticsEvent.aQ;
            }

        case 4: // '\004'
            if (flag)
            {
                return AnalyticsEvent.aL;
            } else
            {
                return AnalyticsEvent.aK;
            }

        case 5: // '\005'
            if (flag)
            {
                return AnalyticsEvent.aN;
            } else
            {
                return AnalyticsEvent.aM;
            }

        case 10: // '\n'
            if (flag)
            {
                return AnalyticsEvent.aT;
            } else
            {
                return AnalyticsEvent.aS;
            }

        case 6: // '\006'
            if (flag)
            {
                return AnalyticsEvent.aJ;
            } else
            {
                return AnalyticsEvent.aI;
            }

        case 7: // '\007'
            if (flag)
            {
                return AnalyticsEvent.aP;
            } else
            {
                return AnalyticsEvent.aO;
            }

        case 11: // '\013'
            break;
        }
        if (flag)
        {
            return AnalyticsEvent.aV;
        } else
        {
            return AnalyticsEvent.aU;
        }
    }

    private PendingIntent getContentIntent(a a1)
    {
        int i = 0;
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.addFlags(0x10000000);
        a1 = a1.conversation.getIdentityProp();
        if (a1 != null)
        {
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("com.skype.identitiy", a1);
        } else
        {
            intent.putExtra("com.skype.index", 0);
        }
        if (a1 != null)
        {
            i = a1.hashCode();
        }
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    private Bitmap getLargeIcon()
    {
        return BitmapFactory.decodeResource(context.getResources(), 0x7f0201c1);
    }

    private a getTransferObjectHolder(Transfer transfer)
    {
        a a2 = (a)transferHolderCollection.get(transfer.getObjectID());
        a a1 = a2;
        if (a2 == null)
        {
            ConversationImpl conversationimpl = new ConversationImpl();
            lib.getConversationByConvoID(transfer.getConvoIdProp(), conversationimpl);
            MessageImpl messageimpl = new MessageImpl();
            lib.getMessageByGuid(transfer.getChatmsgGuidProp(), messageimpl);
            a1 = new a(null);
            a1.conversation = conversationimpl;
            a1.message = messageimpl;
            transferHolderCollection.put(transfer.getObjectID(), a1);
        }
        return a1;
    }

    private void update(android.support.v4.app.x.d d, a a1)
    {
        Object obj = a1.message;
        List list = transferUtil.getRealTransfers(transferUtil.getTransfers(((Message) (obj))));
        int i;
        int j;
        int j1;
        int l1;
        boolean flag;
        if (((Transfer)list.get(0)).getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = "";
        l1 = list.size();
        i = 0;
        j = 1;
        d.b(context.getResources().getColor(0x7f0f00d3));
        j1 = 0;
        do
        {
            if (j1 < l1)
            {
                Object obj2 = (Transfer)list.get(j1);
                int i2 = ((Transfer) (obj2)).getObjectID();
                String s = ((Transfer) (obj2)).getFilenameProp();
                Long long1 = Long.valueOf(Long.parseLong(((Transfer) (obj2)).getBytestransferredProp()));
                long l2 = Long.parseLong(((Transfer) (obj2)).getFilesizeProp());
                com.skype.Transfer.STATUS status = ((Transfer) (obj2)).getStatusProp();
                int l = j;
                int k1 = i;
                Object obj1 = obj;
                if (transferQueue.isTransferQueued(((Transfer) (obj2))))
                {
                    int k;
                    if (((Transfer) (obj2)).getTypeProp() == com.skype.Transfer.TYPE.INCOMING)
                    {
                        obj1 = transferQueue.getIncomingOngoingAndFutureTransferSet(((Transfer) (obj2)).getConvoIdProp());
                        l = i;
                        if (obj1 != null)
                        {
                            l = ((Set) (obj1)).size();
                        }
                        obj1 = transferQueue.getIncomingCompletedTransferSet(((Transfer) (obj2)).getConvoIdProp());
                        i = j;
                        k = l;
                        if (obj1 != null)
                        {
                            i = j + ((Set) (obj1)).size();
                            k = l;
                        }
                    } else
                    {
                        Set set = transferQueue.getOutgoingOngoingAndFutureTransferSet(((Transfer) (obj2)).getConvoIdProp());
                        int i1 = i;
                        if (set != null)
                        {
                            i1 = set.size();
                        }
                        set = transferQueue.getOutgoingCompletedTransferSet(((Transfer) (obj2)).getConvoIdProp());
                        i = j;
                        k = i1;
                        if (set != null)
                        {
                            i = j + set.size();
                            k = i1;
                        }
                    }
                    if (((Transfer) (obj2)).getFinishtimeProp() > 0)
                    {
                        obj = transferUtil.queryFinishTimeString((int)((long)((Transfer) (obj2)).getFinishtimeProp() - System.currentTimeMillis() / 1000L));
                    }
                    if (status == com.skype.Transfer.STATUS.TRANSFERRING || status == com.skype.Transfer.STATUS.TRANSFERRING_OVER_RELAY)
                    {
                        updateTransferOngoing(d, a1, flag, i, k, i2, ((String) (obj)), Long.valueOf(l2), long1);
                    } else
                    if (status == com.skype.Transfer.STATUS.FAILED)
                    {
                        updateTransferFailed(d, a1, i2, flag, ((Transfer) (obj2)).getFailureReasonProp(), s);
                    } else
                    if (status == com.skype.Transfer.STATUS.CANCELLED || status == com.skype.Transfer.STATUS.CANCELLED_BY_REMOTE)
                    {
                        boolean flag1;
                        if (((Transfer) (obj2)).getStatusProp() == com.skype.Transfer.STATUS.CANCELLED_BY_REMOTE)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        updateTransferCanceled(d, a1, i2, long1, flag1, s);
                    } else
                    if (status == com.skype.Transfer.STATUS.COMPLETED)
                    {
                        transferQueue.addToCompletedTransferSet(((Transfer) (obj2)).getConvoIdProp(), ((Transfer) (obj2)));
                        updateTransferCompleted(d, a1, i2, flag, s);
                    }
                    obj2 = eventForTransfer(((Transfer) (obj2)));
                    l = i;
                    k1 = k;
                    obj1 = obj;
                    if (obj2 != null)
                    {
                        analytics.c(((AnalyticsEvent) (obj2)));
                        obj1 = obj;
                        k1 = k;
                        l = i;
                    }
                }
                j1++;
                j = l;
                i = k1;
                obj = obj1;
                continue;
            }
            return;
        } while (true);
    }

    private void updateNotification(Transfer transfer)
    {
        a a1 = getTransferObjectHolder(transfer);
        builder.a(getContentIntent(a1));
        builder.a(System.currentTimeMillis());
        update(builder, (a)transferHolderCollection.get(transfer.getObjectID()));
    }

    private void updateTransferCanceled(android.support.v4.app.x.d d, a a1, int i, Long long1, boolean flag, String s)
    {
        boolean flag1;
        if (long1.longValue() > 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && flag)
        {
            String s1 = context.getString(0x7f0803ba);
            long1 = ViewUtil.a(a1.conversation.getDisplaynameProp().trim(), s1);
            long1.setSpan(new StyleSpan(1), 0, a1.conversation.getDisplaynameProp().trim().length(), 0);
            s = context.getString(0x7f080441, new Object[] {
                s1, s
            });
            long1 = d.c(long1).a(a1.conversation.getDisplaynameProp().trim()).b(s).c(true).a(false).a(0, 0);
            long1.g = getLargeIcon();
            long1.a(0x7f0201b6);
            notificationManager.notify(TRANSFER_ENDED_NOTIFICATION_ID | a1.conversation.getObjectID(), d.e());
        }
        cancelAllOngoingNotifications(i);
    }

    private void updateTransferCompleted(android.support.v4.app.x.d d, a a1, int i, boolean flag, String s)
    {
        cancelAllOngoingNotifications(i);
        if (!flag)
        {
            String s1 = context.getResources().getQuantityString(0x7f0b0011, 1, new Object[] {
                Integer.valueOf(1)
            });
            SpannableStringBuilder spannablestringbuilder = ViewUtil.a(a1.conversation.getDisplaynameProp().trim(), s1);
            spannablestringbuilder.setSpan(new StyleSpan(1), 0, a1.conversation.getDisplaynameProp().trim().length(), 0);
            s = context.getString(0x7f080441, new Object[] {
                s1, s
            });
            s = d.c(spannablestringbuilder).a(a1.conversation.getDisplaynameProp().trim()).b(s).c(true).a(false).a(0, 0);
            s.g = getLargeIcon();
            s.a(0x7f0201b7);
            notificationManager.notify(TRANSFER_ENDED_NOTIFICATION_ID | a1.conversation.getObjectID(), d.e());
        }
    }

    private void updateTransferFailed(android.support.v4.app.x.d d, a a1, int i, boolean flag, com.skype.Transfer.FAILUREREASON failurereason, String s)
    {
        SpannableStringBuilder spannablestringbuilder;
        if (flag)
        {
            failurereason = context.getString(0x7f0803ca);
        } else
        {
            failurereason = context.getString(0x7f0803bb);
        }
        spannablestringbuilder = ViewUtil.a(a1.conversation.getDisplaynameProp().trim(), failurereason);
        spannablestringbuilder.setSpan(new StyleSpan(1), 0, a1.conversation.getDisplaynameProp().trim().length(), 0);
        failurereason = context.getString(0x7f080441, new Object[] {
            failurereason, s
        });
        failurereason = d.c(spannablestringbuilder).a(a1.conversation.getDisplaynameProp().trim()).b(failurereason).c(true).a(false).a(0, 0);
        failurereason.g = getLargeIcon();
        failurereason.a(0x7f0201b6);
        cancelAllOngoingNotifications(i);
        notificationManager.notify(TRANSFER_ENDED_NOTIFICATION_ID | a1.conversation.getObjectID(), d.e());
    }

    private void updateTransferOngoing(android.support.v4.app.x.d d, a a1, boolean flag, int i, int j, int k, String s, 
            Long long1, Long long2)
    {
        if (TextUtils.isEmpty(s))
        {
            cancelAllOngoingNotifications(k);
            return;
        }
        int l = i;
        if (i > j)
        {
            l = j;
        }
        String s1;
        if (flag)
        {
            SpannableStringBuilder spannablestringbuilder;
            if (j == 1)
            {
                s1 = context.getString(0x7f0803c9);
            } else
            {
                s1 = context.getString(0x7f0803cb, new Object[] {
                    Integer.valueOf(l), Integer.valueOf(j)
                });
            }
            j = 0x7f0201c3;
            i = TRANSFER_OUTGOING_ONGOING_NOTIFICATION_ID | k;
        } else
        {
            if (j == 1)
            {
                s1 = context.getString(0x7f0803c4);
            } else
            {
                s1 = context.getString(0x7f0803c5, new Object[] {
                    Integer.valueOf(l), Integer.valueOf(j)
                });
            }
            j = 0x7f0201b4;
            i = TRANSFER_INCOMING_ONGOING_NOTIFICATION_ID | k;
        }
        spannablestringbuilder = ViewUtil.a(a1.conversation.getDisplaynameProp().trim(), s1);
        s = context.getString(0x7f080441, new Object[] {
            transferUtil.queryFileSizeString(long1.longValue()), s
        });
        a1 = d.c(spannablestringbuilder).a(a1.conversation.getDisplaynameProp().trim()).b(ViewUtil.b(s1, s));
        a1.g = getLargeIcon();
        a1.a(j).a(long1.intValue(), long2.intValue()).a(true).b(false).c(false);
        notificationManager.notify(i, d.e());
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnFileTransferInitiated onfiletransferinitiated)
    {
        try
        {
            map.a(onfiletransferinitiated.getTransferObjectID(), com/skype/Transfer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.skype.android.gen.SkyLibListener.OnFileTransferInitiated onfiletransferinitiated)
        {
            onfiletransferinitiated = new AnalyticsParameterContainer();
        }
        String s = (new StringBuilder()).append(getClass().getSimpleName()).append("-onEventForOnFileTransferInitiated").toString();
        onfiletransferinitiated.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, onfiletransferinitiated);
    }

    public void onEvent(com.skype.android.gen.TransferListener.OnPropertyChange onpropertychange)
    {
        Transfer transfer = (Transfer)onpropertychange.getSender();
        switch (_cls1..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            onpropertychange = transfer.getStatusProp();
            switch (_cls1..SwitchMap.com.skype.Transfer.STATUS[onpropertychange.ordinal()])
            {
            default:
                return;

            case 3: // '\003'
                if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
                {
                    notificationManager.cancel(TRANSFER_OUTGOING_ONGOING_NOTIFICATION_ID | transfer.getObjectID());
                    return;
                }
                break;

            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                updateNotification(transfer);
                transferQueue.transferCompleted(transfer);
                return;

            case 8: // '\b'
            case 9: // '\t'
                if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
                {
                    transferQueue.addTransfer(transfer);
                }
                updateNotification(transfer);
                return;

            case 1: // '\001'
            case 2: // '\002'
                break;
            }
            break;
        }
        while (true) 
        {
            return;
        }
    }

}

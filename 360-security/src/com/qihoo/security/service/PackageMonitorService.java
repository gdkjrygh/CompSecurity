// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.g;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.security.app.b;
import com.qihoo.security.dialog.monitor.AbsMonitorDialog;
import com.qihoo.security.dialog.monitor.MonitorDangerDialog;
import com.qihoo.security.dialog.monitor.MonitorWarningDialog;
import com.qihoo.security.locale.d;
import com.qihoo.security.malware.db.a;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.quc.AccountLog;
import com.qihoo.security.receiver.PackageMonitor;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.service:
//            e

public class PackageMonitorService extends UiProcessService
    implements com.qihoo.security.receiver.PackageMonitor.a
{
    class a
    {

        int a[];
        CharSequence b[];
        final PackageMonitorService c;

        a()
        {
            c = PackageMonitorService.this;
            super();
            a = new int[4];
            b = new CharSequence[2];
        }
    }


    private static boolean c = false;
    private PackageMonitor d;
    private com.qihoo.security.malware.a e;
    private final int f = 1;
    private final int g = 2;
    private final int h = 3;
    private final Handler i = new Handler();
    private final com.qihoo.security.malware.a.e j = new com.qihoo.security.malware.a.e() {

        final PackageMonitorService a;

        public void a(com.qihoo.security.malware.a.a a1)
        {
        }

        public void a(com.qihoo.security.malware.a.d d1)
        {
            d1 = (MaliciousInfo)d1.b.get(0);
            if (((MaliciousInfo) (d1)).state == 127)
            {
                com.qihoo.security.service.PackageMonitorService.a(a, d1);
            }
        }

        public void b(com.qihoo.security.malware.a.d d1)
        {
            d1 = d1.b.iterator();
            do
            {
                if (!d1.hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)d1.next();
                if (maliciousinfo != null && maliciousinfo.state == 127)
                {
                    com.qihoo.security.service.PackageMonitorService.a(a, maliciousinfo);
                }
            } while (true);
        }

            
            {
                a = PackageMonitorService.this;
                super();
            }
    };
    private final Handler k = new Handler() {

        final PackageMonitorService a;

        public void handleMessage(Message message)
        {
            AccountLog.a(com.qihoo.security.quc.AccountLog.FUNC_LIST.FUNC_MONITOR_MALWARE);
        }

            
            {
                a = PackageMonitorService.this;
                super();
            }
    };
    private final Runnable l = new Runnable() {

        final PackageMonitorService a;

        public void run()
        {
            a.stopSelf();
        }

            
            {
                a = PackageMonitorService.this;
                super();
            }
    };
    private final Runnable m = new Runnable() {

        final PackageMonitorService a;

        public void run()
        {
            com.qihoo.security.service.PackageMonitorService.a(a);
        }

            
            {
                a = PackageMonitorService.this;
                super();
            }
    };

    public PackageMonitorService()
    {
    }

    private void a()
    {
        i.removeCallbacks(m);
        i.removeCallbacks(l);
        a a1 = c();
        int i1 = a1.a[0];
        if (a1.a[1] + i1 == 0)
        {
            i.postDelayed(l, 60000L);
            return;
        } else
        {
            i.postDelayed(m, 10000L);
            return;
        }
    }

    private void a(int i1)
    {
label0:
        {
            Object obj = com.qihoo.security.malware.db.a.e(this);
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist2 = new ArrayList();
            arraylist.clear();
            arraylist1.clear();
            arraylist2.clear();
            if (obj != null && ((List) (obj)).size() > 0)
            {
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                    if (maliciousinfo != null)
                    {
                        if (maliciousinfo.isUninstall(this))
                        {
                            ((Iterator) (obj)).remove();
                            com.qihoo.security.malware.db.a.a(this, maliciousinfo._id);
                        } else
                        {
                            if (maliciousinfo.isMalware())
                            {
                                arraylist.add(maliciousinfo.packageName);
                            }
                            if (maliciousinfo.isWarning())
                            {
                                arraylist1.add(maliciousinfo.packageName);
                            }
                        }
                    }
                } while (true);
            }
            if (i1 == 1)
            {
                if (!arraylist.isEmpty())
                {
                    com.qihoo.utils.notice.a.a().a(arraylist);
                } else
                {
                    com.qihoo.utils.notice.a.a().b(4097);
                }
            }
            if (i1 == 2)
            {
                if (!arraylist1.isEmpty())
                {
                    com.qihoo.utils.notice.a.a().b(arraylist1);
                } else
                {
                    com.qihoo.utils.notice.a.a().b(4098);
                }
            }
            if (i1 == 3)
            {
                if (arraylist2.isEmpty())
                {
                    break label0;
                }
                com.qihoo.utils.notice.a.a().c(arraylist2);
            }
            return;
        }
        com.qihoo.utils.notice.a.a().b(4109);
    }

    private void a(MaliciousInfo maliciousinfo)
    {
        if (com.qihoo.utils.notice.c.b(b))
        {
            com.qihoo.utils.notice.a.a().b(4096);
            String s;
            if (TextUtils.isEmpty(com.qihoo360.mobilesafe.b.a.a(getApplicationContext(), maliciousinfo.packageName, maliciousinfo.filePath, maliciousinfo.isInstalled)))
            {
                s = maliciousinfo.packageName;
            }
            if (maliciousinfo.isWarning() && com.qihoo.security.malware.db.c.a(getApplicationContext(), maliciousinfo))
            {
                maliciousinfo.riskClass = 0;
            }
            if (maliciousinfo.isHarmful())
            {
                if (maliciousinfo.isMalware())
                {
                    if (!AbsMonitorDialog.a(com/qihoo/security/dialog/monitor/MonitorDangerDialog) && !c)
                    {
                        a(1);
                        com.qihoo.security.app.b.a(b);
                    }
                    if (!SharedPref.a("malware_find_issue_time"))
                    {
                        SharedPref.a(b, "malware_find_issue_time", 0L);
                    }
                } else
                if (maliciousinfo.isWarning())
                {
                    a(2);
                } else
                if (!maliciousinfo.isAdvert());
                android.support.v4.content.g.a(b).a(new Intent("com.qihoo.action.MONITOR_UPDATE"));
                return;
            }
            if (com.qihoo.security.service.e.b())
            {
                com.qihoo.utils.notice.a.a().a(maliciousinfo.packageName);
                return;
            }
        }
    }

    static void a(PackageMonitorService packagemonitorservice)
    {
        packagemonitorservice.a();
    }

    static void a(PackageMonitorService packagemonitorservice, MaliciousInfo maliciousinfo)
    {
        packagemonitorservice.a(maliciousinfo);
    }

    public static void a(boolean flag)
    {
        c = flag;
        if (flag && (AbsMonitorDialog.a(com/qihoo/security/dialog/monitor/MonitorDangerDialog) || AbsMonitorDialog.a(com/qihoo/security/dialog/monitor/MonitorWarningDialog)))
        {
            android.support.v4.content.g.a(SecurityApplication.a()).a(new Intent("com.qihoo.action.MONITOR_DIALOG_FORCE_FINISH"));
        }
    }

    private a c()
    {
        Object obj;
        Object obj1;
        a a1;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        obj1 = null;
        obj = com.qihoo.security.malware.db.a.e(this);
        stringbuilder = new StringBuilder();
        stringbuilder1 = new StringBuilder();
        a1 = new a();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        iterator = ((List) (obj)).iterator();
        obj = null;
_L4:
        Object obj2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
        obj2 = obj;
        if (maliciousinfo == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        if (maliciousinfo.isUninstall(this))
        {
            iterator.remove();
            com.qihoo.security.malware.db.a.a(this, maliciousinfo._id);
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        } else
        {
            obj2 = obj;
            if (!maliciousinfo.isHarmful())
            {
                break MISSING_BLOCK_LABEL_380;
            }
            if (maliciousinfo.isMalware())
            {
                obj = a1.a;
                obj[0] = obj[0] + 1;
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(maliciousinfo.getLabel(SecurityApplication.a()));
                obj = stringbuilder.toString();
            }
            obj2 = obj;
            if (!maliciousinfo.isWarning())
            {
                break MISSING_BLOCK_LABEL_380;
            }
            obj2 = a1.a;
            obj2[1] = obj2[1] + 1;
            obj2 = obj;
            if (stringbuilder1 == null)
            {
                break MISSING_BLOCK_LABEL_380;
            }
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(",");
            }
            stringbuilder1.append(maliciousinfo.getLabel(SecurityApplication.a()));
            obj2 = stringbuilder1.toString();
            obj1 = obj;
            obj = obj2;
        }
_L5:
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2 = a1.b;
        d d1 = a;
        int i1;
        if (a1.a[0] > 1)
        {
            i1 = 0x7f0c011c;
        } else
        {
            i1 = 0x7f0c011b;
        }
        obj2[0] = d1.a(i1, new Object[] {
            obj
        });
        obj = a1.b;
        obj2 = a;
        if (a1.a[1] > 1)
        {
            i1 = 0x7f0c011e;
        } else
        {
            i1 = 0x7f0c011d;
        }
        obj[1] = ((d) (obj2)).a(i1, new Object[] {
            obj1
        });
_L2:
        return a1;
        obj = obj1;
        obj1 = obj2;
          goto _L5
    }

    public void a(String s)
    {
    }

    public void b()
    {
        a();
        a(1);
        a(2);
        a(3);
    }

    public void b(String s)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            try
            {
                Notification notification = new Notification();
                notification.setLatestEventInfo(this, null, null, PendingIntent.getActivity(this, 0, new Intent(), 0));
                startForeground(256, notification);
            }
            catch (Exception exception) { }
        }
        d = new PackageMonitor(this);
        d.a(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        i.removeCallbacks(m);
        i.removeCallbacks(l);
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            try
            {
                stopForeground(true);
            }
            catch (Exception exception) { }
        }
        if (d != null)
        {
            d.b(this);
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        super.onStartCommand(intent, i1, j1);
        break MISSING_BLOCK_LABEL_8;
        if (intent != null && !c)
        {
            intent = intent.getData();
            if (intent != null)
            {
                intent = intent.getEncodedSchemeSpecificPart();
                if (!TextUtils.isEmpty(intent))
                {
                    i.removeCallbacks(m);
                    i.removeCallbacks(l);
                    e = new com.qihoo.security.malware.a();
                    e.a(j);
                    e.a();
                    e.a(intent);
                    i.postDelayed(m, 10000L);
                    return 1;
                }
            }
        }
        return 1;
    }

}

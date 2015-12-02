// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.y;
import android.widget.RemoteViews;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import com.qihoo.security.notify.NotificationActivity;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.list.VirusListActivity;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.security.ui.opti.sysclear.PowerActivity;
import com.qihoo.security.ui.opti.sysclear.ProcessClearActivity;
import com.qihoo.security.v5.UpdatedDialog;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.n;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.utils.notice:
//            c

public class a
{

    private static a a;
    private final Context b = SecurityApplication.a();
    private final d c = com.qihoo.security.locale.d.a();
    private final y d;
    private Notification e;

    private a()
    {
        d = y.a(b);
    }

    private Notification a(String s, String s1, int j)
    {
        android.support.v4.app.q.d d1 = new android.support.v4.app.q.d(b);
        d1.a(j);
        d1.a(s);
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            d1.b(2);
        } else
        {
            d1.b(1);
        }
        d1.a(s1);
        d1.a(System.currentTimeMillis());
        return d1.a();
    }

    private RemoteViews a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, CharSequence charsequence, CharSequence charsequence1, int j)
    {
        RemoteViews remoteviews;
        if (com.qihoo.utils.notice.c.b())
        {
            remoteviews = new RemoteViews(b.getPackageName(), 0x7f03007a);
        } else
        {
            remoteviews = new RemoteViews(b.getPackageName(), 0x7f030079);
        }
        remoteviews.setImageViewResource(0x7f0b0196, com.qihoo.utils.notice.c.a().c(examstatus));
        remoteviews.setTextViewText(0x7f0b0197, charsequence);
        remoteviews.setTextViewText(0x7f0b0198, charsequence1);
        if (j != 0)
        {
            remoteviews.setImageViewResource(0x7f0b0199, j);
            remoteviews.setViewVisibility(0x7f0b0199, 0);
            return remoteviews;
        } else
        {
            remoteviews.setViewVisibility(0x7f0b0199, 8);
            return remoteviews;
        }
    }

    public static a a()
    {
        if (a == null)
        {
            a = new a();
        }
        return a;
    }

    private void a(int j, Notification notification)
    {
        try
        {
            d.a(j, notification);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Notification notification)
        {
            return;
        }
    }

    private void f()
    {
        RemoteViews remoteviews;
        android.support.v4.app.q.d d1;
        if (com.qihoo.utils.notice.c.b())
        {
            remoteviews = new RemoteViews(b.getPackageName(), 0x7f03007c);
        } else
        {
            remoteviews = new RemoteViews(b.getPackageName(), 0x7f03007b);
        }
        d1 = new android.support.v4.app.q.d(b);
        d1.a(0x7f0200cf);
        d1.a(c.a(0x7f0c018a));
        d1.b(2);
        d1.a("sort_key_00");
        d1.a(System.currentTimeMillis());
        e = d1.a();
        e.flags = 2;
        e.contentView = remoteviews;
    }

    public void a(int j)
    {
        if (e == null)
        {
            return;
        } else
        {
            e.contentView.setTextViewText(0x7f0b019a, c.a(0x7f0c0175));
            e.contentView.setProgressBar(0x7f0b0108, 100, j, false);
            e.contentView.setTextViewText(0x7f0b0198, (new StringBuilder()).append(j).append("%").toString());
            a(4106, e);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        d.a(4105);
        Object obj = n.a(b, 0x7f0c0173, 0x7f08006f);
        Object obj1 = c.a(0x7f0c0174);
        Notification notification = a((new StringBuilder()).append(obj).append(" ").append(((String) (obj1))).toString(), "sort_key_01", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        notification.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), ((CharSequence) (obj1)), 0);
        obj1 = new Intent(b, com/qihoo/security/v5/UpdatedDialog);
        obj = bundle;
        if (bundle == null)
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putBoolean("FromNotify", true);
        ((Bundle) (obj)).putInt("type", 0);
        ((Intent) (obj1)).putExtras(((Bundle) (obj)));
        ((Intent) (obj1)).setAction("com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG");
        notification.contentIntent = PendingIntent.getActivity(b, 4105, ((Intent) (obj1)), 0x10000000);
        notification.flags = 16;
        a(4105, notification);
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        while (i.a() || com.qihoo.utils.notice.c.a(b, 4104)) 
        {
            return;
        }
        com.qihoo.utils.notice.c.b(b, 4104);
        d.a(4104);
        String s = c.a(0x7f0c0201);
        String s1 = c.a(0x7f0c0202);
        Notification notification = a((new StringBuilder()).append(s).append(" ").append(s1).toString(), "sort_key_05", com.qihoo.utils.notice.c.a().d(examstatus));
        notification.contentView = a(examstatus, ((CharSequence) (s)), ((CharSequence) (s1)), com.qihoo.utils.notice.c.a().a(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/main/HomeActivity);
        examstatus.setFlags(0x14000000);
        examstatus.setAction("com.qihoo.security.notify.ACTION_BOOST");
        examstatus.putExtra("from_notify", true);
        examstatus.putExtra("reset_main_page", true);
        examstatus.putExtra("fragment_index", 0);
        notification.contentIntent = PendingIntent.getActivity(b, 4104, examstatus, 0x10000000);
        notification.flags = 16;
        a(4104, notification);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29012, System.currentTimeMillis());
            return;
        } else
        {
            com.qihoo.security.support.b.a(20025, System.currentTimeMillis());
            return;
        }
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, int j)
    {
        while (i.a() || com.qihoo.utils.notice.c.a(b, 4115)) 
        {
            return;
        }
        com.qihoo.utils.notice.c.b(b, 4115);
        d.a(4115);
        String s = c.a(0x7f0c020b, new Object[] {
            Integer.valueOf(j)
        });
        String s1 = c.a(0x7f0c020c);
        Notification notification = a((new StringBuilder()).append(s).append(" ").append(s1).toString(), "sort_key_05", com.qihoo.utils.notice.c.a().d(examstatus));
        notification.contentView = a(examstatus, ((CharSequence) (s)), ((CharSequence) (s1)), com.qihoo.utils.notice.c.a().a(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/main/HomeActivity);
        examstatus.setFlags(0x14000000);
        examstatus.setAction("com.qihoo.security.notify.ACTION_BOOST_ACTIVE");
        examstatus.putExtra("from_notify", true);
        examstatus.putExtra("reset_main_page", true);
        examstatus.putExtra("fragment_index", 0);
        notification.contentIntent = PendingIntent.getActivity(b, 4115, examstatus, 0x10000000);
        notification.flags = 16;
        a(4115, notification);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29028, System.currentTimeMillis());
            return;
        } else
        {
            com.qihoo.security.support.b.a(20038, System.currentTimeMillis());
            return;
        }
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, String s)
    {
        if (i.a())
        {
            return;
        }
        d.a(4103);
        android.text.SpannableString spannablestring = n.a(b, 0x7f0c01ff, 0x7f080070, s);
        String s1 = c.a(0x7f0c0200);
        Notification notification = a((new StringBuilder()).append(spannablestring).append(" ").append(s1).toString(), "sort_key_04", com.qihoo.utils.notice.c.a().d(examstatus));
        notification.contentView = a(examstatus, ((CharSequence) (spannablestring)), ((CharSequence) (s1)), com.qihoo.utils.notice.c.a().b(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/main/HomeActivity);
        examstatus.setFlags(0x14000000);
        examstatus.putExtra("fragment_index", 1);
        examstatus.putExtra("from_notify", true);
        examstatus.putExtra("reset_main_page", true);
        examstatus.putExtra("do_scan", true);
        examstatus.setAction("com.qihoo.security.notify.ACTION_CLEAN");
        examstatus.putExtra("do_scan_size", s);
        notification.contentIntent = PendingIntent.getActivity(b, 4103, examstatus, 0x10000000);
        notification.flags = 16;
        a(4103, notification);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29010, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), s);
            return;
        } else
        {
            com.qihoo.security.support.b.a(20024, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), s);
            return;
        }
    }

    public void a(String s)
    {
        while (i.a() || !com.qihoo.utils.notice.c.b(b)) 
        {
            return;
        }
        d.a(4099);
        Object obj = c.a(0x7f0c01fb, new Object[] {
            i.b(b, s)
        });
        String s1 = c.a(0x7f0c01fc);
        Notification notification = a((new StringBuilder()).append(((String) (obj))).append(" ").append(s1).toString(), "sort_key_02", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        notification.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), ((CharSequence) (s1)), 0);
        obj = new Intent(b, com/qihoo/security/notify/NotificationActivity);
        ((Intent) (obj)).addFlags(0x10000000);
        ((Intent) (obj)).setAction("com.qihoo.security.notify.ACTION_SAFE_APP");
        ((Intent) (obj)).putExtra("pkg_name", s);
        notification.contentIntent = PendingIntent.getActivity(b, 4099, ((Intent) (obj)), 0x10000000);
        notification.deleteIntent = PendingIntent.getBroadcast(b, 4099, new Intent("com.qihoo.security.notify.ACTION_SAFE_APP"), 0x8000000);
        notification.flags = 16;
        a(4099, notification);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29006, s, "");
            return;
        } else
        {
            com.qihoo.security.support.b.a(20022, s, "");
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        while (i.a() || !com.qihoo.utils.notice.c.b(b) || arraylist == null || arraylist.isEmpty()) 
        {
            return;
        }
        d.a(4097);
        Object obj = c.a(0x7f0c01f7, new Object[] {
            i.b(b, (String)arraylist.get(0))
        });
        Object obj1 = n.a(b, ((String) (obj)), 0x7f080071);
        String s = c.a(0x7f0c01f8);
        obj = a((new StringBuilder()).append(obj1).append(" ").append(s).toString(), "sort_key_01", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER));
        obj.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, ((CharSequence) (obj1)), ((CharSequence) (s)), 0x7f0200cc);
        obj1 = new Intent(b, com/qihoo/security/ui/antivirus/list/VirusListActivity);
        ((Intent) (obj1)).setFlags(0x14000000);
        ((Intent) (obj1)).setAction("com.qihoo.security.notify.ACTION_MALWARE");
        ((Intent) (obj1)).putExtra("from_notify", true);
        ((Intent) (obj1)).putExtra("size", arraylist.size());
        obj.contentIntent = PendingIntent.getActivity(b, 4097, ((Intent) (obj1)), 0x10000000);
        obj.deleteIntent = PendingIntent.getBroadcast(b, 4097, new Intent("com.qihoo.security.notify.ACTION_MALWARE"), 0x8000000);
        obj.flags = 32;
        a(4097, ((Notification) (obj)));
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29002, arraylist.size());
            return;
        } else
        {
            com.qihoo.security.support.b.a(20020, arraylist.size());
            return;
        }
    }

    public void b()
    {
        if (i.a())
        {
            return;
        }
        d.a(4100);
        Object obj = c.a(0x7f0c01fd);
        String s = c.a(0x7f0c01fe);
        Notification notification = a((new StringBuilder()).append(((String) (obj))).append(" ").append(s).toString(), "sort_key_03", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        notification.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), s, 0);
        obj = new Intent(b, com/qihoo/security/ui/main/HomeActivity);
        ((Intent) (obj)).setFlags(0x14000000);
        ((Intent) (obj)).putExtra("fragment_index", 2);
        ((Intent) (obj)).putExtra("reset_main_page", true);
        ((Intent) (obj)).putExtra("custom_action", 3);
        ((Intent) (obj)).setAction("com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE");
        notification.contentIntent = PendingIntent.getActivity(b, 4100, ((Intent) (obj)), 0x10000000);
        notification.deleteIntent = PendingIntent.getBroadcast(b, 4100, new Intent("com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"), 0x8000000);
        notification.flags = 16;
        a(4100, notification);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.b(29008);
            return;
        } else
        {
            com.qihoo.security.support.b.b(20023);
            return;
        }
    }

    public void b(int j)
    {
        if (d != null)
        {
            d.a(j);
        }
    }

    public void b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, String s)
    {
        while (i.a() || com.qihoo.utils.notice.c.a(b, 4111)) 
        {
            return;
        }
        com.qihoo.utils.notice.c.b(b, 4111);
        d.a(4111);
        String s1 = c.a(0x7f0c0209);
        String s2 = c.a(0x7f0c020a, new Object[] {
            s
        });
        s = a((new StringBuilder()).append(s1).append(" ").append(s2).toString(), "sort_key_05", com.qihoo.utils.notice.c.a().d(examstatus));
        s.contentView = a(examstatus, s1, s2, com.qihoo.utils.notice.c.a().a(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/opti/sysclear/PowerActivity);
        examstatus.setFlags(0x14000000);
        examstatus.setAction("com.qihoo.security.notify.ACTION_BATTERY_LOW");
        examstatus.putExtra("from_notify", true);
        s.contentIntent = PendingIntent.getActivity(b, 4111, examstatus, 0x10000000);
        s.flags = 16;
        a(4111, s);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.b(29018);
            return;
        } else
        {
            com.qihoo.security.support.b.b(20029);
            return;
        }
    }

    public void b(String s)
    {
        d.a(4107);
        Object obj = c.a(0x7f0c01bd);
        String s1 = c.a(0x7f0c01be);
        Notification notification = a((new StringBuilder()).append(((String) (obj))).append(" ").append(s1).toString(), "sort_key_01", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        notification.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), s1, 0);
        s = new File(s);
        obj = new Intent("android.intent.action.VIEW");
        ((Intent) (obj)).setDataAndType(Uri.fromFile(s), "application/vnd.android.package-archive");
        ((Intent) (obj)).setFlags(0x10000000);
        notification.contentIntent = PendingIntent.getActivity(b, 4105, ((Intent) (obj)), 0x10000000);
        notification.flags = 16;
        a(4107, notification);
    }

    public void b(ArrayList arraylist)
    {
        while (i.a() || !com.qihoo.utils.notice.c.b(b) || arraylist == null || arraylist.isEmpty()) 
        {
            return;
        }
        d.a(4098);
        Object obj = c.a(0x7f0c01f9, new Object[] {
            i.b(b, (String)arraylist.get(0))
        });
        Object obj1 = n.a(b, ((String) (obj)), 0x7f080070);
        String s = c.a(0x7f0c01fa);
        obj = a((new StringBuilder()).append(obj1).append(" ").append(s).toString(), "sort_key_03", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE));
        obj.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, ((CharSequence) (obj1)), s, 0x7f0200cd);
        obj1 = new Intent(b, com/qihoo/security/ui/antivirus/list/VirusListActivity);
        ((Intent) (obj1)).setAction("com.qihoo.security.notify.ACTION_RISKY_APP");
        ((Intent) (obj1)).putExtra("from_notify", true);
        ((Intent) (obj1)).putExtra("size", arraylist.size());
        obj.contentIntent = PendingIntent.getActivity(b, 4098, ((Intent) (obj1)), 0x10000000);
        obj.deleteIntent = PendingIntent.getBroadcast(b, 4098, new Intent("com.qihoo.security.notify.ACTION_RISKY_APP"), 0x8000000);
        a(4098, ((Notification) (obj)));
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29004, arraylist.size());
            return;
        } else
        {
            com.qihoo.security.support.b.a(20021, arraylist.size());
            return;
        }
    }

    public void c()
    {
        d.a(4106);
        if (e == null)
        {
            f();
        }
        e.contentView.setTextViewText(0x7f0b019a, c.a(0x7f0c0175));
        e.contentView.setProgressBar(0x7f0b0108, 100, 0, false);
        e.contentView.setTextViewText(0x7f0b0198, "0%");
        a(4106, e);
    }

    public void c(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, String s)
    {
        while (i.a() || com.qihoo.utils.notice.c.a(b, 4112)) 
        {
            return;
        }
        com.qihoo.utils.notice.c.b(b, 4112);
        d.a(4112);
        String s1 = c.a(0x7f0c0205);
        String s2 = c.a(0x7f0c0206, new Object[] {
            s
        });
        s = a((new StringBuilder()).append(s1).append(" ").append(s2).toString(), "sort_key_05", com.qihoo.utils.notice.c.a().d(examstatus));
        s.contentView = a(examstatus, s1, s2, com.qihoo.utils.notice.c.a().a(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/opti/sysclear/PowerActivity);
        examstatus.setFlags(0x14000000);
        examstatus.setAction("com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND");
        examstatus.putExtra("from_notify", true);
        s.contentIntent = PendingIntent.getActivity(b, 4112, examstatus, 0x10000000);
        s.flags = 16;
        a(4112, s);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.b(29020);
            return;
        } else
        {
            com.qihoo.security.support.b.b(20033);
            return;
        }
    }

    public void c(String s)
    {
        d.a(4108);
        Object obj = n.a(b, 0x7f0c0173, 0x7f08006f);
        Object obj1 = c.a(0x7f0c0174);
        Notification notification = a((new StringBuilder()).append(obj).append(" ").append(((String) (obj1))).toString(), "sort_key_01", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        notification.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), ((CharSequence) (obj1)), 0);
        obj = new Intent(b, com/qihoo/security/v5/UpdatedDialog);
        obj1 = new Bundle();
        ((Bundle) (obj1)).putBoolean("FromNotify", true);
        ((Bundle) (obj1)).putInt("type", 0);
        ((Bundle) (obj1)).putString("path", s);
        ((Intent) (obj)).putExtras(((Bundle) (obj1)));
        ((Intent) (obj)).setAction("com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG");
        notification.contentIntent = PendingIntent.getActivity(b, 4105, ((Intent) (obj)), 0x10000000);
        notification.flags = 16;
        a(4108, notification);
    }

    public void c(ArrayList arraylist)
    {
        while (i.a() || !com.qihoo.utils.notice.c.b(b) || arraylist == null || arraylist.isEmpty()) 
        {
            return;
        }
        d.a(4109);
        Object obj = c.a(0x7f0c0203, new Object[] {
            i.b(b, (String)arraylist.get(0))
        });
        Object obj1 = n.a(b, ((String) (obj)), 0x7f080070);
        String s = c.a(0x7f0c0204);
        obj = a((new StringBuilder()).append(obj1).append(" ").append(s).toString(), "sort_key_03", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE));
        obj.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, ((CharSequence) (obj1)), s, 0x7f0200cd);
        obj1 = new Intent(b, com/qihoo/security/ui/antivirus/list/VirusListActivity);
        ((Intent) (obj1)).setAction("com.qihoo.security.notify.ACTION_ADV_APP");
        ((Intent) (obj1)).putExtra("from_notify", true);
        ((Intent) (obj1)).putExtra("size", arraylist.size());
        obj.contentIntent = PendingIntent.getActivity(b, 4109, ((Intent) (obj1)), 0x10000000);
        obj.deleteIntent = PendingIntent.getBroadcast(b, 4109, new Intent("com.qihoo.security.notify.ACTION_ADV_APP"), 0x8000000);
        a(4109, ((Notification) (obj)));
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.a(29016, arraylist.size());
            return;
        } else
        {
            com.qihoo.security.support.b.a(20027, arraylist.size());
            return;
        }
    }

    public void d()
    {
        d.a(4106);
    }

    public void d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, String s)
    {
        while (i.a() || com.qihoo.utils.notice.c.a(b, 4113)) 
        {
            return;
        }
        com.qihoo.utils.notice.c.b(b, 4113);
        d.a(4113);
        String s1 = c.a(0x7f0c0207, new Object[] {
            i.b(b, s)
        });
        String s2 = c.a(0x7f0c0208);
        s = a((new StringBuilder()).append(s1).append(" ").append(s2).toString(), "sort_key_05", com.qihoo.utils.notice.c.a().d(examstatus));
        s.contentView = a(examstatus, s1, s2, com.qihoo.utils.notice.c.a().a(examstatus));
        examstatus = new Intent(b, com/qihoo/security/ui/opti/sysclear/ProcessClearActivity);
        examstatus.setFlags(0x14000000);
        examstatus.setAction("com.qihoo.security.notify.ACTION_POWER_REMIND");
        examstatus.putExtra("from_notify", true);
        s.contentIntent = PendingIntent.getActivity(b, 4113, examstatus, 0x10000000);
        s.flags = 16;
        a(4113, s);
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.b(29022);
            return;
        } else
        {
            com.qihoo.security.support.b.b(20034);
            return;
        }
    }

    public void e()
    {
        if (i.a())
        {
            return;
        }
        d.a(4110);
        Object obj1 = c.a(0x7f0c0066);
        Object obj = c.a(0x7f0c0067);
        String s = c.a(0x7f0c0068);
        obj1 = a(((String) (obj1)), "sort_key_04", com.qihoo.utils.notice.c.a().d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        obj1.contentView = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, ((CharSequence) (obj)), s, 0);
        obj = new Intent(b, com/qihoo/security/ui/main/HomeActivity);
        ((Intent) (obj)).setFlags(0x14000000);
        ((Intent) (obj)).putExtra("fragment_index", 1);
        ((Intent) (obj)).putExtra("from_notify", true);
        ((Intent) (obj)).putExtra("reset_main_page", true);
        ((Intent) (obj)).setAction("com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP");
        obj1.contentIntent = PendingIntent.getActivity(b, 4110, ((Intent) (obj)), 0x10000000);
        obj1.deleteIntent = PendingIntent.getBroadcast(b, 4110, new Intent("com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"), 0x8000000);
        obj1.flags = 16;
        a(4110, ((Notification) (obj1)));
        if (com.qihoo.utils.notice.c.a(b))
        {
            com.qihoo.security.support.b.b(20028);
            return;
        } else
        {
            com.qihoo.security.support.b.b(20028);
            return;
        }
    }
}

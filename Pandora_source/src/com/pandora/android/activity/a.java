// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ImageView;
import com.pandora.android.PandoraService;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.data.l;
import com.pandora.android.personalization.StationPersonalizationActivity;
import com.pandora.android.personalization.view.c;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.AddCommentLayout;
import com.pandora.android.util.s;
import com.pandora.android.widget.d;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p.bz.p;
import p.ca.al;
import p.ca.bg;
import p.ca.i;
import p.ca.q;
import p.cn.e;
import p.cr.b;
import p.cr.k;
import p.cx.ac;

// Referenced classes of package com.pandora.android.activity:
//            PandoraIntent, c, NowPlaying, InAppLandingPageActivity, 
//            ModalPresenterActivity, PandoraDialogActivity, HomeTabsActivity, PandoraIntentFilter, 
//            PandoraLinkInterceptorActivity, PandoraLinkStatusActivity, BaseHomeActivity

public class com.pandora.android.activity.a
{
    private static class a
        implements Runnable
    {

        private y a;
        private String b;
        private boolean c;
        private boolean d;
        private p.cw.b.b e;
        private Bundle f;

        public void run()
        {
            p.cw.b b1 = com.pandora.android.provider.b.a.b().d();
            boolean flag1 = b1.a(a);
            boolean flag;
            if (a != null && a.A() && !s.a(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 && !flag)
            {
                p.df.a.c("ActivityHelper", "Station already playing, skipping start");
                if (c)
                {
                    com.pandora.android.activity.a.a(f);
                }
                return;
            }
            if (d && !flag1)
            {
                p.cn.e.a().c();
            }
            com.pandora.android.data.c c1 = new com.pandora.android.data.c(c, f);
            b1.a(a, b, com.pandora.android.ads.VideoAdManager.c.a().i(), e, c1);
        }

        public a(y y1, String s1, boolean flag, boolean flag1, p.cw.b.b b1, Bundle bundle)
        {
            a = y1;
            b = s1;
            c = flag;
            d = flag1;
            e = b1;
            f = bundle;
        }
    }


    public static Intent a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        if (s.u())
        {
            s1 = p.cr.b.a(p.cr.b.a.valueOf(s5), Uri.parse(s1));
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_backstage");
            pandoraintent.putExtra("intent_uri", s1);
            if (!s.a(s2))
            {
                pandoraintent.putExtra("intent_backstage_category", s2);
            }
            if (!s.a(s3))
            {
                pandoraintent.putExtra("intent_backstage_title", s3);
            }
            if (!s.a(s4))
            {
                pandoraintent.putExtra("intent_backstage_background_color", s4);
            }
            if (!s.a(s5))
            {
                pandoraintent.putExtra("intent_backstage_type", s5);
            }
            s1 = pandoraintent;
            if (!s.a(s6))
            {
                pandoraintent.putExtra("intent_backstage_tag", s6);
                return pandoraintent;
            }
        }
        return s1;
    }

    public static c a(Activity activity, Menu menu)
    {
        activity.getMenuInflater().inflate(0x7f12001d, menu);
        menu = menu.findItem(0x7f100024);
        activity = com.pandora.android.personalization.view.c.a(activity.getApplicationContext(), 0x7f0d009c);
        menu.setIcon(activity.b());
        return activity;
    }

    public static void a()
    {
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("show_home"));
    }

    public static void a(Activity activity)
    {
        com.pandora.android.widget.d.a().b();
        s.d();
        s.f();
        activity.moveTaskToBack(true);
        com.pandora.android.provider.b.a.e().a(new p());
        if (!com.pandora.android.provider.b.a.g())
        {
            p.df.a.c("ActivityHelper", "Shutting down in UI, no service started");
            System.exit(0);
        } else
        {
            com.pandora.android.provider.b.a.C().a(new PandoraIntent("cmd_shutdown"));
        }
        activity.finish();
    }

    public static void a(Activity activity, int i1, y y1, aa aa1, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("intent_share_from", activity.getClass().getSimpleName());
        bundle.putInt("intent_share_type", i1);
        if (y1 != null)
        {
            bundle.putSerializable("intent_station_data", y1);
        }
        if (aa1 != null)
        {
            bundle.putSerializable("intent_track_data", aa1);
        }
        bundle.putString("intent_track_key", s1);
        bundle.putBoolean("intent_modal_presenter_show_header", false);
        bundle.putInt("intent_modal_presenter_footer_color", activity.getResources().getColor(0x7f0b0091));
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("keep_sample_playing"));
        a(activity, p/ca/al, 0, bundle, 129);
    }

    public static void a(Activity activity, Bundle bundle)
    {
        com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/NowPlaying, bundle);
    }

    public static void a(Activity activity, l l1, boolean flag, int i1)
    {
        if (l1 == null || s.a(l1.a()) && s.a(l1.b()) || !s.a(l1.a()) && k.a(Uri.parse(l1.a())))
        {
            return;
        } else
        {
            l1 = InAppLandingPageActivity.a(l1, flag);
            com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/InAppLandingPageActivity, 0, l1, i1);
            return;
        }
    }

    public static void a(Activity activity, aa aa1)
    {
        if (aa1 != null && aa1.M())
        {
            aa1 = ((com.pandora.radio.data.d)aa1).d();
            if (!s.a(aa1))
            {
                a(activity, new l(new com.pandora.radio.data.b(), aa1, null, -1, com.pandora.android.data.l.a.d, null), true, 127);
            }
        }
    }

    public static void a(Activity activity, aa aa1, boolean flag)
    {
        aa1 = b(activity, aa1, flag);
        aa1.putString("intent_title", activity.getString(0x7f08018b));
        a(activity, p/ca/i, 0, ((Bundle) (aa1)), -1);
    }

    public static void a(Activity activity, com.pandora.radio.data.d d1, boolean flag)
    {
        d1 = b(activity, d1, flag);
        if (!flag)
        {
            d1.putString("intent_title", activity.getString(0x7f08007d));
        }
        a(activity, p/ca/i, 0, ((Bundle) (d1)), -1);
    }

    public static void a(Activity activity, Class class1, int i1, Bundle bundle, int j1)
    {
        a(activity, class1, i1, bundle, j1, true);
    }

    public static void a(Activity activity, Class class1, int i1, Bundle bundle, int j1, boolean flag)
    {
        if (activity == null || activity.isFinishing())
        {
            p.df.a.c("ActivityHelper", "presentModalFragment(...) --> Activity is null.  Aborting!");
        } else
        if (!flag || !com.pandora.android.activity.c.a().d())
        {
            Bundle bundle1;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            } else
            {
                bundle1 = bundle;
            }
            bundle1.putSerializable("intent_modal_presenter_fragment_class", class1);
            com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/ModalPresenterActivity, i1, bundle, j1);
            return;
        }
    }

    public static void a(Activity activity, Runnable runnable)
    {
        boolean flag = com.pandora.android.provider.a.a().f();
        int i1;
        int j1;
        if (flag)
        {
            i1 = 0x7f080244;
        } else
        {
            i1 = 0x7f080243;
        }
        if (flag)
        {
            j1 = 0x7f080242;
        } else
        {
            j1 = 0x7f0801f5;
        }
        (new android.app.AlertDialog.Builder(activity)).setTitle(0x7f080242).setMessage(i1).setCancelable(true).setNegativeButton(0x7f0800c3, null).setPositiveButton(j1, new android.content.DialogInterface.OnClickListener(runnable) {

            final Runnable a;

            public void onClick(DialogInterface dialoginterface, int k1)
            {
                if (a != null)
                {
                    a.run();
                }
                s.j();
                com.pandora.android.provider.b.a.b().m().a(true);
            }

            
            {
                a = runnable;
                super();
            }
        }).show();
    }

    public static void a(Activity activity, String s1)
    {
        if (activity == null || activity.isFinishing())
        {
            p.df.a.c("ActivityHelper", "launcheShareTo(...) --> Activity is null.  Aborting!");
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("intent_modal_presenter_show_header", true);
            bundle.putSerializable("intent_modal_presenter_left_button_type", com.pandora.android.view.HeaderLayout.a.e);
            bundle.putString("intent_title", activity.getString(0x7f080263));
            bundle.putString("intent_station_token", s1);
            bundle.putInt("intent_modal_presenter_header_color", q.a);
            bundle.putInt("intent_modal_presenter_footer_color", q.a);
            com.pandora.android.provider.b.a.C().a(new PandoraIntent("keep_sample_playing"));
            a(activity, p/ca/d, 0, bundle, -1);
            return;
        }
    }

    public static void a(Activity activity, String s1, String s2, long l1, long l2, String s3, 
            String s4, p.cq.a a1)
    {
        s1 = String.format("%s would like to add the event '%s' on %s to your calendar.  Is this OK?", new Object[] {
            s1, s2, (new SimpleDateFormat("MMM d, yyyy")).format(new Date(l1))
        });
        (new android.app.AlertDialog.Builder(activity)).setMessage(s1).setCancelable(false).setPositiveButton(0x7f080195, new android.content.DialogInterface.OnClickListener(s2, s4, s3, l1, l2, activity, a1) {

            final String a;
            final String b;
            final String c;
            final long d;
            final long e;
            final Activity f;
            final p.cq.a g;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setType("vnd.android.cursor.item/event");
                    intent.putExtra("title", a);
                    intent.putExtra("eventLocation", b);
                    intent.putExtra("description", c);
                    intent.putExtra("eventTimezone", TimeZone.getDefault().getID());
                    intent.putExtra("hasAlarm", true);
                    intent.putExtra("beginTime", d);
                    intent.putExtra("endTime", e);
                    intent.putExtra("allDay", false);
                    intent.putExtra("accessLevel", 2);
                    intent.putExtra("availability", 0);
                    f.startActivity(intent);
                    if (g != null)
                    {
                        g.a(true, null);
                    }
                    p.df.a.c("ActivityHelper", "successfully added calendar item %s to calendar", new Object[] {
                        a
                    });
                }
                catch (Exception exception)
                {
                    s.a(f, "Failed to add calendar item");
                    if (g != null)
                    {
                        g.a(false, "Failed to add calendar item");
                    }
                    p.df.a.c("ActivityHelper", (new StringBuilder()).append("unable to add calendar item.  ").append(exception.getMessage()).toString());
                    exception.printStackTrace();
                }
                dialoginterface.cancel();
            }

            
            {
                a = s1;
                b = s2;
                c = s3;
                d = l1;
                e = l2;
                f = activity;
                g = a1;
                super();
            }
        }).setNegativeButton(0x7f080194, new android.content.DialogInterface.OnClickListener(a1) {

            final p.cq.a a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                if (a != null)
                {
                    a.a(false, "Add event was canceled");
                }
                dialoginterface.cancel();
            }

            
            {
                a = a1;
                super();
            }
        }).create().show();
    }

    public static void a(Activity activity, String s1, String s2, String s3)
    {
        Bundle bundle = new Bundle();
        if (s.m())
        {
            bundle.putString("AMAZON_PURCHASE_USER", s1);
            bundle.putString("AMAZON_PURCHASE_TOKEN", s2);
            bundle.putString("AMAZON_PURCHASE_SKU", s3);
        } else
        {
            bundle.putString("GOOGLEPLAY_PURCHASE_TOKEN", s2);
            bundle.putString("GOOGLEPLAY_PURCHASE_ORDER_ID", s1);
            bundle.putString("GOOGLEPLAY_PURCHASE_ITEM", s3);
        }
        com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/PandoraDialogActivity, PandoraDialogActivity.a(bundle));
    }

    public static void a(Activity activity, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        com.pandora.android.provider.b.a.C().a(a(s1, s2, s3, s4, s5, s6));
    }

    public static void a(Bundle bundle)
    {
        bundle = b(bundle);
        com.pandora.android.provider.b.a.C().a(bundle);
    }

    public static void a(FragmentActivity fragmentactivity)
    {
        a(fragmentactivity, ((android.content.DialogInterface.OnShowListener) (null)), ((android.content.DialogInterface.OnCancelListener) (null)), ((android.content.DialogInterface.OnDismissListener) (null)));
    }

    public static void a(FragmentActivity fragmentactivity, android.content.DialogInterface.OnShowListener onshowlistener, android.content.DialogInterface.OnCancelListener oncancellistener, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        bg.a(fragmentactivity, Uri.parse(p.cp.b.b()), onshowlistener, oncancellistener, ondismisslistener);
    }

    public static void a(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f12000a, menu);
    }

    public static void a(Menu menu, MenuInflater menuinflater, android.view.View.OnClickListener onclicklistener)
    {
        p.cw.b.a a1 = com.pandora.android.provider.b.a.b().d().u();
        if (a1 == p.cw.b.a.b || a1 == p.cw.b.a.c || a1 == p.cw.b.a.d)
        {
            Object obj = menu.findItem(0x7f10000f);
            ImageView imageview;
            if (obj == null)
            {
                menuinflater.inflate(0x7f120007, menu);
                menu = menu.findItem(0x7f10000f);
            } else
            {
                menu = ((Menu) (obj));
            }
            menuinflater = com.pandora.android.provider.b.a.h();
            obj = LayoutInflater.from(com.pandora.android.provider.b.a.h()).inflate(0x7f04006e, null);
            imageview = (ImageView)((View) (obj)).findViewById(0x7f1001cb);
            if (ViewConfiguration.get(menuinflater).hasPermanentMenuKey())
            {
                int i1 = (int)menuinflater.getResources().getDimension(0x7f09010f);
                imageview.setPadding(i1, 0, i1, 0);
            }
            imageview.setOnClickListener(onclicklistener);
            if (menu != null)
            {
                if (a1 == p.cw.b.a.b)
                {
                    imageview.setImageResource(0x7f020220);
                    ((AnimationDrawable)imageview.getDrawable()).start();
                    menu.setActionView(((View) (obj)));
                }
                menu.setActionView(((View) (obj)));
            }
        }
    }

    public static void a(y y1, String s1, boolean flag, boolean flag1, p.cw.b.b b1, Bundle bundle)
    {
        y1 = new a(y1, s1, flag, flag1, b1, bundle);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            y1.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(y1);
            return;
        }
    }

    public static void a(y y1, p.cw.b.b b1)
    {
        a(y1, ((String) (null)), true, true, b1, ((Bundle) (null)));
    }

    public static void a(boolean flag, AddCommentLayout addcommentlayout)
    {
        if (addcommentlayout == null)
        {
            return;
        }
        if (flag)
        {
            addcommentlayout.setHideOnClick(false);
            addcommentlayout.setForceKeyboard(false);
            return;
        } else
        {
            addcommentlayout.setHideOnClick(true);
            addcommentlayout.setForceKeyboard(true);
            return;
        }
    }

    public static boolean a(Activity activity, int i1)
    {
        switch (i1)
        {
        default:
            return false;

        case 2131755029: 
            a(activity);
            break;
        }
        return true;
    }

    public static boolean a(Activity activity, int i1, boolean flag)
    {
        if (i1 != 0x102002c) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!c(activity))
        {
            activity.onBackPressed();
        }
_L5:
        return true;
_L4:
        if (!h(activity))
        {
            a();
        }
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }

    public static boolean a(Activity activity, aa aa1, int i1)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        i1;
        JVM INSTR tableswitch 2131755040 2131755043: default 36
    //                   2131755040 38
    //                   2131755041 40
    //                   2131755042 89
    //                   2131755043 82;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_38;
_L5:
        break MISSING_BLOCK_LABEL_82;
_L4:
        break MISSING_BLOCK_LABEL_89;
_L1:
        flag = false;
_L7:
        return flag;
_L3:
        activity = "artist";
_L8:
        flag = flag1;
        if (aa1 == null) goto _L7; else goto _L6
_L6:
        (new p.di.d(com.pandora.android.provider.b.a.b(), aa1.w(), activity, p.cx.x.e.a)).execute(new Object[0]);
        return true;
        activity = "song";
          goto _L8
        HomeTabsActivity.a(activity);
        return true;
    }

    public static boolean a(Activity activity, y y1, aa aa1, String s1)
    {
        if (y1 == null || aa1.M())
        {
            return false;
        }
        byte byte0;
        if (y1.j())
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        a(activity, byte0, y1, aa1, s1);
        return true;
    }

    public static boolean a(Activity activity, p.bx.a a1)
    {
        Object obj1 = p.bx.d.a();
        if (((p.bx.b) (obj1)).d())
        {
            return false;
        } else
        {
            Object obj = new android.app.AlertDialog.Builder(activity);
            obj1 = new android.content.DialogInterface.OnClickListener(((p.bx.b) (obj1))) {

                final p.bx.b a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    a.a(true, true);
                }

            
            {
                a = b1;
                super();
            }
            };
            android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(a1) {

                final p.bx.a a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface.cancel();
                    a.b();
                }

            
            {
                a = a1;
                super();
            }
            };
            ((android.app.AlertDialog.Builder) (obj)).setMessage(0x7f08021f).setNegativeButton(activity.getString(0x7f0800c3), onclicklistener).setPositiveButton(activity.getString(0x7f0801c1), ((android.content.DialogInterface.OnClickListener) (obj1)));
            activity = ((android.app.AlertDialog.Builder) (obj)).create();
            obj = new PandoraIntentFilter();
            ((PandoraIntentFilter) (obj)).a("cmd_change_settings_result");
            a1 = new BroadcastReceiver(a1, activity) {

                final p.bx.a a;
                final AlertDialog b;

                public void onReceive(Context context, Intent intent)
                {
                    context = intent.getAction();
                    if (!PandoraIntent.a("cmd_change_settings_result").equals(context)) goto _L2; else goto _L1
_L1:
                    com.pandora.android.provider.b.a.C().a(this);
                    if (!intent.getBooleanExtra("intent_success", false)) goto _L4; else goto _L3
_L3:
                    a.a();
_L2:
                    b.cancel();
                    return;
_L4:
                    if (PandoraIntent.a("cmd_change_settings_result").equals(context))
                    {
                        a.b();
                    }
                    if (true) goto _L2; else goto _L5
_L5:
                }

            
            {
                a = a1;
                b = alertdialog;
                super();
            }
            };
            com.pandora.android.provider.b.a.C().a(a1, ((android.content.IntentFilter) (obj)));
            activity.setOnCancelListener(new android.content.DialogInterface.OnCancelListener(a1) {

                final BroadcastReceiver a;

                public void onCancel(DialogInterface dialoginterface)
                {
                    com.pandora.android.provider.b.a.C().a(a);
                }

            
            {
                a = broadcastreceiver;
                super();
            }
            });
            activity.show();
            return true;
        }
    }

    public static boolean a(Context context, String s1)
    {
        if (s.a(s1))
        {
            return false;
        }
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("keep_sample_playing"));
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1.trim())));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s.l(s1);
        }
        return true;
    }

    public static boolean a(aa aa1, int i1)
    {
        boolean flag1 = true;
        i1;
        JVM INSTR tableswitch 2131755046 2131755046: default 20
    //                   2131755046 24;
           goto _L1 _L2
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (aa1 != null)
        {
            flag = flag1;
            if (!aa1.M())
            {
                flag = flag1;
                if (aa1.n())
                {
                    com.pandora.android.provider.b.a.b().d().a(aa1);
                    return true;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(y y1)
    {
        return y1 != null && !y1.j() && !y1.k() && !y1.A();
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence != null && charsequence.toString().toLowerCase(Locale.US).contains("comment");
    }

    public static Intent b(Bundle bundle)
    {
        boolean flag = s.u();
        p.df.a.a("ActivityHelper", (new StringBuilder()).append("startStation() --> show NOW_PLAYING,  isTablet = ").append(flag).toString());
        Object obj;
        if (flag)
        {
            obj = TabletHome.aj();
        } else
        {
            obj = new PandoraIntent("show_now_playing");
        }
        if (bundle != null)
        {
            ((Intent) (obj)).putExtras(bundle);
        }
        return ((Intent) (obj));
    }

    private static Bundle b(Activity activity, aa aa1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_track_data", aa1);
        bundle.putSerializable("intent_advertiser_station", Boolean.valueOf(flag));
        bundle.putBoolean("intent_modal_presenter_show_header", true);
        bundle.putInt("intent_modal_presenter_header_color", activity.getResources().getColor(0x7f0b0015));
        bundle.putInt("intent_modal_presenter_footer_color", activity.getResources().getColor(0x7f0b0014));
        bundle.putInt("intent_modal_presenter_header_divider_color", activity.getResources().getColor(0x7f0b0016));
        return bundle;
    }

    public static void b()
    {
        com.pandora.android.activity.c.a().a(com/pandora/android/activity/NowPlaying);
    }

    public static void b(Activity activity)
    {
        PendingIntent pendingintent = PendingIntent.getActivity(activity, 0, new Intent(activity, activity.getClass()), 0);
        ((AlarmManager)activity.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, pendingintent);
        a(activity);
    }

    public static void b(Activity activity, String s1)
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse((new StringBuilder()).append("tel:").append(s1).toString()));
        activity.startActivityForResult(intent, 125);
    }

    public static void b(Context context, String s1)
    {
        s.g();
        PandoraService.a(s1);
    }

    public static void b(FragmentActivity fragmentactivity)
    {
        bg.a(fragmentactivity, Uri.parse(p.cp.b.h()), true, true);
    }

    public static void b(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f120009, menu);
    }

    public static boolean b(Activity activity, int i1)
    {
        View view = (new com.pandora.android.coachmark.b(com.pandora.android.coachmark.d.a(activity).b())).a(i1);
        switch (i1)
        {
        default:
            return false;

        case 2131755044: 
            StationPersonalizationActivity.a(activity, com.pandora.android.provider.b.a.b().d().t(), view, activity.getClass());
            break;
        }
        return true;
    }

    public static boolean b(aa aa1, int i1)
    {
        boolean flag1 = true;
        i1;
        JVM INSTR tableswitch 2131755013 2131755015: default 28
    //                   2131755013 32
    //                   2131755014 62
    //                   2131755015 32;
           goto _L1 _L2 _L3 _L2
_L1:
        boolean flag = false;
_L5:
        return flag;
_L2:
        flag = flag1;
        if (aa1 != null)
        {
            flag = flag1;
            if (!aa1.M())
            {
                flag = flag1;
                if (aa1.o())
                {
                    ac.c(aa1);
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
        if (aa1 != null)
        {
            flag = flag1;
            if (!aa1.M())
            {
                flag = flag1;
                if (aa1.o())
                {
                    ac.b(aa1);
                    return true;
                }
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void c(FragmentActivity fragmentactivity)
    {
        if (fragmentactivity != null && !com.pandora.android.provider.b.a.b().j().f())
        {
            bg.a(fragmentactivity, Uri.parse(p.cp.b.d()), false, "auto_share_confirm_dialog_shown");
        }
    }

    public static void c(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f120008, menu);
    }

    public static boolean c()
    {
        return com.pandora.android.activity.c.a().c(com/pandora/android/activity/NowPlaying);
    }

    public static boolean c(Activity activity)
    {
        if (d(activity))
        {
            a();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean c(Activity activity, int i1)
    {
        i1;
        JVM INSTR lookupswitch 2: default 28
    //                   2131755024: 30
    //                   2131755801: 36;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        e(activity);
        return true;
_L3:
        if (activity instanceof PandoraLinkInterceptorActivity)
        {
            ((PandoraLinkInterceptorActivity)activity).m();
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static void d(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f12000d, menu);
    }

    protected static boolean d(Activity activity)
    {
        com.pandora.android.activity.c c1 = com.pandora.android.activity.c.a();
        return c1.e(activity) || c1.f(activity) || c1.g(activity);
    }

    public static boolean d(Activity activity, int i1)
    {
        switch (i1)
        {
        default:
            return false;

        case 2131755023: 
            a(((Bundle) (null)));
            break;
        }
        return true;
    }

    public static void e(Activity activity)
    {
        com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/PandoraLinkStatusActivity);
    }

    public static void f(Activity activity)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.cancel();
                com.pandora.android.provider.b.a.E();
            }

        };
        builder.setMessage(0x7f080202).setTitle(0x7f080203).setCancelable(false).setNegativeButton(activity.getString(0x7f080120), onclicklistener);
        builder.create().show();
    }

    public static void g(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            activity.getWindow().getDecorView().requestFitSystemWindows();
        }
    }

    public static boolean h(Activity activity)
    {
        if (s.u())
        {
            return activity instanceof TabletHome;
        }
        return (activity instanceof HomeTabsActivity) || (activity instanceof BaseHomeActivity);
    }

    public static boolean i(Activity activity)
    {
        return activity instanceof NowPlaying;
    }
}

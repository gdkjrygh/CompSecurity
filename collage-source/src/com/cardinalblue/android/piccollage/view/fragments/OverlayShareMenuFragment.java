// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.KddiShareActivity;
import com.cardinalblue.android.piccollage.activities.PhotoProtoActivity;
import com.cardinalblue.android.piccollage.activities.login.FbLoginActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.auth.a.a;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.g;
import com.cardinalblue.android.piccollage.events.FinishCollageEvent;
import com.cardinalblue.android.piccollage.events.c;
import com.cardinalblue.android.piccollage.events.e;
import com.cardinalblue.android.piccollage.events.l;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.widget.AppInviteDialog;
import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.ads.purchase.InAppPurchase;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.hp.mss.hpprint.model.ImagePrintItem;
import com.hp.mss.hpprint.model.PrintJobData;
import com.hp.mss.hpprint.model.asset.ImageAsset;
import com.squareup.a.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import ly.kite.KiteSDK;
import ly.kite.catalogue.Asset;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            aj

public class OverlayShareMenuFragment extends Fragment
    implements android.view.View.OnClickListener
{
    public static class CapturingTaskInstance
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public CapturingTaskInstance a(Parcel parcel)
            {
                return new CapturingTaskInstance(parcel);
            }

            public CapturingTaskInstance[] a(int i1)
            {
                return new CapturingTaskInstance[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public final int a;
        public final int b;
        public final a c;
        public final boolean d;
        public final int e;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (obj != null && (obj instanceof CapturingTaskInstance))
            {
                if (c.equals(((CapturingTaskInstance) (obj = (CapturingTaskInstance)obj)).c) && a == ((CapturingTaskInstance) (obj)).a && b == ((CapturingTaskInstance) (obj)).b && d == ((CapturingTaskInstance) (obj)).d)
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            int j1 = c.hashCode();
            int k1 = a;
            int l1 = b;
            int i1;
            if (d)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            return i1 * 0x989680 + (l1 * 100 + (j1 + k1 * 0x186a0)) + e * 0x3b9aca00;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            if (d)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            parcel.writeInt(a);
            parcel.writeInt(b);
            if (c == null)
            {
                i1 = -1;
            } else
            {
                i1 = c.ordinal();
            }
            parcel.writeInt(i1);
            parcel.writeInt(e);
        }


        private CapturingTaskInstance(Parcel parcel)
        {
            boolean flag = true;
            super();
            a a1;
            int i1;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            d = flag;
            a = parcel.readInt();
            b = parcel.readInt();
            i1 = parcel.readInt();
            if (i1 == -1)
            {
                a1 = null;
            } else
            {
                a1 = a.values()[i1];
            }
            c = a1;
            e = parcel.readInt();
        }


        CapturingTaskInstance(a a1, Point point, boolean flag, int i1)
        {
            c = a1;
            a = point.x;
            b = point.y;
            d = flag;
            e = i1;
        }
    }

    private static class CapturingTaskMap
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public CapturingTaskMap a(Parcel parcel)
            {
                return new CapturingTaskMap(parcel);
            }

            public CapturingTaskMap[] a(int i1)
            {
                return new CapturingTaskMap[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        private final HashMap a;

        public void a(CapturingTaskInstance capturingtaskinstance, bolts.j.a a1)
        {
            a.put(capturingtaskinstance, a1);
        }

        public boolean a(CapturingTaskInstance capturingtaskinstance)
        {
            return a.containsKey(capturingtaskinstance);
        }

        public bolts.j.a b(CapturingTaskInstance capturingtaskinstance)
        {
            return (bolts.j.a)a.get(capturingtaskinstance);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a.size());
            Iterator iterator = a.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = ((bolts.j.a)entry.getValue()).a();
                if (((j) (obj)).b() && !((j) (obj)).d() && !((j) (obj)).c())
                {
                    obj = ((File)((j) (obj)).e()).getAbsolutePath();
                } else
                {
                    obj = "";
                }
                parcel.writeParcelable((Parcelable)entry.getKey(), 0);
                parcel.writeString(((String) (obj)));
            }
        }


        private CapturingTaskMap()
        {
            a = new HashMap();
        }

        private CapturingTaskMap(Parcel parcel)
        {
            a = new HashMap();
            int j1 = parcel.readInt();
            for (int i1 = 0; i1 < j1; i1++)
            {
                CapturingTaskInstance capturingtaskinstance = (CapturingTaskInstance)parcel.readParcelable(CapturingTaskInstance.CREATOR.getClass().getClassLoader());
                String s = parcel.readString();
                if (!TextUtils.isEmpty(s))
                {
                    bolts.j.a a1 = bolts.j.a();
                    a1.a(new File(s));
                    a(capturingtaskinstance, a1);
                }
            }

        }


    }

    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/view/fragments/OverlayShareMenuFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("VIDEO", 0);
            b = new a("GIF", 1);
            c = new a("JPEG", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private aj a;
    private boolean b;
    private TextView c;
    private View d;
    private ImageView e;
    private boolean f;
    private boolean g;
    private ShareDialog h;
    private CallbackManager i;
    private ProgressDialog j;
    private CapturingTaskMap k;
    private Collage l;

    public OverlayShareMenuFragment()
    {
        b = false;
        f = false;
        g = false;
        k = new CapturingTaskMap();
    }

    private Point a(a a1, int i1, int j1)
    {
        Point point = com.cardinalblue.android.b.k.c(i1, j1);
        if (a1 == com.cardinalblue.android.piccollage.view.fragments.a.b || a1 == com.cardinalblue.android.piccollage.view.fragments.a.a)
        {
            point.set(point.x / 2, point.y / 2);
        }
        return point;
    }

    private j a(int i1)
    {
        boolean flag = com.cardinalblue.android.b.k.s();
        if (i1 == 0x7f1001f8)
        {
            flag = false;
        }
        a a1 = b(i1);
        Point point = a(a1, l.w(), l.v());
        return a(a1, point.x, point.y, flag, 1);
    }

    private j a(a a1, int i1, int j1, boolean flag, int k1)
    {
        CapturingTaskInstance capturingtaskinstance = new CapturingTaskInstance(a1, new Point(i1, j1), flag, k1);
        if (!k.a(capturingtaskinstance))
        {
            bolts.j.a a2 = bolts.j.a();
            k.a(capturingtaskinstance, a2);
            a1 = (new g()).a(i1, j1).b(k1).a(com.cardinalblue.android.b.k.s()).a(a1);
            com.cardinalblue.android.piccollage.controller.d.a().c(new c(capturingtaskinstance, a1));
            j.show();
            j.setProgress(0);
        }
        return k.b(capturingtaskinstance).a();
    }

    static aj a(OverlayShareMenuFragment overlaysharemenufragment, aj aj1)
    {
        overlaysharemenufragment.a = aj1;
        return aj1;
    }

    private String a()
    {
        return l.r();
    }

    private void a(int i1, com.cardinalblue.android.piccollage.events.j.a a1)
    {
        a(i1).c(new i(a1) {

            final com.cardinalblue.android.piccollage.events.j.a a;
            final OverlayShareMenuFragment b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(b, new aj());
                Bundle bundle = new Bundle();
                bundle.putString("key_caption", com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(b));
                bundle.putString("key_file_path", ((File)j1.e()).getAbsolutePath());
                bundle.putInt("key_target", a.ordinal());
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(b).setArguments(bundle);
                com.cardinalblue.android.b.k.a(b.getActivity(), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(b), "tag_share_dialog");
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = a1;
                super();
            }
        }, j.b);
    }

    private void a(View view, String s, int i1)
    {
        a(view, s, i1, ((android.view.View.OnClickListener) (this)));
    }

    private void a(View view, String s, int i1, android.view.View.OnClickListener onclicklistener)
    {
        ((TextView)view.findViewById(0x7f10023e)).setText(s);
        ((ImageView)view.findViewById(0x7f10023d)).setImageResource(i1);
        view.setOnClickListener(onclicklistener);
    }

    static void a(OverlayShareMenuFragment overlaysharemenufragment)
    {
        overlaysharemenufragment.h();
    }

    static void a(OverlayShareMenuFragment overlaysharemenufragment, int i1)
    {
        overlaysharemenufragment.c(i1);
    }

    static void a(OverlayShareMenuFragment overlaysharemenufragment, int i1, com.cardinalblue.android.piccollage.events.j.a a1)
    {
        overlaysharemenufragment.a(i1, a1);
    }

    private void a(boolean flag)
    {
        d.findViewById(0x7f1001f7).setEnabled(flag);
        d.findViewById(0x7f1001fb).setEnabled(flag);
        d.findViewById(0x7f1001f6).setEnabled(flag);
        d.findViewById(0x7f1001f9).setEnabled(flag);
        d.findViewById(0x7f1001f8).setEnabled(flag);
        if (d.findViewById(0x7f1001f5) != null)
        {
            d.findViewById(0x7f1001f5).setEnabled(flag);
        }
        if (d.findViewById(0x7f1001fa) != null)
        {
            d.findViewById(0x7f1001fa).setEnabled(flag);
        }
        d.findViewById(0x7f1001f4).setEnabled(flag);
        d.findViewById(0x7f1001f3).setEnabled(flag);
    }

    static boolean a(OverlayShareMenuFragment overlaysharemenufragment, boolean flag)
    {
        overlaysharemenufragment.b = flag;
        return flag;
    }

    static TextView b(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.c;
    }

    static j b(OverlayShareMenuFragment overlaysharemenufragment, int i1)
    {
        return overlaysharemenufragment.a(i1);
    }

    private a b(int i1)
    {
        if (!l.m())
        {
            return com.cardinalblue.android.piccollage.view.fragments.a.c;
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            switch (i1)
            {
            default:
                return com.cardinalblue.android.piccollage.view.fragments.a.c;

            case 2131755511: 
                return com.cardinalblue.android.piccollage.view.fragments.a.b;
            }
        }
        switch (i1)
        {
        case 2131755512: 
        case 2131755513: 
        default:
            return com.cardinalblue.android.piccollage.view.fragments.a.c;

        case 2131755508: 
        case 2131755509: 
        case 2131755510: 
        case 2131755511: 
        case 2131755514: 
            return com.cardinalblue.android.piccollage.view.fragments.a.a;
        }
    }

    private void b()
    {
        c.setText(0x7f070253);
        a(0x7f1001f7).c(new i() {

            final OverlayShareMenuFragment a;

            public File a(j j1)
                throws Exception
            {
                return com.cardinalblue.android.piccollage.model.k.a((File)j1.e(), a.getActivity().getApplicationContext());
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }).c(new i() {

            final OverlayShareMenuFragment a;

            public Object then(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.RatingNotifierManager.b(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.a.c));
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.g(a);
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a, 0x7f070263);
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a, true);
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.c(a);
                return null;
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }, k.a).a(new i() {

            final OverlayShareMenuFragment a;

            public Object then(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new FinishCollageEvent());
                com.cardinalblue.android.piccollage.a.b.bW();
                if (j1.d() || j1.c())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(a).setText(0x7f070262);
                    throw j1.f();
                } else
                {
                    return null;
                }
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        });
    }

    private void c()
    {
        if (getActivity() instanceof PhotoProtoActivity)
        {
            ((PhotoProtoActivity)getActivity()).a(false);
        }
    }

    private void c(int i1)
    {
        e.setVisibility(0);
        c.setText(i1);
    }

    static void c(OverlayShareMenuFragment overlaysharemenufragment)
    {
        overlaysharemenufragment.c();
    }

    static String d(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.a();
    }

    private void d()
    {
        if (d != null)
        {
            d.findViewById(0x7f1001ee).setVisibility(0);
            d.findViewById(0x7f1001ee).animate().alphaBy(0.0F).alpha(1.0F).setDuration(1000L).start();
            d.invalidate();
        }
    }

    private ActivityInfo e()
    {
        Object obj = getActivity().getPackageManager();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpg");
        for (obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
            if (activityinfo.packageName.equalsIgnoreCase("com.instagram.android"))
            {
                return activityinfo;
            }
        }

        return null;
    }

    static Collage e(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.l;
    }

    static ActivityInfo f(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.e();
    }

    private boolean f()
    {
        return com.cardinalblue.android.b.k.j().getBoolean("pref_watermark_unlock", false);
    }

    private void g()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            String s = PICAppRoutesService.a("explore/following");
            getActivity().startService(PICAppRoutesService.d(s));
            getActivity().finish();
            return;
        }
    }

    static void g(OverlayShareMenuFragment overlaysharemenufragment)
    {
        overlaysharemenufragment.d();
    }

    private void h()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            String s = PICAppRoutesService.a("gallery/me");
            getActivity().startService(PICAppRoutesService.d(s));
            getActivity().finish();
            return;
        }
    }

    static boolean h(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.b;
    }

    static ShareDialog i(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.h;
    }

    static aj j(OverlayShareMenuFragment overlaysharemenufragment)
    {
        return overlaysharemenufragment.a;
    }

    static void k(OverlayShareMenuFragment overlaysharemenufragment)
    {
        overlaysharemenufragment.g();
    }

    protected j a(int i1, com.cardinalblue.android.piccollage.auth.a.b b1)
    {
        ProgressDialog progressdialog = new ProgressDialog(getActivity());
        progressdialog.setMessage(getString(0x7f070277));
        progressdialog.setCancelable(false);
        com.cardinalblue.android.b.k.b(getActivity(), progressdialog);
        return a(i1).d(new i(b1) {

            final com.cardinalblue.android.piccollage.auth.a.b a;
            final OverlayShareMenuFragment b;

            public j a(j j1)
                throws Exception
            {
                bolts.j.a(new Callable(this, j1) {

                    final j a;
                    final _cls15 b;

                    public Void a()
                        throws Exception
                    {
                        com.cardinalblue.android.piccollage.model.k.a((File)a.e(), com.cardinalblue.android.b.k.a());
                        com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.c(b.b);
                        return null;
                    }

                    public Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                b = _pcls15;
                a = j1;
                super();
            }
                });
                return (new com.cardinalblue.android.piccollage.controller.e(b.getActivity())).a((File)j1.e(), a, com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(b), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.e(b).j().getBytes());
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = b1;
                super();
            }
        }, j.b).c(new i(b1, progressdialog) {

            final com.cardinalblue.android.piccollage.auth.a.b a;
            final ProgressDialog b;
            final OverlayShareMenuFragment c;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.a.b.aF("succeeded");
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.RatingNotifierManager.b(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.a.c));
                if (com.cardinalblue.android.b.k.a(c.getActivity()))
                {
                    if (a instanceof com.cardinalblue.android.piccollage.auth.a.d)
                    {
                        com.cardinalblue.android.piccollage.a.b.av();
                        com.cardinalblue.android.piccollage.a.b.aC("cb");
                    }
                    if (a instanceof com.cardinalblue.android.piccollage.auth.a.c)
                    {
                        com.cardinalblue.android.piccollage.a.b.bT();
                        com.cardinalblue.android.piccollage.a.b.aC("facebook");
                    }
                    if (a instanceof com.cardinalblue.android.piccollage.auth.a.f)
                    {
                        com.cardinalblue.android.piccollage.a.b.bU();
                        com.cardinalblue.android.piccollage.a.b.aC("twitter");
                    }
                    if (a instanceof com.cardinalblue.android.piccollage.auth.a.e)
                    {
                        com.cardinalblue.android.piccollage.a.b.bV();
                        com.cardinalblue.android.piccollage.a.b.aC("thumblr");
                    }
                    com.cardinalblue.android.b.k.a(c.getActivity(), b);
                    com.cardinalblue.android.b.k.a(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(c));
                    j1 = c;
                    int k1;
                    if (com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.h(c))
                    {
                        k1 = 0x7f070266;
                    } else
                    {
                        k1 = 0x7f070264;
                    }
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(j1, k1);
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.g(c);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = OverlayShareMenuFragment.this;
                a = b1;
                b = progressdialog;
                super();
            }
        }, k.a).a(new i(progressdialog) {

            final ProgressDialog a;
            final OverlayShareMenuFragment b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.b.k.a(b.getActivity(), a);
                if (j1.d())
                {
                    j1 = j1.f();
                    com.cardinalblue.android.piccollage.a.b.aF("error");
                    com.cardinalblue.android.piccollage.a.b.aG(j1.getMessage());
                    com.cardinalblue.android.piccollage.a.f.a(j1);
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(b).setText(0x7f070265);
                    throw j1;
                } else
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new FinishCollageEvent());
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = progressdialog;
                super();
            }
        }, k.a);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i.onActivityResult(i1, j1, intent);
        com.cardinalblue.android.b.k.i(getActivity());
        i1;
        JVM INSTR tableswitch 110 118: default 72
    //                   110 136
    //                   111 72
    //                   112 115
    //                   113 80
    //                   114 162
    //                   115 157
    //                   116 72
    //                   117 162
    //                   118 162;
           goto _L1 _L2 _L1 _L3 _L4 _L5 _L6 _L1 _L5 _L5
_L1:
        super.onActivityResult(i1, j1, intent);
_L8:
        return;
_L4:
        if (j1 != -1) goto _L8; else goto _L7
_L7:
        a(0x7f1001f3, new com.cardinalblue.android.piccollage.auth.a.d()).c(new i() {

            final OverlayShareMenuFragment a;

            public Object then(j j2)
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.k(a);
                return null;
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }, k.a);
        return;
_L3:
        if (j1 != -1) goto _L8; else goto _L9
_L9:
        a(0x7f1001f4, new com.cardinalblue.android.piccollage.auth.a.c());
        return;
_L2:
        if (j1 != -1) goto _L8; else goto _L10
_L10:
        a(0x7f1001fa, new com.cardinalblue.android.piccollage.auth.a.a());
        return;
_L6:
        f = true;
_L5:
        d();
        com.cardinalblue.android.piccollage.controller.d.a().c(new FinishCollageEvent());
        return;
    }

    public void onCapturingProgress(com.cardinalblue.android.piccollage.events.d d1)
    {
        if (j == null)
        {
            return;
        }
        if (!j.isShowing())
        {
            j.show();
        }
        j.setProgress((int)d1.a);
    }

    public void onCapturingResult(e e1)
    {
        j.dismiss();
        if (e1.a)
        {
            k.b(e1.c).a(e1.b);
        } else
        {
            k.b(e1.c).a(new IllegalStateException("capturing failed"));
        }
        a(e1.a);
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131755501 2131755517: default 88
    //                   2131755501 170
    //                   2131755502 178
    //                   2131755503 88
    //                   2131755504 88
    //                   2131755505 88
    //                   2131755506 88
    //                   2131755507 88
    //                   2131755508 88
    //                   2131755509 500
    //                   2131755510 325
    //                   2131755511 221
    //                   2131755512 279
    //                   2131755513 241
    //                   2131755514 88
    //                   2131755515 374
    //                   2131755516 89
    //                   2131755517 112;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L1 _L1 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L11
_L1:
        return;
_L10:
        com.cardinalblue.android.piccollage.a.b.aD("share menu");
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.k("com.cardinalblue.piccollage.watermark"));
        return;
_L11:
        com.cardinalblue.android.piccollage.a.b.bG();
        view = new com.facebook.share.model.AppInviteContent.Builder();
        PicUser picuser = PicAuth.h().i();
        if (picuser != null)
        {
            if (TextUtils.isEmpty(picuser.getProfileImageUrl()))
            {
                view.setPreviewImageUrl(picuser.getProfileImageUrl());
            }
            view.setApplinkUrl("http://pic-collage.com/");
        }
        AppInviteDialog.show(this, view.build());
        return;
_L2:
        getActivity().onBackPressed();
        return;
_L3:
        com.cardinalblue.android.piccollage.a.b.bF();
        if (!((com.cardinalblue.android.piccollage.a)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a)).a(getActivity(), new com.cardinalblue.android.piccollage.a.a() {

        final OverlayShareMenuFragment a;

        public void a()
        {
            com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a);
        }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
    }, new InAppPurchaseListener() {

        final OverlayShareMenuFragment a;

        public void onInAppPurchaseRequested(InAppPurchase inapppurchase)
        {
            inapppurchase = PICAppRoutesService.d(PICAppRoutesService.b(inapppurchase.getProductId()));
            inapppurchase.putExtra("extra_from_iap", true);
            a.getActivity().startService(inapppurchase);
        }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
    }))
        {
            h();
            return;
        }
          goto _L1
_L6:
        com.cardinalblue.android.piccollage.a.b.am();
        com.cardinalblue.android.piccollage.a.b.H("save to library");
        com.cardinalblue.android.piccollage.a.b.aC("save to library");
        b();
        return;
_L8:
        com.cardinalblue.android.piccollage.a.b.aq();
        com.cardinalblue.android.piccollage.a.b.H("hp");
        com.cardinalblue.android.piccollage.a.b.aC("hp");
        a(0x7f1001f9).c(new i() {

            final OverlayShareMenuFragment a;

            public Void a(j j1)
                throws Exception
            {
                j1 = new ImagePrintItem(new ImageAsset(((File)j1.e()).toString(), com.hp.mss.hpprint.model.asset.ImageAsset.a.a, 4F, 6F));
                j1 = new PrintJobData(a.getActivity(), j1);
                j1.a("PicCollage");
                com.hp.mss.hpprint.util.f.a(j1);
                com.hp.mss.hpprint.util.f.a(a.getActivity());
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }, j.b);
        return;
_L7:
        com.cardinalblue.android.piccollage.a.b.at();
        com.cardinalblue.android.piccollage.a.b.H("print");
        com.cardinalblue.android.piccollage.a.b.aC("print");
        c();
        g = true;
        a(0x7f1001f8).c(new i() {

            final OverlayShareMenuFragment a;

            public Void a(j j1)
                throws Exception
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(new Asset(((File)j1.e()).toString()));
                if (com.cardinalblue.android.b.d.h())
                {
                    KiteSDK.getInstance(a.getActivity(), a.getString(0x7f070346), ly.kite.KiteSDK.DefaultEnvironment.TEST).startShopping(a.getActivity(), arraylist);
                } else
                {
                    KiteSDK.getInstance(a.getActivity(), a.getString(0x7f070345), ly.kite.KiteSDK.DefaultEnvironment.LIVE).startShopping(a.getActivity(), arraylist);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }, j.b);
        return;
_L5:
        com.cardinalblue.android.piccollage.a.b.ao();
        com.cardinalblue.android.piccollage.a.b.H("other");
        com.cardinalblue.android.piccollage.a.b.aC("other apps");
        a(0x7f1001f6).c(new i() {

            final OverlayShareMenuFragment a;

            public Intent a(j j1)
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.e.a(null, (File)j1.e()).putExtra("android.intent.extra.SUBJECT", com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(a));
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }).a(new i() {

            final OverlayShareMenuFragment a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(a).setText(0x7f07024c);
                } else
                {
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.c(a);
                    a.startActivityForResult((Intent)j1.e(), 117);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        }, j.b);
        return;
_L9:
        com.cardinalblue.android.piccollage.a.b.ap();
        com.cardinalblue.android.piccollage.a.b.H("copy link");
        com.cardinalblue.android.piccollage.a.b.aC("copy link");
        view = new ProgressDialog(getActivity());
        view.setCancelable(true);
        view.setCanceledOnTouchOutside(false);
        view.setMessage(getString(0x7f070277));
        h h1 = new h();
        a(0x7f1001fb).c(new i(view, h1) {

            final ProgressDialog a;
            final h b;
            final OverlayShareMenuFragment c;

            public Void a(j j1)
                throws Exception
            {
                a.show();
                if (!com.cardinalblue.android.b.k.b(c.getActivity()))
                {
                    throw new IllegalStateException("no internet");
                } else
                {
                    b.a(j1.e());
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = OverlayShareMenuFragment.this;
                a = progressdialog;
                b = h1;
                super();
            }
        }, j.b).c(new i(h1) {

            final h a;
            final OverlayShareMenuFragment b;

            public CBCollageStructResponse a(j j1)
                throws Exception
            {
                j1 = com.cardinalblue.android.b.a.a(com.cardinalblue.android.piccollage.lib.a.e.a(com.cardinalblue.android.piccollage.lib.e.a.d(((File)a.a()).getAbsolutePath())).a(com.cardinalblue.android.piccollage.controller.f.b));
                j1 = com.cardinalblue.android.piccollage.controller.network.f.a(b.getActivity(), j1, com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(b));
                if (j1 == null || !j1.b())
                {
                    throw new IllegalArgumentException("createResponse is null or response is invalid collage");
                } else
                {
                    return j1;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = h1;
                super();
            }
        }, j.a).c(new i(h1) {

            final h a;
            final OverlayShareMenuFragment b;

            public Intent a(j j1)
                throws Exception
            {
                j1 = (CBCollageStructResponse)j1.e();
                Object obj;
                int i1;
                if (com.cardinalblue.android.b.k.r())
                {
                    i1 = Math.min(com.cardinalblue.android.b.k.c() * 2, 2048);
                } else
                {
                    i1 = 1024;
                }
                obj = com.cardinalblue.android.piccollage.lib.a.e.a(com.cardinalblue.android.piccollage.lib.e.a.d(((File)a.a()).getAbsolutePath())).a(i1);
                obj = com.cardinalblue.android.piccollage.controller.network.f.a(b.getActivity(), j1.a().getUpdateUrl(), com.cardinalblue.android.b.a.a(((android.graphics.Bitmap) (obj))), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.e(b).j().getBytes(), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(b));
                if (obj == null || !((CBCollageStructResponse) (obj)).b())
                {
                    throw new com.cardinalblue.android.piccollage.controller.network.f.e((new StringBuilder()).append("Cannot update collage: ").append(j1.a().getUrl()).toString());
                } else
                {
                    return com.cardinalblue.android.piccollage.controller.e.a(null, (File)a.a()).putExtra("android.intent.extra.TEXT", j1.a().getUrl()).putExtra("android.intent.extra.SUBJECT", com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(b));
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = h1;
                super();
            }
        }, j.a).a(new i(view) {

            final ProgressDialog a;
            final OverlayShareMenuFragment b;

            public Void a(j j1)
                throws Exception
            {
                a.dismiss();
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(b).setText(0x7f07024c);
                } else
                {
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.c(b);
                    b.startActivityForResult((Intent)j1.e(), 118);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = OverlayShareMenuFragment.this;
                a = progressdialog;
                super();
            }
        }, j.b);
        return;
_L4:
        com.cardinalblue.android.piccollage.a.b.an();
        com.cardinalblue.android.piccollage.a.b.H("share to instagram");
        com.cardinalblue.android.piccollage.a.b.aC("share to instagram");
        view = b(0x7f1001f5);
        Point point = a(view, l.w(), l.v());
        a(view, point.x, point.x, com.cardinalblue.android.b.k.s(), 2).c(new i() {

            final OverlayShareMenuFragment a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.b.k.a(a.getActivity(), new Callable(this, j1) {

                    final j a;
                    final _cls3 b;

                    public File a()
                        throws Exception
                    {
                        File file = com.cardinalblue.android.piccollage.model.k.b((File)a.e(), b.a.getActivity());
                        if (file == null || !file.exists())
                        {
                            throw new IOException((new StringBuilder()).append("fail to copy file to cache : ").append(file).toString());
                        } else
                        {
                            com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.c(b.a);
                            return file;
                        }
                    }

                    public Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                b = _pcls3;
                a = j1;
                super();
            }
                }, a.getString(0x7f070277)).c(new i(this) {

                    final _cls3 a;

                    public Void a(j j1)
                        throws Exception
                    {
                        new com.cardinalblue.android.piccollage.controller.e(a.a.getActivity());
                        StringBuilder stringbuilder = new StringBuilder();
                        if (!TextUtils.isEmpty(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(a.a)))
                        {
                            stringbuilder.append(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.d(a.a)).append(" ");
                        }
                        stringbuilder.append("#piccollage");
                        j1 = com.cardinalblue.android.piccollage.controller.e.a(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.f(a.a), (File)j1.e());
                        j1.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
                        a.a.startActivityForResult(j1, 115);
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = _pcls3;
                super();
            }
                }, j.b);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        });
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            k = (CapturingTaskMap)bundle.getParcelable("saved_key_captured_files");
            f = bundle.getBoolean("key_is_ig_callbacked");
            g = bundle.getBoolean("key_is_kite_callbacked");
            l = (Collage)bundle.getParcelable("extra_collage");
        } else
        {
            l = (Collage)getArguments().getParcelable("extra_collage");
        }
        bundle = getActivity().getSupportFragmentManager().findFragmentByTag("tag_share_dialog");
        if (bundle != null && (bundle instanceof aj))
        {
            a = (aj)bundle;
        }
        j = com.cardinalblue.android.b.j.a(getActivity(), 0x7f0701fa);
        i = com.facebook.CallbackManager.Factory.create();
        h = new ShareDialog(this);
        h.registerCallback(i, new FacebookCallback() {

            final OverlayShareMenuFragment a;

            public void a(com.facebook.share.Sharer.Result result)
            {
                com.cardinalblue.android.piccollage.a.b.aF("succeeded");
                com.cardinalblue.android.piccollage.a.b.bT();
                com.cardinalblue.android.piccollage.a.b.aC("facebook");
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.RatingNotifierManager.b(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.a.c));
                result = a;
                int i1;
                if (com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.h(a))
                {
                    i1 = 0x7f070266;
                } else
                {
                    i1 = 0x7f070264;
                }
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(result, i1);
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.g(a);
                com.cardinalblue.android.piccollage.controller.d.a().c(new FinishCollageEvent());
            }

            public void onCancel()
            {
            }

            public void onError(FacebookException facebookexception)
            {
                com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f070265, 0);
            }

            public void onSuccess(Object obj)
            {
                a((com.facebook.share.Sharer.Result)obj);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        });
    }

    public Animation onCreateAnimation(int i1, boolean flag, int j1)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        return AnimationUtils.loadAnimation(getActivity(), 0x7f040028);
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040029);
        return animation;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        com.cardinalblue.android.piccollage.a.f.a(notfoundexception);
        return null;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.a.b.al();
        layoutinflater = layoutinflater.inflate(0x7f0300c2, viewgroup, false);
        d = layoutinflater;
        c = (TextView)layoutinflater.findViewById(0x7f1001f1);
        e = (ImageView)layoutinflater.findViewById(0x7f1001f0);
        int i1;
        if (((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().isFacebookInviteEnabled())
        {
            layoutinflater.findViewById(0x7f1001fd).setOnClickListener(this);
        } else
        {
            layoutinflater.findViewById(0x7f1001fd).setVisibility(8);
        }
        layoutinflater.findViewById(0x7f1001ee).setOnClickListener(this);
        layoutinflater.findViewById(0x7f1001ed).setOnClickListener(this);
        a(layoutinflater.findViewById(0x7f1001f3), getString(0x7f070232), 0x7f0202ad, new android.view.View.OnClickListener() {

            final OverlayShareMenuFragment a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ar();
                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a, 0x7f1001f3, com.cardinalblue.android.piccollage.events.j.a.a);
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        });
        a(layoutinflater.findViewById(0x7f1001f4), getString(0x7f070143), 0x7f02029e, new android.view.View.OnClickListener() {

            final OverlayShareMenuFragment a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.as();
                if (!com.cardinalblue.android.b.k.p())
                {
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a, 0x7f1001f4, com.cardinalblue.android.piccollage.events.j.a.b);
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(a, 0x7f1001f4).c(new i(this) {

                        final _cls9 a;

                        public Void a(j j1)
                            throws Exception
                        {
                            if (com.cardinalblue.android.b.g.a(((File)j1.e()).getAbsolutePath()))
                            {
                                j1 = (new com.facebook.share.model.ShareVideoContent.Builder()).setVideo((new com.facebook.share.model.ShareVideo.Builder()).setLocalUrl(Uri.fromFile((File)j1.e())).build()).build();
                            } else
                            {
                                j1 = (new com.facebook.share.model.SharePhotoContent.Builder()).addPhoto((new com.facebook.share.model.SharePhoto.Builder()).setImageUrl(Uri.fromFile((File)j1.e())).build()).build();
                            }
                            if (com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.i(a.a).canShow(j1))
                            {
                                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.i(a.a).show(j1);
                            } else
                            {
                                com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a(a.a, 0x7f1001f4, com.cardinalblue.android.piccollage.events.j.a.b);
                            }
                            return null;
                        }

                        public Object then(j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                a = _pcls9;
                super();
            }
                    }, j.b);
                    return;
                }
            }

            
            {
                a = OverlayShareMenuFragment.this;
                super();
            }
        });
        ((ViewGroup)layoutinflater.findViewById(0x7f1001f2)).removeView(layoutinflater.findViewById(0x7f1001fa));
        if (e() != null)
        {
            a(layoutinflater.findViewById(0x7f1001f5), getString(0x7f0701e4), 0x7f02029f);
        } else
        {
            ((ViewGroup)layoutinflater.findViewById(0x7f1001f2)).removeView(layoutinflater.findViewById(0x7f1001f5));
        }
        a(layoutinflater.findViewById(0x7f1001f7), getString(0x7f07026d), 0x7f0202ae);
        a(layoutinflater.findViewById(0x7f1001f8), getString(0x7f070273), 0x7f020201);
        a(layoutinflater.findViewById(0x7f1001f6), getString(0x7f070221), 0x7f0202ac);
        a(layoutinflater.findViewById(0x7f1001fb), getString(0x7f07025f), 0x7f0202b1);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a(layoutinflater.findViewById(0x7f1001f9), getString(0x7f070270), 0x7f0202b0);
        } else
        {
            ((ViewGroup)layoutinflater.findViewById(0x7f1001f2)).removeView(layoutinflater.findViewById(0x7f1001f9));
        }
        viewgroup = layoutinflater.findViewById(0x7f1001fc);
        viewgroup.setOnClickListener(this);
        if (!f())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        viewgroup.setVisibility(i1);
        if (f)
        {
            d();
        }
        if (g)
        {
            g = false;
            d();
        }
        return layoutinflater;
    }

    public void onPostCollage(com.cardinalblue.android.piccollage.events.j j1)
    {
        if (!com.cardinalblue.android.b.k.b(getActivity()))
        {
            com.cardinalblue.android.b.k.a(getActivity(), 0x7f07021d, 1);
            return;
        }
        l.b(j1.a);
        static class _cls16
        {

            static final int a[];

            static 
            {
                a = new int[com.cardinalblue.android.piccollage.events.j.a.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.events.j.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.events.j.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.events.j.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.cardinalblue.android.piccollage.view.fragments._cls16.a[j1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            j1 = new Intent(getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
            j1.putExtra("key_pic_login_purpose", PicLoginActivity.d);
            j1.putExtra("key_pic_login_caption", a());
            j1.putExtra("from", "sharing");
            startActivityForResult(j1, 113);
            return;

        case 2: // '\002'
            j1 = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/login/FbLoginActivity);
            j1.putExtra("caption", a());
            startActivityForResult(j1, 112);
            return;

        case 3: // '\003'
            j1 = new Intent();
            break;
        }
        j1.setClass(getActivity(), com/cardinalblue/android/piccollage/activities/KddiShareActivity);
        startActivityForResult(j1, 110);
    }

    public void onPurchaseResult(l l1)
    {
        if (l1.a)
        {
            com.cardinalblue.android.piccollage.a.b.bC();
            com.cardinalblue.android.b.k.j().edit().putBoolean("pref_watermark_unlock", true).apply();
            c.setText(0x7f070267);
            e.setVisibility(8);
            if (d != null)
            {
                d.findViewById(0x7f1001fc).setVisibility(8);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("saved_key_captured_files", k);
        bundle.putBoolean("key_is_ig_callbacked", f);
        bundle.putBoolean("key_is_kite_callbacked", g);
        bundle.putParcelable("extra_collage", l);
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }
}

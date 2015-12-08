// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.j;
import com.amazon.headtracking.HeadTrackingEvent;
import com.amazon.headtracking.HeadTrackingListener;
import com.amazon.headtracking.HeadTrackingManager;
import com.androidquery.callback.BitmapAjaxCallback;
import com.aviary.android.feather.sdk.FeatherActivity;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.InAppNotificationService;
import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.undo.AddScrapOp;
import com.cardinalblue.android.piccollage.activities.undo.ApplyBorderOp;
import com.cardinalblue.android.piccollage.activities.undo.ApplyShadowOp;
import com.cardinalblue.android.piccollage.activities.undo.ChangeZIndexOp;
import com.cardinalblue.android.piccollage.activities.undo.CollageUpdateOp;
import com.cardinalblue.android.piccollage.activities.undo.RemoveScrapOp;
import com.cardinalblue.android.piccollage.activities.undo.ScrapUpdateOp;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.controller.i;
import com.cardinalblue.android.piccollage.controller.m;
import com.cardinalblue.android.piccollage.controller.t;
import com.cardinalblue.android.piccollage.controller.u;
import com.cardinalblue.android.piccollage.events.FinishCollageEvent;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import com.cardinalblue.android.piccollage.model.ServerCollage;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.model.gson.ClippingPathModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.FrameModel;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.gson.TagModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.memento.BaseMemento;
import com.cardinalblue.android.piccollage.model.memento.IMemento;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment;
import com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment;
import com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;
import com.cardinalblue.android.piccollage.view.l;
import com.cardinalblue.android.piccollage.view.n;
import com.cardinalblue.android.piccollage.view.o;
import com.google.android.gms.ads.purchase.InAppPurchase;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import ly.kite.KiteSDK;
import ly.kite.catalogue.Asset;
import net.a.a.c;
import net.a.a.d;
import net.a.a.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity, PhotoAdderActivity, TextActivity, StickersActivity, 
//            VideoScrapPreviewActivity, ClipActivity, WebSearchActivity

public class PhotoProtoActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, com.cardinalblue.android.piccollage.controller.CollageController.a, com.cardinalblue.android.piccollage.controller.CollageController.b, com.cardinalblue.android.piccollage.controller.k.c, com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b, com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.c
{
    private class a
        implements android.view.View.OnTouchListener
    {

        final PhotoProtoActivity a;
        private final int b = 500;
        private long c;
        private android.view.View.OnClickListener d;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            MotionEvent motionevent1;
            boolean flag2;
            flag2 = false;
            if (PhotoProtoActivity.q(a) == null)
            {
                return false;
            }
            motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.offsetLocation(view.getLeft(), view.getTop());
            motionevent1.offsetLocation(-PhotoProtoActivity.q(a).getLeft(), -PhotoProtoActivity.q(a).getTop());
            motionevent.getAction();
            JVM INSTR tableswitch 0 2: default 92
        //                       0 183
        //                       1 94
        //                       2 205;
               goto _L1 _L2 _L3 _L4
_L1:
            return true;
_L3:
            boolean flag;
            boolean flag1;
            if (System.currentTimeMillis() - c < 500L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (flag)
            {
                flag1 = flag2;
                if (d != null)
                {
                    flag1 = true;
                }
            }
            if (flag1)
            {
                d.onClick(view);
                motionevent1.setAction(3);
            }
            PhotoProtoActivity.q(a).onTouchEvent(motionevent1);
            c = -1L;
            continue; /* Loop/switch isn't completed */
_L2:
            c = System.currentTimeMillis();
            PhotoProtoActivity.q(a).onTouchEvent(motionevent1);
            continue; /* Loop/switch isn't completed */
_L4:
            int i1 = ViewConfiguration.get(a).getScaledTouchSlop();
            if (!com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(view, motionevent.getX(), motionevent.getY(), i1))
            {
                c = -1L;
            }
            PhotoProtoActivity.q(a).onTouchEvent(motionevent1);
            if (true) goto _L1; else goto _L5
_L5:
        }

        public a(android.view.View.OnClickListener onclicklistener)
        {
            a = PhotoProtoActivity.this;
            super();
            c = -1L;
            d = onclicklistener;
        }
    }

    public static class b
        implements HeadTrackingListener
    {

        PhotoProtoView a;

        public void onHeadTrackingEvent(HeadTrackingEvent headtrackingevent)
        {
            if (a != null)
            {
                a.a(headtrackingevent.x_mm, headtrackingevent.y_mm, headtrackingevent.z_mm);
            }
        }

        public b(PhotoProtoView photoprotoview)
        {
            a = photoprotoview;
        }
    }

    private static class c extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            PhotoProtoActivity photoprotoactivity = (PhotoProtoActivity)a.get();
            message.what;
            JVM INSTR tableswitch 0 1: default 36
        //                       0 42
        //                       1 62;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
_L5:
            return;
_L2:
            if (photoprotoactivity != null && com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(photoprotoactivity) != null)
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(photoprotoactivity).setSystemUiVisibility(1);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (photoprotoactivity != null)
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(photoprotoactivity, (ArrayList)message.obj);
                return;
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        public c(PhotoProtoActivity photoprotoactivity)
        {
            a = new WeakReference(photoprotoactivity);
        }
    }


    private static final String U[];
    private static final String W[] = {
        "c_26.png", "c_14.png", "c_30.png", "c_34.png", "c_06.png"
    };
    private ClipboardManager A;
    private AbstractCollage B;
    private HeadTrackingManager C;
    private HeadTrackingListener D;
    private View E;
    private com.cardinalblue.android.piccollage.iab.util.d F;
    private boolean G;
    private View H;
    private IMemento I;
    private boolean J;
    private String K;
    private ProgressDialog L;
    private ImageScrapModel M;
    private boolean N;
    private boolean O;
    private boolean P;
    private final Runnable Q = new Runnable() {

        final PhotoProtoActivity a;

        public void run()
        {
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.i(a).setVisibility(4);
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.i(a).setImageResource(0x7f02011b);
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a).removeCallbacks(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.j(a));
        }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
    };
    private boolean R;
    private boolean S;
    private AsyncTask T;
    private JSONObject V;
    private final Random X = new Random();
    private UndoManager Y;
    private BaseScrapModel Z;
    protected BaseMemento a;
    private int b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private PhotoProtoView g;
    private CollageController h;
    private ImageButton i;
    private Uri j;
    private com.cardinalblue.android.piccollage.view.k k;
    private PointF l;
    private net.a.a.c m;
    private net.a.a.c n;
    private net.a.a.c o;
    private net.a.a.c p;
    private net.a.a.c q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private TextView v;
    private ImageButton w;
    private TextView x;
    private Handler y;
    private com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a z;

    public PhotoProtoActivity()
    {
        b = 0;
        e = null;
        f = true;
        l = new PointF(0.0F, 0.0F);
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = false;
        s = false;
        t = false;
        u = false;
        G = false;
        I = new BaseMemento();
        J = false;
        N = false;
        P = false;
        R = false;
        S = false;
        V = null;
        a = new BaseMemento();
    }

    static com.cardinalblue.android.piccollage.iab.util.d A(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.F;
    }

    private void A()
    {
        boolean flag1 = true;
        ViewStub viewstub = (ViewStub)findViewById(0x7f1000ce);
        if (viewstub != null)
        {
            viewstub.inflate();
        }
        H = findViewById(0x7f1000cf);
        if (H != null)
        {
            H.setOnClickListener(this);
            Object obj = H.findViewById(0x7f1001ab);
            if (obj != null)
            {
                ((View) (obj)).setOnClickListener(this);
            }
            obj = x();
            boolean flag;
            if (obj != null)
            {
                if (((View) (obj)).getVisibility() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((View) (obj)).setTag(Boolean.valueOf(flag));
                ((View) (obj)).setVisibility(0);
            }
            obj = i;
            if (i.getVisibility() == 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ((ImageButton) (obj)).setTag(Boolean.valueOf(flag));
            i.setVisibility(0);
            H.setVisibility(0);
        }
    }

    private boolean B()
    {
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = flag2;
        if (H != null)
        {
            flag1 = flag2;
            if (H.getVisibility() == 0)
            {
                Object obj = x();
                int i1;
                if (obj != null)
                {
                    ImageButton imagebutton;
                    if (((Boolean)((View) (obj)).getTag()).booleanValue())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    ((View) (obj)).setVisibility(i1);
                }
                obj = (Boolean)i.getTag();
                imagebutton = i;
                if (((Boolean) (obj)).booleanValue())
                {
                    i1 = ((flag) ? 1 : 0);
                } else
                {
                    i1 = 8;
                }
                imagebutton.setVisibility(i1);
                H.setVisibility(8);
                if (O)
                {
                    a(findViewById(0x7f1000cb));
                }
                flag1 = true;
            }
        }
        return flag1;
    }

    private boolean C()
    {
        if (m == null)
        {
            return true;
        }
        if (R)
        {
            R = false;
            return true;
        } else
        {
            return false;
        }
    }

    private void D()
    {
        m = new e(this, g, true);
        m.a(new d(0, getString(0x7f0700f1), getResources().getDrawable(0x7f020288), 0));
        m.a(new d(1, getString(0x7f070230), getResources().getDrawable(0x7f0202af), 0));
        m.a(new d(2, getString(0x7f0700f3), getResources().getDrawable(0x7f02028a), 1));
        m.a(new d(3, getString(0x7f0700f2), getResources().getDrawable(0x7f020289), 1));
        m.a(new d(4, getString(0x7f0700f5), getResources().getDrawable(0x7f02027f), 1));
        if (A.hasText())
        {
            m.a(new d(100, getString(0x7f0700f6), getResources().getDrawable(0x7f020287), 0));
        }
        m.a(E());
    }

    private net.a.a.c.a E()
    {
        return new net.a.a.c.a() {

            final PhotoProtoActivity a;

            public void a(net.a.a.c c1, int i1, int j1, ImageView imageview, TextView textview)
            {
                i1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(a).n();
                if (j1 == 4 || i1 < 30) goto _L2; else goto _L1
_L1:
                c1 = String.format(PhotoProtoActivity.q(a).getContext().getString(0x7f0702a4), new Object[] {
                    Integer.valueOf(30)
                });
                com.cardinalblue.android.b.k.a(PhotoProtoActivity.q(a).getContext(), c1, 0);
_L4:
                return;
_L2:
                if (j1 != 100)
                {
                    break; /* Loop/switch isn't completed */
                }
                com.cardinalblue.android.piccollage.a.b.aD();
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, "paste");
                if (PhotoProtoActivity.r(a).hasText())
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a, String.valueOf(PhotoProtoActivity.r(a).getText()));
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                imageview = null;
                i1 = 30 - i1;
                c1 = imageview;
                j1;
                JVM INSTR tableswitch 0 7: default 180
            //                           0 193
            //                           1 212
            //                           2 300
            //                           3 259
            //                           4 281
            //                           5 183
            //                           6 183
            //                           7 259;
                   goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L11 _L9
_L11:
                break; /* Loop/switch isn't completed */
_L5:
                c1 = imageview;
_L13:
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, c1, j1);
                return;
_L6:
                com.cardinalblue.android.piccollage.a.b.ay();
                com.cardinalblue.android.piccollage.a.b.J("Add Photos");
                c1 = PhotoProtoActivity.s(a);
                continue; /* Loop/switch isn't completed */
_L7:
                com.cardinalblue.android.piccollage.a.b.aA();
                com.cardinalblue.android.piccollage.a.b.J("Photos From Web");
                c1 = new Intent(a, com/cardinalblue/android/piccollage/activities/WebSearchActivity);
                c1.putExtra("max_choices", i1);
                c1.putExtra("search_memo", com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.t(a));
                continue; /* Loop/switch isn't completed */
_L9:
                com.cardinalblue.android.piccollage.a.b.aC();
                com.cardinalblue.android.piccollage.a.b.J("Add Stickers");
                c1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, i1, "Create page");
                continue; /* Loop/switch isn't completed */
_L10:
                com.cardinalblue.android.piccollage.a.b.az();
                com.cardinalblue.android.piccollage.a.b.J("Change Background");
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, 502);
                return;
_L8:
                com.cardinalblue.android.piccollage.a.b.J("Add Text");
                com.cardinalblue.android.piccollage.a.b.aB();
                c1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.u(a);
                if (true) goto _L13; else goto _L12
_L12:
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        };
    }

    private Intent F()
    {
        return (new Intent(this, com/cardinalblue/android/piccollage/activities/PhotoAdderActivity)).putExtra("max_choices", 30);
    }

    private Intent G()
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/TextActivity);
        intent.putExtra("text_model", TextScrapModel.newEmptyTextModel(this));
        return intent;
    }

    private void H()
    {
        p = new e(this, g, false);
        p.a(new d(6, getResources().getString(0x7f07011c), getResources().getDrawable(0x7f02028a), 0));
        d d1 = new d(5, J(), K(), 0);
        d1.a(true);
        p.a(d1);
        p.a(M());
    }

    private void I()
    {
        o = new e(this, g, false);
        o.a(new d(4, getResources().getString(0x7f07011e), getResources().getDrawable(0x7f020280), 0));
        d d1 = new d(5, J(), K(), 0);
        d1.a(true);
        o.a(d1);
        o.a(M());
    }

    private String J()
    {
        if (h.g(k))
        {
            return getString(0x7f07022b);
        } else
        {
            return getString(0x7f070227);
        }
    }

    private Drawable K()
    {
        if (h.g(k))
        {
            return getResources().getDrawable(0x7f0202a1);
        } else
        {
            return getResources().getDrawable(0x7f0202a2);
        }
    }

    private boolean L()
    {
        return com.cardinalblue.android.b.k.a(m) || com.cardinalblue.android.b.k.a(n) || com.cardinalblue.android.b.k.a(o) || com.cardinalblue.android.b.k.a(p) || com.cardinalblue.android.b.k.a(q) || isFinishing();
    }

    private net.a.a.c.a M()
    {
        return new net.a.a.c.a() {

            final PhotoProtoActivity a;

            private void a(String s1)
            {
                com.cardinalblue.android.piccollage.a.b.z(s1);
            }

            public void a(net.a.a.c c1, int i1, int j1, ImageView imageview, TextView textview)
            {
                if (PhotoProtoActivity.v(a) == null)
                {
                    return;
                }
                if (!(PhotoProtoActivity.v(a) instanceof n)) goto _L2; else goto _L1
_L1:
                j1;
                JVM INSTR tableswitch 6 6: default 44
            //                           6 186;
                   goto _L2 _L3
_L2:
                if (!(PhotoProtoActivity.v(a) instanceof g)) goto _L5; else goto _L4
_L4:
                g g1 = (g)PhotoProtoActivity.v(a);
                j1;
                JVM INSTR tableswitch 0 4: default 104
            //                           0 206
            //                           1 227
            //                           2 297
            //                           3 384
            //                           4 403;
                   goto _L6 _L7 _L8 _L9 _L10 _L11
_L6:
                break; /* Loop/switch isn't completed */
_L11:
                break MISSING_BLOCK_LABEL_403;
_L5:
                switch (j1)
                {
                default:
                    return;

                case 5: // '\005'
                    break;
                }
                String s1;
                if (com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(a).g(PhotoProtoActivity.v(a)))
                {
                    a("bring to front");
                    com.cardinalblue.android.piccollage.a.b.bY();
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, PhotoProtoActivity.v(a), false).c(new bolts.i(this, textview, imageview) {

                        final TextView a;
                        final ImageView b;
                        final _cls28 c;

                        public Void a(j j1)
                            throws Exception
                        {
                            a.setText(PhotoProtoActivity.x(c.a));
                            b.setImageDrawable(PhotoProtoActivity.y(c.a));
                            return null;
                        }

                        public Object then(j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                c = _pcls28;
                a = textview;
                b = imageview;
                super();
            }
                    });
                    return;
                } else
                {
                    a("push to button");
                    com.cardinalblue.android.piccollage.a.b.bX();
                    PhotoProtoActivity.q(a).c(PhotoProtoActivity.v(a)).c(new bolts.i(this, textview, imageview) {

                        final TextView a;
                        final ImageView b;
                        final _cls28 c;

                        public Void a(j j1)
                            throws Exception
                        {
                            Hashtable hashtable = new Hashtable();
                            com.cardinalblue.android.piccollage.view.k k2;
                            for (Iterator iterator = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c.a).t().iterator(); iterator.hasNext(); hashtable.put(Long.valueOf(k2.U()), Integer.valueOf(k2.W())))
                            {
                                k2 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
                            }

                            if (!com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c.a).c((com.cardinalblue.android.piccollage.view.k)j1.e()))
                            {
                                return null;
                            }
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).a("push scrap to bottom");
                            j1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c.a).t().iterator();
                            do
                            {
                                if (!j1.hasNext())
                                {
                                    break;
                                }
                                com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)j1.next();
                                int i1 = ((Integer)hashtable.get(Long.valueOf(k1.U()))).intValue();
                                int l1 = k1.W();
                                if (i1 != l1)
                                {
                                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).a(new ChangeZIndexOp(k1.U(), i1, l1));
                                }
                            } while (true);
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).d();
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.l(c.a);
                            a.setText(PhotoProtoActivity.x(c.a));
                            b.setImageDrawable(PhotoProtoActivity.y(c.a));
                            return null;
                        }

                        public Object then(j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                c = _pcls28;
                a = textview;
                b = imageview;
                super();
            }
                    }, j.b);
                    return;
                }
_L3:
                a.a((n)PhotoProtoActivity.v(a));
                  goto _L2
_L7:
                com.cardinalblue.android.piccollage.a.b.ae();
                a("edit");
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, g1);
                  goto _L5
_L8:
                s1 = g1.i();
                com.cardinalblue.android.piccollage.a.b.ag();
                c1 = s1;
                if (TextUtils.isEmpty(s1))
                {
                    c1 = "unknown";
                }
                com.cardinalblue.android.piccollage.a.b.v(c1);
                a("set background");
                g1.c(false);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(a).a(g1, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a));
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.l(a);
                  goto _L5
_L9:
                com.cardinalblue.android.piccollage.a.b.af();
                a("clip");
                if (g1.h())
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a, g1);
                } else
                {
                    com.cardinalblue.android.b.k.a(a, new Callable(this, g1) {

                        final g a;
                        final _cls28 b;

                        public g a()
                            throws Exception
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b.a).h(a);
                            return a;
                        }

                        public Object call()
                            throws Exception
                        {
                            return a();
                        }

            
            {
                b = _pcls28;
                a = g1;
                super();
            }
                    }, a.getString(0x7f0701fa)).c(new bolts.i(this) {

                        final _cls28 a;

                        public Void a(j j1)
                            throws Exception
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a.a, (g)j1.e());
                            return null;
                        }

                        public Object then(j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                a = _pcls28;
                super();
            }
                    }, k.a).a(new bolts.i(this) {

                        final _cls28 a;

                        public Void a(j j1)
                            throws Exception
                        {
                            if (j1.d())
                            {
                                com.cardinalblue.android.piccollage.a.f.a(j1.f());
                                com.cardinalblue.android.b.k.a(a.a, 0x7f0700d4, 0);
                            }
                            return null;
                        }

                        public Object then(j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                a = _pcls28;
                super();
            }
                    }, k.a);
                }
                  goto _L5
_L10:
                com.cardinalblue.android.piccollage.a.b.ad();
                a("border");
                PhotoProtoActivity.w(a);
                  goto _L5
                com.cardinalblue.android.piccollage.a.b.ah();
                a("copy");
                com.cardinalblue.android.b.k.a(a, new Callable(this, g1) {

                    final g a;
                    final _cls28 b;

                    public Void a()
                        throws Exception
                    {
                        if (!a.h())
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b.a).h(a);
                        }
                        return null;
                    }

                    public Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                b = _pcls28;
                a = g1;
                super();
            }
                }, a.getString(0x7f0701fa)).c(new bolts.i(this, g1) {

                    final g a;
                    final _cls28 b;

                    public Void a(j j1)
                        throws Exception
                    {
                        boolean flag = PhotoProtoActivity.r(b.a).hasText();
                        j1 = a.ab();
                        PhotoProtoActivity.r(b.a).setText(j1);
                        boolean flag1 = PhotoProtoActivity.r(b.a).hasText();
                        if (flag ^ flag1)
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(b.a, true);
                        }
                        if (flag1)
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(b.a, String.valueOf(PhotoProtoActivity.r(b.a).getText()));
                        }
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                b = _pcls28;
                a = g1;
                super();
            }
                }, k.a).a(new bolts.i(this) {

                    final _cls28 a;

                    public Void a(j j1)
                        throws Exception
                    {
                        if (j1.d())
                        {
                            com.cardinalblue.android.piccollage.a.f.a(j1.f());
                        }
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = _pcls28;
                super();
            }
                }, k.a);
                  goto _L5
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        };
    }

    private void N()
    {
        Object obj = getFragmentManager();
        if (k == null || !(k instanceof g) || ((FragmentManager) (obj)).findFragmentByTag("edit_border_fragment") != null)
        {
            return;
        }
        Object obj1 = (g)k;
        obj = new com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState();
        obj.b = ((g) (obj1)).c();
        obj.a = ((g) (obj1)).d();
        obj.c = com.cardinalblue.android.piccollage.view.g.a(this);
        obj1 = new ArrayList();
        Iterator iterator = B.t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            if (obj2 instanceof g)
            {
                obj2 = (g)obj2;
                com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState borderstate = new com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState();
                borderstate.b = ((g) (obj2)).c();
                borderstate.a = ((g) (obj2)).d();
                borderstate.c = com.cardinalblue.android.piccollage.view.g.a(this);
                ((ArrayList) (obj1)).add(borderstate);
            }
        } while (true);
        obj = EditBorderDialogFragment.a(((com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState) (obj)), ((ArrayList) (obj1)));
        getFragmentManager().beginTransaction().setCustomAnimations(0x7f04003c, 0x7f04003b).replace(0x7f1000cd, ((android.app.Fragment) (obj)), "edit_border_fragment").addToBackStack("edit_border_fragment").commitAllowingStateLoss();
    }

    private boolean O()
    {
        return false;
    }

    private void P()
    {
        com.cardinalblue.android.b.k.a(this, new Callable() {

            final PhotoProtoActivity a;

            public Void a()
                throws Exception
            {
                String s1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(a).j();
                Object obj = com.cardinalblue.android.b.k.c(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(a).w(), com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(a).v());
                obj = a.a(((Point) (obj)).x, ((Point) (obj)).y);
                com.cardinalblue.android.piccollage.controller.network.f.a(a, a.g(), com.cardinalblue.android.b.a.a(((Bitmap) (obj))), s1.toString().getBytes());
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        }, getString(0x7f070277)).a(new bolts.i() {

            final PhotoProtoActivity a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d() || j1.c())
                {
                    com.cardinalblue.android.b.k.a(a, 0x7f070134, 0);
                    j1 = j1.f();
                    if (j1 != null)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1);
                    }
                } else
                {
                    com.cardinalblue.android.piccollage.a.b.bl();
                    a.setResult(-1);
                    a.finish();
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
    }

    private String Q()
    {
        return (new StringBuilder()).append("assets://backgrounds/").append(W[X.nextInt(W.length)]).toString();
    }

    private String R()
    {
        Iterator iterator;
        List list = B.u();
        if (list == null)
        {
            return "unknown";
        }
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TagModel tagmodel = (TagModel)iterator.next();
        if (!tagmodel.isEchoTag()) goto _L4; else goto _L3
_L3:
        if (tagmodel == null)
        {
            return "unknown";
        }
        if (tagmodel.getOriginalCollageId().equals(tagmodel.getProgenitorCollageId()))
        {
            return "echo";
        } else
        {
            return "re-echo";
        }
_L2:
        tagmodel = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private int a(Exception exception)
    {
        int i1 = 0x7f070120;
        if (exception instanceof com.cardinalblue.android.piccollage.model.k.a)
        {
            if (((com.cardinalblue.android.piccollage.model.k.a)exception).a instanceof OutOfMemoryError)
            {
                i1 = 0x7f070203;
            }
        } else
        if (com.cardinalblue.android.b.k.f())
        {
            return 0x7f070204;
        }
        return i1;
    }

    private Intent a(int i1, String s1)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/StickersActivity);
        intent.putExtra("max_choices", i1);
        intent.putExtra("from", s1);
        intent.putExtra("key_memento", a);
        return intent;
    }

    static Intent a(PhotoProtoActivity photoprotoactivity, int i1, String s1)
    {
        return photoprotoactivity.a(i1, s1);
    }

    static View a(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.E;
    }

    static j a(PhotoProtoActivity photoprotoactivity, com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        return photoprotoactivity.a(k1, flag);
    }

    private j a(com.cardinalblue.android.piccollage.controller.g g1)
    {
        boolean flag;
        if (g1.j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return bolts.j.a(new Callable(g1, flag) {

            final com.cardinalblue.android.piccollage.controller.g a;
            final boolean b;
            final PhotoProtoActivity c;

            public File a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.c(c);
                if (com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c) != null && !com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).d())
                {
                    com.cardinalblue.android.b.k.a(c, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).p());
                }
                static class _cls40
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.values().length];
                        try
                        {
                            a[com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                com.cardinalblue.android.piccollage.activities._cls40.a[a.k.ordinal()];
                JVM INSTR tableswitch 1 2: default 84
            //                           1 175
            //                           2 266;
                   goto _L1 _L2 _L3
_L1:
                if (!b) goto _L5; else goto _L4
_L4:
                Object obj;
                obj = com.cardinalblue.android.b.k.c(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).w(), com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).v());
                obj = com.cardinalblue.android.piccollage.model.k.a(c.a(((Point) (obj)).x, ((Point) (obj)).y), "jpg");
                obj = com.cardinalblue.android.piccollage.a.j.a(c, ((File) (obj)), com.cardinalblue.android.b.k.s(), b);
_L10:
                if (obj == null) goto _L7; else goto _L6
_L6:
                File file = ((File) (obj));
                if (((File) (obj)).exists()) goto _L8; else goto _L7
_L7:
                throw new IOException("can't save file when capturing collage");
_L2:
                file = (new com.cardinalblue.android.piccollage.controller.h(a.a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c)).b(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).w(), com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).v()).a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).a()).a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).b()).a(com.cardinalblue.android.piccollage.model.k.a("gif")).a(c))).a();
_L8:
                return file;
_L3:
                return (new t(a.a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c)).b(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).w(), com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(c).v()).a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).a()).a(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).b()).a(com.cardinalblue.android.piccollage.model.k.a("mp4")).a(c))).a();
_L5:
                File file1 = com.cardinalblue.android.piccollage.model.k.a(c.a(a.b, a.c), "jpg");
                obj = file1;
                if (a.i)
                {
                    obj = com.cardinalblue.android.piccollage.a.j.a(c, file1, true, false);
                }
                if (true) goto _L10; else goto _L9
_L9:
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = PhotoProtoActivity.this;
                a = g1;
                b = flag;
                super();
            }
        });
    }

    private j a(com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        return g.b(k1).c(new bolts.i(flag) {

            final boolean a;
            final PhotoProtoActivity b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.k k2 = (com.cardinalblue.android.piccollage.view.k)j1.e();
                BaseScrapModel basescrapmodel = k2.D();
                if (a)
                {
                    k2.c(-1);
                    PhotoProtoActivity.q(b).a();
                }
                if (!com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).d((com.cardinalblue.android.piccollage.view.k)j1.e()))
                {
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).a("bring to front a scrap");
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).a(new ScrapUpdateOp(basescrapmodel, k2.D()));
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).d();
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.l(b);
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PhotoProtoActivity.this;
                a = flag;
                super();
            }
        }, j.b);
    }

    private j a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return bolts.j.a(new IllegalArgumentException("it doesn't contain any photo info"));
        }
        int i1 = B.w();
        int j1 = B.v();
        int k1 = list.size();
        List list1;
        bolts.j.a a1;
        ArrayList arraylist;
        boolean flag;
        if (h.n() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list1 = com.cardinalblue.android.piccollage.controller.m.a(i1, j1, k1, flag, l);
        ((PhotoInfo)list.get(0)).d();
        a1 = bolts.j.a();
        arraylist = new ArrayList();
        i1 = 0;
        while (i1 < list.size()) 
        {
            PointF pointf = (PointF)list1.get(i1);
            PhotoInfo photoinfo = (PhotoInfo)list.get(i1);
            try
            {
                arraylist.add(com.cardinalblue.android.piccollage.lib.a.e.a(photoinfo.b()).b(150).a(new bolts.i(photoinfo, pointf) {

                    final PhotoInfo a;
                    final PointF b;
                    final PhotoProtoActivity c;

                    public Void a(j j2)
                        throws Exception
                    {
                        Exception exception = j2.f();
                        if (exception == null)
                        {
                            try
                            {
                                j2 = com.cardinalblue.android.piccollage.view.h.a(c, (Bitmap)j2.e());
                                j2.b(a.a());
                                j2.b(true);
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).i(j2);
                                if (b != null)
                                {
                                    j2.d(b.x, b.y);
                                }
                                a.d();
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(c, j2);
                            }
                            // Misplaced declaration of an exception variable
                            catch (j j2)
                            {
                                com.cardinalblue.android.piccollage.a.f.a(j2);
                            }
                        } else
                        {
                            com.cardinalblue.android.piccollage.a.f.a(exception);
                            com.cardinalblue.android.b.k.a(c, 0x7f0701e0, 0);
                        }
                        return null;
                    }

                    public Object then(j j2)
                        throws Exception
                    {
                        return a(j2);
                    }

            
            {
                c = PhotoProtoActivity.this;
                a = photoinfo;
                b = pointf;
                super();
            }
                }, k.a));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(photoinfo.b()).append("]").toString()));
            }
            i1++;
        }
        bolts.j.a(arraylist).a(new bolts.i(a1) {

            final bolts.j.a a;
            final PhotoProtoActivity b;

            public Void a(j j2)
                throws Exception
            {
                if (j2.c())
                {
                    a.b();
                    return null;
                }
                if (j2.d())
                {
                    a.a(j2.f());
                    return null;
                } else
                {
                    a.a(j2.e());
                    return null;
                }
            }

            public Object then(j j2)
                throws Exception
            {
                return a(j2);
            }

            
            {
                b = PhotoProtoActivity.this;
                a = a1;
                super();
            }
        });
        return a1.a();
    }

    static com.cardinalblue.android.piccollage.view.k a(PhotoProtoActivity photoprotoactivity, Intent intent)
    {
        return photoprotoactivity.f(intent);
    }

    private ArrayList a(Intent intent, boolean flag)
    {
        if (flag)
        {
            return b(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
        }
        intent = (Uri)intent.getParcelableExtra("android.intent.extra.STREAM");
        if (intent != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(Uri.decode(intent.toString()));
            return arraylist;
        } else
        {
            return null;
        }
    }

    private void a(int i1, int j1, g g1, String s1)
    {
        if (!L())
        {
            com.cardinalblue.android.piccollage.a.b.y(s1);
            k = g1;
            if (o == null)
            {
                I();
            }
            if (!isFinishing())
            {
                try
                {
                    l.set(i1, j1);
                    o.a(i1, j1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (g g1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(g1);
                }
                return;
            }
        }
    }

    private void a(int i1, int j1, g g1, boolean flag, String s1)
    {
        if (L())
        {
            return;
        }
        com.cardinalblue.android.piccollage.a.b.y(s1);
        k = g1;
        d(g1);
        try
        {
            l.set(i1, j1);
            n.a(i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            com.cardinalblue.android.piccollage.a.f.a(g1);
        }
    }

    private void a(int i1, int j1, n n1)
    {
        if (!L())
        {
            k = n1;
            if (p == null)
            {
                H();
            }
            if (!isFinishing())
            {
                try
                {
                    l.set(i1, j1);
                    p.a(i1, j1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (n n1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(n1);
                }
                return;
            }
        }
    }

    private void a(Intent intent)
        throws IllegalArgumentException, JSONException
    {
        Bundle bundle;
        String s1;
        bundle = intent.getExtras();
        s1 = intent.getAction();
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        if ("com.cardinalblue.piccollage.action.template".equals(s1))
        {
            B = Collage.a(((AbstractCollage)bundle.getParcelable("extra_collage")).j(), com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5);
            if (B.g() == null)
            {
                g g1 = Collage.d("assets://backgrounds/default.png");
                if (g1 != null)
                {
                    B.t().add(g1);
                }
            }
        } else
        if (bundle.containsKey("extra_collage"))
        {
            B = (AbstractCollage)bundle.getParcelable("extra_collage");
        } else
        {
            B = Collage.a(com.cardinalblue.android.b.k.j().getBoolean("pref_is_last_square_canvas", false));
            g g2 = Collage.d("assets://backgrounds/default.png");
            B.t().add(g2);
        }
        B.a(new com.cardinalblue.android.piccollage.model.AbstractCollage.a() {

            final PhotoProtoActivity a;

            public void a(AbstractCollage abstractcollage)
            {
                a.a(true);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, true);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        if (!"com.cardinalblue.piccollage.action.echo".equals(s1)) goto _L2; else goto _L1
_L1:
        b = 1;
        a(bundle);
_L4:
        t = bundle.getBoolean("saved_is_wording_showed", false);
        r = B.d();
        c = bundle.getString("extra_start_from");
        if (TextUtils.isEmpty(c))
        {
            c = "unknown";
        }
        return;
_L2:
        if ("com.cardinalblue.piccollage.action.stickerstore".equals(s1))
        {
            b = 0;
            b(bundle);
        } else
        if ("com.cardinalblue.piccollage.action.template".equals(s1))
        {
            b = 0;
        } else
        if ("com.cardinalblue.piccollage.action.compose".equals(s1))
        {
            b = 0;
            if (intent.hasExtra("extra_photobox_product_id"))
            {
                e = bundle.getString("extra_photobox_product_id");
            }
        } else
        if ("com.cardinalblue.piccollage.action.share".equals(s1))
        {
            b = 0;
            com.cardinalblue.android.piccollage.a.b.aO("save or share");
            a(new int[] {
                30000, 30001
            });
            bolts.j.a(new Callable() {

                final PhotoProtoActivity a;

                public Void a()
                    throws Exception
                {
                    a.a();
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
            }, j.b);
        } else
        {
            b = 0;
            a(intent, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Intent intent, int i1)
    {
        try
        {
            startActivityForResult(intent, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0701e1, 0);
        }
    }

    private void a(Intent intent, String s1)
    {
        Object obj = intent.getType();
        if (obj == null || !((String) (obj)).startsWith("image/"))
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException("Does not support non-image data"));
            finish();
            return;
        }
        obj = null;
        if ("android.intent.action.SEND".equals(s1))
        {
            obj = a(intent, false);
        }
        if ("android.intent.action.SEND_MULTIPLE".equals(s1))
        {
            obj = a(intent, true);
        }
        intent = y.obtainMessage(1);
        intent.obj = obj;
        y.sendMessage(intent);
    }

    private void a(Uri uri)
    {
        b("open");
        Intent intent = new Intent(this, com/aviary/android/feather/sdk/FeatherActivity);
        intent.setData(uri);
        intent.putExtra("output-format", android.graphics.Bitmap.CompressFormat.PNG.name());
        intent.putExtra("extra-api-key-secret", getString(0x7f070313));
        intent.putExtra("tools-list", U);
        intent.putExtra("output-hires-megapixels", com.aviary.android.feather.headless.utils.a.f.ordinal());
        k.N();
        startActivityForResult(intent, 10);
    }

    private void a(Bundle bundle)
        throws IllegalArgumentException, JSONException
    {
        d = bundle.getString("extra_echoed_collage_id");
        if (TextUtils.isEmpty(d))
        {
            throw new IllegalArgumentException("No target collage to echo");
        }
        bundle = bundle.getString("extra_echo_template");
        if (TextUtils.isEmpty(bundle))
        {
            throw new IllegalArgumentException("No template for echo");
        } else
        {
            B = ServerCollage.d(bundle);
            return;
        }
    }

    private void a(View view)
    {
        if (!L())
        {
            if (C())
            {
                D();
            }
            if (!isFinishing())
            {
                try
                {
                    com.cardinalblue.android.piccollage.a.b.aw();
                    l.set(B.w() / 2, B.v() / 2);
                    m.b(view);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    com.cardinalblue.android.piccollage.a.f.a(view);
                }
                return;
            }
        }
    }

    static void a(PhotoProtoActivity photoprotoactivity, int i1)
    {
        photoprotoactivity.e(i1);
    }

    static void a(PhotoProtoActivity photoprotoactivity, Intent intent, int i1)
    {
        photoprotoactivity.a(intent, i1);
    }

    static void a(PhotoProtoActivity photoprotoactivity, Uri uri)
    {
        photoprotoactivity.a(uri);
    }

    static void a(PhotoProtoActivity photoprotoactivity, View view)
    {
        photoprotoactivity.a(view);
    }

    static void a(PhotoProtoActivity photoprotoactivity, g g1)
    {
        photoprotoactivity.b(g1);
    }

    static void a(PhotoProtoActivity photoprotoactivity, com.cardinalblue.android.piccollage.view.k k1)
    {
        photoprotoactivity.c(k1);
    }

    static void a(PhotoProtoActivity photoprotoactivity, Exception exception)
    {
        photoprotoactivity.c(exception);
    }

    static void a(PhotoProtoActivity photoprotoactivity, String s1)
    {
        photoprotoactivity.f(s1);
    }

    static void a(PhotoProtoActivity photoprotoactivity, ArrayList arraylist)
    {
        photoprotoactivity.a(arraylist);
    }

    private void a(com.cardinalblue.android.piccollage.controller.a.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (T != null && T.getStatus() == android.os.AsyncTask.Status.RUNNING && T != b1)
        {
            T.cancel(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    private void a(com.cardinalblue.android.piccollage.controller.a.b b1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        a(b1);
        if (b1.getStatus() == android.os.AsyncTask.Status.PENDING)
        {
            b1.a(new Intent[] {
                intent
            });
            T = b1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    private void a(TextFormatModel textformatmodel)
    {
        getSharedPreferences("cardinalblue_3", 0).edit().putInt("text_color", textformatmodel.getTextColor()).putInt("text_background_color", textformatmodel.getTextBackgroundColor()).putInt("text_outline_color", textformatmodel.getTextBorderColor()).putString("text_font", textformatmodel.getFont().getFontName()).putBoolean("text_outline_enabled", textformatmodel.hasTextBorder()).apply();
    }

    private void a(com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a a1)
    {
        Object obj = B.s();
        a1.a = ((com.cardinalblue.android.piccollage.model.d) (obj)).toString();
        a1.b = ((com.cardinalblue.android.piccollage.model.d) (obj)).e();
        obj = B.t().iterator();
        int i1 = 0;
        do
        {
            com.cardinalblue.android.piccollage.view.k k1;
label0:
            {
                if (((Iterator) (obj)).hasNext())
                {
                    k1 = (com.cardinalblue.android.piccollage.view.k)((Iterator) (obj)).next();
                    if (i1 < a1.a())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (k1.a())
            {
                a1.c[i1] = i1;
                a1.d[i1] = k1.K();
                a1.e[i1] = k1.L();
                a1.g[i1] = k1.P();
                a1.f[i1] = k1.Q();
                a1.h[i1] = k1.t();
                a1.i[i1] = k1.S();
                k1.g(i1);
                i1++;
            }
        } while (true);
    }

    private void a(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent, String s1)
    {
        if (!(k1 instanceof g)) goto _L2; else goto _L1
_L1:
        k1 = (g)k1;
        if (!k1.g()) goto _L4; else goto _L3
_L3:
        com.cardinalblue.android.b.k.a(this, 0x7f07010d, 0);
_L6:
        return;
_L4:
        if (k1 instanceof l)
        {
            a((int)motionevent.getX(), (int)motionevent.getY(), ((g) (k1)), s1);
            return;
        }
        if (!(k1 instanceof com.cardinalblue.android.piccollage.view.c))
        {
            boolean flag = k1.a();
            a((int)motionevent.getX(), (int)motionevent.getY(), ((g) (k1)), flag, s1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (k1 instanceof n)
        {
            a((int)motionevent.getX(), (int)motionevent.getY(), (n)k1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(n n1, Intent intent)
    {
        intent = (TextScrapModel)intent.getParcelableExtra("text_model");
        B.b(intent.getText().getText());
        TextScrapModel textscrapmodel = n1.k();
        n1.a(intent);
        n1.j();
        n1.G();
        a(intent.getText().getTextFormat());
        Y.a("change text scrap");
        Y.a(new ScrapUpdateOp(textscrapmodel, n1.k()));
        Y.d();
        l();
        B.c();
        h.h();
    }

    private void a(o o1)
    {
        if (b == 1)
        {
            com.cardinalblue.android.piccollage.a.b.m("video", "echo_collage_editor");
        } else
        {
            com.cardinalblue.android.piccollage.a.b.m("video", "main_collage_editor");
        }
        if (!com.cardinalblue.android.b.k.b(this))
        {
            com.cardinalblue.android.b.k.a(this, 0x7f07021d, 1);
            return;
        }
        Object obj = (u)h.b(o1);
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            try
            {
                o1 = Uri.parse(((o)((u) (obj)).j()).ag()).getLastPathSegment();
            }
            // Misplaced declaration of an exception variable
            catch (o o1)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException((new StringBuilder()).append("Cannot parse video id for ").append(((o)((u) (obj)).j()).toString()).toString()));
                o1 = null;
            }
            if (!TextUtils.isEmpty(o1))
            {
                if (com.google.android.youtube.player.c.a(this))
                {
                    o1 = com.google.android.youtube.player.c.a(this, o1);
                } else
                {
                    obj = new Intent("android.intent.action.VIEW");
                    ((Intent) (obj)).setData(Uri.parse(String.format("https://www.youtube.com/watch?v=%s", new Object[] {
                        o1
                    })));
                    o1 = ((o) (obj));
                }
            } else
            {
                o1 = new Intent("android.intent.action.VIEW");
                o1.setData(Uri.parse(((u) (obj)).a()));
            }
            startActivity(o1);
            return;
        }
        if (TextUtils.isEmpty(((u) (obj)).a()))
        {
            o1 = new Intent(this, com/cardinalblue/android/piccollage/activities/VideoScrapPreviewActivity);
            o1.putExtra("extra_video_base_url", ((u) (obj)).f());
            o1.putExtra("extra_video_html_data", ((u) (obj)).e());
            startActivity(o1);
            return;
        } else
        {
            o1 = ((u) (obj)).a();
            bolts.j.a(new Callable(o1) {

                final String a;
                final PhotoProtoActivity b;

                public Integer a()
                    throws Exception
                {
                    HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(a)).openConnection();
                    httpurlconnection.setRequestMethod("GET");
                    httpurlconnection.setDoInput(true);
                    httpurlconnection.connect();
                    return Integer.valueOf(httpurlconnection.getResponseCode());
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                b = PhotoProtoActivity.this;
                a = s1;
                super();
            }
            }).c(new bolts.i(o1) {

                final String a;
                final PhotoProtoActivity b;

                public Object then(j j1)
                    throws Exception
                {
                    if (b.isFinishing())
                    {
                        return null;
                    }
                    if (((Integer)j1.e()).intValue() == 403)
                    {
                        com.cardinalblue.android.b.k.a(b, 0x7f0702bf, 0);
                        return null;
                    } else
                    {
                        j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/VideoScrapPreviewActivity);
                        j1.putExtra("extra_video_stream_url", a);
                        b.startActivity(j1);
                        return null;
                    }
                }

            
            {
                b = PhotoProtoActivity.this;
                a = s1;
                super();
            }
            }, k.a);
            return;
        }
    }

    private void a(String s1)
    {
        com.cardinalblue.android.piccollage.a.b.K(s1);
    }

    private void a(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() == 0)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException("No data from intent via share"));
            com.cardinalblue.android.b.k.a(this, 0x7f07013c, 1);
            return;
        } else
        {
            bolts.j.a(new Callable(arraylist) {

                final ArrayList a;
                final PhotoProtoActivity b;

                public Object call()
                    throws Exception
                {
                    int j1 = Math.min(a.size(), 30);
                    int i1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(b).w();
                    int k1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.d(b).v();
                    List list;
                    boolean flag;
                    if (com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).n() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    list = com.cardinalblue.android.piccollage.controller.m.a(i1, k1, j1, flag, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.f(b));
                    i1 = 0;
                    while (i1 < j1) 
                    {
                        PointF pointf = (PointF)list.get(i1);
                        String s1 = (String)a.get(i1);
                        try
                        {
                            com.cardinalblue.android.piccollage.lib.a.e.a(s1).b(150).a(new bolts.i(this, s1, pointf) {

                                final String a;
                                final PointF b;
                                final _cls42 c;

                                public Void a(j j1)
                                    throws Exception
                                {
                                    Exception exception = j1.f();
                                    if (exception == null && j1.e() != null)
                                    {
                                        try
                                        {
                                            j1 = com.cardinalblue.android.piccollage.view.g.a(c.b, (Bitmap)j1.e());
                                            j1.b(a);
                                            j1.b(true);
                                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c.b).i(j1);
                                            if (b != null)
                                            {
                                                j1.d(b.x, b.y);
                                            }
                                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(c.b, j1);
                                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.g(c.b);
                                        }
                                        // Misplaced declaration of an exception variable
                                        catch (j j1)
                                        {
                                            com.cardinalblue.android.piccollage.a.f.a(j1);
                                        }
                                    } else
                                    {
                                        com.cardinalblue.android.piccollage.a.f.a(exception);
                                        com.cardinalblue.android.b.k.a(c.b, 0x7f0701e0, 0);
                                    }
                                    return null;
                                }

                                public Object then(j j1)
                                    throws Exception
                                {
                                    return a(j1);
                                }

            
            {
                c = _pcls42;
                a = s1;
                b = pointf;
                super();
            }
                            }, k.a);
                        }
                        catch (IllegalArgumentException illegalargumentexception)
                        {
                            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(s1).append("]").toString()));
                        }
                        i1++;
                    }
                    if (a.size() > 30)
                    {
                        com.cardinalblue.android.b.k.a(b, b.getString(0x7f0702a4, new Object[] {
                            Integer.valueOf(30)
                        }), 0);
                    }
                    return null;
                }

            
            {
                b = PhotoProtoActivity.this;
                a = arraylist;
                super();
            }
            }, k.a);
            return;
        }
    }

    private void a(ArrayList arraylist, String s1)
    {
        int i1 = B.w();
        int j1 = B.v();
        int k1 = arraylist.size();
        List list;
        boolean flag;
        if (h.n() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list = com.cardinalblue.android.piccollage.controller.m.a(i1, j1, k1, flag, l);
        i1 = 0;
        while (i1 < arraylist.size()) 
        {
            PointF pointf = (PointF)list.get(i1);
            WebPhoto webphoto = (WebPhoto)arraylist.get(i1);
            try
            {
                com.cardinalblue.android.piccollage.lib.a.e.a(webphoto.getThumbnailImageUrl()).b(150).a(new bolts.i(webphoto, s1, pointf) {

                    final WebPhoto a;
                    final String b;
                    final PointF c;
                    final PhotoProtoActivity d;

                    public Void a(j j2)
                        throws Exception
                    {
                        Object obj = j2.f();
                        if (obj == null)
                        {
                            obj = a.getOriginalImageUrl();
                            String s2 = a.getPageUrl();
                            try
                            {
                                j2 = com.cardinalblue.android.piccollage.view.h.a(d, (Bitmap)j2.e());
                                j2.b(((String) (obj)));
                                j2.b(true);
                                j2.a(b, ((String) (obj)), s2);
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(d).i(j2);
                                if (c != null)
                                {
                                    j2.d(c.x, c.y);
                                }
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(d, j2);
                            }
                            // Misplaced declaration of an exception variable
                            catch (j j2)
                            {
                                com.cardinalblue.android.piccollage.a.f.a(j2);
                            }
                        } else
                        {
                            com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
                            com.cardinalblue.android.b.k.a(d, 0x7f0701e0, 0);
                        }
                        return null;
                    }

                    public Object then(j j2)
                        throws Exception
                    {
                        return a(j2);
                    }

            
            {
                d = PhotoProtoActivity.this;
                a = webphoto;
                b = s1;
                c = pointf;
                super();
            }
                }, k.a);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(webphoto.getThumbnailImageUrl()).append("]").toString()));
            }
            i1++;
        }
    }

    private void a(List list, String s1)
    {
        int i1 = B.w();
        int j1 = B.v();
        int k1 = list.size();
        List list1;
        boolean flag;
        if (h.n() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list1 = com.cardinalblue.android.piccollage.controller.m.a(i1, j1, k1, flag, l);
        i1 = 0;
        while (i1 < list.size()) 
        {
            com.cardinalblue.android.piccollage.a.b.aJ();
            PointF pointf = (PointF)list1.get(i1);
            CBYoutubeData cbyoutubedata = (CBYoutubeData)list.get(i1);
            try
            {
                com.cardinalblue.android.piccollage.lib.a.e.a(cbyoutubedata.getVideoThumbUrlMedium()).b(com.cardinalblue.android.piccollage.controller.f.b).a(new bolts.i(cbyoutubedata, s1, pointf) {

                    final CBYoutubeData a;
                    final String b;
                    final PointF c;
                    final PhotoProtoActivity d;

                    public Void a(j j2)
                        throws Exception
                    {
                        Exception exception = j2.f();
                        if (exception == null)
                        {
                            j2 = com.cardinalblue.android.piccollage.view.o.c((Bitmap)j2.e());
                            j2.a(a);
                            j2.c(b);
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(d).i(j2);
                            if (c != null)
                            {
                                j2.d(c.x, c.y);
                            }
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(d, j2);
                        } else
                        {
                            com.cardinalblue.android.piccollage.a.f.a(exception);
                            com.cardinalblue.android.b.k.a(d, 0x7f0701e0, 0);
                        }
                        return null;
                    }

                    public Object then(j j2)
                        throws Exception
                    {
                        return a(j2);
                    }

            
            {
                d = PhotoProtoActivity.this;
                a = cbyoutubedata;
                b = s1;
                c = pointf;
                super();
            }
                }, k.a);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(cbyoutubedata.getVideoThumbUrlDefault()).append("]").toString()));
            }
            i1++;
        }
    }

    private static void a(net.a.a.c c1)
    {
        if (c1 != null)
        {
            c1.a(0L);
        }
    }

    private transient void a(int ai[])
    {
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        if (notificationmanager != null)
        {
            int j1 = ai.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                notificationmanager.cancel(ai[i1]);
            }

        }
    }

    private boolean a(int i1, j j1)
    {
        i1;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if (s)
        {
            s = false;
            if (j1 != null)
            {
                j1.a(new bolts.i() {

                    final PhotoProtoActivity a;

                    public Object then(j j2)
                        throws Exception
                    {
                        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, 501);
                        return null;
                    }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
                }, j.b);
            } else
            {
                e(501);
            }
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static boolean a(View view, float f1, float f2, float f3)
    {
        return f1 >= -f3 && f2 >= -f3 && f1 < (float)(view.getRight() - view.getLeft()) + f3 && f2 < (float)(view.getBottom() - view.getTop()) + f3;
    }

    static boolean a(PhotoProtoActivity photoprotoactivity, boolean flag)
    {
        photoprotoactivity.P = flag;
        return flag;
    }

    private boolean a(com.cardinalblue.android.piccollage.view.k k1, float f1, float f2)
    {
        if (k1 != null)
        {
            int i1 = i.getLeft();
            int j1 = i.getWidth() / 2;
            int l1 = i.getHeight() / 2;
            if (Math.abs(f1 - (float)(i1 + j1)) < (float)(i.getWidth() / 2) && Math.abs(f2 - (float)l1) < (float)(i.getHeight() / 2))
            {
                return true;
            }
        }
        return false;
    }

    private boolean a(String s1, UndoManager undomanager)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = TextUtils.isEmpty(s1);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (h.a(d(s1), undomanager))
        {
            bolts.j.a(new Callable() {

                final PhotoProtoActivity a;

                public Object call()
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.CollageController.UpdateTapAnywhereEvent(false));
                    return null;
                }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
            }, k.a);
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
        s1;
        com.cardinalblue.android.piccollage.a.f.a(s1);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    static Handler b(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.y;
    }

    private ArrayList b(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() == 0)
        {
            return null;
        }
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            Uri uri = (Uri)arraylist.next();
            if (uri != null)
            {
                arraylist1.add(Uri.decode(uri.toString()));
            }
        } while (true);
        return arraylist1;
    }

    private void b(int i1, int j1)
    {
        if (!L())
        {
            if (C())
            {
                D();
            }
            if (!isFinishing())
            {
                try
                {
                    com.cardinalblue.android.piccollage.a.b.aw();
                    l.set(i1, j1);
                    m.a(i1, j1);
                    return;
                }
                catch (android.view.WindowManager.BadTokenException badtokenexception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(badtokenexception);
                }
                return;
            }
        }
    }

    private void b(Intent intent)
    {
        b("finish");
        break MISSING_BLOCK_LABEL_7;
        for (; intent == null; intent = intent.getData())
        {
            do
            {
                return;
            } while (intent == null || k == null || !(k instanceof g) || !intent.getBooleanExtra("bitmap-changed", false));
        }

        if (TextUtils.isEmpty(intent.getScheme()))
        {
            intent = Uri.parse(com.cardinalblue.android.piccollage.lib.e.a.c.b(intent.toString()));
        }
        g g1 = (g)k;
        ImageScrapModel imagescrapmodel = g1.y();
        g1.a(intent.toString());
        B.c();
        intent = h.b(g1);
        Y.a("add effect");
        Y.a(new ScrapUpdateOp(imagescrapmodel, g1.y()));
        Y.d();
        l();
        if (intent instanceof i)
        {
            ((i)intent).a(true);
        }
        k = null;
        System.gc();
        return;
        intent;
        com.cardinalblue.android.piccollage.a.f.a(intent);
        System.gc();
        return;
        intent;
        System.gc();
        throw intent;
    }

    private void b(Bundle bundle)
    {
        String s1 = bundle.getString("extra_sticker_bundle");
        if (!TextUtils.isEmpty(s1))
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("key_last_bundle_id", s1);
            a = new BaseMemento(bundle1);
        }
        com.cardinalblue.android.piccollage.model.StickerBundle stickerbundle = com.cardinalblue.android.piccollage.controller.o.a().a(s1);
        j j1 = bolts.j.a(null);
        if (stickerbundle == null)
        {
            j1 = com.cardinalblue.android.piccollage.controller.o.a().p();
        }
        j1.a(new bolts.i(bundle, s1) {

            final Bundle a;
            final String b;
            final PhotoProtoActivity c;

            public Void a(j j2)
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(c).post(new Runnable(this) {

                    final _cls43 a;

                    public void run()
                    {
                        Intent intent = new Intent(a.c, com/cardinalblue/android/piccollage/activities/StickersActivity);
                        intent.setAction("com.cardinalblue.sticker.moveto");
                        intent.putExtra("max_choices", 30);
                        intent.putExtra("from", com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.h(a.c));
                        intent.putExtra("key_memento", a.c.a);
                        boolean flag = a.a.getBoolean("extra_from_iap", false);
                        if (flag)
                        {
                            intent.putExtra("key_purchase_bundle", a.b);
                        }
                        PhotoProtoActivity photoprotoactivity = a.c;
                        byte byte0;
                        if (flag)
                        {
                            byte0 = 7;
                        } else
                        {
                            byte0 = 3;
                        }
                        photoprotoactivity.startActivityForResult(intent, byte0);
                    }

            
            {
                a = _pcls43;
                super();
            }
                });
                return null;
            }

            public Object then(j j2)
                throws Exception
            {
                return a(j2);
            }

            
            {
                c = PhotoProtoActivity.this;
                a = bundle;
                b = s1;
                super();
            }
        }, k.a);
    }

    static void b(PhotoProtoActivity photoprotoactivity, g g1)
    {
        photoprotoactivity.c(g1);
    }

    static void b(PhotoProtoActivity photoprotoactivity, Exception exception)
    {
        photoprotoactivity.b(exception);
    }

    static void b(PhotoProtoActivity photoprotoactivity, String s1)
    {
        photoprotoactivity.g(s1);
    }

    private void b(com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a a1)
    {
        h.a(a1.a);
        for (int i1 = 0; i1 < B.t().size(); i1++)
        {
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)B.t().get(i1);
            if (!k1.a())
            {
                continue;
            }
            for (int j1 = 0; j1 < a1.c.length; j1++)
            {
                if ((long)k1.V() == a1.c[j1])
                {
                    float f1 = (a1.i[j1] * a1.g[j1]) / (float)k1.S();
                    k1.a(a1.d[j1], a1.e[j1], f1, a1.f[j1]);
                    k1.c(a1.h[j1]);
                    bolts.j.a(new Callable(k1) {

                        final com.cardinalblue.android.piccollage.view.k a;
                        final PhotoProtoActivity b;

                        public Void a()
                            throws Exception
                        {
                            com.cardinalblue.android.piccollage.view.k k2 = a;
                            k2;
                            JVM INSTR monitorenter ;
_L3:
                            boolean flag = a.I();
                            if (!flag) goto _L2; else goto _L1
_L1:
                            Exception exception;
                            try
                            {
                                a.wait(10L);
                            }
                            catch (InterruptedException interruptedexception) { }
                            finally { }
                            if (true) goto _L3; else goto _L2
_L2:
                            k2;
                            JVM INSTR monitorexit ;
                            return null;
                            k2;
                            JVM INSTR monitorexit ;
                            throw exception;
                        }

                        public Object call()
                            throws Exception
                        {
                            return a();
                        }

            
            {
                b = PhotoProtoActivity.this;
                a = k1;
                super();
            }
                    }).a(new bolts.i(k1) {

                        final com.cardinalblue.android.piccollage.view.k a;
                        final PhotoProtoActivity b;

                        public Void a(j j2)
                            throws Exception
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).e(a);
                            return null;
                        }

                        public Object then(j j2)
                            throws Exception
                        {
                            return a(j2);
                        }

            
            {
                b = PhotoProtoActivity.this;
                a = k1;
                super();
            }
                    }, j.b);
                }
            }

        }

        g.postInvalidate();
    }

    private void b(g g1)
    {
        k = g1;
        com.cardinalblue.android.b.k.a(this, new Callable(g1) {

            final g a;
            final PhotoProtoActivity b;

            public Uri a()
                throws Exception
            {
                if (!a.h())
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).h(a);
                }
                Object obj = com.cardinalblue.android.piccollage.lib.e.a.a(a.i());
                if (obj == com.cardinalblue.android.piccollage.lib.e.a.a || obj == com.cardinalblue.android.piccollage.lib.e.a.b)
                {
                    obj = com.cardinalblue.android.piccollage.lib.i.a(b).a(a.i());
                    if (obj != null)
                    {
                        return Uri.fromFile(com.cardinalblue.android.piccollage.model.k.a(BitmapFactory.decodeByteArray(((com.android.volley.b.a) (obj)).a, 0, ((com.android.volley.b.a) (obj)).a.length), "png"));
                    } else
                    {
                        return Uri.fromFile(a.k());
                    }
                }
                obj = a.i();
                if (com.cardinalblue.android.piccollage.lib.e.a.a(((String) (obj))) == com.cardinalblue.android.piccollage.lib.e.a.i)
                {
                    return Uri.parse(com.cardinalblue.android.piccollage.controller.network.f.c(((String) (obj)), -1));
                } else
                {
                    return Uri.parse(((String) (obj)));
                }
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PhotoProtoActivity.this;
                a = g1;
                super();
            }
        }, getString(0x7f0701fa)).c(new bolts.i() {

            final PhotoProtoActivity a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, (Uri)j1.e());
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        }, k.a).a(new bolts.i() {

            final PhotoProtoActivity a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    com.cardinalblue.android.b.k.a(a, 0x7f0700d4, 0);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        }, k.a);
    }

    private void b(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (k1.Z() || k1.aa() || !k1.b())
        {
            return;
        } else
        {
            k1.v();
            float f1 = (i.getLeft() + i.getRight()) / 2;
            float f2 = (i.getTop() + i.getBottom()) / 2;
            float f3 = g.getTop();
            (new com.cardinalblue.android.piccollage.view.b.c(k1, g, f1, f2 - f3, i.getWidth(), i.getHeight()) {

                final PhotoProtoActivity a;

                public void a()
                {
                    super.a();
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).a("remove scrap");
                    BaseScrapModel basescrapmodel = f.D();
                    f.b(basescrapmodel);
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).a(new RemoveScrapOp(basescrapmodel));
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).d();
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.l(a);
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(a).a(f);
                    com.cardinalblue.android.piccollage.a.b.ak();
                }

            
            {
                a = PhotoProtoActivity.this;
                super(k1, view, f1, f2, f3, f4);
            }
            }).d();
            return;
        }
    }

    private void b(Exception exception)
    {
        int i1 = a(exception);
        exception = (new android.app.AlertDialog.Builder(this)).setTitle(0x1040014).setMessage(i1).create();
        exception.setButton(-1, getString(0x7f070249), new android.content.DialogInterface.OnClickListener() {

            final PhotoProtoActivity a;

            public void onClick(DialogInterface dialoginterface, int j1)
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.m(a);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        exception.setButton(-2, getString(0x7f07012d), new android.content.DialogInterface.OnClickListener() {

            final PhotoProtoActivity a;

            public void onClick(DialogInterface dialoginterface, int j1)
            {
                a.finish();
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        exception.setButton(-3, getString(0x7f0701c5), new android.content.DialogInterface.OnClickListener() {

            final PhotoProtoActivity a;

            public void onClick(DialogInterface dialoginterface, int j1)
            {
                com.cardinalblue.android.piccollage.a.i.b(a);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        com.cardinalblue.android.b.k.b(this, exception);
    }

    private void b(String s1)
    {
        com.cardinalblue.android.piccollage.a.b.A(s1);
    }

    static boolean b(PhotoProtoActivity photoprotoactivity, boolean flag)
    {
        photoprotoactivity.R = flag;
        return flag;
    }

    private void c(Intent intent)
    {
        a("kddi");
        com.cardinalblue.android.piccollage.a.b.aK();
        a(new com.cardinalblue.android.piccollage.controller.a.i(g, com.cardinalblue.android.piccollage.model.j.a(this), h), intent);
    }

    private void c(Bundle bundle)
    {
        b = bundle.getInt("extra_editor_mode", 0);
        B = (AbstractCollage)bundle.getParcelable("extra_collage");
        B.a(new com.cardinalblue.android.piccollage.model.AbstractCollage.a() {

            final PhotoProtoActivity a;

            public void a(AbstractCollage abstractcollage)
            {
                a.a(true);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, true);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        t = bundle.getBoolean("saved_is_wording_showed", false);
        r = bundle.getBoolean("saved_is_new_collage", false);
        s = bundle.getBoolean("saved_is_frame_picker_showed", false);
        u = bundle.getBoolean("saved_is_show_adder_menu", false);
        f = bundle.getBoolean("saved_first_entered_editor", false);
        a(bundle.getBoolean("saved_show_leave_editor_dialog", false));
        P = bundle.getBoolean("saved_edited_already", false);
        d = bundle.getString("saved_echoed_collage_id");
        e = bundle.getString("saved_photobox_product_id");
        S = bundle.getBoolean("saved_flag_handle_editor_action", false);
        String s1 = bundle.getString("saved_echo_text_scrap_model");
        int i1;
        if (!TextUtils.isEmpty(s1))
        {
            try
            {
                V = new JSONObject(s1);
            }
            catch (JSONException jsonexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(jsonexception);
            }
        }
        c = bundle.getString("extra_start_from");
        if (TextUtils.isEmpty(c))
        {
            c = "unknown";
        }
        z = (com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a)bundle.getSerializable("saved_frame_state");
        i1 = bundle.getInt("saved_selected_scrap_idx", -1);
        if (i1 != -1 && B.t().size() > i1)
        {
            k = (com.cardinalblue.android.piccollage.view.k)B.t().get(i1);
        }
    }

    private void c(g g1)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/ClipActivity);
        intent.putExtra("clip_image_path", g1.k().getPath());
        intent.putExtra("clip_points", g1.r());
        a(intent, 13);
    }

    private void c(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            Y.a("add scrap");
            Y.a(new AddScrapOp(k1.D()));
            Y.d();
            l();
            h.a(k1, true);
            return;
        }
    }

    private void c(Exception exception)
    {
        com.cardinalblue.android.b.k.a(this, L);
        if (exception != null)
        {
            d(exception);
        }
        if (b == 1)
        {
            x.setVisibility(0);
            if (B.g() == null && a(Q(), Y))
            {
                l();
            }
            try
            {
                i(((ServerCollage)B).n());
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                com.cardinalblue.android.piccollage.a.f.a(exception);
            }
        }
        if (!j())
        {
            B.k();
        }
        if (!B.d() && B.t().isEmpty())
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException((new StringBuilder()).append("can't load any scrap : ").append(B.toString()).toString()));
        }
        if (f && r)
        {
            f = false;
            if (getIntent().getBooleanExtra("extra_open_sticker_picker", false))
            {
                startActivityForResult(a(30, "gallery"), 3);
            } else
            {
                if (getIntent().getBooleanExtra("extra_grid_flow", false))
                {
                    s = true;
                    startActivityForResult(F(), 0);
                    return;
                }
                if (getIntent().getBooleanExtra("extra_open_photo_picker", false))
                {
                    if (getIntent().hasExtra("key_notification_id"))
                    {
                        com.cardinalblue.android.piccollage.a.b.cd();
                    }
                    u = true;
                    startActivityForResult(F(), 0);
                    return;
                }
                if ("com.cardinalblue.piccollage.action.compose".equals(getIntent().getAction()))
                {
                    if (!com.cardinalblue.android.b.k.j().getBoolean("pref_help_overlay_showed", false))
                    {
                        A();
                        com.cardinalblue.android.b.k.j().edit().putBoolean("pref_help_overlay_showed", true).apply();
                        u = true;
                        return;
                    } else
                    {
                        a(findViewById(0x7f1000cb));
                        return;
                    }
                }
                if ("com.cardinalblue.piccollage.action.template".equals(getIntent().getAction()))
                {
                    if (!com.cardinalblue.android.b.k.j().getBoolean("pref_help_overlay_showed", false))
                    {
                        A();
                        com.cardinalblue.android.b.k.j().edit().putBoolean("pref_help_overlay_showed", true).apply();
                        u = true;
                        return;
                    } else
                    {
                        a(findViewById(0x7f1000cb));
                        return;
                    }
                }
            }
        }
    }

    private void c(String s1)
    {
        if (a(s1, ((UndoManager) (null))))
        {
            com.cardinalblue.android.piccollage.a.b.u(s1);
        }
    }

    private boolean c(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if (u)
        {
            u = false;
            a(findViewById(0x7f1000cb));
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static boolean c(PhotoProtoActivity photoprotoactivity)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        return photoprotoactivity.v();
    }

    static AbstractCollage d(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.B;
    }

    private g d(String s1)
        throws IOException, OutOfMemoryError
    {
        Object obj = com.cardinalblue.android.piccollage.lib.a.e.a(s1);
        obj = com.cardinalblue.android.piccollage.view.h.a(g.getContext(), ((com.cardinalblue.android.piccollage.lib.a) (obj)).a(1024), com.cardinalblue.android.piccollage.view.h.a.b);
        h.i(((com.cardinalblue.android.piccollage.view.k) (obj)));
        ((g) (obj)).b(s1);
        ((g) (obj)).c(true);
        return ((g) (obj));
    }

    private void d(Intent intent)
    {
        ArrayList arraylist = intent.getParcelableArrayListExtra("stickers");
        a = (BaseMemento)intent.getParcelableExtra("key_memento");
        if (arraylist != null && arraylist.size() != 0)
        {
            int i1 = B.w();
            int j1 = B.v();
            int k1 = arraylist.size();
            boolean flag;
            if (h.n() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent = com.cardinalblue.android.piccollage.controller.m.a(i1, j1, k1, flag, l);
            i1 = 0;
            while (i1 < arraylist.size()) 
            {
                Sticker sticker = (Sticker)arraylist.get(i1);
                PointF pointf = (PointF)intent.get(i1);
                String s1 = sticker.getImgSubpath();
                com.cardinalblue.android.piccollage.a.b.M(e(s1));
                com.cardinalblue.android.piccollage.a.b.N(sticker.getBundleId());
                try
                {
                    com.cardinalblue.android.piccollage.lib.a.e.a(s1).b(150).a(new bolts.i(s1, pointf) {

                        final String a;
                        final PointF b;
                        final PhotoProtoActivity c;

                        public Void a(j j2)
                            throws Exception
                        {
                            Exception exception = j2.f();
                            if (exception == null)
                            {
                                try
                                {
                                    j2 = com.cardinalblue.android.piccollage.view.h.a(c, (Bitmap)j2.e(), com.cardinalblue.android.piccollage.view.h.a.c);
                                    j2.b(a);
                                    j2.b(true);
                                    j2.a(false);
                                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).i(j2);
                                    if (b != null)
                                    {
                                        j2.d(b.x, b.y);
                                    }
                                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(c, j2);
                                }
                                // Misplaced declaration of an exception variable
                                catch (j j2)
                                {
                                    com.cardinalblue.android.piccollage.a.f.a(j2);
                                }
                            } else
                            {
                                com.cardinalblue.android.piccollage.a.f.a(exception);
                                com.cardinalblue.android.b.k.a(c, 0x7f0701e0, 0);
                            }
                            return null;
                        }

                        public Object then(j j2)
                            throws Exception
                        {
                            return a(j2);
                        }

            
            {
                c = PhotoProtoActivity.this;
                a = s1;
                b = pointf;
                super();
            }
                    }, k.a);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(s1).append("]").toString()));
                }
                i1++;
            }
        }
    }

    private void d(g g1)
    {
        n = new e(this, g, false);
        if (!g1.C())
        {
            n.a(new d(0, getString(0x7f070228), getResources().getDrawable(0x7f020284), 0));
        }
        net.a.a.c c1 = n;
        String s1 = getString(0x7f07022a);
        Drawable drawable = getResources().getDrawable(0x7f02027d);
        int i1;
        if (g1.C())
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        c1.a(new d(1, s1, drawable, i1));
        if (g1.a())
        {
            n.a(new d(3, getString(0x7f070229), getResources().getDrawable(0x7f02027e), 0));
        }
        if (!g1.C())
        {
            n.a(new d(2, getString(0x7f070225), getResources().getDrawable(0x7f020282), 0));
        }
        n.a(new d(4, getResources().getString(0x7f07011e), getResources().getDrawable(0x7f020280), 1));
        g1 = new d(5, J(), K(), 1);
        g1.a(true);
        n.a(g1);
        n.a(M());
    }

    private void d(Exception exception)
    {
        boolean flag1 = false;
        if (exception instanceof bolts.a)
        {
            exception = ((bolts.a)exception).a().iterator();
            flag1 = false;
            boolean flag = false;
            while (exception.hasNext()) 
            {
                Exception exception1 = (Exception)exception.next();
                com.cardinalblue.android.piccollage.a.f.a(exception1);
                boolean flag3;
                if (exception1 instanceof com.cardinalblue.android.piccollage.model.k.a)
                {
                    if (((com.cardinalblue.android.piccollage.model.k.a)exception1).a instanceof OutOfMemoryError)
                    {
                        boolean flag2 = true;
                        flag1 = flag;
                        flag = flag2;
                    } else
                    {
                        flag = flag1;
                        flag1 = true;
                    }
                } else
                {
                    boolean flag4 = flag;
                    flag = flag1;
                    flag1 = flag4;
                }
                flag3 = flag1;
                flag1 = flag;
                flag = flag3;
            }
        } else
        if (exception instanceof SQLiteException)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            flag = true;
        } else
        if (exception instanceof IllegalStateException)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            flag = true;
        } else
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            flag = true;
        }
        if (b == 0 && flag)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700d6, 1);
        }
        if (flag1)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700dc, 1);
        }
    }

    private boolean d(int i1)
    {
        net.a.a.c c1;
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 7: // '\007'
        case 101: // 'e'
            break;
        }
        if (!z())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        t = true;
        c1 = new net.a.a.c(this, g, false);
        c1.a(new net.a.a.a(0, getString(0x7f0702c4), null), 0x7f030020);
        c1.b(x);
        return true;
        android.view.WindowManager.BadTokenException badtokenexception;
        badtokenexception;
        com.cardinalblue.android.piccollage.a.f.a(badtokenexception);
        return false;
    }

    static CollageController e(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.h;
    }

    private String e(String s1)
    {
        String as[] = s1.split("/");
        if (as.length >= 2)
        {
            s1 = (new StringBuilder()).append(as[as.length - 2]).append("/").append(as[as.length - 1]).toString();
        }
        return s1;
    }

    private void e(int i1)
    {
        if (isFinishing())
        {
            return;
        } else
        {
            CollageLayoutFragment collagelayoutfragment = new CollageLayoutFragment();
            collagelayoutfragment.setArguments(f(i1));
            K = B.i();
            getFragmentManager().beginTransaction().replace(0x7f1000cd, collagelayoutfragment, "change_frame_fragment").addToBackStack("change_frame_fragment").commitAllowingStateLoss();
            return;
        }
    }

    private void e(Intent intent)
    {
        ClippingPathModel clippingpathmodel;
        Object obj1;
        clippingpathmodel = (ClippingPathModel)intent.getParcelableExtra("clip_points");
        intent = (g)k;
        obj1 = intent.y();
        if (clippingpathmodel == null || clippingpathmodel.isEmpty())
        {
            h.i(k);
            intent.a(0.0F);
            h.d(k);
            intent.a(null);
            B.c();
            Y.a("reset clipped path");
            Y.a(new ScrapUpdateOp(((BaseScrapModel) (obj1)), intent.y()));
            Y.d();
            l();
            return;
        }
        clippingpathmodel.setScrapWidth(intent.S());
        clippingpathmodel.setScrapHeight(intent.T());
        intent.a(clippingpathmodel.getScaledClippingPath());
        if (intent.t() == -1) goto _L2; else goto _L1
_L1:
        (new com.cardinalblue.android.piccollage.view.b.b(intent, g, ((BaseScrapModel) (obj1)), intent) {

            final BaseScrapModel a;
            final g b;
            final PhotoProtoActivity c;

            public void a()
            {
                this;
                JVM INSTR monitorenter ;
                f.c(-1);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(c).d(f);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).a("apply clipped path");
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).a(new ScrapUpdateOp(a, b.y()));
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).d();
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.l(c);
                super.a();
                this;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                throw exception;
            }

            
            {
                c = PhotoProtoActivity.this;
                a = basescrapmodel;
                b = g1;
                super(k1, photoprotoview);
            }
        }).d();
_L4:
        B.c();
          goto _L3
_L2:
        Y.a("apply clipped path");
        Y.a(new ScrapUpdateOp(((BaseScrapModel) (obj1)), intent.y()));
        Y.d();
        l();
          goto _L4
        obj;
        System.gc();
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
_L3:
        Object obj = intent.s();
        if (obj != null)
        {
            com.cardinalblue.android.piccollage.a.b.C(((String) (obj)));
        }
        Object obj2 = intent.q();
        obj = (PointF)((ArrayList) (obj2)).get(0);
        obj1 = (PointF)((ArrayList) (obj2)).get(((ArrayList) (obj2)).size() - 1);
        if (!intent.a(((PointF) (obj)), ((PointF) (obj1))))
        {
            break MISSING_BLOCK_LABEL_486;
        }
        g g1 = intent.z();
        ArrayList arraylist = new ArrayList();
        PointF pointf;
        for (obj2 = ((ArrayList) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); arraylist.add(new PointF(pointf.x, pointf.y)))
        {
            pointf = (PointF)((Iterator) (obj2)).next();
        }

        Collections.reverse(arraylist);
        g1.a(arraylist);
        float f1 = intent.K();
        float f2 = intent.L();
        float f3 = Math.copySign(50F, ((PointF) (obj1)).y - ((PointF) (obj)).y);
        float f4 = Math.copySign(50F, ((PointF) (obj1)).x - ((PointF) (obj)).x);
        float f5 = intent.P();
        float f6 = intent.Q() + 0.001F;
        intent.a(f1 + f3, f2 - f4, f5, f6);
        g1.a(f1 - f3, f4 + f2, f5, f6);
        c(g1);
        g.postInvalidate();
        return;
          goto _L4
    }

    static PointF f(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.l;
    }

    private Bundle f(int i1)
    {
        int j1 = B.h();
        Object obj = B.g();
        String s1 = null;
        if (obj != null)
        {
            s1 = ((g) (obj)).i();
        }
        obj = new com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a(j1);
        a(((com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a) (obj)));
        if (h(B.s().toString()))
        {
            z = ((com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.a) (obj));
        }
        Bundle bundle = new Bundle();
        boolean flag;
        if (!j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("change_canvas_size_enable", flag);
        bundle.putInt("photos_num", j1);
        bundle.putString("original_background", s1);
        bundle.putSerializable("frame_state", ((java.io.Serializable) (obj)));
        bundle.putInt("component_mode", i1);
        bundle.putBoolean("is_square", B.y());
        bundle.putParcelable("search_memo", I);
        return bundle;
    }

    private com.cardinalblue.android.piccollage.view.k f(Intent intent)
    {
        intent = (TextScrapModel)intent.getParcelableExtra("text_model");
        a(intent.getText().getTextFormat());
        B.b(intent.getText().getText());
        return new n(intent);
    }

    private void f(String s1)
    {
        com.cardinalblue.android.piccollage.a.b.x(s1);
    }

    private void g(Intent intent)
    {
        bolts.j.a(new Callable(intent) {

            final Intent a;
            final PhotoProtoActivity b;

            public Void a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.k k1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(b, a);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).i(k1);
                b.a(k1);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(b, k1);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PhotoProtoActivity.this;
                a = intent;
                super();
            }
        }, k.a);
    }

    static void g(PhotoProtoActivity photoprotoactivity)
    {
        photoprotoactivity.y();
    }

    private void g(String s1)
    {
        if (h.n() < 30) goto _L2; else goto _L1
_L1:
        com.cardinalblue.android.b.k.a(this, String.format(getString(0x7f0702a4), new Object[] {
            Integer.valueOf(30)
        }), 0);
_L4:
        return;
_L2:
        double d1;
        File file;
        IOException ioexception;
        Object obj;
        Exception exception;
        int i1;
        int j1;
        int k1;
        if (m != null)
        {
            j1 = (int)l.x;
            i1 = (int)l.y;
        } else
        {
            i1 = -1;
            j1 = -1;
        }
        if (j1 <= 0 || i1 <= 0)
        {
            i1 = g.getWidth() / 2;
            j1 = g.getHeight() / 2;
            k1 = i1;
            i1 = j1;
        } else
        {
            k1 = j1;
        }
        file = null;
        obj = (ImageScrapModel)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(s1, com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
        s1 = ((String) (obj));
_L5:
        if (s1 != null)
        {
            s1.setId(com.cardinalblue.android.piccollage.view.k.F());
            s1.getFrame().setCenterX(k1);
            s1.getFrame().setCenterY(i1);
            d1 = Math.toDegrees(s1.getTransform().getAngle());
            j1 = X.nextInt(10);
            if (X.nextBoolean())
            {
                i1 = 1;
            } else
            {
                i1 = -1;
            }
            s1.getTransform().setAngle((float)Math.toRadians((double)(i1 * j1) + d1));
            file = new File(s1.getImage().getDecodedThumbnailUrl());
            if (file.exists())
            {
                try
                {
                    obj = com.cardinalblue.android.piccollage.model.k.a("png");
                    com.cardinalblue.android.b.k.a(file, ((File) (obj)));
                    s1.getImage().setThumbnailFile(((File) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
            }
            s1.setzIndex(0x80000000);
            s1.setFrameSlotNumber(-1);
            c(com.cardinalblue.android.piccollage.view.h.a(this, s1));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        com.cardinalblue.android.piccollage.a.f.a(new Exception((new StringBuilder()).append(exception.getMessage()).append(" : ").append(s1).toString()));
        s1 = file;
          goto _L5
    }

    static String h(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.c;
    }

    private void h(Intent intent)
    {
        bolts.j.a(new Callable(intent) {

            final Intent a;
            final PhotoProtoActivity b;

            public Void a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.view.k k1 = com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(b, a);
                if (com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.o(b) != null)
                {
                    try
                    {
                        k1.a((FrameModel)com.cardinalblue.android.b.k.b(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.o(b).getJSONObject("frame").toString(), com/cardinalblue/android/piccollage/model/gson/FrameModel));
                        k1.h(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.o(b).getInt("z_index"));
                    }
                    catch (JSONException jsonexception)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(jsonexception);
                        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).i(k1);
                    }
                } else
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.e(b).i(k1);
                }
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(b, k1);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = PhotoProtoActivity.this;
                a = intent;
                super();
            }
        }, k.a);
    }

    private boolean h(String s1)
    {
        boolean flag;
        try
        {
            flag = (new com.cardinalblue.android.piccollage.model.d(s1)).d();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 0);
            return false;
        }
        return flag;
    }

    static ImageButton i(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.i;
    }

    private void i()
    {
        F = new com.cardinalblue.android.piccollage.iab.util.d(this, com.cardinalblue.android.b.k.o());
        F.a(false);
        F.a(new com.cardinalblue.android.piccollage.iab.util.d.d() {

            final PhotoProtoActivity a;

            public void a(com.cardinalblue.android.piccollage.iab.util.e e1)
            {
                if (e1.c());
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
    }

    private void i(String s1)
        throws JSONException
    {
        if (!S)
        {
            S = true;
            s1 = new JSONArray(s1);
            int i1 = 0;
            while (i1 < s1.length()) 
            {
                JSONObject jsonobject = s1.getJSONObject(i1);
                String s2 = jsonobject.getString("action_type");
                if ("edit_scrap".equals(s2))
                {
                    jsonobject = jsonobject.getJSONObject("scrap");
                    if (TextScrapModel.TYPE_TEXT_SCRAP.equals(jsonobject.getString("scrap_type")))
                    {
                        V = jsonobject;
                        a(G(), 116);
                    }
                } else
                if ("add_scrap".equals(s2))
                {
                    y.post(new Runnable() {

                        final PhotoProtoActivity a;

                        public void run()
                        {
                            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, PhotoProtoActivity.z(a));
                        }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
                    });
                }
                i1++;
            }
        }
    }

    static Runnable j(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.Q;
    }

    private boolean j()
    {
        return !TextUtils.isEmpty(e);
    }

    static UndoManager k(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.Y;
    }

    private boolean k()
    {
        return h.k() || O();
    }

    private void l()
    {
        invalidateOptionsMenu();
    }

    static void l(PhotoProtoActivity photoprotoactivity)
    {
        photoprotoactivity.l();
    }

    static void m(PhotoProtoActivity photoprotoactivity)
    {
        photoprotoactivity.t();
    }

    static void n(PhotoProtoActivity photoprotoactivity)
    {
        photoprotoactivity.p();
    }

    static JSONObject o(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.V;
    }

    private void o()
    {
        com.cardinalblue.android.piccollage.a.b.D(String.valueOf(B.t().size()));
        if (b != 0)
        {
            finish();
            return;
        }
        if (k())
        {
            com.cardinalblue.android.b.k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f070124), getString(0x1040013), new android.content.DialogInterface.OnClickListener() {

                final PhotoProtoActivity a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.m(a);
                }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
            }, getString(0x1040009), null), "confirm-closing-dialog");
            return;
        } else
        {
            t();
            return;
        }
    }

    static String p(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.e;
    }

    private void p()
    {
        if (!P)
        {
            setResult(0);
            finish();
            return;
        }
        if (s())
        {
            startService(PICAppRoutesService.d(PICAppRoutesService.a("gallery/me")));
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("key_position", 0x7f1002de);
            setResult(-1, intent);
        }
        if (q())
        {
            AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
            if (alarmmanager != null)
            {
                PendingIntent pendingintent = PendingIntent.getService(this, 0, (new Intent(this, com/cardinalblue/android/piccollage/InAppNotificationService)).setAction("android.intent.action.SEND").setData(Uri.parse("app:/notification/unfinished")).putExtra("extra_collage", B).addFlags(0x14000000), 0);
                try
                {
                    alarmmanager.cancel(pendingintent);
                }
                catch (Exception exception) { }
                alarmmanager.set(3, r(), pendingintent);
            }
        }
        finish();
    }

    static PhotoProtoView q(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.g;
    }

    private boolean q()
    {
        boolean flag3 = true;
        boolean flag1 = true;
        if (((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getUnfinishedCollageNotiSetting().enable)
        {
            boolean flag;
            boolean flag4;
            if (PreferenceManager.getDefaultSharedPreferences(this).getInt("version_last_code", 0) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag4 = N;
            if (flag)
            {
                if (com.cardinalblue.android.piccollage.model.a.a.a(this).b() <= 2L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag4 || !flag)
                {
                    flag1 = false;
                }
                return flag1;
            }
            if (com.cardinalblue.android.b.k.j().getBoolean("key_is_first_update", false))
            {
                com.cardinalblue.android.b.k.j().edit().putBoolean("key_is_first_update", false).apply();
                boolean flag2;
                if (!flag4)
                {
                    flag2 = flag3;
                } else
                {
                    flag2 = false;
                }
                return flag2;
            }
        }
        return false;
    }

    private long r()
    {
        return SystemClock.elapsedRealtime() + PICDeviceConfig.getUnfinishedNotificationDelayMs();
    }

    static ClipboardManager r(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.A;
    }

    static Intent s(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.F();
    }

    private boolean s()
    {
        String s1 = getIntent().getAction();
        Bundle bundle = getIntent().getExtras();
        return "com.cardinalblue.piccollage.action.stickerstore".equals(s1) || "android.intent.action.SEND".equals(s1) || "android.intent.action.SEND_MULTIPLE".equals(s1) || bundle != null && bundle.containsKey("extra_open_photo_picker");
    }

    static IMemento t(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.I;
    }

    private void t()
    {
        Dialog dialog = com.cardinalblue.android.b.j.a(this);
        dialog.show();
        bolts.j.a(new Callable() {

            final PhotoProtoActivity a;

            public Boolean a()
                throws Exception
            {
                return Boolean.valueOf(com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.c(a));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        }).a(new bolts.i(dialog) {

            final Dialog a;
            final PhotoProtoActivity b;

            public Void a(j j1)
                throws Exception
            {
                a.dismiss();
                if (j1.d() || j1.c())
                {
                    j1 = j1.f();
                    com.cardinalblue.android.piccollage.a.f.a(j1);
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(b, j1);
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.n(b);
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PhotoProtoActivity.this;
                a = dialog;
                super();
            }
        }, j.b);
    }

    static Intent u(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.G();
    }

    private Bitmap u()
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Bitmap bitmap;
        try
        {
            bitmap = g.a(B.w(), B.v());
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            com.cardinalblue.android.piccollage.a.f.a(outofmemoryerror);
            System.gc();
            Bitmap bitmap1;
            try
            {
                if (android.os.Build.VERSION.SDK_INT == 19)
                {
                    return g.a(B.w() / 2, B.v() / 2, 0.5F, android.graphics.Bitmap.Config.RGB_565);
                }
                bitmap1 = g.a(B.w(), B.v(), android.graphics.Bitmap.Config.RGB_565);
            }
            catch (OutOfMemoryError outofmemoryerror1)
            {
                throw new com.cardinalblue.android.piccollage.model.k.a(outofmemoryerror1);
            }
            return bitmap1;
        }
        return bitmap;
    }

    static com.cardinalblue.android.piccollage.view.k v(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.k;
    }

    private boolean v()
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Bitmap bitmap;
        if (b != 0)
        {
            return false;
        }
        if (!B.b())
        {
            if (!B.d() && (B instanceof Collage))
            {
                File file = ((Collage)B).q();
                if (file == null || !file.exists())
                {
                    try
                    {
                        B.a(u());
                        B.c(this);
                    }
                    catch (IOException ioexception)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(ioexception);
                    }
                }
            }
            return false;
        }
        bitmap = u();
        if (bitmap == null)
        {
            throw new com.cardinalblue.android.piccollage.model.k.a(new OutOfMemoryError("Can't get capturing collage thumbnail"));
        }
        PhotoProtoView photoprotoview = g;
        photoprotoview;
        JVM INSTR monitorenter ;
        w();
        B.a(bitmap);
        B.c(this);
        if (!j())
        {
            com.cardinalblue.android.b.k.j().edit().putBoolean("pref_is_last_square_canvas", B.y()).apply();
        }
        com.cardinalblue.android.b.k.a(this, B.p());
        return true;
        Object obj;
        obj;
        photoprotoview;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new com.cardinalblue.android.piccollage.model.k.a(((Throwable) (obj)));
    }

    static void w(PhotoProtoActivity photoprotoactivity)
    {
        photoprotoactivity.N();
    }

    private boolean w()
    {
        j j1 = bolts.j.a(null);
        if (!h.l())
        {
            j1 = h.m();
        }
        try
        {
            j1.g();
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        return !j1.d();
    }

    private View x()
    {
        return x;
    }

    static String x(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.J();
    }

    static Drawable y(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.K();
    }

    private void y()
    {
        View view = x();
        if (view != null)
        {
            view.setVisibility(0);
        }
    }

    static ImageButton z(PhotoProtoActivity photoprotoactivity)
    {
        return photoprotoactivity.w;
    }

    private boolean z()
    {
        return r && !t && b == 0;
    }

    public Bitmap a(int i1, int j1)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Bitmap bitmap;
        try
        {
            bitmap = h.a(i1, j1, com.cardinalblue.android.piccollage.controller.f.e, this);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            com.cardinalblue.android.piccollage.a.f.a(outofmemoryerror);
            System.gc();
            Bitmap bitmap1;
            try
            {
                bitmap1 = h.a(i1, j1, android.graphics.Bitmap.Config.RGB_565, this);
            }
            catch (OutOfMemoryError outofmemoryerror1)
            {
                throw new com.cardinalblue.android.piccollage.model.k.a(outofmemoryerror1);
            }
            return bitmap1;
        }
        return bitmap;
    }

    protected void a()
    {
        if (k())
        {
            com.cardinalblue.android.b.k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f0701fb), getString(0x1040013), null, null, null), "warning_wait_download_task");
            return;
        } else
        {
            ((com.cardinalblue.android.piccollage.a)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a)).a(this);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_collage", B);
            OverlayShareMenuFragment overlaysharemenufragment = new OverlayShareMenuFragment();
            overlaysharemenufragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, overlaysharemenufragment, "share_menu_fragment").addToBackStack("share_menu_fragment").commitAllowingStateLoss();
            G = true;
            return;
        }
    }

    public void a(float f1)
    {
        h.a(f1);
    }

    public void a(int i1)
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.d(i1));
    }

    public void a(int i1, boolean flag)
    {
        com.cardinalblue.android.piccollage.view.g.a(this, i1);
        if (k != null && (k instanceof g))
        {
            g g1 = (g)k;
            Y.a("apply border");
            if (!flag)
            {
                Y.a(new ApplyBorderOp(g1.U(), g1.d(), i1));
                g1.a(i1);
            } else
            {
                Iterator iterator = B.t().iterator();
                while (iterator.hasNext()) 
                {
                    com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
                    if (k1 instanceof g)
                    {
                        g g2 = (g)k1;
                        Y.a(new ApplyBorderOp(k1.U(), g2.d(), i1));
                        g2.a(i1);
                    }
                }
            }
            Y.d();
            l();
            B.c();
            g.postInvalidate();
        }
    }

    public void a(com.cardinalblue.android.piccollage.model.d d1, boolean flag)
    {
        if (flag)
        {
            com.cardinalblue.android.piccollage.a.b.w(String.valueOf(d1.c()));
        }
        if (h(d1.toString()) && z != null)
        {
            b(z);
        } else
        {
            h.a(d1, flag);
        }
        B.c();
    }

    public void a(IBackground ibackground)
    {
        if (ibackground != null)
        {
            c(ibackground.getPath());
        }
    }

    public void a(IMemento imemento)
    {
        I = imemento;
    }

    public void a(g g1)
    {
        a(((com.cardinalblue.android.piccollage.view.k) (g1)));
        h.a(g1, Y);
        l();
    }

    protected void a(com.cardinalblue.android.piccollage.view.k k1)
    {
        h.i(k1);
        if (m != null)
        {
            float f1 = l.x;
            float f2 = l.y;
            if (f1 > 0.0F && f2 > 0.0F)
            {
                k1.d(f1, f2);
            }
        }
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        i.setImageResource(0x7f02011c);
        y.postDelayed(Q, 500L);
        b(k1);
        com.cardinalblue.android.piccollage.a.b.F("yes");
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, Exception exception)
    {
label0:
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            if (b == 0)
            {
                if (k1 == null || !(k1 instanceof com.cardinalblue.android.piccollage.view.c))
                {
                    break label0;
                }
                com.cardinalblue.android.b.k.a(this, 0x7f0700d5, 0);
            }
            return;
        }
        com.cardinalblue.android.b.k.a(this, 0x7f0700d4, 0);
    }

    public void a(n n1)
    {
        k = n1;
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/activities/TextActivity);
        intent.putExtra("text_model", n1.k());
        startActivityForResult(intent, 20);
    }

    public void a(Object obj, MotionEvent motionevent)
    {
        h((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public void a(boolean flag)
    {
        J = flag;
    }

    public void a(boolean flag, boolean flag1)
    {
        com.cardinalblue.android.piccollage.view.g.a(this, flag);
        if (k != null && (k instanceof g))
        {
            g g1 = (g)k;
            Y.a("apply shadow");
            if (!flag1)
            {
                if (g1.a(flag))
                {
                    UndoManager undomanager = Y;
                    long l1 = g1.U();
                    if (!flag)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    undomanager.a(new ApplyShadowOp(l1, flag1, flag));
                }
            } else
            {
                Iterator iterator = B.t().iterator();
                while (iterator.hasNext()) 
                {
                    com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
                    if ((k1 instanceof g) && ((g)k1).a(flag))
                    {
                        UndoManager undomanager1 = Y;
                        long l2 = k1.U();
                        if (!flag)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        undomanager1.a(new ApplyShadowOp(l2, flag1, flag));
                    }
                }
            }
            Y.d();
            l();
            B.c();
            g.postInvalidate();
        }
    }

    public void a(boolean flag, boolean flag1, int i1, List list)
    {
        boolean flag2 = false;
        com.cardinalblue.android.piccollage.view.g.b(this, flag);
        if (flag)
        {
            Y.a("apply all");
            list = B.t().iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)list.next();
                if (k1 instanceof g)
                {
                    g g1 = (g)k1;
                    if (g1.a(flag1))
                    {
                        UndoManager undomanager = Y;
                        long l1 = k1.U();
                        if (!flag1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        undomanager.a(new ApplyShadowOp(l1, flag, flag1));
                    }
                    Y.a(new ApplyBorderOp(k1.U(), g1.d(), i1));
                    g1.a(i1);
                }
            } while (true);
            Y.d();
            l();
        } else
        {
            Iterator iterator = B.t().iterator();
            i1 = ((flag2) ? 1 : 0);
            while (iterator.hasNext()) 
            {
                Object obj = (com.cardinalblue.android.piccollage.view.k)iterator.next();
                if (obj instanceof g)
                {
                    if (obj != k)
                    {
                        obj = (g)obj;
                        com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState borderstate = (com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.BorderState)list.get(i1);
                        ((g) (obj)).a(borderstate.a);
                        ((g) (obj)).a(borderstate.b);
                    }
                    i1++;
                }
            }
        }
        B.c();
        g.postInvalidate();
    }

    public void b()
    {
        e(502);
    }

    public void b(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 502: 
            if (B == null || B.g() == null)
            {
                com.cardinalblue.android.piccollage.a.f.a(new NullPointerException("the collage and background scrap should not be null when entering to background picker"));
                return;
            } else
            {
                M = B.g().y();
                return;
            }

        case 501: 
            K = B.i();
            return;
        }
    }

    public void b(int i1, boolean flag)
    {
        if (flag)
        {
            switch (i1)
            {
            default:
                return;

            case 501: 
                Y.a("apply frame layout");
                Y.a(new CollageUpdateOp(K, B.i()));
                Y.d();
                l();
                return;

            case 502: 
                break;
            }
            if (B != null && B.g() != null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (M != null && i1 != 0)
            {
                Y.a("change background");
                Y.a(new ScrapUpdateOp(M, B.g().y(), 4));
                Y.d();
                l();
                M = null;
                return;
            }
        }
    }

    public void b(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        Rect rect;
        int i1;
        int j1;
        if (k1 == null || motionevent == null)
        {
            return;
        }
        rect = new Rect();
        g.getDrawingRect(rect);
        i1 = (int)motionevent.getX();
        j1 = (int)motionevent.getY();
        if (rect.contains(i1, j1)) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        f1 = k1.K();
        f2 = k1.L();
        if (i1 <= rect.right) goto _L4; else goto _L3
_L3:
        f1 = rect.right;
_L8:
        if (j1 <= rect.bottom) goto _L6; else goto _L5
_L5:
        f2 = rect.bottom;
_L10:
        k1.d(f1, f2);
_L12:
        k1.v();
        k1 = k1.D();
        if (Z.hasChange(k1))
        {
            Y.a("move scrap");
            Y.a(new ScrapUpdateOp(Z, k1));
            Y.d();
        }
        l();
        return;
_L4:
        if (i1 >= rect.left) goto _L8; else goto _L7
_L7:
        f1 = rect.left;
          goto _L8
_L6:
        if (j1 >= rect.top) goto _L10; else goto _L9
_L9:
        f2 = rect.top;
          goto _L10
_L2:
        y.postDelayed(Q, 500L);
        if (!a(k1, motionevent.getX(), motionevent.getY()))
        {
            continue; /* Loop/switch isn't completed */
        }
        com.cardinalblue.android.piccollage.a.b.F("no");
        b(k1);
        k1.v();
        return;
        if (!k1.w()) goto _L12; else goto _L11
_L11:
        h.d(k1);
        i1 = B.s().a(motionevent.getX(), motionevent.getY(), g.getWidth(), g.getHeight());
        motionevent = h.d(k1, i1);
        if (!h.b(k1, i1)) goto _L12; else goto _L13
_L13:
        Y.a("swap frame");
        Y.a(motionevent);
        Y.d();
        l();
        k1.v();
        return;
        motionevent;
        k1.v();
        throw motionevent;
          goto _L8
    }

    public void b(Object obj, MotionEvent motionevent)
    {
        g((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public void c()
    {
        d();
    }

    public void c(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        y.removeCallbacks(Q);
        i.setVisibility(0);
        if (k1 != null)
        {
            if (a(k1, motionevent.getX(), motionevent.getY()))
            {
                i.setImageResource(0x7f02011c);
            } else
            {
                i.setImageResource(0x7f02011b);
            }
            if (k1.t() != -1)
            {
                h.f(k1);
            }
        }
    }

    public void c(Object obj, MotionEvent motionevent)
    {
        f((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public void d(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        k1.M();
        Z = k1.D();
    }

    public void d(Object obj, MotionEvent motionevent)
    {
        e((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public boolean d()
    {
        if (getFragmentManager().findFragmentById(0x7f1000cd) != null)
        {
            getFragmentManager().popBackStack();
            if (!com.cardinalblue.android.b.k.j().getBoolean("pref_help_overlay_showed", false))
            {
                A();
                com.cardinalblue.android.b.k.j().edit().putBoolean("pref_help_overlay_showed", true).apply();
            }
            return true;
        }
        Object obj = getSupportFragmentManager().findFragmentById(0x7f1000cd);
        if (obj != null)
        {
            obj = ((Fragment) (obj)).getTag();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && "share_menu_fragment".equals(obj))
            {
                com.cardinalblue.android.piccollage.a.b.aH("back button");
                ((com.cardinalblue.android.piccollage.a)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a)).a(this, null, new InAppPurchaseListener() {

                    final PhotoProtoActivity a;

                    public void onInAppPurchaseRequested(InAppPurchase inapppurchase)
                    {
                        inapppurchase = PICAppRoutesService.d(PICAppRoutesService.b(inapppurchase.getProductId()));
                        inapppurchase.putExtra("extra_from_iap", true);
                        a.startService(inapppurchase);
                    }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
                });
            }
            getSupportFragmentManager().popBackStack();
            G = false;
            if (!com.cardinalblue.android.b.k.j().getBoolean("pref_help_overlay_showed", false))
            {
                A();
                com.cardinalblue.android.b.k.j().edit().putBoolean("pref_help_overlay_showed", true).apply();
            }
            return true;
        } else
        {
            invalidateOptionsMenu();
            return false;
        }
    }

    public void displayTextViewTapAnywhere(com.cardinalblue.android.piccollage.controller.CollageController.UpdateTapAnywhereEvent updatetapanywhereevent)
    {
        if (v == null)
        {
            return;
        }
        if (updatetapanywhereevent.a)
        {
            v.setVisibility(0);
            x.setVisibility(4);
            return;
        } else
        {
            v.setVisibility(8);
            x.setVisibility(0);
            return;
        }
    }

    public void e()
    {
        d();
        if (B.s() != null)
        {
            com.cardinalblue.android.piccollage.a.b.w(String.valueOf(B.s().c()));
        }
        z = null;
    }

    public void e(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        if (k1 != null) goto _L2; else goto _L1
_L1:
        b((int)motionevent.getX(), (int)motionevent.getY());
_L4:
        return;
_L2:
        boolean flag;
        if (k1 instanceof o)
        {
            a((o)k1);
            return;
        }
        int i1;
        if (k1.t() != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (motionevent == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = B.a(motionevent.getX(), motionevent.getY());
        if (flag || i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        motionevent = B.i();
        if (h.b(k1, i1))
        {
            g.a();
            Y.a("swap frame");
            Y.a(new CollageUpdateOp(motionevent, B.i()));
            Y.d();
            l();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        a(k1, flag);
        return;
    }

    public void e(Object obj, MotionEvent motionevent)
    {
        d((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public com.cardinalblue.android.piccollage.view.PhotoProtoView.b f()
    {
        com.cardinalblue.android.piccollage.a.b.Z();
        f("Change Canvas Size");
        if (g.getShape() == com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a)
        {
            g.a(com.cardinalblue.android.piccollage.view.PhotoProtoView.b.b);
            return com.cardinalblue.android.piccollage.view.PhotoProtoView.b.b;
        } else
        {
            g.a(com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a);
            return com.cardinalblue.android.piccollage.view.PhotoProtoView.b.a;
        }
    }

    public void f(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        com.cardinalblue.android.piccollage.a.b.aL("double tap");
        com.cardinalblue.android.piccollage.a.b.bM();
        if (k1 instanceof o)
        {
            a((o)k1);
            return;
        } else
        {
            a(k1, motionevent, "double tap");
            return;
        }
    }

    public void f(Object obj, MotionEvent motionevent)
    {
        c((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    public String g()
    {
        return d;
    }

    public void g(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        com.cardinalblue.android.piccollage.a.b.aL("double single tap");
        com.cardinalblue.android.piccollage.a.b.bN();
        if (k1 instanceof o)
        {
            a((o)k1);
            return;
        } else
        {
            a(k1, motionevent, "double single tap");
            return;
        }
    }

    public void g(Object obj, MotionEvent motionevent)
    {
        b((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    protected void h()
    {
        com.cardinalblue.android.piccollage.a.b.ao(R());
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("key_pic_login_purpose", PicLoginActivity.d);
        intent.putExtra("key_pic_login_caption", B.r());
        intent.putExtra("from", "echo");
        if (!PicAuth.h().b())
        {
            startActivityForResult(intent, 40);
            return;
        } else
        {
            P();
            return;
        }
    }

    public void h(com.cardinalblue.android.piccollage.view.k k1, MotionEvent motionevent)
    {
        if (k1 == null)
        {
            com.cardinalblue.android.piccollage.a.b.ab();
            b();
        } else
        if (k1.b())
        {
            com.cardinalblue.android.piccollage.a.b.bO();
            com.cardinalblue.android.piccollage.a.b.aL("long tap");
            if (k1 instanceof o)
            {
                a((o)k1);
                return;
            } else
            {
                a(k1, motionevent, "long tap");
                return;
            }
        }
    }

    public void h(Object obj, MotionEvent motionevent)
    {
        a((com.cardinalblue.android.piccollage.view.k)obj, motionevent);
    }

    protected boolean m()
    {
        return true;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (F == null || !F.a(i1, j1, intent)) goto _L2; else goto _L1
_L1:
        Log.v("Editor", "onActivityResult handled by IabHelper.");
_L16:
        return;
_L2:
        i1;
        JVM INSTR tableswitch 1 1: default 56
    //                   1 129;
           goto _L3 _L4
_L3:
        if (j1 == -1) goto _L6; else goto _L5
_L5:
        i1;
        JVM INSTR lookupswitch 5: default 112
    //                   0: 113
    //                   3: 163
    //                   7: 158
    //                   10: 150
    //                   40: 182;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L12:
        break; /* Loop/switch isn't completed */
_L7:
        return;
_L8:
        if (!a(i1, ((j) (null))))
        {
            c(i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (intent != null)
        {
            I = (IMemento)intent.getParcelableExtra("search_memo");
        }
          goto _L3
_L11:
        b("cancel");
        return;
_L10:
        finish();
        return;
_L9:
        if (intent == null) goto _L14; else goto _L13
_L14:
        if (true) goto _L16; else goto _L15
_L13:
        a = (BaseMemento)intent.getParcelableExtra("key_memento");
        return;
_L15:
        com.cardinalblue.android.piccollage.a.b.ah("later");
        return;
_L6:
        j j2;
        y();
        j2 = bolts.j.a(null);
        i1;
        JVM INSTR lookupswitch 11: default 300
    //                   0: 446
    //                   1: 319
    //                   2: 554
    //                   3: 508
    //                   7: 508
    //                   10: 497
    //                   13: 576
    //                   20: 526
    //                   40: 597
    //                   101: 486
    //                   116: 565;
           goto _L17 _L18 _L19 _L20 _L21 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L17:
        intent = j2;
_L29:
        if (!a(i1, intent))
        {
            d(i1);
            return;
        }
          goto _L16
_L19:
        com.cardinalblue.android.piccollage.a.b.aE();
        a("web");
        if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) goto _L17; else goto _L28
_L28:
        String s1;
        if (intent.hasExtra("keyword"))
        {
            s1 = intent.getStringExtra("keyword");
        } else
        {
            s1 = "";
        }
        if (!intent.hasExtra("selected_photos"))
        {
            intent = j2;
        } else
        {
            if ("video/*".equals(intent.getType()))
            {
                a(intent.getParcelableArrayListExtra("selected_photos"), s1);
            }
            if ("image/*".equals(intent.getType()))
            {
                a(intent.getExtras().getParcelableArrayList("selected_photos"), s1);
            }
            intent = j2;
        }
          goto _L29
_L18:
        if (intent.getBooleanExtra("extra_is_kddi", false))
        {
            c(intent);
            intent = j2;
        } else
        {
            intent = a(intent.getExtras().getParcelableArrayList("photo_infos"));
        }
          goto _L29
_L26:
        c(intent);
        intent = j2;
          goto _L29
_L22:
        b(intent);
        intent = j2;
          goto _L29
_L21:
        a("sticker");
        d(intent);
        intent = j2;
          goto _L29
_L24:
        if (!(k instanceof n)) goto _L16; else goto _L30
_L30:
        a((n)k, intent);
        intent = j2;
          goto _L29
_L20:
        g(intent);
        intent = j2;
          goto _L29
_L27:
        h(intent);
        intent = j2;
          goto _L29
_L23:
        if (!(k instanceof g)) goto _L16; else goto _L31
_L31:
        e(intent);
        intent = j2;
          goto _L29
_L25:
        com.cardinalblue.android.piccollage.a.b.ah("now");
        P();
          goto _L17
    }

    public void onBackPressed()
    {
        if (d() || B())
        {
            return;
        }
        com.cardinalblue.android.piccollage.a.b.R();
        if (b == 1)
        {
            com.cardinalblue.android.piccollage.a.b.ap(R());
        }
        o();
        com.cardinalblue.android.piccollage.a.b.M();
    }

    public void onChangeSourceUri(com.cardinalblue.android.piccollage.activities.undo.a.c c1)
    {
        com.cardinalblue.android.piccollage.view.k k1 = B.a(c1.a);
        if (k1 != null && (k1 instanceof g))
        {
            ((g)k1).a(c1.b.toString());
            c1 = h.b(k1);
            if (c1 instanceof i)
            {
                ((i)c1).a(false);
            }
        }
    }

    public void onChangeZIndex(com.cardinalblue.android.piccollage.activities.undo.a.d d1)
    {
        com.cardinalblue.android.piccollage.view.k k1 = B.a(d1.a);
        if (k1 != null)
        {
            k1.h(d1.b);
            h.i();
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755212: 
            switch (b)
            {
            default:
                if (j())
                {
                    com.cardinalblue.android.piccollage.a.b.p("greeting_card", e);
                    view = com.cardinalblue.android.b.j.a(this);
                    view.show();
                    a((new com.cardinalblue.android.piccollage.controller.g()).a(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.c).a(B.w(), B.v()).a(false).b(1)).a(new bolts.i(view) {

                        final Dialog a;
                        final PhotoProtoActivity b;

                        public Object then(j j1)
                            throws Exception
                        {
                            a.dismiss();
                            if (j1.d() || j1.c())
                            {
                                return null;
                            }
                            ArrayList arraylist = new ArrayList();
                            arraylist.add(new Asset(((File)j1.e()).toString()));
                            if (com.cardinalblue.android.b.d.h())
                            {
                                KiteSDK.getInstance(b, b.getString(0x7f070346), ly.kite.KiteSDK.DefaultEnvironment.TEST).startShoppingByProductId(b, arraylist, new String[] {
                                    PhotoProtoActivity.p(b)
                                });
                                return null;
                            } else
                            {
                                KiteSDK.getInstance(b, b.getString(0x7f070345), ly.kite.KiteSDK.DefaultEnvironment.LIVE).startShoppingByProductId(b, arraylist, new String[] {
                                    PhotoProtoActivity.p(b)
                                });
                                return null;
                            }
                        }

            
            {
                b = PhotoProtoActivity.this;
                a = dialog;
                super();
            }
                    }, j.b);
                    return;
                }
                break;

            case 1: // '\001'
                h();
                return;
            }
            if (B.y())
            {
                com.cardinalblue.android.piccollage.a.b.N();
                com.cardinalblue.android.piccollage.a.b.s("square");
            } else
            {
                com.cardinalblue.android.piccollage.a.b.O();
                com.cardinalblue.android.piccollage.a.b.s("portrait");
            }
            a();
            return;

        case 2131755211: 
            com.cardinalblue.android.piccollage.a.b.aw();
            com.cardinalblue.android.piccollage.a.b.P();
            a(view);
            return;

        case 2131755210: 
            com.cardinalblue.android.piccollage.a.b.W();
            com.cardinalblue.android.piccollage.a.b.Q();
            e(501);
            return;

        case 2131755435: 
            com.cardinalblue.android.piccollage.a.i.c(this);
            return;

        case 2131755215: 
            B();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        if (com.cardinalblue.android.b.k.f())
        {
            com.cardinalblue.android.b.k.a(this, 0x7f070204, 1);
            com.cardinalblue.android.piccollage.a.b.B("low internal memory");
            setResult(1);
            finish();
            return;
        }
        Intent intent = getIntent();
        com.cardinalblue.android.piccollage.a.b.f();
        setContentView(0x7f030029);
        E = getWindow().getDecorView();
        E.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

            final PhotoProtoActivity a;

            public void onSystemUiVisibilityChange(int i1)
            {
                if ((i1 & 4) == 0)
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a).sendEmptyMessageDelayed(0, 1000L);
                }
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        });
        getWindow().setBackgroundDrawable(null);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        L = new ProgressDialog(this);
        L.setMessage(getString(0x7f0701fa));
        L.setCancelable(false);
        L.setCanceledOnTouchOutside(false);
        v = (TextView)findViewById(0x7f1000c8);
        g = (PhotoProtoView)findViewById(0x7f1000c7);
        try
        {
            BitmapDrawable bitmapdrawable = new BitmapDrawable(BitmapFactory.decodeStream(getAssets().open(com.cardinalblue.android.piccollage.lib.e.a.e.c("assets://backgrounds/default.png"))));
            bitmapdrawable.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
            g.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            g.setImageDrawable(bitmapdrawable);
        }
        catch (IOException ioexception) { }
        ((ImageButton)findViewById(0x7f1000ca)).setOnTouchListener(new a(this));
        w = (ImageButton)findViewById(0x7f1000cb);
        w.setOnTouchListener(new a(this));
        x = (TextView)findViewById(0x7f1000cc);
        x.setOnTouchListener(new a(this));
        x.setVisibility(4);
        i = (ImageButton)findViewById(0x7f1000c9);
        i.setOnClickListener(this);
        y = new c(this);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        c(bundle);
        com.cardinalblue.android.b.k.b(this, L);
        h = new CollageController(B, g, this);
        h.a(this);
        h.a(j()).a(new bolts.i() {

            final PhotoProtoActivity a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(a, j1.f());
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = PhotoProtoActivity.this;
                super();
            }
        }, k.a);
        A = (ClipboardManager)getSystemService("clipboard");
        if (com.cardinalblue.android.b.k.l(this))
        {
            try
            {
                C = HeadTrackingManager.createInstance(this);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                com.cardinalblue.android.piccollage.a.f.a(bundle);
            }
        }
        try
        {
            i();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
        }
        Y = new UndoManager();
        return;
        try
        {
            a(intent);
            break MISSING_BLOCK_LABEL_385;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        com.cardinalblue.android.piccollage.a.f.a(bundle);
        finish();
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110017, menu);
        return true;
    }

    protected void onDestroy()
    {
        a(m);
        a(n);
        a(q);
        if (T != null && T.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            T.cancel(true);
            T = null;
        }
        if (h != null)
        {
            h.a(null);
            h.g();
        }
        if (B != null)
        {
            B.a(null);
        }
        if (g != null)
        {
            g.f();
            g = null;
        }
        if (F != null)
        {
            F.a();
            F = null;
        }
        System.gc();
        super.onDestroy();
    }

    public void onFinishCollage(FinishCollageEvent finishcollageevent)
    {
        N = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        menuitem.getItemId();
        JVM INSTR lookupswitch 4: default 52
    //                   16908332: 125
    //                   2131755765: 60
    //                   2131755766: 88
    //                   2131755767: 116;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L7:
        return flag;
_L3:
        if (Y.b()) goto _L7; else goto _L6
_L6:
        try
        {
            Y.b(1);
            l();
            com.cardinalblue.android.piccollage.a.b.ca();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            return false;
        }
        return true;
_L4:
        if (Y.b()) goto _L7; else goto _L8
_L8:
        try
        {
            Y.a(1);
            l();
            com.cardinalblue.android.piccollage.a.b.cb();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            return false;
        }
        return true;
_L5:
        com.cardinalblue.android.piccollage.a.b.b();
        A();
_L10:
        return true;
_L2:
        onBackPressed();
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void onPause()
    {
        super.onPause();
        g.b();
        if (C != null)
        {
            C.unregisterListener(D);
            D = null;
        }
        try
        {
            v();
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
            com.cardinalblue.android.b.k.a(this, 0x7f0700dd, 1);
        }
        com.cardinalblue.android.piccollage.controller.d.a(this);
        if (h != null)
        {
            com.cardinalblue.android.piccollage.controller.d.a(h);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (b == 1)
        {
            menu.findItem(0x7f1002f7).setVisible(false);
        } else
        if (G)
        {
            menu.findItem(0x7f1002f7).setVisible(false);
            getSupportActionBar().setDisplayUseLogoEnabled(false);
        } else
        {
            menu.findItem(0x7f1002f7).setVisible(true);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
        menu.findItem(0x7f1002f5).setEnabled(Y.f());
        menu.findItem(0x7f1002f6).setEnabled(Y.e());
        return true;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        j = (Uri)bundle.getParcelable("saved_camera_output_uri");
        a = (BaseMemento)bundle.getParcelable("key_sticker_memento");
        I = (IMemento)bundle.getParcelable("saved_last_search_memo");
        N = bundle.getBoolean("saved_finished_collage", false);
        l = (PointF)bundle.getParcelable("saved_touch_point");
        if (bundle.containsKey("saved_undo_stack"))
        {
            Y.a(bundle.getParcelable("saved_undo_stack"));
        }
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        y.sendEmptyMessage(0);
        g.b();
        BitmapAjaxCallback.g();
        if (C != null)
        {
            D = new b(g);
            C.registerListener(D);
        }
        com.cardinalblue.android.piccollage.controller.d.b(this);
        if (h != null)
        {
            com.cardinalblue.android.piccollage.controller.d.b(h);
        }
        System.gc();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("saved_camera_output_uri", j);
        bundle.putInt("extra_editor_mode", b);
        bundle.putParcelable("extra_collage", B);
        bundle.putString("extra_start_from", c);
        bundle.putBoolean("saved_first_entered_editor", f);
        bundle.putBoolean("saved_is_wording_showed", t);
        bundle.putBoolean("saved_is_frame_picker_showed", s);
        bundle.putBoolean("saved_is_show_adder_menu", u);
        bundle.putBoolean("saved_is_new_collage", r);
        bundle.putBoolean("saved_show_leave_editor_dialog", J);
        bundle.putBoolean("saved_edited_already", P);
        bundle.putString("saved_echoed_collage_id", d);
        bundle.putString("saved_photobox_product_id", e);
        bundle.putParcelable("saved_touch_point", l);
        bundle.putBoolean("saved_flag_handle_editor_action", S);
        if (V != null)
        {
            bundle.putString("saved_echo_text_scrap_model", V.toString());
        }
        bundle.putSerializable("saved_frame_state", z);
        bundle.putParcelable("key_sticker_memento", a);
        int i1;
        if (k == null)
        {
            i1 = -1;
        } else
        {
            i1 = B.t().indexOf(k);
        }
        bundle.putInt("saved_selected_scrap_idx", i1);
        bundle.putParcelable("saved_last_search_memo", I);
        if (!Y.c())
        {
            bundle.putParcelable("saved_undo_stack", Y.a());
        } else
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("some undo operation is adding when saving activity state"));
        }
        bundle.putBoolean("saved_finished_collage", N);
        super.onSaveInstanceState(bundle);
    }

    public void onShapeChanged(com.cardinalblue.android.piccollage.view.PhotoProtoView.ShapeChangeEvent shapechangeevent)
    {
        if (z != null)
        {
            float f1 = (1.0F * (float)shapechangeevent.b()) / (float)shapechangeevent.a();
            for (int i1 = 0; i1 < z.a(); i1++)
            {
                shapechangeevent = z.e;
                shapechangeevent[i1] = shapechangeevent[i1] * f1;
            }

        }
    }

    public void onSwapFrame(com.cardinalblue.android.piccollage.activities.undo.a.e e1)
    {
        h.c(B.a(e1.a.a), e1.a.c);
        h.c(B.a(e1.a.b), e1.a.d);
    }

    public void startCapturing(com.cardinalblue.android.piccollage.events.c c1)
    {
        a(c1.b).a(new bolts.i(c1) {

            final com.cardinalblue.android.piccollage.events.c a;
            final PhotoProtoActivity b;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d() || j1.c())
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.e(null, a.a, false));
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.a.b.t(com.cardinalblue.android.b.g.c(((File)j1.e()).getAbsolutePath()));
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.e((File)j1.e(), a.a, true));
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = PhotoProtoActivity.this;
                a = c1;
                super();
            }
        }, j.b);
    }

    public void startPurchasing(com.cardinalblue.android.piccollage.events.k k1)
    {
        if (F == null || !F.c())
        {
            com.cardinalblue.android.b.k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f07023f), getString(0x104000a), null), "TAG_CANNOT_BIND_IAB");
            com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.l(false));
            return;
        }
        try
        {
            F.a(this, k1.a(), 701, new com.cardinalblue.android.piccollage.iab.util.d.c(k1) {

                final com.cardinalblue.android.piccollage.events.k a;
                final PhotoProtoActivity b;

                public void a(com.cardinalblue.android.piccollage.iab.util.e e1, com.cardinalblue.android.piccollage.iab.util.g g1)
                {
                    Log.v("Editor", (new StringBuilder()).append("Purchase finished: ").append(e1).append(", purchase: ").append(g1).toString());
                    if (PhotoProtoActivity.A(b) == null || e1 == null)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.l(false));
                        return;
                    }
                    switch (e1.a())
                    {
                    default:
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.l(false));
                        return;

                    case 7: // '\007'
                        com.cardinalblue.android.b.k.a(b, 0x7f0701ef, 0);
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.l(true));
                        return;

                    case 0: // '\0'
                        com.cardinalblue.android.piccollage.a.b.f(g1.d(), "share menu");
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.l(true));
                        return;

                    case 6: // '\006'
                        e1 = new ArrayList();
                        e1.add(a.a());
                        PhotoProtoActivity.A(b).a(true, e1, new com.cardinalblue.android.piccollage.iab.util.d.e(this, g1) {

                            final com.cardinalblue.android.piccollage.iab.util.g a;
                            final _cls38 b;

                            public void a(com.cardinalblue.android.piccollage.iab.util.e e1, com.cardinalblue.android.piccollage.iab.util.f f1)
                            {
                                Log.v("Editor", "Query inventory finished.");
                                if (e1.d())
                                {
                                    Log.v("Editor", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
                                } else
                                {
                                    Log.v("Editor", "Query inventory was successful.");
                                    e1 = f1.a(b.a.a());
                                    if (a != null)
                                    {
                                        PhotoProtoActivity.A(b.b).a(e1, null);
                                        return;
                                    }
                                }
                            }

            
            {
                b = _pcls38;
                a = g1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                b = PhotoProtoActivity.this;
                a = k1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.cardinalblue.android.piccollage.events.k k1)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f07010e, 1);
        }
    }

    public void updateCollageEvent(com.cardinalblue.android.piccollage.activities.undo.a.f f1)
    {
        try
        {
            B = Collage.a(f1.a, com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3);
            B.c();
            g.e();
            com.cardinalblue.android.piccollage.controller.d.a(h);
            h.c();
            h = new CollageController(B, g, this);
            h.a(this);
            h.a(j());
            com.cardinalblue.android.piccollage.controller.d.b(h);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.cardinalblue.android.piccollage.activities.undo.a.f f1)
        {
            f1.printStackTrace();
        }
    }

    public void updateScrap(com.cardinalblue.android.piccollage.activities.undo.a.g g1)
    {
        g1.a;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 37
    //                   2 55
    //                   3 77
    //                   4 139;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        g1 = BaseScrapModel.generateScrap(g1.b);
        h.a(g1, false);
        return;
_L3:
        h.a(B.a(g1.b.getId()));
        return;
_L4:
        com.cardinalblue.android.piccollage.view.k k1 = B.a(g1.b.getId());
        if (B.a(g1.b))
        {
            g.c();
            g1 = h.b(k1);
            if (g1 instanceof i)
            {
                ((i)g1).a(false);
                return;
            }
        }
          goto _L1
_L5:
        g1 = com.cardinalblue.android.piccollage.view.h.a(this, (ImageScrapModel)g1.b);
        h.a(g1, null);
        return;
    }

    public void updateScrapBorder(com.cardinalblue.android.piccollage.activities.undo.a.a a1)
    {
        com.cardinalblue.android.piccollage.view.k k1 = B.a(a1.a);
        if (k1 != null && (k1 instanceof g))
        {
            ((g)k1).a(a1.b);
            g.postInvalidate();
        }
    }

    public void updateScrapShadow(com.cardinalblue.android.piccollage.activities.undo.a.b b1)
    {
        com.cardinalblue.android.piccollage.view.k k1 = B.a(b1.a);
        if (k1 != null && (k1 instanceof g))
        {
            ((g)k1).a(b1.b);
            g.postInvalidate();
        }
    }

    static 
    {
        U = (new String[] {
            com.aviary.android.feather.library.filters.a.a.o.name(), com.aviary.android.feather.library.filters.a.a.e.name(), com.aviary.android.feather.library.filters.a.a.i.name(), com.aviary.android.feather.library.filters.a.a.n.name(), com.aviary.android.feather.library.filters.a.a.g.name(), com.aviary.android.feather.library.filters.a.a.s.name(), com.aviary.android.feather.library.filters.a.a.b.name(), com.aviary.android.feather.library.filters.a.a.c.name(), com.aviary.android.feather.library.filters.a.a.t.name()
        });
    }
}

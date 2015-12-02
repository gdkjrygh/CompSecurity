// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.debug.d.e;
import com.facebook.g;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.annotations.IsAudioRecorderEnabled;
import com.facebook.orca.compose.aq;
import com.facebook.orca.photos.picking.b;
import com.facebook.prefs.shared.d;
import com.facebook.widget.text.SimpleVariableTextLayoutView;
import com.google.common.a.es;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.emoji:
//            ComposerPopup, TabbedPageView, i, j, 
//            aa, ag, c, f, 
//            p, k, l, m, 
//            x, o, am, n, 
//            e, w, g, h, 
//            ae, r, d

public class EmojiAttachmentPopup extends ComposerPopup
{

    private static final Class ai = com/facebook/orca/emoji/EmojiAttachmentPopup;
    private ag aA;
    private boolean aB;
    private Handler aC;
    private Handler aD;
    private String aE;
    private int aF;
    private LinearLayout aj;
    private com.facebook.orca.emoji.o ak;
    private View al;
    private Button am;
    private FrameLayout an;
    private FrameLayout ao;
    private ViewStub ap;
    private TabbedPageView aq;
    private LinearLayout ar;
    private Vibrator as;
    private a at;
    private p au;
    private aq av;
    private d aw;
    private boolean ax;
    private boolean ay;
    private int az;

    public EmojiAttachmentPopup()
    {
    }

    private void U()
    {
        if (ap != null)
        {
            return;
        }
        ap = (ViewStub)a(ag, i.emoji_back_stub);
        ap.inflate();
        aq = (TabbedPageView)a(ag, i.emoji_back_container);
        if (ay)
        {
            aq.setEllipsisClickListener(new com.facebook.orca.emoji.i(this));
        }
        aq.setBackspaceTouchListener(new com.facebook.orca.emoji.j(this));
    }

    private View V()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(az, -1);
        View view = new View(n());
        view.setLayoutParams(layoutparams);
        view.setBackgroundResource(h.orca_composer_divider_vertical);
        return view;
    }

    private void W()
    {
        e e1 = com.facebook.debug.d.e.a("loadAndSetEmojiAndButtonOnFront");
        if (o().getConfiguration().orientation == 2)
        {
            X();
        } else
        {
            Y();
        }
        e1.a();
    }

    private void X()
    {
        LinearLayout linearlayout = a(com.facebook.orca.emoji.aa.b, 0, aA.a() - 2, true);
        linearlayout.addView(ao, 0);
        linearlayout.addView(an);
        ar.addView(linearlayout);
    }

    private void Y()
    {
        int i1 = aA.a();
        LinearLayout linearlayout = a(com.facebook.orca.emoji.aa.b, 0, i1, true);
        LinearLayout linearlayout1 = a(com.facebook.orca.emoji.aa.b, i1, i1 - 2, true);
        linearlayout1.addView(ao, 0);
        linearlayout1.addView(an);
        b(al);
        ar.addView(linearlayout);
        ar.addView(linearlayout1);
    }

    private void Z()
    {
        U();
        if (!aq.a())
        {
            aa();
        }
        a(ag, i.emoji_front_container).setVisibility(8);
        a(ag, i.emoji_back_container).setVisibility(0);
        a("backside_button");
    }

    private View a(Context context, Object obj, boolean flag)
    {
        if (!(obj instanceof c))
        {
            throw new RuntimeException("Expected an object of type Emoji");
        }
        obj = (c)obj;
        int l1 = aA.d();
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        if (flag)
        {
            i1 = aA.f();
        } else
        {
            i1 = aA.e();
        }
        i2 = aA.g();
        if (flag)
        {
            j1 = aA.k();
        } else
        {
            j1 = aA.i();
        }
        j2 = aA.h();
        if (flag)
        {
            k1 = aA.l();
        } else
        {
            k1 = aA.j();
        }
        context = au.a(context, ((c) (obj)), new f(this, ((c) (obj)), flag));
        context.setPadding(i2, j1, j2, k1);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(l1, i1));
        return context;
    }

    private View a(LayoutInflater layoutinflater, ViewGroup viewgroup, int i1, int j1, int k1)
    {
        return a(layoutinflater, viewgroup, i1, j1, k1, 0);
    }

    private View a(LayoutInflater layoutinflater, ViewGroup viewgroup, int i1, int j1, int k1, int l1)
    {
        e e1;
        e1 = com.facebook.debug.d.e.a("generateAttachmentButton");
        layoutinflater = layoutinflater.inflate(k.orca_emoji_attachment_item, viewgroup, false);
        ((SimpleVariableTextLayoutView)a(((View) (layoutinflater)), i.attachment_type_text)).setText(a(i1));
        viewgroup = (ImageButton)a(((View) (layoutinflater)), i.attachment_type_logo);
        Resources resources = o();
        aD.postDelayed(new com.facebook.orca.emoji.k(this, viewgroup, resources, j1), 10L);
        k1;
        JVM INSTR tableswitch 0 1: default 104
    //                   0 112
    //                   1 129;
           goto _L1 _L2 _L3
_L1:
        e1.a();
        return layoutinflater;
_L2:
        viewgroup.setOnClickListener(new l(this, l1));
        continue; /* Loop/switch isn't completed */
_L3:
        viewgroup.setOnClickListener(new m(this));
        if (true) goto _L1; else goto _L4
_L4:
    }

    static View a(EmojiAttachmentPopup emojiattachmentpopup, Context context, Object obj, boolean flag)
    {
        return emojiattachmentpopup.a(context, obj, flag);
    }

    private LinearLayout a(x x1, int i1, int j1, boolean flag)
    {
        LinearLayout linearlayout = new LinearLayout(n());
        Object obj = x1.b();
        j1 = Math.min(((List) (obj)).size(), i1 + j1);
        x1 = n();
        for (obj = ((List) (obj)).subList(i1, j1).iterator(); ((Iterator) (obj)).hasNext(); linearlayout.addView(a(((Context) (x1)), (c)((Iterator) (obj)).next(), flag))) { }
        return linearlayout;
    }

    public static EmojiAttachmentPopup a(int i1, int j1, int k1, int l1, boolean flag, int i2, boolean flag1, boolean flag2)
    {
        EmojiAttachmentPopup emojiattachmentpopup = new EmojiAttachmentPopup();
        Bundle bundle = new Bundle();
        bundle.putInt("x", i1);
        bundle.putInt("y", j1);
        bundle.putInt("gravity", i2);
        bundle.putInt("height", k1);
        bundle.putInt("width", l1);
        bundle.putBoolean("showArrowAbove", flag);
        bundle.putBoolean("canComposeAudio", flag1);
        bundle.putBoolean("enableMedia", flag2);
        emojiattachmentpopup.g(bundle);
        return emojiattachmentpopup;
    }

    static String a(EmojiAttachmentPopup emojiattachmentpopup, String s)
    {
        emojiattachmentpopup.aE = s;
        return s;
    }

    private void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            aC.removeMessages(1);
            aB = false;
        } else
        if (motionevent.getAction() == 0)
        {
            aB = true;
            motionevent = aC.obtainMessage(1);
            aC.sendMessageDelayed(motionevent, 400L);
            e(true);
            return;
        }
    }

    static void a(EmojiAttachmentPopup emojiattachmentpopup)
    {
        emojiattachmentpopup.Z();
    }

    static void a(EmojiAttachmentPopup emojiattachmentpopup, int i1)
    {
        emojiattachmentpopup.d(i1);
    }

    static void a(EmojiAttachmentPopup emojiattachmentpopup, MotionEvent motionevent)
    {
        emojiattachmentpopup.a(motionevent);
    }

    static void a(EmojiAttachmentPopup emojiattachmentpopup, c c1, boolean flag)
    {
        emojiattachmentpopup.a(c1, flag);
    }

    private void a(c c1, boolean flag)
    {
        if (ak != null)
        {
            a(c1.toString(), flag);
            as.vibrate(50L);
            ak.a(c1);
        }
    }

    private void a(String s, boolean flag)
    {
        cb cb1 = T();
        cb1.b("action", "emoji_selected");
        cb1.b("emoji", s);
        cb1.a("front_side", flag);
        ah.a(cb1);
    }

    static boolean a(EmojiAttachmentPopup emojiattachmentpopup, boolean flag)
    {
        return emojiattachmentpopup.e(flag);
    }

    private void aa()
    {
        e e1 = com.facebook.debug.d.e.a("loadAndSetEmojisForBackside");
        LinkedList linkedlist = new LinkedList();
        LinkedList linkedlist1 = new LinkedList();
        x x1;
        for (Iterator iterator = com.facebook.orca.emoji.aa.a.iterator(); iterator.hasNext(); linkedlist1.add(new am(String.valueOf(x1.a()), Integer.valueOf(x1.a()), x1.b())))
        {
            x1 = (x)iterator.next();
        }

        com.facebook.orca.emoji.n n1 = new com.facebook.orca.emoji.n(this);
        com.facebook.orca.emoji.e e2 = new com.facebook.orca.emoji.e(this);
        String s = aw.a(w.c, null);
        int i1 = aw.a(com.facebook.orca.emoji.w.d, 0);
        aq.a(linkedlist, linkedlist1, aA, n1, e2, false, s, i1);
        e1.a();
    }

    static int b(EmojiAttachmentPopup emojiattachmentpopup, int i1)
    {
        emojiattachmentpopup.aF = i1;
        return i1;
    }

    static TabbedPageView b(EmojiAttachmentPopup emojiattachmentpopup)
    {
        return emojiattachmentpopup.aq;
    }

    private void b(LayoutInflater layoutinflater)
    {
        e e1 = com.facebook.debug.d.e.a("addAttachmentOperationItems");
        View view = a(layoutinflater, aj, o.photo_dialog_image_search, h.orca_composer_attach_search_button, 0, 4);
        View view2 = V();
        aj.addView(view2);
        av.a(this, layoutinflater);
        av.b(this, layoutinflater);
        aj.addView(view);
        if (((Boolean)at.b()).booleanValue() && ax)
        {
            layoutinflater = a(layoutinflater, aj, o.photo_dialog_record_audio, h.orca_composer_attach_recorder_button, 1);
            View view1 = V();
            aj.addView(view1);
            aj.addView(layoutinflater);
        }
        e1.a();
    }

    private void b(View view)
    {
        view = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        int i1 = ((android.widget.FrameLayout.LayoutParams) (view)).width + ((android.widget.FrameLayout.LayoutParams) (view)).leftMargin + ((android.widget.FrameLayout.LayoutParams) (view)).rightMargin;
        if (aA.d() > i1)
        {
            view.rightMargin = (aA.d() - i1) + ((android.widget.FrameLayout.LayoutParams) (view)).rightMargin;
        }
    }

    static com.facebook.orca.emoji.o c(EmojiAttachmentPopup emojiattachmentpopup)
    {
        return emojiattachmentpopup.ak;
    }

    private void d(int i1)
    {
        if (ak != null)
        {
            ak.a(i1);
        }
    }

    private boolean e(boolean flag)
    {
        f(flag);
        return aB;
    }

    private void f(boolean flag)
    {
        if (ak != null)
        {
            if (flag)
            {
                as.vibrate(50L);
            }
            ak.c();
        }
    }

    protected String S()
    {
        return "emoji_attachment_popup";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.facebook.debug.d.e.b(3L);
        bundle = com.facebook.debug.d.e.a("EmojiAttachmentPopup onCreateView");
        as = (Vibrator)n().getSystemService("vibrator");
        Q();
        e e1 = com.facebook.debug.d.e.a("layoutInflation");
        ag = layoutinflater.inflate(k.orca_emoji_popup, viewgroup, false);
        e1.a();
        al = a(ag, i.emoji_show_back);
        ao = (FrameLayout)a(ag, i.emoji_show_back_container);
        am = (Button)a(ag, i.emoji_backspace);
        an = (FrameLayout)a(ag, i.emoji_backspace_container);
        ar = (LinearLayout)a(ag, i.emoji_front_content);
        aj = (LinearLayout)a(ag, i.attachment_operation_container);
        O();
        P();
        b(layoutinflater);
        al.setOnClickListener(new com.facebook.orca.emoji.g(this));
        am.setOnTouchListener(new com.facebook.orca.emoji.h(this));
        if (ay)
        {
            ar.removeAllViews();
            W();
        } else
        {
            Z();
        }
        bundle.a();
        com.facebook.debug.d.e.a(ai);
        return ag;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ax = k().getBoolean("canComposeAudio");
        ay = k().getBoolean("enableMedia");
        bundle = o();
        az = j.a(bundle, 2.0F);
        aA = (new ae(bundle, new r())).a(ac, ab - bundle.getDimensionPixelSize(g.emoji_category_height_dp) - af, ad);
        bundle = t.a(n());
        at = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsAudioRecorderEnabled);
        au = (p)bundle.a(com/facebook/orca/emoji/p);
        av = (aq)bundle.a(com/facebook/orca/compose/aq);
        aw = (d)bundle.a(com/facebook/prefs/shared/d);
        aC = new com.facebook.orca.emoji.d(this);
        aD = new Handler();
    }

    public void a(LayoutInflater layoutinflater)
    {
        layoutinflater = a(layoutinflater, ((ViewGroup) (aj)), o.photo_dialog_take_photo, h.orca_composer_attach_camera_button, 0, 2);
        View view = V();
        aj.addView(layoutinflater);
        aj.addView(view);
    }

    public void a(LayoutInflater layoutinflater, b b1)
    {
        int i1;
        if (b1 == b.CAMERA)
        {
            i1 = h.orca_composer_attach_camera_button;
        } else
        {
            i1 = h.orca_composer_attach_photo_button;
        }
        layoutinflater = a(layoutinflater, ((ViewGroup) (aj)), o.photo_dialog_choose_photo, i1, 0, 1);
        b1 = V();
        aj.addView(layoutinflater);
        aj.addView(b1);
    }

    public void a(com.facebook.orca.emoji.o o1)
    {
        a(((com.facebook.orca.emoji.b) (o1)));
        ak = o1;
    }

    public void h()
    {
        super.h();
        aD.removeCallbacksAndMessages(null);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (!n.a(aE))
        {
            aw.b().a(w.c, aE).a(com.facebook.orca.emoji.w.d, aF).a();
        }
    }

}

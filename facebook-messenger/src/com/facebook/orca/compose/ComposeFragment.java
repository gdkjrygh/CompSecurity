// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.i;
import android.support.v4.app.p;
import android.support.v4.app.q;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.bp;
import com.facebook.analytics.cb;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.fragment.FbFragment;
import com.facebook.c.s;
import com.facebook.common.w.j;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.f;
import com.facebook.fbservice.ops.m;
import com.facebook.g;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.l.k;
import com.facebook.location.Coordinates;
import com.facebook.location.GetDeviceLocationParams;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.o;
import com.facebook.orca.annotations.IsAudioRecorderEnabled;
import com.facebook.orca.annotations.IsEmojiAttachmentPopupEnabled;
import com.facebook.orca.annotations.IsEmptyComposeLikeEnabled;
import com.facebook.orca.annotations.IsMmsSendPermitted;
import com.facebook.orca.annotations.IsStickersFeatureEnabled;
import com.facebook.orca.chatheads.AutoDismissAlertFragment;
import com.facebook.orca.common.ui.widgets.a;
import com.facebook.orca.emoji.EmojiAttachmentPopup;
import com.facebook.orca.emoji.aa;
import com.facebook.orca.emoji.ae;
import com.facebook.orca.emoji.ag;
import com.facebook.orca.emoji.ah;
import com.facebook.orca.emoji.c;
import com.facebook.orca.emoji.r;
import com.facebook.orca.emoji.z;
import com.facebook.orca.f.ac;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.orca.photos.picking.PickMediaParams;
import com.facebook.orca.prefs.az;
import com.facebook.orca.server.aq;
import com.facebook.orca.stickers.Sticker;
import com.facebook.orca.stickers.StickerPopup;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.orca.threadview.dm;
import com.facebook.prefs.shared.d;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.text.BetterEditTextView;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.CharMatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.compose:
//            ak, aa, aj, av, 
//            x, y, AudioComposerView, ap, 
//            ComposeAttachmentContainer, s, u, v, 
//            w, ComposeRootView, t, am, 
//            an, z, ab, ac, 
//            ad, ae, af, ag, 
//            ah, p, q, aq, 
//            MessageDraft, ai, o, r, 
//            al

public class ComposeFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/compose/ComposeFragment;
    private static int b;
    private static int c;
    private static int d;
    private com.facebook.orca.common.a.b Z;
    private ViewGroup aA;
    private com.facebook.fbservice.ops.k aB;
    private com.facebook.fbservice.ops.n aC;
    private ThreadViewSpec aD;
    private PickMediaOperation aE;
    private ak aF;
    private Location aG;
    private Boolean aH;
    private an aI;
    private am aJ;
    private com.facebook.orca.compose.av aK;
    private ap aL;
    private ComposeAttachmentContainer aM;
    private com.facebook.orca.compose.aq aN;
    private UserKey aO;
    private boolean aP;
    private int aQ;
    private long aR;
    private long aS;
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private Runnable aX;
    private EmojiAttachmentPopup aY;
    private StickerPopup aZ;
    private k aa;
    private az ab;
    private LocationManager ac;
    private LayoutInflater ad;
    private com.facebook.orca.f.n ae;
    private z af;
    private javax.inject.a ag;
    private javax.inject.a ah;
    private com.facebook.ui.media.b.a ai;
    private KeyguardManager aj;
    private av ak;
    private javax.inject.a al;
    private ac am;
    private s an;
    private javax.inject.a ao;
    private javax.inject.a ap;
    private View aq;
    private EditText ar;
    private ImageButton as;
    private ImageButton at;
    private ImageButton au;
    private View av;
    private TextView aw;
    private ImageView ax;
    private TextView ay;
    private AudioComposerView az;
    private ah ba;
    private al bb;
    private Handler bc;
    private boolean bd;
    private int be;
    private boolean bf;
    private boolean bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private Sticker bl;
    private String bm;
    private String bn;
    private com.facebook.orca.f.k e;
    private com.facebook.ui.media.attachments.d f;
    private d g;
    private a h;
    private com.facebook.orca.f.z i;

    public ComposeFragment()
    {
        aD = ThreadViewSpec.a;
        aF = ak.INIT;
    }

    static void A(ComposeFragment composefragment)
    {
        composefragment.aK();
    }

    static void B(ComposeFragment composefragment)
    {
        composefragment.aL();
    }

    static void C(ComposeFragment composefragment)
    {
        composefragment.aw();
    }

    static PickMediaOperation D(ComposeFragment composefragment)
    {
        return composefragment.aE;
    }

    static com.facebook.orca.compose.aq E(ComposeFragment composefragment)
    {
        return composefragment.aN;
    }

    static com.facebook.ui.media.attachments.d F(ComposeFragment composefragment)
    {
        return composefragment.f;
    }

    static d G(ComposeFragment composefragment)
    {
        return composefragment.g;
    }

    static s H(ComposeFragment composefragment)
    {
        return composefragment.an;
    }

    static void I(ComposeFragment composefragment)
    {
        composefragment.ay();
    }

    static void J(ComposeFragment composefragment)
    {
        composefragment.aJ();
    }

    static al K(ComposeFragment composefragment)
    {
        return composefragment.bb;
    }

    private void Z()
    {
        while (aY == null || !bd) 
        {
            return;
        }
        if (ba != null)
        {
            ba.a();
        } else
        {
            aY.a();
        }
        k(false);
    }

    static com.facebook.fbservice.ops.n a(ComposeFragment composefragment, com.facebook.fbservice.ops.n n1)
    {
        composefragment.aC = n1;
        return n1;
    }

    static EmojiAttachmentPopup a(ComposeFragment composefragment)
    {
        return composefragment.aY;
    }

    static Sticker a(ComposeFragment composefragment, Sticker sticker)
    {
        composefragment.bl = sticker;
        return sticker;
    }

    private void a(int i1, int j1)
    {
        af.a(ar.getText(), (int)ar.getTextSize(), i1, j1);
    }

    private void a(long l1)
    {
        if (bb != null)
        {
            bc.removeCallbacksAndMessages(null);
            bc.postDelayed(new com.facebook.orca.compose.aa(this), l1);
        }
    }

    private void a(Location location)
    {
        if (aF != ak.NO_LOCATION)
        {
            a(ak.HAS_LOCATION, location);
        }
    }

    static void a(ComposeFragment composefragment, int i1)
    {
        composefragment.f(i1);
    }

    static void a(ComposeFragment composefragment, int i1, int j1)
    {
        composefragment.a(i1, j1);
    }

    static void a(ComposeFragment composefragment, long l1)
    {
        composefragment.a(l1);
    }

    static void a(ComposeFragment composefragment, Location location)
    {
        composefragment.a(location);
    }

    static void a(ComposeFragment composefragment, c c1)
    {
        composefragment.a(c1);
    }

    static void a(ComposeFragment composefragment, CharSequence charsequence, com.facebook.orca.common.ui.widgets.d d1)
    {
        composefragment.a(charsequence, d1);
    }

    static void a(ComposeFragment composefragment, String s1)
    {
        composefragment.g(s1);
    }

    static void a(ComposeFragment composefragment, Throwable throwable)
    {
        composefragment.a(throwable);
    }

    static void a(ComposeFragment composefragment, boolean flag)
    {
        composefragment.k(flag);
    }

    static void a(ComposeFragment composefragment, boolean flag, boolean flag1)
    {
        composefragment.a(flag, flag1);
    }

    private void a(aj aj1, DialogFragment dialogfragment, String s1)
    {
        Object obj = q();
        ad ad1 = ((q) (obj)).a();
        obj = ((q) (obj)).a(s1);
        if (obj != null)
        {
            ad1.a(((Fragment) (obj)));
        }
        int ai1[] = new int[2];
        z().getLocationOnScreen(ai1);
        if (ba != null)
        {
            dialogfragment.b(false);
            int i1 = aq.getHeight();
            if (aj1.e)
            {
                i1 = 0;
            } else
            {
                i1 -= aj1.g;
            }
            ba.a(dialogfragment, s1, i1, ai1[0], aj1.c);
            return;
        } else
        {
            dialogfragment.a(ad1, s1);
            return;
        }
    }

    private void a(ak ak1, Location location)
    {
        boolean flag1 = true;
        aF = ak1;
        aG = location;
        if (ak1 == ak.NO_LOCATION)
        {
            as.setImageResource(j(false));
        } else
        if (ak1 == ak.FINDING_LOCATION)
        {
            as.setImageResource(j(true));
        } else
        if (ak1 == ak.HAS_LOCATION)
        {
            as.setImageResource(j(true));
        } else
        if (ak1 == ak.LOCATION_ERROR)
        {
            aF = ak.NO_LOCATION;
            as.setImageResource(j(true));
        }
        if (aK != null)
        {
            location = aK;
            boolean flag;
            if (ak1 != ak.NO_LOCATION)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (aH == null)
            {
                flag1 = false;
            }
            location.a(flag, flag1, al());
        }
    }

    private void a(c c1)
    {
        af.a(ar, c1);
    }

    private void a(CharSequence charsequence, com.facebook.orca.common.ui.widgets.d d1)
    {
        if (u())
        {
            h.a(aq, charsequence, d1);
        }
    }

    private void a(String s1, Fragment fragment)
    {
        ad ad1 = q().a();
        ad1.a(fragment, s1);
        ad1.a();
    }

    private void a(Throwable throwable)
    {
        if (aF != ak.NO_LOCATION)
        {
            a(ak.LOCATION_ERROR, ((Location) (null)));
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        ag();
        if (aO == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (aO.a() != n.FACEBOOK)
        {
            return;
        }
        Object obj;
        int i1;
        long l1;
        try
        {
            l1 = System.currentTimeMillis();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.d(a, "Exception sending typing notifications", ((Throwable) (obj)));
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        aS = l1;
        obj = ar.getText();
        i1 = ((flag2) ? 1 : 0);
        if (flag1) goto _L2; else goto _L1
_L1:
        if (u()) goto _L4; else goto _L3
_L3:
        i1 = ((flag2) ? 1 : 0);
_L2:
        if (!aa.b())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (aQ == i1)
        {
            if (aQ != 1)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (l1 - aR < 10000L)
            {
                av();
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        i1 = ((flag2) ? 1 : 0);
        if (((Editable) (obj)).length() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = ((flag2) ? 1 : 0);
        if (l1 - aS < 10000L)
        {
            i1 = 1;
        }
        if (true) goto _L2; else goto _L5
_L5:
        aQ = i1;
        aR = l1;
        String s1 = aO.b();
        aa.a(s1, i1);
        if (aQ == 1)
        {
            av();
        }
    }

    private boolean a(ImageButton imagebutton, MotionEvent motionevent)
    {
        Rect rect = new Rect();
        imagebutton.getWindowVisibleDisplayFrame(rect);
        int ai1[] = new int[2];
        imagebutton.getLocationOnScreen(ai1);
        rect.offset(ai1[0], ai1[1]);
        return rect.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
    }

    static boolean a(ComposeFragment composefragment, MotionEvent motionevent)
    {
        return composefragment.b(motionevent);
    }

    static boolean a(ComposeFragment composefragment, ImageButton imagebutton, MotionEvent motionevent)
    {
        return composefragment.a(imagebutton, motionevent);
    }

    private void aA()
    {
        az();
        aW = false;
        aw();
    }

    private void aB()
    {
        PickMediaParams pickmediaparams = new PickMediaParams(true);
        pickmediaparams.a(n().getString(o.image_attachment_attach_image));
        aE.a(pickmediaparams);
    }

    private void aC()
    {
        if (aY != null)
        {
            Z();
        }
        k(false);
    }

    private void aD()
    {
        if (!q().c())
        {
            com.facebook.debug.log.b.d(a, "FragmentManager cannot commit transactions. Not showing sticker popup.");
            return;
        } else
        {
            Z();
            aj aj1 = aH();
            aZ = StickerPopup.a(aj1.a[0], aj1.b, aj1.c, aj1.d, aj1.e, aj1.f);
            aZ.a(new x(this));
            aZ.a(2, 0);
            a(aj1, aZ, "stickerKeyboard");
            l(true);
            return;
        }
    }

    private void aE()
    {
        while (aZ == null || !bd) 
        {
            return;
        }
        if (ba != null)
        {
            ba.a();
        } else
        {
            aZ.a();
        }
        l(false);
    }

    private void aF()
    {
        aG();
    }

    private void aG()
    {
        if (!q().c())
        {
            com.facebook.debug.log.b.b(a, "FragmentManager cannot commit transactions. bailing out");
            return;
        }
        aE();
        com.facebook.debug.d.e.b(3L);
        e e1 = com.facebook.debug.d.e.a("openEmojiAttachmentsKeyboard");
        aj aj1 = aH();
        boolean flag;
        if (aU)
        {
            flag = ((Boolean)ao.b()).booleanValue();
        } else
        {
            flag = true;
        }
        aY = EmojiAttachmentPopup.a(aj1.a[0], aj1.b, aj1.c, aj1.d, aj1.e, aj1.f, aI(), flag);
        aY.a(new y(this));
        aY.a(2, 0);
        a(aj1, aY, "emojiKeyboard");
        k(true);
        e1.a();
        com.facebook.debug.d.e.a(a);
    }

    private aj aH()
    {
        int i1;
        int j1;
        int k1;
        ar.requestFocus();
        Object obj = (WindowManager)n().getSystemService("window");
        j1 = ((WindowManager) (obj)).getDefaultDisplay().getHeight();
        int l1 = ((WindowManager) (obj)).getDefaultDisplay().getWidth();
        obj = new Rect();
        int ai1[] = new int[2];
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag;
        if (ba != null)
        {
            ba.a(((Rect) (obj)));
            l1 = ba.c();
            aq.getLocationInWindow(ai1);
        } else
        {
            m().c().getDecorView().getWindowVisibleDisplayFrame(((Rect) (obj)));
            aq.getLocationInWindow(ai1);
        }
        i2 = ai1[1];
        l2 = i2 + aq.getHeight();
        k1 = j1 - l2;
        i1 = i2 - ((Rect) (obj)).top;
        flag = false;
        j2 = com.facebook.common.w.j.a(o(), 100F);
        k2 = EmojiAttachmentPopup.b(n());
        if (k1 <= j2 && i1 > k1)
        {
            j2 = 0x10000053;
            i2 = j1 - (i2 + k2);
        } else
        {
            j2 = 0x10000033;
            i2 = l2 - (((Rect) (obj)).top + k2);
            i1 = k1 + k2;
            flag = true;
        }
        j1 = o().getDimensionPixelSize(g.emoji_category_height_dp);
        j1 = j1 + (new ae(o(), new r())).a(l1, i1 - (j1 + k2), flag).m() + k2;
        if (o().getConfiguration().orientation == 2)
        {
            j1 = com.facebook.common.w.j.a(o(), 150F);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        k1 = i1;
_L4:
        return new aj(this, ai1, i2, k1, l1, flag, j2, k2);
_L2:
        k1 = j1;
        if (i1 <= j1)
        {
            k1 = i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean aI()
    {
        if (!aD.c()) goto _L2; else goto _L1
_L1:
        if (!aU) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return bk;
_L2:
        if (!dm.a(aD))
        {
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void aJ()
    {
        if (bh || !((Boolean)al.b()).booleanValue())
        {
            return;
        }
        bh = true;
        bi = true;
        R();
        ah();
        if (aD.a())
        {
            g.b().a(com.facebook.orca.emoji.q.a(aD.d()), 1).a();
        }
        if (n() instanceof Activity)
        {
            l().setRequestedOrientation(1);
        }
        az.setVisibility(0);
        az.a();
        aA.setVisibility(8);
        az.setClickable(true);
        Z();
        ((InputMethodManager)n().getSystemService("input_method")).hideSoftInputFromWindow(ar.getWindowToken(), 0);
        a(0L);
    }

    private void aK()
    {
        if (!bh)
        {
            return;
        }
        bh = false;
        bi = false;
        ah();
        if (aD.a())
        {
            g.b().a(com.facebook.orca.emoji.q.a(aD.d()), 0).a();
        }
        az.setVisibility(8);
        az.b();
        aA.setVisibility(0);
        az.setClickable(false);
        if (n() instanceof Activity)
        {
            l().setRequestedOrientation(-1);
        }
        a(0L);
    }

    private void aL()
    {
        if (aY == null || aY.R())
        {
            b();
        }
    }

    private String aM()
    {
        if (!com.facebook.common.w.n.a(bn))
        {
            return bn;
        } else
        {
            bn = Long.toString(Z.a());
            return bn;
        }
    }

    private boolean aa()
    {
        return !bh;
    }

    private boolean ab()
    {
        return aF != ak.NO_LOCATION && aL == ap.EXPANDED;
    }

    private String ac()
    {
        if (bl != null)
        {
            return null;
        }
        if (Q())
        {
            return new String(Character.toChars(aa.c.b()));
        } else
        {
            return ar.getText().toString();
        }
    }

    private List ad()
    {
        if (bl != null)
        {
            com.facebook.messages.model.share.ShareMedia sharemedia = (new com.facebook.messages.model.share.d()).a(bl.b().toString()).b("").c("link").d(bl.b().toString()).g();
            return hq.a(new Share[] {
                (new com.facebook.messages.model.share.b()).a("").b("").c("").d(bl.b().toString()).e(bl.a()).a(es.a(sharemedia)).h()
            });
        } else
        {
            return hq.a();
        }
    }

    private String ae()
    {
        if (bl != null)
        {
            return bl.a();
        } else
        {
            return null;
        }
    }

    private List af()
    {
        if (bl == null)
        {
            return aM.getMediaResources();
        } else
        {
            return new ArrayList();
        }
    }

    private void ag()
    {
        if (!aP && !aD.c())
        {
            if (aD.a())
            {
                aO = i.a(aD.d());
            } else
            {
                aO = UserKey.a(aD.f());
            }
            aP = true;
        }
    }

    private void ah()
    {
        boolean flag = true;
        if (!al()) goto _L2; else goto _L1
_L1:
        if (!aD.c()) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            ap();
            return;
        } else
        {
            a(ak.NO_LOCATION, ((Location) (null)));
            return;
        }
_L4:
        if (!aD.c())
        {
            flag = am.c(aD).asBoolean(true);
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void ai()
    {
        com.facebook.debug.b.a.b(ao());
        i(false);
    }

    private void aj()
    {
        View view = ad.inflate(com.facebook.k.orca_location_services_composer_dialog_content, null);
        ((TextView)view.findViewById(com.facebook.i.text_message)).setText(o.compose_location_services_setting_disabled_description);
        com.facebook.orca.compose.s s1 = new com.facebook.orca.compose.s(this);
        AutoDismissAlertFragment.a(o.compose_location_services_disabled_title, o.dialog_enable, s1, o.dialog_not_now, null, view).a(p(), "ALERT_DIALOG_TAG");
    }

    private void ak()
    {
        if (com.facebook.common.j.a.a(n(), "android.settings.LOCATION_SOURCE_SETTINGS"))
        {
            d("android.settings.LOCATION_SOURCE_SETTINGS");
            return;
        }
        if (com.facebook.common.j.a.a(n(), "android.settings.SETTINGS"))
        {
            d("android.settings.SETTINGS");
            return;
        } else
        {
            d(((String) (null)));
            return;
        }
    }

    private boolean al()
    {
        return !aU && !bh && !aV && am() && an();
    }

    private boolean am()
    {
        return g.a(com.facebook.orca.prefs.n.x, true);
    }

    private boolean an()
    {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        return ac.getBestProvider(criteria, true) != null;
    }

    private boolean ao()
    {
        return n().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    private void ap()
    {
        Location location = e.d();
        if (location != null)
        {
            a(ak.HAS_LOCATION, location);
        } else
        {
            a(ak.FINDING_LOCATION, ((Location) (null)));
        }
        if (aC != null)
        {
            return;
        } else
        {
            GetDeviceLocationParams getdevicelocationparams = GetDeviceLocationParams.newBuilder().a(100F).a(10000L).l();
            Bundle bundle = new Bundle();
            bundle.putParcelable("getDeviceLocationParams", getdevicelocationparams);
            aC = aB.a(aq.A, bundle).a();
            aC.a(new u(this));
            com.google.common.d.a.i.a(aC, new v(this));
            return;
        }
    }

    private void aq()
    {
        aG = null;
        a(ak.NO_LOCATION, ((Location) (null)));
    }

    private boolean ar()
    {
        if (!((Boolean)ah.b()).booleanValue())
        {
            return false;
        }
        if (aD.c())
        {
            if (aU || aV)
            {
                return false;
            } else
            {
                return bk;
            }
        }
        return !dm.a(aD);
    }

    private void as()
    {
        boolean flag = ar();
        ImageButton imagebutton = at;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        imagebutton.setVisibility(i1);
    }

    private void at()
    {
        boolean flag;
        if (!ao() || aU || aV)
        {
            flag = false;
        } else
        if (aL == ap.EXPANDED || !Q())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            as.setVisibility(0);
            return;
        } else
        {
            as.setVisibility(8);
            return;
        }
    }

    private void au()
    {
        ax();
        aw();
        a(true, false);
    }

    private void av()
    {
        if (aT)
        {
            return;
        } else
        {
            aX = new w(this);
            ar.postDelayed(aX, 10000L);
            aT = true;
            return;
        }
    }

    private void aw()
    {
        boolean flag;
        if (((Boolean)ap.b()).booleanValue() && aW)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Q() && !flag)
        {
            aw.setShadowLayer(1.0F, 0.0F, 1.0F, 0);
            av.setEnabled(false);
        } else
        {
            aw.setShadowLayer(1.0F, 0.0F, 1.0F, f.composer_button_shadow);
            av.setEnabled(true);
        }
        if (Q() && flag)
        {
            ax.setVisibility(0);
            aw.setVisibility(4);
            return;
        } else
        {
            ax.setVisibility(4);
            aw.setVisibility(0);
            return;
        }
    }

    private void ax()
    {
        int i1 = ar.getText().length();
        if (i1 > c)
        {
            if (i1 > d)
            {
                ay.setTextColor(o().getColor(f.red_warning_color));
            } else
            {
                ay.setTextColor(o().getColor(f.grey53));
            }
            ay.setText(Integer.toString(b - i1));
            ay.setVisibility(0);
            return;
        } else
        {
            ay.setText("");
            ay.setVisibility(8);
            return;
        }
    }

    private void ay()
    {
        f("sticker_clicked");
    }

    private void az()
    {
        String s1;
        if (aU)
        {
            s1 = "sms_send_clicked";
        } else
        if (bh)
        {
            s1 = "audio_send_triggered";
        } else
        {
            s1 = "send_clicked";
        }
        f(s1);
    }

    static SpannableString b(ComposeFragment composefragment, String s1)
    {
        return composefragment.e(s1);
    }

    static StickerPopup b(ComposeFragment composefragment)
    {
        return composefragment.aZ;
    }

    private void b(Location location)
    {
        if (aF != ak.NO_LOCATION)
        {
            a(ak.HAS_LOCATION, location);
        }
    }

    static void b(ComposeFragment composefragment, Location location)
    {
        composefragment.b(location);
    }

    static void b(ComposeFragment composefragment, boolean flag)
    {
        composefragment.l(flag);
    }

    private boolean b(MotionEvent motionevent)
    {
        int ai1[] = new int[2];
        aq.getLocationInWindow(ai1);
        float f1 = motionevent.getY();
        motionevent.setLocation(motionevent.getX(), motionevent.getY() - (float)ai1[1]);
        boolean flag;
        if (((ComposeRootView)aq).getEmojiAttachmentTouchDelegate().onTouchEvent(motionevent) || ((ComposeRootView)aq).getStickerTouchDelegate().onTouchEvent(motionevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        motionevent.setLocation(motionevent.getX(), f1);
        return flag;
    }

    static ah c(ComposeFragment composefragment)
    {
        return composefragment.ba;
    }

    static boolean c(ComposeFragment composefragment, boolean flag)
    {
        composefragment.bj = flag;
        return flag;
    }

    static View d(ComposeFragment composefragment)
    {
        return composefragment.aq;
    }

    static void d(ComposeFragment composefragment, boolean flag)
    {
        composefragment.i(flag);
    }

    private void d(String s1)
    {
        View view = ad.inflate(com.facebook.k.orca_location_services_composer_dialog_content, null);
        TextView textview = (TextView)view.findViewById(com.facebook.i.text_message);
        if (s1 != null)
        {
            textview.setText(o.compose_location_services_phone_disabled_description);
        } else
        {
            textview.setText(o.compose_location_services_phone_disabled_description2);
        }
        if (s1 != null)
        {
            s1 = new com.facebook.orca.compose.t(this, s1);
            s1 = AutoDismissAlertFragment.a(o.compose_location_services_disabled_title, o.compose_location_services_phone_disabled_go_to_settings_button, s1, o.dialog_cancel, null, view);
        } else
        {
            s1 = AutoDismissAlertFragment.a(o.compose_location_services_disabled_title, o.dialog_ok, null, 0, null, view);
        }
        s1.a(p(), "ALERT_DIALOG_TAG");
    }

    private SpannableString e(String s1)
    {
        Resources resources = o();
        com.facebook.common.w.o o1 = new com.facebook.common.w.o(o());
        o1.a(new ForegroundColorSpan(resources.getColor(f.notification_greyish_light)), 33);
        o1.a(s1);
        o1.a();
        return o1.b();
    }

    static ap e(ComposeFragment composefragment)
    {
        return composefragment.aL;
    }

    private void e(int i1)
    {
        String s1 = ar.getText().toString();
        Intent intent = new Intent(n(), com/facebook/orca/threadview/ThreadViewActivity);
        intent.putExtra("thread_view_spec", aD);
        intent.putExtra("show_composer", true);
        intent.putExtra("composer_initial_text", s1);
        intent.putExtra("trigger", bm);
        if (i1 != -1)
        {
            intent.putExtra("open_media_picker_source", i1);
        }
        intent.setFlags(0x4000000);
        a(intent);
        if (aJ != null)
        {
            aJ.a(aD);
        }
    }

    static boolean e(ComposeFragment composefragment, boolean flag)
    {
        composefragment.aT = flag;
        return flag;
    }

    private int f(boolean flag)
    {
        if (flag)
        {
            return h.orca_composer_chat_head_send_sms_button;
        } else
        {
            return h.orca_composer_chat_head_send_button;
        }
    }

    static ImageButton f(ComposeFragment composefragment)
    {
        return composefragment.au;
    }

    private void f(int i1)
    {
        if (n() instanceof Activity)
        {
            if (aY != null && aY.v())
            {
                aY.a();
                k(false);
            }
            PickMediaParams pickmediaparams = new PickMediaParams(true);
            pickmediaparams.a(aM.getMediaResources());
            aE.a(pickmediaparams, i1);
            return;
        } else
        {
            e(i1);
            return;
        }
    }

    private void f(String s1)
    {
        if (ar.getText().length() <= b && aI != null)
        {
            ab.c(s1);
            if (aD.a() && aF == ak.HAS_LOCATION)
            {
                e.a(aD.d(), aG, System.currentTimeMillis());
            }
            aI.a();
            if (ba != null)
            {
                ba.a();
                return;
            }
        }
    }

    private int g(boolean flag)
    {
        if (flag)
        {
            return h.orca_composer_chat_head_popup_button_active;
        } else
        {
            return h.orca_composer_chat_head_popup_button;
        }
    }

    static ImageButton g(ComposeFragment composefragment)
    {
        return composefragment.at;
    }

    private void g(String s1)
    {
        cb cb1 = new cb("click");
        cb1.f("emoji_attachment_popup");
        cb1.b("action", s1);
        ak.a(cb1);
    }

    private int h(boolean flag)
    {
        if (flag)
        {
            return h.orca_stickers_on;
        } else
        {
            return h.orca_stickers_off;
        }
    }

    static EditText h(ComposeFragment composefragment)
    {
        return composefragment.ar;
    }

    static void i(ComposeFragment composefragment)
    {
        composefragment.ai();
    }

    private void i(boolean flag)
    {
        if (!am())
        {
            aj();
            return;
        }
        if (!an())
        {
            ak();
            return;
        }
        com.facebook.common.w.q q1;
        if (flag || aF == ak.NO_LOCATION)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q1 = com.facebook.common.w.q.valueOf(flag);
        am.a(aD, q1);
        if (flag)
        {
            aH = Boolean.TRUE;
            ap();
            ab.c("enabled_shared_location_in_message");
            return;
        } else
        {
            aH = Boolean.FALSE;
            aq();
            ab.c("disabled_shared_location_in_message");
            return;
        }
    }

    private int j(boolean flag)
    {
        if (flag)
        {
            return h.orca_composer_chat_head_location_on;
        } else
        {
            return h.orca_composer_chat_head_location_off;
        }
    }

    static boolean j(ComposeFragment composefragment)
    {
        return composefragment.bg;
    }

    static void k(ComposeFragment composefragment)
    {
        composefragment.aE();
    }

    private void k(boolean flag)
    {
        if (bf == flag)
        {
            return;
        }
        bf = flag;
        if (flag)
        {
            au.setImageResource(g(true));
            return;
        } else
        {
            au.setImageResource(g(false));
            return;
        }
    }

    static void l(ComposeFragment composefragment)
    {
        composefragment.aD();
    }

    private void l(boolean flag)
    {
        bg = flag;
        at.setImageResource(h(flag));
    }

    static boolean m(ComposeFragment composefragment)
    {
        return composefragment.bf;
    }

    static void n(ComposeFragment composefragment)
    {
        composefragment.aC();
    }

    static javax.inject.a o(ComposeFragment composefragment)
    {
        return composefragment.ag;
    }

    static void p(ComposeFragment composefragment)
    {
        composefragment.aF();
    }

    static void q(ComposeFragment composefragment)
    {
        composefragment.aB();
    }

    static void r(ComposeFragment composefragment)
    {
        composefragment.aA();
    }

    static void s(ComposeFragment composefragment)
    {
        composefragment.au();
    }

    static boolean t(ComposeFragment composefragment)
    {
        return composefragment.bj;
    }

    static boolean u(ComposeFragment composefragment)
    {
        return composefragment.ab();
    }

    static void v(ComposeFragment composefragment)
    {
        composefragment.ah();
    }

    static void w(ComposeFragment composefragment)
    {
        composefragment.Z();
    }

    static String x(ComposeFragment composefragment)
    {
        return composefragment.aM();
    }

    static ComposeAttachmentContainer y(ComposeFragment composefragment)
    {
        return composefragment.aM;
    }

    static void z(ComposeFragment composefragment)
    {
        composefragment.az();
    }

    public void A()
    {
        super.A();
        bd = true;
        Z();
        aE();
        boolean flag = aj.inKeyguardRestrictedInputMode();
        if (ab())
        {
            bj = false;
            if (flag)
            {
                bj = true;
            } else
            {
                ah();
            }
        }
        if (bi)
        {
            aJ();
        }
    }

    public void B()
    {
        super.B();
        bd = false;
        h.a();
        V();
    }

    public void C()
    {
        super.C();
        ar.clearFocus();
    }

    public Message O()
    {
        if (com.facebook.common.w.n.a(bn))
        {
            bn = Long.toString(Z.a());
        }
        return ae.a(900, aD, bn, ac(), ae(), -1L, -1L, Coordinates.a(aG), af(), ad());
    }

    public boolean P()
    {
        Iterator iterator;
        int i1;
        int j1;
        int k1;
        j1 = Math.max(android_src.mms.c.j(), android_src.mms.c.i());
        i1 = android_src.mms.c.b();
        k1 = aM.getMediaAttachments().keySet().size();
        iterator = aM.getMediaAttachments().keySet().iterator();
        i1 -= 5000;
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        com.facebook.ui.media.attachments.a a1 = (com.facebook.ui.media.attachments.a)iterator.next();
        int l1 = i1 / k1;
        abyte0 = ai.a(a1, j1, j1, l1);
        if (abyte0 != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i1 -= abyte0.length;
        if (i1 < 0) goto _L3; else goto _L5
_L2:
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public boolean Q()
    {
        return com.facebook.common.w.n.a(CharMatcher.WHITESPACE.trimFrom(ar.getText().toString())) && aM.b() && bl == null;
    }

    public void R()
    {
        if (bl == null)
        {
            ar.setText("");
            aM.a();
        } else
        {
            bl = null;
        }
        bn = null;
        aw();
    }

    public void T()
    {
        ah();
    }

    public void U()
    {
        aD = ThreadViewSpec.a;
        aU = false;
        aV = false;
        aW = false;
        aH = null;
        aG = null;
        as.setImageResource(h.orca_composer_location_off);
        aF = ak.INIT;
        aP = false;
        aO = null;
        ar.setText("");
        aM.a();
        aK();
        as();
    }

    public void V()
    {
        a(false, true);
        ar.removeCallbacks(aX);
    }

    public boolean W()
    {
        return az.c();
    }

    public boolean X()
    {
        while (ar.getLineCount() <= 1 || (ar.getHeight() + ar.getScrollY()) - ar.getTotalPaddingBottom() - ar.getTotalPaddingTop() >= ar.getLayout().getLineBottom(ar.getLineCount() - 1)) 
        {
            return true;
        }
        return false;
    }

    public void Y()
    {
        az.d();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        int i1 = com.facebook.p.Theme_Orca_MessageComposer;
        bundle = new TypedValue();
        if (n().getTheme().resolveAttribute(com.facebook.d.messageComposerTheme, bundle, true))
        {
            i1 = ((TypedValue) (bundle)).resourceId;
        }
        aq = layoutinflater.cloneInContext(new ContextThemeWrapper(n(), i1)).inflate(com.facebook.k.orca_chat_thread_composer_view, viewgroup, false);
        aq.setFocusable(true);
        aq.setOnTouchListener(new com.facebook.orca.compose.z(this));
        ar = (EditText)a(aq, com.facebook.i.compose_edit);
        as = (ImageButton)a(aq, com.facebook.i.compose_button_location);
        at = (ImageButton)a(aq, com.facebook.i.compose_button_stickers);
        au = (ImageButton)a(aq, com.facebook.i.compose_emoji_attachments);
        av = a(aq, com.facebook.i.compose_button_send);
        aw = (TextView)a(aq, com.facebook.i.compose_button_send_text);
        ax = (ImageView)a(aq, com.facebook.i.compose_button_like);
        ay = (TextView)a(aq, com.facebook.i.compose_chars_left);
        az = (AudioComposerView)a(aq, com.facebook.i.audio_composer);
        aA = (ViewGroup)a(aq, com.facebook.i.compose_text_and_attachments_root);
        aM = (ComposeAttachmentContainer)a(aq, com.facebook.i.compose_attachment_container);
        a(ap.SHRUNK);
        as.setOnClickListener(new ab(this));
        l(false);
        at.setOnClickListener(new com.facebook.orca.compose.ac(this));
        au.setOnClickListener(new com.facebook.orca.compose.ad(this));
        av.setOnClickListener(new com.facebook.orca.compose.ae(this));
        ar.addTextChangedListener(new af(this));
        if (ar instanceof BetterEditTextView)
        {
            ((BetterEditTextView)ar).setOnScrollListener(new com.facebook.orca.compose.ag(this));
        }
        ar.setOnTouchListener(new com.facebook.orca.compose.ah(this));
        ar.addTextChangedListener((TextWatcher)S().a(com/facebook/analytics/bp));
        az.setListener(new com.facebook.orca.compose.p(this));
        aM.setListener(new com.facebook.orca.compose.q(this));
        aw();
        au.setImageResource(g(false));
        return aq;
    }

    public void a()
    {
        ((InputMethodManager)n().getSystemService("input_method")).hideSoftInputFromWindow(ar.getWindowToken(), 0);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        e = (com.facebook.orca.f.k)bundle.a(com/facebook/orca/f/k);
        aB = (com.facebook.fbservice.ops.k)bundle.a(com/facebook/fbservice/ops/k);
        f = (com.facebook.ui.media.attachments.d)bundle.a(com/facebook/ui/media/attachments/d);
        g = (d)bundle.a(com/facebook/prefs/shared/d);
        h = (a)bundle.a(com/facebook/orca/common/ui/widgets/a);
        i = (com.facebook.orca.f.z)bundle.a(com/facebook/orca/f/z);
        Z = (com.facebook.orca.common.a.b)bundle.a(com/facebook/orca/common/a/b);
        aa = (k)bundle.a(com/facebook/l/k);
        ab = (az)bundle.a(com/facebook/orca/prefs/az);
        ac = (LocationManager)bundle.a(android/location/LocationManager);
        ad = (LayoutInflater)bundle.a(android/view/LayoutInflater);
        ae = (com.facebook.orca.f.n)bundle.a(com/facebook/orca/f/n);
        af = (z)bundle.a(com/facebook/orca/emoji/z);
        ag = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsEmojiAttachmentPopupEnabled);
        ah = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsStickersFeatureEnabled);
        ai = (com.facebook.ui.media.b.a)bundle.a(com/facebook/ui/media/b/a);
        aj = (KeyguardManager)bundle.a(android/app/KeyguardManager);
        ak = (av)bundle.a(com/facebook/analytics/av);
        am = (ac)bundle.a(com/facebook/orca/f/ac);
        al = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsAudioRecorderEnabled);
        an = (s)bundle.a(com/facebook/c/s);
        ao = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsMmsSendPermitted);
        ap = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsEmptyComposeLikeEnabled);
        bc = (Handler)bundle.a(android/os/Handler);
        aN = (com.facebook.orca.compose.aq)bundle.a(com/facebook/orca/compose/aq);
        bundle = (ViewerContext)bundle.a(com/facebook/auth/viewercontext/ViewerContext);
        if (bundle != null)
        {
            aV = bundle.c();
        }
    }

    public void a(View view, Drawable drawable)
    {
        int i1 = view.getPaddingBottom();
        int j1 = view.getPaddingLeft();
        int k1 = view.getPaddingRight();
        int l1 = view.getPaddingTop();
        view.setBackgroundDrawable(drawable);
        view.setPadding(j1, l1, k1, i1);
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        boolean flag;
        flag = true;
        aD = threadviewspec;
        a(dm.a(aD));
        if (!aD.a()) goto _L2; else goto _L1
_L1:
        threadviewspec = aD.d();
        if (g.a(com.facebook.orca.emoji.q.a(threadviewspec), 0) != 1) goto _L2; else goto _L3
_L3:
        if (flag)
        {
            aJ();
        } else
        {
            aK();
        }
        if (aL == ap.EXPANDED && aF != ak.NO_LOCATION)
        {
            ah();
        }
        return;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
    }

    public void a(MessageDraft messagedraft)
    {
        String s1 = messagedraft.a();
        ar.setText(s1);
        if (messagedraft.b() != 0 && messagedraft.b() <= ar.length())
        {
            ar.setSelection(messagedraft.b());
        }
        aw();
        List list = messagedraft.c();
        bn = messagedraft.d();
        if (!list.isEmpty())
        {
            try
            {
                aM.a();
                Object obj;
                for (messagedraft = list.iterator(); messagedraft.hasNext(); aM.a(((com.facebook.ui.media.attachments.a) (obj)), bn))
                {
                    obj = (MediaResource)messagedraft.next();
                    obj = f.a(((MediaResource) (obj)));
                }

            }
            // Misplaced declaration of an exception variable
            catch (MessageDraft messagedraft)
            {
                com.facebook.debug.log.b.d(a, (new StringBuilder()).append("cannot create attachment for draft: ").append(messagedraft).toString());
            }
        }
        if (!com.facebook.common.w.n.a(s1) || !list.isEmpty())
        {
            b();
        }
    }

    public void a(ai ai1)
    {
        if (ai1 != null)
        {
            if (ai1.a != null)
            {
                ar.setText(ai1.a);
            }
            try
            {
                if (ai1.b != null)
                {
                    Object obj;
                    for (Iterator iterator = ai1.b.iterator(); iterator.hasNext(); aM.a(((com.facebook.ui.media.attachments.a) (obj)), aM()))
                    {
                        obj = MediaResource.a((Uri)iterator.next());
                        obj = f.a(((MediaResource) (obj)));
                    }

                }
            }
            catch (com.facebook.ui.media.attachments.h h1)
            {
                a(((CharSequence) (e(o().getString(o.image_attachment_failed_attach_type)))), com.facebook.orca.common.ui.widgets.d.WARNING);
            }
            aw();
            if (ai1.c != -1)
            {
                aE.a(new PickMediaParams(true), ai1.c);
                return;
            }
        }
    }

    public void a(al al1)
    {
        bc.removeCallbacksAndMessages(null);
        bb = al1;
    }

    public void a(am am1)
    {
        aJ = am1;
    }

    public void a(an an1)
    {
        aI = an1;
    }

    public void a(ap ap1)
    {
        if (ap1 != ap.EXPANDED) goto _L2; else goto _L1
_L1:
        if (aF != ak.NO_LOCATION)
        {
            ah();
        }
_L4:
        aL = ap1;
        as();
        at();
        return;
_L2:
        if (Q())
        {
            h.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(com.facebook.orca.compose.av av1)
    {
        aK = av1;
    }

    public void a(ah ah1)
    {
        if (ba != null)
        {
            ba.a(null);
        }
        ba = ah1;
        if (ah1 != null)
        {
            ah1.a(new com.facebook.orca.compose.o(this));
        }
    }

    public void a(String s1)
    {
        if (aH != null)
        {
            s1 = ThreadViewSpec.a(s1);
            com.facebook.common.w.q q1 = com.facebook.common.w.q.valueOf(aH);
            am.a(s1, q1);
        }
    }

    public void a(boolean flag)
    {
        aU = flag;
        Drawable drawable;
        int i1;
        if (flag)
        {
            drawable = o().getDrawable(f(true));
            i1 = o.composer_hint_new_thread_sms;
        } else
        {
            drawable = o().getDrawable(f(false));
            i1 = o.composer_hint_new_thread;
        }
        aM.setComposingSmsThread(flag);
        as();
        at();
        a(av, drawable);
        ar.setHint(i1);
    }

    public boolean a(MotionEvent motionevent)
    {
        return com.facebook.common.t.a.b.a(ar, null).contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
    }

    public void b()
    {
        if (!aa())
        {
            return;
        } else
        {
            ar.requestFocus();
            ((InputMethodManager)n().getSystemService("input_method")).showSoftInput(ar, 1);
            return;
        }
    }

    public void b(String s1)
    {
        com.facebook.prefs.shared.e e1 = g.b();
        s1 = com.facebook.orca.emoji.q.a(s1);
        int i1;
        if (bh)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        e1.a(s1, i1).a();
    }

    public void b(boolean flag)
    {
        aW = flag;
        aw();
    }

    public MessageDraft c()
    {
        String s1 = ar.getText().toString();
        if (com.facebook.common.w.n.a(s1) && aM.b())
        {
            return null;
        } else
        {
            return new MessageDraft(s1, ar.getSelectionStart(), aM.getMediaResources(), bn);
        }
    }

    public void c(String s1)
    {
        bm = s1;
    }

    public ap d()
    {
        return aL;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (n() instanceof Activity)
        {
            aE = (PickMediaOperation)q().a("pickPhotoOperation");
            if (aE == null)
            {
                aE = new PickMediaOperation();
                a("pickPhotoOperation", aE);
            }
            aE.a(new com.facebook.orca.compose.r(this));
            h.a(true);
            be = o().getConfiguration().orientation;
        }
        aY = (EmojiAttachmentPopup)q().a("emojiKeyboard");
        aZ = (StickerPopup)q().a("stickerKeyboard");
        if (bundle != null)
        {
            ak ak1 = ak.NO_LOCATION;
            if (al())
            {
                ak1 = com.facebook.orca.compose.ak.valueOf(bundle.getString("locationState"));
            }
            a(ak1, ((Location) (null)));
            bi = bundle.getBoolean("shouldShowAudioComposerOnResume", false);
            if (bundle.containsKey("trigger"))
            {
                c(bundle.getString("trigger"));
            }
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("locationState", aF.name());
        bundle.putBoolean("shouldShowAudioComposerOnResume", bi);
        bundle.putString("trigger", bm);
    }

    public void e(boolean flag)
    {
        bk = flag;
        as();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (be != configuration.orientation)
        {
            Z();
            aE();
        }
        be = configuration.orientation;
    }

    static 
    {
        b = 5000;
        c = b - 50;
        d = b - 20;
    }
}

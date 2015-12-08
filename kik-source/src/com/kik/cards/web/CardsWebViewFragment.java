// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.android.stickers.MediaItemPlugin;
import com.kik.cache.ad;
import com.kik.cards.web.auth.AuthPlugin;
import com.kik.cards.web.automation.AutomationPlugin;
import com.kik.cards.web.browser.BrowserPlugin;
import com.kik.cards.web.browser.WebHistoryPlugin;
import com.kik.cards.web.config.ConfigurationPlugin;
import com.kik.cards.web.config.XDataPlugin;
import com.kik.cards.web.iap.InAppPurchasePlugin;
import com.kik.cards.web.iap.b;
import com.kik.cards.web.iap.k;
import com.kik.cards.web.kik.KikContentMessageParcelable;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.cards.web.kik.KikPlugin;
import com.kik.cards.web.picker.PickerPlugin;
import com.kik.cards.web.picker.PickerRequest;
import com.kik.cards.web.plugin.h;
import com.kik.cards.web.profile.ProfilePlugin;
import com.kik.cards.web.push.PushPlugin;
import com.kik.cards.web.userdata.UserDataPlugin;
import com.kik.cards.web.usermedia.PhotoPlugin;
import com.kik.cards.web.usermedia.a;
import com.kik.cards.web.usermedia.j;
import com.kik.cards.web.video.VideoPlayerPlugin;
import com.kik.cards.web.volume.VolumePlugin;
import com.kik.g.ar;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.l.ab;
import com.kik.m.d;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kik.a.e.q;
import kik.a.e.r;
import kik.a.e.u;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.j.m;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.ViewPictureFragment;
import kik.android.util.DeviceUtils;
import kik.android.util.al;
import kik.android.util.cv;
import kik.android.widget.EllipsizingTextView;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web:
//            au, ay, az, a, 
//            o, ai, aj, ak, 
//            al, am, an, b, 
//            c, d, e, f, 
//            bd, WebViewBrowserMetadataPlugin, bf, j, 
//            aq, k, l, m, 
//            n, ac, ag, af, 
//            ae, ah, aa, v, 
//            ab, ad, x, w, 
//            s, t, u, z, 
//            av

public abstract class CardsWebViewFragment extends KikScopedDialogFragment
    implements au, ay, az, com.kik.cards.web.browser.BrowserPlugin.a, k, com.kik.cards.web.usermedia.a, j
{
    public static abstract class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public final a a(KikContentMessageParcelable kikcontentmessageparcelable)
        {
            a("CardsWebViewFragment.EXTRA_CONTENT_MESSAGE", ((android.os.Parcelable) (kikcontentmessageparcelable)));
            return this;
        }

        public final a a(PickerRequest pickerrequest)
        {
            a("CardsWebViewFragment.EXTRA_PICKER_REQUEST", ((android.os.Parcelable) (pickerrequest)));
            return this;
        }

        public final a a(String s1)
        {
            if (s1 == null)
            {
                return this;
            }
            String s2 = s1;
            if (s1.startsWith("card"))
            {
                s2 = (new StringBuilder("http")).append(s1.substring(4)).toString();
            }
            a("CardsWebViewFragment.EXTRA_URL_KEY", s2);
            return this;
        }

        protected final String a()
        {
            return g("CardsWebViewFragment.EXTRA_URL_KEY");
        }

        public final a b(String s1)
        {
            a("CardsWebViewFragment.EXTRA_TAG_KEY", s1);
            return this;
        }

        protected final Boolean b()
        {
            return f("CardsWebViewFragment.EXTRA_CLEAR_CACHE_KEY");
        }

        public final a c(String s1)
        {
            a("CardsWebViewFragment.EXTRA_REFERER_URL", s1);
            return this;
        }

        protected final PickerRequest c()
        {
            return (PickerRequest)l("CardsWebViewFragment.EXTRA_PICKER_REQUEST");
        }

        public final a d(String s1)
        {
            a("CardsWebViewFragment.EXTRA_CONVO_ID", s1);
            return this;
        }

        protected final String d()
        {
            return g("CardsWebViewFragment.EXTRA_REFERER_URL");
        }

        protected final String e()
        {
            return g("CardsWebViewFragment.EXTRA_CONVO_ID");
        }

        protected final KikContentMessageParcelable f()
        {
            return (KikContentMessageParcelable)l("CardsWebViewFragment.EXTRA_CONTENT_MESSAGE");
        }

        public final a g()
        {
            a("CardsWebViewFragment.FROM_MEDIA_TRAY", true);
            return this;
        }

        public a()
        {
        }
    }


    public static final String a[] = {
        "kik.com", "zynga.com", "tresensa.com", "cards-sticker.herokuapp.com", "crusher.herokuapp.com", "cards-hamster.herokuapp.com"
    };
    protected static final android.view.ViewGroup.LayoutParams b = new android.view.ViewGroup.LayoutParams(10, 10);
    private static final org.c.b x = org.c.c.a("WebViewFragment");
    private bd A;
    private boolean B;
    private ScheduledExecutorService C;
    private BrowserPlugin D;
    private VolumePlugin E;
    private KikPlugin F;
    private UserDataPlugin G;
    private AuthPlugin H;
    private PickerPlugin I;
    private VideoPlayerPlugin J;
    private MediaItemPlugin K;
    private InAppPurchasePlugin L;
    private PhotoPlugin M;
    private ConfigurationPlugin N;
    private XDataPlugin O;
    private ProfilePlugin P;
    private AutomationPlugin Q;
    private WebViewBrowserMetadataPlugin R;
    private String S;
    private RelativeLayout U;
    private int V;
    private String W;
    private String X;
    private FragmentActivity Y;
    private kik.android.util.cv.c Z;
    private final com.kik.g.k aA = new com.kik.g.k(this);
    private final com.kik.g.k aB = new com.kik.g.k(this);
    private final com.kik.g.k aC = new com.kik.g.k(this);
    private final com.kik.g.k aD = new com.kik.g.k(this);
    private final com.kik.g.k aE = new com.kik.g.k(this);
    private final com.kik.g.k aF = new com.kik.g.k(this);
    private final android.support.v4.app.FragmentManager.OnBackStackChangedListener aG = new com.kik.cards.web.a(this);
    private final i aH = new o(this);
    private final DownloadListener aI = new ai(this);
    private final i aJ = new aj(this);
    private final i aK = new ak(this);
    private final i aL = new com.kik.cards.web.al(this);
    private final i aM = new am(this);
    private final i aN = new an(this);
    private final android.view.View.OnClickListener aO = new com.kik.cards.web.b(this);
    private final android.view.View.OnClickListener aP = new com.kik.cards.web.c(this);
    private final i aQ = new com.kik.cards.web.d(this);
    private final i aR = new com.kik.cards.web.e(this);
    private android.view.View.OnClickListener aS;
    private int aT;
    private com.kik.cards.web.video.b aa;
    private boolean ab;
    private List ac;
    private Map ad;
    private p ae;
    private int af;
    private View ag;
    private android.webkit.WebChromeClient.CustomViewCallback ah;
    private ViewGroup ai;
    private View aj;
    private ImageView ak;
    private ImageView al;
    private TextView am;
    private ViewGroup an;
    private TextView ao;
    private View ap;
    private ProgressBar aq;
    private ViewGroup ar;
    private EllipsizingTextView as;
    private ImageView at;
    private WebHistoryPlugin au;
    private ar av;
    private View aw;
    private final com.kik.g.k ax = new com.kik.g.k(this);
    private final com.kik.g.k ay = new com.kik.g.k(this);
    private final com.kik.g.k az = new com.kik.g.k(this);
    protected com.kik.android.a c;
    protected m d;
    protected u e;
    protected com.kik.android.c.f f;
    protected r g;
    protected kik.a.e.d h;
    protected kik.a.i.h i;
    protected kik.a.e.m j;
    protected v k;
    protected ab l;
    protected w m;
    protected kik.a.f.k n;
    protected q o;
    protected ad p;
    protected kik.android.util.ar q;
    protected PickerRequest r;
    protected KikContentMessageParcelable s;
    protected kik.android.b.s t;
    private long y;
    private f z;

    public CardsWebViewFragment()
    {
        z = new f();
        C = Executors.newSingleThreadScheduledExecutor();
        V = -1;
        ac = new ArrayList();
        ad = new HashMap();
        ae = new p();
        af = 30000;
        aS = new com.kik.cards.web.f(this);
        aT = 0;
    }

    private void Q()
    {
        if (A != null)
        {
label0:
            {
                A.r().c();
                R = new WebViewBrowserMetadataPlugin(A);
                A.r().a(R);
                if (com.kik.cards.web.bf.a(S) || DeviceUtils.d(Y.getBaseContext()))
                {
                    L = new InAppPurchasePlugin(Y.getApplicationContext(), Y.getApplicationContext().getPackageName(), this, new com.kik.cards.web.iap.a(h), com.kik.cards.web.iap.b.a().c(), (com.kik.cards.web.userdata.a)this, j);
                    A.r().a(L);
                }
                Object obj = com.kik.cards.web.bf.c(S);
                com.kik.cards.web.a.b b1 = new com.kik.cards.web.a.b(Y);
                A.r().a(new PushPlugin(S, this));
                D = new BrowserPlugin(C, this, b1, S, R);
                A.r().a(D);
                au = new WebHistoryPlugin(i);
                A.r().a(au);
                K = new MediaItemPlugin(e, f, Y.getBaseContext());
                A.r().a(K);
                P = new ProfilePlugin(Y, this, g, this);
                A.r().a(P);
                aa = com.kik.cards.web.video.b.a();
                aa.a(getActivity());
                J = new VideoPlayerPlugin(Y, this, aa, t, (com.kik.cards.web.userdata.a)this, h);
                A.r().a(J);
                E = new VolumePlugin();
                M = new PhotoPlugin(new com.kik.cards.usermedia.k(this), new com.kik.cards.usermedia.a(this, k), new com.kik.cards.usermedia.h(this), this, this, Y.getApplicationContext(), ((String) (obj)), this);
                A.r().a(M);
                if (r != null && com.kik.cards.web.bf.b(R(), S))
                {
                    I = new PickerPlugin(r.a, this, r);
                } else
                {
                    I = new PickerPlugin(((String) (obj)), this);
                }
                A.r().a(I);
                if (this instanceof com.kik.cards.web.kik.b)
                {
                    F = new KikPlugin(R, (com.kik.cards.web.kik.b)this, this, I, f, X, g);
                    A.r().a(F);
                    if (this instanceof com.kik.cards.web.userdata.a)
                    {
                        G = new UserDataPlugin((com.kik.cards.web.userdata.a)this, this);
                        H = new AuthPlugin((com.kik.cards.web.userdata.a)this, t, h, this);
                        A.r().a(G);
                        A.r().a(H);
                        if (DeviceUtils.d(Y.getBaseContext()))
                        {
                            if (!(this instanceof com.kik.cards.web.config.a))
                            {
                                break label0;
                            }
                            N = new ConfigurationPlugin((com.kik.cards.web.config.a)this, q);
                            A.r().a(N);
                            O = new XDataPlugin(d);
                            A.r().a(O);
                        }
                        if (A.r().d())
                        {
                            obj = S;
                            if (Q != null)
                            {
                                obj = Q.c();
                            }
                            Q = new AutomationPlugin(new com.kik.cards.web.automation.a(getActivity(), Y.getBaseContext(), A, ((String) (obj))));
                            A.r().a(Q);
                        }
                        if (com.kik.cards.web.bf.b(R(), S))
                        {
                            obj = ac.iterator();
                            while (((Iterator) (obj)).hasNext()) 
                            {
                                KikMessageParcelable kikmessageparcelable = (KikMessageParcelable)((Iterator) (obj)).next();
                                F.a(kikmessageparcelable);
                            }
                        }
                    } else
                    {
                        throw new RuntimeException("CardsWebViewFragment must provide KikInterfaceProvider Interface");
                    }
                } else
                {
                    throw new RuntimeException("CardsWebViewFragment must provide KikInterfaceProvider Interface");
                }
            }
        }
        return;
        throw new RuntimeException("CardsWebViewFragment must provide ConfigurationProvider Interface");
    }

    private String R()
    {
        a a1 = x();
        if (a1 != null)
        {
            return a1.a();
        } else
        {
            return "";
        }
    }

    private boolean S()
    {
        return ag != null;
    }

    static FragmentActivity a(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.Y;
    }

    public static p a(String s1, Context context, q q1)
    {
        p p1 = new p();
        f f1 = new f();
        context = new com.kik.cards.web.j(context, q1);
        context.getSettings().setJavaScriptEnabled(false);
        context.a(s1, false);
        f1.a(context.e(), new com.kik.cards.web.k(p1));
        f1.a(context.c(), new l(p1));
        q1 = com.kik.g.s.a(p1, 15000L);
        q1.a(new com.kik.cards.web.m(f1));
        context.loadUrl(s1);
        return q1;
    }

    private void a(Uri uri, Context context)
    {
        if (uri == null)
        {
            Toast.makeText(context, context.getString(0x7f0900dd), 1).show();
            return;
        }
        String s1;
        try
        {
            s1 = uri.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Toast.makeText(context, context.getString(0x7f0900dd), 1).show();
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s1 = s1.toLowerCase();
        if (s1.startsWith("mailto:") || s1.startsWith("intent:"))
        {
            uri = Intent.parseUri(uri.toString(), 1);
            Y.startActivity(uri);
            return;
        }
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.addFlags(0x10000000);
        Y.startActivity(uri);
        return;
    }

    static void a(CardsWebViewFragment cardswebviewfragment, int i1)
    {
        int j1 = cardswebviewfragment.aT + 1;
        cardswebviewfragment.aT = j1;
        if (i1 < 100)
        {
            cv.b(new View[] {
                cardswebviewfragment.aq
            });
            cardswebviewfragment.aq.setMax(100);
            cardswebviewfragment.aq.setProgress(i1);
            return;
        } else
        {
            cardswebviewfragment.aq.setMax(100);
            cardswebviewfragment.aq.setProgress(100);
            cardswebviewfragment.aq.postDelayed(new n(cardswebviewfragment, j1), 200L);
            return;
        }
    }

    static void a(CardsWebViewFragment cardswebviewfragment, String s1)
    {
        if (s1 == null || cardswebviewfragment.i == null)
        {
            return;
        } else
        {
            cardswebviewfragment.i.a().a(new ac(cardswebviewfragment, s1));
            return;
        }
    }

    static void a(CardsWebViewFragment cardswebviewfragment, String s1, android.webkit.GeolocationPermissions.Callback callback)
    {
        cardswebviewfragment.a((new kik.android.chat.fragment.KikDialogFragment.a()).a("Location").b((new StringBuilder("Share your location with ")).append(s1).append("?").toString()).a(true).a("Ok", new ag(cardswebviewfragment, callback, s1)).b("Cancel", new af(cardswebviewfragment, callback, s1)).a(new ae(cardswebviewfragment, callback, s1)).a());
    }

    static bd b(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.A;
    }

    static String b(CardsWebViewFragment cardswebviewfragment, String s1)
    {
        cardswebviewfragment.S = s1;
        return s1;
    }

    static void c(CardsWebViewFragment cardswebviewfragment)
    {
        cv.e(new View[] {
            cardswebviewfragment.aj
        });
        cv.e(new View[] {
            cardswebviewfragment.al
        });
        cv.b(new View[] {
            cardswebviewfragment.am
        });
    }

    static void c(CardsWebViewFragment cardswebviewfragment, String s1)
    {
        cardswebviewfragment.e(s1);
    }

    static String d(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.S;
    }

    static WebViewBrowserMetadataPlugin e(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.R;
    }

    private void e(int i1)
    {
        if (i1 == 2)
        {
            cv.b(new View[] {
                aw
            });
            cv.e(new View[] {
                an
            });
            return;
        } else
        {
            cv.b(new View[] {
                an
            });
            cv.e(new View[] {
                aw
            });
            return;
        }
    }

    private void e(String s1)
    {
        if (s1 != null && ao != null)
        {
            s1 = com.kik.cards.util.b.c(S);
            if (com.kik.cards.web.bf.a(s1))
            {
                cv.b(new View[] {
                    ap
                });
            } else
            {
                cv.e(new View[] {
                    ap
                });
            }
            ao.setText(com.kik.cards.web.bf.i(s1));
        }
    }

    static com.kik.g.k f(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.ay;
    }

    static BrowserPlugin g(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.D;
    }

    static void h(CardsWebViewFragment cardswebviewfragment)
    {
        cardswebviewfragment.a(0);
        cardswebviewfragment.b(true);
        cardswebviewfragment.Q();
    }

    static com.kik.g.k i(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.aD;
    }

    static com.kik.g.k j(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.aC;
    }

    static void k(CardsWebViewFragment cardswebviewfragment)
    {
        cardswebviewfragment.L();
    }

    static void l(CardsWebViewFragment cardswebviewfragment)
    {
        if (cardswebviewfragment.A != null)
        {
            cardswebviewfragment.A.a(cardswebviewfragment.S, true);
            cardswebviewfragment.A.k();
        }
    }

    static void m(CardsWebViewFragment cardswebviewfragment)
    {
        if (cardswebviewfragment.al != null)
        {
            cv.b(new View[] {
                cardswebviewfragment.al
            });
            cv.e(new View[] {
                cardswebviewfragment.am
            });
            AnimationDrawable animationdrawable = (AnimationDrawable)cardswebviewfragment.al.getResources().getDrawable(0x7f070080);
            cardswebviewfragment.al.setImageDrawable(animationdrawable);
            animationdrawable.start();
        }
    }

    static void n(CardsWebViewFragment cardswebviewfragment)
    {
        cv.b(new View[] {
            cardswebviewfragment.aj
        });
        if (cardswebviewfragment.al != null)
        {
            cardswebviewfragment.al.postDelayed(new ah(cardswebviewfragment), 500L);
        }
        if (cardswebviewfragment.ak != null)
        {
            cardswebviewfragment.ak.setImageResource(kik.android.util.al.a());
        }
    }

    static String o(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.W;
    }

    static int p(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.aT;
    }

    static ProgressBar q(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.aq;
    }

    static void r(CardsWebViewFragment cardswebviewfragment)
    {
        if (cardswebviewfragment.U != null)
        {
            cardswebviewfragment.U.post(new aa(cardswebviewfragment));
        }
    }

    static kik.android.util.cv.c s(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.Z;
    }

    static com.kik.g.k t(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.aA;
    }

    static void u(CardsWebViewFragment cardswebviewfragment)
    {
        cardswebviewfragment.az.a(null);
    }

    static ImageView v(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.al;
    }

    static TextView w(CardsWebViewFragment cardswebviewfragment)
    {
        return cardswebviewfragment.am;
    }

    static org.c.b z()
    {
        return x;
    }

    public final p a(Intent intent)
    {
        p p1 = new p();
        int i1;
        for (i1 = af; ad.containsKey(Integer.valueOf(i1)); i1++) { }
        ad.put(Integer.valueOf(i1), p1);
        startActivityForResult(intent, i1);
        return p1;
    }

    public final p a(IntentSender intentsender)
    {
        p p1;
        p1 = new p();
        ae = p1;
        if (Y == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        Y.startIntentSenderForResult(intentsender, 0x17318, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return p1;
        try
        {
            p1.a(null);
        }
        // Misplaced declaration of an exception variable
        catch (IntentSender intentsender)
        {
            p1.a(null);
            return p1;
        }
        return p1;
    }

    public final p a(String s1, PickerRequest pickerrequest)
    {
        p p1 = H();
        if (s1 == null)
        {
            p1.e();
        } else
        {
            Uri uri = Uri.parse(s1);
            if (uri.getScheme().equals("http") || uri.getScheme().equals("https") || uri.getScheme().equals("card") || uri.getScheme().equals("cards"))
            {
                s();
                kik.android.chat.fragment.KikCardBrowserFragment.a a1 = new kik.android.chat.fragment.KikCardBrowserFragment.a();
                a1.a(s1).b(com.kik.cards.util.b.b(s1)).a(pickerrequest).c(W).d(X);
                kik.android.chat.activity.k.a(a1, Y).f().a(new com.kik.cards.web.v(this, p1));
                return p1;
            }
        }
        return p1;
    }

    public final void a(int i1)
    {
        byte byte0 = -1;
        i1;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 52
    //                   2 47;
           goto _L1 _L2 _L3
_L1:
        i1 = byte0;
_L5:
        V = i1;
        if (Y != null)
        {
            Y.setRequestedOrientation(i1);
        }
        return;
_L3:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        if (ag != null)
        {
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            ((ViewGroup)getView()).addView(view, b);
            ag = view;
            cv.d(new View[] {
                view
            });
            ah = customviewcallback;
            view.post(new com.kik.cards.web.ab(this));
            return;
        }
    }

    public final void a(KikMessageParcelable kikmessageparcelable)
    {
        if (F != null && com.kik.cards.web.bf.b(R(), S))
        {
            F.a(kikmessageparcelable);
        }
        ac.add(kikmessageparcelable);
    }

    public final void a(String s1, android.webkit.GeolocationPermissions.Callback callback)
    {
        t.c(s1).a(new com.kik.cards.web.ad(this, callback, s1));
    }

    public final void a(String s1, boolean flag)
    {
        s1 = com.kik.cards.web.bf.a(s1, S);
        aB.a(new aq.b(s1, flag));
    }

    public final void a(JSONObject jsonobject)
    {
        boolean flag;
        if (W != null)
        {
            flag = W.equals("https://kik.com/");
        } else
        {
            flag = false;
        }
        if (flag && jsonobject == null)
        {
            J();
            return;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        (new Bundle()).putString("CardsWebViewFragment.EXTRA_PICKER_RESULT", jsonobject.toString());
        String s1 = jsonobject.optString("title", "");
        obj = jsonobject.optString("text", "");
        obj1 = jsonobject.optString("image", "");
        String s3 = jsonobject.optString("pngImage", "");
        String s4 = jsonobject.optString("attribution", "");
        boolean flag1 = jsonobject.optBoolean("forwardable", true);
        String s6 = jsonobject.optString("fallbackUrl", null);
        String s7 = jsonobject.optString("layout");
        String s8 = X;
        String s9 = jsonobject.optString("videoUrl");
        boolean flag2 = jsonobject.optBoolean("videoShouldAutoplay");
        boolean flag3 = jsonobject.optBoolean("videoShouldBeMuted");
        boolean flag4 = jsonobject.optBoolean("videoShouldLoop");
        boolean flag5 = jsonobject.optBoolean("disallowSave");
        obj = new KikMessageParcelable(s1, ((String) (obj)), ((String) (obj1)), null, s8, null, s7, null, S, null, String.valueOf(flag1), s6, s3, s4, s9, String.valueOf(flag2), String.valueOf(flag3), String.valueOf(flag4), String.valueOf(flag5));
        obj1 = jsonobject.optJSONObject("extras");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        long l1;
        iterator = ((JSONObject) (obj1)).keys();
        l1 = 0L;
_L8:
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        String s5;
        s5 = (String)iterator.next();
        jsonobject = "";
        String s2 = ((JSONObject) (obj1)).getString(s5);
        jsonobject = s2;
_L6:
        l1 = l1 + (long)s5.length() + (long)jsonobject.length();
        if (l1 > 10240L)
        {
            break; /* Loop/switch isn't completed */
        }
        ((KikMessageParcelable) (obj)).t.put(s5, jsonobject);
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        if (true) goto _L6; else goto _L4
_L4:
        R.a().a(new x(this, ((KikMessageParcelable) (obj))));
        return;
_L2:
        Bundle bundle = new Bundle();
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        bundle.putString("CardsWebViewFragment.EXTRA_PICKER_RESULT", jsonobject1.toString());
        a(bundle);
        J();
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a(KeyEvent keyevent)
    {
        switch (keyevent.getKeyCode())
        {
        default:
            return false;

        case 24: // '\030'
        case 25: // '\031'
            return E.a(keyevent);
        }
    }

    public final p b(String s1, PickerRequest pickerrequest)
    {
        p p1 = new p();
        Uri uri = Uri.parse(s1);
        if (uri.getScheme().equals("http") || uri.getScheme().equals("https"))
        {
            s();
            kik.android.chat.fragment.KikCardBrowserFragment.a a1 = new kik.android.chat.fragment.KikCardBrowserFragment.a();
            a1.a(s1).b(com.kik.cards.util.b.b(s1)).a(pickerrequest).c(S);
            kik.android.chat.activity.k.a(a1, Y).f().a(new com.kik.cards.web.w(this, p1));
        }
        return p1;
    }

    protected abstract com.kik.m.a c();

    protected final void c(String s1)
    {
        FragmentActivity fragmentactivity = Y;
        String s2 = com.kik.cards.web.bf.a(s1, S);
        if (s2 == null)
        {
            a(Uri.parse(s1), fragmentactivity);
            return;
        } else
        {
            a(Uri.parse(s2), fragmentactivity);
            return;
        }
    }

    public final void c(boolean flag)
    {
        if (flag != B)
        {
            B = flag;
            ax.a(Boolean.valueOf(flag));
            D.a(flag);
        }
    }

    public final void d(String s1)
    {
        c(s1);
    }

    public final String g()
    {
        return S;
    }

    public final boolean h()
    {
        return k.p("kik.developer.mode").booleanValue();
    }

    public final av i()
    {
        return R;
    }

    public final bd j()
    {
        return A;
    }

    public final void k()
    {
        if (A.w())
        {
            D.c();
            return;
        }
        if (A.canGoBack())
        {
            A.goBack();
            return;
        } else
        {
            q();
            return;
        }
    }

    public final e l()
    {
        return aA.a();
    }

    public final e m()
    {
        return aB.a();
    }

    public final int n()
    {
        switch (Y.getRequestedOrientation())
        {
        default:
            return 0;

        case 0: // '\0'
            return 2;

        case 1: // '\001'
            return 1;
        }
    }

    public final void o()
    {
        J();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 0x17318) goto _L2; else goto _L1
_L1:
        p p1 = (p)ad.remove(Integer.valueOf(i1));
        if (p1 == null) goto _L4; else goto _L3
_L3:
        if (j1 != -1) goto _L6; else goto _L5
_L5:
        p1.a(intent);
_L4:
        return;
_L6:
        if (j1 == 0)
        {
            p1.e();
            return;
        } else
        {
            p1.a(null);
            return;
        }
_L2:
        if (i1 == 0x17318)
        {
            p p2 = ae;
            if (p2 != null)
            {
                if (j1 == -1)
                {
                    p2.a(intent);
                    return;
                }
                if (j1 == 0)
                {
                    intent = new Intent();
                    intent.putExtra("retry", true);
                    p2.a(intent);
                    return;
                } else
                {
                    p2.a(null);
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (configuration.orientation == 2)
        {
            D.a(2);
        } else
        {
            D.a(1);
        }
        e(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        Y = getActivity();
        av = com.kik.cards.web.iap.b.a().b();
        t = new kik.android.b.s(d);
        Object obj = x();
        if (obj != null)
        {
            S = R();
            if (S == null)
            {
                throw new IllegalStateException("A url must be provided for the card");
            }
            ab = ((a) (obj)).b().booleanValue();
            r = ((a) (obj)).c();
            X = ((a) (obj)).e();
            bundle = ((a) (obj)).d();
            obj = ((a) (obj)).f();
            if (obj != null)
            {
                s = ((KikContentMessageParcelable) (obj));
            }
            if (bundle != null)
            {
                W = com.kik.cards.web.bf.c(bundle);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (U != null)
        {
            return U;
        }
        getFragmentManager().addOnBackStackChangedListener(aG);
        if (A != null)
        {
            return new View(Y);
        }
        z.a();
        A = new bd(Y, this, c(), this, n, o);
        A.setScrollBarStyle(0);
        A.setDownloadListener(aI);
        Q();
        z.a(az.a(), aJ);
        z.a(A.q(), aQ);
        z.a(A.f(), aM);
        z.a(A.g(), aK);
        z.a(A.h(), aN);
        z.a(A.e(), aH);
        z.a(A.c(), aR);
        z.a(A.d(), aL);
        U = (RelativeLayout)layoutinflater.inflate(0x7f03001c, null);
        aj = U.findViewById(0x7f0e00a7);
        ak = (ImageView)U.findViewById(0x7f0e01e5);
        al = (ImageView)U.findViewById(0x7f0e01e7);
        am = (TextView)U.findViewById(0x7f0e01e6);
        cv.b(am);
        am.setOnClickListener(aP);
        ai = (ViewGroup)U.findViewById(0x7f0e00a6);
        an = (ViewGroup)U.findViewById(0x7f0e003c);
        ao = (TextView)an.findViewById(0x7f0e0078);
        ap = an.findViewById(0x7f0e00a1);
        aw = U.findViewById(0x7f0e00a3);
        ao.setOnClickListener(aS);
        an.findViewById(0x7f0e0036).setOnClickListener(aS);
        an.findViewById(0x7f0e00a0).setOnClickListener(aO);
        com.kik.m.d.a(an.findViewById(0x7f0e00a0), "AUTOMATION_BROWSER_BAR_CLOSE");
        com.kik.m.d.a(an.findViewById(0x7f0e0036), "AUTOMATION_BROWSER_BAR_MORE");
        com.kik.m.d.a(ao, "AUTOMATION_BROWSER_BAR_URL");
        com.kik.m.d.a(ap, "AUTOMATION_BROWSER_BAR_URL_SECURE");
        com.kik.m.d.a(am, "AUTOMATION_BROWSER_ERROR_REFRESH");
        U.findViewById(0x7f0e00a5).setOnClickListener(aS);
        U.findViewById(0x7f0e00a4).setOnClickListener(aO);
        aq = (ProgressBar)U.findViewById(0x7f0e00a2);
        ar = (ViewGroup)U.findViewById(0x7f0e0092);
        as = (EllipsizingTextView)U.findViewById(0x7f0e0094);
        at = (ImageView)U.findViewById(0x7f0e0093);
        layoutinflater = new android.view.ViewGroup.LayoutParams(-1, -1);
        U.setLayoutParams(layoutinflater);
        ai.addView(A, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (S != null)
        {
            com.kik.g.s.a(aE.a()).a(new com.kik.cards.web.s(this));
            A.a(S, ab);
            (new StringBuilder("SWITCH_TIMING: Starting to load URL ")).append(S);
            layoutinflater = new HashMap();
            viewgroup = S;
            y = kik.a.h.j.b();
            if (s != null)
            {
                Z = cv.a(ViewPictureFragment.a(s), Y, viewgroup);
            }
            layoutinflater.put("Referer", W);
            A.a();
            A.loadUrl(viewgroup, layoutinflater);
            e(com.kik.cards.web.bf.b(S));
            if (Z != null)
            {
                cv.b(new View[] {
                    ar
                });
                ar.setOnClickListener(new t(this));
                as.setText(Z.d());
                at.setImageBitmap(Z.c());
            }
        }
        return U;
    }

    public void onDestroy()
    {
        if (av != null)
        {
            av.c();
        }
        if (r != null && r.a != null)
        {
            aF.a(r.a);
            super.onDestroy();
            C.shutdown();
            z.a();
        } else
        {
            aF.a(S);
            super.onDestroy();
            C.shutdown();
            z.a();
        }
        if (c != null)
        {
            com.kik.android.a.f f1 = c.b("Browser Screen Closed").b("Reason", "Implicit");
            String s1;
            if (y == 0L)
            {
                s1 = "0";
            } else
            {
                s1 = (new DecimalFormat("#.#")).format((float)(kik.a.h.j.b() - y) / 1000F);
            }
            f1.a("Duration", s1).b();
        }
        Y = null;
    }

    public void onDestroyView()
    {
label0:
        {
            super.onDestroyView();
            getFragmentManager().removeOnBackStackChangedListener(aG);
            if (U != null)
            {
                if (!e())
                {
                    break label0;
                }
                ((ViewGroup)U.getParent()).removeView(U);
            }
            return;
        }
        U.removeView(A);
        z.b(A.g(), aK);
        A.v();
        A.n();
        U.postDelayed(new com.kik.cards.web.u(this), 1000L);
        U = null;
        aa = null;
    }

    public void onPause()
    {
        if (S())
        {
            u();
        }
        try
        {
            Class.forName("android.webkit.WebView").getMethod("onPause", null).invoke(A, null);
        }
        catch (Exception exception) { }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        try
        {
            Class.forName("android.webkit.WebView").getMethod("onResume", null).invoke(A, null);
        }
        catch (Exception exception) { }
        e(getResources().getConfiguration().orientation);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (S != null)
        {
            bundle.putString("CardsWebViewFragment.EXTRA_URL_KEY", S);
        }
    }

    public void onStart()
    {
        super.onStart();
    }

    public final boolean p()
    {
        return r != null;
    }

    public final void q()
    {
        bd bd1 = A;
        if (bd1 != null)
        {
            bd1.postDelayed(new z(this), 100L);
        }
    }

    public final void r()
    {
        aE.a(null);
    }

    protected final void s()
    {
        D.a(true);
    }

    public final Context t()
    {
        return Y.getBaseContext();
    }

    public final void u()
    {
        if (!S())
        {
            return;
        } else
        {
            ah.onCustomViewHidden();
            ((ViewGroup)getView()).removeView(ag);
            ag = null;
            return;
        }
    }

    public boolean v()
    {
        boolean flag = false;
        if (S())
        {
            u();
            flag = true;
        }
        boolean flag1 = flag;
        if (!flag)
        {
            flag1 = super.v();
        }
        return flag1;
    }

    public final int w()
    {
        a a1 = x();
        if (a1 == null || a1.h() == com.kik.ui.fragment.FragmentBase.a.a.a)
        {
            return com.kik.ui.fragment.FragmentBase.a.a.b;
        } else
        {
            return a1.h();
        }
    }

    protected abstract a x();

    public final int y()
    {
        return 0xff000000;
    }

}

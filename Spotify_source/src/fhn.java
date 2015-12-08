// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.share.client.ShareViewClient;
import com.spotify.mobile.android.spotlets.share.model.Network;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class fhn extends Fragment
    implements fot, fxy, gck
{

    public ShareViewClient Y;
    private Flags Z;
    protected boolean a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private fib ae;
    private HashMap af;
    private fhp ag;
    private HashMap ah;
    private com.spotify.mobile.android.spotlets.share.model.Info.Response ai;
    private gin aj;
    private Picasso ak;
    private gcj al;
    private gfl am;
    private ContentViewManager an;
    private View ao;
    private EmptyView ap;
    private LoadingView aq;
    private EditText ar;
    private FrameLayout as;
    private FrameLayout at;
    private FrameLayout au;
    private boolean av;
    private boolean aw;
    private Context ax;
    private gfm ay;
    private final android.view.View.OnClickListener az = new android.view.View.OnClickListener() {

        final fhn a;

        public final void onClick(View view)
        {
            if (fhn.a(a))
            {
                return;
            } else
            {
                fhn.a(a, true);
                ((InputMethodManager)a.k().getSystemService("input_method")).hideSoftInputFromWindow(a.y().getWindowToken(), 0);
                fhn.c(a).a(fhn.b(a));
                view = fhn.h(a);
                com.spotify.mobile.android.spotlets.share.model.Broadcast.Request request = new com.spotify.mobile.android.spotlets.share.model.Broadcast.Request(fhn.d(a), fhn.e(a), fhn.f(a).getText().toString(), a.e(true));
                JsonCallbackReceiver jsoncallbackreceiver = new JsonCallbackReceiver(this, new Handler(), com/spotify/mobile/android/spotlets/share/model/Broadcast$Response) {

                    private _cls2 a;

                    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        dmz.a(ggc);
                        ggc.a(a.a.k(), 0x7f0804d2, 1, new Object[0]);
                        fhn.a(a.a, false);
                        fhn.c(a.a).c(false);
                    }

                    protected final void onResolved(Response response, Object obj)
                    {
                        boolean flag = false;
                        response = ((com.spotify.mobile.android.spotlets.share.model.Broadcast.Response)obj).getStatusList();
                        if (response.hadError(com.spotify.mobile.android.spotlets.share.model.Network.Type.a))
                        {
                            dmz.a(ggc);
                            ggc.c(fhn.g(a.a), com.spotify.mobile.android.spotlets.share.model.Network.Type.a.mName);
                        } else
                        if (response.hadError(com.spotify.mobile.android.spotlets.share.model.Network.Type.b))
                        {
                            dmz.a(ggc);
                            ggc.c(fhn.g(a.a), com.spotify.mobile.android.spotlets.share.model.Network.Type.b.mName);
                        } else
                        if (response.hadError(com.spotify.mobile.android.spotlets.share.model.Network.Type.c))
                        {
                            dmz.a(ggc);
                            ggc.c(fhn.g(a.a), com.spotify.mobile.android.spotlets.share.model.Network.Type.c.mName);
                        } else
                        {
                            flag = true;
                        }
                        if (flag)
                        {
                            dmz.a(ggc);
                            ggc.g(fhn.g(a.a));
                        }
                        a.a.k().finish();
                    }

            
            {
                a = _pcls2;
                super(handler, class1);
            }
                };
                view.b().resolve(ShareViewClient.a(request), jsoncallbackreceiver);
                fhn.i(a).a(a.e(false), TextUtils.isEmpty(fhn.f(a).getText()), fhn.d(a));
                return;
            }
        }

            
            {
                a = fhn.this;
                super();
            }
    };
    protected boolean b;

    public fhn()
    {
        ay = new gfm() {

            private fhn a;

            public final void a(gfl gfl1)
            {
                fhn fhn1;
                boolean flag;
label0:
                {
                    boolean flag1 = false;
                    gfl1.e.b();
                    String as1[] = gfl1.b;
                    fhn1 = a;
                    if (as1 != null && as1.length != 3)
                    {
                        flag = flag1;
                        if (Arrays.asList(as1).contains(gdh.a.get(0)))
                        {
                            break label0;
                        }
                    }
                    flag = flag1;
                    if (gfl1.c)
                    {
                        flag = true;
                    }
                }
                fhn1.b = flag;
                a.a = true;
                a.H();
            }

            
            {
                a = fhn.this;
                super();
            }
        };
    }

    static com.spotify.mobile.android.spotlets.share.model.Info.Response a(fhn fhn1, com.spotify.mobile.android.spotlets.share.model.Info.Response response)
    {
        fhn1.ai = response;
        return response;
    }

    public static fhn a(Intent intent, Flags flags)
    {
        Assertion.a(intent);
        Assertion.a(flags);
        Object obj = intent.getStringExtra("spotify:share:posturi");
        String s1 = intent.getStringExtra("spotify:share:posttitle");
        String s2 = intent.getStringExtra("spotify:share:postsubtitle");
        String s3 = intent.getStringExtra("spotify:share:postimage_uri");
        Assertion.a(obj);
        Assertion.a(s1);
        Assertion.a(s2);
        intent = new Bundle();
        intent.putString("uri", ((String) (obj)));
        intent.putString("title", s1);
        intent.putString("subtitle", s2);
        intent.putString("imageuri", s3);
        obj = new fhn();
        ((fhn) (obj)).f(intent);
        fyw.a(((Fragment) (obj)), flags);
        return ((fhn) (obj));
    }

    static boolean a(fhn fhn1)
    {
        return fhn1.aw;
    }

    static boolean a(fhn fhn1, boolean flag)
    {
        fhn1.aw = flag;
        return flag;
    }

    static LoadingView b(fhn fhn1)
    {
        return fhn1.aq;
    }

    static ContentViewManager c(fhn fhn1)
    {
        return fhn1.an;
    }

    static String d(fhn fhn1)
    {
        return fhn1.aa;
    }

    static String e(fhn fhn1)
    {
        return fhn1.ab;
    }

    static EditText f(fhn fhn1)
    {
        return fhn1.ar;
    }

    static boolean f(boolean flag)
    {
        return flag;
    }

    static Context g(fhn fhn1)
    {
        return fhn1.ax;
    }

    static ShareViewClient h(fhn fhn1)
    {
        return fhn1.Y;
    }

    static fib i(fhn fhn1)
    {
        return fhn1.ae;
    }

    static com.spotify.mobile.android.spotlets.share.model.Info.Response j(fhn fhn1)
    {
        return fhn1.ai;
    }

    static gin k(fhn fhn1)
    {
        return fhn1.aj;
    }

    static HashMap l(fhn fhn1)
    {
        return fhn1.af;
    }

    static fhp m(fhn fhn1)
    {
        return fhn1.ag;
    }

    static HashMap n(fhn fhn1)
    {
        return fhn1.ah;
    }

    static void o(fhn fhn1)
    {
        Iterator iterator = fhn1.ah.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null)
            {
                ((fho)entry.getValue()).a();
            }
        } while (true);
        (new Handler()).postDelayed(fhn1. new Runnable() {

            private fhn a;

            public final void run()
            {
                if (!a.o())
                {
                    return;
                } else
                {
                    fhn.f(a).requestFocus();
                    ((InputMethodManager)a.k().getSystemService("input_method")).showSoftInput(fhn.f(a), 1);
                    return;
                }
            }

            
            {
                a = fhn.this;
                super();
            }
        }, 500L);
    }

    static boolean p(fhn fhn1)
    {
        return fhn1.av;
    }

    static FrameLayout q(fhn fhn1)
    {
        return fhn1.as;
    }

    static FrameLayout r(fhn fhn1)
    {
        return fhn1.at;
    }

    static FrameLayout s(fhn fhn1)
    {
        return fhn1.au;
    }

    static Flags t(fhn fhn1)
    {
        return fhn1.Z;
    }

    public final void B()
    {
        super.B();
        Y.a();
    }

    public final boolean C_()
    {
        ae.a(aa);
        return false;
    }

    public final Fragment F()
    {
        return this;
    }

    protected final void H()
    {
        if (av && a)
        {
            ShareViewClient shareviewclient = Y;
            String s1 = aa;
            JsonCallbackReceiver jsoncallbackreceiver = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/share/model/Info$Response) {

                private fhn a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    fhn.f(false);
                    a.a(false);
                    a.k().q_();
                    fhn.c(a).c(true);
                }

                protected final void onResolved(Response response, Object obj)
                {
                    int i1 = 0;
                    response = (com.spotify.mobile.android.spotlets.share.model.Info.Response)obj;
                    fhn.a(a, response);
                    boolean flag;
                    if (fhn.j(a) != null && fhn.j(a).getNetworks() != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        fhn.f(true);
                        obj = fhn.j(a).getNetwork(com.spotify.mobile.android.spotlets.share.model.Network.Type.a);
                        if (obj != null)
                        {
                            Object obj1 = fhn.j(a);
                            com.spotify.mobile.android.spotlets.share.model.Network.Type type = ((Network) (obj)).getNetworkType();
                            int j1;
                            if (a.b)
                            {
                                response = com.spotify.mobile.android.spotlets.share.model.Network.State.a;
                            } else
                            {
                                response = com.spotify.mobile.android.spotlets.share.model.Network.State.b;
                            }
                            ((com.spotify.mobile.android.spotlets.share.model.Info.Response) (obj1)).replaceNetwork(new Network(type, response, ((Network) (obj)).getId(), ((Network) (obj)).getName()));
                        }
                        response = fhn.j(a).getNetworks();
                        for (j1 = response.length; i1 < j1; i1++)
                        {
                            obj = response[i1];
                            obj1 = ((Network) (obj)).getNetworkType();
                            if (obj1 != null)
                            {
                                fhn.l(a).put(obj1, new fhs(((Network) (obj)), fhn.k(a)));
                                fhn.n(a).put(obj1, fhn.m(a).a(((com.spotify.mobile.android.spotlets.share.model.Network.Type) (obj1))));
                            }
                        }

                        fhn.o(a);
                        fhn.c(a).b(null);
                    } else
                    {
                        fhn.f(false);
                        response = fhn.c(a);
                        boolean flag1;
                        if (!fhn.p(a))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        response.a(flag1);
                        fhn.c(a).c(true);
                    }
                    a.a(flag);
                    a.k().q_();
                }

            
            {
                a = fhn.this;
                super(handler, class1);
            }
            };
            shareviewclient.b().resolve(RequestBuilder.get(ShareViewClient.a(com.spotify.mobile.android.spotlets.share.client.ShareViewClient.Path.d, new String[] {
                s1
            })).build(), jsoncallbackreceiver);
            return;
        } else
        {
            a(false);
            k().q_();
            return;
        }
    }

    public final String I()
    {
        return "spotify:share:post";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = (ViewGroup)layoutinflater.inflate(0x7f030093, viewgroup, false);
        ImageView imageview = (ImageView)bundle.findViewById(0x7f1104c2);
        ((TextView)bundle.findViewById(0x7f1104c3)).setText(ab);
        ((TextView)bundle.findViewById(0x7f1104c4)).setText(ac);
        ImageView imageview1 = (ImageView)bundle.findViewById(0x7f1104c1);
        imageview1.setColorFilter(gcg.b(k(), 0x7f0f0035));
        ar = (EditText)bundle.findViewById(0x7f1103a3);
        Object obj = ar;
        if (TextUtils.isEmpty(ac))
        {
            viewgroup = String.format("%s %s", new Object[] {
                l().getString(0x7f0804cf), ab
            });
        } else
        {
            viewgroup = String.format("%s %s %s", new Object[] {
                l().getString(0x7f0804cf), ab, ac
            });
        }
        ((EditText) (obj)).setText(viewgroup);
        viewgroup = new fhz(k());
        viewgroup.a = SpotifyIcon.aE;
        viewgroup.c = l().getDimensionPixelSize(0x7f0c013f);
        viewgroup.d = true;
        obj = viewgroup.a(0x7f020077);
        obj.b = (FrameLayout)bundle.findViewById(0x7f1103a4);
        as = ((fhz) (obj)).a();
        viewgroup.a = SpotifyIcon.aG;
        viewgroup.c = l().getDimensionPixelSize(0x7f0c0140);
        viewgroup.d = false;
        obj = viewgroup.a(0x7f020079);
        obj.b = (FrameLayout)bundle.findViewById(0x7f1103a5);
        at = ((fhz) (obj)).a();
        viewgroup.a = SpotifyIcon.ba;
        viewgroup.c = l().getDimensionPixelSize(0x7f0c0140);
        viewgroup.d = false;
        viewgroup = viewgroup.a(0x7f020078);
        viewgroup.b = (FrameLayout)bundle.findViewById(0x7f1103a6);
        au = viewgroup.a();
        ao = bundle.findViewById(0x7f11032d);
        ap = (EmptyView)bundle.findViewById(0x7f110348);
        aq = LoadingView.a(layoutinflater);
        bundle.addView(aq);
        ((Button)bundle.findViewById(0x7f1103a7)).setOnClickListener(new android.view.View.OnClickListener() {

            private fhn a;

            public final void onClick(View view)
            {
                view = new Intent();
                view.setAction("android.intent.action.SEND");
                view.putExtra("android.intent.extra.TEXT", (new SpotifyLink(fhn.d(a))).e());
                view.setType("text/plain");
                a.a(Intent.createChooser(view, a.b(0x7f0804c5)));
                view = fhn.i(a);
                String s1 = fhn.d(a);
                view.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cF, s1);
            }

            
            {
                a = fhn.this;
                super();
            }
        });
        layoutinflater = dff.a(k(), SpotifyIcon.E);
        viewgroup = gcg.a(k(), 0x7f02018e);
        if (TextUtils.isEmpty(ad))
        {
            imageview.setImageDrawable(layoutinflater);
            imageview1.setImageDrawable(viewgroup);
            return bundle;
        } else
        {
            ak.a(ad).a(layoutinflater).b(layoutinflater).a(imageview, null);
            ak.a(ad).a(dgf.a).a(viewgroup).b(viewgroup).a(imageview1, null);
            return bundle;
        }
    }

    public final JsonCallbackReceiver a(com.spotify.mobile.android.spotlets.share.model.Network.Type type)
    {
        return new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/share/model/Network, type) {

            private com.spotify.mobile.android.spotlets.share.model.Network.Type a;
            private fhn b;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                dmz.a(ggc);
                ggc.a(fhn.g(b), a.mName);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (Network)obj;
                b.a(response);
                if (!response.getState().equals(com.spotify.mobile.android.spotlets.share.model.Network.State.a))
                {
                    dmz.a(ggc);
                    ggc.a(fhn.g(b), a.mName);
                }
            }

            
            {
                b = fhn.this;
                a = type;
                super(handler, class1);
            }
        };
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0804d5);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(false);
        Z = fyw.a(this);
        aa = g().getString("uri");
        ab = g().getString("title");
        ac = g().getString("subtitle");
        bundle = g().getString("imageuri");
        String s1;
        if (bundle == null)
        {
            bundle = "";
        } else
        {
            bundle = dto.a(bundle).toString();
        }
        ad = bundle;
        Assertion.a(aa);
        Assertion.a(ab);
        Assertion.a(ac);
        ae = new fib(k());
        af = new HashMap();
        ag = new fhp(this);
        ah = new HashMap();
        Y = new ShareViewClient(k());
        aj = ((giq)dmz.a(giq)).b(k());
        ak = ((gft)dmz.a(gft)).a();
        al = new gcj(k(), this);
        am = new gfl(k());
        am.a(ay);
        bundle = ae;
        s1 = aa;
        bundle.a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.R, s1);
        ax = k().getApplicationContext();
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        Object obj = k().getString(0x7f080044).toUpperCase(Locale.getDefault());
        menuinflater = k();
        android.view.View.OnClickListener onclicklistener = az;
        menu = menu.add(0, 0x7f110009, 0, ((CharSequence) (obj)));
        TextView textview = new TextView(menuinflater);
        textview.setOnClickListener(onclicklistener);
        dgo.b(menuinflater, textview, 0x7f0101d7);
        textview.setText(((CharSequence) (obj)));
        obj = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int i1 = menuinflater.getResources().getDimensionPixelSize(0x7f0c0075);
        ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(i1, 0, i1, 0);
        textview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        menuinflater = new FrameLayout(menuinflater);
        menuinflater.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        menuinflater.addView(textview);
        ji.a(menu, 2);
        ji.a(menu, menuinflater);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        an = (new gaa(k(), ap, ao)).b(0x7f0804d3, 0x7f0804d2).a(0x7f0802ad, 0x7f0804d1).a();
        an.a(aq);
    }

    public final void a(com.spotify.mobile.android.spotlets.share.model.Network.Type type, com.spotify.mobile.android.spotlets.share.model.Network.State state)
    {
        Network anetwork[] = ai.getNetworks();
        int j1 = anetwork.length;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    Network network = anetwork[i1];
                    if (!network.getNetworkType().equals(type))
                    {
                        break label0;
                    }
                    a(new Network(network.getNetworkType(), state, network.getId(), network.getName()));
                }
                return;
            }
            i1++;
        } while (true);
    }

    protected final void a(Network network)
    {
        if (ai != null)
        {
            ai.replaceNetwork(network);
            fhs fhs1 = new fhs(network, aj);
            af.put(network.getNetworkType(), fhs1);
            fhs1.a(network.getState().equals(com.spotify.mobile.android.spotlets.share.model.Network.State.a));
            fho fho1 = ag.a(network.getNetworkType());
            ah.put(network.getNetworkType(), fho1);
            fho1.a();
            ae.a(fhs1, aa);
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f110058, null, al);
        am.a();
    }

    public final void d()
    {
        super.d();
        u().a(0x7f110058);
        am.e.b();
    }

    public final void d(boolean flag)
    {
        av = flag;
        if (!av)
        {
            ContentViewManager contentviewmanager = an;
            if (!av)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            contentviewmanager.a(flag);
        }
        H();
    }

    protected final com.spotify.mobile.android.spotlets.share.model.Network.Type[] e(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.add(com.spotify.mobile.android.spotlets.share.model.Network.Type.d);
        }
        Iterator iterator = af.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((fhs)entry.getValue()).b())
            {
                arraylist.add(entry.getKey());
            }
        } while (true);
        return (com.spotify.mobile.android.spotlets.share.model.Network.Type[])arraylist.toArray(new com.spotify.mobile.android.spotlets.share.model.Network.Type[arraylist.size()]);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.aq;
    }

    // Unreferenced inner class fhn$7

/* anonymous class */
    final class _cls7
    {

        static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.spotlets.share.model.Network.Type.values().length];
            try
            {
                a[com.spotify.mobile.android.spotlets.share.model.Network.Type.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.spotlets.share.model.Network.Type.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.spotlets.share.model.Network.Type.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

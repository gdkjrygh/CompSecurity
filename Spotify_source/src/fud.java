// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.ItemLoadException;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class fud extends t
{

    SpotifyContextMenu Y;
    fug Z;
    boolean aa;
    public fue ab;
    private Handler ac;
    private eda ad;
    private Runnable ae;
    private boolean af;
    private an ag;

    public fud()
    {
        aa = true;
        ac = new Handler();
        ad = new eda() {

            private fud a;

            public final void a(SessionState sessionstate)
            {
                fud.a(a, sessionstate.j);
                if (fud.a(a) != null)
                {
                    fud.a(a).a(fud.b(a), fud.c(a));
                }
            }

            
            {
                a = fud.this;
                super();
            }
        };
        ae = new Runnable() {

            private fud a;

            public final void run()
            {
                a.dismiss();
            }

            
            {
                a = fud.this;
                super();
            }
        };
        ag = new an() {

            final fud a;

            public final da a(Bundle bundle)
            {
                return new cn(this, a.k()) {

                    private _cls3 k;

                    private Boolean s()
                    {
                        try
                        {
                            if (fud.b(k.a).c())
                            {
                                fui fui1 = fud.b(k.a).b();
                                fui1.a.set(fui1.a());
                            }
                        }
                        catch (ItemLoadException itemloadexception)
                        {
                            return Boolean.valueOf(false);
                        }
                        return Boolean.valueOf(true);
                    }

                    public final Object d()
                    {
                        return s();
                    }

                    protected final void f()
                    {
                        n();
                    }

            
            {
                k = _pcls3;
                super(context);
            }
                };
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                if (((Boolean)obj).booleanValue())
                {
                    obj = fud.b(a).b();
                    ((fui) (obj)).a(((fui) (obj)).a.get(), ((fui) (obj)).c);
                    ((fui) (obj)).b.set(true);
                    obj = a;
                    ((fud) (obj)).Z.a(((fud) (obj)).Y, ((fud) (obj)).aa);
                    return;
                } else
                {
                    Toast.makeText(a.k(), 0x7f0802c6, 0).show();
                    fud.e(a).post(fud.d(a));
                    return;
                }
            }

            
            {
                a = fud.this;
                super();
            }
        };
    }

    public static fud a(Context context, fuj fuj1, Object obj)
    {
        SpotifyContextMenu spotifycontextmenu = new SpotifyContextMenu();
        fuj1.a(spotifycontextmenu, obj);
        return a(spotifycontextmenu, (u)context);
    }

    public static fud a(SpotifyContextMenu spotifycontextmenu, u u1)
    {
        ctz.a(spotifycontextmenu);
        ctz.a(u1);
        boolean flag;
        if (spotifycontextmenu.d.size() == 0 && !spotifycontextmenu.e.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return null;
        }
        if (!((fuc)u1).n())
        {
            return null;
        } else
        {
            fud fud1 = new fud();
            fud1.Y = spotifycontextmenu;
            fud1.a(u1.a_(), "ContextMenuFragment");
            return fud1;
        }
    }

    static fug a(fud fud1)
    {
        return fud1.Z;
    }

    static boolean a(fud fud1, boolean flag)
    {
        fud1.aa = flag;
        return flag;
    }

    static SpotifyContextMenu b(fud fud1)
    {
        return fud1.Y;
    }

    static boolean c(fud fud1)
    {
        return fud1.aa;
    }

    static Runnable d(fud fud1)
    {
        return fud1.ae;
    }

    static Handler e(fud fud1)
    {
        return fud1.ac;
    }

    public final void A()
    {
        super.A();
        dismiss();
        edb.a(k()).b(ad);
    }

    public final Dialog c(Bundle bundle)
    {
        if (Y == null)
        {
            af = true;
            bundle = super.c(bundle);
        } else
        {
            Z = new fug(this);
            bundle = Z;
            Object obj = Y;
            boolean flag1 = aa;
            boolean flag;
            if (!((fug) (bundle)).c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag);
            bundle.d = ddw.a(((fug) (bundle)).b.k(), bundle.b(((SpotifyContextMenu) (obj)), flag1), ((gft)dmz.a(gft)).a(), ((fug) (bundle)).b.b(0x7f08022f), fug.a);
            bundle.c = true;
            bundle.a(((SpotifyContextMenu) (obj)), flag1);
            bundle = ((fug) (bundle)).d.a();
            obj = ddw.a(k(), bundle);
            bundle = ((Bundle) (obj));
            if (Y.c())
            {
                u().a(0x7f110088, null, ag);
                return ((Dialog) (obj));
            }
        }
        return bundle;
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        if (af)
        {
            dismiss();
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (ab != null)
        {
            ab.a();
        }
        if (Z != null)
        {
            Z.d.b();
        }
    }

    public final void z()
    {
        super.z();
        edb.a(k()).a(ad);
    }
}

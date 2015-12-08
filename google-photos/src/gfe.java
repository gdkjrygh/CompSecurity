// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public final class gfe extends noj
{

    private final Context a;
    private final ejn b;
    private final nal c;
    private final myf d;
    private final noz e;
    private final noz f;

    gfe(Context context)
    {
        a = context;
        c = (nal)olm.a(context, nal);
        b = (ejn)olm.a(context, ejn);
        d = (myf)olm.a(context, myf);
        e = noz.a(context, 3, "DefMovieMakerProvider", new String[0]);
        f = noz.a(context, 5, "DefMovieMakerProvider", new String[0]);
    }

    static nal a(gfe gfe1)
    {
        return gfe1.c;
    }

    public final Intent a(Uri uri, int i)
    {
        if (e.a())
        {
            noy.a("localMovieUri", uri);
            noy.a("accountId", Integer.valueOf(i));
        }
        return new Intent();
    }

    public final Intent a(boolean flag, boolean flag1, int i)
    {
        if (e.a())
        {
            noy.a("allowMultiple", Boolean.valueOf(true));
            noy.a("requireLocal", Boolean.valueOf(flag1));
            noy.a("accountId", Integer.valueOf(i));
        }
        hee hee1 = new hee(a);
        hee1.a = i;
        hee1 = hee1.a(true);
        if (flag1)
        {
            eky eky1 = new eky();
            eky1.h = true;
            hee1.h = eky1.a();
        }
        return hee1.a();
    }

    public final Uri a(Uri uri)
    {
        if (e.a())
        {
            noy.a("uri", uri);
        }
        return uri;
    }

    public final Parcelable a(int i, List list)
    {
        return new dmb(i, list);
    }

    public final Parcelable a(Context context, int i, String s)
    {
        Object obj = null;
        try
        {
            context = gfj.c(context, i, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
            if (f.a())
            {
                noy.a("mediaKey", s);
                return null;
            }
        }
        return context;
    }

    public final String a(String s, String s1)
    {
        if (e.a())
        {
            noy.a("gaiaId", s);
            noy.a("fileName", s1);
        }
        return "";
    }

    public final List a(Context context, Intent intent)
    {
        olm.a(context, hzh);
        context = new ArrayList(hzh.b(intent));
        intent = new ArrayList();
        for (int i = 0; i < context.size(); i++)
        {
            intent.add(b.a((ekp)context.get(i), ejm.c));
        }

        return intent;
    }

    public final List a(Intent intent)
    {
        intent = intent.getParcelableArrayListExtra("extra_media_list");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < intent.size(); i++)
        {
            arraylist.add(b.a((ekp)intent.get(i), ejm.c));
        }

        return arraylist;
    }

    public final Map a(int i, Collection collection)
    {
        if (e.a())
        {
            noy.a("accountId", Integer.valueOf(i));
            noy.a("mediaKeys", Arrays.asList(new Collection[] {
                collection
            }));
        }
        Map map;
        try
        {
            map = gfj.a(a, i, collection);
        }
        catch (eke eke1)
        {
            if (f.a())
            {
                noy.a("accountId", Integer.valueOf(i));
                noy.a("mediaKeys", collection);
            }
            return new HashMap();
        }
        return map;
    }

    public final mtf a(Parcelable parcelable)
    {
        return new gsm((ekq)parcelable);
    }

    public final nns a(int i, String s)
    {
        Object obj;
        obj = null;
        if (e.a())
        {
            noy.a("accountId", Integer.valueOf(i));
            noy.a("mediaKey", s);
        }
        if (i == -1)
        {
            if (f.a())
            {
                noy.a("accountId", Integer.valueOf(i));
                noy.a("mediaKey", s);
            }
            return new gfd(null, null);
        }
        ekp ekp1 = gfj.b(a, i, s);
_L2:
        return new gfd(a, ekp1);
        eke eke1;
        eke1;
        eke1 = obj;
        if (f.a())
        {
            noy.a("accountId", Integer.valueOf(i));
            noy.a("mediaKey", s);
            eke1 = obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final okf a(Context context, int i, String s, okj okj1)
    {
        if (e.a())
        {
            noy.a("mediaKey", s);
        }
        Object obj;
        if (i != -1)
        {
            if ((obj = b(context, i, s)) != null)
            {
                if ("file".equals(((Uri) (obj)).getScheme()))
                {
                    return new gfi(new File(((Uri) (obj)).getPath()));
                } else
                {
                    obj = ((Uri) (obj)).toString();
                    return new okh(new okg(s, new oke(new okk(new gff(this, i, context), ((String) (obj))), okj1.a()), okj1));
                }
            }
        }
        return null;
    }

    public final void a(Context context)
    {
        ((dgk)olm.a(context, dgk)).a(dgw.a, true);
    }

    public final void a(Context context, Parcelable parcelable)
    {
        if (e.a())
        {
            noy.a("mediaToShare", parcelable);
        }
        parcelable = (ekp)parcelable;
        if (parcelable == null)
        {
            return;
        } else
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(parcelable);
            ((dhw)olm.a(context, dhw)).a(arraylist, new dhx());
            return;
        }
    }

    public final void a(Context context, String s)
    {
        context = (dgk)olm.a(context, dgk);
        dgg dgg1 = context.a().a((int)dgh.b.c);
        dgg1.d = s;
        context.a(dgg1.a());
    }

    public final void a(String s, Uri uri)
    {
        if (e.a())
        {
            noy.a("mediaKey", s);
            noy.a("uri", uri);
        }
        ((gfq)olm.a(a, gfq)).a(s, uri);
    }

    public final void a(olm olm1)
    {
        olm1.a(dhw);
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(int i)
    {
        boolean flag = d.a(gfx.a, i);
        if (e.a())
        {
            noy.a("enabled", Boolean.valueOf(flag));
        }
        return flag;
    }

    public final Uri b(Context context, int i, String s)
    {
        try
        {
            context = gfj.a(context, i, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (f.a())
            {
                noy.a("accountId", Integer.valueOf(i));
                noy.a("mediaKey", s);
            }
            return null;
        }
        return context;
    }

    public final List b()
    {
        return gfj.a(a);
    }

    public final Map b(int i)
    {
        return c.a(i);
    }

    public final mtf b(Context context)
    {
        context = (mmr)olm.a(context, mmr);
        return new gco(get.h, context.d());
    }

    public final int c(Context context)
    {
        return ((mmr)olm.a(context, mmr)).d();
    }

    public final Future c(Context context, int i, String s)
    {
        if (e.a())
        {
            noy.a("mediaKey", s);
        }
        try
        {
            context = gfj.d(context, i, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (f.a())
            {
                noy.a("mediaKey", s);
            }
            return pwf.a(context);
        }
        return context;
    }

    public final boolean c()
    {
        return d();
    }

    public final boolean d()
    {
        noe noe1 = (noe)olm.a(a, noe);
        return gfj.a() || noe1.a();
    }

    public final boolean d(Context context, int i, String s)
    {
        if (e.a())
        {
            noy.a("mediaKey", s);
        }
        return (new gfg(context, i)).a(s);
    }

    public final String e()
    {
        return "AddPendingMedia";
    }

    public final void f()
    {
        ((gfq)olm.a(a, gfq)).a();
    }
}

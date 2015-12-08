// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;

public final class gwb
    implements dir
{

    final gue a;
    gvv b;
    private final Context c;
    private final gvs d;
    private final gwd e;
    private final gur f;
    private final gvz g;
    private final noz h;

    public gwb(Context context, gue gue1)
    {
        this(context, gue1, null);
    }

    gwb(Context context, gue gue1, gvv gvv1)
    {
        c = context;
        a = gue1;
        d = (gvs)olm.a(context, gvs);
        e = (gwd)olm.a(context, gwd);
        f = (gur)olm.a(context, gur);
        g = (gvz)olm.a(context, gvz);
        h = noz.a(context, "SaveEditsOptimAction", new String[0]);
        b = gvv1;
    }

    private diq a(gue gue1)
    {
        String s;
        Object obj;
        byte abyte0[];
        gum gum1;
        try
        {
            obj = e.a(gue1);
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            if (h.a())
            {
                noy.a("exception", gue1);
            }
            return diq.b;
        }
        s = ((gwf) (obj)).a;
        abyte0 = ((gwf) (obj)).b;
        try
        {
            gum1 = g.a(gue1);
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            if (h.a())
            {
                noy.a("exception", gue1);
            }
            return diq.b;
        }
        abyte0 = a(gum1, abyte0);
        f.a(gue1.a, abyte0);
        gue1 = mtj.b(c, new hlp(a.a, Collections.singletonList(s)));
        if (gue1.c())
        {
            if (h.a())
            {
                noy.a("exception", ((mue) (gue1)).c);
            }
            return diq.b;
        } else
        {
            return diq.a;
        }
    }

    private diq a(gvv gvv1)
    {
        ekp ekp1 = a(gvv1.a);
        gvv1 = gvv1.b;
        gum gum1 = f.a(a.a, ((gum) (gvv1)).a);
        gvv1 = a(((gum) (gvv1)), e.a(gum1, gvv1));
        gvv1 = a(((gum) (gvv1)), e.a(ekp1, a, gvv1));
        f.a(a.a, gvv1);
        gvv1 = diq.a;
        return gvv1;
        gvv1;
_L2:
        if (h.a())
        {
            noy.a("exception", gvv1);
        }
        return diq.b;
        gvv1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private ekp a(Uri uri)
    {
        uri = d.a(a, uri);
        ekv ekv1 = b.a(c, uri);
        try
        {
            uri = (ekp)ekv1.a(uri, (new ekm()).a(hpg).a(fzu).a()).a();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwa("Failed to load resolved media feature", uri);
        }
        return uri;
    }

    private static gum a(gum gum1, byte abyte0[])
    {
        gum1 = (new guo()).a(gum1);
        gum1.g = abyte0;
        return gum1.a();
    }

    public final String ao_()
    {
        return "com.google.android.apps.photos.photoeditor.save.SaveEditsOptimisticAction";
    }

    public final din b()
    {
        if (((hpg)a.c.a(hpg)).c() != null)
        {
            Bundle bundle;
            try
            {
                b = d.a(a);
            }
            catch (gwa gwa1)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putString("EXCEPTION", gwa1.toString());
                return new din(false, "Failed to save media locally", bundle1);
            }
            bundle = new Bundle();
            bundle.putParcelable("MEDIA_LOCAL_URI", b.a);
            bundle.putParcelable("MEDIA_UPDATED_EDIT", b.b);
            return din.a(bundle);
        } else
        {
            return din.a(null);
        }
    }

    public final diq c()
    {
        if (b != null)
        {
            return a(b);
        } else
        {
            return a(a);
        }
    }

    public final boolean d()
    {
        return false;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public final class ejf
    implements ejn
{

    private final Context a;
    private final gfq b;

    public ejf(Context context)
    {
        a = context;
        b = (gfq)olm.a(context, gfq);
    }

    private static Uri a(ekp ekp1)
    {
        ekp1 = ((hpg)ekp1.a(hpg)).b();
        return (new android.net.Uri.Builder()).scheme("mediaKey").appendPath(((hpk) (ekp1)).c).build();
    }

    private String a()
    {
        return a.getString(b.lT);
    }

    public final Uri a(ekp ekp1, ejm ejm1)
    {
        Object obj;
        Object obj1;
        int i;
        obj = (elt)ekp1.b(elt);
        if (obj == null)
        {
            i = -1;
        } else
        {
            i = ((elt) (obj)).e().d();
        }
        obj1 = ekp1.c();
        if (obj1 != euv.c)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = (hpg)ekp1.b(hpg);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((hpg) (obj)).b();
        if (obj == null || !((hpk) (obj)).a()) goto _L2; else goto _L3
_L3:
        obj = b.a(((hpk) (obj)).c);
_L4:
        if (b.c(((Uri) (obj))))
        {
            obj = (jdy)ekp1.a(jdy);
            boolean flag;
            if (((jdy) (obj)).a() || ((jdy) (obj)).b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "Video must have a local or remote stream");
            if (((jdy) (obj)).a())
            {
                obj = ((jdy) (obj)).a.a;
            } else
            {
                obj = a(ekp1);
            }
        }
_L5:
        if (obj1 == euv.e && ejm1 == ejm.d)
        {
            obj = euv.c;
            obj1 = a(ekp1);
            ekp1 = ((ekp) (obj));
            obj = obj1;
        } else
        {
            ekp1 = ((ekp) (obj1));
        }
        if (b(((Uri) (obj))))
        {
            return ((Uri) (obj));
        } else
        {
            ekp1 = new eiz(i, ekp1, ((Uri) (obj)), ejm1);
            ejm1 = a();
            return (new android.net.Uri.Builder()).scheme("content").authority(ejm1).appendPath(Integer.toString(((eiz) (ekp1)).b)).appendPath(Integer.toString(((eiz) (ekp1)).c.f)).appendPath(((eiz) (ekp1)).d.toString()).appendPath(((eiz) (ekp1)).e.name()).appendPath(Integer.toString(Math.abs(eiz.a.nextInt()))).build();
        }
_L2:
        obj = null;
          goto _L4
        obj = ((elt)ekp1.a(elt)).e().g();
        if (((gap) (obj)).e())
        {
            obj = ((gap) (obj)).b();
        } else
        {
            obj = a(ekp1);
        }
          goto _L5
    }

    public final euv a(Uri uri)
    {
        p.a(b(uri), "must be a URI handled by MediaContentProvider");
        return eiz.a(uri).c;
    }

    public final void a(String s, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Uri uri = (Uri)collection.next();
            if (b(uri))
            {
                a.grantUriPermission(s, uri, 1);
            }
        } while (true);
    }

    public final boolean b(Uri uri)
    {
        return !b.c(uri) && "content".equals(uri.getScheme()) && a().equals(uri.getAuthority());
    }

    public final boolean c(Uri uri)
    {
        if (b(uri))
        {
            uri = eiz.a(uri);
            String s = ((eiz) (uri)).d.getScheme();
            if (((eiz) (uri)).c != euv.c && (((eiz) (uri)).e != ejm.c || "mediaKey".equals(s)))
            {
                return true;
            }
        }
        return false;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import java.util.List;
import java.util.Set;

public final class ame
    implements Cloneable
{

    private static final aml c = new alx();
    public ays a;
    public ame b;
    private final ama d;
    private final amh e;
    private final Class f;
    private final aym g;
    private aym h;
    private aml i;
    private Object j;
    private boolean k;
    private boolean l;

    ame(ama ama1, amh amh1, Class class1)
    {
        i = c;
        e = amh1;
        d = (ama)b.a(ama1, "Argument must not be null");
        f = class1;
        g = amh1.f;
        h = g;
    }

    private ayo a(azh azh1, aym aym1, ayp ayp, aml aml1, amb amb1, int i1, int j1)
    {
        aym1.s = true;
        return ayv.a(d, j, f, aym1, i1, j1, amb1, azh1, a, ayp, d.d, aml1.a);
    }

    private ayo a(azh azh1, ayy ayy1, aml aml1, amb amb1, int i1, int j1)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        aml aml2;
        if (l)
        {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        aml2 = b.i;
        if (c.equals(aml2))
        {
            aml2 = aml1;
        }
        if (!b.h.c(8)) goto _L4; else goto _L3
_L3:
        amb amb2 = b.h.c;
_L6:
        int l1 = b.h.j;
        int k1 = b.h.i;
        if (bag.a(i1, j1))
        {
            aym aym1 = b.h;
            if (!bag.a(aym1.j, aym1.i))
            {
                l1 = h.j;
                k1 = h.i;
            }
        }
        ayy1 = new ayy(ayy1);
        aml1 = a(azh1, h, ((ayp) (ayy1)), aml1, amb1, i1, j1);
        l = true;
        azh1 = b.a(azh1, ayy1, aml2, amb2, l1, k1);
        l = false;
        ayy1.a = aml1;
        ayy1.b = azh1;
        return ayy1;
_L4:
        switch (amg.b[amb1.ordinal()])
        {
        default:
            azh1 = String.valueOf(h.c);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(azh1).length() + 18)).append("unknown priority: ").append(azh1).toString());

        case 1: // '\001'
            amb2 = amb.c;
            break;

        case 2: // '\002'
            amb2 = amb.b;
            break;

        case 3: // '\003'
        case 4: // '\004'
            amb2 = amb.a;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return a(azh1, h, ((ayp) (ayy1)), aml1, amb1, i1, j1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final ame a()
    {
        ame ame1;
        try
        {
            ame1 = (ame)super.clone();
            ame1.h = ame1.h.a();
            ame1.i = ame1.i.a();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return ame1;
    }

    public final ame a(aml aml1)
    {
        i = (aml)b.a(aml1, "Argument must not be null");
        return this;
    }

    public final ame a(aym aym1)
    {
        b.a(aym1, "Argument must not be null");
        aym aym2;
        if (g == h)
        {
            aym2 = h.a();
        } else
        {
            aym2 = h;
        }
        h = aym2.a(aym1);
        return this;
    }

    public ame a(Object obj)
    {
        j = obj;
        k = true;
        return this;
    }

    public final ayn a(int i1, int j1)
    {
        ayq ayq1 = new ayq(d.a, i1, j1);
        if (bag.d())
        {
            d.a.post(new amf(this, ayq1));
            return ayq1;
        } else
        {
            a(((azh) (ayq1)));
            return ayq1;
        }
    }

    public final azh a(ImageView imageview)
    {
        bag.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (h.c(2048) || !h.m || imageview.getScaleType() == null) goto _L2; else goto _L1
_L1:
        if (h.s)
        {
            h = h.a();
        }
        amg.a[imageview.getScaleType().ordinal()];
        JVM INSTR tableswitch 1 4: default 108
    //                   1 143
    //                   2 173
    //                   3 173
    //                   4 173;
           goto _L2 _L3 _L4 _L4 _L4
_L2:
        Object obj;
        obj = d;
        obj = f;
        if (!android/graphics/Bitmap.equals(obj)) goto _L6; else goto _L5
_L5:
        imageview = new aza(imageview);
_L8:
        return a(((azh) (imageview)));
_L3:
        obj = h;
        ama ama1 = d;
        ((aym) (obj)).a(ama1, avk.b, new avi(ama1));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = h;
        ama ama2 = d;
        ((aym) (obj)).a(ama2, avk.a, new avs(ama2));
        continue; /* Loop/switch isn't completed */
_L6:
        if (!android/graphics/drawable/Drawable.isAssignableFrom(((Class) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        imageview = new azb(imageview);
        if (true) goto _L8; else goto _L7
_L7:
        imageview = String.valueOf(obj);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(imageview).length() + 64)).append("Unhandled class: ").append(imageview).append(", try .as*(Class).transcode(ResourceTranscoder)").toString());
        if (true) goto _L2; else goto _L9
_L9:
    }

    public final azh a(azh azh1)
    {
        bag.a();
        if (azh1 == null)
        {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!k)
        {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        if (azh1.a() != null)
        {
            e.a(azh1);
        }
        h.s = true;
        ayo ayo1 = a(azh1, null, i, h.c, h.j, h.i);
        azh1.a(ayo1);
        Object obj = e;
        ((amh) (obj)).e.a.add(azh1);
        obj = ((amh) (obj)).c;
        ((axy) (obj)).a.add(ayo1);
        if (!((axy) (obj)).c)
        {
            ayo1.a();
            return azh1;
        } else
        {
            ((axy) (obj)).b.add(ayo1);
            return azh1;
        }
    }

    public final ayn b()
    {
        return a(0x80000000, 0x80000000);
    }

    public final azh b(int i1, int j1)
    {
        return a(new aze(e, i1, j1));
    }

    public final Object clone()
    {
        return a();
    }

    static 
    {
        ((ayt)((ayt)(new ayt()).a(apa.c)).a(amb.d)).a(true);
    }
}

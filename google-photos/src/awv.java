// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class awv
    implements anl
{

    private final anl b;
    private final aqm c;

    public awv(Context context, anl anl1)
    {
        this(anl1, aly.b(context).a);
    }

    private awv(anl anl1, aqm aqm1)
    {
        b = (anl)b.a(anl1, "Argument must not be null");
        c = (aqm)b.a(aqm1, "Argument must not be null");
    }

    public final aqa a(aqa aqa1, int i, int j)
    {
        awr awr1 = (awr)aqa1.b();
        Object obj = new ave(awr1.a.a.j, c);
        Object obj1 = b.a(((aqa) (obj)), i, j);
        if (!obj.equals(obj1))
        {
            ((aqa) (obj)).d();
        }
        obj = (Bitmap)((aqa) (obj1)).b();
        obj1 = b;
        awr1.a.a.a(((anl) (obj1)), ((Bitmap) (obj)));
        return aqa1;
    }

    public final void a(MessageDigest messagedigest)
    {
        b.a(messagedigest);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof awv)
        {
            obj = (awv)obj;
            return b.equals(((awv) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.security.MessageDigest;

public final class avc
    implements anl
{

    private final Context b;
    private final aqm c;
    private final anl d;

    public avc(Context context, anl anl1)
    {
        this(context, aly.b(context).a, anl1);
    }

    private avc(Context context, aqm aqm1, anl anl1)
    {
        b = context.getApplicationContext();
        c = (aqm)b.a(aqm1, "Argument must not be null");
        d = (anl)b.a(anl1, "Argument must not be null");
    }

    public final aqa a(aqa aqa1, int i, int j)
    {
        ave ave1 = ave.a(((BitmapDrawable)aqa1.b()).getBitmap(), c);
        Object obj = d.a(ave1, i, j);
        if (obj.equals(ave1))
        {
            return aqa1;
        } else
        {
            aqa1 = b;
            obj = (Bitmap)((aqa) (obj)).b();
            return avx.a(aqa1.getResources(), aly.b(aqa1).a, ((Bitmap) (obj)));
        }
    }

    public final void a(MessageDigest messagedigest)
    {
        d.a(messagedigest);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof avc)
        {
            obj = (avc)obj;
            return d.equals(((avc) (obj)).d);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return d.hashCode();
    }
}

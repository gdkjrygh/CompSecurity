// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;

public final class dtu
    implements TypeEvaluator
{

    private ArgbEvaluator a;

    public dtu()
    {
    }

    public static dtu a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            dtu dtu1 = new dtu();
            dtu1.a = new ArgbEvaluator();
            return dtu1;
        } else
        {
            return new dtu();
        }
    }

    public final Object evaluate(float f, Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        if (a != null)
        {
            return (Integer)a.evaluate(f, obj, obj1);
        } else
        {
            int l = ((Integer) (obj)).intValue();
            int i = l >>> 24;
            int j = l >> 16 & 0xff;
            int k = l >> 8 & 0xff;
            l &= 0xff;
            int i1 = ((Integer) (obj1)).intValue();
            int j1 = (int)((float)((i1 >>> 24) - i) * f);
            int k1 = (int)((float)((i1 >> 16 & 0xff) - j) * f);
            int l1 = (int)((float)((i1 >> 8 & 0xff) - k) * f);
            return Integer.valueOf(l + (int)((float)((i1 & 0xff) - l) * f) | (i + j1 << 24 | j + k1 << 16 | l1 + k << 8));
        }
    }
}

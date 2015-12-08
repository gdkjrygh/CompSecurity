// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public final class dtv
    implements TypeEvaluator
{

    private Rect a;

    public dtv(Rect rect)
    {
        a = rect;
    }

    public final Object evaluate(float f, Object obj, Object obj1)
    {
        obj = (Rect)obj;
        obj1 = (Rect)obj1;
        int i = ((Rect) (obj)).left;
        i = (int)((float)(((Rect) (obj1)).left - ((Rect) (obj)).left) * f) + i;
        int j = ((Rect) (obj)).top;
        j = (int)((float)(((Rect) (obj1)).top - ((Rect) (obj)).top) * f) + j;
        int k = ((Rect) (obj)).right;
        k = (int)((float)(((Rect) (obj1)).right - ((Rect) (obj)).right) * f) + k;
        int l = ((Rect) (obj)).bottom;
        l = (int)((float)(((Rect) (obj1)).bottom - ((Rect) (obj)).bottom) * f) + l;
        if (a == null)
        {
            return new Rect(i, j, k, l);
        } else
        {
            a.set(i, j, k, l);
            return a;
        }
    }
}

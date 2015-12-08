// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;

public final class mlp
    implements mlo
{

    public mlp()
    {
    }

    public final PointF calculate(float f, PointF apointf[], PointF pointf)
    {
        float f1 = 1.0F - f;
        float f2 = f1 * f1;
        float f3 = f2 * f1;
        float f4 = f * f;
        float f5 = f4 * f;
        float f6 = apointf[0].x;
        float f7 = apointf[1].x;
        float f8 = apointf[2].x;
        float f9 = apointf[3].x;
        float f10 = apointf[0].y;
        float f11 = apointf[1].y;
        pointf.set(f6 * f3 + 3F * f2 * f * f7 + 3F * f1 * f4 * f8 + f9 * f5, f1 * 3F * f4 * apointf[2].y + (f2 * 3F * f * f11 + f3 * f10) + apointf[3].y * f5);
        return pointf;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextPaint;

public final class dgg
{

    public static int a(TextPaint textpaint, int i)
    {
        float f = 0.0F;
        float af[] = new float["0123456789".length()];
        textpaint.getTextWidths("0123456789", af);
        for (int j = 0; j < "0123456789".length();)
        {
            float f1 = f;
            if (af[j] > f)
            {
                f1 = af[j];
            }
            j++;
            f = f1;
        }

        return (int)(f * (float)i + 0.5F);
    }
}

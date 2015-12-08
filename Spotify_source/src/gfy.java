// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextPaint;
import android.widget.TextView;

public final class gfy
{

    public static int a(TextPaint textpaint)
    {
        float f = 0.0F;
        float af[] = new float["01234567890".length()];
        textpaint.getTextWidths("01234567890", af);
        for (int i = 0; i < "01234567890".length();)
        {
            float f1 = f;
            if (af[i] > f)
            {
                f1 = af[i];
            }
            i++;
            f = f1;
        }

        return (int)(f + 0.5F);
    }

    public static String a(TextView textview)
    {
        if (textview == null)
        {
            return "";
        }
        textview = textview.getText();
        if (textview == null)
        {
            return "";
        } else
        {
            return textview.toString();
        }
    }
}

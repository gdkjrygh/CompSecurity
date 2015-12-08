// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;


// Referenced classes of package com.google.android.libraries.handwriting.base:
//            StrokeList, RecognitionResult, b

public abstract class HandwritingRecognizer
{

    public HandwritingRecognizer g;

    public HandwritingRecognizer()
    {
        g = null;
    }

    public abstract RecognitionResult a(StrokeList strokelist);

    public abstract b a();

    public String a(String s, StrokeList strokelist, String s1, String s2)
    {
        if (d() && c())
        {
            HandwritingRecognizer handwritingrecognizer = g;
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "datacollector_".concat(s1);
            } else
            {
                s1 = new String("datacollector_");
            }
            return handwritingrecognizer.a(s, strokelist, s1, s2);
        } else
        {
            return "";
        }
    }

    public String a(String s, String s1, String s2, String s3)
    {
        if (d() && c())
        {
            return g.a(s, s1, s2, s3);
        } else
        {
            return "";
        }
    }

    public abstract boolean b();

    public abstract boolean c();

    public boolean d()
    {
        return g != null;
    }
}

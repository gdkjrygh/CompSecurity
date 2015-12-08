// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

public class resultScore
{

    public final int resultScore;
    public final String resultString;
    final NVASpeechKit this$0;

    public int getResultScore()
    {
        return resultScore;
    }

    public String getResultString()
    {
        return resultString;
    }

    public (String s, double d)
    {
        this$0 = NVASpeechKit.this;
        super();
        resultString = s;
        resultScore = (int)d;
    }
}

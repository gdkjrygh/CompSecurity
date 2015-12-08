// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static class setBuilder extends setBuilder
{

    ArrayList mTexts;

    public setBuilder addLine(CharSequence charsequence)
    {
        mTexts.add(charsequence);
        return this;
    }

    public mTexts setBigContentTitle(CharSequence charsequence)
    {
        mBigContentTitle = charsequence;
        return this;
    }

    public mBigContentTitle setSummaryText(CharSequence charsequence)
    {
        mSummaryText = charsequence;
        mSummaryTextSet = true;
        return this;
    }

    public ()
    {
        mTexts = new ArrayList();
    }

    public mTexts(mTexts mtexts)
    {
        mTexts = new ArrayList();
        setBuilder(mtexts);
    }
}

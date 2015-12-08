// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static class setBuilder extends setBuilder
{

    CharSequence mBigText;

    public setBuilder bigText(CharSequence charsequence)
    {
        mBigText = CharSequenceLength(charsequence);
        return this;
    }

    public CharSequenceLength setBigContentTitle(CharSequence charsequence)
    {
        mBigContentTitle = CharSequenceLength(charsequence);
        return this;
    }

    public CharSequenceLength setSummaryText(CharSequence charsequence)
    {
        mSummaryText = CharSequenceLength(charsequence);
        mSummaryTextSet = true;
        return this;
    }

    public ()
    {
    }

    public ( )
    {
        setBuilder();
    }
}

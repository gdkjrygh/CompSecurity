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
        mBigText = charsequence;
        return this;
    }

    public mBigText setBigContentTitle(CharSequence charsequence)
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
    }

    public ( )
    {
        setBuilder();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static final class mTexts extends mTexts
{

    ArrayList mTexts;

    public final mTexts addLine(CharSequence charsequence)
    {
        mTexts.add(itCharSequenceLength(charsequence));
        return this;
    }

    public final itCharSequenceLength setSummaryText(CharSequence charsequence)
    {
        mSummaryText = itCharSequenceLength(charsequence);
        mSummaryTextSet = true;
        return this;
    }

    public ()
    {
        mTexts = new ArrayList();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public static abstract class mSummaryTextSet
{

    CharSequence mBigContentTitle;
    r mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet;

    public Notification build()
    {
        Notification notification = null;
        if (mBuilder != null)
        {
            notification = mBuilder.build();
        }
        return notification;
    }

    public void setBuilder(r r)
    {
        if (mBuilder != r)
        {
            mBuilder = r;
            if (mBuilder != null)
            {
                mBuilder.setStyle(this);
            }
        }
    }

    public r()
    {
        mSummaryTextSet = false;
    }
}

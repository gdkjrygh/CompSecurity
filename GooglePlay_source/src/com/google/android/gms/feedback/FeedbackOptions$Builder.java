// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptions

public static final class mFileTeleporters
{

    private ArrayList mFileTeleporters;
    private Bundle mPsdBundle;
    public Bitmap mScreenshot;

    public final FeedbackOptions build()
    {
        return FeedbackOptions.access$900(FeedbackOptions.access$800(FeedbackOptions.access$700(FeedbackOptions.access$600(FeedbackOptions.access$500(FeedbackOptions.access$400(FeedbackOptions.access$300(FeedbackOptions.access$200(FeedbackOptions.access$100(new FeedbackOptions((byte)0), mScreenshot), null), null), mPsdBundle), null), mFileTeleporters), false), null), null);
    }

    public ()
    {
        mPsdBundle = new Bundle();
        mFileTeleporters = new ArrayList();
    }
}

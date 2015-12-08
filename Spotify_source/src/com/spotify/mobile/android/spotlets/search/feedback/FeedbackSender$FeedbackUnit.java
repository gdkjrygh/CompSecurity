// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.feedback;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

// Referenced classes of package com.spotify.mobile.android.spotlets.search.feedback:
//            FeedbackType

public class mComments
    implements JacksonModel
{

    private final String mComments;
    private final String mExpectedResultType;
    private final String mQuery;
    private final String mSubView;
    private final FeedbackType mType;

    public String getComments()
    {
        return mComments;
    }

    public String getExpectedResultType()
    {
        return mExpectedResultType;
    }

    public String getQuery()
    {
        return mQuery;
    }

    public String getSubView()
    {
        return mSubView;
    }

    public FeedbackType getType()
    {
        return mType;
    }

    (FeedbackType feedbacktype, String s, String s1, String s2, String s3)
    {
        mSubView = (String)ctz.a(s);
        mType = (FeedbackType)ctz.a(feedbacktype);
        mExpectedResultType = s2;
        mQuery = s1;
        mComments = s3;
    }
}

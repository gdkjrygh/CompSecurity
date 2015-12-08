// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class OI
{

    public View mFeedListItem;
    public boolean mIsFlinging;

    public OI(View view, boolean flag)
    {
        mIsFlinging = false;
        mFeedListItem = view;
        mIsFlinging = flag;
    }
}

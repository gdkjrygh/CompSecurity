// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;


// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxGotItCardAdapter

public static class mLogflowDocumentId
{

    public final int mBackgroundResId;
    public final int mDescriptionResId;
    public final int mGotItButtonResId;
    public final int mImageResId;
    public final int mLearnMoreButtonResId;
    public final String mLogflowDocumentId;
    public final int mLogflowParentType;
    public final int mTitleResId;

    public (int i, int j, int k, int l)
    {
        this(i, j, 0, k, l, 0, 0);
    }

    public <init>(int i, int j, int k, int l, int i1, int j1)
    {
        this(0x7f0b0061, i, j, k, l, i1, j1);
    }

    private <init>(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        mBackgroundResId = i;
        mImageResId = j;
        mTitleResId = k;
        mDescriptionResId = l;
        mGotItButtonResId = i1;
        mLearnMoreButtonResId = j1;
        mLogflowParentType = k1;
        mLogflowDocumentId = null;
    }
}

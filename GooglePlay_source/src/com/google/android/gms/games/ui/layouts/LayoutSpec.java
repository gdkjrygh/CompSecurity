// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;


public final class LayoutSpec
{

    public final int mAnimationType;
    public final int mImageResizeMode;
    public final String mLayoutSlot;
    public final int mLayoutSlotIndex;
    public final String mLayoutSlotType;
    public final int mLayoutSubSlot;
    public final int mRootId;
    public final String mSharedViewName;

    public LayoutSpec(String s, int i, int j, String s1, int k, String s2, int l, 
            int i1)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = s.toUpperCase();
        }
        mLayoutSlot = s;
        mLayoutSubSlot = i;
        mAnimationType = j;
        mSharedViewName = s1;
        mRootId = k;
        mLayoutSlotType = s2;
        mLayoutSlotIndex = l;
        mImageResizeMode = i1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(mLayoutSlot).append("/").append(mLayoutSubSlot).append("/").append(mSharedViewName).toString();
    }
}

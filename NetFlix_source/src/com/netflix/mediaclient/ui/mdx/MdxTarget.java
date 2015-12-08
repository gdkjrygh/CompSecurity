// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.util.Pair;

public final class MdxTarget
{

    private static final String TAG = "nf_mdx";
    private String mFriendlyName;
    private boolean mLocal;
    private String mUUID;

    private MdxTarget(String s, String s1, boolean flag)
    {
        mUUID = s;
        mFriendlyName = s1;
        mLocal = flag;
    }

    public static MdxTarget createLocalTarget()
    {
        return new MdxTarget(null, null, true);
    }

    public static MdxTarget createRemoteTarget(Pair pair)
    {
        return new MdxTarget((String)pair.first, (String)pair.second, false);
    }

    public String getFriendlyName()
    {
        return mFriendlyName;
    }

    public String getUUID()
    {
        return mUUID;
    }

    public boolean isLocal()
    {
        return mLocal;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MdxTarget [TAG=nf_mdx, mUUID=").append(mUUID).append(", friendlyName=").append(mFriendlyName).append(", local=").append(mLocal).append("]").toString();
    }
}

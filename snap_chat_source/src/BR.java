// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class BR
    implements BT
{

    public List mComponents;
    public String mConfigPath;
    public String mFilesPath;
    private String mHintId;
    public String mImageId;
    public String mLensCode;

    public BR()
    {
    }

    public BR(String s, String s1, List list, String s2)
    {
        mLensCode = s;
        mImageId = s1;
        mHintId = null;
        mComponents = list;
        mFilesPath = s2;
    }

    public final String a()
    {
        return mLensCode;
    }

    public final String b()
    {
        return mLensCode;
    }

    public final List c()
    {
        return mComponents;
    }

    public final String d()
    {
        return mHintId;
    }

    public final String e()
    {
        return mFilesPath;
    }

    public final boolean f()
    {
        return false;
    }

    public final boolean g()
    {
        return mComponents != null && mFilesPath != null;
    }

    public final String toString()
    {
        return ds.a(this).a("lensCode", mLensCode).a("imageId", mImageId).a("hintId", mHintId).a("filesPath", mFilesPath).a("isPreparingResources", false).a("hasPreparedResources", g()).toString();
    }
}

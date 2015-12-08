// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;


public final class ImageUrlUtils
{
    public static final class ContentImageUrlBuilder extends ImageUrlBuilder
    {

        public final String build()
        {
            if (mUrl == null)
            {
                return null;
            }
            StringBuilder stringbuilder = new StringBuilder(mUrl);
            String s;
            boolean flag;
            boolean flag1;
            if (mUrl.lastIndexOf("=") == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (mSize >= 0)
            {
                if (flag)
                {
                    s = "=";
                } else
                {
                    s = "-";
                }
                stringbuilder.append(s).append("s").append(mSize);
                flag1 = false;
            }
            if (mIsBlackAndWhite)
            {
                if (flag1)
                {
                    s = "=";
                } else
                {
                    s = "-";
                }
                stringbuilder.append(s).append("fbw=1");
            }
            return stringbuilder.toString();
        }

        public ContentImageUrlBuilder(String s)
        {
            super(s);
        }
    }

    public static abstract class ImageUrlBuilder
    {

        protected boolean mIsBlackAndWhite;
        protected int mSize;
        protected String mUrl;

        public abstract String build();

        public final ImageUrlBuilder setBlackAndWhite(boolean flag)
        {
            mIsBlackAndWhite = false;
            return this;
        }

        public final ImageUrlBuilder setSize(int i)
        {
            mSize = i;
            return this;
        }

        protected ImageUrlBuilder(String s)
        {
            mSize = -1;
            mIsBlackAndWhite = false;
            mUrl = s;
        }
    }

    public static final class ProfileImageUrlBuilder extends ImageUrlBuilder
    {

        public boolean mAllowSilhouette;

        public final String build()
        {
            if (mUrl != null)
            {
                String as[] = mUrl.split("/");
                int j = as.length;
                if (j >= 7 && j <= 9)
                {
                    StringBuilder stringbuilder;
                    boolean flag;
label0:
                    {
                        stringbuilder = new StringBuilder();
                        boolean flag2 = true;
                        int i = 0;
                        do
                        {
                            flag = flag2;
                            if (i >= j)
                            {
                                break label0;
                            }
                            if (i >= 7)
                            {
                                break;
                            }
                            stringbuilder.append(as[i]).append("/");
                            i++;
                        } while (true);
                        flag = flag2;
                        if (!as[i].contains("."))
                        {
                            stringbuilder.append(as[i]);
                            flag = false;
                        }
                    }
                    boolean flag1 = flag;
                    if (mSize >= 0)
                    {
                        if (!flag)
                        {
                            stringbuilder.append('-');
                        }
                        stringbuilder.append('s').append(mSize);
                        flag1 = false;
                    }
                    flag = flag1;
                    if (mIsBlackAndWhite)
                    {
                        if (!flag1)
                        {
                            stringbuilder.append('-');
                        }
                        stringbuilder.append("fbw=1");
                        flag = false;
                    }
                    flag1 = flag;
                    if (!mAllowSilhouette)
                    {
                        if (!flag)
                        {
                            stringbuilder.append('-');
                        }
                        stringbuilder.append("ns");
                        flag1 = false;
                    }
                    String s;
                    if (flag1)
                    {
                        s = "";
                    } else
                    {
                        s = "/";
                    }
                    stringbuilder.append(s);
                    return stringbuilder.toString();
                }
            }
            return null;
        }

        public ProfileImageUrlBuilder(String s)
        {
            super(s);
            mAllowSilhouette = true;
        }
    }

}

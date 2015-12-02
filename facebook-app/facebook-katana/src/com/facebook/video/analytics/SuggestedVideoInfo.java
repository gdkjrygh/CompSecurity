// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public class SuggestedVideoInfo
{

    private boolean a;
    private String b;

    public SuggestedVideoInfo()
    {
    }

    public SuggestedVideoInfo(Builder builder)
    {
        a = builder.a;
        b = builder.b;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final boolean a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    private class Builder
    {

        public final boolean a;
        public String b;

        public final Builder a(String s)
        {
            b = s;
            return this;
        }

        public final SuggestedVideoInfo a()
        {
            return new SuggestedVideoInfo(this);
        }

        public Builder(boolean flag)
        {
            a = flag;
        }
    }

}

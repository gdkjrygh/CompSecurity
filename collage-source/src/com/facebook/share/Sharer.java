// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share;


public interface Sharer
{
    public static class Result
    {

        final String postId;

        public String getPostId()
        {
            return postId;
        }

        public Result(String s)
        {
            postId = s;
        }
    }


    public abstract boolean getShouldFailOnDataError();

    public abstract void setShouldFailOnDataError(boolean flag);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;


public interface CollectionPager
{
    public static final class FetchPageException extends Exception
    {

        public FetchPageException(String s)
        {
            super(s);
        }

        public FetchPageException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

}

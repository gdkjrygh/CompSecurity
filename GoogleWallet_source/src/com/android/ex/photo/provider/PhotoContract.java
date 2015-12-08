// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.provider;


public final class PhotoContract
{
    public static interface PhotoQuery
    {

        public static final String OPTIONAL_COLUMNS[] = {
            "loadingIndicator"
        };
        public static final String PROJECTION[] = {
            "uri", "_display_name", "contentUri", "thumbnailUri", "contentType"
        };

    }

}

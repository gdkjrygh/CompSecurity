// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.utils;

import android.net.Uri;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

public final class UriUtils
{

    public static String getDataStoreNameFromClientContext(ClientContext clientcontext)
    {
        return Integer.toHexString(clientcontext.getResolvedAccountName().hashCode());
    }

    public static String getDataStoreNameFromUri(Uri uri)
    {
        uri = uri.getPathSegments();
        if (uri.size() < 2)
        {
            throw new IllegalArgumentException("Given URI is malformed");
        } else
        {
            return (String)uri.get(1);
        }
    }

    public static String getExternalGameIdFromGameImageUri(Uri uri)
    {
        uri = uri.getPathSegments();
        if (uri.size() < 4)
        {
            throw new IllegalArgumentException("Given URI is malformed");
        } else
        {
            return (String)uri.get(3);
        }
    }

    public static long getGameIdFromGameImageUri(Uri uri)
    {
        uri = uri.getPathSegments();
        if (uri.size() < 3)
        {
            throw new IllegalArgumentException("Given URI is malformed");
        }
        long l;
        try
        {
            l = Long.parseLong((String)uri.get(2));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't parse game ID from ")).append((String)uri.get(2)).toString());
        }
        return l;
    }

    public static String getImageIdFromImageUri(Uri uri)
    {
        uri = uri.getPathSegments();
        if (uri.size() < 3)
        {
            throw new IllegalArgumentException("Given URI is malformed");
        } else
        {
            return (String)uri.get(2);
        }
    }
}

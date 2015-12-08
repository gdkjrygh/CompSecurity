// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.List;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaContract

public static class 
    implements BaseColumns
{

    public static final String ALL_COLUMNS[] = {
        "_id", "updated", "name", "address", "protocol", "http_port", "tcp_port", "username", "password", "mac_address", 
        "wol_port", "use_event_server", "event_server_port"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildHostUri(long l)
    {
        return CONTENT_URI.buildUpon().th(String.valueOf(l)).th();
    }

    public static String getHostId(Uri uri)
    {
        return (String)uri.getPathSegments().get(1);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().th("hosts").th();
    }
}

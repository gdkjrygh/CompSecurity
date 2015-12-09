// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.offline.service.OfflineService;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;

public class for
    implements dmx
{

    public for()
    {
    }

    public static void a(Context context)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("unaccepted_licenses", Integer.valueOf(0));
        context.getContentResolver().update(dtx.a, contentvalues, null, null);
    }

    public static void a(Context context, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("is_seen", Integer.valueOf(1));
        context.getContentResolver().update(ContentUris.withAppendedId(dtp.b, l), contentvalues, null, null);
    }

    public static void a(Context context, Uri uri, boolean flag)
    {
        d(context, uri.toString(), flag);
    }

    public static void a(Context context, Verified verified, boolean flag)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, com.spotify.mobile.android.util.ClientEvent.SubEvent.bx);
        clientevent.a("value", String.valueOf(flag));
        fop.a(context, verified, clientevent);
        verified = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        verified.put("offline_mode", Integer.valueOf(i));
        context.getContentResolver().update(dtx.a, verified, null, null);
    }

    public static void a(Context context, String s, long l)
    {
        context.getContentResolver().delete(ContentUris.withAppendedId(dtt.b(s), l), null, null);
    }

    public static void a(Context context, String s, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_subscribed", Integer.valueOf(i));
        context.getContentResolver().update(dtt.a(s), contentvalues, null, null);
    }

    public static void b(Context context, long l)
    {
        context.getContentResolver().delete(ContentUris.withAppendedId(dts.a, l), null, null);
    }

    public static void b(Context context, String s, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_collaborative", Integer.valueOf(i));
        context.getContentResolver().update(dtt.a(s), contentvalues, null, null);
    }

    public static void c(Context context, String s, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("is_published", Integer.valueOf(i));
        context.getContentResolver().update(dtt.a(s), contentvalues, null, null);
    }

    public static void d(Context context, String s, boolean flag)
    {
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(s)).c;
        Uri uri = Uri.parse(s);
        if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ || linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            OfflineService.a(context, s, flag);
        } else
        if (!Uri.EMPTY.equals(uri))
        {
            s = new ContentValues();
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.put("offline_state", Integer.valueOf(i));
            context.getContentResolver().update(uri, s, null, null);
            return;
        }
    }
}

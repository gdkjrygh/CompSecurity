// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.internal.provider.SpotifyProvider;

final class ang.Object
    implements an
{

    private final String a[] = {
        "row"
    };
    private gge b;

    public final da a(Bundle bundle)
    {
        Uri uri = Uri.parse(bundle.getString("content_uri"));
        String s = bundle.getString("track_uri");
        bundle = bundle.getString("sort_order");
        return new cu(b.b, Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/track_lookup/").append(Uri.encode(s)).append("/").append(Uri.encode(uri.getEncodedPath().substring(1))).toString()), a, null, bundle);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
label0:
        {
            obj = (Cursor)obj;
            if (((Cursor) (obj)).moveToFirst() && b.a != null)
            {
                int i = ((Cursor) (obj)).getInt(0);
                if (i < 0)
                {
                    break label0;
                }
                b.a.a(i);
            }
            return;
        }
        b.a.a();
    }

    (gge gge1)
    {
        b = gge1;
        super();
    }
}

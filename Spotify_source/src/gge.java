// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class gge
{

    ggf a;
    Context b;
    private am c;
    private int d;
    private an e;

    public gge(Context context, am am1, int i, ggf ggf)
    {
        e = new an() {

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
                        int j = ((Cursor) (obj)).getInt(0);
                        if (j < 0)
                        {
                            break label0;
                        }
                        b.a.a(j);
                    }
                    return;
                }
                b.a.a();
            }

            
            {
                b = gge.this;
                super();
            }
        };
        b = context;
        c = am1;
        d = i;
        a = ggf;
    }

    public final void a(Uri uri, String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("content_uri", uri.toString());
        bundle.putString("track_uri", s);
        bundle.putString("sort_order", s1);
        c.a(d, bundle, e);
    }
}

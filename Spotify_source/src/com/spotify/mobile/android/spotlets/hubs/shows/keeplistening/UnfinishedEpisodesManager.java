// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import cuv;
import drp;
import esx;
import esy;
import esz;

// Referenced classes of package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening:
//            UnfinishedEpisodes

public final class UnfinishedEpisodesManager
{

    private static String f = (new android.net.Uri.Builder()).scheme("sp").authority("core-collection").appendPath("v1/latest-resume-points").appendPath("16").build().toString();
    public final esx a;
    public UnfinishedEpisodes b;
    public Subscription c;
    public Type d;
    public boolean e;
    private final Context g;
    private final Resolver h;
    private JsonHttpCallbackReceiver i;

    public UnfinishedEpisodesManager(Context context, Resolver resolver, drp drp, esy esy)
    {
        i = new JsonHttpCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodes) {

            private UnfinishedEpisodesManager a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.a(throwable, "Error subscribing to latest-resume-points %s", new Object[] {
                    errorcause
                });
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (UnfinishedEpisodes)obj;
                UnfinishedEpisodesManager.a(a, response);
            }

            
            {
                a = UnfinishedEpisodesManager.this;
                super(handler, class1);
            }
        };
        g = context;
        a = new esz(context, drp);
        h = (Resolver)ctz.a(resolver);
        a.a(esy);
    }

    static void a(UnfinishedEpisodesManager unfinishedepisodesmanager, UnfinishedEpisodes unfinishedepisodes)
    {
        unfinishedepisodesmanager.a(unfinishedepisodes);
    }

    public final void a()
    {
        e = true;
        if (b != null)
        {
            a(b);
        }
        if (c != null)
        {
            c.unsubscribe();
        }
        c = h.subscribe(f, i);
    }

    public final void a(UnfinishedEpisodes unfinishedepisodes)
    {
        if (!e)
        {
            return;
        }
        if (d != null && !cuv.e(Type.a(d, unfinishedepisodes.getEpisodes())))
        {
            a.a(Type.a(d, g));
            a.a(Type.a(d, unfinishedepisodes.getEpisodes()), Type.a(d));
        } else
        {
            a.b();
        }
        b = unfinishedepisodes;
    }


    private class Type extends Enum
    {

        private static Type a;
        private static Type b;
        private static final Type c[];
        private final String mDataSource;
        private final cua mFilter;
        private final int mTitleRes;

        static Iterable a(Type type, Iterable iterable)
        {
            return cuv.b(iterable, type.mFilter);
        }

        static String a(Type type)
        {
            return type.mDataSource;
        }

        static String a(Type type, Context context)
        {
            return context.getString(type.mTitleRes);
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodesManager$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("AUDIO", 0, 0x7f080317, UnfinishedEpisodes.MediaType.a, "core-collection/v1/latest-resume-points:audio");
            b = new Type("VIDEO", 1, 0x7f080318, UnfinishedEpisodes.MediaType.b, "core-collection/v1/latest-resume-points:video");
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int j, int k, UnfinishedEpisodes.MediaType mediatype, String s1)
        {
            super(s, j);
            mFilter = new cua(mediatype) {

                private UnfinishedEpisodes.MediaType a;

                public final boolean a(Object obj)
                {
                    obj = (UnfinishedEpisodes.Episode)obj;
                    return obj != null && ((UnfinishedEpisodes.Episode) (obj)).getShow().getMediaType() == a;
                }

                
                {
                    a = mediatype;
                    super();
                }
            };
            mDataSource = (String)ctz.a(s1);
            mTitleRes = k;
        }
    }

}

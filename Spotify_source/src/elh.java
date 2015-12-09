// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.CollectionFavorite;
import com.spotify.mobile.android.spotlets.browse.model.CollectionFavorites;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class elh
{

    final WeakReference a;
    public Resolver b;
    public Handler c;

    public elh(elb elb)
    {
        a = new WeakReference(elb);
    }

    // Unreferenced inner class elh$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private elh a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
                errorcause.name()
            });
            throwable = (elb)a.a.get();
            if (throwable != null)
            {
                throwable.a(null, null, -1, true, RequestType.d);
            }
        }

        protected final void onResolved(Response response, Object obj)
        {
            Object obj1 = (CollectionFavorites)obj;
            response = (elb)a.a.get();
            if (response != null)
            {
                obj = new ArrayList();
                if (obj1 != null)
                {
                    obj1 = ((CollectionFavorites) (obj1)).getFavorites().iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        CollectionFavorite collectionfavorite = (CollectionFavorite)((Iterator) (obj1)).next();
                        boolean flag;
                        if (collectionfavorite != null && collectionfavorite.getType() != null && collectionfavorite.getUri() != null && collectionfavorite.getTitle() != null && collectionfavorite.getImage() != null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag && collectionfavorite.getType().toLowerCase(Locale.US).equals("PLAYLIST".toLowerCase(Locale.US)))
                        {
                            ((List) (obj)).add(new Playlist("", collectionfavorite.getTitle(), "", collectionfavorite.getUri(), collectionfavorite.getImage(), -1));
                        }
                    } while (true);
                }
                response.a(((List) (obj)), null, 0, true, RequestType.d);
            }
        }

            public 
            {
                a = elh.this;
                super(handler, class1);
            }
    }

}

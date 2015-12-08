// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.ListView;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.user.TopArtistsListModel;

final class g.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        if (fkr.b(a.a) != null)
        {
            fkr.c(a.a).onRestoreInstanceState(fkr.b(a.a));
            fkr.d(a.a);
        }
    }

    er(er er)
    {
        a = er;
        super();
    }

    // Unreferenced inner class fkr$1

/* anonymous class */
    final class fkr._cls1 extends JsonCallbackReceiver
    {

        final fkr a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            fkr.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (TopArtistsListModel)obj;
            fkr.a(a).a(response.getTopArtists());
            fkr.c(a).post(new fkr._cls1._cls1(this));
            fkr.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
        }

            
            {
                a = fkr1;
                super(handler, class1);
            }
    }

}

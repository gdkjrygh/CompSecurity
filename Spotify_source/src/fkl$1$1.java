// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.ListView;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;

final class g.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        if (fkl.b(a.a) != null)
        {
            fkl.c(a.a).onRestoreInstanceState(fkl.b(a.a));
            fkl.d(a.a);
        }
    }

    er(er er)
    {
        a = er;
        super();
    }

    // Unreferenced inner class fkl$1

/* anonymous class */
    final class fkl._cls1 extends JsonCallbackReceiver
    {

        final fkl a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
        }

        protected final void onResolved(Response response, Object obj)
        {
            obj = (PlaylistListModel)obj;
            if (response.getStatus() == 200)
            {
                response = ((PlaylistListModel) (obj)).getPlaylists();
                if (response != null)
                {
                    fkl.a(a).a(response);
                    fkl.c(a).post(new fkl._cls1._cls1(this));
                    fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
                    return;
                } else
                {
                    fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                    return;
                }
            } else
            {
                fkl.e(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
                return;
            }
        }

            
            {
                a = fkl1;
                super(handler, class1);
            }
    }

}

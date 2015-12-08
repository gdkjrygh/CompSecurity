// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.ui.activity.dialog.artistlove.ArtistFeedbackInterstitialActivity;
import com.spotify.mobile.android.ui.activity.dialog.artistlove.model.FeedbackChannelDialogModel;
import com.spotify.mobile.android.ui.activity.dialog.artistlove.model.FeedbackChannelResult;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class fpn extends fze
{

    private static final Uri a = Uri.parse("hm://feedback-channel/v1/shares");
    private Intent Z;
    private Flags aa;
    private int ab;
    private fpm ac;
    private boolean ad;
    private Resolver ae;
    private boolean b;

    public fpn()
    {
    }

    private void G()
    {
        ad = false;
        ae.get(a.buildUpon().appendQueryParameter("locale", Locale.getDefault().toString()).build().toString(), new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/ui/activity/dialog/artistlove/model/FeedbackChannelResult) {

            private fpn a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "Error getting shared info.", new Object[0]);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (FeedbackChannelResult)obj;
                if (a.k() == null) goto _L2; else goto _L1
_L1:
                obj = fpn.c(a);
                long l = System.currentTimeMillis();
                ((fpm) (obj)).c.b().a(fpm.b, l).b();
                obj = response.getShares();
                if (((List) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
                response = fpn.c(a);
                if (obj != null && !((List) (obj)).isEmpty()) goto _L5; else goto _L4
_L4:
                response = null;
_L7:
                if (response != null)
                {
                    fpn.a(a, response);
                }
                fpn.d(a);
_L2:
                return;
_L5:
                for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
                {
                    obj = (FeedbackChannelDialogModel)iterator.next();
                    if (!response.a(((FeedbackChannelDialogModel) (obj))))
                    {
                        Object obj1 = DebugFlag.i;
                        obj1 = ((fpm) (response)).d;
                        response = response.b(((FeedbackChannelDialogModel) (obj)));
                        continue; /* Loop/switch isn't completed */
                    }
                }

                response = null;
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                a = fpn.this;
                super(handler, class1);
            }
        });
    }

    public static fpn a(Flags flags)
    {
        fpn fpn1 = new fpn();
        fyw.a(fpn1, flags);
        return fpn1;
    }

    static void a(fpn fpn1, FeedbackChannelDialogModel feedbackchanneldialogmodel)
    {
        if (!fpn1.b)
        {
            fpn1.b = true;
            fpn1.Z = ArtistFeedbackInterstitialActivity.a(fpn1.k(), feedbackchanneldialogmodel);
            if (fpn1.Y != null)
            {
                fpn1.Y.a(fpn1);
            }
        }
    }

    static boolean a(fpn fpn1)
    {
        return fpn1.ad;
    }

    static void b(fpn fpn1)
    {
        fpn1.G();
    }

    static fpm c(fpn fpn1)
    {
        return fpn1.ac;
    }

    static void d(fpn fpn1)
    {
        if (fpn1.ae != null)
        {
            fpn1.ae.disconnect();
        }
    }

    public final void B()
    {
        super.B();
        if (ae != null)
        {
            ae.destroy();
        }
    }

    protected final void F()
    {
        ab = Y.b(this);
    }

    public final void a()
    {
        if (b)
        {
            a(Z, ab);
            return;
        } else
        {
            Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
            return;
        }
    }

    public final void a(int i, int j, Intent intent)
    {
        Assertion.b(Integer.valueOf(ab), Integer.valueOf(0));
        if (i == ab)
        {
            b = false;
        }
        super.a(i, j, intent);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            ab = bundle.getInt("request_code");
            b = bundle.getBoolean("artist_dialog_queued");
        }
        aa = fyw.a(this);
        ac = new fpm(k());
        ae = Cosmos.getResolver(k());
        ae.registerConnectionCallback(new com.spotify.cosmos.android.Resolver.ConnectionCallback() {

            private fpn a;

            public final void onServiceConnected(Resolver resolver)
            {
                if (fpn.a(a))
                {
                    fpn.b(a);
                }
            }

            public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
            {
            }

            public final void onServiceDisconnected(Resolver resolver)
            {
            }

            
            {
                a = fpn.this;
                super();
            }
        });
    }

    public final void a(DialogPresenter dialogpresenter)
    {
        super.a(dialogpresenter);
        if (b)
        {
            Y.a(this);
        }
    }

    public final void c()
    {
        boolean flag1;
        flag1 = false;
        super.c();
        break MISSING_BLOCK_LABEL_6;
        if ("1".equals(aa.a(fys.Z)) && fpo.a(k()))
        {
            Object obj = ac;
            boolean flag;
            if (!((fpm) (obj)).c.f(fpm.b))
            {
                flag = true;
            } else
            {
                long l = ((fpm) (obj)).c.a(fpm.b, 0L);
                if (System.currentTimeMillis() - l > fpm.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (!flag)
            {
                obj = DebugFlag.h;
                flag = flag1;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                ad = true;
                if (ae.isConnected())
                {
                    G();
                    return;
                } else
                {
                    ae.connect();
                    return;
                }
            }
        }
        return;
    }

    public final void d()
    {
        super.d();
        ae.disconnect();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("request_code", ab);
        bundle.putBoolean("artist_dialog_queued", b);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonObjectCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

public final class dle
    implements dla
{

    final Resolver a;
    dln b;
    float c;
    boolean d;
    dlo e;

    public dle(Resolver resolver)
    {
        a = resolver;
        c = 0.0F;
    }

    public final boolean a()
    {
        if (!d())
        {
            return false;
        }
        float f = c();
        if (f < 1.0F)
        {
            a(Math.min(1.0F, f + 0.0625F));
        }
        return true;
    }

    public final boolean a(float f)
    {
        if (!d())
        {
            return false;
        }
        CountDownLatch countdownlatch = new CountDownLatch(1);
        Request request = new Request("PUT", "sp://playback/v1/volume");
        boolean flag;
        try
        {
            request.setBody((new JSONObject((new StringBuilder("{ \"system_initiated\": false, \"volume\": ")).append(f).append(" }").toString())).toString().getBytes());
        }
        catch (JSONException jsonexception)
        {
            Logger.b(jsonexception, "Failed to put new volume value via cosmos playback resolver.", new Object[0]);
        }
        a.resolve(request, new com.spotify.cosmos.android.Resolver.CallbackReceiver(countdownlatch) {

            private CountDownLatch a;
            private dle b;

            protected final void onError(Throwable throwable)
            {
                a.countDown();
                b.d = false;
            }

            protected final void onResolved(Response response)
            {
                a.countDown();
                b.d = true;
            }

            
            {
                b = dle.this;
                a = countdownlatch;
                super(null);
            }
        });
        try
        {
            countdownlatch.await();
            flag = d;
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return flag;
    }

    public final boolean b()
    {
        if (d())
        {
            float f = c();
            if (f > 0.0F)
            {
                a(Math.max(0.0F, f - 0.0625F));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final float c()
    {
        if (!d())
        {
            return c;
        }
        CountDownLatch countdownlatch = new CountDownLatch(1);
        a.get("sp://playback/v1/volume", new com.spotify.cosmos.android.Resolver.CallbackReceiver(countdownlatch) {

            private CountDownLatch a;
            private dle b;

            protected final void onError(Throwable throwable)
            {
                a.countDown();
            }

            protected final void onResolved(Response response)
            {
                response = new String(response.getBody());
                b.c = Float.parseFloat(response);
                a.countDown();
            }

            
            {
                b = dle.this;
                a = countdownlatch;
                super(null);
            }
        });
        float f;
        try
        {
            countdownlatch.await();
            f = c;
        }
        catch (InterruptedException interruptedexception)
        {
            return c;
        }
        return f;
    }

    public final boolean d()
    {
        return b != null && b.a();
    }

    // Unreferenced inner class dle$1

/* anonymous class */
    final class _cls1 extends JsonObjectCallbackReceiver
    {

        private dle a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Failed to resolve volume controller because: %s", new Object[] {
                errorcause
            });
            a.e.a(0.0F);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (JSONObject)obj;
            try
            {
                a.e.a((float)response.getDouble("volume"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                Logger.b(response, "Got incorrect volume from core", new Object[0]);
            }
            a.e.a(0.0F);
        }

            
            {
                a = dle.this;
                super(null);
            }
    }

}

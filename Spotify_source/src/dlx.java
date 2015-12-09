// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.connect.model.LoginRequest;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;

public final class dlx
    implements dlf
{

    public final Resolver a;
    final dlg b;

    public dlx(Resolver resolver, Handler handler, dlg dlg)
    {
        ctz.a(resolver);
        ctz.a(handler);
        ctz.a(dlg);
        a = resolver;
        b = dlg;
        resolver = new Request("SUB", "sp://connect-device/v1/login");
        a.subscribe(resolver, new JsonCallbackReceiver(handler, com/spotify/mobile/android/connect/model/LoginRequest) {

            private dlx a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "onError for discovered-device login request.", new Object[0]);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (LoginRequest)obj;
                a.b.a(((LoginRequest) (response)).deviceId, ((LoginRequest) (response)).username, ((LoginRequest) (response)).blob, ((LoginRequest) (response)).clientKey);
            }

            
            {
                a = dlx.this;
                super(handler, class1);
            }
        });
    }

    public static String a(String s)
    {
        return (new StringBuilder("sp://connect-device/v1/device/cast:")).append(s).toString();
    }

    public final Boolean a(DiscoveredDevice discovereddevice)
    {
        String s = discovereddevice.getDeviceId();
        return a("PUT", (new StringBuilder("sp://connect-device/v1/login/cast:")).append(s).toString(), ((JacksonModel) (discovereddevice)));
    }

    public final Boolean a(String s, String s1, JacksonModel jacksonmodel)
    {
        boolean flag;
        try
        {
            s = new Request(s, s1, new HashMap(), JacksonSerializer.toBytes(jacksonmodel));
            flag = a.resolve(s, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }
}

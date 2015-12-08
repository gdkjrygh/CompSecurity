// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import com.google.common.base.Optional;
import com.spotify.mobile.android.arsenal.ArsenalLinkingFragment;
import com.spotify.mobile.android.arsenal.auth.DevicesResponse;
import com.spotify.mobile.android.arsenal.auth.TokenResponse;
import com.spotify.mobile.android.arsenal.data.AccountsLinkException;
import com.spotify.mobile.android.arsenal.data.ArsenalException;
import com.spotify.mobile.android.arsenal.data.CodeRegistrationException;
import com.spotify.mobile.android.arsenal.data.DeviceCodeRequestException;
import com.spotify.mobile.android.arsenal.data.RefreshTokenRequestException;
import com.spotify.mobile.android.util.logging.Logger;

public final class dkj extends AsyncTask
{

    private final String a;
    private final String b;
    private dku c;
    private ArsenalLinkingFragment d;

    private dkj(ArsenalLinkingFragment arsenallinkingfragment, Context context, String s, String s1)
    {
        d = arsenallinkingfragment;
        super();
        a = s;
        b = s1;
        c = new dku(context);
    }

    public dkj(ArsenalLinkingFragment arsenallinkingfragment, Context context, String s, String s1, byte byte0)
    {
        this(arsenallinkingfragment, context, s, s1);
    }

    private transient dkk a()
    {
        Thread.currentThread().setName("ArsenalLinkingThread");
        Object obj;
        Object obj2;
        Looper.prepare();
        obj = c;
        geh.a();
        obj2 = (DevicesResponse)dku.a(com/spotify/mobile/android/arsenal/auth/DevicesResponse, "https://accounts.spotify.com/api/device/code", new dmm[] {
            dkw.a, dkw.c, new dmm("description", "Arsenal device authentication")
        });
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj = (TokenResponse)dku.a(com/spotify/mobile/android/arsenal/auth/TokenResponse, "https://accounts.spotify.com/api/token", new dmm[] {
            new dmm("code", ((dku) (obj)).a(((DevicesResponse) (obj2))).getDeviceCode()), dkw.b, dkw.a
        });
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((TokenResponse) (obj)).getRefreshToken();
        obj2 = b();
        if (!((Optional) (obj2)).b()) goto _L6; else goto _L5
_L5:
        if (!((String)((Optional) (obj2)).c()).equals(b)) goto _L8; else goto _L7
_L7:
        obj = new dkk(b, com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus.c, (byte)0);
        Looper.myLooper().quit();
        return ((dkk) (obj));
_L2:
        throw new DeviceCodeRequestException();
        obj;
        Logger.a(((Throwable) (obj)), "Failed to get device code #Arsenal", new Object[0]);
        Looper.myLooper().quit();
_L9:
        return new dkk(com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus.b, (byte)0);
_L4:
        throw new RefreshTokenRequestException();
        obj;
        Logger.a(((Throwable) (obj)), "Failed to register device code #Arsenal", new Object[0]);
        Looper.myLooper().quit();
          goto _L9
_L8:
        obj = new dkk((String)((Optional) (obj2)).c(), com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus.d, (byte)0);
        Looper.myLooper().quit();
        return ((dkk) (obj));
_L6:
        ArsenalLinkingFragment.a(d).a(((String) (obj)), a);
        obj = new dkk(b, com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus.a, (byte)0);
        Looper.myLooper().quit();
        return ((dkk) (obj));
        Object obj1;
        obj1;
        Logger.a(((Throwable) (obj1)), "Failed to get refresh token #Arsenal", new Object[0]);
        Looper.myLooper().quit();
          goto _L9
        obj1;
        Logger.a(((Throwable) (obj1)), "Failed to link accounts #Arsenal", new Object[0]);
        Looper.myLooper().quit();
          goto _L9
        obj1;
        Logger.a(((Throwable) (obj1)), "Account linking failed due to unknown exception", new Object[0]);
        Looper.myLooper().quit();
          goto _L9
        obj1;
        Looper.myLooper().quit();
        throw obj1;
    }

    private Optional b()
    {
        Optional optional = Optional.e();
        Optional optional1;
        try
        {
            optional1 = ArsenalLinkingFragment.a(d).a(a);
        }
        catch (AccountsLinkException accountslinkexception)
        {
            return optional;
        }
        return optional1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (dkk)obj;
        com.spotify.mobile.android.arsenal.ArsenalLinkingFragment._cls1.a[((dkk) (obj)).b.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 72
    //                   2 93
    //                   3 108
    //                   4 123;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new RuntimeException((new StringBuilder("Unknown LinkingStatus: ")).append(obj).toString());
_L2:
        d.a().a();
_L7:
        ArsenalLinkingFragment.b(d);
        return;
_L3:
        d.a().b();
        continue; /* Loop/switch isn't completed */
_L4:
        d.a().c();
        continue; /* Loop/switch isn't completed */
_L5:
        d.a().a((String)((dkk) (obj)).a.c());
        if (true) goto _L7; else goto _L6
_L6:
    }
}

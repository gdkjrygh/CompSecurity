// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.snapchat.android.util.crypto.DeviceTokenManager;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.List;

public final class Dj extends CQ
    implements oS.a
{
    public final class a
    {

        public boolean a;
        public final Ss.a b;
        public final String c;
        List d;

        public a(boolean flag, Ss.a a1, String s, List list)
        {
            a = flag;
            b = a1;
            c = s;
            d = list;
        }
    }


    public final Ss.a a;
    public a b;
    private final String c;
    private final String d;
    private final DeviceTokenManager e;
    private final Ei f;

    public Dj(Intent intent)
    {
        Bt.a();
        this(intent, DeviceTokenManager.getInstance(), Ei.a());
    }

    private Dj(Intent intent, DeviceTokenManager devicetokenmanager, Ei ei)
    {
        super(intent);
        e = devicetokenmanager;
        a = (Ss.a)intent.getSerializableExtra("action");
        c = intent.getStringExtra("param");
        d = intent.getStringExtra("password");
        f = ei;
        registerCallback(St, this);
    }

    protected final String getPath()
    {
        return "/ph/settings";
    }

    public final pn getRequestPayload()
    {
        Ss ss;
        ss = (new Ss()).a(a.value);
        buildAuthPayload(ss);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Ss.a.values().length];
                try
                {
                    a[Ss.a.PWCONFIRMPHONENUMBER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Ss.a.ENABLETWOFA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Ss.a.TWOFAFORGETONEDEVICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Ss.a.VERIFYEMAIL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Ss.a.DISABLETWOFA.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Ss.a.TWOFAFORGETDEVICE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Ss.a.SENDTWOFACODE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 69
    //                   2 88
    //                   3 167;
           goto _L1 _L2 _L3 _L4
_L1:
        return new oO(ss);
_L2:
        ss.e(c).d(d);
        continue; /* Loop/switch isn't completed */
_L3:
        ss.f(c).d(Bt.q());
        Pair pair = e.getDeviceTokenAndSignaturePair(Bt.q(), ((Qd) (ss)).timestamp, ((Qd) (ss)).reqToken);
        if (pair != null)
        {
            ss.h((String)pair.first).i((String)pair.second);
        } else
        if (ReleaseManager.f())
        {
            throw new RuntimeException("null deviceTokenAndSignaturePair");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        ss.g(c);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (St)obj;
        if (pi1.c() && obj != null)
        {
            b = new a(IJ.a(((St) (obj)).a()), a, ((St) (obj)).b(), ((St) (obj)).c());
        } else
        {
            b = new a(false, a, IC.a(null, 0x7f0801ee, new Object[0]), null);
        }
        obj = b;
        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 7: default 104
    //                   1 135
    //                   2 202
    //                   3 241
    //                   4 143
    //                   5 166
    //                   6 186
    //                   7 226;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        Bt.w(((a) (obj)).a);
        return;
_L5:
        if (((a) (obj)).a && TextUtils.isEmpty(Bt.bw()))
        {
            Bt.w(Bt.S());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (((a) (obj)).a)
        {
            Bt.x(false);
            f.c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (((a) (obj)).a)
        {
            f.c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (((a) (obj)).a)
        {
            Bt.x(true);
            f.a(((a) (obj)).d);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((a) (obj)).a)
        {
            Bt.x(((a) (obj)).c);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((a) (obj)).a)
        {
            obj = f;
            pi1 = c;
            Intent intent = ((Ei) (obj)).c(((Ei) (obj)).c);
            intent.putExtra("op_code", 1032);
            intent.putExtra("action", com.snapchat.android.operation.identity.UpdateVerifiedDeviceOperation.Action.DELETE);
            intent.putExtra("device_id", pi1);
            ((Ei) (obj)).a(((Ei) (obj)).c, intent);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}

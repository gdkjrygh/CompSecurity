// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.sts.a.e;
import com.microsoft.onlineid.sts.request.StsRequestFactory;
import com.microsoft.onlineid.sts.request.d;

// Referenced classes of package com.microsoft.onlineid.sts:
//            i, q, r, g

public final class j
{

    private final Context a;
    private final f b;
    private StsRequestFactory c;
    private g d;

    public j(Context context)
    {
        a = context;
        b = new f(context);
        c = null;
        d = null;
    }

    private StsRequestFactory a()
    {
        if (c == null)
        {
            c = new StsRequestFactory(a);
        }
        return c;
    }

    public final i a(boolean flag)
        throws c, com.microsoft.onlineid.sts.a.c, e
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[r.values().length];
                try
                {
                    a[r.B.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[r.D.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[r.C.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        int k;
        obj = b.a();
        if (obj != null && ((i) (obj)).c() != null && !flag)
        {
            return ((i) (obj));
        }
        if (obj != null)
        {
            com.microsoft.onlineid.sts.b.c c1 = (com.microsoft.onlineid.sts.b.c)a().createDeviceAuthRequest(((i) (obj))).e();
            if (c1.b())
            {
                ((i) (obj)).a(c1.c());
                b.a(((i) (obj)));
                return ((i) (obj));
            }
            obj = c1.a();
            switch (_cls1.a[((q) (obj)).a().ordinal()])
            {
            default:
                throw new e("Failed to authenticate device", ((q) (obj)));

            case 1: // '\001'
            case 2: // '\002'
                break;
            }
        }
        b.b();
        k = 1;
        obj = null;
_L3:
        Object obj1;
        if (k > 3)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        if (d == null)
        {
            d = new g();
        }
        obj1 = d.a();
        com.microsoft.onlineid.sts.b.d d1;
        boolean flag1;
        if (obj == null)
        {
            obj = a().createDeviceProvisionRequest(((h) (obj1)));
        } else
        {
            ((com.microsoft.onlineid.sts.request.e) (obj)).a(((h) (obj1)));
        }
        d1 = (com.microsoft.onlineid.sts.b.d)((com.microsoft.onlineid.sts.request.e) (obj)).e();
        if (d1.b())
        {
            flag1 = true;
        } else
        {
            q q1 = d1.a();
            switch (_cls1.a[q1.a().ordinal()])
            {
            default:
                throw new e("Unable to provision device", q1);

            case 2: // '\002'
            case 3: // '\003'
                break;
            }
            if (k == 3)
            {
                com.microsoft.onlineid.internal.c.d.c("provisionNewDevice() exceeded allowable number of retry attempts.");
                throw new com.microsoft.onlineid.sts.a.d("provisionNewDevice() exceeded allowable number of retry attempts.");
            }
            com.microsoft.onlineid.internal.c.d.b("Device provision request failed due to invalid credentials. Trying again.");
            flag1 = false;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        obj = new i(((h) (obj1)), d1.c(), null);
        b.a(((i) (obj)));
_L4:
        obj1 = (com.microsoft.onlineid.sts.b.c)a().createDeviceAuthRequest(((i) (obj))).e();
        if (((com.microsoft.onlineid.sts.b.c) (obj1)).b())
        {
            ((i) (obj)).a(((com.microsoft.onlineid.sts.b.c) (obj1)).c());
            b.a(((i) (obj)));
            return ((i) (obj));
        } else
        {
            throw new e("Failed to authenticate device", ((com.microsoft.onlineid.sts.b.c) (obj1)).a());
        }
_L2:
        k++;
          goto _L3
        obj = null;
          goto _L4
    }
}

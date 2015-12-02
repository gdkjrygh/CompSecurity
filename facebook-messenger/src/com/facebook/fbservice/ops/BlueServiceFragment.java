// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.i;
import android.support.v4.app.q;
import com.facebook.fbservice.service.OperationType;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.fbservice.ops:
//            c, a, b, h, 
//            i, ab, j

public class BlueServiceFragment extends Fragment
{

    private c a;
    private h b;
    private com.facebook.fbservice.ops.i c;
    private ab d;
    private boolean e;
    private OperationType f;
    private Bundle g;

    public BlueServiceFragment()
    {
    }

    public static BlueServiceFragment a(Fragment fragment, String s)
    {
        return a(fragment.q(), s);
    }

    public static BlueServiceFragment a(i j, String s)
    {
        return a(j.f(), s);
    }

    public static BlueServiceFragment a(q q1, String s)
    {
        BlueServiceFragment blueservicefragment1 = (BlueServiceFragment)q1.a(s);
        BlueServiceFragment blueservicefragment = blueservicefragment1;
        if (blueservicefragment1 == null)
        {
            blueservicefragment = new BlueServiceFragment();
            q1 = q1.a();
            q1.a(blueservicefragment, s);
            q1.a();
        }
        return blueservicefragment;
    }

    static h a(BlueServiceFragment blueservicefragment)
    {
        return blueservicefragment.b;
    }

    static com.facebook.fbservice.ops.i b(BlueServiceFragment blueservicefragment)
    {
        return blueservicefragment.c;
    }

    public void C()
    {
        super.C();
        a.a();
        b = null;
        c = null;
    }

    public void a(Context context)
    {
        super.a(context);
        a = (c)c().a(com/facebook/fbservice/ops/c);
    }

    public void a(ab ab)
    {
        if (e)
        {
            a.a(ab);
            return;
        } else
        {
            d = ab;
            return;
        }
    }

    public void a(h h)
    {
        b = h;
    }

    public void a(OperationType operationtype, Bundle bundle)
    {
        if (e)
        {
            a.a(operationtype, bundle);
            return;
        } else
        {
            f = operationtype;
            g = bundle;
            return;
        }
    }

    public boolean a()
    {
        return e && a.b();
    }

    public j b()
    {
        return a.c();
    }

    public t c()
    {
        return t.a(n());
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        a.a(true);
        a.a(new a(this));
        a.a(new b(this));
        if (bundle != null && f == null)
        {
            a.b(bundle);
        }
        a.a(d);
        d = null;
        e = true;
        if (f != null)
        {
            a.a(f, g);
            f = null;
            g = null;
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        a.a(bundle);
    }
}

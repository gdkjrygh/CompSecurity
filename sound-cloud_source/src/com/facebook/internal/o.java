// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.p;
import com.facebook.s;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            Y, n, N, a, 
//            S, U

public final class o
{
    public static interface a
    {

        public abstract Bundle a();

        public abstract Bundle b();
    }


    public static void a(com.facebook.internal.a a1, Bundle bundle, n n1)
    {
        Y.b(s.f());
        Y.a(s.f());
        String s1 = n1.name();
        Object obj = c(n1);
        if (obj == null)
        {
            throw new p((new StringBuilder("Unable to fetch the Url for the DialogFeature : '")).append(s1).append("'").toString());
        }
        int i = N.a();
        bundle = S.a(a1.a.toString(), i, bundle);
        if (bundle == null)
        {
            throw new p("Unable to fetch the app's key-hash");
        }
        if (((Uri) (obj)).isRelative())
        {
            bundle = U.a(S.a(), ((Uri) (obj)).toString(), bundle);
        } else
        {
            bundle = U.a(((Uri) (obj)).getAuthority(), ((Uri) (obj)).getPath(), bundle);
        }
        obj = new Bundle();
        ((Bundle) (obj)).putString("url", bundle.toString());
        ((Bundle) (obj)).putBoolean("is_fallback", true);
        bundle = new Intent();
        N.a(bundle, a1.a.toString(), n1.a(), N.a(), ((Bundle) (obj)));
        bundle.setClass(s.f(), com/facebook/FacebookActivity);
        bundle.setAction("FacebookDialogFragment");
        a1.b = bundle;
    }

    public static void a(com.facebook.internal.a a1, a a2, n n1)
    {
        android.content.Context context = s.f();
        String s1 = n1.a();
        int i = d(n1);
        if (i == -1)
        {
            throw new p("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        if (N.a(i))
        {
            a2 = a2.a();
        } else
        {
            a2 = a2.b();
        }
        n1 = a2;
        if (a2 == null)
        {
            n1 = new Bundle();
        }
        a2 = N.a(context, a1.a.toString(), s1, i, n1);
        if (a2 == null)
        {
            throw new p("Unable to create Intent; this likely means theFacebook app is not installed.");
        } else
        {
            a1.b = a2;
            return;
        }
    }

    public static void a(com.facebook.internal.a a1, p p1)
    {
        Y.b(s.f());
        Intent intent = new Intent();
        intent.setClass(s.f(), com/facebook/FacebookActivity);
        intent.setAction(FacebookActivity.a);
        N.a(intent, a1.a.toString(), null, N.a(), N.a(p1));
        a1.b = intent;
    }

    public static void a(com.facebook.internal.a a1, String s1, Bundle bundle)
    {
        Y.b(s.f());
        Y.a(s.f());
        Bundle bundle1 = new Bundle();
        bundle1.putString("action", s1);
        bundle1.putBundle("params", bundle);
        bundle = new Intent();
        N.a(bundle, a1.a.toString(), s1, N.a(), bundle1);
        bundle.setClass(s.f(), com/facebook/FacebookActivity);
        bundle.setAction("FacebookDialogFragment");
        a1.b = bundle;
    }

    public static boolean a(n n1)
    {
        return d(n1) != -1;
    }

    public static boolean b(n n1)
    {
        return c(n1) != null;
    }

    private static Uri c(n n1)
    {
        Object obj = n1.name();
        n1 = n1.a();
        obj = U.a(s.h(), n1, ((String) (obj)));
        n1 = null;
        if (obj != null)
        {
            n1 = ((U.a) (obj)).c;
        }
        return n1;
    }

    private static int d(n n1)
    {
        Object obj = s.h();
        String s1 = n1.a();
        obj = U.a(((String) (obj)), s1, n1.name());
        if (obj != null)
        {
            n1 = ((U.a) (obj)).d;
        } else
        {
            int ai[] = new int[1];
            ai[0] = n1.b();
            n1 = ai;
        }
        return N.a(s1, n1);
    }
}

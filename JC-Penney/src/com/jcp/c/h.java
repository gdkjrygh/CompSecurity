// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.activities.InAppPromoActivity;
import com.jcp.api.a.a;
import com.jcp.api.endpoint.InAppPromoEp;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import retrofit.RestAdapter;

// Referenced classes of package com.jcp.c:
//            b, i, j

public final class h extends b
{

    private static final String a = com/jcp/c/h.getName();
    private static final String b = (new StringBuilder()).append(a).append(".key_stored_promos").toString();
    private static List c;

    public h(Context context)
    {
        a(context);
    }

    private void a(int k)
    {
        ((InAppPromoEp)JCP.m().create(com/jcp/api/endpoint/InAppPromoEp)).checkInAppPromo(new i(this, k));
    }

    static void a(h h1)
    {
        h1.f();
    }

    static void a(h h1, int k)
    {
        h1.a(k);
    }

    private boolean a(a a1)
    {
        boolean flag1 = false;
        Date date = new Date();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1;
        int k;
        boolean flag;
        try
        {
            date1 = simpledateformat.parse(a1.a());
            a1 = simpledateformat.parse(a1.b());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            ae.a(a, "Exception while parsing in app promo dates");
            return false;
        }
        flag = flag1;
        if (date.compareTo(date1) < 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        k = date.compareTo(a1);
        flag = flag1;
        if (k <= 0)
        {
            flag = true;
        }
        return flag;
    }

    static boolean a(h h1, a a1)
    {
        return h1.a(a1);
    }

    private void b(a a1)
    {
        a1 = a1.c();
        if (!TextUtils.isEmpty(a1))
        {
            Intent intent = new Intent(b(), com/jcp/activities/InAppPromoActivity);
            intent.putExtra("key_url", a1);
            b().startActivity(intent);
            return;
        } else
        {
            ae.d(a, "displayPromo() called for null or empty URL");
            return;
        }
    }

    static void b(h h1)
    {
        h1.g();
    }

    static void b(h h1, a a1)
    {
        h1.b(a1);
    }

    static List d()
    {
        return c;
    }

    static String e()
    {
        return a;
    }

    private void f()
    {
        String s = b().getSharedPreferences("com.jcp.activities", 0).getString(b, null);
        java.lang.reflect.Type type = (new com.jcp.c.j(this)).b();
        if (TextUtils.isEmpty(s))
        {
            c = new ArrayList();
        } else
        {
            c = (List)aa.a(s, type);
        }
        if (c == null)
        {
            c = new ArrayList();
        }
    }

    private void g()
    {
        Object obj = new j();
        if (c != null && c.size() > 0)
        {
            obj = ((j) (obj)).a(c);
        } else
        {
            obj = null;
        }
        b().getSharedPreferences("com.jcp.activities", 0).edit().putString(b, ((String) (obj))).commit();
    }

    public void a()
    {
        if (!JCP.o())
        {
            a(5);
            return;
        } else
        {
            ae.c(a, "No need to check promo");
            return;
        }
    }

}

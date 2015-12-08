// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Intent;
import android.text.TextUtils;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage, ao

final class an extends aa
{

    final Intent a;
    final MainPage b;

    an(MainPage mainpage, Intent intent)
    {
        b = mainpage;
        a = intent;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (!b.isFinishing())
        {
            super.b(i, exception);
            com.roidapp.baselib.c.an.a(b, "Login failed");
            b.j();
            if (MainPage.t(b))
            {
                MainPage.b(b, false);
                MainPage.u(b);
                return;
            }
        }
    }

    public final volatile void b(Object obj)
    {
    }

    public final void c(Object obj)
    {
label0:
        {
label1:
            {
                boolean flag;
label2:
                {
                    obj = (p)obj;
                    if (!b.isFinishing())
                    {
                        if (a == null)
                        {
                            break label0;
                        }
                        android.os.Bundle bundle = a.getBundleExtra("signData");
                        String s = a.getStringExtra("page_name");
                        if (TextUtils.isEmpty(s) || obj == null || ((p) (obj)).b == null)
                        {
                            break label1;
                        }
                        flag = ((p) (obj)).b.r;
                        a a1 = com.roidapp.cloudlib.sns.f.a.a();
                        byte byte0;
                        if (flag)
                        {
                            byte0 = 3;
                        } else
                        {
                            byte0 = 4;
                        }
                        a1.a(s, byte0);
                        if (bundle == null)
                        {
                            break label2;
                        }
                        q.a(((p) (obj)).a, ((p) (obj)).b.a, bundle, new ao(this, bundle, flag)).a(this);
                    }
                    return;
                }
                com.roidapp.photogrid.MainPage.a(b, flag);
                return;
            }
            com.roidapp.photogrid.MainPage.a(b, false);
            return;
        }
        com.roidapp.photogrid.MainPage.a(b, false);
    }
}

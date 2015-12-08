// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.text.TextUtils;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.photogrid.social.c;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity

final class h extends aa
{

    final Intent a;
    final BaseShareActivity b;

    h(BaseShareActivity baseshareactivity, Intent intent)
    {
        b = baseshareactivity;
        a = intent;
        super();
    }

    public final void b(int i, Exception exception)
    {
        b.m();
        an.a(b, "Login Failed");
        super.b(i, exception);
    }

    public final void c(Object obj)
    {
        Object obj1 = (p)obj;
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            obj = a.getStringExtra("page_name");
            flag = flag1;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                flag = flag1;
                if (obj1 != null)
                {
                    flag = flag1;
                    if (((p) (obj1)).b != null)
                    {
                        flag = ((p) (obj1)).b.r;
                        obj1 = com.roidapp.cloudlib.sns.f.a.a();
                        byte byte0;
                        if (flag)
                        {
                            byte0 = 3;
                        } else
                        {
                            byte0 = 4;
                        }
                        ((a) (obj1)).a(((String) (obj)), byte0);
                    }
                }
            }
        }
        b.m();
        an.a(b, "Login Successfully");
        com.roidapp.photogrid.social.c.a(flag, b);
    }
}

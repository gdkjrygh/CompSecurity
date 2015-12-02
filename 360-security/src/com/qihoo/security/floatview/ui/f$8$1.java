// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.os.Handler;
import android.text.TextUtils;
import com.qihoo.security.locale.d;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            f

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        if (!TextUtils.isEmpty(f.e(a.a)))
        {
            if (!f.f(a.a))
            {
                f.a(a.a, f.e(a.a).replace("\n", ""));
                f.b(a.a, f.e(a.a));
            }
            f.a(a.a, null);
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/floatview/ui/f$8

/* anonymous class */
    class f._cls8
        implements com.qihoo.security.opti.a.b.a
    {

        final f a;

        public void a()
        {
            f.a(a, d.a().a(0x7f0c007e));
        }

        public void a(int i, int j)
        {
            j = (int)(((long)j * 100L) / Utils.getMemoryTotalKb());
            if (i <= 0)
            {
                i = 1;
            }
            if (j <= 0)
            {
                j = 1;
            }
            f.a(a, d.a().a(0x7f0c007d, new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            }));
            f.g(a).post(new f._cls8._cls1(this));
        }

            
            {
                a = f1;
                super();
            }
    }

}

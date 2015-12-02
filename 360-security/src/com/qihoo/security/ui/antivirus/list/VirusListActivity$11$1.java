// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.text.TextUtils;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity, c

class a
    implements Runnable
{

    final i a;
    final a b;

    public void run()
    {
        VirusListActivity.a(b.b, a);
    }

    A(A a1, i i)
    {
        b = a1;
        a = i;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/list/VirusListActivity$11

/* anonymous class */
    class VirusListActivity._cls11
        implements PackageReceiver.a
    {

        final VirusListActivity a;

        public void a(String s)
        {
        }

        public void b(String s)
        {
label0:
            {
                if (VirusListActivity.h(a) == null || TextUtils.isEmpty(s))
                {
                    break label0;
                }
                Iterator iterator = VirusListActivity.h(a).a().iterator();
                i j;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    j = (i)iterator.next();
                } while (!s.equals(((MaliciousInfo)j.c()).packageName));
                if (!VirusListActivity.r(a) && !VirusListActivity.u(a) && !VirusListActivity.v(a))
                {
                    VirusListActivity.w(a).postDelayed(new VirusListActivity._cls11._cls1(this, j), 400L);
                }
            }
        }

        public void c(String s)
        {
        }

            
            {
                a = viruslistactivity;
                super();
            }
    }

}

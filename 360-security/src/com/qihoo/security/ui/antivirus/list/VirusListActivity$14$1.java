// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;


// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity, d

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        VirusListActivity.e(a.a);
        VirusListActivity.f(a.a);
    }

    A(A a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/list/VirusListActivity$14

/* anonymous class */
    class VirusListActivity._cls14
        implements Runnable
    {

        final VirusListActivity a;

        public void run()
        {
            VirusListActivity.a(a, true);
            VirusListActivity.d(a).b();
            a.runOnUiThread(new VirusListActivity._cls14._cls1(this));
            VirusListActivity.a(a, false);
        }

            
            {
                a = viruslistactivity;
                super();
            }
    }

}

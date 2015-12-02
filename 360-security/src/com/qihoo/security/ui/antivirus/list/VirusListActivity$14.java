// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;


// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity, d

class a
    implements Runnable
{

    final VirusListActivity a;

    public void run()
    {
        VirusListActivity.a(a, true);
        VirusListActivity.d(a).b();
        a.runOnUiThread(new Runnable() {

            final VirusListActivity._cls14 a;

            public void run()
            {
                VirusListActivity.e(a.a);
                VirusListActivity.f(a.a);
            }

            
            {
                a = VirusListActivity._cls14.this;
                super();
            }
        });
        VirusListActivity.a(a, false);
    }

    _cls1.a(VirusListActivity viruslistactivity)
    {
        a = viruslistactivity;
        super();
    }
}

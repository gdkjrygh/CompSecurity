// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.view.View;
import com.nineoldandroids.a.b;
import com.qihoo.security.booster.widget.DialView.a;
import com.qihoo.security.widget.RevealPanel;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment, a

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        BoosterFragment.m(a.a).e();
    }

    it>(it> it>)
    {
        a = it>;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13

/* anonymous class */
    class BoosterFragment._cls13 extends a
    {

        final BoosterFragment a;

        public void a()
        {
label0:
            {
                if (!com.qihoo.security.ui.main.BoosterFragment.a(a, new BoosterFragment._cls13._cls1()))
                {
                    BoosterFragment.m(a).setCallback(new BoosterFragment._cls13._cls2());
                    if (BoosterFragment.l(a).a())
                    {
                        break label0;
                    }
                    BoosterFragment.l(a).e();
                    BoosterFragment.p(a).postDelayed(new BoosterFragment._cls13._cls3(this), 100L);
                }
                return;
            }
            if (!BoosterFragment.m(a).a())
            {
                BoosterFragment.m(a).e();
                return;
            } else
            {
                com.qihoo.security.locale.widget.LocaleTextView localetextview = BoosterFragment.n(a);
                com.qihoo.security.locale.widget.LocaleTextView localetextview1 = BoosterFragment.o(a);
                com.qihoo.security.ui.main.a.a(new View[] {
                    localetextview
                }, new View[] {
                    localetextview1
                });
                return;
            }
        }

            
            {
                a = boosterfragment;
                super();
            }

        // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13$1

/* anonymous class */
        class BoosterFragment._cls13._cls1 extends b
        {

            final BoosterFragment._cls13 a;

            public void b(com.nineoldandroids.a.a a1)
            {
                BoosterFragment.m(a.a).setCallback(new BoosterFragment._cls13._cls1._cls1(this));
                if (!BoosterFragment.l(a.a).a())
                {
                    BoosterFragment.l(a.a).e();
                    BoosterFragment.p(a.a).postDelayed(new BoosterFragment._cls13._cls1._cls2(this), 100L);
                } else
                if (!BoosterFragment.m(a.a).a())
                {
                    BoosterFragment.m(a.a).e();
                } else
                {
                    a1 = BoosterFragment.n(a.a);
                    com.qihoo.security.locale.widget.LocaleTextView localetextview = BoosterFragment.o(a.a);
                    com.qihoo.security.ui.main.a.a(new View[] {
                        a1
                    }, new View[] {
                        localetextview
                    });
                }
                com.qihoo.security.ui.main.BoosterFragment.b(a.a, 200L);
            }

                    
                    {
                        a = BoosterFragment._cls13.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13$1$1

/* anonymous class */
        class BoosterFragment._cls13._cls1._cls1 extends com.qihoo.security.widget.RevealRippleLayout.b
        {

            final BoosterFragment._cls13._cls1 a;

            public void b()
            {
                com.qihoo.security.locale.widget.LocaleTextView localetextview = BoosterFragment.n(a.a.a);
                com.qihoo.security.locale.widget.LocaleTextView localetextview1 = BoosterFragment.o(a.a.a);
                com.qihoo.security.ui.main.a.a(new View[] {
                    localetextview
                }, new View[] {
                    localetextview1
                });
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13$1$2

/* anonymous class */
        class BoosterFragment._cls13._cls1._cls2
            implements Runnable
        {

            final BoosterFragment._cls13._cls1 a;

            public void run()
            {
                BoosterFragment.m(a.a.a).e();
            }

                    
                    {
                        a = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13$2

/* anonymous class */
        class BoosterFragment._cls13._cls2 extends com.qihoo.security.widget.RevealRippleLayout.b
        {

            final BoosterFragment._cls13 a;

            public void b()
            {
                com.qihoo.security.locale.widget.LocaleTextView localetextview = BoosterFragment.n(a.a);
                com.qihoo.security.locale.widget.LocaleTextView localetextview1 = BoosterFragment.o(a.a);
                com.qihoo.security.ui.main.a.a(new View[] {
                    localetextview
                }, new View[] {
                    localetextview1
                });
            }

                    
                    {
                        a = BoosterFragment._cls13.this;
                        super();
                    }
        }

    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import com.qihoo.security.widget.RevealPanel;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment, a

class a extends b
{

    final a a;

    public void b(a a1)
    {
        BoosterFragment.m(a.a).setCallback(new com.qihoo.security.widget.RevealRippleLayout.b() {

            final BoosterFragment._cls13._cls1 a;

            public void b()
            {
                com.qihoo.security.locale.widget.LocaleTextView localetextview1 = BoosterFragment.n(a.a.a);
                com.qihoo.security.locale.widget.LocaleTextView localetextview2 = BoosterFragment.o(a.a.a);
                com.qihoo.security.ui.main.a.a(new View[] {
                    localetextview1
                }, new View[] {
                    localetextview2
                });
            }

            
            {
                a = BoosterFragment._cls13._cls1.this;
                super();
            }
        });
        if (!BoosterFragment.l(a.a).a())
        {
            BoosterFragment.l(a.a).e();
            BoosterFragment.p(a.a).postDelayed(new Runnable() {

                final BoosterFragment._cls13._cls1 a;

                public void run()
                {
                    BoosterFragment.m(a.a.a).e();
                }

            
            {
                a = BoosterFragment._cls13._cls1.this;
                super();
            }
            }, 100L);
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

    it>(it> it>)
    {
        a = it>;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13

/* anonymous class */
    class BoosterFragment._cls13 extends com.qihoo.security.booster.widget.DialView.a
    {

        final BoosterFragment a;

        public void a()
        {
label0:
            {
                if (!com.qihoo.security.ui.main.BoosterFragment.a(a, new BoosterFragment._cls13._cls1(this)))
                {
                    BoosterFragment.m(a).setCallback(new BoosterFragment._cls13._cls2());
                    if (BoosterFragment.l(a).a())
                    {
                        break label0;
                    }
                    BoosterFragment.l(a).e();
                    BoosterFragment.p(a).postDelayed(new BoosterFragment._cls13._cls3(), 100L);
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


        // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$13$3

/* anonymous class */
        class BoosterFragment._cls13._cls3
            implements Runnable
        {

            final BoosterFragment._cls13 a;

            public void run()
            {
                BoosterFragment.m(a.a).e();
            }

                    
                    {
                        a = BoosterFragment._cls13.this;
                        super();
                    }
        }

    }

}

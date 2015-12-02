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

class init> extends a
{

    final BoosterFragment a;

    public void a()
    {
label0:
        {
            if (!com.qihoo.security.ui.main.BoosterFragment.a(a, new b() {

        final BoosterFragment._cls13 a;

        public void b(com.nineoldandroids.a.a a1)
        {
            BoosterFragment.m(a.a).setCallback(new com.qihoo.security.widget.RevealRippleLayout.b(this) {

                final _cls1 a;

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
            });
            if (!BoosterFragment.l(a.a).a())
            {
                BoosterFragment.l(a.a).e();
                BoosterFragment.p(a.a).postDelayed(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        BoosterFragment.m(a.a.a).e();
                    }

            
            {
                a = _pcls1;
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
                com.qihoo.security.locale.widget.LocaleTextView localetextview2 = BoosterFragment.o(a.a);
                com.qihoo.security.ui.main.a.a(new View[] {
                    a1
                }, new View[] {
                    localetextview2
                });
            }
            com.qihoo.security.ui.main.BoosterFragment.b(a.a, 200L);
        }

            
            {
                a = BoosterFragment._cls13.this;
                super();
            }
    }))
            {
                BoosterFragment.m(a).setCallback(new com.qihoo.security.widget.RevealRippleLayout.b() {

                    final BoosterFragment._cls13 a;

                    public void b()
                    {
                        com.qihoo.security.locale.widget.LocaleTextView localetextview2 = BoosterFragment.n(a.a);
                        com.qihoo.security.locale.widget.LocaleTextView localetextview3 = BoosterFragment.o(a.a);
                        com.qihoo.security.ui.main.a.a(new View[] {
                            localetextview2
                        }, new View[] {
                            localetextview3
                        });
                    }

            
            {
                a = BoosterFragment._cls13.this;
                super();
            }
                });
                if (BoosterFragment.l(a).a())
                {
                    break label0;
                }
                BoosterFragment.l(a).e();
                BoosterFragment.p(a).postDelayed(new Runnable() {

                    final BoosterFragment._cls13 a;

                    public void run()
                    {
                        BoosterFragment.m(a.a).e();
                    }

            
            {
                a = BoosterFragment._cls13.this;
                super();
            }
                }, 100L);
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

    _cls3.a(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}

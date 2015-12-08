// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.a;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.iab.util.g;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            IabBackgroundActivity

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        com.cardinalblue.android.piccollage.controller.a.a().a(a.a);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/IabBackgroundActivity$3

/* anonymous class */
    class IabBackgroundActivity._cls3
        implements com.cardinalblue.android.piccollage.iab.util.d.c
    {

        final String a;
        final StickerBundle b;
        final IabBackgroundActivity c;

        public void a(e e1, g g1)
        {
            boolean flag;
            while (IabBackgroundActivity.c(c) == null || e1 == null) 
            {
                return;
            }
            if (e1.a() == 7)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (e1.d() && !flag)
            {
                switch (e1.a())
                {
                default:
                    return;

                case 6: // '\006'
                    e1 = new ArrayList();
                    break;
                }
                e1.add(a);
                IabBackgroundActivity.c(c).a(true, e1, new IabBackgroundActivity._cls3._cls1(g1));
                return;
            }
            if (!flag) goto _L2; else goto _L1
_L1:
            k.a(c, 0x7f0701ef, 0);
_L4:
            (new Handler()).post(new IabBackgroundActivity._cls3._cls2(this));
            return;
_L2:
            if (g1 != null)
            {
                com.cardinalblue.android.piccollage.a.b.f(g1.d(), "background store");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                c = iabbackgroundactivity;
                a = s;
                b = stickerbundle;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/IabBackgroundActivity$3$1

/* anonymous class */
        class IabBackgroundActivity._cls3._cls1
            implements com.cardinalblue.android.piccollage.iab.util.d.e
        {

            final g a;
            final IabBackgroundActivity._cls3 b;

            public void a(e e1, f f1)
            {
                if (!e1.d())
                {
                    e1 = f1.a(b.a);
                    if (a != null)
                    {
                        IabBackgroundActivity.c(b.c).a(e1, null);
                        return;
                    }
                }
            }

                    
                    {
                        b = IabBackgroundActivity._cls3.this;
                        a = g1;
                        super();
                    }
        }

    }

}

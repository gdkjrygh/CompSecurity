// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.a.f;
import com.tinder.e.ax;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.z;
import com.tinder.views.CustomEditText;

// Referenced classes of package com.tinder.fragments:
//            FragmentUsername

final class a
    implements ax
{

    final String a;
    final a b;

    public final void a(int i)
    {
        com.tinder.fragments.FragmentUsername.a(b.b, i, a);
    }

    a(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentUsername$2

/* anonymous class */
    final class FragmentUsername._cls2
        implements android.view.View.OnClickListener
    {

        final FragmentUsername a;

        public final void onClick(View view)
        {
            view = FragmentUsername.b(a).getText().toString();
            if (FragmentUsername.c(a).isEmpty())
            {
                com.tinder.managers.a.a("DeepLink.CreateID");
                z z1 = a.a;
                ax ax1 = new FragmentUsername._cls2._cls1(view);
                view = new com.tinder.a.a(1, z1.a.T, com.tinder.a.a.k(), z.b(view), ax1);
                ManagerApp.b().a(view);
            } else
            {
                com.tinder.managers.a.a("DeepLink.ChangeID");
                z z2 = a.a;
                FragmentUsername._cls2._cls2 _lcls2 = new FragmentUsername._cls2._cls2(this, view);
                view = new com.tinder.a.a(2, z2.a.V, com.tinder.a.a.k(), z.b(view), _lcls2);
                ManagerApp.b().a(view);
            }
            com.tinder.fragments.FragmentUsername.a(a);
        }

            
            {
                a = fragmentusername;
                super();
            }

        // Unreferenced inner class com/tinder/fragments/FragmentUsername$2$1

/* anonymous class */
        final class FragmentUsername._cls2._cls1
            implements ax
        {

            final String a;
            final FragmentUsername._cls2 b;

            public final void a(int i)
            {
                com.tinder.fragments.FragmentUsername.a(b.a, i, a);
            }

                    
                    {
                        b = FragmentUsername._cls2.this;
                        a = s;
                        super();
                    }
        }

    }

}

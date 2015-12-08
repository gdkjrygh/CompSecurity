// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.a.f;
import com.tinder.c.ao;
import com.tinder.e.ax;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;

// Referenced classes of package com.tinder.fragments:
//            FragmentUsername

final class a
    implements com.tinder.c.ame._cls3._cls1
{

    final View a;
    final tring b;

    public final void a()
    {
        com.tinder.managers.a.a(new SparksEvent("DeepLink.DeleteID"));
        Object obj = b.b.a;
        ax ax = new ax() {

            final FragmentUsername._cls3._cls1 a;

            public final void a(int i)
            {
                switch (i)
                {
                default:
                    return;

                case 204: 
                    com.tinder.fragments.FragmentUsername.a(a.b.b, a.b.b.getString(0x7f060212));
                    if (a.b.a != null)
                    {
                        a.b.a.setUsername(null);
                    }
                    a.b.b.b.onClick(a.a);
                    return;

                case 410: 
                    com.tinder.fragments.FragmentUsername.a(a.b.b, a.b.b.getString(0x7f06013b));
                    return;
                }
            }

            
            {
                a = FragmentUsername._cls3._cls1.this;
                super();
            }
        };
        obj = new com.tinder.a.a(3, ((z) (obj)).a.U, com.tinder.a.a.k(), null, ax);
        ManagerApp.b().a(((com.android.volley.Request) (obj)));
    }

    _cls1.a(_cls1.a a1, View view)
    {
        b = a1;
        a = view;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentUsername$3

/* anonymous class */
    final class FragmentUsername._cls3
        implements android.view.View.OnClickListener
    {

        final User a;
        final FragmentUsername b;

        public final void onClick(View view)
        {
            (new ao(b.getContext(), new FragmentUsername._cls3._cls1(this, view))).show();
        }

            
            {
                b = fragmentusername;
                a = user;
                super();
            }
    }

}

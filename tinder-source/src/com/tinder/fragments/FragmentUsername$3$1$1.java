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
    implements ax
{

    final ing a;

    public final void a(int i)
    {
        switch (i)
        {
        default:
            return;

        case 204: 
            com.tinder.fragments.FragmentUsername.a(a.a.a, a.a.a.getString(0x7f060212));
            if (a.a.a != null)
            {
                a.a.a.setUsername(null);
            }
            a.a.a.b.Click(a.a);
            return;

        case 410: 
            com.tinder.fragments.FragmentUsername.a(a.a.a, a.a.a.getString(0x7f06013b));
            return;
        }
    }

    ( )
    {
        a = ;
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


    // Unreferenced inner class com/tinder/fragments/FragmentUsername$3$1

/* anonymous class */
    final class FragmentUsername._cls3._cls1
        implements com.tinder.c.ao.a
    {

        final View a;
        final FragmentUsername._cls3 b;

        public final void a()
        {
            com.tinder.managers.a.a(new SparksEvent("DeepLink.DeleteID"));
            Object obj = b.b.a;
            FragmentUsername._cls3._cls1._cls1 _lcls1 = new FragmentUsername._cls3._cls1._cls1(this);
            obj = new com.tinder.a.a(3, ((z) (obj)).a.U, com.tinder.a.a.k(), null, _lcls1);
            ManagerApp.b().a(((com.android.volley.Request) (obj)));
        }

            
            {
                b = _pcls3;
                a = view;
                super();
            }
    }

}

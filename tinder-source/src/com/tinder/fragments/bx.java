// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.view.View;
import com.tinder.e.f;
import com.tinder.model.User;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup

public final class bx extends FragmentAnchoredPopup.b
{

    FragmentAnchoredPopup a;
    Context b;
    f c;
    User d;

    public bx(User user)
    {
        d = user;
    }

    // Unreferenced inner class com/tinder/fragments/bx$1

/* anonymous class */
    final class _cls1
        implements android.view.View.OnClickListener
    {

        final bx a;

        public final void onClick(View view)
        {
            if (a.c != null)
            {
                a.c.b();
            }
            a.a.b();
        }

            
            {
                a = bx.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/bx$2

/* anonymous class */
    final class _cls2
        implements android.view.View.OnClickListener
    {

        final bx a;

        public final void onClick(View view)
        {
            if (a.c != null)
            {
                a.c.a();
            }
            a.a.b();
        }

            
            {
                a = bx.this;
                super();
            }
    }

}

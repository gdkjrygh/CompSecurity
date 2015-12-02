// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.EditText;
import com.facebook.orca.emoji.c;
import com.facebook.orca.emoji.o;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class y
    implements o
{

    final ComposeFragment a;

    y(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.a(a, false);
    }

    public void a(int i)
    {
        ComposeFragment.a(a, i);
    }

    public void a(c c1)
    {
        ComposeFragment.a(a, c1);
    }

    public boolean a(MotionEvent motionevent)
    {
        return ComposeFragment.a(a, motionevent);
    }

    public void b()
    {
        ComposeFragment.J(a);
    }

    public void c()
    {
        ComposeFragment.h(a).dispatchKeyEvent(new KeyEvent(0, 67));
    }
}

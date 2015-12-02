// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.MotionEvent;
import com.facebook.orca.stickers.Sticker;
import com.facebook.orca.stickers.u;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class x
    implements u
{

    final ComposeFragment a;

    x(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.b(a, false);
    }

    public void a(Sticker sticker)
    {
        ComposeFragment.a(a, sticker);
        ComposeFragment.I(a);
    }

    public boolean a(MotionEvent motionevent)
    {
        return ComposeFragment.a(a, motionevent);
    }
}

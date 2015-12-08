// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.drawable.ColorDrawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            u, r

public final class aa extends ColorDrawable
{

    final r a;
    private final WeakReference b;

    public aa(r r, u u1)
    {
        a = r;
        super(0);
        b = new WeakReference(u1);
    }

    public final u a()
    {
        return (u)b.get();
    }
}

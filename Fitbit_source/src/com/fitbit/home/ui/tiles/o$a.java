// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            o

protected class .getDrawable
{

    public Drawable a;
    public Drawable b;
    final o c;

    public wable(o o1, int i, int j)
    {
        c = o1;
        super();
        a = o1.i().getResources().getDrawable(i);
        b = o1.i().getResources().getDrawable(j);
    }
}

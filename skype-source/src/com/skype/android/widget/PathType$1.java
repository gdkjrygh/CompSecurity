// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Path;
import android.graphics.RectF;

// Referenced classes of package com.skype.android.widget:
//            PathType

static final class nit> extends PathType
{

    protected final void a(Path path, RectF rectf)
    {
        path.addCircle(rectf.centerX(), rectf.centerY(), rectf.width() / 2.0F - 1.0F, android.graphics.ion.CW);
    }

    (String s)
    {
        super(s, 0, (byte)0);
    }
}

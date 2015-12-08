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

    public final void a(Path path, RectF rectf)
    {
        path.addRect(rectf, android.graphics.ion.CW);
    }

    (String s)
    {
        super(s, 2, (byte)0);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat, ScrollerCompatIcs

static class  extends ScrollerCompat
{

    public float getCurrVelocity()
    {
        return ScrollerCompatIcs.getCurrVelocity(mScroller);
    }

    public (Context context)
    {
        super(context);
    }
}

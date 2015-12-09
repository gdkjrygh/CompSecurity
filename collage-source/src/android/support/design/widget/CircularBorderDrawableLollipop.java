// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.Outline;

// Referenced classes of package android.support.design.widget:
//            CircularBorderDrawable

class CircularBorderDrawableLollipop extends CircularBorderDrawable
{

    CircularBorderDrawableLollipop()
    {
    }

    public void getOutline(Outline outline)
    {
        copyBounds(mRect);
        outline.setOval(mRect);
    }
}

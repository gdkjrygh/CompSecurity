// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//            q

static class able extends able
{

    public void a(TextView textview, Drawable drawable)
    {
        Drawable drawable1;
        boolean flag;
        if (textview.getLayoutDirection() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable1 = null;
        } else
        {
            drawable1 = drawable;
        }
        if (!flag)
        {
            drawable = null;
        }
        textview.setCompoundDrawables(drawable1, null, drawable, null);
    }

    able()
    {
    }
}

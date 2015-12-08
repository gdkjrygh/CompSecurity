// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.l;
import com.facebook.share.model.ShareContent;

public abstract class h extends l
{

    ShareContent c;
    int d;

    protected h(Context context, AttributeSet attributeset, int i, String s)
    {
        boolean flag = false;
        super(context, attributeset, i, s);
        d = 0;
        if (isInEditMode())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = a();
        }
        d = i;
    }

    protected final void a(Context context, AttributeSet attributeset, int i, int j)
    {
        super.a(context, attributeset, i, j);
        super.a = d();
    }

    protected abstract android.view.View.OnClickListener d();
}

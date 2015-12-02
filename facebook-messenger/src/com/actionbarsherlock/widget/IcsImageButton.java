// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.actionbarsherlock.internal.view.a;
import com.actionbarsherlock.internal.view.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IcsImageButton extends ImageButton
    implements a
{

    private final Set a;

    public IcsImageButton(Context context)
    {
        this(context, null);
    }

    public IcsImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IcsImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new HashSet();
    }

    public void a(b b1)
    {
        a.add(b1);
    }

    public void b(b b1)
    {
        a.remove(b1);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).a(this)) { }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).b(this)) { }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import android.content.Context;
import android.util.AttributeSet;
import com.qihoo.security.appbox.c.a.b;
import com.qihoo.security.widget.RatioImageView;
import java.lang.ref.WeakReference;

public class RemoteImageView extends RatioImageView
{

    public RemoteImageView(Context context)
    {
        this(context, null);
    }

    public RemoteImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RemoteImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode());
    }

    public void a(String s, int i)
    {
        com.qihoo.security.appbox.c.a.b.b b1;
        if (c != null)
        {
            b1 = (com.qihoo.security.appbox.c.a.b.b)c.get();
        } else
        {
            b1 = null;
        }
        if (b1 != null)
        {
            b1.a();
        }
        c = new WeakReference(com.qihoo.security.appbox.c.a.b.a().a(s, this, i));
    }

    public void b(String s, int i)
    {
        a((new StringBuilder()).append("Package://").append(s).toString(), i);
    }

    public void c(String s, int i)
    {
        a((new StringBuilder()).append("ApkPath://").append(s).toString(), i);
    }

    public void setImageResourceInListView(int i)
    {
        com.qihoo.security.appbox.c.a.b.b b1;
        if (c != null)
        {
            b1 = (com.qihoo.security.appbox.c.a.b.b)c.get();
        } else
        {
            b1 = null;
        }
        if (b1 != null)
        {
            b1.a();
        }
        super.setImageResource(i);
    }
}

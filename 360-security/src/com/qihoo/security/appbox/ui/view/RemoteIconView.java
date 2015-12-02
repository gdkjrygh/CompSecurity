// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.qihoo.security.appbox.c.a.b;
import java.lang.ref.WeakReference;

public class RemoteIconView extends ImageView
{

    private String a;
    private WeakReference b;

    public RemoteIconView(Context context)
    {
        super(context);
        a(context);
    }

    public RemoteIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public RemoteIconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        if (!isInEditMode());
    }

    public void a(String s, int i)
    {
        b((new StringBuilder()).append("Package://").append(s).toString(), i);
    }

    public void b(String s, int i)
    {
        com.qihoo.security.appbox.c.a.b.b b1;
        if (b != null)
        {
            b1 = (com.qihoo.security.appbox.c.a.b.b)b.get();
        } else
        {
            b1 = null;
        }
        if (b1 != null)
        {
            b1.a();
        }
        b = new WeakReference(com.qihoo.security.appbox.c.a.b.a().a(s, this, i));
    }

    String getUrl()
    {
        return a;
    }
}

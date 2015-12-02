// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.dialog:
//            a, f

public class b extends a
{

    public b(Context context)
    {
        super(context);
    }

    public b(Context context, int i, int j)
    {
        this(context, ((CharSequence) (d.a().a(i))), ((CharSequence) (d.a().a(j))));
    }

    public b(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        this(context);
        setDialogMessage(charsequence1);
        setDialogTitle(charsequence);
    }

    protected View a()
    {
        return null;
    }

    public View a(int i)
    {
        return a(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public View a(View view)
    {
        Object obj = b();
        com.qihoo.security.locale.widget.LocaleTextView localetextview = ((f) (obj)).getMessageTextView();
        obj = ((f) (obj)).getContentView();
        if (view != null && obj != null)
        {
            ((ViewGroup) (obj)).addView(view);
            if (localetextview != null)
            {
                localetextview.setVisibility(8);
            }
            ((ViewGroup) (obj)).setVisibility(0);
        }
        return view;
    }

    public void c()
    {
        setDialogMessage("");
    }
}

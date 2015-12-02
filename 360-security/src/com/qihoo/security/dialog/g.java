// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.dialog:
//            a

public class g extends a
{

    private LocaleTextView b;

    public g(Context context)
    {
        super(context);
        setDialogMessage("");
        setDialogTitle("");
    }

    protected View a()
    {
        return LayoutInflater.from(getContext()).inflate(0x7f030071, null);
    }

    public void a(int i)
    {
        if (b == null)
        {
            b = (LocaleTextView)findViewById(0x7f0b017e);
        }
        b.setLocalText(i);
    }

    public void a(CharSequence charsequence)
    {
        if (b == null)
        {
            b = (LocaleTextView)findViewById(0x7f0b017e);
        }
        b.setLocalText(charsequence);
    }
}

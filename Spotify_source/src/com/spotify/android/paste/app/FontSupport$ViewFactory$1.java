// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

final class nit> extends nit>
{

    public final int a()
    {
        return 0x7f0101e6;
    }

    public final TextView a(Context context, AttributeSet attributeset)
    {
        return new AutoCompleteTextView(context, attributeset);
    }

    (String s, String s1)
    {
        super(s, 0, s1, (byte)0);
    }
}

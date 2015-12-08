// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.text.style.ClickableSpan;
import android.view.View;

public final class bw extends ClickableSpan
{
    public static interface a
    {

        public abstract void a(String s);
    }


    private final String a;
    private a b;

    public bw(String s, a a1)
    {
        a = s;
        b = a1;
    }

    public final void onClick(View view)
    {
        if (b != null)
        {
            b.a(a);
        }
    }
}

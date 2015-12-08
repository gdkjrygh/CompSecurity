// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.widget.TextView;

final class itv
    implements android.widget.TextView.OnEditorActionListener
{

    private itf a;

    itv(itf itf1)
    {
        a = itf1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            itf.k(a);
        }
        return false;
    }
}

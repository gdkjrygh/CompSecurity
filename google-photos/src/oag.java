// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;

final class oag
    implements android.view.View.OnKeyListener
{

    private oad a;

    oag(oad oad1)
    {
        a = oad1;
        super();
    }

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (oad.b(a).getSelectedItem() instanceof nzw)
        {
            oad.b(a).getSelectedView();
        }
        return false;
    }
}

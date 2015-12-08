// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            as

final class at
    implements android.widget.TextView.OnEditorActionListener
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return as.a(a);
    }
}

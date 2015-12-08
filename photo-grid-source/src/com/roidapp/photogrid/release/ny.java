// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.release:
//            nn

final class ny
    implements android.view.View.OnClickListener
{

    final CheckBox a;
    final nn b;

    ny(nn nn1, CheckBox checkbox)
    {
        b = nn1;
        a = checkbox;
        super();
    }

    public final void onClick(View view)
    {
        nn.a(b);
        a.setChecked(nn.b(b));
    }
}

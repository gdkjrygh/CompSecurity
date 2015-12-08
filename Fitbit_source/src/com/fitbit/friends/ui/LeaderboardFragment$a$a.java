// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.view.View;
import android.widget.TextView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment

class d
{

    final TextView a;
    final LoadablePicassoImageView b;
    final TextView c;
    final TextView d;
    final w e;

    public w(w w, View view, int i)
    {
        e = w;
        super();
        b = (LoadablePicassoImageView)view.findViewById(0x7f110330);
        c = (TextView)view.findViewById(0x7f110252);
        a = (TextView)view.findViewById(0x7f11037e);
        d = (TextView)view.findViewById(0x7f110376);
    }
}

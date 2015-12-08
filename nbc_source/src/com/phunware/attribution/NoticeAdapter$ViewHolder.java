// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.attribution;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.phunware.attribution:
//            NoticeAdapter

private static class text
{

    public TextView name;
    public TextView text;

    public (View view)
    {
        name = (TextView)view.findViewById(0x7f0f011f);
        text = (TextView)view.findViewById(0x7f0f0120);
        view.setTag(this);
    }
}

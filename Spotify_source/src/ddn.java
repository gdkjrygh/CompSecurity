// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class ddn extends ddo
    implements ddm
{

    private ImageView b;

    public ddn(View view)
    {
        super(view);
        b = (ImageView)view.findViewById(0x1020006);
    }

    public final ImageView e()
    {
        return b;
    }
}

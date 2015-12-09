// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

class dic extends did
    implements dib
{

    private ImageView a;

    public dic(Context context, View view)
    {
        super(context, view);
        a = (ImageView)view.findViewById(0x1020006);
    }

    public ImageView d()
    {
        return a;
    }
}

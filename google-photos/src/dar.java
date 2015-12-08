// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

public final class dar extends RelativeLayout
{

    public View a;
    public int b;

    public dar(Context context)
    {
        super(context);
        b = 0;
        setGravity(17);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }
}

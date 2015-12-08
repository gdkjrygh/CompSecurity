// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

final class ddq extends ddo
    implements ddp
{

    private TextView b;

    public ddq(View view)
    {
        super(view);
        b = (TextView)view.findViewById(0x7f1100e3);
        int i = dgg.a(b.getPaint(), 2);
        b.getLayoutParams().width = i;
    }

    public final void a(int i)
    {
        b.setText(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public final void a(Drawable drawable)
    {
        b.setCompoundDrawables(null, null, null, drawable);
    }

    public final TextView e()
    {
        return b;
    }
}

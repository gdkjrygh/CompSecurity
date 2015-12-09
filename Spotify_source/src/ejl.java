// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ToggleButton;

public final class ejl
{

    public final ToggleButton a;
    eka b;

    public ejl(Context context, eka eka)
    {
        a = (ToggleButton)LayoutInflater.from(context).inflate(0x7f0300c8, null).findViewById(0x7f1103f9);
        b = eka;
        a.setTextOn(context.getString(0x7f0800c5));
        a.setTextOff(context.getString(0x7f0800c4));
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private ejl a;

            public final void onClick(View view)
            {
                if (a.b != null)
                {
                    view = a.b;
                    a.a.isChecked();
                    view.a();
                }
            }

            
            {
                a = ejl.this;
                super();
            }
        });
    }
}

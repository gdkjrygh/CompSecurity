// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

public class agh extends Dialog
{

    public agh(Context context, String s)
    {
        super(context, 0x7f100003);
        setContentView(0x7f04018a);
        setCancelable(false);
        if (s != null && !s.equals(""))
        {
            context = (TextView)findViewById(0x7f0d0628);
            context.setText(s);
            context.setVisibility(0);
        }
    }
}

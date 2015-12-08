// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;

public final class gdg
{

    public static void a(Context context, TextView textview, boolean flag)
    {
        if (flag)
        {
            gdc.a(context, textview, 0x7f110049, new cue(context) {

                private Context a;

                public final Object a()
                {
                    return ggk.a(dgp.d(a));
                }

            
            {
                a = context;
                super();
            }
            });
            return;
        } else
        {
            gdc.a(textview, 0x7f110049);
            return;
        }
    }
}

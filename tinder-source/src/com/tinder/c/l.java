// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tinder.enums.ConfirmationType;

// Referenced classes of package com.tinder.c:
//            f

public final class l extends f
{

    private android.view.View.OnClickListener a;
    private android.view.View.OnClickListener c;

    public l(Context context, ConfirmationType confirmationtype, String s, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        super(context, confirmationtype.getIdTitle(), String.format(context.getString(confirmationtype.getIdPrompt(), new Object[] {
            s
        }), new Object[0]));
        context = getWindow();
        context.setFlags(32, 32);
        context.addFlags(0x40000);
        a = onclicklistener1;
        c = onclicklistener;
        a(0x7f060074, new android.view.View.OnClickListener() {

            final l a;

            public final void onClick(View view)
            {
                if (l.a(a) != null)
                {
                    l.a(a).onClick(view);
                }
                a.dismiss();
            }

            
            {
                a = l.this;
                super();
            }
        });
        b(confirmationtype.getIdAction(), new android.view.View.OnClickListener() {

            final l a;

            public final void onClick(View view)
            {
                a.dismiss();
                if (l.b(a) != null)
                {
                    l.b(a).onClick(view);
                }
            }

            
            {
                a = l.this;
                super();
            }
        });
        setOnKeyListener(onkeylistener);
    }

    static android.view.View.OnClickListener a(l l1)
    {
        return l1.a;
    }

    static android.view.View.OnClickListener b(l l1)
    {
        return l1.c;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            super.b.performClick();
        }
        return false;
    }
}

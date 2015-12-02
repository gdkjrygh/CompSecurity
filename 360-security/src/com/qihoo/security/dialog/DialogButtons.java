// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.widget.material.MaterialRippleButton;

// Referenced classes of package com.qihoo.security.dialog:
//            e

public class DialogButtons extends FrameLayout
    implements e
{

    d a;
    MaterialRippleButton b;
    MaterialRippleButton c;
    MaterialRippleButton d;
    View e;
    View f;
    private CharSequence g[];
    private android.view.View.OnClickListener h[];

    public DialogButtons(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = com.qihoo.security.locale.d.a();
        g = null;
        h = null;
        LayoutInflater.from(getContext()).inflate(0x7f030047, this);
        a();
    }

    private void a()
    {
        b = (MaterialRippleButton)findViewById(0x7f0b0102);
        c = (MaterialRippleButton)findViewById(0x7f0b0103);
        d = (MaterialRippleButton)findViewById(0x7f0b0105);
        f = findViewById(0x7f0b0104);
        e = findViewById(0x7f0b0101);
    }

    public LocaleButton[] getShownButtons()
    {
        Object obj = null;
        MaterialRippleButton amaterialripplebutton[] = obj;
        if (g != null)
        {
            amaterialripplebutton = obj;
            if (g.length > 0)
            {
                if (g.length == 1)
                {
                    amaterialripplebutton = new MaterialRippleButton[1];
                    amaterialripplebutton[0] = d;
                } else
                {
                    amaterialripplebutton = obj;
                    if (g.length >= 2)
                    {
                        return (new MaterialRippleButton[] {
                            b, c
                        });
                    }
                }
            }
        }
        return amaterialripplebutton;
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        Object obj;
        obj = null;
        h = aonclicklistener;
        if (g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.view.View.OnClickListener onclicklistener;
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        b.setClickable(false);
        c.setClickable(false);
        d.setClickable(false);
        if (h == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (g.length != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        onclicklistener = obj;
        if (aonclicklistener == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        onclicklistener = obj;
        if (aonclicklistener.length > 0)
        {
            onclicklistener = aonclicklistener[0];
        }
_L4:
        if (onclicklistener != null)
        {
            d.setEnabled(true);
            d.setClickable(true);
            d.setOnClickListener(aonclicklistener[0]);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        onclicklistener = aonclicklistener[0];
        if (onclicklistener != null)
        {
            c.setEnabled(true);
            c.setClickable(true);
            c.setOnClickListener(onclicklistener);
        }
        aonclicklistener = aonclicklistener[1];
        if (aonclicklistener != null)
        {
            b.setEnabled(true);
            b.setClickable(true);
            b.setOnClickListener(aonclicklistener);
            return;
        }
          goto _L1
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        arrayindexoutofboundsexception;
        arrayindexoutofboundsexception = obj;
          goto _L4
    }

    public transient void setButtonText(int ai[])
    {
        CharSequence acharsequence[] = new CharSequence[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            acharsequence[i] = a.a(ai[i]);
        }

        setButtonText(acharsequence);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        if (acharsequence == null)
        {
            setVisibility(8);
        } else
        {
            g = acharsequence;
            setVisibility(0);
            if (acharsequence.length == 1)
            {
                e.setVisibility(8);
                f.setVisibility(0);
                d.setLocalText(acharsequence[0]);
            } else
            if (acharsequence.length >= 2)
            {
                f.setVisibility(8);
                e.setVisibility(0);
                c.setLocalText(acharsequence[0]);
                b.setLocalText(acharsequence[1]);
            }
            if (h != null)
            {
                setButtonOnClickListener(h);
                return;
            }
        }
    }
}

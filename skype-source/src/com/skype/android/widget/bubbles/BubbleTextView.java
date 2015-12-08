// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.skype.android.widget.bubbles:
//            Bubblable

public class BubbleTextView extends TextView
    implements Bubblable
{

    private LevelListDrawable a;
    private LevelListDrawable b;
    private Bubblable.Direction c;
    private boolean d;

    public BubbleTextView(Context context)
    {
        super(context);
        a();
    }

    public BubbleTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public BubbleTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        LayerDrawable layerdrawable = (LayerDrawable)getResources().getDrawable(0x7f02009a);
        a = (LevelListDrawable)layerdrawable.findDrawableByLayerId(0x7f10059e);
        b = (LevelListDrawable)layerdrawable.findDrawableByLayerId(0x7f10059f);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setBackground(layerdrawable);
            return;
        } else
        {
            setBackgroundDrawable(layerdrawable);
            return;
        }
    }

    public void setDirectionState(Bubblable.Direction direction, boolean flag)
    {
        c = direction;
        d = flag;
        int i = getResources().getInteger(c.a());
        a.setLevel(i);
        c.a(this);
        direction = b;
        byte byte0;
        if (d && c != Bubblable.Direction.c)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        direction.setLevel(byte0 + i);
    }
}

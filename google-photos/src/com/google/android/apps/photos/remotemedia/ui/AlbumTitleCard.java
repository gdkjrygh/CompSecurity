// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.remotemedia.ui;

import ag;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b;

// Referenced classes of package com.google.android.apps.photos.remotemedia.ui:
//            Facepile

public class AlbumTitleCard extends FrameLayout
{

    public EditText a;
    public TextView b;
    public TextView c;
    public Facepile d;
    public RelativeLayout e;

    public AlbumTitleCard(Context context)
    {
        super(context);
        a();
    }

    public AlbumTitleCard(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public AlbumTitleCard(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            inflate(getContext(), b.wL, this);
            setBackground(getResources().getDrawable(b.wI));
        } else
        {
            inflate(getContext(), b.wM, this);
        }
        b = (TextView)findViewById(ag.p);
        c = (TextView)findViewById(ag.o);
        a = (EditText)findViewById(ag.r);
        d = (Facepile)findViewById(ag.w);
        e = (RelativeLayout)findViewById(ag.q);
        b.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), a.getPaddingBottom());
        c.setPadding(a.getPaddingLeft(), 0, 0, 0);
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = c;
        int i;
        if (flag)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = d;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Facepile) (obj)).setVisibility(i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}

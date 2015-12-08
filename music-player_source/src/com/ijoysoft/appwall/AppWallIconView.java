// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.ijoysoft.appwall:
//            ac, ab, a

public class AppWallIconView extends RelativeLayout
    implements android.view.View.OnClickListener
{

    private TextView a;

    public AppWallIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(ac.b, this);
        a = (TextView)findViewById(ab.i);
        a.setText((new StringBuilder()).append(com.ijoysoft.appwall.a.d(context)).toString());
        findViewById(ab.d).setOnClickListener(this);
    }

    public void onClick(View view)
    {
        com.ijoysoft.appwall.a.b(getContext());
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        findViewById(ab.h).setBackgroundDrawable(drawable);
    }
}

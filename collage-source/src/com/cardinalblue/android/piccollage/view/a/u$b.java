// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.model.StickerBundle;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            u

static class a extends a
{

    ImageView a;
    TextView b;

    public void a(int i)
    {
        b.setTextSize(i);
    }

    public void a(StickerBundle stickerbundle)
    {
        b.setText(stickerbundle.b());
        String s = stickerbundle.e();
        a(a, s, stickerbundle.f());
    }

    public erBundle(View view)
    {
        super(view);
        b = (TextView)view.findViewById(0x7f1002a4);
        a = (ImageView)view.findViewById(0x7f1002a2);
    }
}

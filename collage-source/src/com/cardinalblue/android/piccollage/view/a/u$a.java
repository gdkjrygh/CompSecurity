// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import android.widget.ImageView;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.lib.e;
import com.cardinalblue.android.piccollage.model.StickerBundle;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            u

static abstract class er extends android.support.v7.widget.clerView.ViewHolder
{

    public abstract void a(int i);

    protected void a(ImageView imageview, String s, String s1)
    {
        try
        {
            com.cardinalblue.android.piccollage.lib.a(s).a(imageview);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            imageview.setImageResource(0x7f0202c6);
            f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader for bundle [").append(s1).append("] from uri [").append(s).append("]").toString()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            imageview.setImageResource(0x7f0202c6);
        }
        f.a(s);
    }

    public abstract void a(StickerBundle stickerbundle);

    public erBundle(View view)
    {
        super(view);
    }
}

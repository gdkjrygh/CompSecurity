// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.widget.ImageView;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.lib.f;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            w

class a
    implements f
{

    final Sticker a;
    final w b;

    public void a(ImageView imageview, String s)
    {
        if (com.cardinalblue.android.piccollage.view.a.w.a(b))
        {
            w.b(b).remove(a);
            b.notifyDataSetChanged();
            return;
        }
        try
        {
            com.cardinalblue.android.piccollage.lib.a(a.getImgSubpath()).a(imageview);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader for sticker from uri [").append(a.getImgSubpath()).append("]").toString()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview)
        {
            com.cardinalblue.android.piccollage.a.f.a(imageview);
        }
    }

    Sticker(w w1, Sticker sticker)
    {
        b = w1;
        a = sticker;
        super();
    }
}

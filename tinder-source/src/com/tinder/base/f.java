// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.base:
//            d

public class f extends d
{

    public f()
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (o.e())
        {
            view.setOutlineProvider(new ViewOutlineProvider() {

                final f a;

                public final void getOutline(View view1, Outline outline)
                {
                    outline.setRect(0, 0, view1.getWidth(), view1.getHeight());
                }

            
            {
                a = f.this;
                super();
            }
            });
            view.setTranslationZ(26F);
            view.setClipToOutline(false);
        }
    }
}

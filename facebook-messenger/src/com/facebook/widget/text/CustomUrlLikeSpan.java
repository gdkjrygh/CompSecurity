// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.text.style.URLSpan;
import android.view.View;

// Referenced classes of package com.facebook.widget.text:
//            f

public class CustomUrlLikeSpan extends URLSpan
{

    private f a;

    public CustomUrlLikeSpan()
    {
        super("about:blank");
    }

    public void a(f f1)
    {
        a = f1;
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            a.a();
        }
    }
}

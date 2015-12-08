// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            y

class a
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final y b;

    public void onClick(View view)
    {
        if (b.e != null)
        {
            b.e.a(a);
        }
    }

    WebPhoto(y y1, WebPhoto webphoto)
    {
        b = y1;
        a = webphoto;
        super();
    }
}

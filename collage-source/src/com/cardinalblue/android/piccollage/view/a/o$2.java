// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.activities.e;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.CheckableImageView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            o

class c
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final CheckableImageView b;
    final int c;
    final o d;

    public void onClick(View view)
    {
        if (o.a(d) != null && o.a(d).a(a))
        {
            b.setChecked(o.a(d).b(o.a(d, c)));
        }
    }

    bleImageView(o o1, WebPhoto webphoto, CheckableImageView checkableimageview, int i)
    {
        d = o1;
        a = webphoto;
        b = checkableimageview;
        c = i;
        super();
    }
}

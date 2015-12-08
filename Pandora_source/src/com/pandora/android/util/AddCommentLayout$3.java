// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            AddCommentLayout, s

class a
    implements android.view.r
{

    final AddCommentLayout a;

    public void onClick(View view)
    {
        view = com.pandora.android.util.s.a(com.pandora.android.util.AddCommentLayout.a(a).getText());
        p.df.a.a("AddCommentLayout", (new StringBuilder()).append("commentButton.clicked: '").append(view).append("'").toString());
        if (AddCommentLayout.c(a) != null)
        {
            AddCommentLayout.c(a).a(view, AddCommentLayout.d(a).getTag().toString());
        }
        AddCommentLayout.e(a);
        a.a();
        if (AddCommentLayout.f(a))
        {
            a.b();
        }
    }

    (AddCommentLayout addcommentlayout)
    {
        a = addcommentlayout;
        super();
    }
}

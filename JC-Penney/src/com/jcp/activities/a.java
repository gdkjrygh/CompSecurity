// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;

// Referenced classes of package com.jcp.activities:
//            AssistantsImageKnowledgeActivity

class a
    implements android.view.View.OnClickListener
{

    final AssistantsImageKnowledgeActivity a;

    a(AssistantsImageKnowledgeActivity assistantsimageknowledgeactivity)
    {
        a = assistantsimageknowledgeactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}

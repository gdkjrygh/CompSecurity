// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.report:
//            ReportConversationDialog

class add extends ArrayList
{

    final ReportConversationDialog this$0;

    ()
    {
        this$0 = ReportConversationDialog.this;
        super();
        add("spam");
        add("harassment-me");
        add("harassment-other");
        add("other");
    }
}

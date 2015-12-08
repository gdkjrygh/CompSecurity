// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.report:
//            ReportUserDialog

class add extends ArrayList
{

    final ReportUserDialog this$0;

    ()
    {
        this$0 = ReportUserDialog.this;
        super();
        add("nudity");
        add("attacks");
        add("graphic-violence");
        add("hate-speech");
        add("self-harm");
        add("copyright");
        add("spam");
        add("other");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.g;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.skype.android.app.wear.command:
//            NodeResultCallback

public static abstract class failedNodes
    implements g
{

    private final List failedNodes;

    public List getFailedNodes()
    {
        return Collections.unmodifiableList(failedNodes);
    }

    public (List list)
    {
        failedNodes = list;
    }
}

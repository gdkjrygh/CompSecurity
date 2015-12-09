// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.widget:
//            GameRequestDialog

public static final class <init>
{

    String requestId;
    List to;

    public String getRequestId()
    {
        return requestId;
    }

    public List getRequestRecipients()
    {
        return to;
    }

    private (Bundle bundle)
    {
        requestId = bundle.getString("request");
        for (to = new ArrayList(); bundle.containsKey(String.format("to[%d]", new Object[] {
    Integer.valueOf(to.size())
})); to.add(bundle.getString(String.format("to[%d]", new Object[] {
    Integer.valueOf(to.size())
})))) { }
    }

    to(Bundle bundle, to to1)
    {
        this(bundle);
    }
}

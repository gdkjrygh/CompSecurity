// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            MdxEventHandler

public abstract class EventHandler
    implements MdxEventHandler
{

    protected static final String TAG = "mdxui";
    protected final String mAction;

    public EventHandler(String s)
    {
        mAction = s;
        if (Log.isLoggable("mdxui", 3))
        {
            Log.d("mdxui", (new StringBuilder()).append("MDX event handler for ").append(s).toString());
        }
    }

    public String getAction()
    {
        return mAction;
    }
}

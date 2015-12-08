// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Referenced classes of package com.skype.android.app.chat:
//            UrlPreviewSubtypeViewHolderCache, SubtypeViewHolder

public class UrlPreviewSubtypeMemoryCache
    implements UrlPreviewSubtypeViewHolderCache
{

    private static final int MAX_STACK_SIZE = 5;
    private Map subtypeViewHolderCache;

    public UrlPreviewSubtypeMemoryCache()
    {
        subtypeViewHolderCache = new HashMap();
    }

    public SubtypeViewHolder getRecycled(UrlPreviewTextMessageViewHolder.MessageSubType messagesubtype)
    {
        for (messagesubtype = (Stack)subtypeViewHolderCache.get(messagesubtype); messagesubtype == null || messagesubtype.size() <= 0;)
        {
            return null;
        }

        return (SubtypeViewHolder)messagesubtype.pop();
    }

    public void putRecycled(UrlPreviewTextMessageViewHolder.MessageSubType messagesubtype, SubtypeViewHolder subtypeviewholder)
    {
        Stack stack1 = (Stack)subtypeViewHolderCache.get(messagesubtype);
        Stack stack = stack1;
        if (stack1 == null)
        {
            stack = new Stack();
            subtypeViewHolderCache.put(messagesubtype, stack);
        }
        if (stack.size() < 5)
        {
            stack.push(subtypeviewholder);
        }
    }
}

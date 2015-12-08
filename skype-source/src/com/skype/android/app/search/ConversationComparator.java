// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.app.recents.Recent;
import java.util.Comparator;

public class ConversationComparator
    implements Comparator
{

    public ConversationComparator()
    {
    }

    public int compare(Recent recent, Recent recent1)
    {
        return Long.signum(recent1.getTimestamp() - recent.getTimestamp());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Recent)obj, (Recent)obj1);
    }
}

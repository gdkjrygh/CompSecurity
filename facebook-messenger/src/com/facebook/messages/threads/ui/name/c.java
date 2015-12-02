// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;

import com.google.common.base.Objects;
import java.util.List;

// Referenced classes of package com.facebook.messages.threads.ui.name:
//            a

public class c
{

    public final List a;
    public final int b;

    public c(List list, int i)
    {
        a = list;
        b = i;
    }

    public List a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/messages/threads/ui/name/a).add("lines", a).add("moreCount", Integer.valueOf(b)).toString();
    }
}

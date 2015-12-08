// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.a.d;
import java.net.URL;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.sts:
//            n

public static final class ditor extends com.microsoft.onlineid.internal.a.or
{

    public final com.microsoft.onlineid.internal.a.or a(d d, int i)
    {
        return b(d, i);
    }

    public final com.microsoft.onlineid.internal.a.or a(d d, String s)
    {
        return b(d, s);
    }

    public final com.microsoft.onlineid.internal.a.or a(d d, Set set)
    {
        return b(d, set);
    }

    public final .a.d a(.a.d d, URL url)
    {
        a.putString(d.a(), url.toExternalForm());
        return this;
    }

    public final volatile com.microsoft.onlineid.internal.a.utString b()
    {
        super.b();
        return this;
    }

    public final .a.d b(d d, int i)
    {
        super.a(d, i);
        return this;
    }

    public final .a.d b(d d, String s)
    {
        super.a(d, s);
        return this;
    }

    public final .a.d b(d d, Set set)
    {
        super.a(d, set);
        return this;
    }

    public final .a.d c()
    {
        super.b();
        return this;
    }

    private ditor(android.content.edPreferences.Editor editor)
    {
        super(editor);
    }

    ditor(android.content.edPreferences.Editor editor, byte byte0)
    {
        this(editor);
    }
}

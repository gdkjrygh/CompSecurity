// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;

// Referenced classes of package org.a.a.b.b.a:
//            b

public abstract class c extends b
{

    public c()
    {
    }

    public final int a(CharSequence charsequence, int i, Writer writer)
    {
        return !a(Character.codePointAt(charsequence, i), writer) ? 0 : 1;
    }

    public abstract boolean a(int i, Writer writer);
}

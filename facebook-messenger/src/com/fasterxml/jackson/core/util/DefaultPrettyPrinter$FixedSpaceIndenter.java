// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

public class 
    implements 
{

    public boolean isInline()
    {
        return true;
    }

    public void writeIndentation(JsonGenerator jsongenerator, int i)
    {
        jsongenerator.writeRaw(' ');
    }

    public ()
    {
    }
}

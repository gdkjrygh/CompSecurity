// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.IOException;

final class g extends IOException
{

    g()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}

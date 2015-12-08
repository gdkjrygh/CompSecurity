// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;

public final class o extends DataOutputStream
    implements DataOutput
{

    public final ByteArrayOutputStream a;

    public o()
    {
        this(new ByteArrayOutputStream());
    }

    private o(ByteArrayOutputStream bytearrayoutputstream)
    {
        super(bytearrayoutputstream);
        a = bytearrayoutputstream;
    }
}

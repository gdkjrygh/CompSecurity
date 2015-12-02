// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import android.net.Uri;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

class b extends FromStringDeserializer
{

    protected b()
    {
        super(android/net/Uri);
    }

    protected Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return a(s, deserializationcontext);
    }

    protected Uri a(String s, DeserializationContext deserializationcontext)
    {
        return Uri.parse(s);
    }
}

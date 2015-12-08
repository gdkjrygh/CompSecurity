// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.jsonextract.JsonMap;
import com.dropbox.client2.jsonextract.JsonThing;

public final class expiration
{

    public final String copyRef;
    public final String expiration;

    public static expiration extractFromJson(JsonThing jsonthing)
    {
        jsonthing = jsonthing.expectMap();
        return new <init>(jsonthing.get("copy_ref").expectString(), jsonthing.get("expires").expectString());
    }

    public (String s, String s1)
    {
        copyRef = s;
        expiration = s1;
    }
}

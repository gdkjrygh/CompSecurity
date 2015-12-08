// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.DeserializationFeature;

public class gpo
    implements dmx
{

    final gng a;

    public gpo(gni gni1)
    {
        a = gni1.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}

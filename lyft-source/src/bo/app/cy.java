// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;

public final class cy
    implements IPutIntoJson
{

    private final String a;

    public cy(String s)
    {
        a = s;
    }

    public final volatile Object forJsonPut()
    {
        return a;
    }

    public final String toString()
    {
        return a;
    }
}

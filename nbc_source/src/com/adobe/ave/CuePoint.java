// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            Dictionary

public class CuePoint
{

    public Dictionary dictionary;
    public long localTime;

    private CuePoint(long l, Dictionary dictionary1)
    {
        localTime = l;
        dictionary = dictionary1;
    }
}

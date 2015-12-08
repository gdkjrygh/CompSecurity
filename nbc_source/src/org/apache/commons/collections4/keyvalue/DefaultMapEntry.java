// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.keyvalue;


// Referenced classes of package org.apache.commons.collections4.keyvalue:
//            AbstractMapEntry

public final class DefaultMapEntry extends AbstractMapEntry
{

    public DefaultMapEntry(java.util.Map.Entry entry)
    {
        super(entry.getKey(), entry.getValue());
    }
}

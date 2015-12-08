// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

class ContactMap extends LinkedHashMap
    implements Iterable
{

    ContactMap()
    {
    }

    public Iterator iterator()
    {
        return values().iterator();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.impl;

import org.codehaus.jackson.map.deser.SettableBeanProperty;

// Referenced classes of package org.codehaus.jackson.map.deser.impl:
//            BeanPropertyMap

static final class value
{

    public final String key;
    public final value next;
    public final SettableBeanProperty value;

    public ( , String s, SettableBeanProperty settablebeanproperty)
    {
        next = ;
        key = s;
        value = settablebeanproperty;
    }
}

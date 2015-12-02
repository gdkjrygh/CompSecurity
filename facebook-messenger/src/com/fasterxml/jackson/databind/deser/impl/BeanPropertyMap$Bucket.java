// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

final class value
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

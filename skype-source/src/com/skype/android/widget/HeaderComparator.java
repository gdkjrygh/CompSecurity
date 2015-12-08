// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import java.text.Collator;
import java.util.Comparator;

public class HeaderComparator
    implements Comparator
{

    private Collator a;

    public HeaderComparator()
    {
        a = Collator.getInstance();
        a = Collator.getInstance();
    }

    public int compare(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }
}

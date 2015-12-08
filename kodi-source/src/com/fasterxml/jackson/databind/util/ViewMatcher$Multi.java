// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ViewMatcher

private static final class _views extends ViewMatcher
    implements Serializable
{

    private final Class _views[];

    public boolean isVisibleForView(Class class1)
    {
        int i = 0;
        for (int j = _views.length; i < j; i++)
        {
            Class class2 = _views[i];
            if (class1 == class2 || class2.isAssignableFrom(class1))
            {
                return true;
            }
        }

        return false;
    }

    public (Class aclass[])
    {
        _views = aclass;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ViewMatcher

final class _view extends ViewMatcher
{

    private static final long serialVersionUID = 1L;
    private final Class _view;

    public final boolean isVisibleForView(Class class1)
    {
        return class1 == _view || _view.isAssignableFrom(class1);
    }

    public (Class class1)
    {
        _view = class1;
    }
}

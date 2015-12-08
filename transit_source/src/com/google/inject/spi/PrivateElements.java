// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Injector;
import com.google.inject.Key;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.spi:
//            Element

public interface PrivateElements
    extends Element
{

    public abstract List getElements();

    public abstract Set getExposedKeys();

    public abstract Object getExposedSource(Key key);

    public abstract Injector getInjector();
}

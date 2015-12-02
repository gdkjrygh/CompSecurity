// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector
{

    public static final NopAnnotationIntrospector instance = new _cls1();

    public NopAnnotationIntrospector()
    {
    }

    public Version version()
    {
        return Version.unknownVersion();
    }


    private class _cls1 extends NopAnnotationIntrospector
    {

        public Version version()
        {
            return DatabindVersion.instance.version();
        }

        _cls1()
        {
        }
    }

}

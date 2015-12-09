// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JavaType

public interface BeanProperty
{

    public abstract AnnotatedMember getMember();

    public abstract JavaType getType();
}

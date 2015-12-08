// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeBindings, TypeFactory

public abstract class TypeModifier
{

    public abstract JavaType modifyType(JavaType javatype, Type type, TypeBindings typebindings, TypeFactory typefactory);
}

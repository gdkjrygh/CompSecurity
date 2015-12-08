// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Types;

final class Listener
{

    private final String methodName;
    private final String ownerType;
    private final List parameterTypes;
    private final String returnType;
    private final String setterName;
    private final String type;

    private Listener(String s, String s1, String s2, String s3, String s4, List list)
    {
        ownerType = s;
        setterName = s1;
        type = s2;
        returnType = s3;
        methodName = s4;
        parameterTypes = list;
    }

    static Listener from(TypeElement typeelement, Types types)
    {
        Object obj = typeelement.getEnclosedElements();
        if (((List) (obj)).size() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(typeelement.getSimpleName()).append(" is not a single-method interface").toString());
        }
        Object obj1 = (ExecutableElement)((List) (obj)).get(0);
        obj = types.erasure(typeelement.getEnclosingElement().asType()).toString();
        String s = (new StringBuilder("set")).append(typeelement.getSimpleName()).toString();
        String s1 = typeelement.getQualifiedName().toString();
        String s2 = ((ExecutableElement) (obj1)).getSimpleName().toString();
        String s3 = ((ExecutableElement) (obj1)).getReturnType().toString();
        typeelement = ((ExecutableElement) (obj1)).getParameters();
        obj1 = new ArrayList(typeelement.size());
        for (Iterator iterator = typeelement.iterator(); iterator.hasNext(); ((List) (obj1)).add(typeelement))
        {
            types = ((VariableElement)iterator.next()).asType().toString();
            typeelement = types;
            if (!types.startsWith("java.lang."))
            {
                continue;
            }
            typeelement = types;
            if (!types.substring(10).contains("."))
            {
                typeelement = types.substring(10);
            }
        }

        return new Listener(((String) (obj)), s, s1, s3, s2, ((List) (obj1)));
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Listener)obj;
            if (!methodName.equals(((Listener) (obj)).methodName) || !ownerType.equals(((Listener) (obj)).ownerType) || !parameterTypes.equals(((Listener) (obj)).parameterTypes) || !returnType.equals(((Listener) (obj)).returnType) || !setterName.equals(((Listener) (obj)).setterName) || !type.equals(((Listener) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    final String getMethodName()
    {
        return methodName;
    }

    public final String getOwnerType()
    {
        return ownerType;
    }

    final List getParameterTypes()
    {
        return parameterTypes;
    }

    final String getReturnType()
    {
        return returnType;
    }

    public final String getSetterName()
    {
        return setterName;
    }

    final String getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return ((((ownerType.hashCode() * 31 + setterName.hashCode()) * 31 + type.hashCode()) * 31 + returnType.hashCode()) * 31 + methodName.hashCode()) * 31 + parameterTypes.hashCode();
    }
}

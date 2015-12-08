// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            SimpleType, TypeFactory

public class TypeBindings
{

    private static final JavaType NO_TYPES[] = new JavaType[0];
    public static final JavaType UNBOUND = new SimpleType(java/lang/Object);
    protected Map _bindings;
    protected final Class _contextClass;
    protected final JavaType _contextType;
    private final TypeBindings _parentBindings;
    protected HashSet _placeholders;
    protected final TypeFactory _typeFactory;

    public TypeBindings(TypeFactory typefactory, JavaType javatype)
    {
        this(typefactory, null, javatype.getRawClass(), javatype);
    }

    private TypeBindings(TypeFactory typefactory, TypeBindings typebindings, Class class1, JavaType javatype)
    {
        _typeFactory = typefactory;
        _parentBindings = typebindings;
        _contextClass = class1;
        _contextType = javatype;
    }

    public TypeBindings(TypeFactory typefactory, Class class1)
    {
        this(typefactory, null, class1, null);
    }

    public void _addPlaceholder(String s)
    {
        if (_placeholders == null)
        {
            _placeholders = new HashSet();
        }
        _placeholders.add(s);
    }

    protected void _resolve()
    {
        _resolveBindings(_contextClass);
        if (_contextType != null)
        {
            int j = _contextType.containedTypeCount();
            if (j > 0)
            {
                for (int i = 0; i < j; i++)
                {
                    addBinding(_contextType.containedTypeName(i), _contextType.containedType(i));
                }

            }
        }
        if (_bindings == null)
        {
            _bindings = Collections.emptyMap();
        }
    }

    protected void _resolveBindings(Type type)
    {
        boolean flag = false;
        if (type != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Type atype[];
        if (!(type instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        type = (ParameterizedType)type;
        atype = type.getActualTypeArguments();
        if (atype == null || atype.length <= 0) goto _L4; else goto _L3
_L3:
        TypeVariable atypevariable[];
        int i;
        int j;
        Class class2 = (Class)type.getRawType();
        atypevariable = class2.getTypeParameters();
        if (atypevariable.length != atype.length)
        {
            throw new IllegalArgumentException((new StringBuilder("Strange parametrized type (in class ")).append(class2.getName()).append("): number of type arguments != number of type parameters (").append(atype.length).append(" vs ").append(atypevariable.length).append(")").toString());
        }
        j = atype.length;
        i = 0;
_L8:
        if (i >= j) goto _L4; else goto _L5
_L5:
        String s1 = atypevariable[i].getName();
        if (_bindings != null) goto _L7; else goto _L6
_L6:
        _bindings = new LinkedHashMap();
_L9:
        _addPlaceholder(s1);
        _bindings.put(s1, _typeFactory._constructType(atype[i], this));
_L10:
        i++;
          goto _L8
_L7:
        if (_bindings.containsKey(s1)) goto _L10; else goto _L9
_L4:
        type = (Class)type.getRawType();
_L22:
        _resolveBindings(type.getGenericSuperclass());
        type = type.getGenericInterfaces();
        int k = type.length;
        i = ((flag) ? 1 : 0);
        while (i < k) 
        {
            _resolveBindings(type[i]);
            i++;
        }
        if (true) goto _L1; else goto _L11
_L11:
        if (!(type instanceof Class)) goto _L1; else goto _L12
_L12:
        Class class1;
        TypeVariable atypevariable1[];
        class1 = (Class)type;
        type = class1.getDeclaringClass();
        if (type != null && !type.isAssignableFrom(class1))
        {
            _resolveBindings(((Type) (class1.getDeclaringClass())));
        }
        atypevariable1 = class1.getTypeParameters();
        if (atypevariable1 == null || atypevariable1.length <= 0) goto _L14; else goto _L13
_L13:
        Object obj = null;
        type = obj;
        if (_contextType != null)
        {
            type = obj;
            if (class1.isAssignableFrom(_contextType.getRawClass()))
            {
                type = _typeFactory.findTypeParameters(_contextType, class1);
            }
        }
        i = 0;
_L20:
        if (i >= atypevariable1.length) goto _L14; else goto _L15
_L15:
        String s;
        Object obj1;
        obj1 = atypevariable1[i];
        s = ((TypeVariable) (obj1)).getName();
        obj1 = ((TypeVariable) (obj1)).getBounds()[0];
        if (obj1 == null) goto _L17; else goto _L16
_L16:
        if (_bindings != null) goto _L19; else goto _L18
_L18:
        _bindings = new LinkedHashMap();
_L21:
        _addPlaceholder(s);
        if (type != null && type.length > i)
        {
            _bindings.put(s, type[i]);
        } else
        {
            _bindings.put(s, _typeFactory._constructType(((Type) (obj1)), this));
        }
_L17:
        i++;
          goto _L20
_L19:
        if (_bindings.containsKey(s)) goto _L17; else goto _L21
_L14:
        type = class1;
          goto _L22
    }

    public void addBinding(String s, JavaType javatype)
    {
        if (_bindings == null || _bindings.size() == 0)
        {
            _bindings = new LinkedHashMap();
        }
        _bindings.put(s, javatype);
    }

    public TypeBindings childInstance()
    {
        return new TypeBindings(_typeFactory, this, _contextClass, _contextType);
    }

    public JavaType findType(String s)
    {
        if (_bindings == null)
        {
            _resolve();
        }
        Object obj = (JavaType)_bindings.get(s);
        if (obj != null)
        {
            return ((JavaType) (obj));
        }
        if (_placeholders != null && _placeholders.contains(s))
        {
            return UNBOUND;
        }
        if (_parentBindings != null)
        {
            return _parentBindings.findType(s);
        }
        if (_contextClass != null && _contextClass.getEnclosingClass() != null && !Modifier.isStatic(_contextClass.getModifiers()))
        {
            return UNBOUND;
        }
        if (_contextClass != null)
        {
            obj = _contextClass.getName();
        } else
        if (_contextType != null)
        {
            obj = _contextType.toString();
        } else
        {
            obj = "UNKNOWN";
        }
        throw new IllegalArgumentException((new StringBuilder("Type variable '")).append(s).append("' can not be resolved (with context of class ").append(((String) (obj))).append(")").toString());
    }

    public JavaType resolveType(Type type)
    {
        return _typeFactory._constructType(type, this);
    }

    public String toString()
    {
        if (_bindings == null)
        {
            _resolve();
        }
        StringBuilder stringbuilder = new StringBuilder("[TypeBindings for ");
        if (_contextType != null)
        {
            stringbuilder.append(_contextType.toString());
        } else
        {
            stringbuilder.append(_contextClass.getName());
        }
        stringbuilder.append(": ").append(_bindings).append("]");
        return stringbuilder.toString();
    }

    public JavaType[] typesAsArray()
    {
        if (_bindings == null)
        {
            _resolve();
        }
        if (_bindings.size() == 0)
        {
            return NO_TYPES;
        } else
        {
            return (JavaType[])_bindings.values().toArray(new JavaType[_bindings.size()]);
        }
    }

}

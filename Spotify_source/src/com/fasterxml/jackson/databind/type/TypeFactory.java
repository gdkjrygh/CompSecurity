// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            SimpleType, TypeParser, CollectionType, MapType, 
//            HierarchicType, TypeModifier, ArrayType, ClassKey, 
//            TypeBindings

public final class TypeFactory
    implements Serializable
{

    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_STRING = new SimpleType(java/lang/String);
    private static final JavaType NO_TYPES[] = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    private static final long serialVersionUID = 1L;
    protected transient HierarchicType _cachedArrayListType;
    protected transient HierarchicType _cachedHashMapType;
    protected final TypeModifier _modifiers[] = null;
    protected final TypeParser _parser = new TypeParser(this);
    protected final LRUMap _typeCache = new LRUMap(16, 100);

    private TypeFactory()
    {
    }

    private JavaType _collectionType(Class class1)
    {
        JavaType ajavatype[] = findTypeParameters(class1, java/util/Collection);
        if (ajavatype == null)
        {
            return CollectionType.construct(class1, _unknownType());
        }
        if (ajavatype.length != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("Strange Collection type ")).append(class1.getName()).append(": can not determine type parameters").toString());
        } else
        {
            return CollectionType.construct(class1, ajavatype[0]);
        }
    }

    private JavaType _mapType(Class class1)
    {
        JavaType ajavatype[] = findTypeParameters(class1, java/util/Map);
        if (ajavatype == null)
        {
            return MapType.construct(class1, _unknownType(), _unknownType());
        }
        if (ajavatype.length != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Strange Map type ")).append(class1.getName()).append(": can not determine type parameters").toString());
        } else
        {
            return MapType.construct(class1, ajavatype[0], ajavatype[1]);
        }
    }

    public static TypeFactory defaultInstance()
    {
        return instance;
    }

    public static JavaType unknownType()
    {
        return defaultInstance()._unknownType();
    }

    protected final HierarchicType _arrayListSuperInterfaceChain(HierarchicType hierarchictype)
    {
        this;
        JVM INSTR monitorenter ;
        if (_cachedArrayListType == null)
        {
            HierarchicType hierarchictype1 = hierarchictype.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(hierarchictype1, java/util/List);
            _cachedArrayListType = hierarchictype1.getSuperType();
        }
        HierarchicType hierarchictype2 = _cachedArrayListType.deepCloneWithoutSubtype();
        hierarchictype.setSuperType(hierarchictype2);
        hierarchictype2.setSubType(hierarchictype);
        this;
        JVM INSTR monitorexit ;
        return hierarchictype;
        hierarchictype;
        throw hierarchictype;
    }

    protected final JavaType _constructType(Type type, TypeBindings typebindings)
    {
        if (!(type instanceof Class)) goto _L2; else goto _L1
_L1:
        JavaType javatype = _fromClass((Class)type, typebindings);
_L4:
        JavaType javatype1;
        javatype1 = javatype;
        if (_modifiers != null)
        {
            javatype1 = javatype;
            if (!javatype.isContainerType())
            {
                TypeModifier atypemodifier[] = _modifiers;
                int j = atypemodifier.length;
                int i = 0;
                do
                {
                    javatype1 = javatype;
                    if (i >= j)
                    {
                        break;
                    }
                    javatype = atypemodifier[i].modifyType(javatype, type, typebindings, this);
                    i++;
                } while (true);
            }
        }
        break MISSING_BLOCK_LABEL_216;
_L2:
        if (type instanceof ParameterizedType)
        {
            javatype = _fromParamType((ParameterizedType)type, typebindings);
            continue; /* Loop/switch isn't completed */
        }
        if (type instanceof JavaType)
        {
            return (JavaType)type;
        }
        if (type instanceof GenericArrayType)
        {
            javatype = _fromArrayType((GenericArrayType)type, typebindings);
            continue; /* Loop/switch isn't completed */
        }
        if (type instanceof TypeVariable)
        {
            javatype = _fromVariable((TypeVariable)type, typebindings);
            continue; /* Loop/switch isn't completed */
        }
        if (!(type instanceof WildcardType))
        {
            break; /* Loop/switch isn't completed */
        }
        javatype = _fromWildcard((WildcardType)type, typebindings);
        if (true) goto _L4; else goto _L3
_L3:
        typebindings = new StringBuilder("Unrecognized Type: ");
        if (type == null)
        {
            type = "[null]";
        } else
        {
            type = type.toString();
        }
        throw new IllegalArgumentException(typebindings.append(type).toString());
        return javatype1;
    }

    protected final HierarchicType _doFindSuperInterfaceChain(HierarchicType hierarchictype, Class class1)
    {
        Object obj = hierarchictype.getRawClass();
        Type atype[] = ((Class) (obj)).getGenericInterfaces();
        if (atype != null)
        {
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                HierarchicType hierarchictype1 = _findSuperInterfaceChain(atype[i], class1);
                if (hierarchictype1 != null)
                {
                    hierarchictype1.setSubType(hierarchictype);
                    hierarchictype.setSuperType(hierarchictype1);
                    return hierarchictype;
                }
            }

        }
        obj = ((Class) (obj)).getGenericSuperclass();
        if (obj != null)
        {
            class1 = _findSuperInterfaceChain(((Type) (obj)), class1);
            if (class1 != null)
            {
                class1.setSubType(hierarchictype);
                hierarchictype.setSuperType(class1);
                return hierarchictype;
            }
        }
        return null;
    }

    protected final HierarchicType _findSuperClassChain(Type type, Class class1)
    {
        type = new HierarchicType(type);
        Object obj = type.getRawClass();
        if (obj == class1)
        {
            return type;
        }
        obj = ((Class) (obj)).getGenericSuperclass();
        if (obj != null)
        {
            class1 = _findSuperClassChain(((Type) (obj)), class1);
            if (class1 != null)
            {
                class1.setSubType(type);
                type.setSuperType(class1);
                return type;
            }
        }
        return null;
    }

    protected final HierarchicType _findSuperInterfaceChain(Type type, Class class1)
    {
        HierarchicType hierarchictype = new HierarchicType(type);
        Class class2 = hierarchictype.getRawClass();
        if (class2 == class1)
        {
            return new HierarchicType(type);
        }
        if (class2 == java/util/HashMap && class1 == java/util/Map)
        {
            return _hashMapSuperInterfaceChain(hierarchictype);
        }
        if (class2 == java/util/ArrayList && class1 == java/util/List)
        {
            return _arrayListSuperInterfaceChain(hierarchictype);
        } else
        {
            return _doFindSuperInterfaceChain(hierarchictype, class1);
        }
    }

    protected final HierarchicType _findSuperTypeChain(Class class1, Class class2)
    {
        if (class2.isInterface())
        {
            return _findSuperInterfaceChain(class1, class2);
        } else
        {
            return _findSuperClassChain(class1, class2);
        }
    }

    protected final JavaType _fromArrayType(GenericArrayType genericarraytype, TypeBindings typebindings)
    {
        return ArrayType.construct(_constructType(genericarraytype.getGenericComponentType(), typebindings), null, null);
    }

    protected final JavaType _fromClass(Class class1, TypeBindings typebindings)
    {
        if (class1 == java/lang/String)
        {
            typebindings = CORE_TYPE_STRING;
        } else
        {
            if (class1 == Boolean.TYPE)
            {
                return CORE_TYPE_BOOL;
            }
            if (class1 == Integer.TYPE)
            {
                return CORE_TYPE_INT;
            }
            if (class1 == Long.TYPE)
            {
                return CORE_TYPE_LONG;
            }
            ClassKey classkey = new ClassKey(class1);
            JavaType javatype = (JavaType)_typeCache.get(classkey);
            typebindings = javatype;
            if (javatype == null)
            {
                if (class1.isArray())
                {
                    class1 = ArrayType.construct(_constructType(class1.getComponentType(), null), null, null);
                } else
                if (class1.isEnum())
                {
                    class1 = new SimpleType(class1);
                } else
                if (java/util/Map.isAssignableFrom(class1))
                {
                    class1 = _mapType(class1);
                } else
                if (java/util/Collection.isAssignableFrom(class1))
                {
                    class1 = _collectionType(class1);
                } else
                {
                    class1 = new SimpleType(class1);
                }
                _typeCache.put(classkey, class1);
                return class1;
            }
        }
        return typebindings;
    }

    protected final JavaType _fromParamType(ParameterizedType parameterizedtype, TypeBindings typebindings)
    {
        Class class1;
        Type atype[];
        int i;
        class1 = (Class)parameterizedtype.getRawType();
        atype = parameterizedtype.getActualTypeArguments();
        if (atype == null)
        {
            i = 0;
        } else
        {
            i = atype.length;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        parameterizedtype = NO_TYPES;
_L4:
        if (java/util/Map.isAssignableFrom(class1))
        {
            parameterizedtype = findTypeParameters(constructSimpleType(class1, parameterizedtype), java/util/Map);
            JavaType ajavatype[];
            int j;
            if (parameterizedtype.length != 2)
            {
                throw new IllegalArgumentException((new StringBuilder("Could not find 2 type parameters for Map class ")).append(class1.getName()).append(" (found ").append(parameterizedtype.length).append(")").toString());
            } else
            {
                return MapType.construct(class1, parameterizedtype[0], parameterizedtype[1]);
            }
        }
        break MISSING_BLOCK_LABEL_173;
_L2:
        ajavatype = new JavaType[i];
        j = 0;
        do
        {
            parameterizedtype = ajavatype;
            if (j >= i)
            {
                break;
            }
            ajavatype[j] = _constructType(atype[j], typebindings);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if (java/util/Collection.isAssignableFrom(class1))
        {
            parameterizedtype = findTypeParameters(constructSimpleType(class1, parameterizedtype), java/util/Collection);
            if (parameterizedtype.length != 1)
            {
                throw new IllegalArgumentException((new StringBuilder("Could not find 1 type parameter for Collection class ")).append(class1.getName()).append(" (found ").append(parameterizedtype.length).append(")").toString());
            } else
            {
                return CollectionType.construct(class1, parameterizedtype[0]);
            }
        }
        if (i == 0)
        {
            return new SimpleType(class1);
        } else
        {
            return constructSimpleType(class1, parameterizedtype);
        }
    }

    protected final JavaType _fromParameterizedClass(Class class1, List list)
    {
        if (class1.isArray())
        {
            return ArrayType.construct(_constructType(class1.getComponentType(), null), null, null);
        }
        if (class1.isEnum())
        {
            return new SimpleType(class1);
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (list.size() > 0)
            {
                JavaType javatype = (JavaType)list.get(0);
                if (list.size() >= 2)
                {
                    list = (JavaType)list.get(1);
                } else
                {
                    list = _unknownType();
                }
                return MapType.construct(class1, javatype, list);
            } else
            {
                return _mapType(class1);
            }
        }
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (list.size() > 0)
            {
                return CollectionType.construct(class1, (JavaType)list.get(0));
            } else
            {
                return _collectionType(class1);
            }
        }
        if (list.size() == 0)
        {
            return new SimpleType(class1);
        } else
        {
            return constructSimpleType(class1, (JavaType[])list.toArray(new JavaType[list.size()]));
        }
    }

    protected final JavaType _fromVariable(TypeVariable typevariable, TypeBindings typebindings)
    {
        JavaType javatype;
        if (typebindings == null)
        {
            javatype = _unknownType();
        } else
        {
            String s = typevariable.getName();
            JavaType javatype1 = typebindings.findType(s);
            javatype = javatype1;
            if (javatype1 == null)
            {
                typevariable = typevariable.getBounds();
                typebindings._addPlaceholder(s);
                return _constructType(typevariable[0], typebindings);
            }
        }
        return javatype;
    }

    protected final JavaType _fromWildcard(WildcardType wildcardtype, TypeBindings typebindings)
    {
        return _constructType(wildcardtype.getUpperBounds()[0], typebindings);
    }

    protected final HierarchicType _hashMapSuperInterfaceChain(HierarchicType hierarchictype)
    {
        this;
        JVM INSTR monitorenter ;
        if (_cachedHashMapType == null)
        {
            HierarchicType hierarchictype1 = hierarchictype.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(hierarchictype1, java/util/Map);
            _cachedHashMapType = hierarchictype1.getSuperType();
        }
        HierarchicType hierarchictype2 = _cachedHashMapType.deepCloneWithoutSubtype();
        hierarchictype.setSuperType(hierarchictype2);
        hierarchictype2.setSubType(hierarchictype);
        this;
        JVM INSTR monitorexit ;
        return hierarchictype;
        hierarchictype;
        throw hierarchictype;
    }

    protected final JavaType _unknownType()
    {
        return new SimpleType(java/lang/Object);
    }

    public final CollectionType constructCollectionType(Class class1, JavaType javatype)
    {
        return CollectionType.construct(class1, javatype);
    }

    public final CollectionType constructCollectionType(Class class1, Class class2)
    {
        return CollectionType.construct(class1, constructType(class2));
    }

    public final JavaType constructFromCanonical(String s)
    {
        return _parser.parse(s);
    }

    public final MapType constructMapType(Class class1, JavaType javatype, JavaType javatype1)
    {
        return MapType.construct(class1, javatype, javatype1);
    }

    public final MapType constructMapType(Class class1, Class class2, Class class3)
    {
        return MapType.construct(class1, constructType(class2), constructType(class3));
    }

    public final JavaType constructSimpleType(Class class1, JavaType ajavatype[])
    {
        TypeVariable atypevariable[] = class1.getTypeParameters();
        if (atypevariable.length != ajavatype.length)
        {
            throw new IllegalArgumentException((new StringBuilder("Parameter type mismatch for ")).append(class1.getName()).append(": expected ").append(atypevariable.length).append(" parameters, was given ").append(ajavatype.length).toString());
        }
        String as[] = new String[atypevariable.length];
        int j = atypevariable.length;
        for (int i = 0; i < j; i++)
        {
            as[i] = atypevariable[i].getName();
        }

        return new SimpleType(class1, as, ajavatype, null, null, false);
    }

    public final JavaType constructSpecializedType(JavaType javatype, Class class1)
    {
        if (javatype.getRawClass() == class1)
        {
            return javatype;
        }
        if ((javatype instanceof SimpleType) && (class1.isArray() || java/util/Map.isAssignableFrom(class1) || java/util/Collection.isAssignableFrom(class1)))
        {
            if (!javatype.getRawClass().isAssignableFrom(class1))
            {
                throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getClass().getName()).append(" not subtype of ").append(javatype).toString());
            }
            Object obj = _fromClass(class1, new TypeBindings(this, javatype.getRawClass()));
            Object obj1 = javatype.getValueHandler();
            class1 = ((Class) (obj));
            if (obj1 != null)
            {
                class1 = ((JavaType) (obj)).withValueHandler(obj1);
            }
            obj = javatype.getTypeHandler();
            javatype = class1;
            if (obj != null)
            {
                javatype = class1.withTypeHandler(obj);
            }
            return javatype;
        } else
        {
            return javatype.narrowBy(class1);
        }
    }

    public final JavaType constructType(TypeReference typereference)
    {
        return _constructType(typereference.getType(), null);
    }

    public final JavaType constructType(Type type)
    {
        return _constructType(type, null);
    }

    public final JavaType constructType(Type type, TypeBindings typebindings)
    {
        return _constructType(type, typebindings);
    }

    public final JavaType[] findTypeParameters(JavaType javatype, Class class1)
    {
        Object obj;
        int j;
        obj = javatype.getRawClass();
        if (obj != class1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = javatype.containedTypeCount();
        if (j != 0) goto _L2; else goto _L1
_L1:
        class1 = null;
_L4:
        return class1;
_L2:
        obj = new JavaType[j];
        int i = 0;
        do
        {
            class1 = ((Class) (obj));
            if (i >= j)
            {
                break;
            }
            obj[i] = javatype.containedType(i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return findTypeParameters(((Class) (obj)), class1, new TypeBindings(this, javatype));
    }

    public final JavaType[] findTypeParameters(Class class1, Class class2)
    {
        return findTypeParameters(class1, class2, new TypeBindings(this, class1));
    }

    public final JavaType[] findTypeParameters(Class class1, Class class2, TypeBindings typebindings)
    {
        HierarchicType hierarchictype;
        HierarchicType hierarchictype1 = _findSuperTypeChain(class1, class2);
        hierarchictype = hierarchictype1;
        if (hierarchictype1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getName()).append(" is not a subtype of ").append(class2.getName()).toString());
        }
_L4:
        if (hierarchictype.getSuperType() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        hierarchictype = hierarchictype.getSuperType();
        Class class3 = hierarchictype.getRawClass();
        class1 = new TypeBindings(this, class3);
        if (hierarchictype.isGeneric())
        {
            class2 = hierarchictype.asGeneric().getActualTypeArguments();
            TypeVariable atypevariable[] = class3.getTypeParameters();
            int j = class2.length;
            int i = 0;
            while (i < j) 
            {
                class1.addBinding(atypevariable[i].getName(), _constructType(class2[i], typebindings));
                i++;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        typebindings = class1;
        if (true) goto _L4; else goto _L3
_L3:
        if (!hierarchictype.isGeneric())
        {
            return null;
        } else
        {
            return typebindings.typesAsArray();
        }
    }

    public final JavaType uncheckedSimpleType(Class class1)
    {
        return new SimpleType(class1);
    }

    static 
    {
        CORE_TYPE_BOOL = new SimpleType(Boolean.TYPE);
        CORE_TYPE_INT = new SimpleType(Integer.TYPE);
        CORE_TYPE_LONG = new SimpleType(Long.TYPE);
    }
}

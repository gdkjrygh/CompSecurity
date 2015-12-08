// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.api.client.json:
//            JsonPolymorphicTypeMap, GenericJson, JsonToken, CustomizeJsonParser, 
//            JsonFactory, JsonString

public abstract class JsonParser
{

    private static WeakHashMap cachedTypemapFields = new WeakHashMap();
    private static final Lock lock = new ReentrantLock();

    public JsonParser()
    {
    }

    private static Field getCachedTypemapFieldFor(Class class1)
    {
        if (class1 == null)
        {
            return null;
        }
        lock.lock();
        if (!cachedTypemapFields.containsKey(class1))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        class1 = (Field)cachedTypemapFields.get(class1);
        lock.unlock();
        return class1;
        Object obj = null;
        Iterator iterator = ClassInfo.of(class1).getFieldInfos().iterator();
_L2:
        boolean flag;
        Field field;
        JsonPolymorphicTypeMap jsonpolymorphictypemap;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_238;
            }
            field = ((FieldInfo)iterator.next()).getField();
            jsonpolymorphictypemap = (JsonPolymorphicTypeMap)field.getAnnotation(com/google/api/client/json/JsonPolymorphicTypeMap);
        } while (jsonpolymorphictypemap == null);
        JsonPolymorphicTypeMap.TypeDef atypedef[];
        HashSet hashset;
        int i;
        int j;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", new Object[] {
            class1
        });
        Preconditions.checkArgument(Data.isPrimitive(field.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", new Object[] {
            class1, field.getType()
        });
        atypedef = jsonpolymorphictypemap.typeDefinitions();
        hashset = Sets.newHashSet();
        if (atypedef.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
        j = atypedef.length;
        i = 0;
_L3:
        obj = field;
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = atypedef[i];
        Preconditions.checkArgument(hashset.add(((JsonPolymorphicTypeMap.TypeDef) (obj)).key()), "Class contains two @TypeDef annotations with identical key: %s", new Object[] {
            ((JsonPolymorphicTypeMap.TypeDef) (obj)).key()
        });
        i++;
          goto _L3
        cachedTypemapFields.put(class1, obj);
        lock.unlock();
        return ((Field) (obj));
        class1;
        lock.unlock();
        throw class1;
    }

    private void parse(ArrayList arraylist, Object obj, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        Object obj1;
        Object obj2;
        ClassInfo classinfo;
        Class class1;
        boolean flag;
        if (obj instanceof GenericJson)
        {
            ((GenericJson)obj).setFactory(getFactory());
        }
        obj2 = startParsingObjectOrArray();
        class1 = obj.getClass();
        classinfo = ClassInfo.of(class1);
        flag = com/google/api/client/util/GenericData.isAssignableFrom(class1);
        obj1 = obj2;
        if (flag) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (!java/util/Map.isAssignableFrom(class1)) goto _L2; else goto _L3
_L3:
        parseMap(null, (Map)obj, Types.getMapValueParameter(class1), arraylist, customizejsonparser);
_L5:
        return;
_L6:
label0:
        {
            obj1 = classinfo.getFieldInfo(((String) (obj2)));
            if (obj1 == null)
            {
                break label0;
            }
            if (((FieldInfo) (obj1)).isFinal() && !((FieldInfo) (obj1)).isPrimitive())
            {
                throw new IllegalArgumentException("final array/object fields are not supported");
            }
        }
        obj2 = ((FieldInfo) (obj1)).getField();
        i = arraylist.size();
        arraylist.add(((Field) (obj2)).getGenericType());
        obj2 = parseValue(((Field) (obj2)), ((FieldInfo) (obj1)).getGenericType(), arraylist, obj, customizejsonparser, true);
        arraylist.remove(i);
        ((FieldInfo) (obj1)).setValue(obj, obj2);
_L7:
        obj1 = nextToken();
_L2:
        if (obj1 != JsonToken.FIELD_NAME) goto _L5; else goto _L4
_L4:
        obj2 = getText();
        nextToken();
        if (customizejsonparser != null && customizejsonparser.stopAt(obj, ((String) (obj2)))) goto _L5; else goto _L6
        if (flag)
        {
            ((GenericData)obj).set(((String) (obj2)), parseValue(null, null, arraylist, obj, customizejsonparser, true));
        } else
        {
            if (customizejsonparser != null)
            {
                customizejsonparser.handleUnrecognizedKey(obj, ((String) (obj2)));
            }
            skipChildren();
        }
          goto _L7
    }

    private void parseArray(Field field, Collection collection, Type type, ArrayList arraylist, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        for (JsonToken jsontoken = startParsingObjectOrArray(); jsontoken != JsonToken.END_ARRAY; jsontoken = nextToken())
        {
            collection.add(parseValue(field, type, arraylist, collection, customizejsonparser, true));
        }

    }

    private void parseMap(Field field, Map map, Type type, ArrayList arraylist, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        Object obj = startParsingObjectOrArray();
        do
        {
label0:
            {
                if (obj == JsonToken.FIELD_NAME)
                {
                    obj = getText();
                    nextToken();
                    if (customizejsonparser == null || !customizejsonparser.stopAt(map, ((String) (obj))))
                    {
                        break label0;
                    }
                }
                return;
            }
            map.put(obj, parseValue(field, type, arraylist, map, customizejsonparser, true));
            obj = nextToken();
        } while (true);
    }

    private final Object parseValue(Field field, Type type, ArrayList arraylist, Object obj, CustomizeJsonParser customizejsonparser, boolean flag)
        throws IOException
    {
        Object obj1;
        Type type1;
        type1 = Data.resolveWildcardTypeOrTypeVariable(arraylist, type);
        if (type1 instanceof Class)
        {
            type = (Class)type1;
        } else
        {
            type = null;
        }
        obj1 = type;
        if (type1 instanceof ParameterizedType)
        {
            obj1 = Types.getRawClass((ParameterizedType)type1);
        }
        if (obj1 != java/lang/Void) goto _L2; else goto _L1
_L1:
        skipChildren();
        obj = null;
_L42:
        return obj;
_L2:
        type = getCurrentToken();
        static class _cls1
        {

            static final int $SwitchMap$com$google$api$client$json$JsonToken[];

            static 
            {
                $SwitchMap$com$google$api$client$json$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_OBJECT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.api.client.json.JsonToken[getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 11: default 1253
    //                   1 414
    //                   2 243
    //                   3 243
    //                   4 414
    //                   5 414
    //                   6 806
    //                   7 806
    //                   8 870
    //                   9 870
    //                   10 1102
    //                   11 1153;
           goto _L3 _L4 _L5 _L5 _L4 _L4 _L6 _L6 _L7 _L7 _L8 _L9
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("unexpected JSON node type: ").append(type).toString());
_L5:
        boolean flag1;
        try
        {
            flag1 = Types.isArray(type1);
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            arraylist = new StringBuilder();
            obj = getCurrentName();
            if (obj != null)
            {
                arraylist.append("key ").append(((String) (obj)));
            }
            if (field != null)
            {
                if (obj != null)
                {
                    arraylist.append(", ");
                }
                arraylist.append("field ").append(field);
            }
            throw new IllegalArgumentException(arraylist.toString(), type);
        }
        if (type1 == null || flag1) goto _L11; else goto _L10
_L10:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        if (!Types.isAssignableToOrFrom(((Class) (obj1)), java/util/Collection)) goto _L13; else goto _L11
_L88:
        Preconditions.checkArgument(flag, "expected collection or array type but got %s", new Object[] {
            type1
        });
        Object obj2 = null;
        type = obj2;
        if (customizejsonparser == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        type = obj2;
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        type = customizejsonparser.newInstanceForArray(obj, field);
        obj = type;
        if (type != null) goto _L15; else goto _L14
_L14:
        obj = Data.newCollectionInstance(type1);
_L15:
        Object obj3 = null;
        if (!flag1) goto _L17; else goto _L16
_L16:
        type = Types.getArrayComponentType(type1);
_L21:
        type = Data.resolveWildcardTypeOrTypeVariable(arraylist, type);
        parseArray(field, ((Collection) (obj)), type, arraylist, customizejsonparser);
        if (!flag1) goto _L19; else goto _L18
_L18:
        return Types.toArray(((Collection) (obj)), Types.getRawArrayComponentType(arraylist, type));
_L17:
        type = ((Type) (obj3));
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        type = ((Type) (obj3));
        if (!java/lang/Iterable.isAssignableFrom(((Class) (obj1)))) goto _L21; else goto _L22
_L22:
        type = Types.getIterableParameter(type1);
          goto _L21
_L4:
        int i;
        int j;
        if (!Types.isArray(type1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "expected object or map type but got %s", new Object[] {
            type1
        });
        if (!flag) goto _L24; else goto _L23
_L23:
        obj3 = getCachedTypemapFieldFor(((Class) (obj1)));
_L89:
        Object obj4 = null;
        type = obj4;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        type = obj4;
        if (customizejsonparser == null)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        type = ((Type) (customizejsonparser.newInstanceForObject(obj, ((Class) (obj1)))));
        if (obj1 == null) goto _L26; else goto _L25
_L25:
        if (!Types.isAssignableToOrFrom(((Class) (obj1)), java/util/Map)) goto _L26; else goto _L27
_L27:
        i = 1;
_L90:
        if (obj3 == null) goto _L29; else goto _L28
_L28:
        type = new GenericJson();
_L38:
        j = arraylist.size();
        if (type1 == null) goto _L31; else goto _L30
_L30:
        arraylist.add(type1);
_L31:
        if (i == 0) goto _L33; else goto _L32
_L32:
        if (com/google/api/client/util/GenericData.isAssignableFrom(((Class) (obj1)))) goto _L33; else goto _L34
_L34:
        if (!java/util/Map.isAssignableFrom(((Class) (obj1)))) goto _L36; else goto _L35
_L35:
        obj = Types.getMapValueParameter(type1);
_L94:
        if (obj == null) goto _L33; else goto _L37
_L37:
        parseMap(field, (Map)type, ((Type) (obj)), arraylist, customizejsonparser);
        return type;
_L92:
        type = Data.newMapInstance(((Class) (obj1)));
          goto _L38
_L93:
        type = ((Type) (Types.newInstance(((Class) (obj1)))));
          goto _L38
_L33:
        parse(arraylist, type, customizejsonparser);
        if (type1 == null) goto _L40; else goto _L39
_L39:
        arraylist.remove(j);
_L40:
        obj = type;
        if (obj3 == null) goto _L42; else goto _L41
_L41:
        obj = ((GenericJson)type).get(((Field) (obj3)).getName());
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "No value specified for @JsonPolymorphicTypeMap field");
        obj1 = obj.toString();
        obj = (JsonPolymorphicTypeMap)((Field) (obj3)).getAnnotation(com/google/api/client/json/JsonPolymorphicTypeMap);
        customizejsonparser = null;
        obj3 = ((JsonPolymorphicTypeMap) (obj)).typeDefinitions();
        j = obj3.length;
        i = 0;
_L96:
        obj = customizejsonparser;
        if (i >= j) goto _L44; else goto _L43
_L43:
        obj = obj3[i];
        if (!((JsonPolymorphicTypeMap.TypeDef) (obj)).key().equals(obj1)) goto _L46; else goto _L45
_L45:
        obj = ((JsonPolymorphicTypeMap.TypeDef) (obj)).ref();
          goto _L44
_L95:
        Preconditions.checkArgument(flag, (new StringBuilder()).append("No TypeDef annotation found with key: ").append(((String) (obj1))).toString());
        customizejsonparser = getFactory();
        type = customizejsonparser.createJsonParser(customizejsonparser.toString(type));
        type.startParsing();
        return type.parseValue(field, ((Type) (obj)), arraylist, null, null, false);
_L6:
        if (type1 == null) goto _L48; else goto _L47
_L47:
        if (obj1 == Boolean.TYPE) goto _L48; else goto _L49
_L49:
        if (obj1 == null) goto _L51; else goto _L50
_L50:
        if (!((Class) (obj1)).isAssignableFrom(java/lang/Boolean)) goto _L51; else goto _L48
_L97:
        Preconditions.checkArgument(flag, "expected type Boolean or boolean but got %s", new Object[] {
            type1
        });
        if (type == JsonToken.VALUE_TRUE)
        {
            return Boolean.TRUE;
        } else
        {
            return Boolean.FALSE;
        }
_L7:
        if (field == null) goto _L53; else goto _L52
_L52:
        if (field.getAnnotation(com/google/api/client/json/JsonString) != null) goto _L54; else goto _L53
_L98:
        Preconditions.checkArgument(flag, "number type formatted as a JSON number cannot use @JsonString annotation");
        if (obj1 == null) goto _L56; else goto _L55
_L55:
        if (!((Class) (obj1)).isAssignableFrom(java/math/BigDecimal)) goto _L57; else goto _L56
_L56:
        return getDecimalValue();
_L57:
        if (obj1 != java/math/BigInteger) goto _L59; else goto _L58
_L58:
        return getBigIntegerValue();
_L59:
        if (obj1 == java/lang/Double) goto _L61; else goto _L60
_L60:
        if (obj1 != Double.TYPE) goto _L62; else goto _L61
_L61:
        return Double.valueOf(getDoubleValue());
_L62:
        if (obj1 == java/lang/Long) goto _L64; else goto _L63
_L63:
        if (obj1 != Long.TYPE) goto _L65; else goto _L64
_L64:
        return Long.valueOf(getLongValue());
_L65:
        if (obj1 == java/lang/Float) goto _L67; else goto _L66
_L66:
        if (obj1 != Float.TYPE) goto _L68; else goto _L67
_L67:
        return Float.valueOf(getFloatValue());
_L68:
        if (obj1 == java/lang/Integer) goto _L70; else goto _L69
_L69:
        if (obj1 != Integer.TYPE) goto _L71; else goto _L70
_L70:
        return Integer.valueOf(getIntValue());
_L71:
        if (obj1 == java/lang/Short) goto _L73; else goto _L72
_L72:
        if (obj1 != Short.TYPE) goto _L74; else goto _L73
_L73:
        return Short.valueOf(getShortValue());
_L74:
        if (obj1 == java/lang/Byte) goto _L76; else goto _L75
_L75:
        if (obj1 != Byte.TYPE) goto _L77; else goto _L76
_L76:
        return Byte.valueOf(getByteValue());
_L77:
        throw new IllegalArgumentException((new StringBuilder()).append("expected numeric type but got ").append(type1).toString());
_L8:
        if (obj1 == null) goto _L79; else goto _L78
_L78:
        if (!java/lang/Number.isAssignableFrom(((Class) (obj1)))) goto _L79; else goto _L80
_L80:
        if (field == null) goto _L82; else goto _L81
_L81:
        if (field.getAnnotation(com/google/api/client/json/JsonString) == null) goto _L82; else goto _L79
_L99:
        Preconditions.checkArgument(flag, "number field formatted as a JSON string must use the @JsonString annotation");
        return Data.parsePrimitiveValue(type1, getText());
_L9:
        if (obj1 == null) goto _L84; else goto _L83
_L83:
        if (((Class) (obj1)).isPrimitive()) goto _L85; else goto _L84
_L100:
        Preconditions.checkArgument(flag, "primitive number field but found a JSON null");
        if (obj1 == null) goto _L87; else goto _L86
_L86:
        if ((((Class) (obj1)).getModifiers() & 0x600) != 0)
        {
            if (Types.isAssignableToOrFrom(((Class) (obj1)), java/util/Collection))
            {
                return Data.nullOf(Data.newCollectionInstance(type1).getClass());
            }
            if (Types.isAssignableToOrFrom(((Class) (obj1)), java/util/Map))
            {
                return Data.nullOf(Data.newMapInstance(((Class) (obj1))).getClass());
            }
        }
_L87:
        type = ((Type) (Data.nullOf(Types.getRawArrayComponentType(arraylist, type1))));
        return type;
_L11:
        flag = true;
          goto _L88
_L13:
        flag = false;
          goto _L88
_L19:
        return obj;
_L24:
        obj3 = null;
          goto _L89
_L26:
        i = 0;
          goto _L90
_L29:
        if (type != null) goto _L38; else goto _L91
_L91:
        if (i == 0 && obj1 != null) goto _L93; else goto _L92
_L36:
        obj = null;
          goto _L94
_L44:
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L95
_L46:
        i++;
          goto _L96
_L48:
        flag = true;
          goto _L97
_L51:
        flag = false;
          goto _L97
_L53:
        flag = true;
          goto _L98
_L54:
        flag = false;
          goto _L98
_L79:
        flag = true;
          goto _L99
_L82:
        flag = false;
          goto _L99
_L84:
        flag = true;
          goto _L100
_L85:
        flag = false;
          goto _L100
    }

    private JsonToken startParsing()
        throws IOException
    {
        JsonToken jsontoken1 = getCurrentToken();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == null)
        {
            jsontoken = nextToken();
        }
        boolean flag;
        if (jsontoken != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "no JSON input found");
        return jsontoken;
    }

    private JsonToken startParsingObjectOrArray()
        throws IOException
    {
        JsonToken jsontoken = startParsing();
        switch (_cls1..SwitchMap.com.google.api.client.json.JsonToken[jsontoken.ordinal()])
        {
        default:
            return jsontoken;

        case 1: // '\001'
            JsonToken jsontoken1 = nextToken();
            boolean flag;
            if (jsontoken1 == JsonToken.FIELD_NAME || jsontoken1 == JsonToken.END_OBJECT)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, jsontoken1);
            return jsontoken1;

        case 2: // '\002'
            return nextToken();
        }
    }

    public abstract void close()
        throws IOException;

    public abstract BigInteger getBigIntegerValue()
        throws IOException;

    public abstract byte getByteValue()
        throws IOException;

    public abstract String getCurrentName()
        throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue()
        throws IOException;

    public abstract double getDoubleValue()
        throws IOException;

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue()
        throws IOException;

    public abstract int getIntValue()
        throws IOException;

    public abstract long getLongValue()
        throws IOException;

    public abstract short getShortValue()
        throws IOException;

    public abstract String getText()
        throws IOException;

    public abstract JsonToken nextToken()
        throws IOException;

    public final Object parse(Class class1)
        throws IOException
    {
        return parse(class1, ((CustomizeJsonParser) (null)));
    }

    public final Object parse(Class class1, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        return parse(((Type) (class1)), false, customizejsonparser);
    }

    public Object parse(Type type, boolean flag)
        throws IOException
    {
        return parse(type, flag, null);
    }

    public Object parse(Type type, boolean flag, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        if (!java/lang/Void.equals(type))
        {
            startParsing();
        }
        type = ((Type) (parseValue(null, type, new ArrayList(), null, customizejsonparser, true)));
        if (flag)
        {
            close();
        }
        return type;
        type;
        if (flag)
        {
            close();
        }
        throw type;
    }

    public final void parse(Object obj)
        throws IOException
    {
        parse(obj, ((CustomizeJsonParser) (null)));
    }

    public final void parse(Object obj, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(obj.getClass());
        parse(arraylist, obj, customizejsonparser);
    }

    public final Object parseAndClose(Class class1)
        throws IOException
    {
        return parseAndClose(class1, null);
    }

    public final Object parseAndClose(Class class1, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        class1 = ((Class) (parse(class1, customizejsonparser)));
        close();
        return class1;
        class1;
        close();
        throw class1;
    }

    public final void parseAndClose(Object obj)
        throws IOException
    {
        parseAndClose(obj, null);
    }

    public final void parseAndClose(Object obj, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        parse(obj, customizejsonparser);
        close();
        return;
        obj;
        close();
        throw obj;
    }

    public final Collection parseArray(Class class1, Class class2)
        throws IOException
    {
        return parseArray(class1, class2, null);
    }

    public final Collection parseArray(Class class1, Class class2, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        class1 = Data.newCollectionInstance(class1);
        parseArray(((Collection) (class1)), class2, customizejsonparser);
        return class1;
    }

    public final void parseArray(Collection collection, Class class1)
        throws IOException
    {
        parseArray(collection, class1, null);
    }

    public final void parseArray(Collection collection, Class class1, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        parseArray(null, collection, ((Type) (class1)), new ArrayList(), customizejsonparser);
    }

    public final Collection parseArrayAndClose(Class class1, Class class2)
        throws IOException
    {
        return parseArrayAndClose(class1, class2, null);
    }

    public final Collection parseArrayAndClose(Class class1, Class class2, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        class1 = parseArray(class1, class2, customizejsonparser);
        close();
        return class1;
        class1;
        close();
        throw class1;
    }

    public final void parseArrayAndClose(Collection collection, Class class1)
        throws IOException
    {
        parseArrayAndClose(collection, class1, null);
    }

    public final void parseArrayAndClose(Collection collection, Class class1, CustomizeJsonParser customizejsonparser)
        throws IOException
    {
        parseArray(collection, class1, customizejsonparser);
        close();
        return;
        collection;
        close();
        throw collection;
    }

    public abstract JsonParser skipChildren()
        throws IOException;

    public final String skipToKey(Set set)
        throws IOException
    {
        for (Object obj = startParsingObjectOrArray(); obj == JsonToken.FIELD_NAME; obj = nextToken())
        {
            obj = getText();
            nextToken();
            if (set.contains(obj))
            {
                return ((String) (obj));
            }
            skipChildren();
        }

        return null;
    }

    public final void skipToKey(String s)
        throws IOException
    {
        skipToKey(Collections.singleton(s));
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror;

import com.facebook.common.json.jsonmirror.a.a;
import com.facebook.common.json.jsonmirror.a.b;
import com.facebook.common.json.jsonmirror.a.c;
import com.facebook.common.json.jsonmirror.a.d;
import com.facebook.common.json.jsonmirror.a.f;
import com.facebook.common.json.jsonmirror.a.h;
import com.facebook.common.json.jsonmirror.a.i;
import com.facebook.common.json.jsonmirror.a.j;
import com.facebook.common.json.jsonmirror.a.l;
import com.facebook.common.w.s;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.kl;
import java.io.CharArrayWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.common.json.jsonmirror:
//            JMAutogen, e, b, c

public class g
{

    private static Class a = com/facebook/common/json/jsonmirror/g;

    public g()
    {
    }

    protected static a a(Class class1, Set set)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            a a1 = (a)set.next();
            if (a(class1, a1))
            {
                return a1;
            }
        }

        return null;
    }

    protected static Boolean a(JsonParser jsonparser, Set set)
    {
        jsonparser = jsonparser.getCurrentToken();
        if (a(com/facebook/common/json/jsonmirror/a/b, set) != null)
        {
            boolean flag;
            if (jsonparser == JsonToken.VALUE_TRUE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return new Boolean(flag);
        } else
        {
            a(((JsonToken) (jsonparser)), set);
            return null;
        }
    }

    public static Object a(JsonParser jsonparser, a a1)
    {
        java.util.HashSet hashset = kl.a();
        hashset.add(a1);
        return d(jsonparser, hashset);
    }

    public static Object a(JsonParser jsonparser, Class class1)
    {
        jsonparser = ((JsonParser) (a(jsonparser, ((a) (com.facebook.common.json.jsonmirror.JMAutogen.a(class1))))));
        boolean flag;
        if (jsonparser == null || jsonparser.getClass() == class1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.b.a.b(flag);
        return jsonparser;
    }

    protected static Object a(JsonToken jsontoken, JsonParser jsonparser, Set set)
    {
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_STRING || a(com/facebook/common/json/jsonmirror/a/i, set) == null) goto _L2; else goto _L1
_L1:
        long l1 = Long.parseLong(jsonparser.getText());
        Object obj = Long.valueOf(l1);
_L4:
        return obj;
        obj;
_L2:
        if (a(com/facebook/common/json/jsonmirror/a/d, set) == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        double d1 = Double.parseDouble(jsonparser.getText());
        return Double.valueOf(d1);
        obj;
        Object obj1;
        if ((jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_STRING) && a(com/facebook/common/json/jsonmirror/a/b, set) != null)
        {
            if (jsonparser.getText().equals("0"))
            {
                return Boolean.valueOf(false);
            }
            if (jsonparser.getText().equals("1"))
            {
                return Boolean.valueOf(true);
            }
        }
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a(com/facebook/common/json/jsonmirror/a/f, set);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.facebook.debug.b.a.b(obj instanceof f);
        obj = (f)obj;
        obj1 = ((f) (obj)).h.createJsonParser(jsonparser.getText());
        com.facebook.common.json.d.a(((JsonParser) (obj1)));
        obj1 = a(((JsonParser) (obj1)), ((f) (obj)).g);
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsontoken = a(com/facebook/common/json/jsonmirror/a/l, set);
            if (jsontoken != null)
            {
                com.facebook.debug.b.a.b(jsontoken instanceof l);
                return ((l)jsontoken).a(jsonparser.getText());
            }
        }
        a(jsonparser.getCurrentToken(), set);
        return null;
        e e1;
        e1;
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected static void a(JsonToken jsontoken, a a1)
    {
        if (!com.facebook.base.b.a())
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder("Unexpected token ");
        stringbuilder.append(jsontoken.toString());
        if (a1 != null)
        {
            stringbuilder.append("; expecting a ");
            stringbuilder.append(a1.toString());
            com.facebook.debug.log.b.e(a, stringbuilder.toString());
            return;
        } else
        {
            stringbuilder.append("; field not defined.");
            com.facebook.debug.log.b.d(a, stringbuilder.toString());
            return;
        }
    }

    protected static void a(JsonToken jsontoken, Set set)
    {
        if (!com.facebook.base.b.a())
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder("Unexpected token ");
        stringbuilder.append(jsontoken.toString());
        stringbuilder.append("; expecting one of the following: (");
        jsontoken = set.iterator();
        boolean flag = true;
        while (jsontoken.hasNext()) 
        {
            set = (a)jsontoken.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(set.toString());
        }
        stringbuilder.append(")");
        com.facebook.debug.log.b.e(a, stringbuilder.toString());
    }

    protected static boolean a(Class class1, a a1)
    {
        return class1.isInstance(a1);
    }

    public static List b(JsonParser jsonparser, Class class1)
    {
        class1 = com.facebook.common.json.jsonmirror.JMAutogen.a(class1);
        java.util.HashSet hashset = kl.a();
        hashset.add(class1);
        jsonparser = ((JsonParser) (a(jsonparser, new h(hashset))));
        boolean flag;
        if (jsonparser == null || (jsonparser instanceof List))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.b.a.b(flag);
        return (List)jsonparser;
    }

    protected static List b(JsonParser jsonparser, Set set)
    {
        Object obj = (h)a(com/facebook/common/json/jsonmirror/a/h, set);
        if (obj != null)
        {
            et et1 = es.e();
            obj = ((h) (obj)).a();
            for (set = com.facebook.common.json.d.a(jsonparser); set != JsonToken.END_ARRAY; set = com.facebook.common.json.d.a(jsonparser))
            {
                set = ((Set) (d(jsonparser, ((Set) (obj)))));
                if (set != null)
                {
                    et1.b(set);
                }
            }

            return et1.b();
        } else
        {
            a(jsonparser.getCurrentToken(), set);
            jsonparser.skipChildren();
            return null;
        }
    }

    protected static Object c(JsonParser jsonparser, Set set)
    {
        Object obj = a(com/facebook/common/json/jsonmirror/a/c, set);
        if (obj == null) goto _L2; else goto _L1
_L1:
        c c1;
        com.facebook.common.json.jsonmirror.b b1;
        c1 = (c)obj;
        b1 = c1.a();
        obj = com.facebook.common.json.d.a(jsonparser);
        set = null;
_L4:
        if (obj == JsonToken.END_OBJECT)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj == JsonToken.FIELD_NAME)
        {
            set = jsonparser.getText();
        } else
        {
label0:
            {
                com.facebook.debug.b.a.a(set);
                Object obj2 = c1.a(set);
                Object obj1;
                Object obj3;
                NumberFormatException numberformatexception;
                Object obj4;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (obj2 != null)
                {
                    obj1 = (String)((s) (obj2)).a;
                    obj2 = (a)((s) (obj2)).b;
                } else
                {
                    obj2 = null;
                    obj1 = null;
                }
                if (!a(com/facebook/common/json/jsonmirror/a/g, ((a) (obj2))))
                {
                    break label0;
                }
                if (((JsonToken) (obj)).isScalarValue())
                {
                    obj = jsonparser.getText();
                } else
                {
                    obj = new CharArrayWriter();
                    obj2 = com.facebook.common.json.c.a.createJsonGenerator(((java.io.Writer) (obj)));
                    ((JsonGenerator) (obj2)).copyCurrentStructure(jsonparser);
                    ((JsonGenerator) (obj2)).close();
                    obj = ((CharArrayWriter) (obj)).toString();
                }
                c1.a(b1, ((String) (obj1)), ((String) (obj)));
            }
        }
_L7:
        obj = com.facebook.common.json.d.a(jsonparser);
        if (true) goto _L4; else goto _L3
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT && obj != JsonToken.VALUE_STRING) goto _L6; else goto _L5
_L5:
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_STRING || !a(com/facebook/common/json/jsonmirror/a/i, ((a) (obj2))))
        {
            break MISSING_BLOCK_LABEL_1238;
        }
        c1.a(b1, ((String) (obj1)), Long.parseLong(jsonparser.getText()));
        flag = true;
_L8:
label1:
        {
            flag1 = flag;
            if (flag)
            {
                break label1;
            }
            if (obj != JsonToken.VALUE_NUMBER_INT)
            {
                flag1 = flag;
                if (obj != JsonToken.VALUE_STRING)
                {
                    break label1;
                }
            }
            flag1 = flag;
            if (a(com/facebook/common/json/jsonmirror/a/b, ((a) (obj2))))
            {
                if (jsonparser.getText().equals("0"))
                {
                    flag2 = false;
                    flag = true;
                } else
                if (jsonparser.getText().equals("1"))
                {
                    flag2 = true;
                    flag = true;
                } else
                {
                    flag2 = false;
                }
                flag1 = flag;
                if (flag)
                {
                    c1.a(b1, ((String) (obj1)), flag2);
                    flag1 = flag;
                }
            }
        }
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        flag = flag1;
        if (!a(com/facebook/common/json/jsonmirror/a/d, ((a) (obj2))))
        {
            break MISSING_BLOCK_LABEL_352;
        }
        c1.a(b1, ((String) (obj1)), Double.parseDouble(jsonparser.getText()));
        flag = true;
_L14:
        if (!flag && obj == JsonToken.VALUE_STRING && a(com/facebook/common/json/jsonmirror/a/f, ((a) (obj2))))
        {
            obj3 = (f)obj2;
            obj4 = ((f) (obj3)).h.createJsonParser(jsonparser.getText());
            com.facebook.common.json.d.a(((JsonParser) (obj4)));
            obj4 = a(((JsonParser) (obj4)), ((f) (obj3)).g);
            if (obj4 != null)
            {
                if (((f) (obj3)).g instanceof h)
                {
                    c1.a(b1, ((String) (obj1)), (List)obj4);
                    flag = true;
                } else
                if (((f) (obj3)).g instanceof c)
                {
                    c1.a(b1, ((String) (obj1)), (com.facebook.common.json.jsonmirror.b)obj4);
                    flag = true;
                } else
                if (((f) (obj3)).g instanceof j)
                {
                    c1.a(b1, ((String) (obj1)), (Map)obj4);
                    flag = true;
                }
            }
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (obj == JsonToken.VALUE_STRING)
            {
                flag1 = flag;
                if (a(com/facebook/common/json/jsonmirror/a/l, ((a) (obj2))))
                {
                    c1.a(b1, ((String) (obj1)), ((l)obj2).a(jsonparser.getText()));
                    flag1 = true;
                }
            }
        }
        if (!flag1 && !c1.b())
        {
            a(jsonparser.getCurrentToken(), ((a) (obj2)));
        }
          goto _L7
        obj3;
        flag = false;
          goto _L8
_L6:
        if (obj == JsonToken.VALUE_TRUE || obj == JsonToken.VALUE_FALSE)
        {
            if (a(com/facebook/common/json/jsonmirror/a/b, ((a) (obj2))))
            {
                if (obj == JsonToken.VALUE_TRUE)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                c1.a(b1, ((String) (obj1)), flag2);
            } else
            {
                a(((JsonToken) (obj)), ((a) (obj2)));
            }
        } else
        if (obj == JsonToken.START_ARRAY || obj == JsonToken.START_OBJECT)
        {
            if (obj2 == null)
            {
                if (!c1.b())
                {
                    a(((JsonToken) (obj)), ((a) (obj2)));
                }
                jsonparser.skipChildren();
            } else
            {
                obj2 = a(jsonparser, ((a) (obj2)));
                if (obj2 != null)
                {
                    if (obj == JsonToken.START_ARRAY || obj2 == Collections.EMPTY_LIST)
                    {
                        com.facebook.debug.b.a.b(obj2 instanceof List);
                        c1.a(b1, ((String) (obj1)), (List)obj2);
                    } else
                    if (obj2 instanceof com.facebook.common.json.jsonmirror.b)
                    {
                        c1.a(b1, ((String) (obj1)), (com.facebook.common.json.jsonmirror.b)obj2);
                    } else
                    if (obj2 instanceof Map)
                    {
                        c1.a(b1, ((String) (obj1)), (Map)obj2);
                    } else
                    {
                        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("got a ").append(obj).append(" but don't know what to do with it.").toString());
                    }
                }
            }
        }
          goto _L7
_L3:
        if (b1 instanceof com.facebook.common.json.jsonmirror.c)
        {
            ((com.facebook.common.json.jsonmirror.c)b1).a(c1);
        }
        return b1;
_L2:
        if (a(com/facebook/common/json/jsonmirror/a/j, set) == null)
        {
            break MISSING_BLOCK_LABEL_1137;
        }
        obj2 = ev.k();
        obj = com.facebook.common.json.d.a(jsonparser);
        set = null;
_L10:
        if (obj == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_1131;
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = jsonparser.getText();
_L11:
        obj = com.facebook.common.json.d.a(jsonparser);
        set = ((Set) (obj1));
        if (true) goto _L10; else goto _L9
_L9:
        if (obj == JsonToken.VALUE_NUMBER_INT)
        {
            ((ew) (obj2)).b(set, Long.valueOf(jsonparser.getLongValue()));
            obj1 = set;
        } else
        {
label2:
            {
                if (obj != JsonToken.VALUE_NUMBER_FLOAT)
                {
                    break label2;
                }
                ((ew) (obj2)).b(set, Double.valueOf(jsonparser.getDoubleValue()));
                obj1 = set;
            }
        }
          goto _L11
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_1049;
        }
        ((ew) (obj2)).b(set, Long.valueOf(Long.parseLong(jsonparser.getText())));
        obj1 = set;
          goto _L11
        obj;
        ((ew) (obj2)).b(set, Double.valueOf(Double.parseDouble(jsonparser.getText())));
        obj1 = set;
          goto _L11
        obj;
        ((ew) (obj2)).b(set, jsonparser.getText());
        obj1 = set;
          goto _L11
label3:
        {
            if (obj != JsonToken.VALUE_TRUE && obj != JsonToken.VALUE_FALSE)
            {
                break label3;
            }
            if (obj == JsonToken.VALUE_TRUE)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((ew) (obj2)).b(set, Boolean.valueOf(flag2));
            obj1 = set;
        }
          goto _L11
        if (obj == JsonToken.START_ARRAY) goto _L13; else goto _L12
_L12:
        obj1 = set;
        if (obj != JsonToken.START_OBJECT) goto _L11; else goto _L13
_L13:
        com.facebook.debug.log.b.e(a, "Unexpected object/array in simple dictionary");
        jsonparser.skipChildren();
        obj1 = set;
          goto _L11
        return ((ew) (obj2)).b();
        if (a(com/facebook/common/json/jsonmirror/a/h, set) != null)
        {
            obj = com.facebook.common.json.d.a(jsonparser);
            if (obj == JsonToken.END_OBJECT)
            {
                return Collections.EMPTY_LIST;
            }
            a(JsonToken.START_OBJECT, set);
            for (set = ((Set) (obj)); set != JsonToken.END_OBJECT; set = com.facebook.common.json.d.a(jsonparser))
            {
                if (set == JsonToken.START_ARRAY || set == JsonToken.START_OBJECT)
                {
                    jsonparser.skipChildren();
                }
            }

        } else
        {
            a(jsonparser.getCurrentToken(), set);
            jsonparser.skipChildren();
        }
        return null;
        numberformatexception;
        flag = flag1;
          goto _L14
        flag = false;
          goto _L8
    }

    public static Object d(JsonParser jsonparser, Set set)
    {
        if (jsonparser.getCurrentToken() == null && jsonparser.getTokenLocation().getCharOffset() == 0L)
        {
            com.facebook.common.json.d.a(jsonparser);
        }
        JsonToken jsontoken = jsonparser.getCurrentToken();
        Object obj = null;
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT || jsontoken == JsonToken.VALUE_STRING)
        {
            obj = a(jsontoken, jsonparser, set);
        } else
        {
            if (jsontoken == JsonToken.VALUE_TRUE || jsontoken == JsonToken.VALUE_FALSE)
            {
                return a(jsonparser, set);
            }
            if (jsontoken == JsonToken.START_ARRAY)
            {
                return b(jsonparser, set);
            }
            if (jsontoken == JsonToken.START_OBJECT)
            {
                return c(jsonparser, set);
            }
        }
        return obj;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.json:
//            JsonValue

public class JCardValue
{

    private final List values;

    public JCardValue(List list)
    {
        values = Collections.unmodifiableList(list);
    }

    public transient JCardValue(JsonValue ajsonvalue[])
    {
        values = Arrays.asList(ajsonvalue);
    }

    public static JCardValue multi(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new JsonValue(list.next()))) { }
        return new JCardValue(arraylist);
    }

    public static transient JCardValue multi(Object aobj[])
    {
        return multi(Arrays.asList(aobj));
    }

    public static JCardValue single(Object obj)
    {
        return new JCardValue(new JsonValue[] {
            new JsonValue(obj)
        });
    }

    public static JCardValue structured(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            list = (List)iterator.next();
            if (list.isEmpty())
            {
                arraylist.add(new JsonValue(""));
            } else
            if (list.size() == 1)
            {
                Object obj = list.get(0);
                list = ((List) (obj));
                if (obj == null)
                {
                    list = "";
                }
                arraylist.add(new JsonValue(list));
            } else
            {
                ArrayList arraylist1 = new ArrayList(list.size());
                for (Iterator iterator1 = list.iterator(); iterator1.hasNext(); arraylist1.add(new JsonValue(list)))
                {
                    Object obj1 = iterator1.next();
                    list = ((List) (obj1));
                    if (obj1 == null)
                    {
                        list = "";
                    }
                }

                arraylist.add(new JsonValue(arraylist1));
            }
        }

        return new JCardValue(new JsonValue[] {
            new JsonValue(arraylist)
        });
    }

    public static transient JCardValue structured(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            if (obj instanceof List)
            {
                obj = (List)obj;
            } else
            {
                obj = Arrays.asList(new Object[] {
                    obj
                });
            }
            arraylist.add(obj);
            i++;
        }
        return structured(((List) (arraylist)));
    }

    public List asMulti()
    {
        if (!values.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList(values.size());
        Iterator iterator = values.iterator();
        do
        {
            obj = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (JsonValue)iterator.next();
            if (((JsonValue) (obj)).isNull())
            {
                arraylist.add("");
            } else
            {
                obj = ((JsonValue) (obj)).getValue();
                if (obj != null)
                {
                    arraylist.add(obj.toString());
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String asSingle()
    {
        if (values.isEmpty())
        {
            return "";
        }
        Object obj = (JsonValue)values.get(0);
        if (((JsonValue) (obj)).isNull())
        {
            return "";
        }
        Object obj1 = ((JsonValue) (obj)).getValue();
        if (obj1 != null)
        {
            return obj1.toString();
        }
        obj = ((JsonValue) (obj)).getArray();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = ((JsonValue)((List) (obj)).get(0)).getValue();
            if (obj != null)
            {
                return obj.toString();
            }
        }
        return "";
    }

    public List asStructured()
    {
        if (values.isEmpty())
        {
            return Collections.emptyList();
        }
        Object obj = (JsonValue)values.get(0);
        Object obj1 = ((JsonValue) (obj)).getArray();
        if (obj1 != null)
        {
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                JsonValue jsonvalue = (JsonValue)((Iterator) (obj1)).next();
                if (jsonvalue.isNull())
                {
                    ((List) (obj)).add(Arrays.asList(new String[] {
                        ""
                    }));
                } else
                {
                    Object obj2 = jsonvalue.getValue();
                    if (obj2 != null)
                    {
                        ((List) (obj)).add(Arrays.asList(new String[] {
                            obj2.toString()
                        }));
                    } else
                    {
                        Object obj3 = jsonvalue.getArray();
                        if (obj3 != null)
                        {
                            ArrayList arraylist1 = new ArrayList(((List) (obj3)).size());
                            obj3 = ((List) (obj3)).iterator();
                            do
                            {
                                if (!((Iterator) (obj3)).hasNext())
                                {
                                    break;
                                }
                                Object obj4 = (JsonValue)((Iterator) (obj3)).next();
                                if (((JsonValue) (obj4)).isNull())
                                {
                                    arraylist1.add("");
                                } else
                                {
                                    obj4 = ((JsonValue) (obj4)).getValue();
                                    if (obj4 != null)
                                    {
                                        arraylist1.add(obj4.toString());
                                    }
                                }
                            } while (true);
                            ((List) (obj)).add(arraylist1);
                        }
                    }
                }
            } while (true);
            return ((List) (obj));
        }
        obj1 = ((JsonValue) (obj)).getValue();
        if (obj1 != null)
        {
            obj = new ArrayList(1);
            ((List) (obj)).add(Arrays.asList(new String[] {
                obj1.toString()
            }));
            return ((List) (obj));
        }
        if (((JsonValue) (obj)).isNull())
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(Arrays.asList(new String[] {
                ""
            }));
            return arraylist;
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getValues()
    {
        return values;
    }
}

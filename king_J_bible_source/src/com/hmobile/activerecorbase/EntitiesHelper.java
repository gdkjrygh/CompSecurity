// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

// Referenced classes of package com.hmobile.activerecorbase:
//            ActiveRecordBase, ARConst, Logg

public class EntitiesHelper
{

    private static final String AR_BASE_CLASS_NAME = com/hmobile/activerecorbase/ActiveRecordBase.getSimpleName();
    private static final String AR_PK_FIELD_JAVA_NAME = "id";

    public EntitiesHelper()
    {
    }

    private static void copyDataFields(Object obj, Object obj1, Hashtable hashtable, Hashtable hashtable1)
        throws IllegalArgumentException, IllegalAccessException
    {
        hashtable1 = hashtable1.values().iterator();
        do
        {
            Field field;
            Object obj2;
            String s;
            String s1;
            do
            {
                do
                {
                    if (!hashtable1.hasNext())
                    {
                        return;
                    }
                    field = (Field)hashtable1.next();
                    obj2 = field.getName();
                } while (((String) (obj2)).equalsIgnoreCase("id") || !hashtable.containsKey(obj2));
                obj2 = (Field)hashtable.get(obj2);
                s = field.getType().getSimpleName();
                s1 = ((Field) (obj2)).getType().getSimpleName();
            } while (!s.equals(s1));
            if (s1.equals("long"))
            {
                ((Field) (obj2)).setLong(obj, field.getLong(obj1));
            }
            if (s1.equals("int"))
            {
                ((Field) (obj2)).setInt(obj, field.getInt(obj1));
            } else
            if (s1.equals("short"))
            {
                ((Field) (obj2)).setShort(obj, field.getShort(obj1));
            } else
            if (s1.equals("float"))
            {
                ((Field) (obj2)).setFloat(obj, field.getFloat(obj1));
            } else
            if (s1.equals("double"))
            {
                ((Field) (obj2)).setDouble(obj, field.getDouble(obj1));
            } else
            if (s1.equals("boolean"))
            {
                ((Field) (obj2)).setBoolean(obj, field.getBoolean(obj1));
            } else
            {
                ((Field) (obj2)).set(obj, field.get(obj1));
            }
        } while (true);
    }

    public static Object copyFields(Object obj, Object obj1)
    {
        Hashtable hashtable;
        Object obj2;
        int i;
        int j;
        if (obj1 == null)
        {
            Logg.w(ARConst.TAG, "(%t) %s error: null source object", new Object[] {
                com/hmobile/activerecorbase/EntitiesHelper.getName()
            });
            return null;
        }
        if (obj == null)
        {
            Logg.w(ARConst.TAG, "(%t) %s error: null destination object", new Object[] {
                com/hmobile/activerecorbase/EntitiesHelper.getName()
            });
            return null;
        }
        hashtable = new Hashtable();
        obj2 = obj.getClass().getFields();
        j = obj2.length;
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        Field afield[];
        obj2 = new Hashtable();
        afield = obj1.getClass().getFields();
        j = afield.length;
        i = 0;
_L3:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        copyPkFields(obj, obj1, hashtable, ((Hashtable) (obj2)));
        copyDataFields(obj, obj1, hashtable, ((Hashtable) (obj2)));
        return obj;
        obj;
        Logg.w(ARConst.TAG, ((Throwable) (obj)), "(%t) %s error: %s", new Object[] {
            com/hmobile/activerecorbase/EntitiesHelper.getName(), ((SecurityException) (obj)).getLocalizedMessage()
        });
        return null;
_L2:
        afield = obj2[i];
        hashtable.put(afield.getName(), afield);
        i++;
        continue; /* Loop/switch isn't completed */
        Field field = afield[i];
        ((Hashtable) (obj2)).put(field.getName(), field);
        i++;
          goto _L3
        obj;
        Logg.w(ARConst.TAG, ((Throwable) (obj)), "(%t) %s error: %s", new Object[] {
            com/hmobile/activerecorbase/EntitiesHelper.getName(), ((IllegalArgumentException) (obj)).getLocalizedMessage()
        });
        return null;
        obj;
        Logg.w(ARConst.TAG, ((Throwable) (obj)), "(%t) %s error: %s", new Object[] {
            com/hmobile/activerecorbase/EntitiesHelper.getName(), ((NoSuchFieldException) (obj)).getLocalizedMessage()
        });
        return null;
        obj;
        Logg.w(ARConst.TAG, ((Throwable) (obj)), "(%t) %s error: %s", new Object[] {
            com/hmobile/activerecorbase/EntitiesHelper.getName(), ((IllegalAccessException) (obj)).getLocalizedMessage()
        });
        return null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Object copyFieldsWithoutID(Object obj, Object obj1)
    {
        Hashtable hashtable;
        Object obj2;
        int i;
        int j;
        if (obj1 == null)
        {
            Logg.w(ARConst.TAG, "(%t) %s error: null source object", new Object[] {
                com/hmobile/activerecorbase/EntitiesHelper.getName()
            });
            return null;
        }
        if (obj == null)
        {
            Logg.w(ARConst.TAG, "(%t) %s error: null source object", new Object[] {
                com/hmobile/activerecorbase/EntitiesHelper.getName()
            });
            return null;
        }
        hashtable = new Hashtable();
        obj2 = obj.getClass().getFields();
        j = obj2.length;
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        Field afield[];
        obj2 = new Hashtable();
        afield = obj1.getClass().getFields();
        j = afield.length;
        i = 0;
_L3:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        copyDataFields(obj, obj1, hashtable, ((Hashtable) (obj2)));
        return obj;
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
        return null;
_L2:
        afield = obj2[i];
        hashtable.put(afield.getName(), afield);
        i++;
        continue; /* Loop/switch isn't completed */
        Field field = afield[i];
        ((Hashtable) (obj2)).put(field.getName(), field);
        i++;
          goto _L3
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        return null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void copyPkFields(Object obj, Object obj1, Hashtable hashtable, Hashtable hashtable1)
        throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (obj1.getClass().getSuperclass().getSimpleName().equals(AR_BASE_CLASS_NAME))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj.getClass().getSuperclass().getSimpleName().equals(AR_BASE_CLASS_NAME))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (hashtable.containsKey("id"))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (hashtable1.containsKey("id"))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag && flag1)
        {
            ((ActiveRecordBase)obj)._id = ((ActiveRecordBase)obj1)._id;
        } else
        {
            if (flag && flag2)
            {
                hashtable = obj.getClass().getField("id");
                if (hashtable.getType().getSimpleName().equals("long"))
                {
                    hashtable.setLong(obj, ((ActiveRecordBase)obj1)._id);
                    return;
                } else
                {
                    Logg.w(ARConst.TAG, "(%t) %s.copyPkFields(): field '%s.%s' must have type 'long'. Copy operation skipped", new Object[] {
                        com/hmobile/activerecorbase/EntitiesHelper.getName(), obj.getClass().getSimpleName(), hashtable.getName()
                    });
                    throw new IllegalArgumentException(String.format("Field '%s.%s' must have type 'long'. Copy operation skipped", new Object[] {
                        obj.getClass().getSimpleName(), hashtable.getName()
                    }));
                }
            }
            if (flag3 && flag1)
            {
                hashtable = obj1.getClass().getField("id");
                if (hashtable.getType().getSimpleName().equals("long"))
                {
                    ((ActiveRecordBase)obj)._id = hashtable.getLong(obj1);
                    return;
                }
                if (hashtable.getType().getSimpleName().equals("int"))
                {
                    ((ActiveRecordBase)obj)._id = hashtable.getInt(obj1);
                    return;
                } else
                {
                    Logg.w(ARConst.TAG, "%s.copyPkFields(): field '%s.%s' must have type 'long' or 'int'. Copy operation skipped", new Object[] {
                        com/hmobile/activerecorbase/EntitiesHelper.getName(), obj1.getClass().getSimpleName(), hashtable.getName()
                    });
                    throw new IllegalArgumentException(String.format("Field '%s.%s' must have type 'long' or 'int'. Copy operation skipped", new Object[] {
                        obj1.getClass().getSimpleName(), hashtable.getName()
                    }));
                }
            }
            if (flag3 && flag2)
            {
                hashtable = obj1.getClass().getField("id");
                obj.getClass().getField("id").setLong(obj, hashtable.getLong(obj1));
                return;
            }
        }
    }

}

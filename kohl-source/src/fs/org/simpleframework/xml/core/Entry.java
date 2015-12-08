// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.strategy.Type;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Contact, PersistenceException, Context, PrimitiveKey, 
//            CompositeKey, ClassType, PrimitiveValue, CompositeValue, 
//            Converter

class Entry
{

    private boolean attribute;
    private Contact contact;
    private String entry;
    private String key;
    private Class keyType;
    private ElementMap label;
    private String value;
    private Class valueType;

    public Entry(Contact contact1, ElementMap elementmap)
    {
        attribute = elementmap.attribute();
        entry = elementmap.entry();
        value = elementmap.value();
        key = elementmap.key();
        contact = contact1;
        label = elementmap;
    }

    private Class getDependent(int i)
        throws Exception
    {
        Class aclass[] = contact.getDependents();
        if (aclass.length < i)
        {
            throw new PersistenceException("Could not find type for %s at index %s", new Object[] {
                contact, Integer.valueOf(i)
            });
        } else
        {
            return aclass[i];
        }
    }

    private boolean isEmpty(String s)
    {
        return s.length() == 0;
    }

    public String getEntry()
        throws Exception
    {
        if (entry == null)
        {
            return entry;
        }
        if (isEmpty(entry))
        {
            entry = "entry";
        }
        return entry;
    }

    public Converter getKey(Context context)
        throws Exception
    {
        Type type = getKeyType();
        if (context.isPrimitive(type))
        {
            return new PrimitiveKey(context, this, type);
        } else
        {
            return new CompositeKey(context, this, type);
        }
    }

    public String getKey()
        throws Exception
    {
        if (key == null)
        {
            return key;
        }
        if (isEmpty(key))
        {
            key = null;
        }
        return key;
    }

    protected Type getKeyType()
        throws Exception
    {
        if (keyType == null)
        {
            keyType = label.keyType();
            if (keyType == Void.TYPE)
            {
                keyType = getDependent(0);
            }
        }
        return new ClassType(keyType);
    }

    public Converter getValue(Context context)
        throws Exception
    {
        Type type = getValueType();
        if (context.isPrimitive(type))
        {
            return new PrimitiveValue(context, this, type);
        } else
        {
            return new CompositeValue(context, this, type);
        }
    }

    public String getValue()
        throws Exception
    {
        if (value == null)
        {
            return value;
        }
        if (isEmpty(value))
        {
            value = null;
        }
        return value;
    }

    protected Type getValueType()
        throws Exception
    {
        if (valueType == null)
        {
            valueType = label.valueType();
            if (valueType == Void.TYPE)
            {
                valueType = getDependent(1);
            }
        }
        return new ClassType(valueType);
    }

    public boolean isAttribute()
    {
        return attribute;
    }

    public boolean isInline()
        throws Exception
    {
        return isAttribute();
    }

    public String toString()
    {
        return String.format("%s on %s", new Object[] {
            label, contact
        });
    }
}

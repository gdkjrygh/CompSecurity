// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.adobe.mediacore.metadata:
//            Metadata

public final class TimedMetadata
    implements Comparable
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ID3;
        public static final Type TAG;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/metadata/TimedMetadata$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            TAG = new Type("TAG", 0);
            ID3 = new Type("ID3", 1);
            $VALUES = (new Type[] {
                TAG, ID3
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private final long _id;
    private final Metadata _metadata;
    private final String _name;
    private final long _time;
    private final Type _type;

    public TimedMetadata(Type type, long l, long l1, String s, Metadata metadata)
    {
        _type = type;
        _time = l;
        _id = l1;
        _name = s;
        _metadata = metadata;
    }

    private int getMetadataHashcode()
    {
        if (_metadata == null)
        {
            return 0;
        }
        Object obj = new TreeSet(_metadata.keySet());
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(s1))
        {
            String s = (String)((Iterator) (obj)).next();
            s1 = _metadata.getValue(s);
            stringbuilder.append(s);
        }

        return stringbuilder.toString().hashCode();
    }

    public int compareTo(TimedMetadata timedmetadata)
    {
        if (_time < timedmetadata.getTime())
        {
            return -1;
        }
        return _time != timedmetadata.getTime() ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimedMetadata)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof TimedMetadata))
            {
                return false;
            }
            obj = (TimedMetadata)obj;
            if (((TimedMetadata) (obj)).getId() != getId() || ((TimedMetadata) (obj)).getTime() != getTime() || !((TimedMetadata) (obj)).getName().toLowerCase().equals(getName().toLowerCase()) || ((TimedMetadata) (obj)).getType() != getType() || getMetadataHashcode() != ((TimedMetadata) (obj)).getMetadataHashcode())
            {
                return false;
            }
        }
        return true;
    }

    public long getId()
    {
        return _id;
    }

    public Metadata getMetadata()
    {
        return _metadata;
    }

    public String getName()
    {
        return _name;
    }

    public long getTime()
    {
        return _time;
    }

    public Type getType()
    {
        return _type;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Long[] {
            Long.valueOf(getId()), Long.valueOf(getTime()), Long.valueOf(getName().toLowerCase().hashCode()), Long.valueOf(getType().hashCode()), Long.valueOf(getMetadataHashcode())
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append(" Object {");
        stringbuilder.append(" type=").append(_type);
        stringbuilder.append(" ,time=").append(_time);
        stringbuilder.append(" ,name=").append(_name);
        stringbuilder.append(" ,id=").append(_id);
        if (_metadata != null)
        {
            Object obj = new TreeSet(_metadata.keySet());
            StringBuilder stringbuilder1 = new StringBuilder();
            String s1;
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder1.append(s1))
            {
                String s = (String)((Iterator) (obj)).next();
                s1 = _metadata.getValue(s);
                if (stringbuilder1.length() > 0)
                {
                    stringbuilder1.append(", ");
                }
                stringbuilder1.append(s);
                stringbuilder1.append(":");
            }

            stringbuilder.append(" ,metadata=").append(stringbuilder1.toString());
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}

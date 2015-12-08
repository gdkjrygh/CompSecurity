// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParcelableUtils
{

    public ParcelableUtils()
    {
    }

    public static boolean readBoolean(Parcel parcel)
    {
        return parcel.readByte() == 1;
    }

    public static Date readDate(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return new Date(parcel.readLong());
        } else
        {
            return null;
        }
    }

    public static Enum readEnum(Parcel parcel, Class class1)
    {
        parcel = parcel.readString();
        if ("".equals(parcel))
        {
            return null;
        } else
        {
            return Enum.valueOf(class1, parcel);
        }
    }

    public static Map readIntStringMap(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j != -1) goto _L2; else goto _L1
_L1:
        HashMap hashmap = new HashMap();
_L4:
        return hashmap;
_L2:
        HashMap hashmap1 = new HashMap();
        int i = 0;
        do
        {
            hashmap = hashmap1;
            if (i >= j)
            {
                continue;
            }
            hashmap1.put(Integer.valueOf(parcel.readInt()), parcel.readString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List readPKPassFieldList(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j != -1) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(parcel.readParcelable(null));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Parcelable readParcelable(Parcel parcel)
    {
        Parcelable parcelable = null;
        if (parcel.readByte() == 1)
        {
            parcelable = parcel.readParcelable(null);
        }
        return parcelable;
    }

    public static Map readParcelableMap(Parcel parcel, ClassLoader classloader)
    {
        int j = parcel.readInt();
        if (j != -1) goto _L2; else goto _L1
_L1:
        HashMap hashmap = new HashMap();
_L4:
        return hashmap;
_L2:
        HashMap hashmap1 = new HashMap();
        int i = 0;
        do
        {
            hashmap = hashmap1;
            if (i >= j)
            {
                continue;
            }
            hashmap1.put(parcel.readString(), parcel.readParcelable(classloader));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String readString(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return parcel.readString();
        } else
        {
            return null;
        }
    }

    public static Map readStringMap(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j != -1) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= j)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static URL readURL(Parcel parcel)
    {
        try
        {
            parcel = new URL(parcel.readString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            parcel.printStackTrace();
            return null;
        }
        return parcel;
    }

    public static void write(Parcel parcel, Parcelable parcelable, int i)
    {
        int j;
        if (parcelable == null)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        parcel.writeByte((byte)j);
        if (parcelable != null)
        {
            parcel.writeParcelable(parcelable, i);
        }
    }

    public static void write(Parcel parcel, Enum enum)
    {
        if (enum == null)
        {
            parcel.writeString("");
            return;
        } else
        {
            parcel.writeString(enum.name());
            return;
        }
    }

    public static void write(Parcel parcel, String s)
    {
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (s != null)
        {
            parcel.writeString(s);
        }
    }

    public static void write(Parcel parcel, URL url)
    {
        parcel.writeString(url.toExternalForm());
    }

    public static void write(Parcel parcel, Date date)
    {
        int i;
        if (date == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (date != null)
        {
            parcel.writeLong(date.getTime());
        }
    }

    public static void write(Parcel parcel, List list, int i)
    {
        if (list == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(list.size());
            list = list.iterator();
            while (list.hasNext()) 
            {
                parcel.writeParcelable((Parcelable)list.next(), i);
            }
        }
    }

    public static void write(Parcel parcel, Map map, int i)
    {
        if (map == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(map.keySet().size());
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                parcel.writeString(s);
                parcel.writeParcelable((Parcelable)map.get(s), i);
            }
        }
    }

    public static void write(Parcel parcel, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

    public static void writeIntStringMap(Parcel parcel, Map map)
    {
        if (map == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(map.keySet().size());
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Integer integer = (Integer)iterator.next();
                parcel.writeInt(integer.intValue());
                parcel.writeString((String)map.get(integer));
            }
        }
    }
}

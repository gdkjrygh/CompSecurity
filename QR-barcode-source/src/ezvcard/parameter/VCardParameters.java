// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.util.GeoUri;
import ezvcard.util.ListMultimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package ezvcard.parameter:
//            Calscale, Encoding

public class VCardParameters extends ListMultimap
{

    public static final String ALTID = "ALTID";
    public static final String CALSCALE = "CALSCALE";
    public static final String CHARSET = "CHARSET";
    public static final String ENCODING = "ENCODING";
    public static final String GEO = "GEO";
    public static final String INDEX = "INDEX";
    public static final String LABEL = "LABEL";
    public static final String LANGUAGE = "LANGUAGE";
    public static final String LEVEL = "LEVEL";
    public static final String MEDIATYPE = "MEDIATYPE";
    public static final String PID = "PID";
    public static final String PREF = "PREF";
    public static final String SORT_AS = "SORT-AS";
    public static final String TYPE = "TYPE";
    public static final String TZ = "TZ";
    public static final String VALUE = "VALUE";
    private static final Map supportedVersions;

    public VCardParameters()
    {
    }

    public VCardParameters(VCardParameters vcardparameters)
    {
        super(vcardparameters);
    }

    public void addPid(int i)
    {
        put("PID", (new StringBuilder()).append(i).append("").toString());
    }

    public void addPid(int i, int j)
    {
        put("PID", (new StringBuilder()).append(i).append(".").append(j).toString());
    }

    public void addType(String s)
    {
        put("TYPE", s);
    }

    public String getAltId()
    {
        return (String)first("ALTID");
    }

    public Calscale getCalscale()
    {
        String s = (String)first("CALSCALE");
        if (s == null)
        {
            return null;
        } else
        {
            return Calscale.get(s);
        }
    }

    public String getCharset()
    {
        return (String)first("CHARSET");
    }

    public Encoding getEncoding()
    {
        String s = (String)first("ENCODING");
        if (s == null)
        {
            return null;
        } else
        {
            return Encoding.get(s);
        }
    }

    public double[] getGeo()
    {
        Object obj = (String)first("GEO");
        if (obj == null)
        {
            return null;
        }
        double d;
        double d1;
        try
        {
            obj = GeoUri.parse(((String) (obj)));
            d = ((GeoUri) (obj)).getCoordA().doubleValue();
            d1 = ((GeoUri) (obj)).getCoordB().doubleValue();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new IllegalStateException("GEO parameter value is malformed and could not be parsed. Retrieve its raw text value instead.", illegalargumentexception);
        }
        return (new double[] {
            d, d1
        });
    }

    public Integer getIndex()
    {
        Object obj = (String)first("INDEX");
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = Integer.valueOf(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalStateException("INDEX parameter value is malformed and could not be parsed. Retrieve its raw text value instead.", numberformatexception);
        }
        return ((Integer) (obj));
    }

    public String getLabel()
    {
        return (String)first("LABEL");
    }

    public String getLanguage()
    {
        return (String)first("LANGUAGE");
    }

    public String getLevel()
    {
        return (String)first("LEVEL");
    }

    public String getMediaType()
    {
        return (String)first("MEDIATYPE");
    }

    public List getPids()
    {
        ArrayList arraylist;
        Iterator iterator;
        List list = get("PID");
        arraylist = new ArrayList(list.size());
        iterator = list.iterator();
_L2:
        String as[];
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        as = ((String)iterator.next()).split("\\.");
        Object obj;
        Integer integer;
        integer = Integer.valueOf(as[0]);
        if (as.length <= 1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = Integer.valueOf(as[1]);
_L3:
        arraylist.add(new Integer[] {
            integer, obj
        });
        if (true) goto _L2; else goto _L1
        obj;
        throw new IllegalStateException("PID parameter value is malformed and could not be parsed. Retrieve its raw text value instead.", ((Throwable) (obj)));
_L1:
        obj = null;
          goto _L3
        return arraylist;
    }

    public Integer getPref()
    {
        Object obj = (String)first("PREF");
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = Integer.valueOf(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalStateException("PREF parameter value is malformed and could not be parsed. Retrieve its raw text value instead.", numberformatexception);
        }
        return ((Integer) (obj));
    }

    public List getSortAs()
    {
        return get("SORT-AS");
    }

    public String getTimezone()
    {
        return (String)first("TZ");
    }

    public String getType()
    {
        Set set = getTypes();
        if (set.isEmpty())
        {
            return null;
        } else
        {
            return (String)set.iterator().next();
        }
    }

    public Set getTypes()
    {
        return new HashSet(get("TYPE"));
    }

    public VCardDataType getValue()
    {
        String s = (String)first("VALUE");
        if (s == null)
        {
            return null;
        } else
        {
            return VCardDataType.get(s);
        }
    }

    public void removePids()
    {
        removeAll("PID");
    }

    public void removeType(String s)
    {
        remove("TYPE", s);
    }

    public void removeTypes()
    {
        removeAll("TYPE");
    }

    public void removeValue()
    {
        removeAll("VALUE");
    }

    protected volatile Object sanitizeKey(Object obj)
    {
        return sanitizeKey((String)obj);
    }

    protected String sanitizeKey(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toUpperCase();
        }
    }

    public void setAltId(String s)
    {
        replace("ALTID", s);
    }

    public void setCalscale(Calscale calscale)
    {
        if (calscale == null)
        {
            calscale = null;
        } else
        {
            calscale = calscale.getValue();
        }
        replace("CALSCALE", calscale);
    }

    public void setCharset(String s)
    {
        replace("CHARSET", s);
    }

    public void setEncoding(Encoding encoding)
    {
        if (encoding == null)
        {
            encoding = null;
        } else
        {
            encoding = encoding.getValue();
        }
        replace("ENCODING", encoding);
    }

    public void setGeo(double d, double d1)
    {
        replace("GEO", (new ezvcard.util.GeoUri.Builder(Double.valueOf(d), Double.valueOf(d1))).build().toString());
    }

    public void setIndex(Integer integer)
    {
        if (integer != null && integer.intValue() <= 0)
        {
            throw new IllegalArgumentException("Index value must be greater than 0.");
        }
        if (integer == null)
        {
            integer = null;
        } else
        {
            integer = integer.toString();
        }
        replace("INDEX", integer);
    }

    public void setLabel(String s)
    {
        replace("LABEL", s);
    }

    public void setLanguage(String s)
    {
        replace("LANGUAGE", s);
    }

    public void setLevel(String s)
    {
        replace("LEVEL", s);
    }

    public void setMediaType(String s)
    {
        replace("MEDIATYPE", s);
    }

    public void setPref(Integer integer)
    {
        if (integer != null && (integer.intValue() < 1 || integer.intValue() > 100))
        {
            throw new IllegalArgumentException("Preference value must be between 1 and 100 inclusive.");
        }
        if (integer == null)
        {
            integer = null;
        } else
        {
            integer = integer.toString();
        }
        replace("PREF", integer);
    }

    public transient void setSortAs(String as[])
    {
        removeAll("SORT-AS");
        if (as != null && as.length > 0)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                put("SORT-AS", as[i]);
            }

        }
    }

    public void setTimezone(String s)
    {
        replace("TZ", s);
    }

    public void setType(String s)
    {
        replace("TYPE", s);
    }

    public void setValue(VCardDataType vcarddatatype)
    {
        if (vcarddatatype == null)
        {
            vcarddatatype = null;
        } else
        {
            vcarddatatype = vcarddatatype.getName();
        }
        replace("VALUE", vcarddatatype);
    }

    public List validate(VCardVersion vcardversion)
    {
        if (!((Encoding) (obj1)).isSupported(vcardversion))
        {
            arraylist.add(String.format(s, new Object[] {
                "ENCODING", obj
            }));
        }
        continue;
        ArrayList arraylist = new ArrayList(0);
        String s = (new StringBuilder()).append("%s parameter value (\"%s\") is not supported by version ").append(vcardversion.getVersion()).append(".").toString();
        Object obj = (String)first("CALSCALE");
        if (obj != null && Calscale.find(((String) (obj))) == null)
        {
            arraylist.add(String.format("%s parameter has a non-standard value (\"%s\").  Standard values are: %s", new Object[] {
                "CALSCALE", obj, Calscale.all()
            }));
        }
        obj = (String)first("ENCODING");
        Object obj1;
        if (obj != null)
        {
            obj1 = Encoding.find(((String) (obj)));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_369;
            }
            arraylist.add(String.format("%s parameter has a non-standard value (\"%s\").  Standard values are: %s", new Object[] {
                "ENCODING", obj, Encoding.all()
            }));
        }
        do
        {
            obj = (String)first("VALUE");
            if (obj != null)
            {
                obj1 = VCardDataType.find(((String) (obj)));
                String s1;
                if (obj1 == null)
                {
                    arraylist.add(String.format("%s parameter has a non-standard value (\"%s\").  Standard values are: %s", new Object[] {
                        "VALUE", obj, VCardDataType.all()
                    }));
                } else
                if (!((VCardDataType) (obj1)).isSupported(vcardversion))
                {
                    arraylist.add(String.format(s, new Object[] {
                        "VALUE", obj
                    }));
                }
            }
            try
            {
                getGeo();
            }
            catch (IllegalStateException illegalstateexception)
            {
                arraylist.add(String.format("%s parameter has a malformed value (\"%s\").", new Object[] {
                    "GEO", first("GEO")
                }));
            }
            try
            {
                getIndex();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                arraylist.add(String.format("%s parameter has a malformed value (\"%s\").", new Object[] {
                    "INDEX", first("INDEX")
                }));
            }
            try
            {
                getPids();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                arraylist.add(String.format("%s parameter has a malformed value (\"%s\").", new Object[] {
                    "PID", first("PID")
                }));
            }
            try
            {
                getPref();
            }
            catch (IllegalStateException illegalstateexception3)
            {
                arraylist.add(String.format("%s parameter has a malformed value (\"%s\").", new Object[] {
                    "PREF", first("PREF")
                }));
            }
            s = (new StringBuilder()).append("%s parameter is not supported by version ").append(vcardversion.getVersion()).append(".").toString();
            obj = supportedVersions.entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                s1 = (String)((java.util.Map.Entry) (obj1)).getKey();
                if ((String)first(s1) != null && !((Set)((java.util.Map.Entry) (obj1)).getValue()).contains(vcardversion))
                {
                    arraylist.add(String.format(s, new Object[] {
                        s1
                    }));
                }
            } while (true);
            return arraylist;
        } while (true);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ALTID", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("CALSCALE", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("CHARSET", EnumSet.of(VCardVersion.V2_1));
        hashmap.put("GEO", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("INDEX", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("LEVEL", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("MEDIATYPE", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("PID", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("SORT-AS", EnumSet.of(VCardVersion.V4_0));
        hashmap.put("TZ", EnumSet.of(VCardVersion.V4_0));
        supportedVersions = Collections.unmodifiableMap(hashmap);
    }
}

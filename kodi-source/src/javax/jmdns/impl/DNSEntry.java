// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            ServiceInfoImpl

public abstract class DNSEntry
{

    private final DNSRecordClass _dnsClass;
    private final String _key;
    private final String _name;
    final Map _qualifiedNameMap = ServiceInfoImpl.decodeQualifiedNameMapForType(getName());
    private final DNSRecordType _recordType;
    private final String _type;
    private final boolean _unique;

    DNSEntry(String s, DNSRecordType dnsrecordtype, DNSRecordClass dnsrecordclass, boolean flag)
    {
        _name = s;
        _recordType = dnsrecordtype;
        _dnsClass = dnsrecordclass;
        _unique = flag;
        dnsrecordclass = (String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Domain);
        String s1 = (String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Protocol);
        s = (String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Application);
        dnsrecordtype = ((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Instance)).toLowerCase();
        StringBuilder stringbuilder = new StringBuilder();
        if (s.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s).append(".").toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (s1.length() > 0)
        {
            s = (new StringBuilder()).append("_").append(s1).append(".").toString();
        } else
        {
            s = "";
        }
        _type = stringbuilder.append(s).append(dnsrecordclass).append(".").toString();
        dnsrecordclass = new StringBuilder();
        if (dnsrecordtype.length() > 0)
        {
            s = (new StringBuilder()).append(dnsrecordtype).append(".").toString();
        } else
        {
            s = "";
        }
        _key = dnsrecordclass.append(s).append(_type).toString().toLowerCase();
    }

    public int compareTo(DNSEntry dnsentry)
    {
        byte abyte0[] = toByteArray();
        dnsentry = dnsentry.toByteArray();
        int i = 0;
        for (int j = Math.min(abyte0.length, dnsentry.length); i < j; i++)
        {
            if (abyte0[i] > dnsentry[i])
            {
                return 1;
            }
            if (abyte0[i] < dnsentry[i])
            {
                return -1;
            }
        }

        return abyte0.length - dnsentry.length;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            boolean flag = false;
            if (obj instanceof DNSEntry)
            {
                obj = (DNSEntry)obj;
                if (!getKey().equals(((DNSEntry) (obj)).getKey()) || !getRecordType().equals(((DNSEntry) (obj)).getRecordType()) || getRecordClass() != ((DNSEntry) (obj)).getRecordClass())
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    public String getKey()
    {
        if (_key != null)
        {
            return _key;
        } else
        {
            return "";
        }
    }

    public String getName()
    {
        if (_name != null)
        {
            return _name;
        } else
        {
            return "";
        }
    }

    public Map getQualifiedNameMap()
    {
        return Collections.unmodifiableMap(_qualifiedNameMap);
    }

    public DNSRecordClass getRecordClass()
    {
        if (_dnsClass != null)
        {
            return _dnsClass;
        } else
        {
            return DNSRecordClass.CLASS_UNKNOWN;
        }
    }

    public DNSRecordType getRecordType()
    {
        if (_recordType != null)
        {
            return _recordType;
        } else
        {
            return DNSRecordType.TYPE_IGNORE;
        }
    }

    public String getSubtype()
    {
        String s = (String)getQualifiedNameMap().get(javax.jmdns.ServiceInfo.Fields.Subtype);
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public String getType()
    {
        if (_type != null)
        {
            return _type;
        } else
        {
            return "";
        }
    }

    public int hashCode()
    {
        return getKey().hashCode() + getRecordType().indexValue() + getRecordClass().indexValue();
    }

    public boolean isDomainDiscoveryQuery()
    {
        if (((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Application)).equals("dns-sd"))
        {
            String s = (String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Instance);
            return "b".equals(s) || "db".equals(s) || "r".equals(s) || "dr".equals(s) || "lb".equals(s);
        } else
        {
            return false;
        }
    }

    public abstract boolean isExpired(long l);

    public boolean isReverseLookup()
    {
        return isV4ReverseLookup() || isV6ReverseLookup();
    }

    public boolean isSameEntry(DNSEntry dnsentry)
    {
        return getKey().equals(dnsentry.getKey()) && getRecordType().equals(dnsentry.getRecordType()) && (DNSRecordClass.CLASS_ANY == dnsentry.getRecordClass() || getRecordClass().equals(dnsentry.getRecordClass()));
    }

    public boolean isSameRecordClass(DNSEntry dnsentry)
    {
        return dnsentry != null && dnsentry.getRecordClass() == getRecordClass();
    }

    public boolean isSameType(DNSEntry dnsentry)
    {
        return dnsentry != null && dnsentry.getRecordType() == getRecordType();
    }

    public boolean isServicesDiscoveryMetaQuery()
    {
        return ((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Application)).equals("dns-sd") && ((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Instance)).equals("_services");
    }

    public boolean isUnique()
    {
        return _unique;
    }

    public boolean isV4ReverseLookup()
    {
        return ((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Domain)).endsWith("in-addr.arpa");
    }

    public boolean isV6ReverseLookup()
    {
        return ((String)_qualifiedNameMap.get(javax.jmdns.ServiceInfo.Fields.Domain)).endsWith("ip6.arpa");
    }

    public boolean sameSubtype(DNSEntry dnsentry)
    {
        return getSubtype().equals(dnsentry.getSubtype());
    }

    protected void toByteArray(DataOutputStream dataoutputstream)
        throws IOException
    {
        dataoutputstream.write(getName().getBytes("UTF8"));
        dataoutputstream.writeShort(getRecordType().indexValue());
        dataoutputstream.writeShort(getRecordClass().indexValue());
    }

    protected byte[] toByteArray()
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            toByteArray(dataoutputstream);
            dataoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            throw new InternalError();
        }
        return abyte0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        stringbuilder.append((new StringBuilder()).append("[").append(getClass().getSimpleName()).append("@").append(System.identityHashCode(this)).toString());
        stringbuilder.append((new StringBuilder()).append(" type: ").append(getRecordType()).toString());
        stringbuilder.append((new StringBuilder()).append(", class: ").append(getRecordClass()).toString());
        String s;
        if (_unique)
        {
            s = "-unique,";
        } else
        {
            s = ",";
        }
        stringbuilder.append(s);
        stringbuilder.append((new StringBuilder()).append(" name: ").append(_name).toString());
        toString(stringbuilder);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    protected void toString(StringBuilder stringbuilder)
    {
    }
}

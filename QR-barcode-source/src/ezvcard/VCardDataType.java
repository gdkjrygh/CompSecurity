// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.util.CaseClasses;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package ezvcard:
//            VCardVersion

public class VCardDataType
{

    public static final VCardDataType BINARY;
    public static final VCardDataType BOOLEAN;
    public static final VCardDataType CONTENT_ID;
    public static final VCardDataType DATE;
    public static final VCardDataType DATE_AND_OR_TIME;
    public static final VCardDataType DATE_TIME;
    public static final VCardDataType FLOAT;
    public static final VCardDataType INTEGER;
    public static final VCardDataType LANGUAGE_TAG;
    public static final VCardDataType TEXT = new VCardDataType("text", new VCardVersion[0]);
    public static final VCardDataType TIME;
    public static final VCardDataType TIMESTAMP;
    public static final VCardDataType URI;
    public static final VCardDataType URL;
    public static final VCardDataType UTC_OFFSET;
    private static final CaseClasses enums = new CaseClasses(ezvcard/VCardDataType) {

        protected VCardDataType create(String s)
        {
            return new VCardDataType(s, new VCardVersion[0]);
        }

        protected volatile Object create(Object obj)
        {
            return create((String)obj);
        }

        protected boolean matches(VCardDataType vcarddatatype, String s)
        {
            return vcarddatatype.name.equalsIgnoreCase(s);
        }

        protected volatile boolean matches(Object obj, Object obj1)
        {
            return matches((VCardDataType)obj, (String)obj1);
        }

    };
    private final String name;
    private final Set supportedVersions;

    private transient VCardDataType(String s, VCardVersion avcardversion[])
    {
        name = s;
        s = avcardversion;
        if (avcardversion.length == 0)
        {
            s = VCardVersion.values();
        }
        supportedVersions = Collections.unmodifiableSet(EnumSet.copyOf(Arrays.asList(s)));
    }


    public static Collection all()
    {
        return enums.all();
    }

    public static VCardDataType find(String s)
    {
        return (VCardDataType)enums.find(s);
    }

    public static VCardDataType get(String s)
    {
        return (VCardDataType)enums.get(s);
    }

    public String getName()
    {
        return name;
    }

    public boolean isSupported(VCardVersion vcardversion)
    {
        return supportedVersions.contains(vcardversion);
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        URL = new VCardDataType("url", new VCardVersion[] {
            VCardVersion.V2_1
        });
        CONTENT_ID = new VCardDataType("content-id", new VCardVersion[] {
            VCardVersion.V2_1
        });
        BINARY = new VCardDataType("binary", new VCardVersion[] {
            VCardVersion.V3_0
        });
        URI = new VCardDataType("uri", new VCardVersion[] {
            VCardVersion.V3_0, VCardVersion.V4_0
        });
        DATE = new VCardDataType("date", new VCardVersion[] {
            VCardVersion.V3_0, VCardVersion.V4_0
        });
        TIME = new VCardDataType("time", new VCardVersion[] {
            VCardVersion.V3_0, VCardVersion.V4_0
        });
        DATE_TIME = new VCardDataType("date-time", new VCardVersion[] {
            VCardVersion.V3_0, VCardVersion.V4_0
        });
        DATE_AND_OR_TIME = new VCardDataType("date-and-or-time", new VCardVersion[] {
            VCardVersion.V4_0
        });
        TIMESTAMP = new VCardDataType("timestamp", new VCardVersion[] {
            VCardVersion.V4_0
        });
        BOOLEAN = new VCardDataType("boolean", new VCardVersion[] {
            VCardVersion.V4_0
        });
        INTEGER = new VCardDataType("integer", new VCardVersion[] {
            VCardVersion.V4_0
        });
        FLOAT = new VCardDataType("float", new VCardVersion[] {
            VCardVersion.V4_0
        });
        UTC_OFFSET = new VCardDataType("utc-offset", new VCardVersion[] {
            VCardVersion.V4_0
        });
        LANGUAGE_TAG = new VCardDataType("language-tag", new VCardVersion[] {
            VCardVersion.V4_0
        });
    }

}

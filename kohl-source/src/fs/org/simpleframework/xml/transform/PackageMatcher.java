// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Matcher, EnumTransform, FileTransform, BooleanTransform, 
//            IntegerTransform, LongTransform, DoubleTransform, FloatTransform, 
//            ShortTransform, ByteTransform, CharacterTransform, StringTransform, 
//            ClassTransform, BigDecimalTransform, BigIntegerTransform, DateTransform, 
//            URLTransform, LocaleTransform, CurrencyTransform, GregorianCalendarTransform, 
//            TimeZoneTransform, Transform

class PackageMatcher
    implements Matcher
{

    public PackageMatcher()
    {
    }

    private Transform matchEnum(Class class1)
    {
        if (class1.isEnum())
        {
            return new EnumTransform(class1);
        } else
        {
            return null;
        }
    }

    private Transform matchFile(Class class1)
        throws Exception
    {
        if (class1 == java/io/File)
        {
            return new FileTransform();
        } else
        {
            return null;
        }
    }

    private Transform matchLanguage(Class class1)
        throws Exception
    {
        if (class1 == java/lang/Boolean)
        {
            return new BooleanTransform();
        }
        if (class1 == java/lang/Integer)
        {
            return new IntegerTransform();
        }
        if (class1 == java/lang/Long)
        {
            return new LongTransform();
        }
        if (class1 == java/lang/Double)
        {
            return new DoubleTransform();
        }
        if (class1 == java/lang/Float)
        {
            return new FloatTransform();
        }
        if (class1 == java/lang/Short)
        {
            return new ShortTransform();
        }
        if (class1 == java/lang/Byte)
        {
            return new ByteTransform();
        }
        if (class1 == java/lang/Character)
        {
            return new CharacterTransform();
        }
        if (class1 == java/lang/String)
        {
            return new StringTransform();
        }
        if (class1 == java/lang/Class)
        {
            return new ClassTransform();
        } else
        {
            return null;
        }
    }

    private Transform matchMath(Class class1)
        throws Exception
    {
        if (class1 == java/math/BigDecimal)
        {
            return new BigDecimalTransform();
        }
        if (class1 == java/math/BigInteger)
        {
            return new BigIntegerTransform();
        } else
        {
            return null;
        }
    }

    private Transform matchSQL(Class class1)
        throws Exception
    {
        if (class1 == java/sql/Time)
        {
            return new DateTransform(class1);
        }
        if (class1 == java/sql/Date)
        {
            return new DateTransform(class1);
        }
        if (class1 == java/sql/Timestamp)
        {
            return new DateTransform(class1);
        } else
        {
            return null;
        }
    }

    private Transform matchURL(Class class1)
        throws Exception
    {
        if (class1 == java/net/URL)
        {
            return new URLTransform();
        } else
        {
            return null;
        }
    }

    private Transform matchUtility(Class class1)
        throws Exception
    {
        if (class1 == java/util/Date)
        {
            return new DateTransform(class1);
        }
        if (class1 == java/util/Locale)
        {
            return new LocaleTransform();
        }
        if (class1 == java/util/Currency)
        {
            return new CurrencyTransform();
        }
        if (class1 == java/util/GregorianCalendar)
        {
            return new GregorianCalendarTransform();
        }
        if (class1 == java/util/TimeZone)
        {
            return new TimeZoneTransform();
        } else
        {
            return null;
        }
    }

    public Transform match(Class class1)
        throws Exception
    {
        String s = class1.getName();
        if (s.startsWith("java.lang"))
        {
            return matchLanguage(class1);
        }
        if (s.startsWith("java.util"))
        {
            return matchUtility(class1);
        }
        if (s.startsWith("java.net"))
        {
            return matchURL(class1);
        }
        if (s.startsWith("java.io"))
        {
            return matchFile(class1);
        }
        if (s.startsWith("java.sql"))
        {
            return matchSQL(class1);
        }
        if (s.startsWith("java.math"))
        {
            return matchMath(class1);
        } else
        {
            return matchEnum(class1);
        }
    }
}

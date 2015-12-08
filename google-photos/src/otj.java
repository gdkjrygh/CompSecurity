// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class otj extends qst
{

    private static final Pattern c = Pattern.compile("([+-])([0-9]{2})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?([+-])([0-9]{3})([0-9]{2})?([0-9]{2})?(\\.[0-9]+)?(?:[+-][0-9]+(?:\\.[0-9]+)?)?(?:CRS.*)?/");
    private double a;
    private double b;

    public otj()
    {
        super("\251xyz");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        int i = b.c(bytebuffer);
        b.a(bytebuffer, 2);
        bytebuffer = b.a(bytebuffer, i);
        Matcher matcher = c.matcher(bytebuffer);
        if (!matcher.matches())
        {
            b = (0.0D / 0.0D);
            a = (0.0D / 0.0D);
        } else
        {
            String s = matcher.group(1);
            bytebuffer = matcher.group(2);
            Object obj1 = matcher.group(3);
            Object obj = matcher.group(4);
            Object obj2 = matcher.group(5);
            double d;
            double d1;
            int j;
            if (obj2 != null)
            {
                if (obj != null)
                {
                    obj = String.valueOf(obj);
                    obj2 = String.valueOf(obj2);
                    double d2;
                    if (((String) (obj2)).length() != 0)
                    {
                        obj2 = ((String) (obj)).concat(((String) (obj2)));
                    } else
                    {
                        obj2 = new String(((String) (obj)));
                    }
                    obj = obj1;
                    obj1 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj2));
                } else
                if (obj1 != null)
                {
                    obj1 = String.valueOf(obj1);
                    obj2 = String.valueOf(obj2);
                    if (((String) (obj2)).length() != 0)
                    {
                        obj1 = ((String) (obj1)).concat(((String) (obj2)));
                    } else
                    {
                        obj1 = new String(((String) (obj1)));
                    }
                    obj2 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj));
                    obj = obj1;
                    obj1 = obj2;
                } else
                {
                    bytebuffer = String.valueOf(bytebuffer);
                    obj2 = String.valueOf(obj2);
                    if (((String) (obj2)).length() != 0)
                    {
                        bytebuffer = bytebuffer.concat(((String) (obj2)));
                    } else
                    {
                        bytebuffer = new String(bytebuffer);
                    }
                    obj2 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj));
                    obj = obj1;
                    obj1 = obj2;
                }
            } else
            {
                ByteBuffer bytebuffer2 = bytebuffer;
                bytebuffer = ((ByteBuffer) (obj));
                obj = obj1;
                obj1 = bytebuffer2;
            }
            d2 = Double.parseDouble(((String) (obj1)));
            if (obj != null)
            {
                d = Double.parseDouble(((String) (obj))) / 60D;
            } else
            {
                d = 0.0D;
            }
            if (bytebuffer != null)
            {
                d1 = Double.parseDouble(bytebuffer) / 3600D;
            } else
            {
                d1 = 0.0D;
            }
            if ("-".equals(s))
            {
                j = -1;
            } else
            {
                j = 1;
            }
            b = (double)j * (d + d2 + d1);
            if (b < -90D || b > 90D)
            {
                b = (0.0D / 0.0D);
            }
            s = matcher.group(6);
            bytebuffer = matcher.group(7);
            obj1 = matcher.group(8);
            obj = matcher.group(9);
            obj2 = matcher.group(10);
            if (obj2 != null)
            {
                if (obj != null)
                {
                    obj = String.valueOf(obj);
                    obj2 = String.valueOf(obj2);
                    if (((String) (obj2)).length() != 0)
                    {
                        obj2 = ((String) (obj)).concat(((String) (obj2)));
                    } else
                    {
                        obj2 = new String(((String) (obj)));
                    }
                    obj = obj1;
                    obj1 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj2));
                } else
                if (obj1 != null)
                {
                    obj1 = String.valueOf(obj1);
                    obj2 = String.valueOf(obj2);
                    if (((String) (obj2)).length() != 0)
                    {
                        obj1 = ((String) (obj1)).concat(((String) (obj2)));
                    } else
                    {
                        obj1 = new String(((String) (obj1)));
                    }
                    obj2 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj));
                    obj = obj1;
                    obj1 = obj2;
                } else
                {
                    bytebuffer = String.valueOf(bytebuffer);
                    obj2 = String.valueOf(obj2);
                    if (((String) (obj2)).length() != 0)
                    {
                        bytebuffer = bytebuffer.concat(((String) (obj2)));
                    } else
                    {
                        bytebuffer = new String(bytebuffer);
                    }
                    obj2 = bytebuffer;
                    bytebuffer = ((ByteBuffer) (obj));
                    obj = obj1;
                    obj1 = obj2;
                }
            } else
            {
                ByteBuffer bytebuffer1 = bytebuffer;
                bytebuffer = ((ByteBuffer) (obj));
                obj = obj1;
                obj1 = bytebuffer1;
            }
            d2 = Double.parseDouble(((String) (obj1)));
            if (obj != null)
            {
                d = Double.parseDouble(((String) (obj))) / 60D;
            } else
            {
                d = 0.0D;
            }
            if (bytebuffer != null)
            {
                d1 = Double.parseDouble(bytebuffer) / 3600D;
            } else
            {
                d1 = 0.0D;
            }
            if ("-".equals(s))
            {
                j = -1;
            } else
            {
                j = 1;
            }
            a = (double)j * (d + d2 + d1);
            if (a < -180D || a > 180D)
            {
                a = (0.0D / 0.0D);
                return;
            }
        }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        bax.b(bytebuffer, 18);
        bytebuffer.put(new byte[] {
            21, -57
        });
        long l1 = Math.round(b * 10000D);
        char c1;
        Locale locale;
        boolean flag;
        long l;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = l1;
        if (l1 < 0L)
        {
            l = -l1;
        }
        l1 = l / 10000L;
        locale = Locale.ENGLISH;
        if (flag)
        {
            c1 = '+';
        } else
        {
            c1 = '-';
        }
        bytebuffer.put(b.g(String.format(locale, "%c%02d.%04d", new Object[] {
            Character.valueOf(c1), Long.valueOf(l1), Long.valueOf(l % 10000L)
        })));
        l1 = Math.round(a * 10000D);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = l1;
        if (l1 < 0L)
        {
            l = -l1;
        }
        l1 = l / 10000L;
        locale = Locale.ENGLISH;
        if (flag)
        {
            c1 = '+';
        } else
        {
            c1 = '-';
        }
        bytebuffer.put(b.g(String.format(locale, "%c%03d.%04d", new Object[] {
            Character.valueOf(c1), Long.valueOf(l1), Long.valueOf(l % 10000L)
        })));
        bytebuffer.put(b.g("/"));
    }

    protected final long e()
    {
        return 22L;
    }

}

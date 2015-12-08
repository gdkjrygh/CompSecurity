// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.util:
//            UtcOffset

public final class PartialDate
{
    private static class Format
    {

        private int componentIndexes[];
        private Pattern regex;

        public boolean parse(PartialDate partialdate, String s)
        {
            boolean flag1 = true;
            Matcher matcher = regex.matcher(s);
            boolean flag;
            if (matcher.find())
            {
                int i = 0;
                do
                {
                    flag = flag1;
                    if (i >= componentIndexes.length)
                    {
                        break;
                    }
                    int j = componentIndexes[i];
                    if (j != -1)
                    {
                        String s1 = matcher.group(i + 1);
                        if (s1 != null)
                        {
                            s = s1;
                            if (s1.startsWith("+"))
                            {
                                s = s1.substring(1);
                            }
                            partialdate.components[j] = Integer.valueOf(s);
                        }
                    }
                    i++;
                } while (true);
            } else
            {
                flag = false;
            }
            return flag;
        }

        public transient Format(String s, int ai[])
        {
            regex = Pattern.compile((new StringBuilder()).append("^").append(s).append("$").toString());
            componentIndexes = ai;
        }
    }


    private static final int DATE = 2;
    private static final int HOUR = 3;
    private static final int MINUTE = 4;
    private static final int MONTH = 1;
    private static final int SECOND = 5;
    private static final int SKIP = -1;
    private static final int TIMEZONE_HOUR = 6;
    private static final int TIMEZONE_MINUTE = 7;
    private static final int YEAR = 0;
    private static final Format dateFormats[] = {
        new Format("(\\d{4})", new int[] {
            0
        }), new Format("(\\d{4})-(\\d{2})", new int[] {
            0, 1
        }), new Format("(\\d{4})-?(\\d{2})-?(\\d{2})", new int[] {
            0, 1, 2
        }), new Format("--(\\d{2})-?(\\d{2})", new int[] {
            1, 2
        }), new Format("--(\\d{2})", new int[] {
            1
        }), new Format("---(\\d{2})", new int[] {
            2
        })
    };
    private static final Format timeFormats[] = {
        new Format("(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            3, -1, 6, 7
        }), new Format("(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            3, 4, -1, 6, 7
        }), new Format("(\\d{2}):?(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            3, 4, 5, -1, 6, 7
        }), new Format("-(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            4, 5, -1, 6, 7
        }), new Format("-(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            4, -1, 6, 7
        }), new Format("--(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", new int[] {
            5, -1, 6, 7
        })
    };
    private static final String timezoneRegex = "(([-+]\\d{1,2}):?(\\d{2})?)?";
    final Integer components[];

    public PartialDate(Integer integer, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, UtcOffset utcoffset)
    {
        Object obj = null;
        super();
        components = new Integer[8];
        if (integer1 != null && (integer1.intValue() < 1 || integer1.intValue() > 12))
        {
            throw new IllegalArgumentException("Month must be between 1 and 12 inclusive.");
        }
        if (integer2 != null && (integer2.intValue() < 1 || integer2.intValue() > 31))
        {
            throw new IllegalArgumentException("Date must be between 1 and 31 inclusive.");
        }
        if (integer3 != null && (integer3.intValue() < 0 || integer3.intValue() > 23))
        {
            throw new IllegalArgumentException("Hour must be between 0 and 23 inclusive.");
        }
        if (integer4 != null && (integer4.intValue() < 0 || integer4.intValue() > 59))
        {
            throw new IllegalArgumentException("Minute must be between 0 and 59 inclusive.");
        }
        if (integer5 != null && (integer5.intValue() < 0 || integer5.intValue() > 59))
        {
            throw new IllegalArgumentException("Second must be between 0 and 59 inclusive.");
        }
        if (utcoffset != null && (utcoffset.getMinute() < 0 || utcoffset.getMinute() > 59))
        {
            throw new IllegalArgumentException("Timezone minute must be between 0 and 59 inclusive.");
        }
        if (integer != null && integer1 == null && integer2 != null)
        {
            throw new IllegalArgumentException("Invalid date component combination: year, date");
        }
        if (integer3 != null && integer4 == null && integer5 != null)
        {
            throw new IllegalArgumentException("Invalid time component combination: hour, second");
        }
        components[0] = integer;
        components[1] = integer1;
        components[2] = integer2;
        components[3] = integer3;
        components[4] = integer4;
        components[5] = integer5;
        integer1 = components;
        if (utcoffset == null)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(utcoffset.getHour());
        }
        integer1[6] = integer;
        integer1 = components;
        if (utcoffset == null)
        {
            integer = obj;
        } else
        {
            integer = Integer.valueOf(utcoffset.getMinute());
        }
        integer1[7] = integer;
    }

    public PartialDate(String s)
    {
        boolean flag1 = false;
        boolean flag = false;
        super();
        components = new Integer[8];
        String as[] = s.split("T");
        if (as.length == 1)
        {
            if (parseDate(s) || parseTime(s))
            {
                flag = true;
            }
        } else
        if (as[0].length() == 0)
        {
            flag = parseTime(as[1]);
        } else
        {
            flag = flag1;
            if (parseDate(as[0]))
            {
                flag = flag1;
                if (parseTime(as[1]))
                {
                    flag = true;
                }
            }
        }
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Could not parse date: ").append(s).toString());
        } else
        {
            return;
        }
    }

    public static PartialDate date(Integer integer, Integer integer1, Integer integer2)
    {
        return new PartialDate(integer, integer1, integer2, null, null, null, null);
    }

    public static PartialDate dateTime(Integer integer, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5)
    {
        return dateTime(integer, integer1, integer2, integer3, integer4, integer5, null);
    }

    public static PartialDate dateTime(Integer integer, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, UtcOffset utcoffset)
    {
        return new PartialDate(integer, integer1, integer2, integer3, integer4, integer5, utcoffset);
    }

    private boolean hasDate()
    {
        return getDate() != null;
    }

    private boolean hasHour()
    {
        return getHour() != null;
    }

    private boolean hasMinute()
    {
        return getMinute() != null;
    }

    private boolean hasMonth()
    {
        return getMonth() != null;
    }

    private boolean hasSecond()
    {
        return getSecond() != null;
    }

    private boolean hasTimezone()
    {
        return components[6] != null;
    }

    private boolean hasYear()
    {
        return getYear() != null;
    }

    private boolean parseDate(String s)
    {
        Format aformat[] = dateFormats;
        int j = aformat.length;
        for (int i = 0; i < j; i++)
        {
            if (aformat[i].parse(this, s))
            {
                return true;
            }
        }

        return false;
    }

    private boolean parseTime(String s)
    {
        Format aformat[] = timeFormats;
        int j = aformat.length;
        for (int i = 0; i < j; i++)
        {
            if (aformat[i].parse(this, s))
            {
                return true;
            }
        }

        return false;
    }

    public static PartialDate time(Integer integer, Integer integer1, Integer integer2)
    {
        return time(integer, integer1, integer2, null);
    }

    public static PartialDate time(Integer integer, Integer integer1, Integer integer2, UtcOffset utcoffset)
    {
        return new PartialDate(null, null, null, integer, integer1, integer2, utcoffset);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PartialDate)obj;
            if (!Arrays.equals(components, ((PartialDate) (obj)).components))
            {
                return false;
            }
        }
        return true;
    }

    public Integer getDate()
    {
        return components[2];
    }

    public Integer getHour()
    {
        return components[3];
    }

    public Integer getMinute()
    {
        return components[4];
    }

    public Integer getMonth()
    {
        return components[1];
    }

    public Integer getSecond()
    {
        return components[5];
    }

    public Integer[] getTimezone()
    {
        if (!hasTimezone())
        {
            return null;
        } else
        {
            return (new Integer[] {
                components[6], components[7]
            });
        }
    }

    public Integer getYear()
    {
        return components[0];
    }

    public boolean hasDateComponent()
    {
        return hasYear() || hasMonth() || hasDate();
    }

    public boolean hasTimeComponent()
    {
        return hasHour() || hasMinute() || hasSecond();
    }

    public int hashCode()
    {
        return Arrays.hashCode(components) + 31;
    }

    public String toDateAndOrTime(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        DecimalFormat decimalformat = new DecimalFormat("00");
        Object obj;
        String s;
        String s1;
        String s2;
        if (hasYear())
        {
            obj = getYear().toString();
        } else
        {
            obj = null;
        }
        if (hasMonth())
        {
            s = decimalformat.format(getMonth());
        } else
        {
            s = null;
        }
        if (hasDate())
        {
            s1 = decimalformat.format(getDate());
        } else
        {
            s1 = null;
        }
        if (flag)
        {
            s2 = "-";
        } else
        {
            s2 = "";
        }
        if (hasYear() && !hasMonth() && !hasDate())
        {
            stringbuilder.append(((String) (obj)));
        } else
        if (!hasYear() && hasMonth() && !hasDate())
        {
            stringbuilder.append("--").append(s);
        } else
        if (!hasYear() && !hasMonth() && hasDate())
        {
            stringbuilder.append("---").append(s1);
        } else
        if (hasYear() && hasMonth() && !hasDate())
        {
            stringbuilder.append(((String) (obj))).append("-").append(s);
        } else
        if (!hasYear() && hasMonth() && hasDate())
        {
            stringbuilder.append("--").append(s).append(s2).append(s1);
        } else
        {
            if (hasYear() && !hasMonth() && hasDate())
            {
                throw new IllegalStateException("Invalid date component combination: year, date");
            }
            if (hasYear() && hasMonth() && hasDate())
            {
                stringbuilder.append(((String) (obj))).append(s2).append(s).append(s2).append(s1);
            }
        }
        if (hasTimeComponent())
        {
            stringbuilder.append('T');
            if (hasHour())
            {
                obj = decimalformat.format(getHour());
            } else
            {
                obj = null;
            }
            if (hasMinute())
            {
                s = decimalformat.format(getMinute());
            } else
            {
                s = null;
            }
            if (hasSecond())
            {
                s1 = decimalformat.format(getSecond());
            } else
            {
                s1 = null;
            }
            if (flag)
            {
                s2 = ":";
            } else
            {
                s2 = "";
            }
            if (hasHour() && !hasMinute() && !hasSecond())
            {
                stringbuilder.append(((String) (obj)));
            } else
            if (!hasHour() && hasMinute() && !hasSecond())
            {
                stringbuilder.append("-").append(s);
            } else
            if (!hasHour() && !hasMinute() && hasSecond())
            {
                stringbuilder.append("--").append(s1);
            } else
            if (hasHour() && hasMinute() && !hasSecond())
            {
                stringbuilder.append(((String) (obj))).append(s2).append(s);
            } else
            if (!hasHour() && hasMinute() && hasSecond())
            {
                stringbuilder.append("-").append(s).append(s2).append(s1);
            } else
            {
                if (hasHour() && !hasMinute() && hasSecond())
                {
                    throw new IllegalStateException("Invalid time component combination: hour, second");
                }
                if (hasHour() && hasMinute() && hasSecond())
                {
                    stringbuilder.append(((String) (obj))).append(s2).append(s).append(s2).append(s1);
                }
            }
            if (hasTimezone())
            {
                obj = getTimezone();
                if (obj[1] == null)
                {
                    obj[1] = Integer.valueOf(0);
                }
                stringbuilder.append((new UtcOffset(obj[0].intValue(), obj[1].intValue())).toString(flag));
            }
        }
        return stringbuilder.toString();
    }

    public String toString()
    {
        return toDateAndOrTime(true);
    }

}

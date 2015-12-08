// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.util;

import java.io.Serializable;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class TimeSpanConverter
    implements Serializable
{

    private static final int AN_HOUR_AGO = 4;
    private static final int A_MINUTE_AGO = 2;
    private static final int NOW = 0;
    private static final int N_HOURS_AGO = 5;
    private static final int N_MINUTES_AGO = 3;
    private static final int N_SECONDS_AGO = 1;
    private static final int ONE_DAY_IN_SECONDS = 0x15180;
    private static final int ONE_HOUR_IN_SECONDS = 3600;
    private static final int ONE_MONTH_IN_SECONDS = 0x278d00;
    private static final long serialVersionUID = 0x315fa97e8ab96adaL;
    private final SimpleDateFormat dateMonth;
    private final SimpleDateFormat dateMonthYear;
    private final MessageFormat formats[];

    public TimeSpanConverter()
    {
        this(Locale.getDefault());
    }

    public TimeSpanConverter(Locale locale)
    {
        formats = new MessageFormat[6];
        String s = locale.getLanguage();
        if ("it".equals(s))
        {
            formats[0] = new MessageFormat("Ora");
            formats[1] = new MessageFormat("{0} secondi fa");
            formats[2] = new MessageFormat("1 minuto fa");
            formats[3] = new MessageFormat("{0} minuti fa");
            formats[4] = new MessageFormat("1 ora fa");
            formats[5] = new MessageFormat("{0} ore fa");
            dateMonth = new SimpleDateFormat("d MMM", locale);
            dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
            return;
        }
        if ("kr".equals(s))
        {
            formats[0] = new MessageFormat("\uC9C0\uAE08");
            formats[1] = new MessageFormat("{0}\uCD08 \uC804");
            formats[2] = new MessageFormat("1\uBD84 \uC804");
            formats[3] = new MessageFormat("{0}\uBD84 \uC804");
            formats[4] = new MessageFormat("1\uC2DC\uAC04 \uC804");
            formats[5] = new MessageFormat("{0} ore fa");
            dateMonth = new SimpleDateFormat("M\uC6D4 d\uC77C", locale);
            dateMonthYear = new SimpleDateFormat("yy\uB144 M\uC6D4 d\uC77C", locale);
            return;
        }
        if ("es".equals(s))
        {
            formats[0] = new MessageFormat("Ahora");
            formats[1] = new MessageFormat("hace {0} segundos");
            formats[2] = new MessageFormat("hace 1 munito");
            formats[3] = new MessageFormat("hace {0} munitos");
            formats[4] = new MessageFormat("hace 1 hora");
            formats[5] = new MessageFormat("hace {0} horas");
            dateMonth = new SimpleDateFormat("d MMM", locale);
            dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
            return;
        }
        if ("fr".equals(s))
        {
            formats[0] = new MessageFormat("Maintenant");
            formats[1] = new MessageFormat("Il y a {0} secondes");
            formats[2] = new MessageFormat("Il y a 1 minute");
            formats[3] = new MessageFormat("Il y a {0} minutes");
            formats[4] = new MessageFormat("Il y a 1 heure");
            formats[5] = new MessageFormat("Il y a {0} heures");
            dateMonth = new SimpleDateFormat("d MMM", locale);
            dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
            return;
        }
        if ("de".equals(s))
        {
            formats[0] = new MessageFormat("Jetzt");
            formats[1] = new MessageFormat("vor {0} Sekunden");
            formats[2] = new MessageFormat("vor 1 Minute");
            formats[3] = new MessageFormat("vor {0} Minuten");
            formats[4] = new MessageFormat("vor 1 Stunde");
            formats[5] = new MessageFormat("vor {0} Stunden");
            dateMonth = new SimpleDateFormat("d MMM", locale);
            dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
            return;
        }
        if ("ja".equals(s))
        {
            formats[0] = new MessageFormat("\u4ECA");
            formats[1] = new MessageFormat("{0}\u79D2\u524D");
            formats[2] = new MessageFormat("1\u5206\u524D");
            formats[3] = new MessageFormat("{0}\u5206\u524D");
            formats[4] = new MessageFormat("1\u6642\u9593\u524D");
            formats[5] = new MessageFormat("{0}\u6642\u9593\u524D");
            dateMonth = new SimpleDateFormat("M\u6708d\u65E5", locale);
            dateMonthYear = new SimpleDateFormat("yy\u5E74M\u6708d\u65E5", locale);
            return;
        } else
        {
            formats[0] = new MessageFormat("now");
            formats[1] = new MessageFormat("{0} seconds ago");
            formats[2] = new MessageFormat("1 minute ago");
            formats[3] = new MessageFormat("{0} minutes ago");
            formats[4] = new MessageFormat("1 hour ago");
            formats[5] = new MessageFormat("{0} hours ago");
            dateMonth = new SimpleDateFormat("d MMM", Locale.ENGLISH);
            dateMonthYear = new SimpleDateFormat("d MMM yy", Locale.ENGLISH);
            return;
        }
    }

    private String toTimeSpanString(int i)
    {
        if (i <= 1)
        {
            return formats[0].format(null);
        }
        if (i < 60)
        {
            return formats[1].format(((Object) (new Object[] {
                Integer.valueOf(i)
            })));
        }
        if (i < 2700)
        {
            i /= 60;
            if (i == 1)
            {
                return formats[2].format(null);
            } else
            {
                return formats[3].format(((Object) (new Object[] {
                    Integer.valueOf(i)
                })));
            }
        }
        if (i < 6300)
        {
            return formats[4].format(null);
        } else
        {
            i = (i + 900) / 3600;
            return formats[5].format(((Object) (new Object[] {
                Integer.valueOf(i)
            })));
        }
    }

    public final String toTimeSpanString(long l)
    {
        int i = (int)((System.currentTimeMillis() - l) / 1000L);
        if (i >= 0x15180)
        {
            if (i >= 0x278d00)
            {
                return dateMonthYear.format(new Date(l));
            } else
            {
                return dateMonth.format(new Date(l));
            }
        } else
        {
            return toTimeSpanString(i);
        }
    }

    public final String toTimeSpanString(Date date)
    {
        return toTimeSpanString(date.getTime());
    }
}

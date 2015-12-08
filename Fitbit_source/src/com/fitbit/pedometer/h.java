// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.os.Environment;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.e.a;
import com.htc.lib2.activeservice.TransportModeRecord;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class h
{

    private static final String a = "PedometerLogger";
    private static final String b = "fitbit.pedometer.files";
    private static volatile h c = new h();
    private BufferedWriter d;
    private BufferedWriter e;
    private BufferedWriter f;
    private File g;
    private File h;
    private File i;
    private final String j[] = {
        "MODE_STILL", "MODE_WALK", "MODE_RUN", "MODE_BICYCLE", "MODE_VEHICLE", "MODE_UPSTAIRS", "MODE_DOWNSTAIRS", "MODE_OTHERS", "MAX_MOVEMENT"
    };
    private boolean k;

    private h()
    {
    }

    public static h a()
    {
        return c;
    }

    private File a(String s)
    {
        s = new File(s);
        if (!s.isDirectory() && s.isFile())
        {
            a(((File) (s)));
        }
        return s;
    }

    private void a(File file)
    {
        if (!file.delete())
        {
            com.fitbit.e.a.e("PedometerLogger", (new StringBuilder()).append("warning: file ").append(file.getPath()).append(" was not deleted").toString(), new Object[0]);
        }
    }

    private File b(String s)
        throws IOException
    {
        s = new File(s);
        if (s.exists())
        {
            a(s);
        }
        s.createNewFile();
        return s;
    }

    private static String f()
    {
        Object obj = FitBitApplication.a().getExternalFilesDir(null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj = ((File) (obj)).getAbsolutePath();
        com.fitbit.e.a.a("PedometerLogger", "Raw pedometer logs directory: %s", new Object[] {
            obj
        });
        return ((String) (obj));
        obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append(File.separator).append("fitbit.pedometer.files").toString();
        com.fitbit.e.a.a("PedometerLogger", "Raw pedometer logs directory: %s", new Object[] {
            obj
        });
        return ((String) (obj));
        Exception exception;
        exception;
        com.fitbit.e.a.a("PedometerLogger", "Raw pedometer logs directory: %s", new Object[] {
            null
        });
        throw exception;
    }

    private SimpleDateFormat g()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    }

    public void a(PedometerMinuteData pedometerminutedata)
    {
        a(pedometerminutedata, "");
    }

    public void a(PedometerMinuteData pedometerminutedata, String s)
    {
        while (!k || pedometerminutedata == null) 
        {
            return;
        }
        pedometerminutedata = String.format("%s steps=%d, mets=%f, mode=%s [%s]", new Object[] {
            g().format(new Date(pedometerminutedata.a())), Integer.valueOf(pedometerminutedata.b()), Double.valueOf(pedometerminutedata.c()), pedometerminutedata.d().name(), s
        });
        try
        {
            f.append((new StringBuilder()).append(pedometerminutedata).append("\r\n").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PedometerMinuteData pedometerminutedata)
        {
            pedometerminutedata.printStackTrace();
        }
    }

    public void a(List list)
    {
        if (k)
        {
            SimpleDateFormat simpledateformat = g();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                TransportModeRecord transportmoderecord = (TransportModeRecord)iterator.next();
                String s = simpledateformat.format(new Date(transportmoderecord.getTimestamp()));
                try
                {
                    list = j[transportmoderecord.getMode()];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = (new StringBuilder()).append("unknown").append(transportmoderecord.getMode()).toString();
                }
                list = String.format("%s steps=%d, met=%f, period=%dms, mode=%s", new Object[] {
                    s, Integer.valueOf(transportmoderecord.getSteps()), Float.valueOf(transportmoderecord.getMET()), Integer.valueOf(transportmoderecord.getPeriod()), list
                });
                try
                {
                    d.append((new StringBuilder()).append(list).append("\r\n").toString());
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list.printStackTrace();
                }
            }
        }
    }

    public void b()
    {
        if (!k)
        {
            return;
        }
        try
        {
            d.flush();
            f.flush();
            e.flush();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void b(List list)
    {
        if (k)
        {
            SimpleDateFormat simpledateformat = g();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                TransportModeRecord transportmoderecord = (TransportModeRecord)iterator.next();
                String s = simpledateformat.format(new Date(transportmoderecord.getTimestamp()));
                try
                {
                    list = j[transportmoderecord.getMode()];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = (new StringBuilder()).append("unknown").append(transportmoderecord.getMode()).toString();
                }
                list = String.format("%s steps=%d, met=%f, period=%dms, mode=%s", new Object[] {
                    s, Integer.valueOf(transportmoderecord.getSteps()), Float.valueOf(transportmoderecord.getMET()), Integer.valueOf(transportmoderecord.getPeriod()), list
                });
                try
                {
                    e.append((new StringBuilder()).append(list).append("\r\n").toString());
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list.printStackTrace();
                }
            }
        }
    }

    public File c()
    {
        return g;
    }

    public File d()
    {
        return h;
    }

    public File e()
    {
        return i;
    }

}

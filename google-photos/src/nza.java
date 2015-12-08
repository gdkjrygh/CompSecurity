// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class nza
{

    private static final jz a;

    public static String a(String s)
    {
        String s1 = (String)a.get(s);
        if (s1 == null)
        {
            if (Log.isLoggable("BackgroundEndpoints", 3))
            {
                (new StringBuilder(String.valueOf(s).length() + 57)).append("Calling operation [").append(s).append("] from sync loop with no sync endpoint");
            }
            return s;
        } else
        {
            return s1;
        }
    }

    static 
    {
        boolean flag = false;
        String as[] = new String[15];
        as[0] = "getmobileexperiments";
        as[1] = "registerdevice";
        as[2] = "fetchnotifications";
        as[3] = "fetchnotificationscount";
        as[4] = "getphotossettings";
        as[5] = "getsimpleprofile";
        as[6] = "getmobilesettings";
        as[7] = "loadblockedpeople";
        as[8] = "loadpeople";
        as[9] = "loadsocialnetwork";
        as[10] = "getactivities";
        as[11] = "getvolumecontrols";
        as[12] = "readcollectionsbyid";
        as[13] = "syncuserhighlights";
        as[14] = "checkphotosexistence";
        String as1[] = new String[2];
        as1[0] = "getappupgradestatus";
        as1[1] = "postclientlogs";
        a = new jz(17);
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= 15)
            {
                break;
            }
            a.put(as[i], String.valueOf(as[i]).concat("background"));
            i++;
        } while (true);
        for (; j < 2; j++)
        {
            a.put(as1[j], as1[j]);
        }

    }
}

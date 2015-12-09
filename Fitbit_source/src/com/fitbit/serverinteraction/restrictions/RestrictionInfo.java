// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import java.io.Serializable;
import java.util.Locale;

public class RestrictionInfo
    implements Serializable
{

    public static final String a = "back_off";
    public static final String b = "warning";
    public static final String c = "version_update_required";
    public static final String d = "back_off_app_general";
    public static final String e = "back_off_version_update_required";
    public static final String f = "warning_version_update_required";
    public static final String g = "warning_mobile_track_sync_backed_off";
    public static final String h = "warning_device_sync_backed_off";
    public static final String i = "warning_device_pairing_backed_off";
    public static final String j = "warning_device_firmware_updates_backed_off";
    private static final long serialVersionUID = 0x1338c66bb3d267cbL;
    private boolean blocked;
    private String message;
    private String type;
    private boolean updateAvailable;
    private boolean warning;

    public RestrictionInfo(String s, String s1)
    {
        a(s, s1);
    }

    private void a(String s, String s1)
    {
        type = s.toLowerCase(Locale.ENGLISH);
        blocked = s.startsWith("back_off");
        warning = s.startsWith("warning");
        updateAvailable = s.endsWith("version_update_required");
        message = s1;
    }

    public static boolean a(RestrictionInfo restrictioninfo, RestrictionInfo restrictioninfo1)
    {
        return restrictioninfo == null && restrictioninfo1 == null || restrictioninfo != null && restrictioninfo.equals(restrictioninfo1);
    }

    public boolean a()
    {
        return updateAvailable;
    }

    public boolean b()
    {
        return blocked;
    }

    public boolean c()
    {
        return warning;
    }

    public String d()
    {
        return message;
    }

    public String e()
    {
        return type;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof RestrictionInfo))
            {
                return false;
            }
            obj = (RestrictionInfo)obj;
            if (!e().equals(e()) || !d().equals(((RestrictionInfo) (obj)).d()))
            {
                return false;
            }
        }
        return true;
    }
}

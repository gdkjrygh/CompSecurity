// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.text.TextUtils;
import com.fitbit.d.a;
import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareVersion

public class FirmwareUpdate
    implements b
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status LANG;
        public static final Status NO_CHANGE;
        public static final Status OPTIONAL;
        public static final Status REQUIRED;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/fitbit/data/domain/device/FirmwareUpdate$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            REQUIRED = new Status("REQUIRED", 0);
            OPTIONAL = new Status("OPTIONAL", 1);
            LANG = new Status("LANG", 2);
            NO_CHANGE = new Status("NO_CHANGE", 3);
            $VALUES = (new Status[] {
                REQUIRED, OPTIONAL, LANG, NO_CHANGE
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private Status a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private FirmwareVersion g;

    public FirmwareUpdate()
    {
    }

    public Status a()
    {
        return a;
    }

    public void a(FirmwareVersion firmwareversion)
    {
        g = firmwareversion;
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            a = Status.valueOf(s);
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(String s)
    {
        e = s;
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public boolean b()
    {
        return b;
    }

    public void c(String s)
    {
        f = s;
    }

    public void c(boolean flag)
    {
        d = flag;
    }

    public boolean c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public FirmwareVersion g()
    {
        return g;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a = Status.valueOf(jsonobject.getString("status"));
        b = com.fitbit.d.a.a(jsonobject, "isRequired", false).booleanValue();
        c = com.fitbit.d.a.a(jsonobject, "isVersion", false).booleanValue();
        d = com.fitbit.d.a.a(jsonobject, "isLang", false).booleanValue();
        g = com.fitbit.data.domain.device.FirmwareVersion.a(com.fitbit.d.a.a(jsonobject, "version"));
        e = com.fitbit.d.a.a(jsonobject, "versionFull");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        return null;
    }
}

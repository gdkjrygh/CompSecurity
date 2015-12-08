// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.id;

import android.content.Context;
import com.comscore.android.id.DeviceId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;

public class IdHelper
{

    private String a;
    private String b;
    private Storage c;
    private Context d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Boolean k;

    public IdHelper(Context context, Storage storage)
    {
        h = false;
        i = false;
        j = false;
        d = context;
        c = storage;
    }

    private void a()
    {
        DeviceId deviceid = IdHelperAndroid.getAdvertisingDeviceId(d);
        if (deviceid == null)
        {
            h = true;
            a(null, false);
            return;
        }
        if (deviceid.getCommonness() == 0 && deviceid.getPersistency() == 0)
        {
            a(deviceid.getId(), true);
            return;
        } else
        {
            a(deviceid.getId(), false);
            return;
        }
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            h = flag;
            String s1 = c.get("md5RawCrossPublisherId");
            if (g == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = Utils.md5(s);
            if (a(g))
            {
                a = c.get("crossPublisherId");
                return;
            }
            if (h && s1 != null && !s1.isEmpty() && s1 != g)
            {
                i = true;
                j = flag;
            }
            a = b(s);
            c.set("crossPublisherId", a);
            c.set("md5RawCrossPublisherId", g);
            return;
        } else
        {
            a = null;
            g = null;
            return;
        }
    }

    private boolean a(String s)
    {
        String s1 = c.get("md5RawCrossPublisherId");
        return s1 != null && s1.equals(s);
    }

    private String b(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.length() > 0)
            {
                try
                {
                    s1 = Utils.encrypt(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            }
        }
        return s1;
    }

    private void b()
    {
        if (c.has("vid").booleanValue())
        {
            b = c.get("vid");
        } else
        {
            Object obj = IdHelperAndroid.getDeviceId(d);
            String s = ((DeviceId) (obj)).getId();
            obj = (new StringBuilder()).append("-cs").append(((DeviceId) (obj)).getSuffix()).toString();
            if (b == null)
            {
                b = (new StringBuilder()).append(Utils.md5((new StringBuilder()).append(s).append(getPublisherSecret()).toString())).append(((String) (obj))).toString();
                c.set("vid", b);
                return;
            }
        }
    }

    private boolean c()
    {
        boolean flag = IdHelperAndroid.isAdvertisingIdEnabled(d);
        if (k == null)
        {
            k = Boolean.valueOf(flag);
        } else
        if (k.booleanValue() != flag)
        {
            a();
            return flag;
        }
        return flag;
    }

    public void generateIds()
    {
        if (isPublisherSecretEmpty())
        {
            return;
        } else
        {
            f = IdHelperAndroid.getDeviceId(d).getId();
            b();
            a();
            return;
        }
    }

    public String getAndroidId()
    {
        return f;
    }

    public String getCrossPublisherId()
    {
        if (h)
        {
            if (c())
            {
                a();
                if (i && !j)
                {
                    return "none";
                } else
                {
                    return a;
                }
            } else
            {
                return "none";
            }
        } else
        {
            return a;
        }
    }

    public String getMD5AdvertisingId()
    {
        if (h && c())
        {
            return g;
        } else
        {
            return null;
        }
    }

    public String getPublisherSecret()
    {
        if (e == null)
        {
            e = "";
        }
        return e;
    }

    public String getVisitorId()
    {
        return b;
    }

    public boolean isIdChanged()
    {
        return i;
    }

    public boolean isPublisherSecretEmpty()
    {
        return e == null || e.length() == 0;
    }

    public void setPublisherSecret(String s)
    {
        e = s;
    }
}

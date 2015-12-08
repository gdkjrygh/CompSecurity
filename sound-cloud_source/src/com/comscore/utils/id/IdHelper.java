// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.id;

import android.content.Context;
import com.comscore.analytics.Core;
import com.comscore.android.id.DeviceId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.applications.EventType;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils.id:
//            IdChecker

public class IdHelper
{

    private Core a;
    private String b;
    private String c;
    private Storage d;
    private Context e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Boolean l;
    private IdChecker m;

    public IdHelper(Context context, Storage storage, Core core)
    {
        i = false;
        j = false;
        k = false;
        e = context;
        d = storage;
        a = core;
        m = new IdChecker(e, storage);
    }

    private void a()
    {
        DeviceId deviceid = IdHelperAndroid.getAdvertisingDeviceId(e);
        if (deviceid == null)
        {
            i = true;
            a(null, false);
            return;
        }
        if (deviceid.getCommonness() == 0 && deviceid.getPersistency() == 0)
        {
            a(deviceid.getId(), true);
            return;
        }
        String s = d.get("md5RawCrossPublisherId");
        if (!m.checkCrossPublisherId(s))
        {
            d.remove("md5RawCrossPublisherId");
            d.remove("crossPublisherId");
            b = null;
            h = null;
        }
        a(deviceid.getId(), false);
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            i = flag;
            String s1 = d.get("md5RawCrossPublisherId");
            if (h == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h = Utils.md5(s);
            if (a(h))
            {
                b = d.get("crossPublisherId");
                return;
            }
            if (i && s1 != null && !s1.isEmpty() && s1 != h)
            {
                j = true;
                k = flag;
            }
            b = b(s);
            d.set("crossPublisherId", b);
            d.set("md5RawCrossPublisherId", h);
            return;
        } else
        {
            b = null;
            h = null;
            return;
        }
    }

    private boolean a(String s)
    {
        String s1 = d.get("md5RawCrossPublisherId");
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
label0:
        {
            if (d.has("vid").booleanValue())
            {
                c = d.get("vid");
                if (m.checkVisitorId())
                {
                    break label0;
                }
                HashMap hashmap = new HashMap();
                hashmap.put("cs_c12u", d.get("vid"));
                a.notify(EventType.AGGREGATE, hashmap, true);
                d.remove("vid");
                c = null;
            }
            Object obj = IdHelperAndroid.getDeviceId(e);
            String s = ((DeviceId) (obj)).getId();
            obj = (new StringBuilder()).append("-cs").append(((DeviceId) (obj)).getSuffix()).toString();
            if (c == null)
            {
                c = (new StringBuilder()).append(Utils.md5((new StringBuilder()).append(s).append(getPublisherSecret()).toString())).append(((String) (obj))).toString();
                d.set("vid", c);
            }
        }
    }

    private boolean c()
    {
        boolean flag = IdHelperAndroid.isAdvertisingIdEnabled(e);
        if (l == null)
        {
            l = Boolean.valueOf(flag);
        } else
        if (l.booleanValue() != flag)
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
            g = IdHelperAndroid.getDeviceId(e).getId();
            b();
            a();
            return;
        }
    }

    public String getAndroidId()
    {
        return g;
    }

    public String getCrossPublisherId()
    {
        if (i)
        {
            if (c())
            {
                a();
                if (j && !k)
                {
                    return "none";
                } else
                {
                    return b;
                }
            } else
            {
                return "none";
            }
        } else
        {
            return b;
        }
    }

    public String getMD5AdvertisingId()
    {
        if (i && c())
        {
            return h;
        } else
        {
            return null;
        }
    }

    public String getPublisherSecret()
    {
        if (f == null)
        {
            f = "";
        }
        return f;
    }

    public String getVisitorId()
    {
        return c;
    }

    public boolean isIdChanged()
    {
        return j;
    }

    public boolean isPublisherSecretEmpty()
    {
        return f == null || f.length() == 0;
    }

    public void resetVisitorId()
    {
        c = null;
        if (!d.has("vid").booleanValue())
        {
            return;
        } else
        {
            d.remove("vid");
            generateIds();
            return;
        }
    }

    public void setPublisherSecret(String s)
    {
        f = s;
    }
}

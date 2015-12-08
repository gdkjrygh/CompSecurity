// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import com.microsoft.advertising.android.AdControl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdControlManager, ConfigManager, SkypeAdPlacer

final class b
    implements Runnable
{

    final boolean a = true;
    final JSONObject b;
    final SkypeAdControlManager c;

    public final void run()
    {
        if (SkypeAdControlManager.a(c).isEmpty())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (ConfigManager.g())
        {
            Iterator iterator = SkypeAdControlManager.a(c).keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (ConfigManager.b(s) && SkypeAdPlacer.a().b(s))
                {
                    Object obj = (c)SkypeAdControlManager.a(c).get(s);
                    obj = SkypeAdControlManager.a(c, ((c) (obj)).a, ((a) (obj)).b, ((b) (obj)).c, ((c) (obj)).d, ((d) (obj)).e);
                    SkypeAdPlacer.a().a(s, ((AdControl) (obj)));
                }
            } while (true);
        }
        SkypeAdControlManager.a(c).clear();
        if (!a) goto _L2; else goto _L1
_L1:
        String as[];
        String s1;
        int j;
        Set set = SkypeAdControlManager.b(c).keySet();
        as = (String[])set.toArray(new String[set.size()]);
        s1 = ConfigManager.h();
        j = as.length;
        int i = 0;
_L4:
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = as[i];
        obj1 = (AdControl)SkypeAdControlManager.b(c).get(obj1);
        SkypeAdPlacer.a();
        String s2 = SkypeAdPlacer.a(((AdControl) (obj1)));
        String s3 = ConfigManager.a(s1, s2);
        SkypeAdControlManager.a(c, ((AdControl) (obj1)), s2, s3);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (!ConfigManager.g()) goto _L6; else goto _L5
_L5:
        SkypeAdPlacer.a().d();
        SkypeAdPlacer.a();
        as = SkypeAdPlacer.b();
        i = 0;
_L10:
        if (i >= 4) goto _L2; else goto _L7
_L7:
        s1 = as[i];
        if (!ConfigManager.b(s1))
        {
            SkypeAdPlacer.a().a(s1);
        }
          goto _L8
_L6:
        try
        {
            SkypeAdPlacer.a().c();
            return;
        }
        catch (Exception exception) { }
_L2:
        return;
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    (SkypeAdControlManager skypeadcontrolmanager, JSONObject jsonobject)
    {
        c = skypeadcontrolmanager;
        b = jsonobject;
        super();
    }
}

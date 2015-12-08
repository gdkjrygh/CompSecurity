// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import com.google.android.libraries.translate.core.Singleton;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ad, OfflinePackage, e, LocationProfileProf

public final class am extends ad
{

    public am(Context context, LocationProfileProf locationprofileprof, e e1)
    {
        super(context, locationprofileprof, e1);
    }

    public static String[] c(String s)
    {
        int i1 = s.indexOf("_");
        if (i1 + 1 < s.length())
        {
            return (new String[] {
                s.substring(0, i1), s.substring(i1 + 1)
            });
        } else
        {
            return null;
        }
    }

    private List f(OfflinePackage offlinepackage)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = offlinepackage.a;
        String as[] = c(offlinepackage.a);
        offlinepackage = a(j, offlinepackage.g, offlinepackage.h);
        offlinepackage = (new StringBuilder(String.valueOf(offlinepackage).length() + 6 + String.valueOf(s1).length())).append(offlinepackage).append("/lang.").append(s1).toString();
        arraylist.add(String.valueOf(offlinepackage).concat("/dlc.props"));
        arraylist.add((new StringBuilder(String.valueOf(offlinepackage).length() + 11 + String.valueOf(s1).length())).append(offlinepackage).append("/simpl_").append(s1).append(".bin").toString());
        if (!"en".equals(as[0]))
        {
            String s2 = as[0];
            arraylist.add((new StringBuilder(String.valueOf(offlinepackage).length() + 15 + String.valueOf(s2).length())).append(offlinepackage).append("/char_info_").append(s2).append(".bin").toString());
            String s = as[0];
            arraylist.add((new StringBuilder(String.valueOf(offlinepackage).length() + 29 + String.valueOf(s).length())).append(offlinepackage).append("/exported_brain_").append(s).append(".computegraph").toString());
        }
        arraylist.add(offlinepackage);
        return arraylist;
    }

    protected final boolean a(e e1, OfflinePackage offlinepackage)
    {
        boolean flag = false;
        offlinepackage = f(offlinepackage).iterator();
        int i1 = 0;
        do
        {
            if (!offlinepackage.hasNext())
            {
                break;
            }
            if (!e1.a((String)offlinepackage.next()))
            {
                i1++;
            }
        } while (true);
        if (i1 == 0)
        {
            flag = true;
        }
        return flag;
    }

    protected final void a_(String s)
    {
        String as[] = c(s);
        if (as != null)
        {
            s = c.getCacheDir().getAbsolutePath();
            String s1 = as[0];
            String s2 = as[1];
            s = new File(s, (new StringBuilder(String.valueOf(s1).length() + 10 + String.valueOf(s2).length())).append("dict_").append(s1).append("_").append(s2).append(".bin").toString());
            if (s.exists())
            {
                s.delete();
            }
        }
    }

    protected final void e(OfflinePackage offlinepackage)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        for (Iterator iterator = f(offlinepackage).iterator(); iterator.hasNext(); j.d(s1))
        {
            s1 = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_50;
        offlinepackage;
        throw offlinepackage;
        String s = Singleton.a().getCacheDir().getAbsolutePath();
        offlinepackage = offlinepackage.a;
        offlinepackage = (new StringBuilder(String.valueOf(s).length() + 10 + String.valueOf(offlinepackage).length())).append(s).append("/dict_").append(offlinepackage).append(".bin").toString();
        j.d(offlinepackage);
        this;
        JVM INSTR monitorexit ;
    }

    protected final String i()
    {
        return "wl";
    }

    protected final int j()
    {
        return 1;
    }

    protected final String k()
    {
        return "pmv2_com_mv_wl";
    }

    protected final String l()
    {
        return "pmv2_fl_mv_wl";
    }

    protected final String m()
    {
        return "pmv2_pkg_mv_wl";
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionInfo

class a
{

    private static final String a = "com.fitbit.serverinteraction.restrictions.RestrictionsHolder.BLOCKER_RESTRICTION_MESSAGE_KEY";
    private static final String b = "com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_MESSAGE_KEY";
    private static final String c = "com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_TYPE_KEY";
    private static final Object d = new Object();
    private static final Object e = new Object();
    private static RestrictionInfo f;
    private static RestrictionInfo g;

    a()
    {
    }

    public static RestrictionInfo a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.BLOCKER_RESTRICTION_MESSAGE_KEY", null);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        f = new RestrictionInfo("back_off", ((String) (obj1)));
        obj1 = f;
        obj;
        JVM INSTR monitorexit ;
        return ((RestrictionInfo) (obj1));
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean a(RestrictionInfo restrictioninfo)
    {
        String s;
label0:
        {
            synchronized (d)
            {
                if (!RestrictionInfo.a(restrictioninfo, a()))
                {
                    break label0;
                }
            }
            return false;
        }
        s = null;
        if (restrictioninfo == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s = restrictioninfo.d();
        PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit().putString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.BLOCKER_RESTRICTION_MESSAGE_KEY", s).commit();
        f = restrictioninfo;
        obj;
        JVM INSTR monitorexit ;
        return true;
        restrictioninfo;
        obj;
        JVM INSTR monitorexit ;
        throw restrictioninfo;
    }

    public static RestrictionInfo b()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj2 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        obj1 = ((SharedPreferences) (obj2)).getString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_TYPE_KEY", null);
        obj2 = ((SharedPreferences) (obj2)).getString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_MESSAGE_KEY", null);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        g = new RestrictionInfo(((String) (obj1)), ((String) (obj2)));
        obj1 = g;
        obj;
        JVM INSTR monitorexit ;
        return ((RestrictionInfo) (obj1));
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean b(RestrictionInfo restrictioninfo)
    {
        String s;
label0:
        {
            s = null;
            synchronized (e)
            {
                if (!RestrictionInfo.a(restrictioninfo, b()))
                {
                    break label0;
                }
            }
            return false;
        }
        if (restrictioninfo == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        String s1;
        s1 = restrictioninfo.e();
        s = restrictioninfo.d();
_L1:
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        sharedpreferences.edit().putString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_TYPE_KEY", s1).commit();
        sharedpreferences.edit().putString("com.fitbit.serverinteraction.restrictions.RestrictionsHolder.UPDATE_RESTRICTION_MESSAGE_KEY", s).commit();
        g = restrictioninfo;
        obj;
        JVM INSTR monitorexit ;
        return true;
        restrictioninfo;
        obj;
        JVM INSTR monitorexit ;
        throw restrictioninfo;
        s1 = null;
          goto _L1
    }

}

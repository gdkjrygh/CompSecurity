// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.internal;

import adk;
import adl;
import adm;
import adp;
import aej;
import aek;
import ael;
import aem;
import aeo;
import aeq;
import aer;
import aet;
import aev;
import aey;
import aez;
import agy;
import ahi;
import ahn;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class SdkManager extends Enum
{

    public static final SdkManager a;
    public static final ahn b = ahn.a("connected.car.sdk");
    private static final SdkManager c[];
    public String mApplicationName;
    public String mCurrentIdent;
    public Handler mHandler;
    public final Map mIdentObjectMap = new HashMap();
    public final Map mIdentTargetMap = new HashMap();
    public final Map mScreenIdentMap = new HashMap();
    public Stack mScreens;

    private SdkManager(String s)
    {
        super(s, 0);
        mCurrentIdent = "";
        mScreens = new Stack();
        mHandler = new Handler();
    }

    static ahn d()
    {
        return b;
    }

    public static SdkManager valueOf(String s)
    {
        return (SdkManager)Enum.valueOf(com/bmwgroup/connected/car/internal/SdkManager, s);
    }

    public static SdkManager[] values()
    {
        return (SdkManager[])c.clone();
    }

    public final Object a(String s)
    {
        return mIdentObjectMap.get(s);
    }

    public final String a()
    {
        b.a("getCurrentIdent() -> %s -> %s", new Object[] {
            mCurrentIdent, mApplicationName
        });
        return mCurrentIdent;
    }

    public final String a(adm adm1)
    {
        String s = null;
        String s1;
        ahn ahn1;
        if (adm1 instanceof ahi)
        {
            s = "P";
        } else
        if (adm1 instanceof aem)
        {
            s = "Ba";
        } else
        if (adm1 instanceof ael)
        {
            s = "Bb";
        } else
        if (adm1 instanceof aek)
        {
            s = "Bc";
        } else
        if (adm1 instanceof aej)
        {
            s = "Bd";
        } else
        if (adm1 instanceof aeo)
        {
            s = "D";
        } else
        if (adm1 instanceof agy)
        {
            s = "L";
        } else
        if (adm1 instanceof aev)
        {
            s = "If";
        } else
        if (adm1 instanceof aey)
        {
            s = "Is";
        } else
        if (adm1 instanceof aet)
        {
            s = "Fa";
        } else
        if (adm1 instanceof aeq)
        {
            s = "Fb";
        } else
        if (adm1 instanceof aer)
        {
            s = "Fc";
        }
        ahn1 = b;
        if (s == null)
        {
            s1 = "null";
        } else
        {
            s1 = s;
        }
        ahn1.a("getScreenIdentForListener(%s) = %s -> %s", new Object[] {
            adm1, s1, mApplicationName
        });
        return s;
    }

    public final String a(String s, adk adk1, boolean flag)
    {
        String s1;
        String s2;
        b.a("putTarget(%s, %s)-> %s", new Object[] {
            s, adk1, mApplicationName
        });
        mIdentTargetMap.put(s, adk1);
        b.a("getIdentForListener(%s)-> %s", new Object[] {
            adk1, mApplicationName
        });
        s2 = (String)mScreenIdentMap.get(adk1);
        s1 = s2;
        if (adk1 == null) goto _L2; else goto _L1
_L1:
        s1 = s2;
        if (!(adk1 instanceof adm)) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        mScreenIdentMap.put(adk1, s);
        s1 = s;
_L2:
        mIdentTargetMap.put(s1, adk1);
        b.a("putTarget(%s, %s) -> %s", new Object[] {
            s, adk1, s1
        });
        return s1;
_L5:
        s1 = s2;
        if (s2 == null)
        {
            if (s.isEmpty())
            {
                s1 = a((adm)adk1);
            } else
            {
                s1 = String.format("%s/%s", new Object[] {
                    s, a((adm)adk1)
                });
            }
            mScreenIdentMap.put(adk1, s1);
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void a(String s, Object obj)
    {
        b.a("putObject(%s, %s)-> %s", new Object[] {
            s, obj, mApplicationName
        });
        mIdentObjectMap.put(s, obj);
    }

    public final adk b(String s)
    {
        b.a("getTargetForIdent(%s)-> %s", new Object[] {
            s, mApplicationName
        });
        return (adk)mIdentTargetMap.get(s);
    }

    public final adl b()
    {
        if (!mScreens.isEmpty())
        {
            return (adl)mScreens.peek();
        } else
        {
            b.a("getActiveScreen() returns NULL", new Object[0]);
            return null;
        }
    }

    public final adp c()
    {
        return (adp)b(mApplicationName);
    }

    static 
    {
        a = new SdkManager("INSTANCE");
        c = (new SdkManager[] {
            a
        });
    }

    // Unreferenced inner class com/bmwgroup/connected/car/internal/SdkManager$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private adm a;
        private aez b;

        public final void run()
        {
            SdkManager.d().a("notifying listener.onCreate()", new Object[0]);
            a.a(b);
        }

            public 
            {
                a = adm1;
                b = aez;
                super();
            }
    }


    // Unreferenced inner class com/bmwgroup/connected/car/internal/SdkManager$2

/* anonymous class */
    public final class _cls2
        implements Runnable
    {

        private adm a;

        public final void run()
        {
            SdkManager.d().a("notifying listener.onEnter()", new Object[0]);
            a.a();
        }

            public 
            {
                a = adm1;
                super();
            }
    }


    // Unreferenced inner class com/bmwgroup/connected/car/internal/SdkManager$3

/* anonymous class */
    public final class _cls3
        implements Runnable
    {

        private adm a;

        public final void run()
        {
            SdkManager.d().a("notifying listener.onExit()", new Object[0]);
            a.b();
        }

            public 
            {
                a = adm1;
                super();
            }
    }


    // Unreferenced inner class com/bmwgroup/connected/car/internal/SdkManager$4

/* anonymous class */
    public final class _cls4
        implements Runnable
    {

        private adm a;
        private aez b;

        public final void run()
        {
            SdkManager.d().a("notifying listener.onDestroy()", new Object[0]);
            a.c();
            b.a.b("setListener(%s)", new Object[] {
                null
            });
        }

            public 
            {
                a = adm1;
                b = aez1;
                super();
            }
    }

}

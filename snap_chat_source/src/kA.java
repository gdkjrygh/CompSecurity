// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.util.debug.ReleaseManager;
import javax.inject.Provider;

public final class kA
    implements afq
{

    private static boolean o;
    private final afq a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Provider i;
    private final Provider j;
    private final Provider k;
    private final Provider l;
    private final Provider m;
    private final Provider n;

    private kA(afq afq1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        if (!o && afq1 == null)
        {
            throw new AssertionError();
        }
        a = afq1;
        if (!o && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!o && provider1 == null)
        {
            throw new AssertionError();
        }
        c = provider1;
        if (!o && provider2 == null)
        {
            throw new AssertionError();
        }
        d = provider2;
        if (!o && provider3 == null)
        {
            throw new AssertionError();
        }
        e = provider3;
        if (!o && provider4 == null)
        {
            throw new AssertionError();
        }
        f = provider4;
        if (!o && provider5 == null)
        {
            throw new AssertionError();
        }
        g = provider5;
        if (!o && provider6 == null)
        {
            throw new AssertionError();
        }
        h = provider6;
        if (!o && provider7 == null)
        {
            throw new AssertionError();
        }
        i = provider7;
        if (!o && provider8 == null)
        {
            throw new AssertionError();
        }
        j = provider8;
        if (!o && provider9 == null)
        {
            throw new AssertionError();
        }
        k = provider9;
        if (!o && provider10 == null)
        {
            throw new AssertionError();
        }
        l = provider10;
        if (!o && provider11 == null)
        {
            throw new AssertionError();
        }
        m = provider11;
        if (!o && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            n = provider12;
            return;
        }
    }

    public static afq a(afq afq1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new kA(afq1, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public final void a(Object obj)
    {
        obj = (SnapchatApplication)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a.a(obj);
            obj.mSlightlySecurePreferences = (KO)b.get();
            obj.mReleaseManager = (ReleaseManager)c.get();
            obj.mStrictModeHelper = (LL)d.get();
            obj.mAdManager = (kG)e.get();
            obj.mDiscoverRepository = (vJ)f.get();
            obj.mDiscoverMediaManager = (uL)g.get();
            obj.mScreenDimensionProvider = (mB)h.get();
            obj.mDeviceVideoEncodingResolutionSet = (rC)i.get();
            obj.mDeveloperSettings = (LA)j.get();
            obj.mSnapchatServiceManager = (Ei)k.get();
            obj.mDiscoverBrandIconProvider = (wm)l.get();
            obj.mAppInstallLogger = (ko)m.get();
            obj.mStoryLoader = (sX)n.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kA.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
    }
}

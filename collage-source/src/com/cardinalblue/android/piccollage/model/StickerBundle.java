// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcelable;
import com.cardinalblue.android.piccollage.controller.a.k;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            n, InstallRequirement

public abstract class StickerBundle
    implements Parcelable
{

    private com.cardinalblue.android.piccollage.controller.a.k.b a;
    protected List b;

    public StickerBundle()
    {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract float d();

    public abstract String e();

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof StickerBundle))
        {
            return false;
        } else
        {
            return ((StickerBundle)obj).f().equals(f());
        }
    }

    public abstract String f();

    public abstract boolean g();

    public abstract n h();

    public abstract boolean i();

    public abstract List j();

    public abstract InstallRequirement k();

    public String l()
    {
        return null;
    }

    public com.cardinalblue.android.piccollage.controller.a.k.b o()
    {
        if (a == null)
        {
            a = com.cardinalblue.android.piccollage.controller.a.k.a(k());
        }
        return a;
    }

    public String toString()
    {
        return f();
    }
}

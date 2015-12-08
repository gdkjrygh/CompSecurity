// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public interface dpx
{

    public static final dpx a = new dpx() {

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
        {
            throw new IllegalStateException("Click delegate not set");
        }

        public final void a(drz drz, int i)
        {
            throw new IllegalStateException("Click delegate not set");
        }

    };

    public abstract void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j);

    public abstract void a(drz drz, int i);

}

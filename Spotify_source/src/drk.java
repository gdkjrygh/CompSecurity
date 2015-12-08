// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public interface drk
    extends drh, dry, dsb
{

    public static final ghl b = new ghl() {

        public final Object a(Object obj)
        {
            return new dss((drk)obj);
        }

    };

    public abstract dru getAccessoryRight();

    public abstract CharSequence getCaption();

    public abstract PorcelainImage getImage();

    public abstract PorcelainNavigationLink getLongClickLink();

    public abstract drz getPlayable();

    public abstract boolean isEnabled();

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public interface dri
    extends drf
{

    public static final ghl b = new ghl() {

        public final Object a(Object obj)
        {
            return new dsr((dri)obj);
        }

    };

    public abstract String getBackgroundImageUri();

    public abstract PorcelainIcon getIcon();

    public abstract PorcelainNavigationLink getLink();

    public abstract PorcelainNavigationLink getLongClickLink();

    public abstract drz getPlayable();

    public abstract String getTitle();

}

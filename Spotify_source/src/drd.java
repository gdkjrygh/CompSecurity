// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public interface drd
    extends drf
{

    public static final ghl b = new ghl() {

        public final Object a(Object obj)
        {
            return new dso((drd)obj);
        }

    };

    public abstract PorcelainNavigationLink getButtonLink();

    public abstract String getButtonText();

    public abstract String getTitle();

}

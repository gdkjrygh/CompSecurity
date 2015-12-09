// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.model.menu;

import com.google.common.base.Optional;
import fui;
import fxn;
import fxp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SpotifyContextMenu
{

    public fxn a;
    public String b;
    public HeaderViewType c;
    public List d;
    public Optional e;

    public SpotifyContextMenu()
    {
        c = HeaderViewType.a;
        d = new ArrayList();
        e = Optional.e();
        a = new fxn();
    }

    public final SpotifyContextMenu a(String s)
    {
        a.a = s;
        return this;
    }

    public final fxp a(int i, CharSequence charsequence)
    {
        charsequence = new fxp(i, charsequence);
        d.add(charsequence);
        return charsequence;
    }

    public final void a()
    {
        d.clear();
    }

    public final void a(fui fui1)
    {
        e = Optional.b(fui1);
        fui1.c = this;
    }

    public final SpotifyContextMenu b(String s)
    {
        a.e = s;
        return this;
    }

    public final fui b()
    {
        return (fui)e.c();
    }

    public final boolean c()
    {
        return e.b() && !((fui)e.c()).b.get();
    }

    private class HeaderViewType extends Enum
    {

        public static final HeaderViewType a;
        public static final HeaderViewType b;
        private static final HeaderViewType c[];

        public static HeaderViewType valueOf(String s)
        {
            return (HeaderViewType)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/model/menu/SpotifyContextMenu$HeaderViewType, s);
        }

        public static HeaderViewType[] values()
        {
            return (HeaderViewType[])c.clone();
        }

        static 
        {
            a = new HeaderViewType("TWO_LINE_SQUARE_IMAGE", 0);
            b = new HeaderViewType("TWO_LINE_LANDSCAPE_IMAGE", 1);
            c = (new HeaderViewType[] {
                a, b
            });
        }

        private HeaderViewType(String s, int i)
        {
            super(s, i);
        }
    }

}

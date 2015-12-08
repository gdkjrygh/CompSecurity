// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.shortcuts;

import me.lyft.android.domain.location.Location;

// Referenced classes of package me.lyft.android.domain.shortcuts:
//            ShortcutType

public final class Shortcut
{

    private Location location;
    private ShortcutType type;

    private Shortcut(ShortcutType shortcuttype, Location location1)
    {
        type = shortcuttype;
        location = location1;
    }

    public static Shortcut create(ShortcutType shortcuttype, Location location1)
    {
        return new Shortcut(shortcuttype, location1);
    }

    public Location getLocation()
    {
        return location;
    }

    public ShortcutType getType()
    {
        return type;
    }

    public boolean isHome()
    {
        return type == ShortcutType.HOME;
    }

    public boolean isWork()
    {
        return type == ShortcutType.WORK;
    }
}

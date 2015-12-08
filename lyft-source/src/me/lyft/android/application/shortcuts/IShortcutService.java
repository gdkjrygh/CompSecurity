// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.shortcuts;

import java.util.List;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.ShortcutType;
import rx.Observable;

public interface IShortcutService
{

    public abstract List getShortcuts();

    public abstract Observable saveShortcut(ShortcutType shortcuttype, Location location);
}

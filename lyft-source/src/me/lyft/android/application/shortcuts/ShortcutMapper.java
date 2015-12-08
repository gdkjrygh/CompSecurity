// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.shortcuts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.domain.shortcuts.ShortcutType;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.ShortcutDTO;

public class ShortcutMapper
{

    public ShortcutMapper()
    {
    }

    public static Shortcut fromDTO(ShortcutDTO shortcutdto)
    {
        ShortcutType shortcuttype;
        if ("work".equals(shortcutdto.getLabel()))
        {
            shortcuttype = ShortcutType.WORK;
        } else
        {
            shortcuttype = ShortcutType.HOME;
        }
        return Shortcut.create(shortcuttype, LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(shortcutdto.getPlace(), NullLocationDTO.getInstance())));
    }

    public static List fromDTOs(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromDTO((ShortcutDTO)list.next()))) { }
        return arraylist;
    }
}

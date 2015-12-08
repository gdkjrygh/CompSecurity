// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationActionButton, LocalizableRemoteInput

public static class buttonId
{

    private String buttonId;
    private String description;
    private List extenders;
    private int iconId;
    private boolean isForegroundAction;
    private int labelId;
    private List remoteInputs;

    public buttonId addRemoteInput(LocalizableRemoteInput localizableremoteinput)
    {
        if (remoteInputs == null)
        {
            remoteInputs = new ArrayList();
        }
        remoteInputs.add(localizableremoteinput);
        return this;
    }

    public NotificationActionButton build()
    {
        Object obj = new android.support.v4.app.(iconId, null, null);
        if (extenders != null)
        {
            for (Iterator iterator = extenders.iterator(); iterator.hasNext(); ((android.support.v4.app.) (obj)).extend((android.support.v4.app.r)iterator.next())) { }
        }
        obj = ((android.support.v4.app.) (obj)).build();
        return new NotificationActionButton(buttonId, ((android.support.v4.app.tton.Builder.buttonId) (obj)).buttonId, labelId, description, ((android.support.v4.app.tton.Builder.description) (obj)).as(), isForegroundAction, remoteInputs, null);
    }

    public remoteInputs extend(android.support.v4.app.r r)
    {
        if (extenders == null)
        {
            extenders = new ArrayList();
        }
        extenders.add(r);
        return this;
    }

    public extenders setDescription(String s)
    {
        description = s;
        return this;
    }

    public description setIcon(int i)
    {
        iconId = i;
        return this;
    }

    public iconId setLabel(int i)
    {
        labelId = i;
        return this;
    }

    public labelId setPerformsInForeground(boolean flag)
    {
        isForegroundAction = flag;
        return this;
    }

    public (String s)
    {
        labelId = 0;
        iconId = 0;
        isForegroundAction = true;
        buttonId = s;
    }
}

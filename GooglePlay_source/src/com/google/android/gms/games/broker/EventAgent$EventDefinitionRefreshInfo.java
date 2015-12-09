// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.broker:
//            EventAgent

private static final class <init>
{

    public final HashSet deletedDefinitions;
    public final ArrayList newEventDefinitions;
    public final ArrayList ops;

    private ()
    {
        ops = new ArrayList();
        deletedDefinitions = new HashSet();
        newEventDefinitions = new ArrayList();
    }

    newEventDefinitions(byte byte0)
    {
        this();
    }
}

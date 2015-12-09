// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxCardViewDefinition

public static interface kListener
{

    public abstract void setAvatarRowClickListener(kListener klistener);

    public abstract void setAvatarRowClickable(boolean flag);

    public abstract void setAvatarRowData(ArrayList arraylist, int i);

    public abstract void setAvatarRowDescription(String s);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxCardViewDefinition

public static interface 
{

    public abstract void resizeSnippet();

    public abstract void setSnippetImage(Player player);

    public abstract void setSnippetSubtitle(String s);

    public abstract void setSnippetSubtitleSingleLine(boolean flag);

    public abstract void setSnippetTitle(String s);

    public abstract void setSnippetTitleSingleLine(boolean flag);
}

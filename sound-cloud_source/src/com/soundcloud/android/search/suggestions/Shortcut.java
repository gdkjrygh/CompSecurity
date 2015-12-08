// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            AutoValue_Shortcut

public abstract class Shortcut
{

    public Shortcut()
    {
    }

    public static Shortcut create(Urn urn, String s)
    {
        return new AutoValue_Shortcut(urn, s);
    }

    public abstract String getDisplayText();

    public abstract Urn getUrn();
}

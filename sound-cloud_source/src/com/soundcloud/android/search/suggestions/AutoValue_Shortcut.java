// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            Shortcut

final class AutoValue_Shortcut extends Shortcut
{

    private final String displayText;
    private final Urn urn;

    AutoValue_Shortcut(Urn urn1, String s)
    {
        if (urn1 == null)
        {
            throw new NullPointerException("Null urn");
        }
        urn = urn1;
        if (s == null)
        {
            throw new NullPointerException("Null displayText");
        } else
        {
            displayText = s;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Shortcut)
            {
                if (!urn.equals(((Shortcut) (obj = (Shortcut)obj)).getUrn()) || !displayText.equals(((Shortcut) (obj)).getDisplayText()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final String getDisplayText()
    {
        return displayText;
    }

    public final Urn getUrn()
    {
        return urn;
    }

    public final int hashCode()
    {
        return (urn.hashCode() ^ 0xf4243) * 0xf4243 ^ displayText.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Shortcut{urn=")).append(urn).append(", displayText=").append(displayText).append("}").toString();
    }
}

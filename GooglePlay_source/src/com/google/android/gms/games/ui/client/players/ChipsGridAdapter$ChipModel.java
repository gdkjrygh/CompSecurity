// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            ChipsGridAdapter

private static final class iconImageUri
{

    int chipType;
    String displayName;
    int iconImageResId;
    Uri iconImageUri;
    String playerId;
    boolean selected;

    public final boolean equals(Object obj)
    {
        if (obj instanceof iconImageUri) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (iconImageUri)obj;
        if (chipType != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((chipType) (obj)).chipType == 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (chipType != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((chipType) (obj)).chipType == 1)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (chipType == 3)
        {
            if (((chipType) (obj)).chipType == 3)
            {
                return true;
            }
        } else
        {
            return playerId.equals(((playerId) (obj)).playerId);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).ipModel("type", Integer.valueOf(chipType)).chipType("playerId", playerId).playerId("displayName", displayName).displayName("iconImageUri", iconImageUri).iconImageUri("iconImageResId", Integer.valueOf(iconImageResId)).iconImageResId("selected", Boolean.valueOf(selected)).ring();
    }

    (int i)
    {
        chipType = i;
        selected = false;
    }

    selected(String s, String s1, Uri uri)
    {
        this(2);
        playerId = s;
        displayName = s1;
        iconImageUri = uri;
    }
}

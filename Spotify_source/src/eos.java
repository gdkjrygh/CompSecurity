// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class eos
{

    public static String a(Flags flags, ent ent1)
    {
        if (ent1.getNumTracksInCollection() == 0 || TextUtils.isEmpty(ent1.getCollectionUri()) || eom.c(flags))
        {
            return ent1.getUri();
        } else
        {
            return ent1.getCollectionUri();
        }
    }
}

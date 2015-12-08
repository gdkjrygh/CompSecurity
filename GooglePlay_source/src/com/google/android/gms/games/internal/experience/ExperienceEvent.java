// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Game;

public interface ExperienceEvent
{

    public abstract long getCreatedTimestamp();

    public abstract String getDisplayDescription();

    public abstract void getDisplayDescription(CharArrayBuffer chararraybuffer);

    public abstract String getDisplayTitle();

    public abstract void getDisplayTitle(CharArrayBuffer chararraybuffer);

    public abstract String getExperienceId();

    public abstract Game getGame();

    public abstract Uri getIconImageUri();

    public abstract int getNewLevel();

    public abstract int getType();

    public abstract long getXpEarned();
}

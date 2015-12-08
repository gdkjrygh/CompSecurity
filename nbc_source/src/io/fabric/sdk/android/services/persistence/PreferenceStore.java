// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

public interface PreferenceStore
{

    public abstract android.content.SharedPreferences.Editor edit();

    public abstract SharedPreferences get();

    public abstract boolean save(android.content.SharedPreferences.Editor editor);
}

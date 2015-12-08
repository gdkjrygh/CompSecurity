// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

public interface PreferenceStore
{

    public abstract SharedPreferences a();

    public abstract boolean a(android.content.SharedPreferences.Editor editor);

    public abstract android.content.SharedPreferences.Editor b();
}

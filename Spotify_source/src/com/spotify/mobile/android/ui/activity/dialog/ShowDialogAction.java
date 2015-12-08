// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.Fragment;

public interface ShowDialogAction
    extends Parcelable
{

    public abstract void a(Context context);

    public abstract void a(Fragment fragment, int i);
}

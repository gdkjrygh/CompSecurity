// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.api;

import android.net.Uri;
import com.android.volley.Request;

public interface PlayDfeApi
{

    public static final Uri BASE_URI = Uri.parse("https://android.clients.google.com/fdfe/");
    public static final Uri EXPERIMENTS_URI = Uri.parse("api/experiments");
    public static final Uri PLUS_PROFILE_URI = Uri.parse("api/plusProfile");

    public abstract Request getExperiments(com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener);

}

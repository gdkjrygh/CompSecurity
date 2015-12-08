// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.persistence.json;

import android.os.Bundle;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dmz;
import gng;
import gni;
import java.io.File;

public final class JsonBundleHelper
{

    private static final ObjectMapper a;

    public static Bundle a(File file)
    {
        return (Bundle)a.readValue(file, android/os/Bundle);
    }

    public static void a(File file, Bundle bundle)
    {
        a.writeValue(file, bundle);
    }

    static 
    {
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}

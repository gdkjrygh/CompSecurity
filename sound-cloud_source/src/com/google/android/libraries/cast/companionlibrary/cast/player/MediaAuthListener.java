// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.gms.cast.m;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            MediaAuthStatus

public interface MediaAuthListener
{

    public abstract void onAuthFailure(String s);

    public abstract void onAuthResult(MediaAuthStatus mediaauthstatus, m m, String s, int i, JSONObject jsonobject);
}

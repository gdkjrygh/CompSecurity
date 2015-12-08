// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public abstract class fmb
{

    public fmb()
    {
    }

    public abstract Intent a(Bundle bundle);

    public abstract Intent a(String s);

    public abstract Bundle a(String s, int i);

    public abstract String a(Intent intent);

    public abstract Bundle b(String s);

    public abstract String b(Intent intent);

    public abstract com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType c(Intent intent);

    public abstract String[] d(Intent intent);
}

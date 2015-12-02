// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messages.ipc.k;
import com.facebook.orca.prefs.OrcaRootPreferenceActivity;

public class f
    implements k
{

    public f()
    {
    }

    public Intent a(Context context)
    {
        return new Intent(context, com/facebook/orca/prefs/OrcaRootPreferenceActivity);
    }

    public Uri a()
    {
        return Uri.parse("fb-messenger://threads");
    }

    public Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append("fb-messenger://thread/").append(Uri.encode(s)).toString());
    }

    public Uri b(String s)
    {
        return Uri.parse((new StringBuilder()).append("fb-messenger://user/").append(Uri.encode(s)).toString());
    }
}

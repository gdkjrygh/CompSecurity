// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ringtone;

import android.net.Uri;
import android.os.AsyncTask;

public interface RingtoneStorage
{

    public abstract AsyncTask a(String s, String s1);

    public abstract AsyncTask a(String s, String s1, Uri uri);

    public abstract AsyncTask b(String s, String s1);
}

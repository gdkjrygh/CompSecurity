// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public interface IAppboyNavigator
{

    public abstract void gotoNewsFeed(Context context, Bundle bundle);

    public abstract void gotoURI(Context context, Uri uri, Bundle bundle);
}

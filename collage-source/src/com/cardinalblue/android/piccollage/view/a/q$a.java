// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            q

public static interface WebPhoto
{

    public abstract void a(PicUser picuser, View view);

    public abstract void a(WebPhoto webphoto, View view);
}

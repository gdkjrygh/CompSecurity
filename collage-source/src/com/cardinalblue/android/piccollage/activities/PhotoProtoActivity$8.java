// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements android.content.ckListener
{

    final PhotoProtoActivity a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
    }

    I(PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}

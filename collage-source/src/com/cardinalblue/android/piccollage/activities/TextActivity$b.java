// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

private static abstract class <init> extends Fragment
{

    protected TextScrapModel a;

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (TextScrapModel)getArguments().getParcelable("text_model");
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}

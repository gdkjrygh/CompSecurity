// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInPickAccountFragment

static final class <init> extends android.support.v7.widget..a
{

    private TextView accountName;
    private TextView accountType;
    private ImageView avatar;
    private Future future;



/*
    static Future access$502( , Future future1)
    {
        .future = future1;
        return future1;
    }

*/




    private future(View view)
    {
        super(view);
        accountName = (TextView)view.findViewById(0x7f100571);
        accountType = (TextView)view.findViewById(0x7f100572);
        avatar = (ImageView)view.findViewById(0x7f100570);
    }

    avatar(View view, avatar avatar1)
    {
        this(view);
    }
}

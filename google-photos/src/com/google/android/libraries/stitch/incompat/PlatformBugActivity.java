// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.stitch.incompat;

import al;
import android.content.Intent;
import android.os.Bundle;
import ar;
import olu;
import onl;

public final class PlatformBugActivity extends ar
{

    public PlatformBugActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("extra_error_type"))
        {
            throw new IllegalStateException("This needs a type to tell the user about!");
        } else
        {
            ((onl)(new olu(this, onl)).a(getIntent().getStringExtra("extra_error_type"))).b().a(c(), "dialog");
            return;
        }
    }
}

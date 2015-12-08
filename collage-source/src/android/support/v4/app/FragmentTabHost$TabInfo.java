// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            FragmentTabHost, Fragment

static final class args
{

    private final Bundle args;
    private final Class clss;
    private Fragment fragment;
    private final String tag;



/*
    static Fragment access$102( , Fragment fragment1)
    {
        .fragment = fragment1;
        return fragment1;
    }

*/




    fragment(String s, Class class1, Bundle bundle)
    {
        tag = s;
        clss = class1;
        args = bundle;
    }
}

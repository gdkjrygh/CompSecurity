// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.content.Context;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitLibraryLoader

class val.libraryLoader extends Thread
{

    final OrbitLibraryLoader this$0;
    final Context val$context;
    final braryLoader val$libraryLoader;

    public void run()
    {
        loadLibrary(val$context, val$libraryLoader);
    }

    braryLoader(braryLoader braryloader)
    {
        this$0 = final_orbitlibraryloader;
        val$context = Context.this;
        val$libraryLoader = braryloader;
        super(final_s);
    }
}

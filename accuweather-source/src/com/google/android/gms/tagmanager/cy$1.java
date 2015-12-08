// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cy

static final class ahT
    implements Runnable
{

    final android.content.dPreferences.Editor ahT;

    public void run()
    {
        ahT.commit();
    }

    r(android.content.dPreferences.Editor editor)
    {
        ahT = editor;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hmh
    implements nug
{

    private hmg a;

    hmh(hmg hmg1)
    {
        a = hmg1;
        super();
    }

    public final void b_(Object obj)
    {
        obj = a;
        if (!"com.google.android.apps.photos.remotemedia.ui.enter_album_edit_mode".equals(((hmg) (obj)).a.a) && ((hmg) (obj)).a.d()) goto _L2; else goto _L1
_L1:
        if (!((hmg) (obj)).b.b) goto _L4; else goto _L3
_L3:
        if (!((hmg) (obj)).a.d()) goto _L6; else goto _L5
_L5:
        ((hmg) (obj)).a.e();
_L2:
        return;
_L6:
        ((hmg) (obj)).a.a("com.google.android.apps.photos.remotemedia.ui.enter_album_edit_mode", new Bundle());
        return;
_L4:
        if (((hmg) (obj)).a.d())
        {
            ((hmg) (obj)).a.f();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hxk
    implements nug
{

    private hxj a;

    hxk(hxj hxj1)
    {
        a = hxj1;
        super();
    }

    public final void b_(Object obj)
    {
        obj = a;
        if (!"com.google.android.apps.photos.search.suggestions.people_hiding_mode".equals(((hxj) (obj)).a.a) && ((hxj) (obj)).a.d()) goto _L2; else goto _L1
_L1:
        if (!((hxj) (obj)).b.e()) goto _L4; else goto _L3
_L3:
        if (!((hxj) (obj)).a.d()) goto _L6; else goto _L5
_L5:
        ((hxj) (obj)).a.e();
_L2:
        return;
_L6:
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.apps.photos.search.suggestions.ExtraPeopleHidingMode", ((hxj) (obj)).b.d.toString());
        ((hxj) (obj)).a.a("com.google.android.apps.photos.search.suggestions.people_hiding_mode", bundle);
        return;
_L4:
        if (((hxj) (obj)).a.d())
        {
            ((hxj) (obj)).a.f();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

public final class avb
    implements ank
{

    private final aqm a;
    private final ank b;

    public avb(aqm aqm, ank ank1)
    {
        a = aqm;
        b = ank1;
    }

    public final anb a(ani ani)
    {
        return b.a(ani);
    }

    public final boolean a(Object obj, File file, ani ani)
    {
        obj = (aqa)obj;
        return b.a(new ave(((BitmapDrawable)((aqa) (obj)).b()).getBitmap(), a), file, ani);
    }
}

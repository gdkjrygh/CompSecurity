// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;

public class i
    implements k.c
{

    public i()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        return new p.cp.b.c(new PandoraIntent("show_upgrade"));
    }
}

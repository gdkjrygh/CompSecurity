// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.io.File;
import java.io.IOException;

final class gvu
{

    Uri a;
    Uri b;
    gum c;
    private gvs d;

    gvu(gvs gvs1, Uri uri, gvl gvl1, gum gum)
    {
        d = gvs1;
        super();
        a = uri;
        c = gum;
        b = a(gvl1);
    }

    private Uri a(gvl gvl1)
    {
        if (gvl1 == gvl.a)
        {
            try
            {
                gvl1 = Uri.fromFile(gvs.a(d).a(a));
            }
            // Misplaced declaration of an exception variable
            catch (gvl gvl1)
            {
                throw new gwa("Failed to generate new output file", gvl1);
            }
            return gvl1;
        } else
        {
            return Uri.fromFile(new File(gvs.b(d).a(a)));
        }
    }
}

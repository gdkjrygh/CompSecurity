// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.ByteArrayOutputStream;

public class cmg
{

    public cmg()
    {
    }

    public static clu a(Uri uri, cmf cmf1, bjp bjp1)
    {
        cmi cmi1 = cmf1.d();
        cmd cmd1 = cmf1.e();
        cmb cmb1 = cmf1.c();
        cwb cwb1 = new cwb();
        Object obj;
        if (uri == null)
        {
            obj = null;
        } else
        {
            obj = uri.toString();
        }
        cwb1.a = ((String) (obj));
        if (cmf1.a())
        {
            cwb1.h = cmf1.b();
        }
        if (cmb1 != null)
        {
            cwb1.b = cmb1.b;
            cwb1.g = cmb1.c;
            cwb1.f = cmb1.e;
            cmf1 = cmb1.d;
            if (cmf1 != null)
            {
                obj = new cvv();
                obj.a = ((cea) (cmf1)).b;
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                ((cea) (cmf1)).a.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, bytearrayoutputstream);
                obj.b = bytearrayoutputstream.toByteArray();
                cwb1.e = ((cvv) (obj));
            }
        }
        if (cmi1 != null)
        {
            cmi1.a(cwb1);
        }
        if (cmd1 != null)
        {
            cmd1.a(cwb1);
        }
        bjp1.a(uri, cwb1);
        cmf1 = new clu(uri, bjp1);
        cmf1.a(uri);
        return cmf1;
    }

    public static boolean a(Uri uri, bjp bjp1)
    {
        return bjp1.a(uri) != null;
    }
}

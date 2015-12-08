// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.io.IOException;

public class ckk extends ckj
{

    private final cjs c;
    private final nny d;
    private final int e;

    public ckk(cjs cjs1, nny nny1, int i)
    {
        c = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        d = (nny)b.a(nny1, "mediaIdentifier", null);
        e = i;
    }

    private void a(String s, nny nny1)
    {
        nny nny2;
        nny nny3;
        nny3 = null;
        nny2 = null;
        nny1 = c.b(nny1, e);
        int i = 0;
_L5:
        nny2 = nny1;
        nny3 = nny1;
        if (i >= nny1.f())
        {
            break MISSING_BLOCK_LABEL_243;
        }
        nny2 = nny1;
        nny3 = nny1;
        if (!nny1.a(i).getString("mime").startsWith(s)) goto _L2; else goto _L1
_L1:
        if (i != -1) goto _L4; else goto _L3
_L3:
        nny2 = nny1;
        nny3 = nny1;
        try
        {
            throw b.a((new StringBuilder(String.valueOf(s).length() + 34)).append("No track with MIME type starting ").append(s).append(".").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            nny3 = nny2;
        }
        finally
        {
            dee.a(nny3);
        }
        throw new IllegalArgumentException("Error reading media.".toString(), s);
        throw s;
_L2:
        i++;
          goto _L5
_L4:
        nny2 = nny1;
        nny3 = nny1;
        nny1.b(i);
        nny2 = nny1;
        nny3 = nny1;
        c.b(super.a, "mMediaExtractor", "can only be initialized once.");
        nny2 = nny1;
        nny3 = nny1;
        super.a = (cjt)b.a(nny1, "mediaExtractor", null);
        nny2 = nny1;
        nny3 = nny1;
        super.b = new cki();
        nny2 = nny1;
        nny3 = nny1;
        super.b.a = super.a.a(super.a.e());
        return;
        i = -1;
          goto _L1
    }

    public void c()
    {
        a("audio/", d);
    }

    public void d()
    {
        a("video/", d);
    }

    public String toString()
    {
        return d.toString();
    }

    static 
    {
        ckk.getSimpleName();
    }
}

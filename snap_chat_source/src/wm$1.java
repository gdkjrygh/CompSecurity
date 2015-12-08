// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lang.Object
    implements JG
{

    private wx a;
    private String b;
    private wm c;

    public final void a(Jw jw, JF jf)
    {
        a.a(jw, jf);
        jf = wm.a(c);
        String s = b;
        jw = jw.mBitmap;
        if (s == null || jw == null)
        {
            return;
        } else
        {
            PG.b(new <init>(jf, s, jw));
            return;
        }
    }

    >(wm wm1, wx wx1, String s)
    {
        c = wm1;
        a = wx1;
        b = s;
        super();
    }
}

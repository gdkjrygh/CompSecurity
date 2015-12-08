// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


// Referenced classes of package p.cx:
//            b

private static class .String
{

    public int a;
    public String b;
    public boolean c;

    public String toString()
    {
        return (new StringBuilder()).append("AndoResponse{intervalSeconds=").append(a).append(", guid='").append(b).append('\'').append(", valid=").append(c).append('}').toString();
    }

    private .String(String s)
    {
        c = false;
        if (s == null || s.indexOf(',') == -1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = s.split(",");
        a = Integer.parseInt(s[0]);
        if (s.length > 1 && s[1].length() > 0)
        {
            b = s[1];
            c = true;
        }
        return;
        s;
    }

    .String(String s, .String s1)
    {
        this(s);
    }
}

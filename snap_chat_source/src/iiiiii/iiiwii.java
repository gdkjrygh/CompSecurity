// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            iwiiii, wiiiii, iwwwii, wwwwii

public class iiiwii extends iwiiii
{

    public iiiwii()
    {
    }

    public String b041A041A041A041A041A041A(String s, char c)
    {
        int ai[] = new int[s.length()];
        s = new iwwwii(s);
        int i;
        for (i = 0; s.b041A041A041A041A041A041A(); i++)
        {
            int j = s.b041A041A041A041A041A041A();
            wwwwii wwwwii1 = wwwwii.b041A041A041A041A041A041A(j);
            ai[i] = wwwwii1.b041A041A041A041A041A041A(wwwwii1.b041A041A041A041A041A041A(j) + (c + c + i));
        }

        return new String(ai, 0, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            wwiiii, wiiiii, iwwwii, wwwwii

public class iwiwii extends wwiiii
{

    public iwiwii()
    {
    }

    public String b041A041A041A041A041A041A(String s, char c, char c1)
    {
        int ai[] = new int[s.length()];
        s = new iwwwii(s);
        int i;
        for (i = 0; s.b041A041A041A041A041A041A(); i++)
        {
            int j = s.b041A041A041A041A041A041A();
            wwwwii wwwwii1 = wwwwii.b041A041A041A041A041A041A(j);
            ai[i] = wwwwii1.b041A041A041A041A041A041A((wwwwii1.b041A041A041A041A041A041A(j) - (c + i)) + c1);
        }

        return new String(ai, 0, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class con extends cnw
{

    private final cnw f;

    public con(float f1, float f2, float f3, float f4, float f5, cnw cnw1)
    {
        super(f1, f2, f3, f4, f5);
        f = (cnw)b.a(cnw1, "extraCrop", null);
    }

    public final cnw a()
    {
        return f;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(f);
        return (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length())).append("PaddedCropping:{").append(s).append(", ").append(s1).append("}").toString();
    }
}

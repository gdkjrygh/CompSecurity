// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public final class chi
{

    private static final cio a;

    public static void a(chy chy, int i, cie cie1)
    {
        chl.a(1, chy, a, i, cie1);
    }

    public static void a(chy chy, cin cin, Matrix matrix, int i, cie cie1)
    {
        b.a(chy, "target", null);
        b.a(cin, "source", null);
        boolean flag;
        if (chy != cin)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Attempting to copy source to target");
        cie1.a("texcoord_transform", matrix, true).b("sampler_source", cin);
        a(chy, 0, cie1);
    }

    public static void a(chy chy, cin cin, Matrix matrix, cij cij)
    {
        a(chy, cin, matrix, 0, cie.a(cij));
    }

    public static void a(chy chy, cin cin, cie cie1)
    {
        a(chy, cin, ddl.a, 0, cie1);
    }

    public static void a(chy chy, cin cin, cij cij)
    {
        a(chy, cin, cie.a(cij));
    }

    public static void a(chy chy, cin cin, cin cin1, float f, cij cij)
    {
        a(chy, cin, cin1, ddl.a, ddl.a, f, 0, cie.a(cij));
    }

    public static void a(chy chy, cin cin, cin cin1, Matrix matrix, Matrix matrix1, float f, int i, cie cie1)
    {
        boolean flag1 = false;
        b.a(chy, "target", null);
        b.a(cin, "sourceA", null);
        b.a(cin1, "sourceB", null);
        boolean flag;
        if (chy != cin)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Attempting to copy sourceA to target");
        flag = flag1;
        if (chy != cin1)
        {
            flag = true;
        }
        b.a(flag, "Attempting to copy sourceB to target");
        cie1.b("sampler_source_a", cin).b("sampler_source_b", cin1).a("texcoord_transform_a", matrix, true).a("texcoord_transform_b", matrix1, true).a("blend_weight", f, true);
        a(chy, i, cie1);
    }

    static 
    {
        Object obj = new cir(4, new float[] {
            -1F, -1F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 1.0F, -1F, 1.0F, 
            0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F
        });
        cir cir1 = new cir(3, new float[] {
            0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 
            1.0F, 1.0F
        });
        obj = (new cip()).a("a_position", ((cir) (obj))).a("a_texcoord", cir1);
        a = new cio(((cip) (obj)).a, ((cip) (obj)).b);
    }
}

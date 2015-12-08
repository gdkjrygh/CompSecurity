// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.util.Map;

public final class cij
{

    public final cil a[];
    public final Map b;
    int c;
    private cim d[];

    public cij(ciq ciq, chj chj)
    {
        c = 0;
        new cik(ciq, chj);
        int i = GLES20.glCreateProgram();
        if (i != 0)
        {
            GLES20.glAttachShader(i, ((cib) (ciq)).b);
            b.i("glAttachShader");
            GLES20.glAttachShader(i, ((cib) (chj)).b);
            b.i("glAttachShader");
            GLES20.glLinkProgram(i);
            ciq = new int[1];
            GLES20.glGetProgramiv(i, 35714, ciq, 0);
            if (ciq[0] != 1)
            {
                ciq = GLES20.glGetProgramInfoLog(i);
                GLES20.glDeleteProgram(i);
                ciq = String.valueOf(ciq);
                if (ciq.length() != 0)
                {
                    ciq = "Could not link program: ".concat(ciq);
                } else
                {
                    ciq = new String("Could not link program: ");
                }
                throw new RuntimeException(ciq);
            }
        }
        c = i;
        ciq = new int[1];
        GLES20.glGetProgramiv(c, 35721, ciq, 0);
        d = new cim[ciq[0]];
        for (int j = 0; j < ciq[0]; j++)
        {
            d[j] = new cim(c, j);
        }

        ciq = new int[1];
        GLES20.glGetProgramiv(c, 35718, ciq, 0);
        if (ciq[0] > 64)
        {
            throw new RuntimeException("Shader uniform count exceeds MAX_UNIFORM_COUNT");
        }
        a = new cil[ciq[0]];
        b = b.l(ciq[0]);
        for (int k = 0; k < ciq[0]; k++)
        {
            chj = new cil(c, k);
            a[k] = chj;
            b.put(((cil) (chj)).a, Integer.valueOf(k));
        }

    }

    static int a(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if (abyte0[i] == 0)
            {
                return i;
            }
        }

        return abyte0.length;
    }

    public final void a(cio cio1, cie cie1)
    {
        cim acim[];
        int i;
        int k;
        GLES20.glUseProgram(c);
        b.i("glUseProgram");
        acim = d;
        k = acim.length;
        i = 0;
_L2:
        cim cim1;
        Object obj;
        int j;
        int i1;
        int k1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        cim1 = acim[i];
        obj = cim1.a;
        obj = (cir)cio1.a.get(obj);
        if (obj == null)
        {
            cio1 = cim1.a;
            throw new RuntimeException((new StringBuilder(String.valueOf(cio1).length() + 30)).append("VertexBuffer missing stream '").append(cio1).append("'").toString());
        }
        b.a(cim1.a, ((cir) (obj)).a, ((cir) (obj)).b, cim1.c, cim1.d);
        GLES20.glBindBuffer(34962, 0);
        i1 = cim1.b;
        k1 = b.i(cim1.c);
        j = cim1.c;
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder(29)).append("Unhandled gl type ").append(j).toString());

        case 5124: 
        case 35667: 
        case 35668: 
        case 35669: 
            break; /* Loop/switch isn't completed */

        case 5126: 
        case 35664: 
        case 35665: 
        case 35666: 
        case 35674: 
        case 35675: 
        case 35676: 
            j = 5126;
            break;
        }
_L3:
        GLES20.glVertexAttribPointer(i1, k1, j, false, 0, ((cir) (obj)).d);
        GLES20.glEnableVertexAttribArray(cim1.b);
        b.i("Binding VertexAttribute");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        j = 5124;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        cie1.b();
        cie1 = ((cie) (cie1.b));
        j = 0;
        i = 0;
_L18:
        cil cil1;
        if (j >= a.length)
        {
            break MISSING_BLOCK_LABEL_1106;
        }
        cil1 = a[j];
        cio1 = cie1[j];
        cil1.c;
        JVM INSTR lookupswitch 13: default 508
    //                   5124: 723
    //                   5126: 555
    //                   35664: 606
    //                   35665: 625
    //                   35666: 644
    //                   35667: 742
    //                   35668: 761
    //                   35669: 780
    //                   35674: 663
    //                   35675: 683
    //                   35676: 703
    //                   35678: 799
    //                   36198: 799;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L17
_L5:
        cio1 = cil1.a;
        throw new RuntimeException((new StringBuilder(String.valueOf(cio1).length() + 27)).append("Uniform ").append(cio1).append(" has unhandled type").toString());
_L7:
        GLES20.glUniform1fv(cil1.b, cil1.d, (float[])cio1, 0);
_L19:
        cio1 = String.valueOf(cil1.a);
        int l;
        int j1;
        int l1;
        if (cio1.length() != 0)
        {
            cio1 = "Binding uniform ".concat(cio1);
        } else
        {
            cio1 = new String("Binding uniform ");
        }
        b.i(cio1);
        j++;
        if (true) goto _L18; else goto _L8
_L8:
        GLES20.glUniform2fv(cil1.b, cil1.d, (float[])cio1, 0);
          goto _L19
_L9:
        GLES20.glUniform3fv(cil1.b, cil1.d, (float[])cio1, 0);
          goto _L19
_L10:
        GLES20.glUniform4fv(cil1.b, cil1.d, (float[])cio1, 0);
          goto _L19
_L14:
        GLES20.glUniformMatrix2fv(cil1.b, cil1.d, false, (float[])cio1, 0);
          goto _L19
_L15:
        GLES20.glUniformMatrix3fv(cil1.b, cil1.d, false, (float[])cio1, 0);
          goto _L19
_L16:
        GLES20.glUniformMatrix4fv(cil1.b, cil1.d, false, (float[])cio1, 0);
          goto _L19
_L6:
        GLES20.glUniform1iv(cil1.b, cil1.d, (int[])cio1, 0);
          goto _L19
_L11:
        GLES20.glUniform2iv(cil1.b, cil1.d, (int[])cio1, 0);
          goto _L19
_L12:
        GLES20.glUniform3iv(cil1.b, cil1.d, (int[])cio1, 0);
          goto _L19
_L13:
        GLES20.glUniform4iv(cil1.b, cil1.d, (int[])cio1, 0);
          goto _L19
_L17:
        cio1 = (cin)cio1;
        if (cio1 == null)
        {
            cio1 = String.valueOf(cil1.a);
            if (cio1.length() != 0)
            {
                cio1 = "Missing uniform sampler2D ".concat(cio1);
            } else
            {
                cio1 = new String("Missing uniform sampler2D ");
            }
            throw new RuntimeException(cio1);
        }
        l1 = cio1.c();
        if (cio1.b())
        {
            l = 36197;
        } else
        {
            l = 3553;
        }
        j1 = cio1.g();
        switch (j1)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder(41)).append("Unhandled Texture filter mode ").append(j1).toString());

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_1071;

        case 0: // '\0'
            j1 = 9728;
            break;
        }
_L20:
        c.b(l1, "texture handle", 0, null);
        GLES20.glActiveTexture(33984 + i);
        GLES20.glBindTexture(l, l1);
        GLES20.glUniform1i(cil1.b, i);
        cio1 = String.valueOf(cil1.a);
        if (cio1.length() != 0)
        {
            cio1 = "Binding sampler2D ".concat(cio1);
        } else
        {
            cio1 = new String("Binding sampler2D ");
        }
        b.i(cio1);
        GLES20.glTexParameteri(3553, 10240, j1);
        GLES20.glTexParameteri(3553, 10241, j1);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        b.i("glTexParameteri");
        i++;
          goto _L19
        j1 = 9729;
          goto _L20
    }
}

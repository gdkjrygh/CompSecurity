// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TexturedPosterizeFilter extends ahn
{

    private static final String mPosterizeShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\n__TEX_SAMPLERS_DECL__\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float gray = (color.r + color.g + color.b) / 3.0;\n  int level = int(floor((gray / binSize) + 0.5));\n  vec4 texColor;\n__LEVEL_SELECT__ {\n    texColor = vec4(0.0, 0.0, 0.0, 1.0);\n  }\n  gl_FragColor = texColor;\n}\n";
    private ajl mShader;
    private Map mTexturePorts;

    public TexturedPosterizeFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mTexturePorts = new TreeMap();
    }

    private String a()
    {
        int j = mTexturePorts.size();
        String as[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as[i] = (new StringBuilder(42)).append("uniform sampler2D tex_sampler_").append(i + 1).append(";").toString();
        }

        return TextUtils.join("\n", as);
    }

    private String x()
    {
        int j = mTexturePorts.size();
        String as[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as[i] = (new StringBuilder(102)).append("  if (level == ").append(i).append(") {\n    texColor = texture2D(tex_sampler_").append(i + 1).append(", v_texcoord);\n  } else ").toString();
        }

        return TextUtils.join("\n", as);
    }

    protected final void a(ajo ajo1)
    {
        String s = ajo1.b;
        if (s.startsWith("level"))
        {
            int i = Integer.parseInt(s.substring(5));
            mTexturePorts.put(Integer.valueOf(i), ajo1);
        } else
        if (!s.equals("image"))
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 26)).append("Unsupported input port '").append(s).append("'!").toString());
        }
    }

    public final ajw b()
    {
        Object obj = aif.a(301, 2);
        aif aif1 = aif.a(301, 16);
        obj = (new ajw()).a("image", 2, ((aif) (obj))).b("image", 2, aif1);
        obj.d = false;
        return ((ajw) (obj));
    }

    protected final void c()
    {
        int j = mTexturePorts.size();
        if (j < 2)
        {
            throw new RuntimeException("Must specify at least two input texture levels!");
        }
        for (int i = 0; i < j; i++)
        {
            if ((ajo)mTexturePorts.get(Integer.valueOf(i)) == null)
            {
                throw new RuntimeException((new StringBuilder(38)).append("Missing input port 'level").append(i).append("'!").toString());
            }
        }

        String s = a();
        String s1 = x();
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\n__TEX_SAMPLERS_DECL__\nuniform float binSize;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float gray = (color.r + color.g + color.b) / 3.0;\n  int level = int(floor((gray / binSize) + 0.5));\n  vec4 texColor;\n__LEVEL_SELECT__ {\n    texColor = vec4(0.0, 0.0, 0.0, 1.0);\n  }\n  gl_FragColor = texColor;\n}\n".replace("__TEX_SAMPLERS_DECL__", s).replace("__LEVEL_SELECT__", s1));
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv aahv[] = new ahv[mTexturePorts.size() + 1];
        aahv[0] = a("image").a().h();
        int ai[] = aahv[0].l();
        Iterator iterator = mTexturePorts.values().iterator();
        for (int i = 1; iterator.hasNext(); i++)
        {
            aahv[i] = ((ajo)iterator.next()).a().h();
        }

        ahv ahv1 = aju1.a(ai).h();
        mShader.a("binSize", 1.0F / (float)(mTexturePorts.size() - 1));
        mShader.a(aahv, ahv1);
        aju1.a(ahv1);
    }
}

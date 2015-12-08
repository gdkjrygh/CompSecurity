// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class akr
{

    public final boolean a;
    public final ajl b;

    public akr(boolean flag)
    {
        a = flag;
        ajl ajl1;
        if (a)
        {
            ajl1 = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\n\nvec3 rgb2hsv(vec3 c) {\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);\n    vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\n\nvoid main() {\n  vec4 rgba = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(rgb2hsv(rgba.rgb), rgba.a);\n}");
        } else
        {
            ajl1 = null;
        }
        b = ajl1;
    }
}

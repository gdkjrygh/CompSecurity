// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddy extends Enum
{

    public static final ddy a;
    public static final ddy b;
    public static final ddy c;
    public static final ddy d;
    public static final ddy e;
    public static final ddy f;
    public static final ddy g;
    public static final ddy h;
    public static final ddy i;
    public static final ddy j;
    public static final ddy k;
    private static final onh l = new onh("debug.mm.allow_overrides", true);
    private static final ddy p[];
    private final String m;
    private final String n;
    private final boolean o;

    private ddy(String s, int i1, String s1, String s2)
    {
        this(s, i1, s1, s2, false);
    }

    private ddy(String s, int i1, String s1, String s2, boolean flag)
    {
        super(s, i1);
        m = s1;
        n = s2;
        o = flag;
    }

    private String c()
    {
        String s = n;
        if (o)
        {
            s = b.a(m, n);
        }
        return s;
    }

    public static ddy valueOf(String s)
    {
        return (ddy)Enum.valueOf(ddy, s);
    }

    public static ddy[] values()
    {
        return (ddy[])p.clone();
    }

    public final boolean a()
    {
        return "TRUE".equalsIgnoreCase(c());
    }

    public final Integer b()
    {
        int i1;
        try
        {
            i1 = Integer.parseInt(c());
        }
        catch (NumberFormatException numberformatexception)
        {
            return null;
        }
        return Integer.valueOf(i1);
    }

    static 
    {
        a = new ddy("SHOW_ALL_THEMES", 0, "debug.mm.show_all_themes", "false");
        b = new ddy("ENABLE_PREVIEW", 1, "debug.mm.enable_preview", "true");
        c = new ddy("FORCE_SUPPORTED", 2, "debug.mm.force_supported", "false", true);
        d = new ddy("FORCE_UNSUPPORTED", 3, "debug.mm.force_unsupported", "false", true);
        e = new ddy("SMART_DIMENSIONS", 4, "debug.mm.smart_dimensions", "false");
        f = new ddy("FORCE_WIDTH", 5, "debug.mm.force_width", "");
        g = new ddy("FORCE_HEIGHT", 6, "debug.mm.force_height", "");
        h = new ddy("SB_RENDERER_VERSION", 7, "debug.mm.sb_renderer_version", "");
        i = new ddy("ENABLE_CLIP_EDITING", 8, "debug.mm.enable_clip_editing", "true");
        j = new ddy("ENABLE_LOCAL_MUSIC_SELECTION", 9, "debug.mm.enable_local_music", "false");
        k = new ddy("ENABLE_ADD_ASSET", 10, "debug.mm.enable_add_asset", "false");
        p = (new ddy[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq

public final class jv extends Enum
    implements pq
{

    public static final jv a;
    public static final jv b;
    public static final jv c;
    public static final jv d;
    public static final jv e;
    public static final jv f;
    public static final jv g;
    public static final jv h;
    public static final jv i;
    public static final jv j;
    public static final jv k;
    public static final jv l;
    public static final jv m;
    public static final jv n;
    public static final jv o;
    public static final jv p;
    public static final jv q;
    public static final jv r;
    public static final jv s;
    public static final jv t;
    public static final jv u;
    public static final jv v;
    private static final jv z[];
    private final int w;
    private final String x;
    private final String y;

    private jv(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        w = j1;
        x = s2;
        s1 = s2;
        if (s2.endsWith("_item"))
        {
            s1 = s2.substring(0, s2.length() - 5);
        }
        y = s1.replace('_', ' ');
    }

    public static jv valueOf(String s1)
    {
        return (jv)Enum.valueOf(b/a/jv, s1);
    }

    public static jv[] values()
    {
        return (jv[])z.clone();
    }

    public final int b()
    {
        return w;
    }

    public final String c()
    {
        return x;
    }

    public final String h_()
    {
        return y;
    }

    static 
    {
        a = new jv("TYPE_HEADER_ITEM", 0, 0, "header_item");
        b = new jv("TYPE_STRING_ID_ITEM", 1, 1, "string_id_item");
        c = new jv("TYPE_TYPE_ID_ITEM", 2, 2, "type_id_item");
        d = new jv("TYPE_PROTO_ID_ITEM", 3, 3, "proto_id_item");
        e = new jv("TYPE_FIELD_ID_ITEM", 4, 4, "field_id_item");
        f = new jv("TYPE_METHOD_ID_ITEM", 5, 5, "method_id_item");
        g = new jv("TYPE_CLASS_DEF_ITEM", 6, 6, "class_def_item");
        h = new jv("TYPE_MAP_LIST", 7, 4096, "map_list");
        i = new jv("TYPE_TYPE_LIST", 8, 4097, "type_list");
        j = new jv("TYPE_ANNOTATION_SET_REF_LIST", 9, 4098, "annotation_set_ref_list");
        k = new jv("TYPE_ANNOTATION_SET_ITEM", 10, 4099, "annotation_set_item");
        l = new jv("TYPE_CLASS_DATA_ITEM", 11, 8192, "class_data_item");
        m = new jv("TYPE_CODE_ITEM", 12, 8193, "code_item");
        n = new jv("TYPE_STRING_DATA_ITEM", 13, 8194, "string_data_item");
        o = new jv("TYPE_DEBUG_INFO_ITEM", 14, 8195, "debug_info_item");
        p = new jv("TYPE_ANNOTATION_ITEM", 15, 8196, "annotation_item");
        q = new jv("TYPE_ENCODED_ARRAY_ITEM", 16, 8197, "encoded_array_item");
        r = new jv("TYPE_ANNOTATIONS_DIRECTORY_ITEM", 17, 8198, "annotations_directory_item");
        s = new jv("TYPE_MAP_ITEM", 18, -1, "map_item");
        t = new jv("TYPE_TYPE_ITEM", 19, -1, "type_item");
        u = new jv("TYPE_EXCEPTION_HANDLER_ITEM", 20, -1, "exception_handler_item");
        v = new jv("TYPE_ANNOTATION_SET_REF_ITEM", 21, -1, "annotation_set_ref_item");
        z = (new jv[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v
        });
    }
}

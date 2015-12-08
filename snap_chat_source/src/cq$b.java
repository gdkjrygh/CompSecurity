// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

static final class lang.Integer
{

    private static final Map a;

    public static Integer a(String s)
    {
        return (Integer)a.get(s);
    }

    static 
    {
        HashMap hashmap = new HashMap(47);
        a = hashmap;
        hashmap.put("aliceblue", Integer.valueOf(0xf0f8ff));
        a.put("antiquewhite", Integer.valueOf(0xfaebd7));
        a.put("aqua", Integer.valueOf(65535));
        a.put("aquamarine", Integer.valueOf(0x7fffd4));
        a.put("azure", Integer.valueOf(0xf0ffff));
        a.put("beige", Integer.valueOf(0xf5f5dc));
        a.put("bisque", Integer.valueOf(0xffe4c4));
        a.put("black", Integer.valueOf(0));
        a.put("blanchedalmond", Integer.valueOf(0xffebcd));
        a.put("blue", Integer.valueOf(255));
        a.put("blueviolet", Integer.valueOf(0x8a2be2));
        a.put("brown", Integer.valueOf(0xa52a2a));
        a.put("burlywood", Integer.valueOf(0xdeb887));
        a.put("cadetblue", Integer.valueOf(0x5f9ea0));
        a.put("chartreuse", Integer.valueOf(0x7fff00));
        a.put("chocolate", Integer.valueOf(0xd2691e));
        a.put("coral", Integer.valueOf(0xff7f50));
        a.put("cornflowerblue", Integer.valueOf(0x6495ed));
        a.put("cornsilk", Integer.valueOf(0xfff8dc));
        a.put("crimson", Integer.valueOf(0xdc143c));
        a.put("cyan", Integer.valueOf(65535));
        a.put("darkblue", Integer.valueOf(139));
        a.put("darkcyan", Integer.valueOf(35723));
        a.put("darkgoldenrod", Integer.valueOf(0xb8860b));
        a.put("darkgray", Integer.valueOf(0xa9a9a9));
        a.put("darkgreen", Integer.valueOf(25600));
        a.put("darkgrey", Integer.valueOf(0xa9a9a9));
        a.put("darkkhaki", Integer.valueOf(0xbdb76b));
        a.put("darkmagenta", Integer.valueOf(0x8b008b));
        a.put("darkolivegreen", Integer.valueOf(0x556b2f));
        a.put("darkorange", Integer.valueOf(0xff8c00));
        a.put("darkorchid", Integer.valueOf(0x9932cc));
        a.put("darkred", Integer.valueOf(0x8b0000));
        a.put("darksalmon", Integer.valueOf(0xe9967a));
        a.put("darkseagreen", Integer.valueOf(0x8fbc8f));
        a.put("darkslateblue", Integer.valueOf(0x483d8b));
        a.put("darkslategray", Integer.valueOf(0x2f4f4f));
        a.put("darkslategrey", Integer.valueOf(0x2f4f4f));
        a.put("darkturquoise", Integer.valueOf(52945));
        a.put("darkviolet", Integer.valueOf(0x9400d3));
        a.put("deeppink", Integer.valueOf(0xff1493));
        a.put("deepskyblue", Integer.valueOf(49151));
        a.put("dimgray", Integer.valueOf(0x696969));
        a.put("dimgrey", Integer.valueOf(0x696969));
        a.put("dodgerblue", Integer.valueOf(0x1e90ff));
        a.put("firebrick", Integer.valueOf(0xb22222));
        a.put("floralwhite", Integer.valueOf(0xfffaf0));
        a.put("forestgreen", Integer.valueOf(0x228b22));
        a.put("fuchsia", Integer.valueOf(0xff00ff));
        a.put("gainsboro", Integer.valueOf(0xdcdcdc));
        a.put("ghostwhite", Integer.valueOf(0xf8f8ff));
        a.put("gold", Integer.valueOf(0xffd700));
        a.put("goldenrod", Integer.valueOf(0xdaa520));
        a.put("gray", Integer.valueOf(0x808080));
        a.put("green", Integer.valueOf(32768));
        a.put("greenyellow", Integer.valueOf(0xadff2f));
        a.put("grey", Integer.valueOf(0x808080));
        a.put("honeydew", Integer.valueOf(0xf0fff0));
        a.put("hotpink", Integer.valueOf(0xff69b4));
        a.put("indianred", Integer.valueOf(0xcd5c5c));
        a.put("indigo", Integer.valueOf(0x4b0082));
        a.put("ivory", Integer.valueOf(0xfffff0));
        a.put("khaki", Integer.valueOf(0xf0e68c));
        a.put("lavender", Integer.valueOf(0xe6e6fa));
        a.put("lavenderblush", Integer.valueOf(0xfff0f5));
        a.put("lawngreen", Integer.valueOf(0x7cfc00));
        a.put("lemonchiffon", Integer.valueOf(0xfffacd));
        a.put("lightblue", Integer.valueOf(0xadd8e6));
        a.put("lightcoral", Integer.valueOf(0xf08080));
        a.put("lightcyan", Integer.valueOf(0xe0ffff));
        a.put("lightgoldenrodyellow", Integer.valueOf(0xfafad2));
        a.put("lightgray", Integer.valueOf(0xd3d3d3));
        a.put("lightgreen", Integer.valueOf(0x90ee90));
        a.put("lightgrey", Integer.valueOf(0xd3d3d3));
        a.put("lightpink", Integer.valueOf(0xffb6c1));
        a.put("lightsalmon", Integer.valueOf(0xffa07a));
        a.put("lightseagreen", Integer.valueOf(0x20b2aa));
        a.put("lightskyblue", Integer.valueOf(0x87cefa));
        a.put("lightslategray", Integer.valueOf(0x778899));
        a.put("lightslategrey", Integer.valueOf(0x778899));
        a.put("lightsteelblue", Integer.valueOf(0xb0c4de));
        a.put("lightyellow", Integer.valueOf(0xffffe0));
        a.put("lime", Integer.valueOf(65280));
        a.put("limegreen", Integer.valueOf(0x32cd32));
        a.put("linen", Integer.valueOf(0xfaf0e6));
        a.put("magenta", Integer.valueOf(0xff00ff));
        a.put("maroon", Integer.valueOf(0x800000));
        a.put("mediumaquamarine", Integer.valueOf(0x66cdaa));
        a.put("mediumblue", Integer.valueOf(205));
        a.put("mediumorchid", Integer.valueOf(0xba55d3));
        a.put("mediumpurple", Integer.valueOf(0x9370db));
        a.put("mediumseagreen", Integer.valueOf(0x3cb371));
        a.put("mediumslateblue", Integer.valueOf(0x7b68ee));
        a.put("mediumspringgreen", Integer.valueOf(64154));
        a.put("mediumturquoise", Integer.valueOf(0x48d1cc));
        a.put("mediumvioletred", Integer.valueOf(0xc71585));
        a.put("midnightblue", Integer.valueOf(0x191970));
        a.put("mintcream", Integer.valueOf(0xf5fffa));
        a.put("mistyrose", Integer.valueOf(0xffe4e1));
        a.put("moccasin", Integer.valueOf(0xffe4b5));
        a.put("navajowhite", Integer.valueOf(0xffdead));
        a.put("navy", Integer.valueOf(128));
        a.put("oldlace", Integer.valueOf(0xfdf5e6));
        a.put("olive", Integer.valueOf(0x808000));
        a.put("olivedrab", Integer.valueOf(0x6b8e23));
        a.put("orange", Integer.valueOf(0xffa500));
        a.put("orangered", Integer.valueOf(0xff4500));
        a.put("orchid", Integer.valueOf(0xda70d6));
        a.put("palegoldenrod", Integer.valueOf(0xeee8aa));
        a.put("palegreen", Integer.valueOf(0x98fb98));
        a.put("paleturquoise", Integer.valueOf(0xafeeee));
        a.put("palevioletred", Integer.valueOf(0xdb7093));
        a.put("papayawhip", Integer.valueOf(0xffefd5));
        a.put("peachpuff", Integer.valueOf(0xffdab9));
        a.put("peru", Integer.valueOf(0xcd853f));
        a.put("pink", Integer.valueOf(0xffc0cb));
        a.put("plum", Integer.valueOf(0xdda0dd));
        a.put("powderblue", Integer.valueOf(0xb0e0e6));
        a.put("purple", Integer.valueOf(0x800080));
        a.put("red", Integer.valueOf(0xff0000));
        a.put("rosybrown", Integer.valueOf(0xbc8f8f));
        a.put("royalblue", Integer.valueOf(0x4169e1));
        a.put("saddlebrown", Integer.valueOf(0x8b4513));
        a.put("salmon", Integer.valueOf(0xfa8072));
        a.put("sandybrown", Integer.valueOf(0xf4a460));
        a.put("seagreen", Integer.valueOf(0x2e8b57));
        a.put("seashell", Integer.valueOf(0xfff5ee));
        a.put("sienna", Integer.valueOf(0xa0522d));
        a.put("silver", Integer.valueOf(0xc0c0c0));
        a.put("skyblue", Integer.valueOf(0x87ceeb));
        a.put("slateblue", Integer.valueOf(0x6a5acd));
        a.put("slategray", Integer.valueOf(0x708090));
        a.put("slategrey", Integer.valueOf(0x708090));
        a.put("snow", Integer.valueOf(0xfffafa));
        a.put("springgreen", Integer.valueOf(65407));
        a.put("steelblue", Integer.valueOf(0x4682b4));
        a.put("tan", Integer.valueOf(0xd2b48c));
        a.put("teal", Integer.valueOf(32896));
        a.put("thistle", Integer.valueOf(0xd8bfd8));
        a.put("tomato", Integer.valueOf(0xff6347));
        a.put("turquoise", Integer.valueOf(0x40e0d0));
        a.put("violet", Integer.valueOf(0xee82ee));
        a.put("wheat", Integer.valueOf(0xf5deb3));
        a.put("white", Integer.valueOf(0xffffff));
        a.put("whitesmoke", Integer.valueOf(0xf5f5f5));
        a.put("yellow", Integer.valueOf(0xffff00));
        a.put("yellowgreen", Integer.valueOf(0x9acd32));
    }
}

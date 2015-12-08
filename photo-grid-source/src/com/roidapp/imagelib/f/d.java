// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

// Referenced classes of package com.roidapp.imagelib.f:
//            f, h, b, c, 
//            a

public final class d
{

    static Matrix a(String s)
    {
        float f2 = 0.0F;
        float f1 = 0.0F;
        if (s.startsWith("matrix("))
        {
            s = c(s.substring(7));
            if (f.a(s).size() == 6)
            {
                Matrix matrix = new Matrix();
                matrix.setValues(new float[] {
                    ((Float)f.a(s).get(0)).floatValue(), ((Float)f.a(s).get(2)).floatValue(), ((Float)f.a(s).get(4)).floatValue(), ((Float)f.a(s).get(1)).floatValue(), ((Float)f.a(s).get(3)).floatValue(), ((Float)f.a(s).get(5)).floatValue(), 0.0F, 0.0F, 1.0F
                });
                return matrix;
            }
        } else
        if (s.startsWith("translate("))
        {
            s = c(s.substring(10));
            if (f.a(s).size() > 0)
            {
                f2 = ((Float)f.a(s).get(0)).floatValue();
                float f3;
                if (f.a(s).size() > 1)
                {
                    f1 = ((Float)f.a(s).get(1)).floatValue();
                } else
                {
                    f1 = 0.0F;
                }
                s = new Matrix();
                s.postTranslate(f2, f1);
                return s;
            }
        } else
        if (s.startsWith("scale("))
        {
            s = c(s.substring(6));
            if (f.a(s).size() > 0)
            {
                f2 = ((Float)f.a(s).get(0)).floatValue();
                if (f.a(s).size() > 1)
                {
                    f1 = ((Float)f.a(s).get(1)).floatValue();
                }
                s = new Matrix();
                s.postScale(f2, f1);
                return s;
            }
        } else
        if (s.startsWith("skewX("))
        {
            s = c(s.substring(6));
            if (f.a(s).size() > 0)
            {
                f1 = ((Float)f.a(s).get(0)).floatValue();
                s = new Matrix();
                s.postSkew((float)Math.tan(f1), 0.0F);
                return s;
            }
        } else
        if (s.startsWith("skewY("))
        {
            s = c(s.substring(6));
            if (f.a(s).size() > 0)
            {
                f1 = ((Float)f.a(s).get(0)).floatValue();
                s = new Matrix();
                s.postSkew(0.0F, (float)Math.tan(f1));
                return s;
            }
        } else
        if (s.startsWith("rotate("))
        {
            s = c(s.substring(7));
            if (f.a(s).size() > 0)
            {
                f3 = ((Float)f.a(s).get(0)).floatValue();
                if (f.a(s).size() > 2)
                {
                    f1 = ((Float)f.a(s).get(1)).floatValue();
                    f2 = ((Float)f.a(s).get(2)).floatValue();
                } else
                {
                    f1 = 0.0F;
                }
                s = new Matrix();
                s.postTranslate(f1, f2);
                s.postRotate(f3);
                s.postTranslate(-f1, -f2);
                return s;
            }
        }
        return null;
    }

    public static b a(Resources resources, int i)
    {
        return a(resources.openRawResource(i), Integer.valueOf(0), Integer.valueOf(0));
    }

    private static b a(InputStream inputstream, Integer integer, Integer integer1)
    {
        try
        {
            System.currentTimeMillis();
            XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            h h1 = new h(picture, (byte)0);
            h1.h = integer;
            h1.i = integer1;
            h1.j = false;
            xmlreader.setContentHandler(h1);
            xmlreader.parse(new InputSource(inputstream));
            inputstream = new b(picture, h1.e);
            inputstream.a(h1.f);
            if (!Float.isInfinite(h1.g.top))
            {
                inputstream.a(h1.g);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new c(inputstream);
        }
        return inputstream;
    }

    static Float a(String s, Attributes attributes, Float float1)
    {
        return b(s, attributes, float1);
    }

    static String a(String s, Attributes attributes)
    {
        return d(s, attributes);
    }

    static Path b(String s)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        a a1;
        Path path;
        char c1;
        int i;
        i = s.length();
        a1 = new a(s);
        a1.a();
        path = new Path();
        c1 = '\0';
        f1 = 0.0F;
        f2 = 0.0F;
        f3 = 0.0F;
        f6 = 0.0F;
        f5 = 0.0F;
        f4 = 0.0F;
_L18:
        if (a1.a >= i) goto _L2; else goto _L1
_L1:
        char c2 = s.charAt(a1.a);
        c2;
        JVM INSTR tableswitch 43 57: default 144
    //                   43 374
    //                   44 144
    //                   45 374
    //                   46 144
    //                   47 144
    //                   48 374
    //                   49 374
    //                   50 374
    //                   51 374
    //                   52 374
    //                   53 374
    //                   54 374
    //                   55 374
    //                   56 374
    //                   57 374;
           goto _L3 _L4 _L3 _L4 _L3 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
        a1.b();
        c1 = c2;
_L14:
        c1;
        JVM INSTR lookupswitch 16: default 292
    //                   65: 1236
    //                   67: 945
    //                   72: 725
    //                   76: 616
    //                   77: 464
    //                   83: 1106
    //                   86: 835
    //                   90: 581
    //                   97: 1236
    //                   99: 945
    //                   104: 725
    //                   108: 616
    //                   109: 464
    //                   115: 1106
    //                   118: 835
    //                   122: 581;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L5:
        float f7 = f2;
        c1 = '\0';
        float f19 = f1;
        f2 = f5;
        f1 = f6;
        f6 = f3;
        f5 = f4;
        f4 = f7;
        f3 = f19;
_L16:
        if (c1 == 0)
        {
            f5 = f1;
            f6 = f2;
        }
        a1.a();
        float f8 = f4;
        float f20 = f1;
        float f30 = f2;
        f4 = f5;
        c1 = c2;
        f1 = f3;
        f2 = f8;
        f3 = f6;
        f6 = f20;
        f5 = f30;
        continue; /* Loop/switch isn't completed */
_L4:
        if (c1 == 'm' || c1 == 'M')
        {
            char c3 = (char)(c1 - 1);
            c2 = c1;
            c1 = c3;
        } else
        {
            if (c1 != 'c' && c1 != 'C')
            {
                continue; /* Loop/switch isn't completed */
            }
            char c4 = c1;
            c2 = c1;
            c1 = c4;
        }
          goto _L14
        if (c1 != 'l' && c1 != 'L') goto _L3; else goto _L15
_L15:
        char c5 = c1;
        c2 = c1;
        c1 = c5;
          goto _L14
_L10:
        float f9 = a1.c();
        float f21 = a1.c();
        if (c1 == 'm')
        {
            path.rMoveTo(f9, f21);
            float f31 = f4;
            float f38 = f3;
            float f44 = f6 + f21;
            float f47 = f5 + f9;
            f4 = f2 + f9;
            c1 = '\0';
            f3 = f1 + f21;
            f5 = f31;
            f6 = f38;
            f1 = f44;
            f2 = f47;
        } else
        {
            path.moveTo(f9, f21);
            c1 = '\0';
            f1 = f21;
            f2 = f9;
            f5 = f4;
            f4 = f9;
            f6 = f3;
            f3 = f21;
        }
          goto _L16
_L13:
        path.close();
        path.moveTo(f2, f1);
        f4 = f2;
        f5 = f1;
        f6 = f2;
        float f10 = f1;
        c1 = '\001';
        f3 = f1;
        f1 = f10;
          goto _L16
_L9:
        float f32 = a1.c();
        float f39 = a1.c();
        if (c1 == 'l')
        {
            path.rLineTo(f32, f39);
            float f11 = f4;
            float f22 = f3;
            f39 = f6 + f39;
            f32 = f5 + f32;
            c1 = '\0';
            f3 = f1;
            f4 = f2;
            f5 = f11;
            f6 = f22;
            f1 = f39;
            f2 = f32;
        } else
        {
            path.lineTo(f32, f39);
            f5 = f4;
            f6 = f3;
            f4 = f2;
            f3 = f1;
            c1 = '\0';
            f2 = f32;
            f1 = f39;
        }
          goto _L16
_L8:
        float f40 = a1.c();
        if (c1 == 'h')
        {
            path.rLineTo(f40, 0.0F);
            float f12 = f4;
            float f23 = f3;
            float f33 = f6;
            f40 = f5 + f40;
            c1 = '\0';
            f3 = f1;
            f4 = f2;
            f5 = f12;
            f6 = f23;
            f1 = f33;
            f2 = f40;
        } else
        {
            path.lineTo(f40, f6);
            f5 = f4;
            float f24 = f3;
            float f13 = f40;
            float f34 = f6;
            c1 = '\0';
            f3 = f1;
            f4 = f2;
            f6 = f24;
            f1 = f34;
            f2 = f13;
        }
          goto _L16
_L12:
        float f35 = a1.c();
        if (c1 == 'v')
        {
            path.rLineTo(0.0F, f35);
            float f14 = f4;
            float f25 = f3;
            float f41 = f6 + f35;
            f35 = f5;
            c1 = '\0';
            f3 = f1;
            f4 = f2;
            f5 = f14;
            f6 = f25;
            f1 = f41;
            f2 = f35;
        } else
        {
            path.lineTo(f5, f35);
            f6 = f4;
            float f15 = f3;
            float f26 = f35;
            f4 = f2;
            f2 = f5;
            c1 = '\0';
            f3 = f1;
            f5 = f6;
            f6 = f15;
            f1 = f26;
        }
          goto _L16
_L7:
        float f55 = a1.c();
        float f50 = a1.c();
        float f54 = a1.c();
        float f48 = a1.c();
        float f52 = a1.c();
        float f45 = a1.c();
        float f42 = f55;
        float f36 = f50;
        float f27 = f54;
        float f16 = f48;
        f4 = f52;
        f3 = f45;
        if (c1 == 'c')
        {
            f42 = f55 + f5;
            f27 = f54 + f5;
            f4 = f52 + f5;
            f36 = f50 + f6;
            f16 = f48 + f6;
            f3 = f45 + f6;
        }
        path.cubicTo(f42, f36, f27, f16, f4, f3);
        f5 = f2;
        c1 = '\001';
        f6 = f27;
        f2 = f4;
        f27 = f3;
        f3 = f1;
        f4 = f5;
        f5 = f16;
        f1 = f27;
          goto _L16
_L11:
        float f53 = a1.c();
        float f49 = a1.c();
        float f51 = a1.c();
        float f46 = a1.c();
        float f43 = f53;
        float f37 = f49;
        float f28 = f51;
        float f17 = f46;
        if (c1 == 's')
        {
            f43 = f53 + f5;
            f28 = f51 + f5;
            f37 = f49 + f6;
            f17 = f46 + f6;
        }
        path.cubicTo(2.0F * f5 - f3, 2.0F * f6 - f4, f43, f37, f28, f17);
        f4 = f2;
        c1 = '\001';
        f6 = f43;
        f5 = f37;
        f2 = f28;
        f3 = f1;
        f1 = f17;
          goto _L16
_L6:
        a1.c();
        a1.c();
        a1.c();
        a1.c();
        a1.c();
        float f29 = a1.c();
        float f18 = a1.c();
        f5 = f4;
        f6 = f3;
        c1 = '\0';
        f3 = f1;
        f4 = f2;
        f1 = f18;
        f2 = f29;
          goto _L16
_L2:
        return path;
        if (true) goto _L18; else goto _L17
_L17:
    }

    static Float b(String s, Attributes attributes)
    {
        return b(s, attributes, null);
    }

    private static Float b(String s, Attributes attributes, Float float1)
    {
        attributes = d(s, attributes);
        if (attributes == null)
        {
            return float1;
        }
        s = attributes;
        if (attributes.endsWith("px"))
        {
            s = attributes.substring(0, attributes.length() - 2);
        }
        return Float.valueOf(Float.parseFloat(s));
    }

    private static f c(String s)
    {
        int k = s.length();
        ArrayList arraylist = new ArrayList();
        int j = 1;
        boolean flag = false;
        int i = 0;
        while (j < k) 
        {
            if (flag)
            {
                flag = false;
            } else
            {
                char c1 = s.charAt(j);
                switch (c1)
                {
                case 9: // '\t'
                case 10: // '\n'
                case 32: // ' '
                case 44: // ','
                case 45: // '-'
                    String s1 = s.substring(i, j);
                    if (s1.trim().length() > 0)
                    {
                        arraylist.add(Float.valueOf(Float.parseFloat(s1)));
                        if (c1 == '-')
                        {
                            i = j;
                        } else
                        {
                            i = j + 1;
                            flag = true;
                        }
                    } else
                    {
                        i++;
                    }
                    break;

                case 41: // ')'
                case 65: // 'A'
                case 67: // 'C'
                case 72: // 'H'
                case 76: // 'L'
                case 77: // 'M'
                case 81: // 'Q'
                case 83: // 'S'
                case 84: // 'T'
                case 86: // 'V'
                case 90: // 'Z'
                case 97: // 'a'
                case 99: // 'c'
                case 104: // 'h'
                case 108: // 'l'
                case 109: // 'm'
                case 113: // 'q'
                case 115: // 's'
                case 116: // 't'
                case 118: // 'v'
                case 122: // 'z'
                    s = s.substring(i, j);
                    if (s.trim().length() > 0)
                    {
                        arraylist.add(Float.valueOf(Float.parseFloat(s)));
                    }
                    return new f(arraylist, j);
                }
            }
            j++;
        }
        String s2 = s.substring(i);
        if (s2.length() > 0)
        {
            try
            {
                arraylist.add(Float.valueOf(Float.parseFloat(s2)));
            }
            catch (NumberFormatException numberformatexception) { }
            i = s.length();
        }
        return new f(arraylist, i);
    }

    static f c(String s, Attributes attributes)
    {
        int j = attributes.getLength();
        for (int i = 0; i < j; i++)
        {
            if (attributes.getLocalName(i).equals(s))
            {
                return c(attributes.getValue(i));
            }
        }

        return null;
    }

    private static String d(String s, Attributes attributes)
    {
        int j = attributes.getLength();
        for (int i = 0; i < j; i++)
        {
            if (attributes.getLocalName(i).equals(s))
            {
                return attributes.getValue(i);
            }
        }

        return null;
    }
}

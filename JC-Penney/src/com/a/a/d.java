// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.res.AssetManager;
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

// Referenced classes of package com.a.a:
//            h, b, c, g, 
//            a

public class d
{

    static Matrix a(String s)
    {
        return d(s);
    }

    public static b a(AssetManager assetmanager, String s)
    {
        assetmanager = assetmanager.open(s);
        s = a(((InputStream) (assetmanager)));
        assetmanager.close();
        return s;
    }

    public static b a(InputStream inputstream)
    {
        return a(inputstream, Integer.valueOf(0), Integer.valueOf(0), false);
    }

    private static b a(InputStream inputstream, Integer integer, Integer integer1, boolean flag)
    {
        try
        {
            System.currentTimeMillis();
            XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            h h1 = new h(picture, null);
            h1.a(integer, integer1);
            h1.a(flag);
            xmlreader.setContentHandler(h1);
            xmlreader.parse(new InputSource(inputstream));
            inputstream = new b(picture, h1.e);
            if (!Float.isInfinite(h1.f.top))
            {
                inputstream.a(h1.f);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new c(inputstream);
        }
        return inputstream;
    }

    static String a(String s, Attributes attributes)
    {
        return f(s, attributes);
    }

    static Path b(String s)
    {
        return e(s);
    }

    static Integer b(String s, Attributes attributes)
    {
        return h(s, attributes);
    }

    private static g c(String s)
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
                case 67: // 'C'
                case 72: // 'H'
                case 76: // 'L'
                case 77: // 'M'
                case 81: // 'Q'
                case 83: // 'S'
                case 84: // 'T'
                case 86: // 'V'
                case 90: // 'Z'
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
                    return new g(arraylist, j);
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
        return new g(arraylist, i);
    }

    static Float c(String s, Attributes attributes)
    {
        return g(s, attributes);
    }

    private static Matrix d(String s)
    {
        float f2 = 0.0F;
        float f1 = 0.0F;
        if (s.startsWith("matrix("))
        {
            s = c(s.substring("matrix(".length()));
            if (com.a.a.g.a(s).size() == 6)
            {
                Matrix matrix = new Matrix();
                matrix.setValues(new float[] {
                    ((Float)com.a.a.g.a(s).get(0)).floatValue(), ((Float)com.a.a.g.a(s).get(2)).floatValue(), ((Float)com.a.a.g.a(s).get(4)).floatValue(), ((Float)com.a.a.g.a(s).get(1)).floatValue(), ((Float)com.a.a.g.a(s).get(3)).floatValue(), ((Float)com.a.a.g.a(s).get(5)).floatValue(), 0.0F, 0.0F, 1.0F
                });
                return matrix;
            }
        } else
        if (s.startsWith("translate("))
        {
            s = c(s.substring("translate(".length()));
            if (com.a.a.g.a(s).size() > 0)
            {
                f2 = ((Float)com.a.a.g.a(s).get(0)).floatValue();
                float f3;
                if (com.a.a.g.a(s).size() > 1)
                {
                    f1 = ((Float)com.a.a.g.a(s).get(1)).floatValue();
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
            s = c(s.substring("scale(".length()));
            if (com.a.a.g.a(s).size() > 0)
            {
                f2 = ((Float)com.a.a.g.a(s).get(0)).floatValue();
                if (com.a.a.g.a(s).size() > 1)
                {
                    f1 = ((Float)com.a.a.g.a(s).get(1)).floatValue();
                }
                s = new Matrix();
                s.postScale(f2, f1);
                return s;
            }
        } else
        if (s.startsWith("skewX("))
        {
            s = c(s.substring("skewX(".length()));
            if (com.a.a.g.a(s).size() > 0)
            {
                f1 = ((Float)com.a.a.g.a(s).get(0)).floatValue();
                s = new Matrix();
                s.postSkew((float)Math.tan(f1), 0.0F);
                return s;
            }
        } else
        if (s.startsWith("skewY("))
        {
            s = c(s.substring("skewY(".length()));
            if (com.a.a.g.a(s).size() > 0)
            {
                f1 = ((Float)com.a.a.g.a(s).get(0)).floatValue();
                s = new Matrix();
                s.postSkew(0.0F, (float)Math.tan(f1));
                return s;
            }
        } else
        if (s.startsWith("rotate("))
        {
            s = c(s.substring("rotate(".length()));
            if (com.a.a.g.a(s).size() > 0)
            {
                f3 = ((Float)com.a.a.g.a(s).get(0)).floatValue();
                if (com.a.a.g.a(s).size() > 2)
                {
                    f1 = ((Float)com.a.a.g.a(s).get(1)).floatValue();
                    f2 = ((Float)com.a.a.g.a(s).get(2)).floatValue();
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

    static g d(String s, Attributes attributes)
    {
        return e(s, attributes);
    }

    private static Path e(String s)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        a a1;
        Path path;
        int i;
        i = s.length();
        a1 = new a(s, 0);
        a1.a();
        path = new Path();
        f3 = 0.0F;
        f4 = 0.0F;
        f1 = 0.0F;
        f2 = 0.0F;
_L10:
        char c1;
        if (a1.a >= i)
        {
            break MISSING_BLOCK_LABEL_870;
        }
        c1 = s.charAt(a1.a);
        a1.c();
        c1;
        JVM INSTR lookupswitch 14: default 192
    //                   67: 606
    //                   72: 450
    //                   76: 364
    //                   77: 249
    //                   83: 750
    //                   86: 527
    //                   90: 335
    //                   99: 606
    //                   104: 450
    //                   108: 364
    //                   109: 249
    //                   115: 750
    //                   118: 527
    //                   122: 335;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break MISSING_BLOCK_LABEL_750;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        c1 = '\0';
        float f5 = f3;
        f3 = f2;
        float f15 = f1;
        f2 = f4;
        f1 = f5;
        f4 = f15;
_L11:
        if (c1 == 0)
        {
            f3 = f1;
            f4 = f2;
        }
        a1.a();
        float f6 = f1;
        float f16 = f2;
        f1 = f4;
        f2 = f3;
        f3 = f6;
        f4 = f16;
        if (true) goto _L10; else goto _L9
_L9:
        float f7 = a1.e();
        float f17 = a1.e();
        if (c1 == 'm')
        {
            path.rMoveTo(f7, f17);
            c1 = '\0';
            f7 = f4 + f7;
            f17 = f3 + f17;
            f3 = f2;
            f4 = f1;
            f1 = f17;
            f2 = f7;
        } else
        {
            path.moveTo(f7, f17);
            c1 = '\0';
            f3 = f2;
            f4 = f1;
            f1 = f17;
            f2 = f7;
        }
          goto _L11
_L8:
        path.close();
        c1 = '\0';
        float f8 = f4;
        float f18 = f3;
        f3 = f2;
        f4 = f1;
        f1 = f18;
        f2 = f8;
          goto _L11
_L4:
        float f9 = a1.e();
        float f19 = a1.e();
        if (c1 == 'l')
        {
            path.rLineTo(f9, f19);
            c1 = '\0';
            f9 = f4 + f9;
            f19 = f3 + f19;
            f3 = f2;
            f4 = f1;
            f1 = f19;
            f2 = f9;
        } else
        {
            path.lineTo(f9, f19);
            c1 = '\0';
            f3 = f2;
            f4 = f1;
            f1 = f19;
            f2 = f9;
        }
          goto _L11
_L3:
        float f10 = a1.e();
        if (c1 == 'h')
        {
            path.rLineTo(f10, 0.0F);
            c1 = '\0';
            float f20 = f4 + f10;
            f10 = f3;
            f3 = f2;
            f4 = f1;
            f1 = f10;
            f2 = f20;
        } else
        {
            path.lineTo(f10, f3);
            c1 = '\0';
            float f21 = f3;
            f3 = f2;
            f4 = f1;
            f1 = f21;
            f2 = f10;
        }
          goto _L11
_L7:
        float f22 = a1.e();
        if (c1 == 'v')
        {
            path.rLineTo(0.0F, f22);
            c1 = '\0';
            float f11 = f4;
            f22 = f3 + f22;
            f3 = f2;
            f4 = f1;
            f1 = f22;
            f2 = f11;
        } else
        {
            path.lineTo(f4, f22);
            c1 = '\0';
            float f12 = f4;
            f3 = f2;
            f4 = f1;
            f1 = f22;
            f2 = f12;
        }
          goto _L11
_L2:
        float f38 = a1.e();
        float f33 = a1.e();
        float f37 = a1.e();
        float f31 = a1.e();
        float f35 = a1.e();
        float f29 = a1.e();
        float f27 = f38;
        float f25 = f33;
        float f13 = f37;
        float f23 = f31;
        f1 = f35;
        f2 = f29;
        if (c1 == 'c')
        {
            f27 = f38 + f4;
            f13 = f37 + f4;
            f1 = f35 + f4;
            f25 = f33 + f3;
            f23 = f31 + f3;
            f2 = f29 + f3;
        }
        path.cubicTo(f27, f25, f13, f23, f1, f2);
        f3 = f23;
        f4 = f13;
        f13 = f1;
        c1 = '\001';
        f1 = f2;
        f2 = f13;
          goto _L11
        float f36 = a1.e();
        float f32 = a1.e();
        float f34 = a1.e();
        float f30 = a1.e();
        float f26 = f36;
        float f28 = f32;
        float f14 = f34;
        float f24 = f30;
        if (c1 == 's')
        {
            f26 = f36 + f4;
            f14 = f34 + f4;
            f28 = f32 + f3;
            f24 = f30 + f3;
        }
        path.cubicTo(f4 * 2.0F - f1, f3 * 2.0F - f2, f26, f28, f14, f24);
        f3 = f28;
        f4 = f26;
        f1 = f24;
        f2 = f14;
        c1 = '\001';
          goto _L11
        return path;
    }

    private static g e(String s, Attributes attributes)
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

    private static String f(String s, Attributes attributes)
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

    private static Float g(String s, Attributes attributes)
    {
        attributes = f(s, attributes);
        if (attributes == null)
        {
            return null;
        }
        s = attributes;
        if (attributes.endsWith("px"))
        {
            s = attributes.substring(0, attributes.length() - 2);
        }
        return Float.valueOf(Float.parseFloat(s));
    }

    private static Integer h(String s, Attributes attributes)
    {
        s = f(s, attributes);
        if (s == null)
        {
            return null;
        }
        int i;
        try
        {
            i = Integer.parseInt(s.substring(1), 16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return Integer.valueOf(i);
    }
}

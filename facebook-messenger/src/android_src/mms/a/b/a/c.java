// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b.a;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import org.a.a.b.f;
import org.a.a.b.g;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class c
{

    public c()
    {
    }

    private static void a(Writer writer, Element element)
    {
        writer.write(60);
        writer.write(element.getTagName());
        if (element.hasAttributes())
        {
            NamedNodeMap namednodemap = element.getAttributes();
            for (int i = 0; i < namednodemap.getLength(); i++)
            {
                Attr attr = (Attr)namednodemap.item(i);
                writer.write((new StringBuilder()).append(" ").append(attr.getName()).toString());
                writer.write((new StringBuilder()).append("=\"").append(attr.getValue()).append("\"").toString());
            }

        }
        g g1 = (g)element.getFirstChild();
        if (g1 != null)
        {
            writer.write(62);
            g g2;
            do
            {
                a(writer, ((Element) (g1)));
                g2 = (g)g1.getNextSibling();
                g1 = g2;
            } while (g2 != null);
            writer.write("</");
            writer.write(element.getTagName());
            writer.write(62);
            return;
        } else
        {
            writer.write("/>");
            return;
        }
    }

    public static void a(f f1, OutputStream outputstream)
    {
        try
        {
            outputstream = new BufferedWriter(new OutputStreamWriter(outputstream, "UTF-8"), 2048);
            a(((Writer) (outputstream)), f1.getDocumentElement());
            outputstream.flush();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            f1.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            f1.printStackTrace();
        }
    }
}

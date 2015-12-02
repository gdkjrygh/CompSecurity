// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b.a;

import android_src.mms.d;
import java.io.InputStream;
import org.a.a.b.f;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

// Referenced classes of package android_src.mms.a.b.a:
//            a

public class b
{

    private XMLReader a;
    private a b;

    public b()
    {
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
        try
        {
            a = XMLReaderFactory.createXMLReader();
            b = new a();
            a.setContentHandler(b);
            return;
        }
        catch (SAXException saxexception)
        {
            throw new d(saxexception);
        }
    }

    private void a(f f1)
    {
        f1.c();
        f1.d();
    }

    public f a(InputStream inputstream)
    {
        b.a();
        a.parse(new InputSource(inputstream));
        inputstream = b.b();
        a(((f) (inputstream)));
        return inputstream;
    }
}

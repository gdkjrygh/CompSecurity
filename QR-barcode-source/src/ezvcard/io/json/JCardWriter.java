// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.property.ProductId;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.io.json:
//            JCardRawWriter, JCardValue

public class JCardWriter
    implements Closeable, Flushable
{

    private boolean addProdId;
    private ScribeIndex index;
    private final VCardVersion targetVersion;
    private boolean versionStrict;
    private final JCardRawWriter writer;

    public JCardWriter(File file)
        throws IOException
    {
        this(IOUtils.utf8Writer(file));
    }

    public JCardWriter(File file, boolean flag)
        throws IOException
    {
        this(IOUtils.utf8Writer(file), flag);
    }

    public JCardWriter(OutputStream outputstream)
    {
        this(IOUtils.utf8Writer(outputstream));
    }

    public JCardWriter(OutputStream outputstream, boolean flag)
    {
        this(IOUtils.utf8Writer(outputstream), flag);
    }

    public JCardWriter(Writer writer1)
    {
        this(writer1, false);
    }

    public JCardWriter(Writer writer1, boolean flag)
    {
        index = new ScribeIndex();
        targetVersion = VCardVersion.V4_0;
        addProdId = true;
        versionStrict = true;
        writer = new JCardRawWriter(writer1, flag);
    }

    public void close()
        throws IOException
    {
        writer.close();
    }

    public void closeJsonStream()
        throws IOException
    {
        writer.closeJsonStream();
    }

    public void flush()
        throws IOException
    {
        writer.flush();
    }

    public ScribeIndex getScribeIndex()
    {
        return index;
    }

    public boolean isAddProdId()
    {
        return addProdId;
    }

    public boolean isIndent()
    {
        return writer.isIndent();
    }

    public boolean isVersionStrict()
    {
        return versionStrict;
    }

    public void registerScribe(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
    }

    public void setAddProdId(boolean flag)
    {
        addProdId = flag;
    }

    public void setIndent(boolean flag)
    {
        writer.setIndent(flag);
    }

    public void setScribeIndex(ScribeIndex scribeindex)
    {
        index = scribeindex;
    }

    public void setVersionStrict(boolean flag)
    {
        versionStrict = flag;
    }

    public void write(VCard vcard)
        throws IOException
    {
        Object obj1 = new ArrayList();
        Iterator iterator = vcard.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            VCardProperty vcardproperty = (VCardProperty)iterator.next();
            if ((!addProdId || !(vcardproperty instanceof ProductId)) && (!versionStrict || vcardproperty.getSupportedVersions().contains(targetVersion)))
            {
                if (index.getPropertyScribe(vcardproperty) == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No scribe found for property class \"").append(vcardproperty.getClass().getName()).append("\".").toString());
                }
                ((List) (obj1)).add(vcardproperty);
            }
        } while (true);
        if (addProdId)
        {
            Object obj;
            SkipMeException skipmeexception;
            VCardPropertyScribe vcardpropertyscribe;
            JCardValue jcardvalue;
            ezvcard.parameter.VCardParameters vcardparameters;
            if (targetVersion == VCardVersion.V2_1)
            {
                obj = new RawProperty("X-PRODID", (new StringBuilder()).append("ezvcard ").append(Ezvcard.VERSION).toString());
            } else
            {
                obj = new ProductId((new StringBuilder()).append("ezvcard ").append(Ezvcard.VERSION).toString());
            }
            ((List) (obj1)).add(obj);
        }
        writer.writeStartVCard();
        writer.writeProperty("version", VCardDataType.TEXT, JCardValue.single(targetVersion.getVersion()));
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            obj1 = (VCardProperty)((Iterator) (obj)).next();
            vcardpropertyscribe = index.getPropertyScribe(((VCardProperty) (obj1)));
            try
            {
                jcardvalue = new JCardValue(vcardpropertyscribe.writeJson(((VCardProperty) (obj1))).getValues());
                vcardparameters = vcardpropertyscribe.prepareParameters(((VCardProperty) (obj1)), targetVersion, vcard);
                writer.writeProperty(((VCardProperty) (obj1)).getGroup(), vcardpropertyscribe.getPropertyName().toLowerCase(), vcardparameters, vcardpropertyscribe.dataType(((VCardProperty) (obj1)), targetVersion), jcardvalue);
            }
            // Misplaced declaration of an exception variable
            catch (SkipMeException skipmeexception) { }
            catch (EmbeddedVCardException embeddedvcardexception) { }
        }

        writer.writeEndVCard();
    }
}

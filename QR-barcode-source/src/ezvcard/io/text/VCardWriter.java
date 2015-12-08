// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.ProductId;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.io.text:
//            FoldingScheme, VCardRawWriter

public class VCardWriter
    implements Closeable, Flushable
{

    private boolean addProdId;
    private ScribeIndex index;
    private boolean versionStrict;
    private final VCardRawWriter writer;

    public VCardWriter(File file)
        throws IOException
    {
        this(((Writer) (new FileWriter(file, false))));
    }

    public VCardWriter(File file, boolean flag)
        throws IOException
    {
        this(((Writer) (new FileWriter(file, flag))));
    }

    public VCardWriter(File file, boolean flag, VCardVersion vcardversion)
        throws IOException
    {
        if (vcardversion == VCardVersion.V4_0)
        {
            file = IOUtils.utf8Writer(file, flag);
        } else
        {
            file = new FileWriter(file, flag);
        }
        this(((Writer) (file)), vcardversion);
    }

    public VCardWriter(File file, boolean flag, VCardVersion vcardversion, FoldingScheme foldingscheme, String s)
        throws IOException
    {
        if (vcardversion == VCardVersion.V4_0)
        {
            file = IOUtils.utf8Writer(file, flag);
        } else
        {
            file = new FileWriter(file, flag);
        }
        this(((Writer) (file)), vcardversion, foldingscheme, s);
    }

    public VCardWriter(OutputStream outputstream)
    {
        this(((Writer) (new OutputStreamWriter(outputstream))));
    }

    public VCardWriter(OutputStream outputstream, VCardVersion vcardversion)
    {
        if (vcardversion == VCardVersion.V4_0)
        {
            outputstream = IOUtils.utf8Writer(outputstream);
        } else
        {
            outputstream = new OutputStreamWriter(outputstream);
        }
        this(((Writer) (outputstream)), vcardversion);
    }

    public VCardWriter(OutputStream outputstream, VCardVersion vcardversion, FoldingScheme foldingscheme, String s)
    {
        if (vcardversion == VCardVersion.V4_0)
        {
            outputstream = IOUtils.utf8Writer(outputstream);
        } else
        {
            outputstream = new OutputStreamWriter(outputstream);
        }
        this(((Writer) (outputstream)), vcardversion, foldingscheme, s);
    }

    public VCardWriter(Writer writer1)
    {
        this(writer1, VCardVersion.V3_0);
    }

    public VCardWriter(Writer writer1, VCardVersion vcardversion)
    {
        this(writer1, vcardversion, FoldingScheme.MIME_DIR, "\r\n");
    }

    public VCardWriter(Writer writer1, VCardVersion vcardversion, FoldingScheme foldingscheme, String s)
    {
        index = new ScribeIndex();
        addProdId = true;
        versionStrict = true;
        writer = new VCardRawWriter(writer1, vcardversion, foldingscheme, s);
    }

    private void write(VCard vcard, boolean flag)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj3;
        VCardVersion vcardversion;
        VCardProperty vcardproperty;
        VCardPropertyScribe vcardpropertyscribe;
        vcardversion = writer.getVersion();
        obj1 = new ArrayList();
        obj = vcard.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj2 = (VCardProperty)((Iterator) (obj)).next();
            if ((!flag || !(obj2 instanceof ProductId)) && (!versionStrict || ((VCardProperty) (obj2)).getSupportedVersions().contains(vcardversion)))
            {
                if (index.getPropertyScribe(((VCardProperty) (obj2))) == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No scribe found for property class \"").append(obj2.getClass().getName()).append("\".").toString());
                }
                ((List) (obj1)).add(obj2);
                if ((obj2 instanceof Address) && (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0))
                {
                    obj2 = (Address)obj2;
                    Object obj4 = ((Address) (obj2)).getLabel();
                    if (obj4 != null)
                    {
                        obj4 = new Label(((String) (obj4)));
                        for (obj2 = ((Address) (obj2)).getTypes().iterator(); ((Iterator) (obj2)).hasNext(); ((Label) (obj4)).addType((AddressType)((Iterator) (obj2)).next())) { }
                        ((List) (obj1)).add(obj4);
                    }
                }
            }
        } while (true);
        if (flag)
        {
            Iterator iterator;
            VCardDataType vcarddatatype;
            if (vcardversion == VCardVersion.V2_1)
            {
                obj = new RawProperty("X-PRODID", (new StringBuilder()).append("ezvcard ").append(Ezvcard.VERSION).toString());
            } else
            {
                obj = new ProductId((new StringBuilder()).append("ezvcard ").append(Ezvcard.VERSION).toString());
            }
            ((List) (obj1)).add(obj);
        }
        writer.writeBeginComponent("VCARD");
        writer.writeVersion();
        iterator = ((List) (obj1)).iterator();
_L6:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_666;
        }
        vcardproperty = (VCardProperty)iterator.next();
        vcardpropertyscribe = index.getPropertyScribe(vcardproperty);
        obj1 = null;
        obj = null;
        obj3 = vcardpropertyscribe.writeText(vcardproperty, vcardversion);
        obj1 = obj3;
_L2:
        obj3 = vcardpropertyscribe.prepareParameters(vcardproperty, vcardversion, vcard);
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = vcardpropertyscribe.dataType(vcardproperty, vcardversion);
        if (obj != null)
        {
            vcarddatatype = vcardpropertyscribe.defaultDataType(vcardversion);
            if (obj != vcarddatatype && (vcarddatatype != VCardDataType.DATE_AND_OR_TIME || obj != VCardDataType.DATE && obj != VCardDataType.DATE_TIME && obj != VCardDataType.TIME))
            {
                ((VCardParameters) (obj3)).setValue(((VCardDataType) (obj)));
            }
        }
        writer.writeProperty(vcardproperty.getGroup(), vcardpropertyscribe.getPropertyName(), ((VCardParameters) (obj3)), ((String) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        obj = ((EmbeddedVCardException) (obj)).getVCard();
        if (true) goto _L2; else goto _L1
_L1:
        StringWriter stringwriter;
        if (vcardversion == VCardVersion.V2_1)
        {
            writer.writeProperty(vcardproperty.getGroup(), vcardpropertyscribe.getPropertyName(), ((VCardParameters) (obj3)), ((String) (obj1)));
            write(((VCard) (obj)), false);
            continue; /* Loop/switch isn't completed */
        }
        stringwriter = new StringWriter();
        obj1 = new VCardWriter(stringwriter, vcardversion, null, "\n");
        ((VCardWriter) (obj1)).setAddProdId(false);
        ((VCardWriter) (obj1)).setVersionStrict(versionStrict);
        ((VCardWriter) (obj1)).write(((VCard) (obj)));
        IOUtils.closeQuietly(((Closeable) (obj1)));
_L4:
        String s = VCardPropertyScribe.escape(stringwriter.toString());
        writer.writeProperty(vcardproperty.getGroup(), vcardpropertyscribe.getPropertyName(), ((VCardParameters) (obj3)), s);
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        IOUtils.closeQuietly(((Closeable) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        vcard;
        IOUtils.closeQuietly(((Closeable) (obj1)));
        throw vcard;
        writer.writeEndComponent("VCARD");
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void close()
        throws IOException
    {
        writer.close();
    }

    public void flush()
        throws IOException
    {
        writer.flush();
    }

    public FoldingScheme getFoldingScheme()
    {
        return writer.getFoldingScheme();
    }

    public String getNewline()
    {
        return writer.getNewline();
    }

    public ScribeIndex getScribeIndex()
    {
        return index;
    }

    public VCardVersion getTargetVersion()
    {
        return writer.getVersion();
    }

    public boolean isAddProdId()
    {
        return addProdId;
    }

    public boolean isCaretEncodingEnabled()
    {
        return writer.isCaretEncodingEnabled();
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

    public void setCaretEncodingEnabled(boolean flag)
    {
        writer.setCaretEncodingEnabled(flag);
    }

    public void setScribeIndex(ScribeIndex scribeindex)
    {
        index = scribeindex;
    }

    public void setTargetVersion(VCardVersion vcardversion)
    {
        writer.setVersion(vcardversion);
    }

    public void setVersionStrict(boolean flag)
    {
        versionStrict = flag;
    }

    public void write(VCard vcard)
        throws IOException
    {
        write(vcard, addProdId);
    }
}

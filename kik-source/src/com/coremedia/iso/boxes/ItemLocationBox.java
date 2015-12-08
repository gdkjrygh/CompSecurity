// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

public class ItemLocationBox extends AbstractFullBox
{
    public class Extent
    {

        public long extentIndex;
        public long extentLength;
        public long extentOffset;
        final ItemLocationBox this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Extent)obj;
                if (extentIndex != ((Extent) (obj)).extentIndex)
                {
                    return false;
                }
                if (extentLength != ((Extent) (obj)).extentLength)
                {
                    return false;
                }
                if (extentOffset != ((Extent) (obj)).extentOffset)
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            if (getVersion() == 1 && indexSize > 0)
            {
                IsoTypeWriterVariable.write(extentIndex, bytebuffer, indexSize);
            }
            IsoTypeWriterVariable.write(extentOffset, bytebuffer, offsetSize);
            IsoTypeWriterVariable.write(extentLength, bytebuffer, lengthSize);
        }

        public int getSize()
        {
            int i;
            if (indexSize > 0)
            {
                i = indexSize;
            } else
            {
                i = 0;
            }
            return i + offsetSize + lengthSize;
        }

        public int hashCode()
        {
            return ((int)(extentOffset ^ extentOffset >>> 32) * 31 + (int)(extentLength ^ extentLength >>> 32)) * 31 + (int)(extentIndex ^ extentIndex >>> 32);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Extent");
            stringbuilder.append("{extentOffset=").append(extentOffset);
            stringbuilder.append(", extentLength=").append(extentLength);
            stringbuilder.append(", extentIndex=").append(extentIndex);
            stringbuilder.append('}');
            return stringbuilder.toString();
        }

        public Extent(long l, long l1, long l2)
        {
            this$0 = ItemLocationBox.this;
            super();
            extentOffset = l;
            extentLength = l1;
            extentIndex = l2;
        }

        public Extent(ByteBuffer bytebuffer)
        {
            this$0 = ItemLocationBox.this;
            super();
            if (getVersion() == 1 && indexSize > 0)
            {
                extentIndex = IsoTypeReaderVariable.read(bytebuffer, indexSize);
            }
            extentOffset = IsoTypeReaderVariable.read(bytebuffer, offsetSize);
            extentLength = IsoTypeReaderVariable.read(bytebuffer, lengthSize);
        }
    }

    public class Item
    {

        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List extents;
        public int itemId;
        final ItemLocationBox this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Item)obj;
                if (baseOffset != ((Item) (obj)).baseOffset)
                {
                    return false;
                }
                if (constructionMethod != ((Item) (obj)).constructionMethod)
                {
                    return false;
                }
                if (dataReferenceIndex != ((Item) (obj)).dataReferenceIndex)
                {
                    return false;
                }
                if (itemId != ((Item) (obj)).itemId)
                {
                    return false;
                }
                if (extents == null ? ((Item) (obj)).extents != null : !extents.equals(((Item) (obj)).extents))
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            IsoTypeWriter.writeUInt16(bytebuffer, itemId);
            if (getVersion() == 1)
            {
                IsoTypeWriter.writeUInt16(bytebuffer, constructionMethod);
            }
            IsoTypeWriter.writeUInt16(bytebuffer, dataReferenceIndex);
            if (baseOffsetSize > 0)
            {
                IsoTypeWriterVariable.write(baseOffset, bytebuffer, baseOffsetSize);
            }
            IsoTypeWriter.writeUInt16(bytebuffer, extents.size());
            Iterator iterator = extents.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                ((Extent)iterator.next()).getContent(bytebuffer);
            } while (true);
        }

        public int getSize()
        {
            int i = 2;
            if (getVersion() == 1)
            {
                i = 4;
            }
            int j = baseOffsetSize;
            Iterator iterator = extents.iterator();
            i = i + 2 + j + 2;
            do
            {
                if (!iterator.hasNext())
                {
                    return i;
                }
                i = ((Extent)iterator.next()).getSize() + i;
            } while (true);
        }

        public int hashCode()
        {
            int j = itemId;
            int k = constructionMethod;
            int l = dataReferenceIndex;
            int i1 = (int)(baseOffset ^ baseOffset >>> 32);
            int i;
            if (extents != null)
            {
                i = extents.hashCode();
            } else
            {
                i = 0;
            }
            return i + (((j * 31 + k) * 31 + l) * 31 + i1) * 31;
        }

        public void setBaseOffset(long l)
        {
            baseOffset = l;
        }

        public String toString()
        {
            return (new StringBuilder("Item{baseOffset=")).append(baseOffset).append(", itemId=").append(itemId).append(", constructionMethod=").append(constructionMethod).append(", dataReferenceIndex=").append(dataReferenceIndex).append(", extents=").append(extents).append('}').toString();
        }

        public Item(int i, int j, int k, long l, List list)
        {
            this$0 = ItemLocationBox.this;
            super();
            extents = new LinkedList();
            itemId = i;
            constructionMethod = j;
            dataReferenceIndex = k;
            baseOffset = l;
            extents = list;
        }

        public Item(ByteBuffer bytebuffer)
        {
            this$0 = ItemLocationBox.this;
            super();
            extents = new LinkedList();
            itemId = IsoTypeReader.readUInt16(bytebuffer);
            if (getVersion() == 1)
            {
                constructionMethod = IsoTypeReader.readUInt16(bytebuffer) & 0xf;
            }
            dataReferenceIndex = IsoTypeReader.readUInt16(bytebuffer);
            int i;
            int j;
            if (baseOffsetSize > 0)
            {
                baseOffset = IsoTypeReaderVariable.read(bytebuffer, baseOffsetSize);
            } else
            {
                baseOffset = 0L;
            }
            j = IsoTypeReader.readUInt16(bytebuffer);
            i = 0;
            do
            {
                if (i >= j)
                {
                    return;
                }
                extents.add(new Extent(bytebuffer));
                i++;
            } while (true);
        }
    }


    public static final String TYPE = "iloc";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    public int baseOffsetSize;
    public int indexSize;
    public List items;
    public int lengthSize;
    public int offsetSize;

    public ItemLocationBox()
    {
        super("iloc");
        offsetSize = 8;
        lengthSize = 8;
        baseOffsetSize = 8;
        indexSize = 0;
        items = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("ItemLocationBox.java", com/coremedia/iso/boxes/ItemLocationBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int i = IsoTypeReader.readUInt8(bytebuffer);
        offsetSize = i >>> 4;
        lengthSize = i & 0xf;
        i = IsoTypeReader.readUInt8(bytebuffer);
        baseOffsetSize = i >>> 4;
        if (getVersion() == 1)
        {
            indexSize = i & 0xf;
        }
        int j = IsoTypeReader.readUInt16(bytebuffer);
        i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            items.add(new Item(bytebuffer));
            i++;
        } while (true);
    }

    public Extent createExtent(long l, long l1, long l2)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, new Object[] {
            a.a(l), a.a(l1), a.a(l2)
        });
        RequiresParseDetailAspect.aspectOf().before(a1);
        return new Extent(l, l1, l2);
    }

    Extent createExtent(ByteBuffer bytebuffer)
    {
        return new Extent(bytebuffer);
    }

    public Item createItem(int i, int j, int k, long l, List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, new Object[] {
            a.a(i), a.a(j), a.a(k), a.a(l), list
        });
        RequiresParseDetailAspect.aspectOf().before(a1);
        return new Item(i, j, k, l, list);
    }

    Item createItem(ByteBuffer bytebuffer)
    {
        return new Item(bytebuffer);
    }

    public int getBaseOffsetSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return baseOffsetSize;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt8(bytebuffer, offsetSize << 4 | lengthSize);
        Iterator iterator;
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt8(bytebuffer, baseOffsetSize << 4 | indexSize);
        } else
        {
            IsoTypeWriter.writeUInt8(bytebuffer, baseOffsetSize << 4);
        }
        IsoTypeWriter.writeUInt16(bytebuffer, items.size());
        iterator = items.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Item)iterator.next()).getContent(bytebuffer);
        } while (true);
    }

    protected long getContentSize()
    {
        Iterator iterator = items.iterator();
        long l = 8L;
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l = (long)((Item)iterator.next()).getSize() + l;
        } while (true);
    }

    public int getIndexSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return indexSize;
    }

    public List getItems()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return items;
    }

    public int getLengthSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return lengthSize;
    }

    public int getOffsetSize()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return offsetSize;
    }

    public void setBaseOffsetSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        baseOffsetSize = i;
    }

    public void setIndexSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        indexSize = i;
    }

    public void setItems(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        items = list;
    }

    public void setLengthSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        lengthSize = i;
    }

    public void setOffsetSize(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        offsetSize = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cw;
import cx;
import cy;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ItemLocationBox extends ft
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
                cy.a(extentIndex, bytebuffer, indexSize);
            }
            cy.a(extentOffset, bytebuffer, offsetSize);
            cy.a(extentLength, bytebuffer, lengthSize);
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
                extentIndex = cw.a(bytebuffer, indexSize);
            }
            extentOffset = cw.a(bytebuffer, offsetSize);
            extentLength = cw.a(bytebuffer, lengthSize);
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
            cx.b(bytebuffer, itemId);
            if (getVersion() == 1)
            {
                cx.b(bytebuffer, constructionMethod);
            }
            cx.b(bytebuffer, dataReferenceIndex);
            if (baseOffsetSize > 0)
            {
                cy.a(baseOffset, bytebuffer, baseOffsetSize);
            }
            cx.b(bytebuffer, extents.size());
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
            itemId = cv.c(bytebuffer);
            if (getVersion() == 1)
            {
                constructionMethod = cv.c(bytebuffer) & 0xf;
            }
            dataReferenceIndex = cv.c(bytebuffer);
            int i;
            int j;
            if (baseOffsetSize > 0)
            {
                baseOffset = cw.a(bytebuffer, baseOffsetSize);
            } else
            {
                baseOffset = 0L;
            }
            j = cv.c(bytebuffer);
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
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
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
        akN akn = new akN("ItemLocationBox.java", com/coremedia/iso/boxes/ItemLocationBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int i = cv.d(bytebuffer);
        offsetSize = i >>> 4;
        lengthSize = i & 0xf;
        i = cv.d(bytebuffer);
        baseOffsetSize = i >>> 4;
        if (getVersion() == 1)
        {
            indexSize = i & 0xf;
        }
        int j = cv.c(bytebuffer);
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
        Object obj = ajc$tjp_11;
        akL.a(l);
        akL.a(l1);
        akL.a(l2);
        obj = akN.b(((akp.a) (obj)), this);
        fx.a();
        fx.a(((akp) (obj)));
        return new Extent(l, l1, l2);
    }

    Extent createExtent(ByteBuffer bytebuffer)
    {
        return new Extent(bytebuffer);
    }

    public Item createItem(int i, int j, int k, long l, List list)
    {
        Object obj = ajc$tjp_10;
        akL.a(i);
        akL.a(j);
        akL.a(k);
        akL.a(l);
        obj = akN.b(((akp.a) (obj)), this);
        fx.a();
        fx.a(((akp) (obj)));
        return new Item(i, j, k, l, list);
    }

    Item createItem(ByteBuffer bytebuffer)
    {
        return new Item(bytebuffer);
    }

    public int getBaseOffsetSize()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return baseOffsetSize;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.c(bytebuffer, offsetSize << 4 | lengthSize);
        Iterator iterator;
        if (getVersion() == 1)
        {
            cx.c(bytebuffer, baseOffsetSize << 4 | indexSize);
        } else
        {
            cx.c(bytebuffer, baseOffsetSize << 4);
        }
        cx.b(bytebuffer, items.size());
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
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return indexSize;
    }

    public List getItems()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return items;
    }

    public int getLengthSize()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return lengthSize;
    }

    public int getOffsetSize()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return offsetSize;
    }

    public void setBaseOffsetSize(int i)
    {
        akp akp = akN.a(ajc$tjp_5, this, akL.a(i));
        fx.a();
        fx.a(akp);
        baseOffsetSize = i;
    }

    public void setIndexSize(int i)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(i));
        fx.a();
        fx.a(akp);
        indexSize = i;
    }

    public void setItems(List list)
    {
        akp akp = akN.a(ajc$tjp_9, this, list);
        fx.a();
        fx.a(akp);
        items = list;
    }

    public void setLengthSize(int i)
    {
        akp akp = akN.a(ajc$tjp_3, this, akL.a(i));
        fx.a();
        fx.a(akp);
        lengthSize = i;
    }

    public void setOffsetSize(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        offsetSize = i;
    }

    static 
    {
        ajc$preClinit();
    }
}

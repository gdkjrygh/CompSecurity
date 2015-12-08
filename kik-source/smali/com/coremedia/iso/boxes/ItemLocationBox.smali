.class public Lcom/coremedia/iso/boxes/ItemLocationBox;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;,
        Lcom/coremedia/iso/boxes/ItemLocationBox$Item;
    }
.end annotation


# static fields
.field public static final TYPE:Ljava/lang/String; = "iloc"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_10:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_11:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_4:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_5:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_6:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_7:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_8:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_9:Lorg/b/a/a$a;


# instance fields
.field public baseOffsetSize:I

.field public indexSize:I

.field public items:Ljava/util/List;

.field public lengthSize:I

.field public offsetSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 72
    const-string v0, "iloc"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 63
    iput v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->offsetSize:I

    .line 64
    iput v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->lengthSize:I

    .line 65
    iput v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->indexSize:I

    .line 67
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    .line 73
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "ItemLocationBox.java"

    const-class v2, Lcom/coremedia/iso/boxes/ItemLocationBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getOffsetSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x77

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setOffsetSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "int"

    const-string v5, "offsetSize"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x7b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "createItem"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "int:int:int:long:java.util.List"

    const-string v5, "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents"

    const-string v6, ""

    const-string v7, "com.coremedia.iso.boxes.ItemLocationBox$Item"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_10:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "createExtent"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "long:long:long"

    const-string v5, "extentOffset:extentLength:extentIndex"

    const-string v6, ""

    const-string v7, "com.coremedia.iso.boxes.ItemLocationBox$Extent"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x11d

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_11:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getLengthSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x7f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setLengthSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "int"

    const-string v5, "lengthSize"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x83

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_3:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getBaseOffsetSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x87

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_4:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setBaseOffsetSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "int"

    const-string v5, "baseOffsetSize"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x8b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_5:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getIndexSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x8f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_6:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setIndexSize"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "int"

    const-string v5, "indexSize"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x93

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_7:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getItems"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.util.List"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x97

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_8:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setItems"

    const-string v3, "com.coremedia.iso.boxes.ItemLocationBox"

    const-string v4, "java.util.List"

    const-string v5, "items"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x9b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_9:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method public _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    .line 102
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 103
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 104
    ushr-int/lit8 v1, v0, 0x4

    iput v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->offsetSize:I

    .line 105
    and-int/lit8 v0, v0, 0xf

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->lengthSize:I

    .line 106
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 107
    ushr-int/lit8 v1, v0, 0x4

    iput v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    .line 109
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/ItemLocationBox;->getVersion()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 110
    and-int/lit8 v0, v0, 0xf

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->indexSize:I

    .line 112
    :cond_0
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 113
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_1

    .line 116
    return-void

    .line 114
    :cond_1
    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    new-instance v3, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    invoke-direct {v3, p0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;Ljava/nio/ByteBuffer;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public createExtent(JJJ)Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;
    .locals 9

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_11:Lorg/b/a/a$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p3, p4}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p5, p6}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 286
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    new-instance v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;JJJ)V

    return-object v0
.end method

.method createExtent(Ljava/nio/ByteBuffer;)Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;
    .locals 1

    .prologue
    .line 290
    new-instance v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;

    invoke-direct {v0, p0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public createItem(IIIJLjava/util/List;)Lcom/coremedia/iso/boxes/ItemLocationBox$Item;
    .locals 10

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_10:Lorg/b/a/a$a;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p3}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {p4, p5}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aput-object p6, v1, v2

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 161
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    new-instance v1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;IIIJLjava/util/List;)V

    return-object v1
.end method

.method createItem(Ljava/nio/ByteBuffer;)Lcom/coremedia/iso/boxes/ItemLocationBox$Item;
    .locals 1

    .prologue
    .line 165
    new-instance v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    invoke-direct {v0, p0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public getBaseOffsetSize()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_4:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 136
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    return v0
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 87
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 88
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->offsetSize:I

    shl-int/lit8 v0, v0, 0x4

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->lengthSize:I

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 89
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/ItemLocationBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 90
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    shl-int/lit8 v0, v0, 0x4

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->indexSize:I

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 94
    :goto_0
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 95
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    return-void

    .line 92
    :cond_0
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    shl-int/lit8 v0, v0, 0x4

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    goto :goto_0

    .line 95
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    .line 96
    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->getContent(Ljava/nio/ByteBuffer;)V

    goto :goto_1
.end method

.method protected getContentSize()J
    .locals 5

    .prologue
    .line 77
    const-wide/16 v0, 0x8

    .line 78
    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    return-wide v2

    .line 78
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    .line 79
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->getSize()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0
.end method

.method public getIndexSize()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_6:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 144
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->indexSize:I

    return v0
.end method

.method public getItems()Ljava/util/List;
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_8:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 152
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    return-object v0
.end method

.method public getLengthSize()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 128
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->lengthSize:I

    return v0
.end method

.method public getOffsetSize()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 120
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->offsetSize:I

    return v0
.end method

.method public setBaseOffsetSize(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_5:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 140
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    .line 141
    return-void
.end method

.method public setIndexSize(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_7:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 148
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->indexSize:I

    .line 149
    return-void
.end method

.method public setItems(Ljava/util/List;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_9:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 156
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->items:Ljava/util/List;

    .line 157
    return-void
.end method

.method public setLengthSize(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 132
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->lengthSize:I

    .line 133
    return-void
.end method

.method public setOffsetSize(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 124
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox;->offsetSize:I

    .line 125
    return-void
.end method

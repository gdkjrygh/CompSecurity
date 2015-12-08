.class public Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;
.super Lcom/coremedia/iso/boxes/ChunkOffsetBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "co64"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;


# instance fields
.field private chunkOffsets:[J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    const-string v0, "co64"

    invoke-direct {p0, v0}, Lcom/coremedia/iso/boxes/ChunkOffsetBox;-><init>(Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "ChunkOffset64BitBox.java"

    const-class v2, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getChunkOffsets"

    const-string v3, "com.coremedia.iso.boxes.ChunkOffset64BitBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "[J"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x17

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->ajc$tjp_0:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method public _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    .line 34
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 35
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    .line 36
    new-array v0, v1, [J

    iput-object v0, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    .line 37
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_0

    .line 40
    return-void

    .line 38
    :cond_0
    iget-object v2, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt64(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    aput-wide v4, v2, v0

    .line 37
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getChunkOffsets()[J
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 24
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    return-object v0
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 45
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    array-length v0, v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 46
    iget-object v1, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 49
    return-void

    .line 46
    :cond_0
    aget-wide v4, v1, v0

    .line 47
    invoke-static {p1, v4, v5}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt64(Ljava/nio/ByteBuffer;J)V

    .line 46
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected getContentSize()J
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ChunkOffset64BitBox;->chunkOffsets:[J

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x8

    int-to-long v0, v0

    return-wide v0
.end method

.class public Lcom/coremedia/iso/boxes/SyncSampleBox;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "stss"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;


# instance fields
.field private sampleNumber:[J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    const-string v0, "stss"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "SyncSampleBox.java"

    const-class v2, Lcom/coremedia/iso/boxes/SyncSampleBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getSampleNumber"

    const-string v3, "com.coremedia.iso.boxes.SyncSampleBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "[J"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "toString"

    const-string v3, "com.coremedia.iso.boxes.SyncSampleBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x4d

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setSampleNumber"

    const-string v3, "com.coremedia.iso.boxes.SyncSampleBox"

    const-string v4, "[J"

    const-string v5, "sampleNumber"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x51

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_2:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method public _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/SyncSampleBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 57
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    .line 59
    new-array v0, v1, [J

    iput-object v0, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    .line 60
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_0

    .line 63
    return-void

    .line 61
    :cond_0
    iget-object v2, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    aput-wide v4, v2, v0

    .line 60
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    .line 67
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/SyncSampleBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 69
    iget-object v0, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    array-length v0, v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 71
    iget-object v1, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 75
    return-void

    .line 71
    :cond_0
    aget-wide v4, v1, v0

    .line 72
    invoke-static {p1, v4, v5}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 71
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected getContentSize()J
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x8

    int-to-long v0, v0

    return-wide v0
.end method

.method public getSampleNumber()[J
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 47
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    return-object v0
.end method

.method public setSampleNumber([J)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 82
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    .line 83
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/SyncSampleBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 78
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SyncSampleBox[entryCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/coremedia/iso/boxes/SyncSampleBox;->sampleNumber:[J

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "odaf"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_4:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_5:Lorg/b/a/a$a;


# instance fields
.field private allBits:B

.field private initVectorLength:I

.field private keyIndicatorLength:I

.field private selectiveEncryption:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    const-string v0, "odaf"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "OmaDrmAccessUnitFormatBox.java"

    const-class v2, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "isSelectiveEncryption"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "boolean"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getKeyIndicatorLength"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getInitVectorLength"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x36

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setInitVectorLength"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, "int"

    const-string v5, "initVectorLength"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_3:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setKeyIndicatorLength"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, "int"

    const-string v5, "keyIndicatorLength"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x3e

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_4:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setAllBits"

    const-string v3, "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox"

    const-string v4, "byte"

    const-string v5, "allBits"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x42

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_5:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method public final _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 73
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 74
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->allBits:B

    .line 75
    iget-byte v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->allBits:B

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->selectiveEncryption:Z

    .line 76
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->keyIndicatorLength:I

    .line 77
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->initVectorLength:I

    .line 78
    return-void

    .line 75
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final getContent(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 83
    iget-byte v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->allBits:B

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 84
    iget v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->keyIndicatorLength:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 85
    iget v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->initVectorLength:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 86
    return-void
.end method

.method protected final getContentSize()J
    .locals 2

    .prologue
    .line 39
    const-wide/16 v0, 0x7

    return-wide v0
.end method

.method public final getInitVectorLength()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 55
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->initVectorLength:I

    return v0
.end method

.method public final getKeyIndicatorLength()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 51
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->keyIndicatorLength:I

    return v0
.end method

.method public final isSelectiveEncryption()Z
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 47
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-boolean v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->selectiveEncryption:Z

    return v0
.end method

.method public final setAllBits(B)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_5:Lorg/b/a/a$a;

    new-instance v1, Ljava/lang/Byte;

    invoke-direct {v1, p1}, Ljava/lang/Byte;-><init>(B)V

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 67
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-byte p1, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->allBits:B

    .line 68
    and-int/lit16 v0, p1, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->selectiveEncryption:Z

    .line 69
    return-void

    .line 68
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final setInitVectorLength(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 59
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->initVectorLength:I

    .line 60
    return-void
.end method

.method public final setKeyIndicatorLength(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->ajc$tjp_4:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 63
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/OmaDrmAccessUnitFormatBox;->keyIndicatorLength:I

    .line 64
    return-void
.end method

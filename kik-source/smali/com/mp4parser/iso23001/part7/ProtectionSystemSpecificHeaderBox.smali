.class public Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static OMA2_SYSTEM_ID:[B = null

.field public static PLAYREADY_SYSTEM_ID:[B = null

.field public static final TYPE:Ljava/lang/String; = "pssh"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_4:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_5:Lorg/b/a/a$a;


# instance fields
.field content:[B

.field keyIds:Ljava/util/List;

.field systemId:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    invoke-static {}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$preClinit()V

    .line 34
    const-class v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->$assertionsDisabled:Z

    .line 37
    const-string v0, "A2B55680-6F43-11E0-9A3F-0002A5D5C51B"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/UUIDConverter;->convert(Ljava/util/UUID;)[B

    move-result-object v0

    sput-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->OMA2_SYSTEM_ID:[B

    .line 38
    const-string v0, "9A04F079-9840-4286-AB92-E65BE0885F95"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/UUIDConverter;->convert(Ljava/util/UUID;)[B

    move-result-object v0

    sput-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->PLAYREADY_SYSTEM_ID:[B

    return-void

    .line 34
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    const-string v0, "pssh"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    .line 73
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "ProtectionSystemSpecificHeaderBox.java"

    const-class v2, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getKeyIds"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.util.List"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x2b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setKeyIds"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, "java.util.List"

    const-string v5, "keyIds"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x2f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getSystemId"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "[B"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x36

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setSystemId"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, "[B"

    const-string v5, "systemId"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_3:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getContent"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "[B"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x3f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_4:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setContent"

    const-string v3, "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"

    const-string v4, "[B"

    const-string v5, "content"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x43

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_5:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method protected _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    const/16 v3, 0x10

    .line 103
    invoke-virtual {p0, p1}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 104
    new-array v0, v3, [B

    iput-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    .line 105
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 106
    invoke-virtual {p0}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->getVersion()I

    move-result v0

    if-lez v0, :cond_0

    .line 107
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    .line 108
    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-gtz v0, :cond_1

    .line 114
    :cond_0
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    .line 115
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    iput-object v2, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    .line 116
    iget-object v2, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 117
    sget-boolean v2, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->$assertionsDisabled:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    array-length v2, v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 109
    :cond_1
    new-array v0, v3, [B

    .line 110
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 111
    iget-object v2, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/UUIDConverter;->convert([B)Ljava/util/UUID;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_0

    .line 118
    :cond_2
    return-void
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 3

    .prologue
    const/16 v2, 0x10

    .line 87
    invoke-virtual {p0, p1}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 88
    sget-boolean v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    array-length v0, v0

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 90
    invoke-virtual {p0}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->getVersion()I

    move-result v0

    if-lez v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 92
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    array-length v0, v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 98
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 99
    return-void

    .line 92
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    .line 93
    invoke-static {v0}, Lcom/googlecode/mp4parser/util/UUIDConverter;->convert(Ljava/util/UUID;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_0
.end method

.method public getContent()[B
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_4:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 64
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    return-object v0
.end method

.method protected getContentSize()J
    .locals 4

    .prologue
    .line 77
    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x18

    int-to-long v0, v0

    .line 78
    invoke-virtual {p0}, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->getVersion()I

    move-result v2

    if-lez v2, :cond_0

    .line 79
    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    .line 80
    iget-object v2, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x10

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 82
    :cond_0
    return-wide v0
.end method

.method public getKeyIds()Ljava/util/List;
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 44
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    return-object v0
.end method

.method public getSystemId()[B
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 55
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    return-object v0
.end method

.method public setContent([B)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_5:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 68
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->content:[B

    .line 69
    return-void
.end method

.method public setKeyIds(Ljava/util/List;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 48
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->keyIds:Ljava/util/List;

    .line 49
    return-void
.end method

.method public setSystemId([B)V
    .locals 2

    .prologue
    sget-object v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 59
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    sget-boolean v0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    array-length v0, p1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 60
    :cond_0
    iput-object p1, p0, Lcom/mp4parser/iso23001/part7/ProtectionSystemSpecificHeaderBox;->systemId:[B

    .line 61
    return-void
.end method

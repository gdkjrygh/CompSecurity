.class public Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;
.super Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;
.source "SourceFile"


# static fields
.field private static final IMAGE_TYPE_JPG:I = 0xd

.field private static final IMAGE_TYPE_PNG:I = 0xe

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;


# instance fields
.field private data:[B


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 18
    const-string v0, "covr"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;-><init>(Ljava/lang/String;I)V

    .line 19
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "AppleCoverBox.java"

    const-class v2, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getCoverData"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleCoverBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "[B"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x15

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setJpg"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleCoverBox"

    const-string v4, "[B"

    const-string v5, "data"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x19

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setPng"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleCoverBox"

    const-string v4, "[B"

    const-string v5, "data"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x1d

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_2:Lorg/b/a/a$a;

    return-void
.end method

.method private setImageData([BI)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    .line 51
    iput p2, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->dataType:I

    .line 52
    return-void
.end method


# virtual methods
.method public getCoverData()[B
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 22
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    return-object v0
.end method

.method protected getDataLength()I
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    array-length v0, v0

    return v0
.end method

.method protected parseData(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    .line 41
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 42
    return-void
.end method

.method public setJpg([B)V
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 26
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    const/16 v0, 0xd

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->setImageData([BI)V

    .line 27
    return-void
.end method

.method public setPng([B)V
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 30
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    const/16 v0, 0xe

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->setImageData([BI)V

    .line 31
    return-void
.end method

.method protected writeData()[B
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleCoverBox;->data:[B

    return-object v0
.end method

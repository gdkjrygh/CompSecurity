.class public abstract Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;
.super Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;
.source "SourceFile"


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;


# instance fields
.field value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->ajc$preClinit()V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;-><init>(Ljava/lang/String;I)V

    .line 19
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "Utf8AppleDataBox.java"

    const-class v2, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getValue"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x15

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setValue"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox"

    const-string v4, "java.lang.String"

    const-string v5, "value"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->ajc$tjp_1:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method protected getDataLength()I
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->value:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 23
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->isParsed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->parseDetails()V

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->value:Ljava/lang/String;

    return-object v0
.end method

.method protected parseData(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeReader;->readString(Ljava/nio/ByteBuffer;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->value:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 31
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->value:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public writeData()[B
    .locals 1
    .annotation runtime Lcom/googlecode/mp4parser/annotations/DoNotParseDetail;
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/apple/Utf8AppleDataBox;->value:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

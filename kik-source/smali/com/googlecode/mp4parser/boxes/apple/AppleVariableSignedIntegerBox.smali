.class public abstract Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;
.super Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;
.source "SourceFile"


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;


# instance fields
.field intLength:I

.field value:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$preClinit()V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 13
    const/16 v0, 0xf

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/boxes/apple/AppleDataBox;-><init>(Ljava/lang/String;I)V

    .line 17
    const/4 v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    .line 14
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "AppleVariableSignedIntegerBox.java"

    const-class v2, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getIntLength"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x13

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setIntLength"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"

    const-string v4, "int"

    const-string v5, "intLength"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x17

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getValue"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setValue"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"

    const-string v4, "long"

    const-string v5, "value"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x24

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_3:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method protected getDataLength()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    return v0
.end method

.method public getIntLength()I
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 20
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    return v0
.end method

.method public getValue()J
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 29
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->isParsed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->parseDetails()V

    .line 33
    :cond_0
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->value:J

    return-wide v0
.end method

.method protected parseData(Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    .line 61
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 62
    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeReaderVariable;->read(Ljava/nio/ByteBuffer;I)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->value:J

    .line 63
    iput v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    .line 64
    return-void
.end method

.method public setIntLength(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 24
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    .line 25
    return-void
.end method

.method public setValue(J)V
    .locals 5

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x2

    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 38
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    const-wide/16 v0, 0x7f

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, -0x80

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 39
    const/4 v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    .line 48
    :goto_0
    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->value:J

    .line 49
    return-void

    .line 40
    :cond_0
    const-wide/16 v0, 0x7fff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    const-wide/16 v0, -0x8000

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    if-ge v0, v2, :cond_1

    .line 41
    iput v2, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    goto :goto_0

    .line 42
    :cond_1
    const-wide/32 v0, 0x7fffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_2

    const-wide/32 v0, -0x800000

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    if-ge v0, v3, :cond_2

    .line 43
    iput v3, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x4

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->intLength:I

    goto :goto_0
.end method

.method protected writeData()[B
    .locals 4

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->getDataLength()I

    move-result v0

    .line 54
    new-array v1, v0, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 55
    iget-wide v2, p0, Lcom/googlecode/mp4parser/boxes/apple/AppleVariableSignedIntegerBox;->value:J

    invoke-static {v2, v3, v1, v0}, Lcom/coremedia/iso/IsoTypeWriterVariable;->write(JLjava/nio/ByteBuffer;I)V

    .line 56
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

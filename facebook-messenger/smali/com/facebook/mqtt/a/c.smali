.class Lcom/facebook/mqtt/a/c;
.super Ljava/lang/Object;
.source "MessageDecoder.java"


# instance fields
.field protected a:Lcom/facebook/mqtt/messages/h;

.field protected b:I


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/messages/h;I)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Lcom/facebook/mqtt/a/c;->a:Lcom/facebook/mqtt/messages/h;

    .line 104
    iput p2, p0, Lcom/facebook/mqtt/a/c;->b:I

    .line 105
    return-void
.end method


# virtual methods
.method protected a(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 108
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/c;->b(Ljava/io/DataInputStream;)I

    move-result v0

    .line 109
    new-array v1, v0, [B

    .line 110
    invoke-virtual {p1, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 111
    iget v2, p0, Lcom/facebook/mqtt/a/c;->b:I

    sub-int v0, v2, v0

    iput v0, p0, Lcom/facebook/mqtt/a/c;->b:I

    .line 112
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method protected b(Ljava/io/DataInputStream;)I
    .locals 3

    .prologue
    .line 116
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    .line 117
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    .line 118
    iget v2, p0, Lcom/facebook/mqtt/a/c;->b:I

    add-int/lit8 v2, v2, -0x2

    iput v2, p0, Lcom/facebook/mqtt/a/c;->b:I

    .line 119
    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.class public Lcom/flurry/sdk/iw$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/kx",
        "<",
        "Lcom/flurry/sdk/iw;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lcom/flurry/sdk/iw;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 55
    if-nez p1, :cond_0

    .line 78
    :goto_0
    return-object v0

    .line 59
    :cond_0
    new-instance v2, Lcom/flurry/sdk/iw$a$2;

    invoke-direct {v2, p0, p1}, Lcom/flurry/sdk/iw$a$2;-><init>(Lcom/flurry/sdk/iw$a;Ljava/io/InputStream;)V

    .line 66
    new-instance v1, Lcom/flurry/sdk/iw;

    invoke-direct {v1, v0}, Lcom/flurry/sdk/iw;-><init>(Lcom/flurry/sdk/iw$1;)V

    .line 69
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 70
    if-lez v0, :cond_1

    .line 71
    new-array v0, v0, [B

    .line 72
    invoke-virtual {v2, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 75
    iput-object v0, v1, Lcom/flurry/sdk/iw;->a:[B

    :cond_1
    move-object v0, v1

    .line 78
    goto :goto_0
.end method

.method public a(Ljava/io/OutputStream;Lcom/flurry/sdk/iw;)V
    .locals 3

    .prologue
    .line 28
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 51
    :cond_0
    :goto_0
    return-void

    .line 32
    :cond_1
    new-instance v1, Lcom/flurry/sdk/iw$a$1;

    invoke-direct {v1, p0, p1}, Lcom/flurry/sdk/iw$a$1;-><init>(Lcom/flurry/sdk/iw$a;Ljava/io/OutputStream;)V

    .line 39
    const/4 v0, 0x0

    .line 40
    iget-object v2, p2, Lcom/flurry/sdk/iw;->a:[B

    if-eqz v2, :cond_2

    .line 41
    iget-object v0, p2, Lcom/flurry/sdk/iw;->a:[B

    array-length v0, v0

    .line 45
    :cond_2
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 46
    if-lez v0, :cond_3

    .line 47
    iget-object v0, p2, Lcom/flurry/sdk/iw;->a:[B

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 50
    :cond_3
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 22
    check-cast p2, Lcom/flurry/sdk/iw;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/iw$a;->a(Ljava/io/OutputStream;Lcom/flurry/sdk/iw;)V

    return-void
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/iw$a;->a(Ljava/io/InputStream;)Lcom/flurry/sdk/iw;

    move-result-object v0

    return-object v0
.end method

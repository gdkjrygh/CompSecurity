.class public Lcom/flurry/sdk/iz$a;
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
        "Lcom/flurry/sdk/iz;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lcom/flurry/sdk/iz;
    .locals 5

    .prologue
    .line 31
    if-nez p1, :cond_1

    .line 32
    const/4 v0, 0x0

    .line 63
    :cond_0
    return-object v0

    .line 35
    :cond_1
    new-instance v1, Lcom/flurry/sdk/iz$a$1;

    invoke-direct {v1, p0, p1}, Lcom/flurry/sdk/iz$a$1;-><init>(Lcom/flurry/sdk/iz$a;Ljava/io/InputStream;)V

    .line 42
    new-instance v0, Lcom/flurry/sdk/iz;

    invoke-direct {v0}, Lcom/flurry/sdk/iz;-><init>()V

    .line 45
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 46
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 48
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v2

    invoke-static {v0, v2}, Lcom/flurry/sdk/iz;->a(Lcom/flurry/sdk/iz;Z)Z

    .line 49
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/flurry/sdk/iz;->a(Lcom/flurry/sdk/iz;J)J

    .line 52
    :goto_0
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 57
    new-array v2, v2, [B

    .line 58
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 59
    new-instance v3, Lcom/flurry/sdk/iw;

    invoke-direct {v3, v2}, Lcom/flurry/sdk/iw;-><init>([B)V

    .line 60
    invoke-static {v0}, Lcom/flurry/sdk/iz;->a(Lcom/flurry/sdk/iz;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v2, v4, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/io/OutputStream;Lcom/flurry/sdk/iz;)V
    .locals 2

    .prologue
    .line 26
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Serialization not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic a(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 20
    check-cast p2, Lcom/flurry/sdk/iz;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/iz$a;->a(Ljava/io/OutputStream;Lcom/flurry/sdk/iz;)V

    return-void
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/iz$a;->a(Ljava/io/InputStream;)Lcom/flurry/sdk/iz;

    move-result-object v0

    return-object v0
.end method

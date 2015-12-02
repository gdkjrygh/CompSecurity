.class public Lcom/facebook/mqtt/a/a;
.super Ljava/lang/Object;
.source "MessageDecoder.java"


# instance fields
.field private final a:Lcom/facebook/mqtt/a/h;

.field private b:Ljava/io/DataInputStream;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/a/h;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/mqtt/a/a;->a:Lcom/facebook/mqtt/a/h;

    .line 40
    return-void
.end method

.method private b()Lcom/facebook/mqtt/messages/h;
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 69
    iget-object v0, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    .line 71
    shr-int/lit8 v3, v0, 0x4

    invoke-static {v3}, Lcom/facebook/mqtt/messages/k;->fromInt(I)Lcom/facebook/mqtt/messages/k;

    move-result-object v4

    .line 72
    and-int/lit8 v3, v0, 0x8

    const/16 v5, 0x8

    if-ne v3, v5, :cond_1

    move v3, v1

    .line 73
    :goto_0
    and-int/lit8 v5, v0, 0x6

    shr-int/lit8 v5, v5, 0x1

    .line 74
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    move v0, v1

    .line 80
    :cond_0
    :goto_1
    iget-object v6, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    invoke-virtual {v6}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v6

    .line 81
    and-int/lit8 v7, v6, 0x7f

    mul-int/2addr v7, v1

    add-int/2addr v2, v7

    .line 82
    mul-int/lit16 v1, v1, 0x80

    .line 83
    and-int/lit16 v6, v6, 0x80

    if-nez v6, :cond_0

    .line 85
    new-instance v1, Lcom/facebook/mqtt/messages/i;

    invoke-direct {v1}, Lcom/facebook/mqtt/messages/i;-><init>()V

    .line 86
    invoke-virtual {v1, v4}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    .line 87
    invoke-virtual {v1, v3}, Lcom/facebook/mqtt/messages/i;->a(Z)Lcom/facebook/mqtt/messages/i;

    .line 88
    invoke-virtual {v1, v5}, Lcom/facebook/mqtt/messages/i;->a(I)Lcom/facebook/mqtt/messages/i;

    .line 89
    invoke-virtual {v1, v0}, Lcom/facebook/mqtt/messages/i;->b(Z)Lcom/facebook/mqtt/messages/i;

    .line 90
    invoke-virtual {v1, v2}, Lcom/facebook/mqtt/messages/i;->b(I)Lcom/facebook/mqtt/messages/i;

    .line 91
    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    return-object v0

    :cond_1
    move v3, v2

    .line 72
    goto :goto_0

    :cond_2
    move v0, v2

    .line 74
    goto :goto_1
.end method


# virtual methods
.method public declared-synchronized a()Lcom/facebook/mqtt/messages/l;
    .locals 4

    .prologue
    .line 47
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Stream not initialized"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 49
    invoke-direct {p0}, Lcom/facebook/mqtt/a/a;->b()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/h;->e()I

    move-result v1

    .line 52
    new-instance v2, Lcom/facebook/mqtt/a/e;

    invoke-direct {v2, v0, v1}, Lcom/facebook/mqtt/a/e;-><init>(Lcom/facebook/mqtt/messages/h;I)V

    .line 54
    iget-object v1, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    invoke-static {v2, v1}, Lcom/facebook/mqtt/a/e;->a(Lcom/facebook/mqtt/a/e;Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v1

    .line 55
    iget v2, v2, Lcom/facebook/mqtt/a/e;->b:I

    .line 57
    new-instance v3, Lcom/facebook/mqtt/a/d;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/mqtt/a/d;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;I)V

    .line 59
    iget-object v2, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    invoke-static {v3, v2}, Lcom/facebook/mqtt/a/d;->a(Lcom/facebook/mqtt/a/d;Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v2

    .line 60
    iget v3, v3, Lcom/facebook/mqtt/a/d;->b:I

    .line 61
    if-eqz v3, :cond_1

    .line 63
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected bytes remaining in payload"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 65
    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/facebook/mqtt/a/a;->a:Lcom/facebook/mqtt/a/h;

    invoke-virtual {v3, v0, v1, v2}, Lcom/facebook/mqtt/a/h;->a(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/mqtt/messages/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0
.end method

.method public a(Ljava/io/DataInputStream;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/mqtt/a/a;->b:Ljava/io/DataInputStream;

    .line 44
    return-void
.end method

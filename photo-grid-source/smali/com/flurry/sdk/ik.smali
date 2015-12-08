.class public Lcom/flurry/sdk/ik;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:J

.field private c:J

.field private d:J

.field private e:Lcom/flurry/sdk/io;

.field private f:Z

.field private g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/util/concurrent/atomic/AtomicInteger;

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/flurry/sdk/ig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/flurry/sdk/il;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/ik;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZJJLcom/flurry/sdk/io;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZJJ",
            "Lcom/flurry/sdk/io;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/flurry/sdk/ig;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/flurry/sdk/ik;->h:Ljava/lang/String;

    .line 46
    iput-boolean p2, p0, Lcom/flurry/sdk/ik;->f:Z

    .line 47
    iput-wide p3, p0, Lcom/flurry/sdk/ik;->b:J

    .line 48
    iput-wide p5, p0, Lcom/flurry/sdk/ik;->d:J

    .line 49
    iput-object p7, p0, Lcom/flurry/sdk/ik;->e:Lcom/flurry/sdk/io;

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/ik;->c:J

    .line 53
    iput-object p8, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    .line 55
    if-eqz p8, :cond_1

    .line 57
    invoke-interface {p8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 59
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ig;

    invoke-virtual {v0, p0}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ik;)V

    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {p8}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lcom/flurry/sdk/ik;->i:I

    .line 70
    :goto_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/flurry/sdk/ik;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 71
    return-void

    .line 67
    :cond_1
    iput v2, p0, Lcom/flurry/sdk/ik;->i:I

    goto :goto_1
.end method

.method static synthetic a(Lcom/flurry/sdk/ik;I)I
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/flurry/sdk/ik;->g:I

    return p1
.end method

.method static synthetic a(Lcom/flurry/sdk/ik;)J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->b:J

    return-wide v0
.end method

.method static synthetic a(Lcom/flurry/sdk/ik;J)J
    .locals 1

    .prologue
    .line 26
    iput-wide p1, p0, Lcom/flurry/sdk/ik;->c:J

    return-wide p1
.end method

.method static synthetic a(Lcom/flurry/sdk/ik;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic a(Lcom/flurry/sdk/ik;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/flurry/sdk/ik;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p1
.end method

.method static synthetic b(Lcom/flurry/sdk/ik;I)I
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/flurry/sdk/ik;->i:I

    return p1
.end method

.method static synthetic b(Lcom/flurry/sdk/ik;)J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->c:J

    return-wide v0
.end method

.method static synthetic c(Lcom/flurry/sdk/ik;)J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->d:J

    return-wide v0
.end method

.method static synthetic d(Lcom/flurry/sdk/ik;)Lcom/flurry/sdk/io;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/sdk/ik;->e:Lcom/flurry/sdk/io;

    return-object v0
.end method

.method static synthetic e(Lcom/flurry/sdk/ik;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/flurry/sdk/ik;->f:Z

    return v0
.end method

.method static synthetic f(Lcom/flurry/sdk/ik;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/flurry/sdk/ik;->g:I

    return v0
.end method

.method static synthetic g(Lcom/flurry/sdk/ik;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/sdk/ik;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/flurry/sdk/ik;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/flurry/sdk/ik;->i:I

    return v0
.end method

.method static synthetic i(Lcom/flurry/sdk/ik;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/sdk/ik;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic j(Lcom/flurry/sdk/ik;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/flurry/sdk/ik;->g:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 113
    iput p1, p0, Lcom/flurry/sdk/ik;->g:I

    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 79
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->b:J

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/flurry/sdk/ik;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ig;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/flurry/sdk/ig;",
            ">;"
        }
    .end annotation

    .prologue
    .line 97
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    return-object v0
.end method

.method public declared-synchronized f()Z
    .locals 2

    .prologue
    .line 116
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ik;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    iget v1, p0, Lcom/flurry/sdk/ik;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()V
    .locals 1

    .prologue
    .line 120
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ik;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    monitor-exit p0

    return-void

    .line 120
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public h()[B
    .locals 8

    .prologue
    .line 215
    const/4 v1, 0x0

    .line 217
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 218
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 220
    :try_start_1
    iget-object v0, p0, Lcom/flurry/sdk/ik;->e:Lcom/flurry/sdk/io;

    invoke-virtual {v0}, Lcom/flurry/sdk/io;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 221
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->b:J

    invoke-virtual {v2, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 222
    iget-wide v0, p0, Lcom/flurry/sdk/ik;->d:J

    invoke-virtual {v2, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 223
    iget-boolean v0, p0, Lcom/flurry/sdk/ik;->f:Z

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 224
    iget-boolean v0, p0, Lcom/flurry/sdk/ik;->f:Z

    if-eqz v0, :cond_0

    .line 225
    iget v0, p0, Lcom/flurry/sdk/ik;->g:I

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 226
    iget-object v0, p0, Lcom/flurry/sdk/ik;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 230
    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 231
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 232
    iget-object v0, p0, Lcom/flurry/sdk/ik;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 233
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ig;

    .line 234
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 235
    invoke-virtual {v1}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 236
    iget-object v0, v1, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 239
    iget-object v0, v1, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ih;

    .line 240
    iget v5, v0, Lcom/flurry/sdk/ih;->a:I

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 241
    iget-wide v6, v0, Lcom/flurry/sdk/ih;->b:J

    invoke-virtual {v2, v6, v7}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 242
    iget-wide v6, v0, Lcom/flurry/sdk/ih;->c:J

    invoke-virtual {v2, v6, v7}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 243
    iget-boolean v5, v0, Lcom/flurry/sdk/ih;->d:Z

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 244
    iget v5, v0, Lcom/flurry/sdk/ih;->e:I

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 245
    iget-object v5, v0, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    invoke-virtual {v5}, Lcom/flurry/sdk/ii;->a()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 246
    iget v5, v0, Lcom/flurry/sdk/ih;->e:I

    const/16 v6, 0xc8

    if-lt v5, v6, :cond_2

    iget v5, v0, Lcom/flurry/sdk/ih;->e:I

    const/16 v6, 0x190

    if-lt v5, v6, :cond_3

    .line 247
    :cond_2
    iget-object v5, v0, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    if-eqz v5, :cond_3

    .line 248
    iget-object v5, v0, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    .line 249
    array-length v6, v5

    invoke-virtual {v2, v6}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 250
    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->write([B)V

    .line 253
    :cond_3
    iget v5, v0, Lcom/flurry/sdk/ih;->h:I

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 254
    iget-wide v6, v0, Lcom/flurry/sdk/ih;->k:J

    long-to-int v0, v6

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto :goto_0

    .line 260
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 261
    :goto_1
    const/4 v2, 0x6

    :try_start_2
    sget-object v3, Lcom/flurry/sdk/ik;->a:Ljava/lang/String;

    const-string v4, "Error when generating report"

    invoke-static {v2, v3, v4, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 262
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 264
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    .line 259
    :cond_4
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v0

    .line 264
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_2

    .line 260
    :catch_1
    move-exception v0

    goto :goto_1
.end method

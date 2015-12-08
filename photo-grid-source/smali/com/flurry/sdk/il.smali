.class public Lcom/flurry/sdk/il;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;

.field private static c:Lcom/flurry/sdk/il;


# instance fields
.field private a:Ljava/lang/String;

.field private d:Lcom/flurry/sdk/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jv",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/im;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/im;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/flurry/sdk/il;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lcom/flurry/sdk/il;->c:Lcom/flurry/sdk/il;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/il;
    .locals 2

    .prologue
    .line 64
    const-class v1, Lcom/flurry/sdk/il;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/il;->c:Lcom/flurry/sdk/il;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/flurry/sdk/il;

    invoke-direct {v0}, Lcom/flurry/sdk/il;-><init>()V

    .line 66
    sput-object v0, Lcom/flurry/sdk/il;->c:Lcom/flurry/sdk/il;

    invoke-direct {v0}, Lcom/flurry/sdk/il;->e()V

    .line 68
    :cond_0
    sget-object v0, Lcom/flurry/sdk/il;->c:Lcom/flurry/sdk/il;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/flurry/sdk/il;)Ljava/util/List;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/flurry/sdk/il;)Lcom/flurry/sdk/jv;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/flurry/sdk/il;->d:Lcom/flurry/sdk/jv;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 5

    .prologue
    .line 72
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/flurry/sdk/il;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurrypulselogging."

    const/4 v3, 0x1

    new-instance v4, Lcom/flurry/sdk/il$1;

    invoke-direct {v4, p0}, Lcom/flurry/sdk/il$1;-><init>(Lcom/flurry/sdk/il;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    iput-object v0, p0, Lcom/flurry/sdk/il;->d:Lcom/flurry/sdk/jv;

    .line 79
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    .line 81
    const-string v1, "UseHttps"

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/il;->f:Z

    .line 82
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, UseHttps = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/il;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/flurry/sdk/il;->d:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    .line 85
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    .line 89
    :cond_0
    return-void
.end method

.method private f()Ljava/lang/String;
    .locals 4

    .prologue
    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".yflurrypulselogging."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/flurry/sdk/lp;->i(Ljava/lang/String;)J

    move-result-wide v2

    const/16 v1, 0x10

    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/flurry/sdk/il;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/flurry/sdk/il;->a:Ljava/lang/String;

    .line 291
    :goto_0
    return-object v0

    .line 288
    :cond_0
    iget-boolean v0, p0, Lcom/flurry/sdk/il;->f:Z

    if-eqz v0, :cond_1

    .line 289
    const-string v0, "https://data.flurry.com/pcr.do"

    goto :goto_0

    .line 291
    :cond_1
    const-string v0, "https://data.flurry.com/pcr.do"

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/flurry/sdk/ik;)V
    .locals 3

    .prologue
    .line 95
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/flurry/sdk/im;

    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->h()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/flurry/sdk/im;-><init>([B)V

    .line 96
    iget-object v1, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "Saving persistent Pulse logging data."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/flurry/sdk/il;->d:Lcom/flurry/sdk/jv;

    iget-object v1, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :goto_0
    monitor-exit p0

    return-void

    .line 102
    :catch_0
    move-exception v0

    const/4 v0, 0x6

    :try_start_1
    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "Error when generating pulse log report in addReport part"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 296
    if-eqz p1, :cond_0

    const-string v0, ".do"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "overriding analytics agent report URL without an endpoint, are you sure?"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 300
    :cond_0
    iput-object p1, p0, Lcom/flurry/sdk/il;->a:Ljava/lang/String;

    .line 301
    return-void
.end method

.method public declared-synchronized a([B)V
    .locals 5

    .prologue
    .line 224
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/ji;->a()Lcom/flurry/sdk/ji;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ji;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "Reports were not sent! No Internet connection!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :goto_0
    monitor-exit p0

    return-void

    .line 229
    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    array-length v0, p1

    if-nez v0, :cond_2

    .line 230
    :cond_1
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "No report need be sent"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 224
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 234
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/flurry/sdk/il;->g()Ljava/lang/String;

    move-result-object v0

    .line 235
    const/4 v1, 0x4

    sget-object v2, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PulseLoggingManager: start upload data "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 237
    new-instance v1, Lcom/flurry/sdk/kj;

    invoke-direct {v1}, Lcom/flurry/sdk/kj;-><init>()V

    .line 238
    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;)V

    .line 239
    const v0, 0x186a0

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->d(I)V

    .line 240
    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kl$a;)V

    .line 241
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->b(Z)V

    .line 242
    const-string v0, "Content-Type"

    const-string v2, "application/octet-stream"

    invoke-virtual {v1, v0, v2}, Lcom/flurry/sdk/kj;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    new-instance v0, Lcom/flurry/sdk/kt;

    invoke-direct {v0}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kx;)V

    .line 244
    invoke-virtual {v1, p1}, Lcom/flurry/sdk/kj;->a(Ljava/lang/Object;)V

    .line 245
    new-instance v0, Lcom/flurry/sdk/il$2;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/il$2;-><init>(Lcom/flurry/sdk/il;)V

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/kj;->a(Lcom/flurry/sdk/kj$a;)V

    .line 268
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Lcom/flurry/sdk/jm;->a(Ljava/lang/Object;Lcom/flurry/sdk/ls;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public b()[B
    .locals 7

    .prologue
    .line 112
    const/4 v1, 0x0

    .line 114
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 115
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 117
    :try_start_1
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 219
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    :goto_0
    return-object v0

    .line 122
    :cond_1
    const/4 v0, 0x1

    :try_start_2
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 125
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 131
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 134
    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 137
    invoke-static {}, Lcom/flurry/sdk/jp;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 140
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 143
    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 146
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->e()Z

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 148
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->h()Ljava/util/Map;

    move-result-object v0

    .line 150
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 151
    new-instance v6, Lcom/flurry/sdk/hr;

    invoke-direct {v6}, Lcom/flurry/sdk/hr;-><init>()V

    .line 152
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/jk;

    iget v1, v1, Lcom/flurry/sdk/jk;->d:I

    iput v1, v6, Lcom/flurry/sdk/hr;->a:I

    .line 153
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/jk;

    iget-boolean v1, v1, Lcom/flurry/sdk/jk;->e:Z

    if-eqz v1, :cond_2

    .line 154
    new-instance v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v1, v6, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    .line 159
    :goto_2
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 215
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 216
    :goto_3
    const/4 v2, 0x6

    :try_start_3
    sget-object v3, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v4, "Error when generating report"

    invoke-static {v2, v3, v4, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 217
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 219
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_4
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    .line 157
    :cond_2
    :try_start_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Lcom/flurry/sdk/lp;->b([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    goto :goto_2

    .line 219
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 163
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 165
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hr;

    .line 167
    iget v4, v0, Lcom/flurry/sdk/hr;->a:I

    invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 170
    iget-object v0, v0, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 171
    array-length v4, v0

    invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 172
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_5

    .line 176
    :cond_4
    const/4 v0, 0x6

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 177
    sget-object v0, Lcom/flurry/sdk/ie;->b:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 178
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 179
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 181
    sget-object v0, Lcom/flurry/sdk/ie;->c:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 182
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 183
    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 185
    sget-object v0, Lcom/flurry/sdk/ie;->d:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 186
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 187
    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 189
    sget-object v0, Lcom/flurry/sdk/ie;->e:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 190
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 191
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 193
    sget-object v0, Lcom/flurry/sdk/ie;->f:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 194
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 195
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 197
    sget-object v0, Lcom/flurry/sdk/ie;->g:Lcom/flurry/sdk/ie;

    invoke-virtual {v0}, Lcom/flurry/sdk/ie;->a()I

    move-result v0

    .line 198
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 199
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 203
    const/4 v0, 0x0

    move v1, v0

    :goto_6
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 204
    iget-object v0, p0, Lcom/flurry/sdk/il;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/im;

    invoke-virtual {v0}, Lcom/flurry/sdk/im;->a()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 203
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 207
    :cond_5
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 208
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 209
    invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update([B)V

    .line 210
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    .line 211
    long-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 213
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v0

    .line 219
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto/16 :goto_4

    .line 215
    :catch_1
    move-exception v0

    goto/16 :goto_3
.end method

.method public declared-synchronized c()V
    .locals 3

    .prologue
    .line 273
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/flurry/sdk/il;->b()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/flurry/sdk/il;->a([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    :goto_0
    monitor-exit p0

    return-void

    .line 275
    :catch_0
    move-exception v0

    const/4 v0, 0x6

    :try_start_1
    sget-object v1, Lcom/flurry/sdk/il;->b:Ljava/lang/String;

    const-string v2, "Report not send due to exception in generate data"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 273
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

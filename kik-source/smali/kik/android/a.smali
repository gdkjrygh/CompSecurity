.class public final Lkik/android/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/b;


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Lkik/a/d/a;

.field private final c:Lkik/a/e/w;

.field private final d:Lkik/android/h;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private final h:Lkik/android/d/c;

.field private i:Lkik/a/e/v;

.field private j:Lkik/a/e/f;

.field private k:Landroid/os/HandlerThread;

.field private l:Landroid/os/Handler;

.field private m:Lkik/a/e/c;

.field private n:Ljava/util/Iterator;

.field private o:Z

.field private p:Z

.field private q:Lkik/a/f/f/s;

.field private r:Lcom/kik/g/f;

.field private s:Ljava/util/Random;

.field private t:Lcom/kik/g/i;

.field private u:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-string v0, "AddressIntegration"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/a;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/android/d/c;Lkik/a/e/v;Lkik/a/e/f;Lkik/a/d/a;Lkik/a/e/w;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lkik/android/h;

    invoke-direct {v0}, Lkik/android/h;-><init>()V

    iput-object v0, p0, Lkik/android/a;->d:Lkik/android/h;

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/a;->e:Ljava/lang/Object;

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/a;->o:Z

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/a;->p:Z

    .line 70
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/a;->r:Lcom/kik/g/f;

    .line 71
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lkik/android/a;->s:Ljava/util/Random;

    .line 73
    new-instance v0, Lkik/android/b;

    invoke-direct {v0, p0}, Lkik/android/b;-><init>(Lkik/android/a;)V

    iput-object v0, p0, Lkik/android/a;->t:Lcom/kik/g/i;

    .line 86
    new-instance v0, Lkik/android/c;

    invoke-direct {v0, p0}, Lkik/android/c;-><init>(Lkik/android/a;)V

    iput-object v0, p0, Lkik/android/a;->u:Lcom/kik/g/i;

    .line 104
    iput-object p4, p0, Lkik/android/a;->b:Lkik/a/d/a;

    .line 105
    iput-object p2, p0, Lkik/android/a;->i:Lkik/a/e/v;

    .line 106
    iput-object p3, p0, Lkik/android/a;->j:Lkik/a/e/f;

    .line 107
    iput-object p5, p0, Lkik/android/a;->c:Lkik/a/e/w;

    .line 108
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "AddressBookThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/a;->k:Landroid/os/HandlerThread;

    .line 109
    iget-object v0, p0, Lkik/android/a;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 110
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lkik/android/a;->k:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lkik/android/a;->l:Landroid/os/Handler;

    .line 111
    iput-object p6, p0, Lkik/android/a;->f:Ljava/lang/String;

    .line 112
    iput-object p1, p0, Lkik/android/a;->h:Lkik/android/d/c;

    .line 113
    iget-object v0, p0, Lkik/android/a;->c:Lkik/a/e/w;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/a;->c:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    .line 114
    iget-object v0, p0, Lkik/android/a;->c:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/a;->g:Ljava/lang/String;

    .line 119
    :goto_0
    iget-object v0, p0, Lkik/android/a;->r:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/a;->j:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/a;->t:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 120
    iget-object v0, p0, Lkik/android/a;->r:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/a;->c:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/a;->u:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 121
    return-void

    .line 117
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a;->g:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/a;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lkik/android/a;)Lkik/a/f/f/s;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->q:Lkik/a/f/f/s;

    return-object v0
.end method

.method static synthetic a(Lkik/android/a;Lkik/a/f/f/s;)Lkik/a/f/f/s;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/a;->q:Lkik/a/f/f/s;

    return-object p1
.end method

.method private a(Lkik/a/f/f/s;)V
    .locals 2

    .prologue
    .line 384
    iget-object v0, p0, Lkik/android/a;->j:Lkik/a/e/f;

    invoke-interface {v0, p1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/g;

    invoke-direct {v1, p0, p1}, Lkik/android/g;-><init>(Lkik/android/a;Lkik/a/f/f/s;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 423
    return-void
.end method

.method static synthetic a(Lkik/android/a;Ljava/util/List;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 39
    :try_start_0
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0, p1}, Lkik/a/e/c;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-boolean v0, p0, Lkik/android/a;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v1, "AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iput-boolean v3, p0, Lkik/android/a;->o:Z

    :cond_0
    iget-boolean v0, p0, Lkik/android/a;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v1, "AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iput-boolean v3, p0, Lkik/android/a;->p:Z

    :cond_1
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not update address filter! :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 337
    iget-object v0, p0, Lkik/android/a;->l:Landroid/os/Handler;

    new-instance v1, Lkik/android/f;

    invoke-direct {v1, p0, p1}, Lkik/android/f;-><init>(Lkik/android/a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 380
    return-void
.end method

.method static synthetic b(Lkik/android/a;)Lkik/a/e/w;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->c:Lkik/a/e/w;

    return-object v0
.end method

.method static synthetic b(Lkik/android/a;Lkik/a/f/f/s;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lkik/android/a;->a(Lkik/a/f/f/s;)V

    return-void
.end method

.method static synthetic c(Lkik/android/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lkik/android/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 39
    iget-object v0, p0, Lkik/android/a;->d:Lkik/android/h;

    invoke-virtual {v0}, Lkik/android/h;->a()V

    new-instance v0, Lkik/a/f/f/s;

    iget-object v1, p0, Lkik/android/a;->f:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/a;->g:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v3}, Lkik/a/f/f/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-direct {p0, v0}, Lkik/android/a;->a(Lkik/a/f/f/s;)V

    return-void
.end method

.method static synthetic e(Lkik/android/a;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic f(Lkik/android/a;)Z
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/a;->i()Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 183
    iget-object v1, p0, Lkik/android/a;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 185
    :try_start_0
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0}, Lkik/a/e/c;->h()V

    .line 186
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/a;->o:Z

    .line 187
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/a;->p:Z

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a;->q:Lkik/a/f/f/s;

    .line 189
    invoke-direct {p0}, Lkik/android/a;->h()V

    .line 190
    iget-object v0, p0, Lkik/android/a;->b:Lkik/a/d/a;

    invoke-virtual {v0}, Lkik/a/d/a;->a()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    .line 191
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/a;->a(Z)V

    .line 192
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic g(Lkik/android/a;)Z
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/a;->k()Z

    move-result v0

    return v0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 203
    iget-object v1, p0, Lkik/android/a;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 205
    :try_start_0
    iget-object v0, p0, Lkik/android/a;->l:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 206
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic h(Lkik/android/a;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/a;->g()V

    return-void
.end method

.method private i()Z
    .locals 2

    .prologue
    .line 263
    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v1, "AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic i(Lkik/android/a;)Z
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/a;->j()Z

    move-result v0

    return v0
.end method

.method static synthetic j(Lkik/android/a;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 39
    iget-object v1, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v1}, Lkik/a/e/c;->a()Lcom/c/a/c/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lkik/android/a;->e:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x1

    :try_start_1
    iput-boolean v2, p0, Lkik/android/a;->o:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lkik/android/a;->p:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lkik/android/a;->q:Lkik/a/f/f/s;

    invoke-direct {p0}, Lkik/android/a;->h()V

    iget-object v2, p0, Lkik/android/a;->b:Lkik/a/d/a;

    invoke-virtual {v2, v0}, Lkik/a/d/a;->a(Lcom/c/a/c/c;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/a;->a(Z)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    return-void

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not retrieve address filter for update! :"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private j()Z
    .locals 4

    .prologue
    .line 268
    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v1, "AddressIntegration.LAST_ADDRESS_BOOK_UPDATE_KEY"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 270
    if-eqz v0, :cond_0

    .line 271
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 272
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iget-object v0, p0, Lkik/android/a;->h:Lkik/android/d/c;

    const-string v1, "address-update-interval"

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 273
    const/4 v0, 0x1

    .line 276
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic k(Lkik/android/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->l:Landroid/os/Handler;

    return-object v0
.end method

.method private k()Z
    .locals 6

    .prologue
    .line 281
    iget-object v0, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v1, "AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 283
    if-eqz v0, :cond_0

    .line 284
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 285
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iget-object v0, p0, Lkik/android/a;->h:Lkik/android/d/c;

    const-string v1, "address-full-update-interval"

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    .line 286
    const/4 v0, 0x1

    .line 304
    :goto_0
    return v0

    .line 292
    :cond_0
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    .line 297
    iget-object v2, p0, Lkik/android/a;->s:Ljava/util/Random;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    .line 298
    mul-int/lit8 v2, v2, 0x18

    mul-int/lit8 v2, v2, 0x3c

    mul-int/lit8 v2, v2, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 300
    iget-object v2, p0, Lkik/android/a;->i:Lkik/a/e/v;

    const-string v3, "AddressIntegration.LAST_ADDRESS_BOOK_FULL_UPDATE_KEY"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 304
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic l(Lkik/android/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic m(Lkik/android/a;)Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    return-object v0
.end method

.method static synthetic n(Lkik/android/a;)Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    return-object v0
.end method

.method static synthetic o(Lkik/android/a;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lkik/android/a;->o:Z

    return v0
.end method

.method static synthetic p(Lkik/android/a;)Lkik/android/h;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->d:Lkik/android/h;

    return-object v0
.end method

.method static synthetic q(Lkik/android/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lkik/android/a;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/a;->a(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lkik/android/a;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->interrupt()V

    .line 128
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0}, Lkik/a/e/c;->g()V

    .line 129
    iget-object v0, p0, Lkik/android/a;->r:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 130
    return-void
.end method

.method public final a(Lkik/a/e/c;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lkik/android/a;->m:Lkik/a/e/c;

    .line 429
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0}, Lkik/a/e/c;->f()Z

    move-result v0

    return v0
.end method

.method public final c()Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 142
    const/4 v0, 0x0

    .line 143
    const/16 v1, 0x9

    invoke-static {v1}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 144
    const/4 v0, 0x1

    .line 147
    :cond_0
    iget-object v1, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v1}, Lkik/a/e/c;->b()Lcom/kik/g/p;

    move-result-object v2

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x2710

    :goto_0
    invoke-static {v2, v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    return-object v0

    :cond_1
    const-wide/16 v0, 0x1388

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 154
    invoke-virtual {p0}, Lkik/android/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkik/android/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lkik/android/a;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lkik/android/a;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    invoke-direct {p0}, Lkik/android/a;->g()V

    .line 157
    :cond_1
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0}, Lkik/a/e/c;->c()V

    .line 158
    return-void
.end method

.method public final e()V
    .locals 6

    .prologue
    .line 163
    iget-object v0, p0, Lkik/android/a;->m:Lkik/a/e/c;

    invoke-interface {v0}, Lkik/a/e/c;->d()V

    .line 165
    iget-object v1, p0, Lkik/android/a;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 166
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lkik/android/a;->o:Z

    .line 167
    invoke-direct {p0}, Lkik/android/a;->h()V

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a;->q:Lkik/a/f/f/s;

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a;->n:Ljava/util/Iterator;

    .line 173
    iget-object v0, p0, Lkik/android/a;->d:Lkik/android/h;

    invoke-virtual {v0}, Lkik/android/h;->a()V

    .line 174
    new-instance v0, Lkik/a/f/f/s;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-direct {v0, v2, v3, v4, v5}, Lkik/a/f/f/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-direct {p0, v0}, Lkik/android/a;->a(Lkik/a/f/f/s;)V

    .line 175
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 233
    invoke-virtual {p0}, Lkik/android/a;->c()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/d;

    invoke-direct {v1, p0}, Lkik/android/d;-><init>(Lkik/android/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 258
    return-void
.end method

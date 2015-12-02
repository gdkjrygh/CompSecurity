.class public Lcom/qihoo/security/opti/a/c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/a/c$a;,
        Lcom/qihoo/security/opti/a/c$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/pm/PackageManager;

.field private c:Lcom/qihoo360/mobilesafe/core/c/c;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/qihoo/security/opti/a/c$b;

.field private h:Z

.field private i:Ljava/lang/Thread;

.field private final j:Landroid/content/ServiceConnection;

.field private k:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/qihoo/security/opti/a/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/a/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    .line 33
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 34
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->d:Landroid/content/Context;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    .line 36
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    .line 37
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/a/c;->h:Z

    .line 39
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    .line 104
    new-instance v0, Lcom/qihoo/security/opti/a/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/a/c$1;-><init>(Lcom/qihoo/security/opti/a/c;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->j:Landroid/content/ServiceConnection;

    .line 171
    new-instance v0, Lcom/qihoo/security/opti/a/c$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/a/c$2;-><init>(Lcom/qihoo/security/opti/a/c;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->k:Ljava/util/Comparator;

    .line 42
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c;->d:Landroid/content/Context;

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object p1
.end method

.method private a(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    invoke-virtual {p1, v0}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 259
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 260
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 262
    :cond_0
    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/c;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/c;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    return-object p1
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 200
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 207
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 208
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 210
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 212
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 213
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    .line 214
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 216
    new-instance v5, Lcom/qihoo/security/opti/a/c$3;

    invoke-direct {v5, p0, v1, v0, v2}, Lcom/qihoo/security/opti/a/c$3;-><init>(Lcom/qihoo/security/opti/a/c;Ljava/util/concurrent/CountDownLatch;Lcom/qihoo/security/opti/a/c$a;Ljava/util/concurrent/CountDownLatch;)V

    .line 229
    invoke-interface {v3, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 235
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    :goto_1
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 248
    :cond_1
    return-object p1

    .line 236
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private a(Lcom/qihoo/security/opti/a/c$a;)V
    .locals 2

    .prologue
    .line 252
    iget-object v0, p1, Lcom/qihoo/security/opti/a/c$a;->f:Landroid/content/pm/ApplicationInfo;

    .line 253
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/a/c;->a(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    .line 254
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/a/a;->a(Ljava/lang/String;Landroid/content/pm/PackageManager;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p1, Lcom/qihoo/security/opti/a/c$a;->d:Z

    .line 255
    return-void

    .line 254
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/c;Lcom/qihoo/security/opti/a/c$a;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c$a;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/a/c;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/opti/a/c;->e()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/a/c;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/opti/a/c;->f()V

    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 138
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->b()Ljava/util/List;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private f()V
    .locals 6

    .prologue
    .line 272
    .line 277
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 278
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/a/a;->a(Landroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object v0

    .line 280
    if-eqz v0, :cond_5

    .line 281
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 282
    iget-boolean v3, p0, Lcom/qihoo/security/opti/a/c;->h:Z

    if-eqz v3, :cond_2

    .line 283
    sget-object v0, Lcom/qihoo/security/opti/a/c;->a:Ljava/lang/String;

    const-string/jumbo v1, "task cancelled return"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    if-eqz v0, :cond_1

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    invoke-interface {v0}, Lcom/qihoo/security/opti/a/c$b;->c()V

    .line 329
    :cond_1
    :goto_1
    return-void

    .line 290
    :cond_2
    new-instance v3, Lcom/qihoo/security/opti/a/c$a;

    invoke-direct {v3}, Lcom/qihoo/security/opti/a/c$a;-><init>()V

    .line 291
    iget-object v4, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v4, v3, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    .line 292
    iput-object v0, v3, Lcom/qihoo/security/opti/a/c$a;->f:Landroid/content/pm/ApplicationInfo;

    .line 294
    const-string/jumbo v4, "com.qihoo.security.lite"

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 300
    iget-object v5, v3, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 301
    const/4 v0, 0x1

    iput-boolean v0, v3, Lcom/qihoo/security/opti/a/c$a;->c:Z

    .line 306
    :cond_4
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 310
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 311
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/qihoo/security/opti/a/c;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 312
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->k:Ljava/util/Comparator;

    if-eqz v0, :cond_6

    .line 314
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/c;->k:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 326
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    if-eqz v0, :cond_1

    .line 327
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    invoke-interface {v0}, Lcom/qihoo/security/opti/a/c$b;->b()V

    goto :goto_1

    .line 315
    :catch_0
    move-exception v0

    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    invoke-interface {v0}, Lcom/qihoo/security/opti/a/c$b;->a()V

    .line 54
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/a/c;->h:Z

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->d:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/a/c;->j:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 57
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/a/c$b;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c;->g:Lcom/qihoo/security/opti/a/c$b;

    .line 102
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 344
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    :cond_0
    :goto_0
    return-void

    .line 345
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->d:Landroid/content/Context;

    .line 61
    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->b:Landroid/content/pm/PackageManager;

    .line 62
    iput-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/a/c;->h:Z

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->i:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 79
    sget-object v0, Lcom/qihoo/security/opti/a/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/c;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/a/c;->j:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 80
    return-void

    .line 71
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 338
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->e:Ljava/util/List;

    return-object v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 354
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 358
    :cond_0
    :goto_0
    return-void

    .line 355
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.class public Lcom/qihoo360/mobilesafe/core/a;
.super Lcom/qihoo360/mobilesafe/core/ProcessState;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field private static final c:Ljava/lang/String;


# instance fields
.field private d:Landroid/content/Context;

.field private e:Landroid/app/ActivityManager;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Ljava/util/concurrent/atomic/AtomicInteger;

.field private i:Lcom/qihoo/security/ui/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/a;->c:Ljava/lang/String;

    .line 50
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 229
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/ProcessState;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->f:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    .line 55
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_NULL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 56
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    const-string/jumbo v1, "activity"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->e:Landroid/app/ActivityManager;

    .line 57
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/e;->a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/e;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->i:Lcom/qihoo/security/ui/b/e;

    .line 59
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/d;->a()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/core/a;->g:I

    .line 63
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/qihoo360/mobilesafe/core/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method private a(ZLjava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;",
            "Lcom/qihoo360/mobilesafe/core/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 169
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    new-instance v0, Lcom/qihoo360/mobilesafe/core/a$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/core/a$a;-><init>(Lcom/qihoo360/mobilesafe/core/a;ZLjava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V

    .line 172
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/a;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/core/a$a;->a(Lcom/qihoo360/mobilesafe/core/a$a;I)V

    .line 173
    sget-object v1, Lcom/qihoo360/mobilesafe/core/a;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/a$a;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    .line 175
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/a;)Lcom/qihoo/security/ui/b/e;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->i:Lcom/qihoo/security/ui/b/e;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 5

    .prologue
    .line 103
    const-string/jumbo v0, "app_process"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    const-string/jumbo v2, "com.qihoo360.RT"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    const-string/jumbo v2, "-fs"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "CLASSPATH="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    invoke-virtual {p0, v4}, Lcom/qihoo360/mobilesafe/core/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/support/a;->d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v3

    .line 118
    const-string/jumbo v4, "app_process"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v3, v0, v1, v2, v4}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a$a;)V

    .line 123
    const/4 v0, 0x1

    .line 125
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/core/a;)I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/qihoo360/mobilesafe/core/a;->g:I

    return v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 133
    :try_start_0
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/a;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    :goto_0
    return-void

    .line 137
    :catch_0
    move-exception v0

    .line 142
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/a;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/core/a;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->e:Landroid/app/ActivityManager;

    invoke-virtual {v0, p1}, Landroid/app/ActivityManager;->killBackgroundProcesses(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :goto_0
    return-void

    .line 152
    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 84
    const-string/jumbo v0, "rt1.jar"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_1

    .line 89
    :cond_0
    const-string/jumbo v1, "rt1.jar"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lcom/qihoo360/common/utils/Utils;->resetFile(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->f:Ljava/lang/String;

    .line 96
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/a;->c(Ljava/lang/String;)V

    .line 80
    :goto_0
    return-void

    .line 75
    :cond_0
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/a;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;",
            "Lcom/qihoo360/mobilesafe/core/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 165
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/a;->a(ZLjava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V

    .line 166
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;",
            "Lcom/qihoo360/mobilesafe/core/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 186
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 189
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 214
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 215
    invoke-interface {v2, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 218
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0, v2, p3}, Lcom/qihoo360/mobilesafe/core/a;->a(ZLjava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V

    .line 225
    :cond_2
    :goto_1
    return-void

    .line 189
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 190
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 191
    iget-object v4, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 201
    new-instance v5, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v5}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 202
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    iput-object v1, v5, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 203
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    iput v1, v5, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 204
    array-length v6, v4

    .line 205
    new-array v1, v6, [I

    iput-object v1, v5, Lcom/qihoo360/mobilesafe/service/KillBean;->pids:[I

    .line 206
    const/4 v1, 0x0

    :goto_2
    if-lt v1, v6, :cond_4

    .line 210
    iget v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    iput v0, v5, Lcom/qihoo360/mobilesafe/service/KillBean;->importance:I

    .line 211
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 219
    :catch_0
    move-exception v0

    goto :goto_1

    .line 207
    :cond_4
    iget-object v7, v5, Lcom/qihoo360/mobilesafe/service/KillBean;->pids:[I

    aget v8, v4, v1

    aput v8, v7, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

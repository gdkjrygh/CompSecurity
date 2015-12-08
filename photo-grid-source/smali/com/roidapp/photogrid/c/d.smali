.class public final Lcom/roidapp/photogrid/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z

.field public static b:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static c:Z

.field private static f:Lcom/roidapp/photogrid/c/d;

.field private static i:Z


# instance fields
.field private d:Lcom/roidapp/photogrid/c/c;

.field private e:Lcom/roidapp/photogrid/c/f;

.field private g:Landroid/content/Context;

.field private h:I

.field private j:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 33
    sput-boolean v1, Lcom/roidapp/photogrid/c/d;->c:Z

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    .line 41
    sput-boolean v2, Lcom/roidapp/photogrid/c/d;->a:Z

    .line 42
    sput-boolean v1, Lcom/roidapp/photogrid/c/d;->i:Z

    .line 50
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v0, 0x2

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    move v3, v2

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v1, Lcom/roidapp/photogrid/c/d;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance v0, Lcom/roidapp/photogrid/c/e;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/c/e;-><init>(Lcom/roidapp/photogrid/c/d;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/c/d;->j:Landroid/os/Handler;

    .line 57
    iput-object p1, p0, Lcom/roidapp/photogrid/c/d;->g:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lcom/roidapp/photogrid/c/d;->d:Lcom/roidapp/photogrid/c/c;

    .line 60
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/c/d;)I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/roidapp/photogrid/c/d;->h:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/c/d;I)I
    .locals 0

    .prologue
    .line 23
    iput p1, p0, Lcom/roidapp/photogrid/c/d;->h:I

    return p1
.end method

.method public static a(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;)Lcom/roidapp/photogrid/c/d;
    .locals 2

    .prologue
    .line 65
    sget-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    if-nez v0, :cond_0

    .line 66
    const-string v0, "DownloadMainLite"

    const-string v1, "new mDown"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    new-instance v0, Lcom/roidapp/photogrid/c/d;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/c/d;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;)V

    .line 68
    sput-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    .line 70
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    goto :goto_0
.end method

.method public static a()V
    .locals 2

    .prologue
    .line 94
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/c/d;->c:Z

    .line 95
    sget-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    .line 98
    :cond_0
    const-string v0, "DownloadMainLite"

    const-string v1, "oncancel"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 23
    .line 2289
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-static {v1, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 23
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/c;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->d:Lcom/roidapp/photogrid/c/c;

    return-object v0
.end method

.method public static b()V
    .locals 2

    .prologue
    .line 102
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/c/d;->i:Z

    .line 103
    const-string v0, "DownloadMainLite"

    const-string v1, "onReTry"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    return-void
.end method

.method static synthetic c()Lcom/roidapp/photogrid/c/d;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/c/d;->f:Lcom/roidapp/photogrid/c/d;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/c/d;)Lcom/roidapp/photogrid/c/f;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->e:Lcom/roidapp/photogrid/c/f;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/c/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/c/d;->c:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/c/d;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1294
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 1295
    iget-object v1, p0, Lcom/roidapp/photogrid/c/d;->g:Landroid/content/Context;

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "SAVEPATH"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    return-object v0
.end method

.method static synthetic e()Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/c/d;->i:Z

    return v0
.end method

.method static synthetic f()Z
    .locals 1

    .prologue
    .line 23
    sget-boolean v0, Lcom/roidapp/photogrid/c/d;->c:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/c/d;)Z
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/roidapp/photogrid/c/d;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic g()Z
    .locals 1

    .prologue
    .line 23
    sget-boolean v0, Lcom/roidapp/photogrid/c/d;->i:Z

    return v0
.end method

.method private h()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 267
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->g:Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 270
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 271
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v3

    if-eq v3, v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    :cond_0
    move v0, v2

    .line 278
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 275
    goto :goto_0

    .line 278
    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 83
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-static {v3, v2, v2, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/c/d;->e:Lcom/roidapp/photogrid/c/f;

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/c/f;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/c/f;-><init>(Lcom/roidapp/photogrid/c/d;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/c/d;->e:Lcom/roidapp/photogrid/c/f;

    .line 87
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/c/d;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/roidapp/photogrid/c/d;->e:Lcom/roidapp/photogrid/c/f;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 88
    return-void
.end method

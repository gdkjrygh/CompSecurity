.class public Lcom/facebook/bugreporter/m;
.super Ljava/lang/Object;
.source "BugReporterFileUtil.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/bugreporter/m;

    sput-object v0, Lcom/facebook/bugreporter/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/bugreporter/m;->b:Landroid/content/Context;

    .line 30
    iput-object p2, p0, Lcom/facebook/bugreporter/m;->c:Ljava/util/concurrent/Executor;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 39
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/facebook/bugreporter/m;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "bugreports"

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v1

    .line 43
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 44
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 46
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 53
    :cond_0
    :goto_1
    return-object v0

    .line 49
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    .line 51
    :goto_2
    sget-object v2, Lcom/facebook/bugreporter/m;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception caught in createReportDirectory: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 49
    :catch_1
    move-exception v1

    goto :goto_2

    :cond_1
    move-object v2, v0

    goto :goto_0
.end method

.method public a(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/bugreporter/m;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/bugreporter/n;

    invoke-direct {v1, p0, p1}, Lcom/facebook/bugreporter/n;-><init>(Lcom/facebook/bugreporter/m;Landroid/net/Uri;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 68
    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 6

    .prologue
    .line 78
    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v0, Ljava/net/URI;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 79
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 80
    if-eqz v2, :cond_1

    .line 81
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 82
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 83
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 81
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :goto_1
    return-void

    .line 88
    :catch_0
    move-exception v0

    .line 89
    sget-object v1, Lcom/facebook/bugreporter/m;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot parse Bug Report Directory URI: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/f;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1
.end method

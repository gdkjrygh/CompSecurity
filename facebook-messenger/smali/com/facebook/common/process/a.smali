.class public Lcom/facebook/common/process/a;
.super Ljava/lang/Object;
.source "DefaultProcessUtil.java"

# interfaces
.implements Lcom/facebook/common/process/d;


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

.field private final c:Landroid/app/ActivityManager;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private volatile e:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/common/process/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/common/process/a;

    sput-object v0, Lcom/facebook/common/process/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/ActivityManager;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/ActivityManager;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/common/process/a;->b:Landroid/content/Context;

    .line 43
    iput-object p2, p0, Lcom/facebook/common/process/a;->c:Landroid/app/ActivityManager;

    .line 44
    iput-object p3, p0, Lcom/facebook/common/process/a;->d:Ljavax/inject/a;

    .line 45
    return-void
.end method

.method private d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/common/process/a;->c:Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    .line 147
    if-nez v0, :cond_0

    .line 148
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 150
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/common/process/c;
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 98
    new-instance v0, Ljava/io/File;

    const-string v1, "/proc/self/cmdline"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 99
    const/4 v1, 0x0

    .line 101
    :try_start_0
    sget-object v2, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v2}, Lcom/google/common/b/f;->a(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;

    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 106
    :cond_0
    invoke-static {v0}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;)Lcom/facebook/common/process/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 108
    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method public a(I)Lcom/facebook/common/process/c;
    .locals 3

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/common/process/a;->d()Ljava/util/List;

    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 62
    iget v2, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v2, p1, :cond_0

    .line 63
    iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;)Lcom/facebook/common/process/c;

    move-result-object v0

    .line 66
    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/facebook/common/process/c;->a:Lcom/facebook/common/process/c;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/facebook/common/process/a;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    .line 89
    if-nez v0, :cond_0

    .line 90
    sget-object v0, Lcom/facebook/common/process/a;->a:Ljava/lang/Class;

    const-string v1, "Couldn\'t find own process name"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 91
    const/4 v0, 0x0

    .line 93
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public b()Lcom/facebook/common/process/c;
    .locals 4

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/common/process/a;->e:Lcom/google/common/base/Optional;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/facebook/common/process/a;->e:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/c;

    .line 131
    :goto_0
    return-object v0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/process/a;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/common/process/a;->a(I)Lcom/facebook/common/process/c;

    move-result-object v0

    .line 118
    invoke-virtual {v0}, Lcom/facebook/common/process/c;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/process/a;->a()Lcom/facebook/common/process/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 127
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/common/process/c;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 128
    sget-object v1, Lcom/facebook/common/process/a;->a:Ljava/lang/Class;

    const-string v2, "Couldn\'t find own process name"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 130
    :cond_2
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/common/process/a;->e:Lcom/google/common/base/Optional;

    goto :goto_0

    .line 122
    :catch_0
    move-exception v1

    .line 123
    sget-object v2, Lcom/facebook/common/process/a;->a:Ljava/lang/Class;

    const-string v3, "Couldn\'t read process name from cmdline."

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public c()Lcom/facebook/common/process/c;
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/common/process/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/process/c;

    move-result-object v0

    return-object v0
.end method

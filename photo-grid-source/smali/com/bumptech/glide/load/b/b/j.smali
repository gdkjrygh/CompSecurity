.class public final Lcom/bumptech/glide/load/b/b/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/a;


# static fields
.field private static a:Lcom/bumptech/glide/load/b/b/j;


# instance fields
.field private final b:Lcom/bumptech/glide/load/b/b/e;

.field private final c:Lcom/bumptech/glide/load/b/b/s;

.field private final d:Ljava/io/File;

.field private final e:I

.field private f:Lcom/bumptech/glide/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/bumptech/glide/load/b/b/j;->a:Lcom/bumptech/glide/load/b/b/j;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;I)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/bumptech/glide/load/b/b/e;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/b/e;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->b:Lcom/bumptech/glide/load/b/b/e;

    .line 52
    iput-object p1, p0, Lcom/bumptech/glide/load/b/b/j;->d:Ljava/io/File;

    .line 53
    iput p2, p0, Lcom/bumptech/glide/load/b/b/j;->e:I

    .line 54
    new-instance v0, Lcom/bumptech/glide/load/b/b/s;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/b/s;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->c:Lcom/bumptech/glide/load/b/b/s;

    .line 55
    return-void
.end method

.method private declared-synchronized a()Lcom/bumptech/glide/a/a;
    .locals 4

    .prologue
    .line 58
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->f:Lcom/bumptech/glide/a/a;

    if-nez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->d:Ljava/io/File;

    iget v1, p0, Lcom/bumptech/glide/load/b/b/j;->e:I

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;J)Lcom/bumptech/glide/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->f:Lcom/bumptech/glide/a/a;

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->f:Lcom/bumptech/glide/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static declared-synchronized a(Ljava/io/File;I)Lcom/bumptech/glide/load/b/b/a;
    .locals 2

    .prologue
    .line 45
    const-class v1, Lcom/bumptech/glide/load/b/b/j;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/bumptech/glide/load/b/b/j;->a:Lcom/bumptech/glide/load/b/b/j;

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Lcom/bumptech/glide/load/b/b/j;

    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/load/b/b/j;-><init>(Ljava/io/File;I)V

    sput-object v0, Lcom/bumptech/glide/load/b/b/j;->a:Lcom/bumptech/glide/load/b/b/j;

    .line 48
    :cond_0
    sget-object v0, Lcom/bumptech/glide/load/b/b/j;->a:Lcom/bumptech/glide/load/b/b/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/c;)Ljava/io/File;
    .locals 4

    .prologue
    .line 70
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->c:Lcom/bumptech/glide/load/b/b/s;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/b/s;->a(Lcom/bumptech/glide/load/c;)Ljava/lang/String;

    move-result-object v1

    .line 71
    const/4 v0, 0x0

    .line 76
    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/b/j;->a()Lcom/bumptech/glide/a/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/a/a;->a(Ljava/lang/String;)Lcom/bumptech/glide/a/e;

    move-result-object v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    invoke-virtual {v1}, Lcom/bumptech/glide/a/e;->a()Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 85
    :cond_0
    :goto_0
    return-object v0

    .line 80
    :catch_0
    move-exception v1

    .line 81
    const-string v2, "DiskLruCacheWrapper"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 82
    const-string v2, "DiskLruCacheWrapper"

    const-string v3, "Unable to get from disk cache"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/b/c;)V
    .locals 3

    .prologue
    .line 90
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->c:Lcom/bumptech/glide/load/b/b/s;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/b/s;->a(Lcom/bumptech/glide/load/c;)Ljava/lang/String;

    move-result-object v0

    .line 91
    iget-object v1, p0, Lcom/bumptech/glide/load/b/b/j;->b:Lcom/bumptech/glide/load/b/b/e;

    invoke-virtual {v1, p1}, Lcom/bumptech/glide/load/b/b/e;->a(Lcom/bumptech/glide/load/c;)V

    .line 93
    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/b/j;->a()Lcom/bumptech/glide/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/a/a;->b(Ljava/lang/String;)Lcom/bumptech/glide/a/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 95
    if-eqz v1, :cond_1

    .line 97
    :try_start_1
    invoke-virtual {v1}, Lcom/bumptech/glide/a/c;->a()Ljava/io/File;

    move-result-object v0

    .line 98
    invoke-interface {p2, v0}, Lcom/bumptech/glide/load/b/b/c;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {v1}, Lcom/bumptech/glide/a/c;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lcom/bumptech/glide/a/c;->d()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->b:Lcom/bumptech/glide/load/b/b/e;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/b/e;->b(Lcom/bumptech/glide/load/c;)V

    .line 111
    :goto_0
    return-void

    .line 102
    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Lcom/bumptech/glide/a/c;->d()V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 105
    :catch_0
    move-exception v0

    .line 106
    :try_start_4
    const-string v1, "DiskLruCacheWrapper"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 107
    const-string v1, "DiskLruCacheWrapper"

    const-string v2, "Unable to put to disk cache"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 110
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->b:Lcom/bumptech/glide/load/b/b/e;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/b/e;->b(Lcom/bumptech/glide/load/c;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/b/j;->b:Lcom/bumptech/glide/load/b/b/e;

    invoke-virtual {v1, p1}, Lcom/bumptech/glide/load/b/b/e;->b(Lcom/bumptech/glide/load/c;)V

    throw v0
.end method

.method public final b(Lcom/bumptech/glide/load/c;)V
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/j;->c:Lcom/bumptech/glide/load/b/b/s;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/b/s;->a(Lcom/bumptech/glide/load/c;)Ljava/lang/String;

    move-result-object v0

    .line 118
    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/b/j;->a()Lcom/bumptech/glide/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/a/a;->c(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 119
    :catch_0
    move-exception v0

    .line 120
    const-string v1, "DiskLruCacheWrapper"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 121
    const-string v1, "DiskLruCacheWrapper"

    const-string v2, "Unable to delete from disk cache"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

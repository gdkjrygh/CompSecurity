.class final Lcom/b/a/c/br;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/io/FilenameFilter;

.field private static final c:[S


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Lcom/b/a/c/ar;

.field private f:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lcom/b/a/c/bs;

    invoke-direct {v0}, Lcom/b/a/c/bs;-><init>()V

    sput-object v0, Lcom/b/a/c/br;->b:Ljava/io/FilenameFilter;

    .line 32
    const-string v0, "X-CRASHLYTICS-INVALID-SESSION"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/b/a/c/br;->a:Ljava/util/Map;

    .line 35
    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/b/a/c/br;->c:[S

    return-void

    :array_0
    .array-data 2
        0xas
        0x14s
        0x1es
        0x3cs
        0x78s
        0x12cs
    .end array-data
.end method

.method public constructor <init>(Lcom/b/a/c/ar;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/b/a/c/br;->d:Ljava/lang/Object;

    .line 43
    if-nez p1, :cond_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "createReportCall must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    iput-object p1, p0, Lcom/b/a/c/br;->e:Lcom/b/a/c/ar;

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/b/a/c/br;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/c/br;->f:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic b()[S
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/b/a/c/br;->c:[S

    return-object v0
.end method


# virtual methods
.method final a()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/b/a/c/bq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 101
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 104
    iget-object v1, p0, Lcom/b/a/c/br;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 105
    :try_start_0
    invoke-static {}, Lcom/b/a/c/h;->f()Lcom/b/a/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/c/h;->q()Ljava/io/File;

    move-result-object v0

    sget-object v2, Lcom/b/a/c/br;->b:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    .line 106
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 109
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 110
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Found crash report "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    new-instance v5, Lcom/b/a/c/bv;

    invoke-direct {v5, v4}, Lcom/b/a/c/bv;-><init>(Ljava/io/File;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 114
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 118
    :cond_1
    return-object v1
.end method

.method public final declared-synchronized a(F)V
    .locals 3

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/b/a/c/br;->f:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/b/a/c/bt;

    invoke-direct {v1, p0, p1}, Lcom/b/a/c/bt;-><init>(Lcom/b/a/c/br;F)V

    const-string v2, "Crashlytics Report Uploader"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/b/a/c/br;->f:Ljava/lang/Thread;

    .line 56
    iget-object v0, p0, Lcom/b/a/c/br;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    :cond_0
    monitor-exit p0

    return-void

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final a(Lcom/b/a/c/bq;)Z
    .locals 7

    .prologue
    .line 74
    const/4 v0, 0x0

    .line 75
    iget-object v2, p0, Lcom/b/a/c/br;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 77
    :try_start_0
    invoke-static {}, Lcom/b/a/c/h;->f()Lcom/b/a/c/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v1

    .line 79
    new-instance v3, Lcom/b/a/c/aq;

    new-instance v4, La/a/a/a/a/b/j;

    invoke-direct {v4}, La/a/a/a/a/b/j;-><init>()V

    invoke-static {v1}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, p1}, Lcom/b/a/c/aq;-><init>(Ljava/lang/String;Lcom/b/a/c/bq;)V

    .line 81
    iget-object v1, p0, Lcom/b/a/c/br;->e:Lcom/b/a/c/ar;

    invoke-interface {v1, v3}, Lcom/b/a/c/ar;->a(Lcom/b/a/c/aq;)Z

    move-result v3

    .line 83
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v4

    const-string v5, "CrashlyticsCore"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v1, "Crashlytics report upload "

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v3, :cond_1

    const-string v1, "complete: "

    :goto_0
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Lcom/b/a/c/bq;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v5, v1}, La/a/a/a/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    if-eqz v3, :cond_0

    .line 87
    invoke-interface {p1}, Lcom/b/a/c/bq;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    const/4 v0, 0x1

    .line 96
    :cond_0
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    return v0

    .line 83
    :cond_1
    :try_start_2
    const-string v1, "FAILED: "
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 90
    :catch_0
    move-exception v1

    .line 93
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "CrashlyticsCore"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error occurred sending report "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.class final Lcom/a/a/c/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/aw$a;
    }
.end annotation


# static fields
.field static final a:Ljava/util/Map;

.field private static final b:Ljava/io/FilenameFilter;

.field private static final c:[S


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Lcom/a/a/c/an;

.field private f:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lcom/a/a/c/ax;

    invoke-direct {v0}, Lcom/a/a/c/ax;-><init>()V

    sput-object v0, Lcom/a/a/c/aw;->b:Ljava/io/FilenameFilter;

    .line 32
    const-string v0, "X-CRASHLYTICS-INVALID-SESSION"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/a/a/c/aw;->a:Ljava/util/Map;

    .line 35
    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/a/a/c/aw;->c:[S

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

.method public constructor <init>(Lcom/a/a/c/an;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/a/a/c/aw;->d:Ljava/lang/Object;

    .line 43
    if-nez p1, :cond_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "createReportCall must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    iput-object p1, p0, Lcom/a/a/c/aw;->e:Lcom/a/a/c/an;

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/a/a/c/aw;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/c/aw;->f:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic b()[S
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/a/a/c/aw;->c:[S

    return-object v0
.end method


# virtual methods
.method final a()Ljava/util/List;
    .locals 7

    .prologue
    .line 101
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 104
    iget-object v1, p0, Lcom/a/a/c/aw;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 105
    :try_start_0
    invoke-static {}, Lcom/a/a/c/g;->f()Lcom/a/a/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c/g;->q()Ljava/io/File;

    move-result-object v0

    sget-object v2, Lcom/a/a/c/aw;->b:Ljava/io/FilenameFilter;

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
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Found crash report "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    new-instance v5, Lcom/a/a/c/az;

    invoke-direct {v5, v4}, Lcom/a/a/c/az;-><init>(Ljava/io/File;)V

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
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

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
    iget-object v0, p0, Lcom/a/a/c/aw;->f:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/a/a/c/aw$a;

    invoke-direct {v1, p0, p1}, Lcom/a/a/c/aw$a;-><init>(Lcom/a/a/c/aw;F)V

    const-string v2, "Crashlytics Report Uploader"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/a/a/c/aw;->f:Ljava/lang/Thread;

    .line 56
    iget-object v0, p0, Lcom/a/a/c/aw;->f:Ljava/lang/Thread;

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

.method final a(Lcom/a/a/c/av;)Z
    .locals 7

    .prologue
    .line 74
    const/4 v0, 0x0

    .line 75
    iget-object v2, p0, Lcom/a/a/c/aw;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 77
    :try_start_0
    invoke-static {}, Lcom/a/a/c/g;->f()Lcom/a/a/c/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v1

    .line 79
    new-instance v3, Lcom/a/a/c/am;

    new-instance v4, Lb/a/a/a/a/b/h;

    invoke-direct {v4}, Lb/a/a/a/a/b/h;-><init>()V

    invoke-static {v1}, Lb/a/a/a/a/b/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, p1}, Lcom/a/a/c/am;-><init>(Ljava/lang/String;Lcom/a/a/c/av;)V

    .line 81
    iget-object v1, p0, Lcom/a/a/c/aw;->e:Lcom/a/a/c/an;

    invoke-interface {v1, v3}, Lcom/a/a/c/an;->a(Lcom/a/a/c/am;)Z

    move-result v3

    .line 83
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v1, "Crashlytics report upload "

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v3, :cond_1

    const-string v1, "complete: "

    :goto_0
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Lcom/a/a/c/av;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    if-eqz v3, :cond_0

    .line 87
    invoke-interface {p1}, Lcom/a/a/c/av;->a()Z
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
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error occurred sending report "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

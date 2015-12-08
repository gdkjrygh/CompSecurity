.class final Lcom/crashlytics/android/ar;
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

.field private final e:Lcom/crashlytics/android/ab;

.field private f:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Lcom/crashlytics/android/as;

    invoke-direct {v0}, Lcom/crashlytics/android/as;-><init>()V

    sput-object v0, Lcom/crashlytics/android/ar;->b:Ljava/io/FilenameFilter;

    .line 31
    const-string v0, "X-CRASHLYTICS-INVALID-SESSION"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/ar;->a:Ljava/util/Map;

    .line 34
    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/crashlytics/android/ar;->c:[S

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

.method public constructor <init>(Lcom/crashlytics/android/ab;)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/ar;->d:Ljava/lang/Object;

    .line 42
    if-nez p1, :cond_0

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "createReportCall must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iput-object p1, p0, Lcom/crashlytics/android/ar;->e:Lcom/crashlytics/android/ab;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/crashlytics/android/ar;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/crashlytics/android/ar;->f:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic b()[S
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/crashlytics/android/ar;->c:[S

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
            "Lcom/crashlytics/android/aq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 108
    const-string v0, "Checking for crash reports..."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 111
    iget-object v1, p0, Lcom/crashlytics/android/ar;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 112
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->j()Ljava/io/File;

    move-result-object v0

    sget-object v2, Lcom/crashlytics/android/ar;->b:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    .line 113
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 116
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 117
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Found crash report "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 118
    new-instance v5, Lcom/crashlytics/android/aq;

    invoke-direct {v5, v4}, Lcom/crashlytics/android/aq;-><init>(Ljava/io/File;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 113
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 121
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 122
    const-string v0, "No reports found."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 125
    :cond_1
    return-object v1
.end method

.method public final declared-synchronized a(Landroid/content/Context;F)V
    .locals 3

    .prologue
    .line 53
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/ar;->f:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/crashlytics/android/at;

    invoke-direct {v1, p0, p1, p2}, Lcom/crashlytics/android/at;-><init>(Lcom/crashlytics/android/ar;Landroid/content/Context;F)V

    const-string v2, "Crashlytics Report Uploader"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/crashlytics/android/ar;->f:Ljava/lang/Thread;

    .line 55
    iget-object v0, p0, Lcom/crashlytics/android/ar;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_0
    monitor-exit p0

    return-void

    .line 53
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final a(Lcom/crashlytics/android/aq;)Z
    .locals 7

    .prologue
    .line 73
    const/4 v0, 0x0

    .line 74
    iget-object v2, p0, Lcom/crashlytics/android/ar;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 80
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/aB;->d()Z

    .line 88
    new-instance v1, Lcom/crashlytics/android/aa;

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->i()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, p1}, Lcom/crashlytics/android/aa;-><init>(Ljava/lang/String;Lcom/crashlytics/android/aq;)V

    .line 89
    iget-object v3, p0, Lcom/crashlytics/android/ar;->e:Lcom/crashlytics/android/ab;

    invoke-interface {v3, v1}, Lcom/crashlytics/android/ab;->a(Lcom/crashlytics/android/aa;)Z

    move-result v3

    .line 91
    const/4 v4, 0x4

    const-string v5, "Crashlytics"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v1, "Crashlytics report upload "

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v3, :cond_1

    const-string v1, "complete: "

    :goto_0
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/crashlytics/android/aq;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v5, v1}, Lcom/crashlytics/android/aB;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 94
    if-eqz v3, :cond_0

    .line 95
    invoke-virtual {p1}, Lcom/crashlytics/android/aq;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    const/4 v0, 0x1

    .line 103
    :cond_0
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    return v0

    .line 91
    :cond_1
    :try_start_2
    const-string v1, "FAILED: "
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 98
    :catch_0
    move-exception v1

    .line 101
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error occurred sending report "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

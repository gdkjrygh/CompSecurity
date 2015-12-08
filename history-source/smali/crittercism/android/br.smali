.class public Lcrittercism/android/br;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcrittercism/android/br$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Ljava/io/File;

.field private c:Lcrittercism/android/ci;

.field private d:I

.field private e:I

.field private f:I

.field private g:Lcrittercism/android/br$a;

.field private h:Z

.field private i:Ljava/lang/String;

.field private j:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcrittercism/android/br;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcrittercism/android/br;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcrittercism/android/bq;)V
    .locals 7

    .prologue
    .line 54
    invoke-virtual {p2}, Lcrittercism/android/bq;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "//com.crittercism//"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcrittercism/android/bq;->c()Lcrittercism/android/br$a;

    move-result-object v2

    invoke-virtual {p2}, Lcrittercism/android/bq;->d()Lcrittercism/android/ci;

    move-result-object v3

    invoke-virtual {p2}, Lcrittercism/android/bq;->e()I

    move-result v4

    invoke-virtual {p2}, Lcrittercism/android/bq;->b()I

    move-result v5

    invoke-virtual {p2}, Lcrittercism/android/bq;->f()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcrittercism/android/br;-><init>(Ljava/io/File;Lcrittercism/android/br$a;Lcrittercism/android/ci;IILjava/lang/String;)V

    .line 62
    return-void
.end method

.method private constructor <init>(Ljava/io/File;Lcrittercism/android/br$a;Lcrittercism/android/ci;IILjava/lang/String;)V
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcrittercism/android/br;->h:Z

    .line 73
    iput-object p2, p0, Lcrittercism/android/br;->g:Lcrittercism/android/br$a;

    .line 74
    iput-object p3, p0, Lcrittercism/android/br;->c:Lcrittercism/android/ci;

    .line 75
    iput p4, p0, Lcrittercism/android/br;->f:I

    .line 76
    iput p5, p0, Lcrittercism/android/br;->e:I

    .line 77
    iput-object p6, p0, Lcrittercism/android/br;->i:Ljava/lang/String;

    .line 78
    iput-object p1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    .line 81
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 82
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z

    .line 83
    invoke-direct {p0}, Lcrittercism/android/br;->i()[Ljava/io/File;

    move-result-object v0

    array-length v0, v0

    iput v0, p0, Lcrittercism/android/br;->d:I

    .line 84
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    .line 85
    return-void
.end method

.method public static a(Lcrittercism/android/br;)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-static {v0}, Lcrittercism/android/eb;->a(Ljava/io/File;)V

    .line 98
    return-void
.end method

.method private c(Lcrittercism/android/cg;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 184
    new-instance v3, Ljava/io/File;

    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-interface {p1}, Lcrittercism/android/cg;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 185
    const/4 v2, 0x0

    .line 187
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v1

    .line 192
    :goto_0
    :try_start_1
    invoke-interface {p1, v2}, Lcrittercism/android/cg;->a(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 213
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 189
    :catch_0
    move-exception v1

    sget-object v1, Lcrittercism/android/br;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Could not open output stream to : "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->a()V

    goto :goto_0

    .line 205
    :catch_1
    move-exception v1

    .line 206
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 207
    const-string v2, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unable to close "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 196
    :catch_2
    move-exception v1

    .line 197
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 198
    const-string v4, "Crittercism"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unable to write to "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 200
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    .line 205
    :catch_3
    move-exception v1

    .line 206
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 207
    const-string v2, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unable to close "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 203
    :catchall_0
    move-exception v1

    .line 204
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 209
    throw v1

    .line 205
    :catch_4
    move-exception v1

    .line 206
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 207
    const-string v2, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unable to close "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1
.end method

.method private e()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 113
    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 114
    iput-boolean v0, p0, Lcrittercism/android/br;->h:Z

    .line 116
    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 119
    iget-object v2, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 120
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " is not a directory"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lcrittercism/android/br;->h:Z

    if-nez v1, :cond_2

    :goto_1
    return v0

    .line 122
    :cond_1
    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " does not exist"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 125
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private f()V
    .locals 2

    .prologue
    .line 218
    :cond_0
    invoke-virtual {p0}, Lcrittercism/android/br;->b()I

    move-result v0

    invoke-direct {p0}, Lcrittercism/android/br;->j()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 219
    invoke-direct {p0}, Lcrittercism/android/br;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    :cond_1
    return-void
.end method

.method private g()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 226
    iget-object v1, p0, Lcrittercism/android/br;->g:Lcrittercism/android/br$a;

    .line 228
    iget-object v1, p0, Lcrittercism/android/br;->g:Lcrittercism/android/br$a;

    if-nez v1, :cond_1

    .line 236
    :cond_0
    :goto_0
    return v0

    .line 234
    :cond_1
    iget-object v2, p0, Lcrittercism/android/br;->g:Lcrittercism/android/br$a;

    invoke-direct {p0}, Lcrittercism/android/br;->h()[Ljava/io/File;

    move-result-object v3

    const/4 v1, 0x0

    array-length v4, v3

    iget v5, v2, Lcrittercism/android/br$a;->a:I

    if-le v4, v5, :cond_2

    iget v1, v2, Lcrittercism/android/br$a;->a:I

    aget-object v1, v3, v1

    .line 236
    :cond_2
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private h()[Ljava/io/File;
    .locals 1

    .prologue
    .line 251
    invoke-direct {p0}, Lcrittercism/android/br;->i()[Ljava/io/File;

    move-result-object v0

    .line 252
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 253
    return-object v0
.end method

.method private i()[Ljava/io/File;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .line 259
    if-nez v0, :cond_0

    .line 260
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    .line 263
    :cond_0
    return-object v0
.end method

.method private declared-synchronized j()I
    .locals 1

    .prologue
    .line 271
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcrittercism/android/br;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcrittercism/android/br;
    .locals 7

    .prologue
    .line 101
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "//com.crittercism/pending/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcrittercism/android/br;->g:Lcrittercism/android/br$a;

    iget-object v3, p0, Lcrittercism/android/br;->c:Lcrittercism/android/ci;

    iget v4, p0, Lcrittercism/android/br;->f:I

    iget v5, p0, Lcrittercism/android/br;->e:I

    iget-object v6, p0, Lcrittercism/android/br;->i:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcrittercism/android/br;-><init>(Ljava/io/File;Lcrittercism/android/br$a;Lcrittercism/android/ci;IILjava/lang/String;)V

    return-object v0
.end method

.method public final declared-synchronized a()V
    .locals 3

    .prologue
    .line 240
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 248
    :cond_0
    monitor-exit p0

    return-void

    .line 244
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcrittercism/android/br;->i()[Ljava/io/File;

    move-result-object v1

    .line 245
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 246
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 240
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcrittercism/android/bs;)V
    .locals 2

    .prologue
    .line 360
    if-eqz p1, :cond_0

    .line 363
    iget-object v1, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    monitor-enter v1

    .line 364
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 365
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    :cond_0
    return-void

    .line 365
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 276
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 290
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 280
    :cond_1
    if-eqz p1, :cond_0

    .line 285
    :try_start_1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 288
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 276
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcrittercism/android/cg;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 139
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 169
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 143
    :cond_1
    :try_start_1
    iget v1, p0, Lcrittercism/android/br;->d:I

    iget v2, p0, Lcrittercism/android/br;->f:I

    if-lt v1, v2, :cond_2

    .line 144
    sget-object v1, Lcrittercism/android/br;->a:Ljava/lang/String;

    invoke-static {}, Lcrittercism/android/dx;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 148
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lcrittercism/android/br;->b()I

    move-result v1

    .line 150
    invoke-direct {p0}, Lcrittercism/android/br;->j()I

    move-result v2

    if-ne v1, v2, :cond_3

    invoke-direct {p0}, Lcrittercism/android/br;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 152
    :cond_3
    invoke-direct {p0}, Lcrittercism/android/br;->j()I

    move-result v2

    if-le v1, v2, :cond_4

    .line 153
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcrittercism/android/br;->h:Z

    goto :goto_0

    .line 158
    :cond_4
    invoke-direct {p0, p1}, Lcrittercism/android/br;->c(Lcrittercism/android/cg;)Z

    move-result v1

    .line 159
    if-eqz v1, :cond_5

    .line 160
    iget v0, p0, Lcrittercism/android/br;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcrittercism/android/br;->d:I

    .line 163
    :cond_5
    iget-object v2, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    :try_start_3
    iget-object v0, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bs;

    .line 165
    invoke-interface {v0}, Lcrittercism/android/bs;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 167
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v2

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move v0, v1

    .line 169
    goto :goto_0
.end method

.method public final declared-synchronized b()I
    .locals 1

    .prologue
    .line 267
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/br;->i()[Ljava/io/File;

    move-result-object v0

    array-length v0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Lcrittercism/android/br;)V
    .locals 7

    .prologue
    .line 294
    if-nez p1, :cond_1

    .line 333
    :cond_0
    :goto_0
    return-void

    .line 300
    :cond_1
    iget-object v0, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 304
    if-eqz v0, :cond_0

    .line 307
    if-gez v0, :cond_3

    move-object v1, p1

    move-object v2, p0

    .line 315
    :goto_1
    monitor-enter v2

    .line 316
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    :try_start_1
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p1}, Lcrittercism/android/br;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 318
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 333
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_3
    move-object v1, p0

    move-object v2, p1

    .line 312
    goto :goto_1

    .line 321
    :cond_4
    :try_start_3
    invoke-direct {p0}, Lcrittercism/android/br;->h()[Ljava/io/File;

    move-result-object v3

    .line 322
    const/4 v0, 0x0

    :goto_2
    array-length v4, v3

    if-ge v0, v4, :cond_5

    .line 323
    new-instance v4, Ljava/io/File;

    iget-object v5, p1, Lcrittercism/android/br;->b:Ljava/io/File;

    aget-object v6, v3, v0

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 324
    aget-object v5, v3, v0

    invoke-virtual {v5, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 322
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 327
    :cond_5
    invoke-direct {p1}, Lcrittercism/android/br;->f()V

    .line 329
    iget-object v0, p0, Lcrittercism/android/br;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bs;

    .line 330
    invoke-interface {v0}, Lcrittercism/android/bs;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    .line 332
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 333
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0
.end method

.method public final declared-synchronized b(Lcrittercism/android/cg;)Z
    .locals 3

    .prologue
    .line 173
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 174
    const/4 v0, 0x0

    .line 180
    :goto_0
    monitor-exit p0

    return v0

    .line 177
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcrittercism/android/br;->b:Ljava/io/File;

    invoke-interface {p1}, Lcrittercism/android/cg;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 180
    invoke-direct {p0, p1}, Lcrittercism/android/br;->c(Lcrittercism/android/cg;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 173
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()Ljava/util/List;
    .locals 5

    .prologue
    .line 337
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 339
    invoke-direct {p0}, Lcrittercism/android/br;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 350
    :cond_0
    monitor-exit p0

    return-object v0

    .line 343
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcrittercism/android/br;->c:Lcrittercism/android/ci;

    .line 345
    invoke-direct {p0}, Lcrittercism/android/br;->h()[Ljava/io/File;

    move-result-object v2

    .line 346
    const/4 v1, 0x0

    :goto_0
    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 347
    iget-object v3, p0, Lcrittercism/android/br;->c:Lcrittercism/android/ci;

    aget-object v4, v2, v1

    invoke-virtual {v3, v4}, Lcrittercism/android/ci;->a(Ljava/io/File;)Lcrittercism/android/bp;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 337
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcrittercism/android/br;->i:Ljava/lang/String;

    return-object v0
.end method

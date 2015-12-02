.class public Lcom/qihoo/security/engine/d/d;
.super Lcom/qihoo/security/engine/d/c;

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/d/d$a;
    }
.end annotation


# instance fields
.field final c:Landroid/content/Context;

.field private final d:Ljava/io/FilenameFilter;

.field private final e:Ljava/io/File;

.field private f:I

.field private final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private h:I

.field private i:I

.field private final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Landroid/media/MediaScannerConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/engine/d/c$a;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p3}, Lcom/qihoo/security/engine/d/c;-><init>(Lcom/qihoo/security/engine/d/c$a;)V

    iput v1, p0, Lcom/qihoo/security/engine/d/d;->f:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/d/d;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iput v1, p0, Lcom/qihoo/security/engine/d/d;->h:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->i:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/d/d;->j:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/qihoo/security/engine/d/d;->c:Landroid/content/Context;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object v2, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    :goto_0
    new-instance v0, Lcom/qihoo/security/engine/d/d$a;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/engine/d/d$a;-><init>(Lcom/qihoo/security/engine/d/d;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/d/d;->d:Ljava/io/FilenameFilter;

    iput-object v2, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)I
    .locals 7

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string/jumbo v0, "content://media/%s/file"

    new-array v1, v5, [Ljava/lang/Object;

    aput-object p1, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const-string/jumbo v3, "_id"

    aput-object v3, v2, v6

    const-string/jumbo v3, "_data"

    aput-object v3, v2, v5

    const/4 v3, 0x2

    const-string/jumbo v4, "_size"

    aput-object v4, v2, v3

    const-string/jumbo v3, "_data like ?"

    new-array v4, v5, [Ljava/lang/String;

    const-string/jumbo v5, "%.apk"

    aput-object v5, v4, v6

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :goto_0
    return v0

    :cond_0
    move v0, v6

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/engine/d/d;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->j:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(Ljava/io/File;)V
    .locals 3

    iget-boolean v0, p0, Lcom/qihoo/security/engine/d/d;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/d;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/d;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/d/d;->d:Ljava/io/FilenameFilter;

    invoke-virtual {p1, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_0

    array-length v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/d/d;->h:I

    iget v2, p0, Lcom/qihoo/security/engine/d/d;->i:I

    if-gt v0, v2, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/d/d;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->h:I

    const/4 v0, 0x0

    :goto_2
    array-length v2, v1

    if-lt v0, v2, :cond_4

    :cond_3
    iget v0, p0, Lcom/qihoo/security/engine/d/d;->h:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->h:I

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v1, v0

    goto :goto_1

    :cond_4
    iget-boolean v2, p0, Lcom/qihoo/security/engine/d/d;->b:Z

    if-nez v2, :cond_3

    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_7

    aget-object v2, v1, v0

    invoke-direct {p0, v2}, Lcom/qihoo/security/engine/d/d;->a(Ljava/io/File;)V

    :cond_7
    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_5

    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/qihoo/security/engine/d/d;->b(Ljava/lang/String;)V

    goto :goto_3
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/d/d;->c(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    new-instance v0, Lcom/qihoo/security/engine/FileInfo;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/qihoo/security/engine/FileInfo;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lcom/qihoo/security/engine/d/b;

    const/4 v2, 0x4

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/engine/d/b;-><init>(II)V

    iput-object v0, v1, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->a:Lcom/qihoo/security/engine/d/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/engine/d/c$a;->a(Lcom/qihoo/security/engine/d/b;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    new-instance v0, Lcom/qihoo/security/engine/FileInfo;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/qihoo/security/engine/FileInfo;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lcom/qihoo/security/engine/d/b;

    const/4 v2, 0x4

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/engine/d/b;-><init>(II)V

    iput-object v0, v1, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->a:Lcom/qihoo/security/engine/d/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/engine/d/c$a;->a(Lcom/qihoo/security/engine/d/b;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const-string/jumbo v0, "external"

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/d;->a(Ljava/lang/String;)I

    move-result v0

    const-string/jumbo v1, "internal"

    invoke-direct {p0, v1}, Lcom/qihoo/security/engine/d/d;->a(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    :goto_0
    return-void

    :cond_0
    const/16 v0, 0x64

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v0, v0

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    const v1, -0x7ff8ffa9

    const/4 v0, 0x0

    const-string/jumbo v2, "101"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1

    iput v2, p0, Lcom/qihoo/security/engine/d/d;->i:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    const-string/jumbo v2, "102"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p2}, Lcom/qihoo360/common/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    const-string/jumbo v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    iget-object v5, p0, Lcom/qihoo/security/engine/d/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/d/d;->g()V

    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->k:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/FileUtil;->getInternalAndExternalStoragePath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    return v3

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-boolean v2, p0, Lcom/qihoo/security/engine/d/d;->b:Z

    if-eqz v2, :cond_1

    :cond_1
    iput v3, p0, Lcom/qihoo/security/engine/d/d;->h:I

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/qihoo/security/engine/d/d;->a(Ljava/io/File;)V

    goto :goto_0

    :cond_2
    iput v3, p0, Lcom/qihoo/security/engine/d/d;->h:I

    iget-object v0, p0, Lcom/qihoo/security/engine/d/d;->e:Ljava/io/File;

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/d;->a(Ljava/io/File;)V

    goto :goto_1
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/d/d;->f:I

    return v0
.end method

.method public onMediaScannerConnected()V
    .locals 0

    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    return-void
.end method

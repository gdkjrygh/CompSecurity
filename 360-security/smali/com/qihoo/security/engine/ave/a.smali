.class public Lcom/qihoo/security/engine/ave/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/services/a;


# static fields
.field public static final a:[B


# instance fields
.field final b:Landroid/content/Context;

.field final c:Lcom/qihoo/security/engine/ave/b;

.field final d:Landroid/content/pm/PackageManager;

.field e:Lcom/qihoo/security/engine/ave/AveScanner;

.field f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

.field g:Lcom/qihoo/security/engine/ave/dejavu/a;

.field volatile h:I

.field final i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/qihoo/security/engine/ave/a;->a:[B

    return-void

    :array_0
    .array-data 1
        -0x24t
        0x6dt
        -0x43t
        0x6et
        0x49t
        0x68t
        0x2at
        0x57t
        -0x58t
        -0x48t
        0x28t
        -0x77t
        0x4t
        0x3bt
        -0x6dt
        -0x58t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    iput v1, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    iput v1, p0, Lcom/qihoo/security/engine/ave/a;->j:I

    iput-object p1, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    new-instance v0, Lcom/qihoo/security/engine/ave/b;

    invoke-direct {v0, p1}, Lcom/qihoo/security/engine/ave/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->d:Landroid/content/pm/PackageManager;

    return-void
.end method

.method private c(Lcom/qihoo/security/services/ScanResult;)I
    .locals 5

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/ave/AveScanner;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ave/AveScanner;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/ave/AveScanner;->open(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/engine/consts/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    if-nez v0, :cond_1

    const v0, -0x7fffbffb

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/ave/AveScanner;->scan(Lcom/qihoo/security/services/ScanResult;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v0, :cond_2

    iget v1, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-lez v1, :cond_2

    const-string/jumbo v1, "ruleid"

    const/high16 v2, 0x1610000

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    iget v3, v3, Lcom/qihoo/security/engine/ave/b;->b:I

    const v4, 0xffff

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/engine/ApkInfo;->setExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d(Lcom/qihoo/security/services/ScanResult;)I
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/ave/AveExtraScanner;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ave/AveExtraScanner;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->b()Z

    :cond_0
    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    invoke-virtual {v1, p1}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a(Lcom/qihoo/security/services/ScanResult;)I

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    iget v1, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-lez v1, :cond_1

    const/high16 v1, 0x9600000

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    iget v2, v2, Lcom/qihoo/security/engine/ave/b;->b:I

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const-string/jumbo v2, "ruleid"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/engine/ApkInfo;->setExtra(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    const v0, -0x7fffbffb

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/b;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const v0, -0x7fff0001

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(IILjava/lang/String;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x4

    if-ne p2, v2, :cond_2

    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v5, "avedb.zip"

    invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    if-ne p2, v0, :cond_c

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "v_avedb.zip"

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v5, "v_avedb.zip"

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-lez v6, :cond_7

    cmp-long v2, v4, v2

    if-ltz v2, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "ave"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_4
    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "360ave.def"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_5
    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "360info.def"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "v_avedb.zip"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "360"

    invoke-static {v0, v3, v4}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string/jumbo v4, "v_avedb.zip.timestamp"

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "v_avedb.zip.timestamp"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;Ljava/io/File;)Z

    new-instance v0, Ljava/io/File;

    const-string/jumbo v3, "vdb.cache"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "vdb.cache"

    new-instance v4, Ljava/io/File;

    const-string/jumbo v5, "vdb.cache"

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v3, v4, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move v0, v1

    goto/16 :goto_0

    :cond_7
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "avedb.zip"

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v5, "avedb.zip"

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-ltz v4, :cond_8

    move v0, v1

    goto/16 :goto_0

    :cond_8
    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v5, "ave"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_9
    new-instance v5, Ljava/io/File;

    const-string/jumbo v6, "360ave.def"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_a
    new-instance v5, Ljava/io/File;

    const-string/jumbo v6, "360info.def"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v5, "avedb.zip"

    invoke-virtual {v0, v5}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "360"

    invoke-static {v0, v5, v6}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    const-string/jumbo v5, "v_sig.db.timestamp"

    invoke-direct {v0, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v0, Ljava/io/File;

    const-string/jumbo v2, "vdb.cache"

    invoke-direct {v0, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "vdb.cache"

    new-instance v3, Ljava/io/File;

    const-string/jumbo v5, "vdb.cache"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2, v3, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move v0, v1

    goto/16 :goto_0

    :cond_c
    const/4 v2, 0x2

    if-ne p2, v2, :cond_15

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v4, "heurmod_v2.jar"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v6, "heurmod_v2.jar"

    invoke-static {v2, v6}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-ltz v2, :cond_d

    move v0, v1

    goto/16 :goto_0

    :cond_d
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v4, "ave"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_e

    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_e
    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v6, "heurmod_v2.jar"

    invoke-direct {v2, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    const-string/jumbo v4, "heurmod_v2.jar"

    invoke-direct {v6, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_f
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    invoke-static {v4, v2}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_11
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    if-eqz v4, :cond_10

    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    :cond_10
    :goto_1
    if-eqz v2, :cond_11

    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8

    :cond_11
    :goto_2
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "heurmod_v2.jar.timestamp"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "heurmod_v2.jar.timestamp"

    invoke-direct {v2, v5, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;Ljava/io/File;)Z

    new-instance v0, Ljava/io/File;

    const-string/jumbo v2, "vdb.cache"

    invoke-direct {v0, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "vdb.cache"

    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "vdb.cache"

    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2, v3, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    move-object v1, v3

    :goto_3
    if-eqz v3, :cond_12

    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :cond_12
    :goto_4
    if-eqz v1, :cond_0

    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v3

    :goto_5
    if-eqz v4, :cond_13

    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    :cond_13
    :goto_6
    if-eqz v3, :cond_14

    :try_start_8
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    :cond_14
    :goto_7
    throw v0

    :cond_15
    const/4 v2, 0x3

    if-ne p2, v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v4, "v_sig.db"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v6, "v_sig.db"

    invoke-static {v2, v6}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-ltz v2, :cond_16

    move v0, v1

    goto/16 :goto_0

    :cond_16
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v4, "ave"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_17

    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_17
    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string/jumbo v6, "v_sig.db"

    invoke-direct {v2, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    const-string/jumbo v4, "v_sig.db"

    invoke-direct {v6, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_18
    :try_start_9
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_e
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    invoke-static {v4, v2}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_f
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    if-eqz v4, :cond_19

    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    :cond_19
    :goto_8
    if-eqz v2, :cond_1a

    :try_start_d
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    :cond_1a
    :goto_9
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "v_sig.db.timestamp"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "v_sig.db.timestamp"

    invoke-direct {v2, v5, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;Ljava/io/File;)Z

    new-instance v0, Ljava/io/File;

    const-string/jumbo v2, "vdb.cache"

    invoke-direct {v0, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "vdb.cache"

    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "vdb.cache"

    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v2, v3, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move v0, v1

    goto/16 :goto_0

    :catch_2
    move-exception v1

    move-object v1, v3

    :goto_a
    if-eqz v1, :cond_1b

    :try_start_e
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9

    :cond_1b
    :goto_b
    if-eqz v3, :cond_0

    :try_start_f
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    goto/16 :goto_0

    :catch_3
    move-exception v1

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    move-object v4, v3

    :goto_c
    if-eqz v4, :cond_1c

    :try_start_10
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_a

    :cond_1c
    :goto_d
    if-eqz v3, :cond_1d

    :try_start_11
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    :cond_1d
    :goto_e
    throw v0

    :catch_4
    move-exception v2

    goto/16 :goto_4

    :catch_5
    move-exception v1

    goto/16 :goto_6

    :catch_6
    move-exception v1

    goto/16 :goto_7

    :catch_7
    move-exception v0

    goto/16 :goto_1

    :catch_8
    move-exception v0

    goto/16 :goto_2

    :catch_9
    move-exception v1

    goto :goto_b

    :catch_a
    move-exception v1

    goto :goto_d

    :catch_b
    move-exception v1

    goto :goto_e

    :catch_c
    move-exception v0

    goto :goto_8

    :catch_d
    move-exception v0

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_c

    :catchall_3
    move-exception v0

    move-object v3, v2

    goto :goto_c

    :catch_e
    move-exception v1

    move-object v1, v4

    goto :goto_a

    :catch_f
    move-exception v1

    move-object v3, v2

    move-object v1, v4

    goto :goto_a

    :catchall_4
    move-exception v0

    goto/16 :goto_5

    :catchall_5
    move-exception v0

    move-object v3, v2

    goto/16 :goto_5

    :catch_10
    move-exception v1

    move-object v1, v3

    move-object v3, v4

    goto/16 :goto_3

    :catch_11
    move-exception v1

    move-object v1, v2

    move-object v3, v4

    goto/16 :goto_3
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v2, 0x7

    iput v2, p2, Lcom/qihoo/security/services/ScanResult;->state:I

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v3, p2}, Lcom/qihoo/security/engine/ave/b;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, p2}, Lcom/qihoo/security/engine/ave/a;->b(Lcom/qihoo/security/services/ScanResult;)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v3, v4, p2}, Lcom/qihoo/security/engine/ave/dejavu/a;->a(Landroid/content/Context;Lcom/qihoo/security/services/ScanResult;)I

    move-result v3

    if-lez v3, :cond_5

    const-string/jumbo v3, "ruleid"

    const/high16 v4, 0x1620000

    iget-object v5, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    iget v5, v5, Lcom/qihoo/security/engine/ave/b;->b:I

    const v6, 0xffff

    and-int/2addr v5, v6

    or-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/engine/ApkInfo;->setExtra(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iget v3, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-ltz v3, :cond_4

    iget-boolean v3, v2, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    iget-object v4, v2, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0, p2}, Lcom/qihoo/security/engine/ave/a;->b(Lcom/qihoo/security/services/ScanResult;)V

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v3, p2}, Lcom/qihoo/security/engine/ave/b;->c(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;Lcom/qihoo/security/services/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized a(ILjava/util/List;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v9, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch v0, :pswitch_data_0

    const v0, -0x7fff0001

    :goto_0
    monitor-exit p0

    return v0

    :pswitch_0
    move v0, v2

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    :try_start_1
    iput v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget v3, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    if-eq v3, v9, :cond_1

    iget-object v3, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v5, v3, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    iget-object v6, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-virtual {v3, v6, v0}, Lcom/qihoo/security/engine/ave/dejavu/a;->b(Landroid/content/Context;Lcom/qihoo/security/services/ScanResult;)I

    move-result v3

    if-lez v3, :cond_5

    if-eqz v5, :cond_3

    const-string/jumbo v3, "ruleid"

    const/high16 v6, 0x1630000

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    iget v7, v7, Lcom/qihoo/security/engine/ave/b;->b:I

    const v8, 0xffff

    and-int/2addr v7, v8

    or-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lcom/qihoo/security/engine/ApkInfo;->setExtra(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    if-eqz v5, :cond_4

    iget-boolean v3, v5, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    iget-object v5, v5, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget v3, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    if-eq v3, v9, :cond_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/engine/ave/a;->b(Lcom/qihoo/security/services/ScanResult;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    sget-boolean v3, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ave/a;->c(Lcom/qihoo/security/services/ScanResult;)I

    move-result v6

    if-nez v6, :cond_6

    iget-object v6, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v6, v6, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v6, v6, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-lt v6, v2, :cond_6

    const/4 v7, 0x4

    if-gt v6, v7, :cond_6

    move v3, v1

    :cond_6
    if-eqz v3, :cond_7

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ave/a;->d(Lcom/qihoo/security/services/ScanResult;)I

    :cond_7
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/qihoo/security/engine/ApkInfo;->closeClassesDex()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public a(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/b;->c()V

    const/4 v0, 0x0

    return v0
.end method

.method public b(ILcom/qihoo/security/services/ScanResult;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method b(Lcom/qihoo/security/services/ScanResult;)V
    .locals 4

    const/16 v3, 0x64

    const/16 v2, 0x46

    const/16 v1, 0x32

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v0, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/16 v1, 0x28

    iput v1, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    :cond_2
    :goto_1
    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const-string/jumbo v1, "ruleid"

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/ApkInfo;->getExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/services/ScanResult;->ruleid:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x0

    iput v0, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/16 v1, 0xa

    iput v1, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x2bc

    iput v0, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v2, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x320

    iput v0, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v2, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    :pswitch_3
    iput v3, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    :pswitch_4
    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_2

    iput v3, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    :pswitch_5
    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x65

    iput v0, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, v0, Lcom/qihoo/security/engine/FileInfo;->level:I

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public c(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, -0x7fffbffb

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    if-nez v0, :cond_1

    new-instance v0, Lcom/qihoo/security/engine/ave/dejavu/a;

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/ave/dejavu/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->g:Lcom/qihoo/security/engine/ave/dejavu/a;

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/b;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const v0, -0x7fff0001

    goto :goto_0
.end method

.method public declared-synchronized d(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/AveScanner;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->e:Lcom/qihoo/security/engine/ave/AveScanner;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/ave/a;->f:Lcom/qihoo/security/engine/ave/AveExtraScanner;

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/qihoo/security/engine/ave/a;->d(I)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/engine/consts/a;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo/security/engine/ave/a;->c(I)I

    move-result v0

    goto :goto_0
.end method

.method public f(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    const/4 v0, 0x0

    return v0
.end method

.method public g(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->c:Lcom/qihoo/security/engine/ave/b;

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/qihoo/security/engine/ave/a;->h:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "AVE"

    return-object v0
.end method

.method public j(I)Landroid/os/IBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

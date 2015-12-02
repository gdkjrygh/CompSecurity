.class public Lcom/qihoo/security/engine/f/a;
.super Lcom/qihoo/security/services/a$a;

# interfaces
.implements Lcom/qihoo/security/services/a;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field volatile a:I

.field private final c:Landroid/content/Context;

.field private d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

.field private e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

.field private f:Z

.field private g:Z

.field private h:I

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/qihoo/security/engine/f/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/f/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/qihoo/security/services/a$a;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iput-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iput v0, p0, Lcom/qihoo/security/engine/f/a;->a:I

    iput-boolean v0, p0, Lcom/qihoo/security/engine/f/a;->f:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/f/a;->g:Z

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/qihoo/security/engine/f/a;->h:I

    iput-object v1, p0, Lcom/qihoo/security/engine/f/a;->i:Ljava/lang/String;

    iput-object p1, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public a(IILjava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v8, 0x1

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-wide v2, v1, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    const-wide/16 v4, 0x1

    or-long/2addr v2, v4

    iput-wide v2, v1, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    new-array v2, v8, [Lcom/qihoo/security/engine/cloudscan/QueryItem;

    new-instance v3, Lcom/qihoo/security/engine/cloudscan/QueryItem;

    iget-object v4, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const-wide/16 v6, 0x0

    invoke-direct {v3, v4, v8, v6, v7}, Lcom/qihoo/security/engine/cloudscan/QueryItem;-><init>(Lcom/qihoo/security/engine/FileInfo;IJ)V

    aput-object v3, v2, v0

    invoke-virtual {v1, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;)I

    move-result v1

    if-ne v1, v8, :cond_0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbffb

    goto :goto_0
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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-eqz v0, :cond_0

    const-string/jumbo v0, "2"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0, p2, p3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    const-string/jumbo v0, "nq"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo v0, "1"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/f/a;->g:Z

    :cond_1
    :goto_1
    const-string/jumbo v0, "nqto"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p3}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/f/a;->h:I

    :cond_2
    return v1

    :cond_3
    const-string/jumbo v0, "11"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0, p2, p3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iput-boolean v1, p0, Lcom/qihoo/security/engine/f/a;->g:Z

    goto :goto_1
.end method

.method public a(ILjava/util/List;)I
    .locals 16
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

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/qihoo/security/engine/f/a;->g:Z

    if-eqz v2, :cond_8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-nez v2, :cond_0

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-direct {v2, v4}, Lcom/qihoo/security/engine/cloudscan/NetQuery;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    :cond_0
    const/4 v2, 0x0

    move v5, v2

    :goto_0
    if-gtz v3, :cond_1

    const/4 v2, 0x0

    :goto_1
    return v2

    :cond_1
    const/16 v2, 0x14

    if-le v3, v2, :cond_4

    const/16 v2, 0x14

    :goto_2
    new-array v6, v2, [Lcom/qihoo/security/engine/cloudscan/QueryItem;

    const/4 v2, 0x0

    move v4, v2

    :goto_3
    const/16 v2, 0x14

    if-ge v4, v2, :cond_2

    if-lt v4, v3, :cond_5

    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    move-object/from16 v0, p0

    iget v4, v0, Lcom/qihoo/security/engine/f/a;->h:I

    invoke-virtual {v2, v6, v4}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;I)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    array-length v4, v6

    const/4 v2, 0x0

    :goto_4
    if-lt v2, v4, :cond_6

    :cond_3
    add-int/lit8 v2, v5, 0x1

    add-int/lit8 v3, v3, -0x14

    move v5, v2

    goto :goto_0

    :cond_4
    move v2, v3

    goto :goto_2

    :cond_5
    new-instance v7, Lcom/qihoo/security/engine/cloudscan/QueryItem;

    mul-int/lit8 v2, v5, 0x14

    add-int/2addr v2, v4

    move-object/from16 v0, p2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/services/ScanResult;

    iget-object v2, v2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/4 v8, 0x1

    const-wide/16 v10, 0x1

    invoke-direct {v7, v2, v8, v10, v11}, Lcom/qihoo/security/engine/cloudscan/QueryItem;-><init>(Lcom/qihoo/security/engine/FileInfo;IJ)V

    aput-object v7, v6, v4

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_3

    :cond_6
    aget-object v7, v6, v2

    iget-object v8, v7, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v8, v8, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    if-eqz v8, :cond_7

    iget-object v7, v7, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v7, v7, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    array-length v7, v7

    if-lez v7, :cond_7

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    new-array v4, v3, [Ljava/lang/String;

    new-array v5, v3, [J

    new-array v6, v3, [J

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v3, v2, :cond_a

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v2, v4, v5, v6}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->QueryPrivacy([Ljava/lang/String;[J[J)I

    move-result v2

    if-lez v2, :cond_9

    const/4 v2, 0x0

    move v3, v2

    :goto_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v3, v2, :cond_b

    :cond_9
    const/4 v2, 0x0

    goto :goto_1

    :cond_a
    move-object/from16 v0, p2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/services/ScanResult;

    iget-object v2, v2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    aput-object v2, v4, v3

    const-wide v8, 0x7fffffffffffffffL

    aput-wide v8, v5, v3

    const-wide v8, 0x7fffffffffffffffL

    aput-wide v8, v6, v3

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_5

    :cond_b
    aget-wide v8, v5, v3

    const-wide/16 v10, 0x0

    cmp-long v2, v8, v10

    if-nez v2, :cond_c

    aget-wide v8, v6, v3

    const-wide/16 v10, 0x0

    cmp-long v2, v8, v10

    if-nez v2, :cond_c

    :goto_7
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_6

    :cond_c
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    aget-wide v8, v5, v3

    aget-wide v10, v6, v3

    const/4 v2, 0x0

    :goto_8
    const/16 v7, 0x20

    if-lt v2, v7, :cond_d

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v7, v2, [Lcom/qihoo/security/engine/HipsActionRevise;

    move-object/from16 v0, p2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/services/ScanResult;

    iget-object v8, v2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, v8, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    goto :goto_7

    :cond_d
    const/4 v7, 0x1

    shl-int/2addr v7, v2

    int-to-long v12, v7

    and-long/2addr v12, v8

    const-wide/16 v14, 0x0

    cmp-long v7, v12, v14

    if-eqz v7, :cond_f

    new-instance v7, Lcom/qihoo/security/engine/HipsActionRevise;

    invoke-direct {v7}, Lcom/qihoo/security/engine/HipsActionRevise;-><init>()V

    iput v2, v7, Lcom/qihoo/security/engine/HipsActionRevise;->value:I

    const/4 v12, 0x1

    iput v12, v7, Lcom/qihoo/security/engine/HipsActionRevise;->level:I

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_f
    const/4 v7, 0x1

    shl-int/2addr v7, v2

    int-to-long v12, v7

    and-long/2addr v12, v10

    const-wide/16 v14, 0x0

    cmp-long v7, v12, v14

    if-eqz v7, :cond_e

    new-instance v7, Lcom/qihoo/security/engine/HipsActionRevise;

    invoke-direct {v7}, Lcom/qihoo/security/engine/HipsActionRevise;-><init>()V

    iput v2, v7, Lcom/qihoo/security/engine/HipsActionRevise;->value:I

    const/4 v12, 0x2

    iput v12, v7, Lcom/qihoo/security/engine/HipsActionRevise;->level:I

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9
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

.method public b(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

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

.method public c(I)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    const-string/jumbo v2, "cloud.cache"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/engine/f/a;->i:Ljava/lang/String;

    iget v1, p0, Lcom/qihoo/security/engine/f/a;->a:I

    if-eqz v1, :cond_1

    const v0, -0x7fff0001

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/common/utils/SysInfo;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string/jumbo v2, "0"

    invoke-static {v2, v1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-nez v2, :cond_3

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v2, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->i:Ljava/lang/String;

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Create(Ljava/lang/String;J)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    const-string/jumbo v3, "privacy.sign"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    const-string/jumbo v4, "privacy.sign"

    invoke-static {v3, v4}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    const-string/jumbo v6, "privacy.sign"

    invoke-static {v3, v6}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-lez v3, :cond_2

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    const-string/jumbo v4, "privacy.sign"

    const/4 v5, 0x1

    invoke-static {v3, v4, v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    :cond_2
    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->ImportPrivacyData(Ljava/lang/String;I)I

    move-result v2

    sget v3, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_OK:I

    if-gt v2, v3, :cond_3

    :cond_3
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-nez v2, :cond_0

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iget-object v2, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v3, "1"

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "5"

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "6"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "7"

    sget-object v3, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "8"

    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v4, "||"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "10"

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "9"

    iget-object v3, p0, Lcom/qihoo/security/engine/f/a;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/common/e/b;->c(Landroid/content/Context;)B

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "205"

    const-string/jumbo v3, "0"

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    const-string/jumbo v2, "0"

    const-string/jumbo v3, "0123456789"

    invoke-static {v2, v3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    goto/16 :goto_1

    :cond_5
    const v0, -0x7fffbffb

    goto/16 :goto_2

    :catch_0
    move-exception v1

    iget-object v1, p0, Lcom/qihoo/security/engine/f/a;->e:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v2, "10"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_3
.end method

.method public d(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/qihoo/security/engine/f/a;->f:Z

    iput-object v2, p0, Lcom/qihoo/security/engine/f/a;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Destroy()Z

    iput-object v2, p0, Lcom/qihoo/security/engine/f/a;->d:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    :cond_0
    return v1
.end method

.method public e(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/qihoo/security/engine/f/a;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/f/a;->a:I

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/engine/f/a;->a:I

    const/4 v0, 0x0

    return v0
.end method

.method public g(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public h(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/qihoo/security/engine/f/a;->a:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "Hips"

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

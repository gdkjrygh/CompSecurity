.class public Lcom/qihoo/security/engine/cloudscan/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/services/a;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field volatile a:I

.field final b:Landroid/content/Context;

.field private final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/Long;",
            "Lcom/qihoo/security/engine/cloudscan/NetQuery;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

.field private g:Ljava/lang/String;

.field private h:I

.field private final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x183

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->d:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->e:Ljava/util/HashMap;

    iput-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iput-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    iput v1, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    iput v1, p0, Lcom/qihoo/security/engine/cloudscan/a;->h:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v0, 0x1388

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->j:I

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    return-void
.end method

.method private a(Lcom/qihoo/security/engine/cloudscan/QueryItem;Lcom/qihoo/security/services/ScanResult;)I
    .locals 8

    const/16 v7, 0x31

    const/4 v0, 0x1

    const/4 v6, -0x1

    const/4 v1, 0x0

    const/high16 v4, 0x2000000

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x46

    if-lt v2, v3, :cond_2

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x4f

    if-gt v2, v3, :cond_2

    const/16 v0, 0x320

    iput v0, p2, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v4, p2, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const-string/jumbo v2, "Trojan.Generic"

    iput-object v2, v0, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    :cond_0
    :goto_0
    move v0, v1

    :cond_1
    :goto_1
    return v0

    :cond_2
    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x3c

    if-lt v2, v3, :cond_3

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x45

    if-gt v2, v3, :cond_3

    const/16 v0, 0x2bc

    iput v0, p2, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v4, p2, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x32

    if-lt v2, v3, :cond_4

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x3b

    if-gt v2, v3, :cond_4

    const/16 v0, 0x64

    iput v0, p2, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v4, p2, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    goto :goto_0

    :cond_4
    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0xa

    if-lt v2, v3, :cond_6

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v3, 0x1d

    if-gt v2, v3, :cond_6

    sget-boolean v2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v2, :cond_5

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v2, :cond_5

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-gtz v2, :cond_1

    :cond_5
    iput v1, p2, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v4, p2, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    goto :goto_0

    :cond_6
    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-wide v2, v2, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    const-wide/16 v4, 0x1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_7

    iget-object v0, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    move v0, v1

    goto/16 :goto_1

    :cond_7
    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-boolean v2, v2, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    iput-boolean v2, v1, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    iget-object v1, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget v1, v1, Lcom/qihoo/security/engine/FileInfo;->level:I

    const/16 v2, 0x28

    if-lt v1, v2, :cond_8

    if-gt v1, v7, :cond_8

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget v2, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    if-ne v2, v6, :cond_8

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, v2, Lcom/qihoo/security/engine/FileInfo;->level:I

    :cond_8
    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    if-gt v1, v7, :cond_1

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget v1, v1, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    if-ne v1, v6, :cond_9

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/16 v2, 0x64

    iput v2, v1, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    :cond_9
    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->hipsActionDescription:Ljava/lang/String;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->hipsActionDescription:Ljava/lang/String;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeDescription:Ljava/lang/String;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeDescription:Ljava/lang/String;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iget-object v1, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;

    goto/16 :goto_1
.end method

.method private a(Lcom/qihoo/security/engine/cloudscan/QueryItem;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/engine/cloudscan/QueryItem;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-object v2, p1, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iget-object v3, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v3, v3, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    if-ne v2, v3, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/engine/cloudscan/a;->a(Lcom/qihoo/security/engine/cloudscan/QueryItem;Lcom/qihoo/security/services/ScanResult;)I

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/services/ScanResult;)I
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    const v0, -0x7fffbffb

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    new-array v1, v7, [Lcom/qihoo/security/engine/cloudscan/QueryItem;

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/QueryItem;

    iget-object v3, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v3}, Lcom/qihoo/security/engine/FileInfo;->clone()Lcom/qihoo/security/engine/FileInfo;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-direct {v2, v3, v7, v4, v5}, Lcom/qihoo/security/engine/cloudscan/QueryItem;-><init>(Lcom/qihoo/security/engine/FileInfo;IJ)V

    aput-object v2, v1, v6

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;)I

    move-result v2

    if-lez v2, :cond_0

    aget-object v0, v1, v6

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/cloudscan/a;->a(Lcom/qihoo/security/engine/cloudscan/QueryItem;Lcom/qihoo/security/services/ScanResult;)I

    move-result v0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->j:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "cloudscan-jni-1.0.5.2002"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    const/4 v0, 0x0

    return v0
.end method

.method public a(IILjava/lang/String;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "cswtb.dat"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/SysInfo;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "0123456789"

    :cond_0
    const-string/jumbo v2, "0"

    invoke-static {v2, v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "cloud.cache"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v2, v4, v5}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Create(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Revoke(Ljava/lang/String;)I

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Destroy()Z

    const/4 v0, 0x0

    :cond_1
    return v0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p2, Lcom/qihoo/security/services/ScanResult;->state:I

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-nez v1, :cond_1

    const v0, -0x7fffbffc

    :cond_0
    :goto_0
    return v0

    :cond_1
    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-nez v1, :cond_0

    invoke-direct {p0, p2}, Lcom/qihoo/security/engine/cloudscan/a;->b(Lcom/qihoo/security/services/ScanResult;)I

    move-result v0

    goto :goto_0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;Lcom/qihoo/security/services/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "11"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/qihoo/security/env/QVSEnv$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "5000"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    invoke-direct {p0, p3}, Lcom/qihoo/security/engine/cloudscan/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public a(ILjava/util/List;)I
    .locals 11
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

    const/4 v10, 0x3

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    packed-switch v0, :pswitch_data_0

    const v3, -0x7fff0001

    :goto_0
    return v3

    :pswitch_0
    move v3, v4

    goto :goto_0

    :pswitch_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const v3, -0x7ff8ffa9

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-nez v1, :cond_1

    if-lt v0, v10, :cond_1

    const v3, -0x7fffbffc

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-nez v0, :cond_9

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string/jumbo v0, "202"

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->e:Ljava/util/HashMap;

    const-string/jumbo v1, "210"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    const-string/jumbo v0, "210"

    sget-object v1, Lcom/qihoo/security/engine/cloudscan/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_3
    move-object v1, v2

    :goto_2
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    const-string/jumbo v0, "9"

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/common/e/b;->c(Landroid/content/Context;)B

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [Lcom/qihoo/security/engine/cloudscan/QueryItem;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->j:I

    invoke-virtual {v1, v5, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;I)I

    move-result v0

    if-ltz v0, :cond_8

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    array-length v1, v5

    move v0, v3

    :goto_4
    if-lt v0, v1, :cond_7

    :cond_4
    iput v4, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    goto/16 :goto_0

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    new-instance v7, Lcom/qihoo/security/engine/cloudscan/QueryItem;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/FileInfo;->clone()Lcom/qihoo/security/engine/FileInfo;

    move-result-object v0

    const-wide/16 v8, 0x0

    invoke-direct {v7, v0, v4, v8, v9}, Lcom/qihoo/security/engine/cloudscan/QueryItem;-><init>(Lcom/qihoo/security/engine/FileInfo;IJ)V

    aput-object v7, v5, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_7
    aget-object v2, v5, v0

    iget v6, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    if-eq v6, v10, :cond_4

    invoke-direct {p0, v2, p2}, Lcom/qihoo/security/engine/cloudscan/a;->a(Lcom/qihoo/security/engine/cloudscan/QueryItem;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iput v4, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    const v3, -0x7fffbffb

    goto/16 :goto_0

    :cond_9
    move-object v1, v0

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

    const/4 v0, 0x0

    return v0
.end method

.method public c(I)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    const-string/jumbo v3, "cloud.cache"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    if-nez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/common/utils/SysInfo;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string/jumbo v3, "0"

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :goto_1
    invoke-static {}, Lcom/qihoo360/common/utils/SysInfo;->getCPUSerial()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string/jumbo v3, "1"

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/common/utils/SysInfo;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string/jumbo v3, "3"

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :cond_2
    invoke-static {}, Lcom/qihoo360/common/utils/SysInfo;->getSerial()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string/jumbo v3, "2"

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :cond_3
    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/common/utils/SysInfo;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string/jumbo v3, "4"

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :cond_4
    new-instance v2, Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/a;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/a;->g:Ljava/lang/String;

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Create(Ljava/lang/String;J)Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    :goto_2
    move v0, v1

    goto :goto_0

    :cond_5
    const-string/jumbo v2, "0"

    const-string/jumbo v3, "0123456789"

    invoke-static {v2, v3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    goto :goto_1

    :cond_6
    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    goto :goto_2
.end method

.method public d(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iput v2, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    return v2

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Destroy()Z

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method

.method public e(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return v2
.end method

.method public f(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Cancel()I

    goto :goto_0
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

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a;->a:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "CloudScan"

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

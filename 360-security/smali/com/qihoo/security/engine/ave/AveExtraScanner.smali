.class public Lcom/qihoo/security/engine/ave/AveExtraScanner;
.super Ljava/lang/Object;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string/jumbo v0, "qvmwrapper-1.0.2"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    return-void
.end method

.method private a([BLcom/qihoo/security/services/ScanResult;)I
    .locals 5

    const/4 v0, 0x1

    array-length v1, p1

    if-le v1, v0, :cond_3

    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    move-result v3

    iput v3, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v3, 0x5

    iput v3, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    :cond_0
    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    iput v3, v2, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    if-lez v2, :cond_1

    new-array v2, v2, [B

    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->read([B)I

    iget-object v3, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    iput-object v4, v3, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    :cond_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    if-lez v2, :cond_2

    new-array v2, v2, [B

    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->read([B)I

    iget-object v3, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    iput-object v4, v3, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_2
    throw v0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_2
.end method

.method private native nt1(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method private native nt2(I)I
.end method

.method private native nt3(IIIII)I
.end method

.method private native nt4(ILjava/lang/String;[I)[B
.end method

.method private native nt5(I[I)[B
.end method


# virtual methods
.method public a(Lcom/qihoo/security/services/ScanResult;)I
    .locals 7

    const/4 v3, 0x1

    const/4 v0, 0x0

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    new-array v6, v3, [I

    invoke-virtual {p0, v1, v6}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a(Ljava/lang/String;[I)[B

    move-result-object v1

    move v4, v0

    move-object v2, v1

    move v1, v0

    :goto_0
    if-eqz v2, :cond_0

    const/16 v5, 0xa

    if-lt v4, v5, :cond_1

    :cond_0
    if-ltz v1, :cond_4

    :goto_1
    return v0

    :cond_1
    invoke-direct {p0, v2, p1}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a([BLcom/qihoo/security/services/ScanResult;)I

    move-result v1

    if-lez v1, :cond_3

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    const/4 v5, 0x5

    if-ne v2, v5, :cond_3

    move v2, v3

    :goto_2
    if-eqz v1, :cond_2

    if-eqz v2, :cond_0

    :cond_2
    invoke-virtual {p0, v6}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a([I)[B

    move-result-object v5

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v2, v5

    goto :goto_0

    :cond_3
    move v2, v0

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method public a()V
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->nt2(I)I

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;)Z
    .locals 3

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const-string/jumbo v0, "ave"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_1

    const-string/jumbo v0, "ave_e"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_1

    :goto_1
    const-string/jumbo v1, "360avm-2.1.0.3007"

    invoke-static {p1, v1}, Lcom/qihoo360/common/utils/NativeLoader;->getLibraryPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->nt1(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;[I)[B
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, -0x1

    aput v1, p2, v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->nt4(ILjava/lang/String;[I)[B

    move-result-object v0

    goto :goto_0
.end method

.method public a([I)[B
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, -0x1

    aput v1, p1, v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->nt5(I[I)[B

    move-result-object v0

    goto :goto_0
.end method

.method public b()Z
    .locals 6

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/qihoo/security/engine/ave/AveExtraScanner;->a:I

    const/4 v3, 0x2

    const/high16 v4, 0x800000

    const/16 v5, 0xa

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/engine/ave/AveExtraScanner;->nt3(IIIII)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

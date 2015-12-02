.class public Lcom/qihoo/security/engine/ave/AveScanner;
.super Ljava/lang/Object;


# static fields
.field public static final AVE_DB_ZIP:Ljava/lang/String; = "avedb.zip"

.field public static final AVE_DB_ZIP_T:Ljava/lang/String; = "avedb_e.zip"

.field public static final AVE_DB_ZIP_V:Ljava/lang/String; = "v_avedb.zip"

.field public static final AVE_DYNMOD:Ljava/lang/String; = "heurmod_v2.jar"

.field public static final AVE_PATH:Ljava/lang/String; = "ave"

.field public static final AVE_PATH_T:Ljava/lang/String; = "ave_e"

.field public static final AVE_SIGDB:Ljava/lang/String; = "v_sig.db"

.field public static final F_OK:I = 0x0

.field public static final LIBAVE:Ljava/lang/String; = "360avm-2.1.0.3007"

.field public static final R_OK:I = 0x4

.field private static final TAG:Ljava/lang/String; = "AveScanner"

.field public static final TYPE_APK:I = 0x1

.field public static final TYPE_DEX:I = 0x3

.field public static final TYPE_ELF:I = 0x2

.field public static final W_OK:I = 0x2

.field public static final X_OK:I = 0x1


# instance fields
.field private final e:J

.field private final h:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lcom/qihoo/security/engine/ave/AveScanner;->e:J

    iput-wide v0, p0, Lcom/qihoo/security/engine/ave/AveScanner;->h:J

    return-void
.end method

.method private native Create(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native access(Ljava/lang/String;I)I
.end method

.method public static native chmod(Ljava/lang/String;I)I
.end method

.method private parseResult([BLcom/qihoo/security/services/ScanResult;)I
    .locals 4

    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    new-instance v1, Ljava/io/DataInputStream;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    move-result v2

    iput v2, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v0, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x5

    iput v2, v0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    :cond_0
    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    iput v2, v0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readShort()S

    move-result v0

    if-lez v0, :cond_1

    new-array v0, v0, [B

    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->read([B)I

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v3, v2, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    :cond_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readShort()S

    move-result v0

    if-lez v0, :cond_2

    new-array v0, v0, [B

    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->read([B)I

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v3, v2, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    :cond_3
    :goto_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    return v0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_1
    throw v0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_0
.end method

.method private native scanFile(Ljava/lang/String;I)[B
.end method

.method private native scanPackage(Ljava/lang/String;JJ)[B
.end method

.method private native scanPackage(Ljava/lang/String;Ljava/lang/String;)[B
.end method


# virtual methods
.method public native close()V
.end method

.method public open(Landroid/content/Context;)I
    .locals 3

    const-string/jumbo v0, "ave"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_0

    const-string/jumbo v0, "ave_e"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_0

    :goto_0
    const-string/jumbo v1, "360avm-2.1.0.3007"

    invoke-static {p1, v1}, Lcom/qihoo360/common/utils/NativeLoader;->getLibraryPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/engine/ave/AveScanner;->Create(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public scan(Lcom/qihoo/security/services/ScanResult;)I
    .locals 6

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/ApkInfo;->openClassesDex(Z)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v0

    iget-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iget-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    iget-wide v4, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/engine/ave/AveScanner;->scanPackage(Ljava/lang/String;JJ)[B

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/ave/AveScanner;->parseResult([BLcom/qihoo/security/services/ScanResult;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iget-object v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/engine/ave/AveScanner;->scanPackage(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/ave/AveScanner;->parseResult([BLcom/qihoo/security/services/ScanResult;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

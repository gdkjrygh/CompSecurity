.class public Lcom/qihoo/security/engine/a/f;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo/security/engine/a/c;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/qihoo/security/engine/a/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/a/f;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a/f;->d:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/a/f;->b:Landroid/content/Context;

    new-instance v0, Lcom/qihoo/security/engine/a/c;

    invoke-direct {v0, p1}, Lcom/qihoo/security/engine/a/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/a/f;->c:Lcom/qihoo/security/engine/a/c;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0, p1}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {p0, p1}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :cond_1
    :goto_1
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private a(Lcom/qihoo/security/engine/a/e;Landroid/content/pm/PackageManager;Lcom/qihoo/security/engine/ClassesDexInfo;Ljava/lang/String;)V
    .locals 23

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string/jumbo v4, "android.permission.INTERNET"

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-virtual {v0, v4, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    const/4 v7, -0x1

    if-ne v4, v7, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/qihoo/security/engine/a/f;->c:Lcom/qihoo/security/engine/a/c;

    invoke-virtual {v4}, Lcom/qihoo/security/engine/a/c;->a()[Lcom/qihoo/security/engine/a/b;

    move-result-object v12

    const/4 v4, 0x0

    :try_start_0
    move-object/from16 v0, p3

    iget-object v7, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    new-instance v7, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;

    move-object/from16 v0, p3

    iget-object v8, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-direct {v7, v8}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    :try_start_1
    array-length v13, v12

    const/4 v4, 0x0

    move v11, v4

    :goto_2
    if-lt v11, v13, :cond_b

    :cond_2
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/qihoo/security/engine/a/e;->a(I)V

    if-eqz v6, :cond_8

    const/4 v4, 0x1

    invoke-static {v6, v4}, Lcom/qihoo/security/engine/a/b;->a(II)Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, 0x0

    const-string/jumbo v5, "android.permission.READ_PHONE_STATE"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string/jumbo v5, "getLine1Number"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v7, v5, v8, v9}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->find(Ljava/lang/String;II)I

    move-result v5

    const/4 v8, -0x1

    if-eq v5, v8, :cond_3

    const/4 v4, 0x1

    :cond_3
    if-nez v4, :cond_17

    and-int/lit8 v6, v6, -0x2

    move v4, v6

    :goto_3
    const/4 v5, 0x2

    invoke-static {v4, v5}, Lcom/qihoo/security/engine/a/b;->a(II)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string/jumbo v5, "android.permission.CALL_PHONE"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_4

    and-int/lit8 v4, v4, -0x3

    :cond_4
    const/4 v5, 0x4

    invoke-static {v4, v5}, Lcom/qihoo/security/engine/a/b;->a(II)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string/jumbo v5, "android.permission.SEND_SMS"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_5

    and-int/lit8 v4, v4, -0x5

    :cond_5
    const/16 v5, 0x8

    invoke-static {v4, v5}, Lcom/qihoo/security/engine/a/b;->a(II)Z

    move-result v5

    if-eqz v5, :cond_6

    const-string/jumbo v5, "android.permission.READ_SMS"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_6

    const-string/jumbo v5, "android.permission.WRITE_SMS"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_6

    and-int/lit8 v4, v4, -0x9

    :cond_6
    const/16 v5, 0x10

    invoke-static {v4, v5}, Lcom/qihoo/security/engine/a/b;->a(II)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string/jumbo v5, "android.permission.READ_CONTACTS"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string/jumbo v5, "android.permission.WRITE_CONTACTS"

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z

    move-result v5

    if-nez v5, :cond_7

    and-int/lit8 v4, v4, -0x11

    :cond_7
    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Lcom/qihoo/security/engine/a/e;->b(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_8
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->close()V

    goto/16 :goto_0

    :cond_9
    :try_start_2
    move-object/from16 v0, p3

    iget-wide v8, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    const-wide/16 v10, 0x0

    cmp-long v7, v8, v10

    if-eqz v7, :cond_a

    new-instance v7, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;

    move-object/from16 v0, p3

    iget-wide v8, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    move-object/from16 v0, p3

    iget-wide v10, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    invoke-direct {v7, v8, v9, v10, v11}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;-><init>(JJ)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    :catch_0
    move-exception v5

    :goto_4
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->close()V

    goto/16 :goto_0

    :cond_a
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->close()V

    goto/16 :goto_0

    :cond_b
    :try_start_3
    aget-object v14, v12, v11

    iget-object v4, v14, Lcom/qihoo/security/engine/a/b;->a:Lcom/qihoo/security/engine/a/a;

    const/4 v8, 0x0

    if-nez v4, :cond_c

    move v4, v6

    :goto_5
    add-int/lit8 v6, v11, 0x1

    move v11, v6

    move v6, v4

    goto/16 :goto_2

    :cond_c
    iget-object v15, v4, Lcom/qihoo/security/engine/a/a;->a:[Lcom/qihoo/security/engine/a/a$a;

    if-eqz v15, :cond_2

    array-length v0, v15

    move/from16 v16, v0

    const/4 v4, 0x0

    move v10, v4

    move-object v4, v8

    :goto_6
    move/from16 v0, v16

    if-lt v10, v0, :cond_d

    if-eqz v4, :cond_18

    invoke-virtual {v14}, Lcom/qihoo/security/engine/a/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lcom/qihoo/security/engine/a/b;->c()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v4, v9}, Lcom/qihoo/security/engine/a/e;->a(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Z

    invoke-virtual {v14}, Lcom/qihoo/security/engine/a/b;->a()I

    move-result v4

    or-int/2addr v4, v6

    goto :goto_5

    :cond_d
    aget-object v17, v15, v10

    if-nez v17, :cond_f

    :cond_e
    :goto_7
    add-int/lit8 v8, v10, 0x1

    move v10, v8

    goto :goto_6

    :cond_f
    move-object/from16 v0, v17

    iget-object v8, v0, Lcom/qihoo/security/engine/a/a$a;->a:[Ljava/lang/String;

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/qihoo/security/engine/a/a$a;->b:[Ljava/lang/String;

    move-object/from16 v18, v0

    array-length v9, v8

    if-nez v9, :cond_10

    move-object/from16 v0, v18

    array-length v9, v0

    if-eqz v9, :cond_e

    :cond_10
    array-length v9, v8

    if-lez v9, :cond_11

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->findAll([Ljava/lang/String;I)I

    move-result v8

    if-ltz v8, :cond_e

    :cond_11
    move-object/from16 v0, v18

    array-length v8, v0

    if-lez v8, :cond_12

    move-object/from16 v0, p0

    iget-boolean v8, v0, Lcom/qihoo/security/engine/a/f;->d:Z

    if-nez v8, :cond_e

    const/4 v8, 0x1

    move-object/from16 v0, v18

    array-length v0, v0

    move/from16 v19, v0

    const/4 v9, 0x0

    :goto_8
    move/from16 v0, v19

    if-lt v9, v0, :cond_14

    :goto_9
    if-eqz v8, :cond_e

    :cond_12
    move-object/from16 v0, v17

    iget v8, v0, Lcom/qihoo/security/engine/a/a$a;->d:I

    or-int/2addr v5, v8

    if-nez v4, :cond_13

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    :cond_13
    move-object/from16 v0, v17

    iget-object v8, v0, Lcom/qihoo/security/engine/a/a$a;->c:Ljava/lang/String;

    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :catch_1
    move-exception v4

    move-object v4, v7

    goto/16 :goto_4

    :cond_14
    aget-object v20, v18, v9

    const/16 v21, 0x0

    const/16 v22, 0x2

    move-object/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v22

    invoke-virtual {v7, v0, v1, v2}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->find(Ljava/lang/String;II)I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v20

    if-gez v20, :cond_15

    const/4 v8, 0x0

    goto :goto_9

    :cond_15
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :catchall_0
    move-exception v5

    move-object v7, v4

    move-object v4, v5

    :goto_a
    if-eqz v7, :cond_16

    invoke-virtual {v7}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->close()V

    :cond_16
    throw v4

    :catchall_1
    move-exception v4

    goto :goto_a

    :cond_17
    move v4, v6

    goto/16 :goto_3

    :cond_18
    move v4, v6

    goto/16 :goto_5
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)Z
    .locals 1

    invoke-virtual {p3, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private final a(Ljava/util/zip/ZipInputStream;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/util/zip/InflaterInputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x400

    new-array v2, v2, [B

    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Lcom/qihoo/security/engine/ClassesDexInfo;)Lcom/qihoo/security/engine/a/e;
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/a/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/engine/a/e;

    invoke-direct {v1}, Lcom/qihoo/security/engine/a/e;-><init>()V

    invoke-direct {p0, v1, v0, p2, p1}, Lcom/qihoo/security/engine/a/f;->a(Lcom/qihoo/security/engine/a/e;Landroid/content/pm/PackageManager;Lcom/qihoo/security/engine/ClassesDexInfo;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/qihoo/security/engine/ClassesDexInfo;)Lcom/qihoo/security/engine/a/e;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/engine/a/f;->b(Ljava/lang/String;Lcom/qihoo/security/engine/ClassesDexInfo;)Lcom/qihoo/security/engine/a/e;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a/f;->d:Z

    return-void
.end method

.method public b()V
    .locals 7

    iget-object v0, p0, Lcom/qihoo/security/engine/a/f;->b:Landroid/content/Context;

    const-string/jumbo v1, "adx.dat"

    invoke-static {v0, v1}, Lcom/qihoo/security/engine/a/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    iget-object v0, p0, Lcom/qihoo/security/engine/a/f;->b:Landroid/content/Context;

    const-string/jumbo v1, "adx.dat"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v0

    iget-object v3, p0, Lcom/qihoo/security/engine/a/f;->b:Landroid/content/Context;

    const-string/jumbo v4, "adx.dat"

    invoke-static {v3, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const/4 v1, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/engine/a/f;->c:Lcom/qihoo/security/engine/a/c;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/a/c;->b()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :cond_1
    :goto_1
    return-void

    :cond_2
    :try_start_3
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "adr.dat"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/a/f;->c:Lcom/qihoo/security/engine/a/c;

    new-instance v2, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/a/f;->a(Ljava/util/zip/ZipInputStream;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2, v4, v5}, Lcom/qihoo/security/engine/a/c;->a(Ljava/lang/String;J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_2
    if-eqz v0, :cond_1

    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v1, :cond_3

    :try_start_5
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :cond_3
    :goto_4
    throw v0

    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    :catch_4
    move-exception v0

    move-object v0, v1

    goto :goto_2
.end method

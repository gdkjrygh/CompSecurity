.class public Lcom/arist/model/errorinfo/UploadErrorInfoService;
.super Landroid/app/IntentService;

# interfaces
.implements Lcom/arist/model/errorinfo/e;


# instance fields
.field a:Ljava/util/List;

.field b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "name"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    return-void
.end method

.method private static a(Ljava/io/File;)Lcom/arist/model/errorinfo/b;
    .locals 8

    const/4 v7, 0x0

    const-string v6, ""

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v1

    long-to-int v0, v4

    new-array v2, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-lt v0, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, v7

    :goto_2
    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/nio/MappedByteBuffer;->get(I)B

    move-result v3

    aput-byte v3, v2, v0
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    move-object v0, v6

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v6

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-static {v0}, Lcom/arist/model/errorinfo/b;->e(Ljava/lang/String;)Lcom/arist/model/errorinfo/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v0, v7

    goto :goto_2
.end method

.method private a(Landroid/content/Intent;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v6, 0x1

    const-string v1, "oneError"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v6, :cond_1

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/errorinfo/b;->e(Ljava/lang/String;)Lcom/arist/model/errorinfo/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/arist/model/errorinfo/c;->a(Lcom/arist/model/errorinfo/e;Lcom/arist/model/errorinfo/b;)V

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/errorinfo/c;->b()V

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    const-string v2, "/sdcard/crash/"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/sdcard/crash/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v4, v1, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lcom/arist/model/errorinfo/UploadErrorInfoService;->a(Ljava/io/File;)Lcom/arist/model/errorinfo/b;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v3

    invoke-virtual {v3, p0, v2}, Lcom/arist/model/errorinfo/c;->a(Lcom/arist/model/errorinfo/e;Lcom/arist/model/errorinfo/b;)V

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arist/model/errorinfo/c;->b()V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "errorPath"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "errorPath"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lcom/arist/model/errorinfo/UploadErrorInfoService;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x2

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v0, v3, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/arist/model/errorinfo/UploadErrorInfoService;->a(Ljava/io/File;)Lcom/arist/model/errorinfo/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/arist/model/errorinfo/c;->a(Lcom/arist/model/errorinfo/e;Lcom/arist/model/errorinfo/b;)V

    invoke-static {}, Lcom/arist/model/errorinfo/c;->a()Lcom/arist/model/errorinfo/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/errorinfo/c;->b()V

    :cond_0
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/model/errorinfo/UploadErrorInfoService;->a:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/arist/model/errorinfo/UploadErrorInfoService;->a(Landroid/content/Intent;)V

    return-void
.end method

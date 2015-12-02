.class Lcom/qihoo360/common/utils/ZipUtil$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/ZipUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Ljava/io/File;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 419
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ZipUtil$a;->a:Z

    .line 416
    return-void
.end method


# virtual methods
.method public onProgress(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 426
    new-instance v5, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo360/common/utils/ZipUtil$a;->b:Ljava/io/File;

    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 427
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 428
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 465
    :cond_1
    :goto_0
    return v0

    .line 434
    :cond_2
    iput-boolean v1, p0, Lcom/qihoo360/common/utils/ZipUtil$a;->a:Z

    goto :goto_0

    .line 439
    :cond_3
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 440
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 444
    :cond_4
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 445
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 446
    :try_start_2
    invoke-static {v4, v2}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 454
    if-eqz v4, :cond_5

    .line 455
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 456
    :cond_5
    if-eqz v2, :cond_6

    .line 457
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    :cond_6
    move v0, v1

    .line 459
    goto :goto_0

    .line 447
    :catch_0
    move-exception v1

    move-object v1, v3

    .line 451
    :goto_1
    const/4 v2, 0x0

    :try_start_3
    iput-boolean v2, p0, Lcom/qihoo360/common/utils/ZipUtil$a;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 454
    if-eqz v3, :cond_7

    .line 455
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 456
    :cond_7
    if-eqz v1, :cond_1

    .line 457
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    goto :goto_0

    .line 453
    :catchall_0
    move-exception v0

    move-object v4, v3

    .line 454
    :goto_2
    if-eqz v4, :cond_8

    .line 455
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 456
    :cond_8
    if-eqz v3, :cond_9

    .line 457
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 458
    :cond_9
    throw v0

    .line 464
    :cond_a
    iput-boolean v1, p0, Lcom/qihoo360/common/utils/ZipUtil$a;->a:Z

    goto :goto_0

    .line 453
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v4, v3

    move-object v3, v1

    goto :goto_2

    .line 447
    :catch_1
    move-exception v1

    move-object v1, v3

    move-object v3, v4

    goto :goto_1

    :catch_2
    move-exception v1

    move-object v1, v2

    move-object v3, v4

    goto :goto_1
.end method

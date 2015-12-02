.class Lcom/qihoo360/common/utils/ZipUtil$b;
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
    name = "b"
.end annotation


# instance fields
.field a:Z

.field b:Ljava/lang/String;

.field c:Ljava/io/File;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 370
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/common/utils/ZipUtil$b;->a:Z

    .line 370
    return-void
.end method


# virtual methods
.method public onProgress(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 381
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 394
    :cond_0
    :goto_0
    return v0

    .line 385
    :cond_1
    iget-object v2, p0, Lcom/qihoo360/common/utils/ZipUtil$b;->b:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 386
    invoke-virtual {p1, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    .line 387
    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/qihoo360/common/utils/ZipUtil$b;->c:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 388
    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 389
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 390
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 391
    iput-boolean v1, p0, Lcom/qihoo360/common/utils/ZipUtil$b;->a:Z

    move v0, v1

    .line 392
    goto :goto_0
.end method

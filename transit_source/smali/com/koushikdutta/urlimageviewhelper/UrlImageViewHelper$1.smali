.class final Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;
.super Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
.source "UrlImageViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$filename:Ljava/lang/String;

.field final synthetic val$targetHeight:I

.field final synthetic val$targetWidth:I

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 565
    const-class v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 565
    iput-object p1, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    iput-object p2, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$url:Ljava/lang/String;

    iput p4, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$targetWidth:I

    iput p5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$targetHeight:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;-><init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;)V

    return-void
.end method


# virtual methods
.method public onDownloadComplete(Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 8
    .param p1, "downloader"    # Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;
    .param p2, "in"    # Ljava/io/InputStream;
    .param p3, "existingFilename"    # Ljava/lang/String;

    .prologue
    .line 569
    :try_start_0
    sget-boolean v4, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->$assertionsDisabled:Z

    if-nez v4, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 584
    :catch_0
    move-exception v0

    .line 586
    .local v0, "ex":Ljava/lang/Exception;
    :goto_0
    :try_start_1
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 592
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->allowCache()Z

    move-result v4

    if-nez v4, :cond_0

    .line 593
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 595
    .end local v0    # "ex":Ljava/lang/Exception;
    :cond_0
    :goto_1
    return-void

    .line 570
    :cond_1
    if-nez p2, :cond_2

    if-nez p3, :cond_2

    .line 592
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->allowCache()Z

    move-result v4

    if-nez v4, :cond_0

    .line 593
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    goto :goto_1

    .line 572
    :cond_2
    :try_start_2
    iget-object v3, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    .line 573
    .local v3, "targetFilename":Ljava/lang/String;
    if-eqz p2, :cond_3

    .line 574
    new-instance v2, Ljava/io/BufferedInputStream;

    const/16 v4, 0x2000

    invoke-direct {v2, p2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 575
    .end local p2    # "in":Ljava/io/InputStream;
    .local v2, "in":Ljava/io/InputStream;
    :try_start_3
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v4, Ljava/io/FileOutputStream;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    const/16 v5, 0x2000

    invoke-direct {v1, v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 576
    .local v1, "fout":Ljava/io/OutputStream;
    invoke-static {v2, v1}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 577
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object p2, v2

    .line 582
    .end local v1    # "fout":Ljava/io/OutputStream;
    .end local v2    # "in":Ljava/io/InputStream;
    .restart local p2    # "in":Ljava/io/InputStream;
    :goto_2
    :try_start_4
    iget-object v4, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$context:Landroid/content/Context;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$url:Ljava/lang/String;

    iget v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$targetWidth:I

    iget v7, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$targetHeight:I

    # invokes: Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->loadBitmapFromStream(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    invoke-static {v4, v5, v3, v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->access$100(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->result:Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 592
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->allowCache()Z

    move-result v4

    if-nez v4, :cond_0

    .line 593
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    goto :goto_1

    .line 580
    :cond_3
    move-object v3, p3

    goto :goto_2

    .line 592
    .end local v3    # "targetFilename":Ljava/lang/String;
    :catchall_0
    move-exception v4

    :goto_3
    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->allowCache()Z

    move-result v5

    if-nez v5, :cond_4

    .line 593
    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;->val$filename:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    :cond_4
    throw v4

    .line 592
    .end local p2    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    .restart local v3    # "targetFilename":Ljava/lang/String;
    :catchall_1
    move-exception v4

    move-object p2, v2

    .end local v2    # "in":Ljava/io/InputStream;
    .restart local p2    # "in":Ljava/io/InputStream;
    goto :goto_3

    .line 584
    .end local p2    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    :catch_1
    move-exception v0

    move-object p2, v2

    .end local v2    # "in":Ljava/io/InputStream;
    .restart local p2    # "in":Ljava/io/InputStream;
    goto/16 :goto_0
.end method

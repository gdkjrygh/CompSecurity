.class public Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private final info:Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;

.field private final request:Lorg/apache/http/client/methods/HttpUriRequest;


# direct methods
.method public constructor <init>(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/HttpResponse;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 705
    invoke-direct {p0, v1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 707
    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 708
    if-nez v0, :cond_0

    .line 709
    new-instance v0, Lcom/dropbox/client2/exception/DropboxException;

    const-string v1, "Didn\'t get entity from HttpResponse"

    invoke-direct {v0, v1}, Lcom/dropbox/client2/exception/DropboxException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 715
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->in:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 720
    iput-object p1, p0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    .line 721
    new-instance v0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;

    invoke-direct {v0, p2, v1}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;-><init>(Lorg/apache/http/HttpResponse;Lcom/dropbox/client2/DropboxAPI$1;)V

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->info:Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;

    .line 722
    return-void

    .line 716
    :catch_0
    move-exception v0

    .line 717
    new-instance v1, Lcom/dropbox/client2/exception/DropboxIOException;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/exception/DropboxIOException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 735
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->request:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V

    .line 736
    return-void
.end method

.method public copyStreamToOutput(Ljava/io/OutputStream;Lcom/dropbox/client2/ProgressListener;)V
    .locals 18

    .prologue
    .line 771
    const/4 v3, 0x0

    .line 772
    const-wide/16 v4, 0x0

    .line 773
    const-wide/16 v6, 0x0

    .line 774
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->info:Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;

    invoke-virtual {v2}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->getFileSize()J

    move-result-wide v10

    .line 777
    :try_start_0
    new-instance v8, Ljava/io/BufferedOutputStream;

    move-object/from16 v0, p1

    invoke-direct {v8, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 779
    const/16 v2, 0x1000

    :try_start_1
    new-array v9, v2, [B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-wide/from16 v16, v6

    move-wide v6, v4

    move-wide/from16 v4, v16

    .line 782
    :cond_0
    :goto_0
    :try_start_2
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->read([B)I

    move-result v2

    .line 783
    if-gez v2, :cond_3

    .line 784
    const-wide/16 v2, 0x0

    cmp-long v2, v10, v2

    if-ltz v2, :cond_4

    cmp-long v2, v6, v10

    if-gez v2, :cond_4

    .line 786
    new-instance v2, Lcom/dropbox/client2/exception/DropboxPartialFileException;

    invoke-direct {v2, v6, v7}, Lcom/dropbox/client2/exception/DropboxPartialFileException;-><init>(J)V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 816
    :catch_0
    move-exception v2

    move-wide v4, v6

    move-object v3, v8

    :goto_1
    :try_start_3
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 817
    if-eqz v2, :cond_7

    const-string v6, "No space"

    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 820
    new-instance v2, Lcom/dropbox/client2/exception/DropboxLocalStorageFullException;

    invoke-direct {v2}, Lcom/dropbox/client2/exception/DropboxLocalStorageFullException;-><init>()V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 831
    :catchall_0
    move-exception v2

    move-object v8, v3

    :goto_2
    if-eqz v8, :cond_1

    .line 833
    :try_start_4
    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 836
    :cond_1
    :goto_3
    if-eqz p1, :cond_2

    .line 838
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    .line 844
    :cond_2
    :goto_4
    :try_start_6
    invoke-virtual/range {p0 .. p0}, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 845
    :goto_5
    throw v2

    .line 792
    :cond_3
    const/4 v3, 0x0

    :try_start_7
    invoke-virtual {v8, v9, v3, v2}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 794
    int-to-long v2, v2

    add-long/2addr v6, v2

    .line 796
    if-eqz p2, :cond_0

    .line 797
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 798
    sub-long v12, v2, v4

    invoke-virtual/range {p2 .. p2}, Lcom/dropbox/client2/ProgressListener;->progressInterval()J

    move-result-wide v14

    cmp-long v12, v12, v14

    if-lez v12, :cond_8

    .line 800
    move-object/from16 v0, p2

    invoke-virtual {v0, v6, v7, v10, v11}, Lcom/dropbox/client2/ProgressListener;->onProgress(JJ)V

    :goto_6
    move-wide v4, v2

    .line 802
    goto :goto_0

    .line 805
    :cond_4
    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->flush()V

    .line 806
    invoke-virtual/range {p1 .. p1}, Ljava/io/OutputStream;->flush()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 809
    :try_start_8
    move-object/from16 v0, p1

    instance-of v2, v0, Ljava/io/FileOutputStream;

    if-eqz v2, :cond_5

    .line 810
    move-object/from16 v0, p1

    check-cast v0, Ljava/io/FileOutputStream;

    move-object v2, v0

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/FileDescriptor;->sync()V
    :try_end_8
    .catch Ljava/io/SyncFailedException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 833
    :cond_5
    :goto_7
    :try_start_9
    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    .line 836
    :goto_8
    if-eqz p1, :cond_6

    .line 838
    :try_start_a
    invoke-virtual/range {p1 .. p1}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 844
    :cond_6
    :goto_9
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    .line 846
    :goto_a
    return-void

    .line 828
    :cond_7
    :try_start_c
    new-instance v2, Lcom/dropbox/client2/exception/DropboxPartialFileException;

    invoke-direct {v2, v4, v5}, Lcom/dropbox/client2/exception/DropboxPartialFileException;-><init>(J)V

    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_1
    move-exception v2

    goto :goto_8

    :catch_2
    move-exception v2

    goto :goto_9

    .line 846
    :catch_3
    move-exception v2

    goto :goto_a

    :catch_4
    move-exception v3

    goto :goto_3

    :catch_5
    move-exception v3

    goto :goto_4

    :catch_6
    move-exception v3

    goto :goto_5

    .line 831
    :catchall_1
    move-exception v2

    move-object v8, v3

    goto :goto_2

    :catchall_2
    move-exception v2

    goto :goto_2

    .line 816
    :catch_7
    move-exception v2

    goto :goto_1

    :catch_8
    move-exception v2

    move-object v3, v8

    goto :goto_1

    :catch_9
    move-exception v2

    goto :goto_7

    :cond_8
    move-wide v2, v4

    goto :goto_6
.end method

.method public getFileInfo()Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;
    .locals 1

    .prologue
    .line 742
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;->info:Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;

    return-object v0
.end method

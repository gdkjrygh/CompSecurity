.class public Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;
.super Ljava/lang/Thread;


# static fields
.field private static final a:Ljava/lang/String; = "HapticDownloadThread"

.field private static final b:I = 0x1000

.field public static b04150415Е041504150415:I = 0x1

.field public static b0415ЕЕ041504150415:I = 0x27

.field public static bЕ0415Е041504150415:I = 0x0

.field public static bЕЕ0415041504150415:I = 0x2


# instance fields
.field private c:Ljava/lang/String;

.field private d:Landroid/os/Handler;

.field private e:Z

.field private f:Ljava/lang/Thread;

.field private g:Lcom/immersion/hapticmediasdk/utils/FileManager;

.field private volatile h:Z

.field private volatile i:Z

.field private volatile j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Handler;ZLcom/immersion/hapticmediasdk/utils/FileManager;)V
    .locals 3

    const/4 v1, 0x0

    const-string v0, "HapticDownloadThread"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    iput-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    iput-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z

    iput-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    iput-object p1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    iput-boolean p3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->e:Z

    iput-object p4, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b04150415Е041504150415:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕЕ0415041504150415:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x46

    sput v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415Е0415041504150415()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    :cond_0
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    return-void
.end method

.method public static b0415Е0415041504150415()I
    .locals 1

    const/16 v0, 0x13

    return v0
.end method

.method public static b0427ЧЧЧЧЧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bЕ04150415041504150415()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public declared-synchronized isFirstPacketReady()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 5

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->e:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/ImmersionHttpClient;->getHttpClient()Lcom/immersion/hapticmediasdk/controllers/ImmersionHttpClient;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->c:Ljava/lang/String;

    const/4 v2, 0x0

    const v3, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Lcom/immersion/hapticmediasdk/controllers/ImmersionHttpClient;->executeGet(Ljava/lang/String;Ljava/util/Map;I)Lorg/apache/http/HttpResponse;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_4

    const-string v1, "Content-Length"

    invoke-interface {v0, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->writeToFile(Ljava/io/InputStream;I)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->c:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    :goto_1
    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->writeToFile(Ljava/io/InputStream;I)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :sswitch_0
    :try_start_3
    const-string v2, " Internal Server Error"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    new-instance v2, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;-><init>(ILjava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_1
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :sswitch_1
    :try_start_4
    const-string v2, " Bad Gateway"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "haptic_download_exception"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    sget v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    sget v4, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b04150415Е041504150415:I

    add-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    mul-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕЕ0415041504150415:I

    rem-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    if-eq v3, v4, :cond_2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415Е0415041504150415()I

    move-result v3

    sput v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415Е0415041504150415()I

    move-result v3

    sput v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    :cond_2
    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_3
    const-string v1, "HapticDownloadThread"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "HTTP STATUS CODE: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sparse-switch v1, :sswitch_data_0

    goto :goto_2

    :sswitch_2
    const-string v2, " Bad Request"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :sswitch_3
    const-string v2, " Forbidden"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :sswitch_4
    const-string v2, " Not Found"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :sswitch_5
    const-string v2, " Service Unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_2

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    move-object v0, v1

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x190 -> :sswitch_2
        0x193 -> :sswitch_3
        0x194 -> :sswitch_4
        0x1f4 -> :sswitch_0
        0x1f6 -> :sswitch_1
        0x1f7 -> :sswitch_5
    .end sparse-switch
.end method

.method public terminate()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b04150415Е041504150415:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕЕ0415041504150415:I

    rem-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ04150415041504150415()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x35

    sput v0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415Е0415041504150415()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    return-void
.end method

.method public writeToFile(Ljava/io/InputStream;I)Z
    .locals 9

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v0, 0x1000

    :try_start_0
    new-array v5, v0, [B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p1, :cond_5

    if-lez p2, :cond_5

    :try_start_1
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-direct {v4, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->e:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v6, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->c:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lcom/immersion/hapticmediasdk/utils/FileManager;->makeOutputStreamForStreaming(Ljava/lang/String;)Ljava/io/BufferedOutputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    :try_start_3
    iget-boolean v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v2, :cond_1

    const-string v2, "downloaded an empty file"

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    new-instance v6, Ljava/io/FileNotFoundException;

    invoke-direct {v6, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    const-string v7, "haptic_download_exception"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v3, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-boolean v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v5, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    const-string v3, "HapticDownloadThread"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-static {v3, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v2, v4}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v2, v0}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move v0, v1

    :goto_1
    return v0

    :cond_2
    :try_start_6
    iget-boolean v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->e:Z

    if-nez v3, :cond_11

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    iget-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_b

    :try_start_7
    iget-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v1, :cond_4

    const-string v1, "downloaded an empty file"

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    new-instance v6, Ljava/io/FileNotFoundException;

    invoke-direct {v6, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    const-string v7, "haptic_download_exception"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-boolean v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v5, :cond_3

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v5, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_3
    const-string v3, "HapticDownloadThread"

    invoke-static {v3, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :try_start_8
    invoke-virtual {v1, v4}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :try_start_9
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v1, v0}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    move v0, v2

    goto :goto_1

    :cond_5
    :try_start_a
    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v0, :cond_7

    const-string v0, "downloaded an empty file"

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    new-instance v4, Ljava/io/FileNotFoundException;

    invoke-direct {v4, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    const-string v5, "haptic_download_exception"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-boolean v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v3, :cond_6

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_6
    const-string v2, "HapticDownloadThread"

    invoke-static {v2, v0}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z

    move v0, v1

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v3

    :goto_2
    iget-boolean v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v2, :cond_9

    const-string v2, "downloaded an empty file"

    iget-object v4, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :try_start_b
    new-instance v6, Ljava/io/FileNotFoundException;

    invoke-direct {v6, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    :try_start_c
    const-string v7, "haptic_download_exception"
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    :try_start_d
    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-boolean v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v5, :cond_8

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v5, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_8
    const-string v4, "HapticDownloadThread"

    invoke-static {v4, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    :cond_9
    :try_start_e
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v2, v3}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v2, v1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z

    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    :catch_0
    move-exception v0

    throw v0

    :cond_a
    :try_start_f
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v6, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->c:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lcom/immersion/hapticmediasdk/utils/FileManager;->makeOutputStream(Ljava/lang/String;)Ljava/io/BufferedOutputStream;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    :try_start_10
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-virtual {v3, v5, p2, v6}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :cond_c
    :try_start_11
    const-string v1, "HapticDownloadThread"
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    :try_start_12
    const-string v3, "file download completed"

    invoke-static {v1, v3}, Lcom/immersion/hapticmediasdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    :try_start_13
    iget-boolean v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v1, :cond_f

    const-string v1, "downloaded an empty file"

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    move-result-object v3

    :try_start_14
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1

    sget v6, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    sget v7, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b04150415Е041504150415:I

    add-int/2addr v6, v7

    sget v7, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    mul-int/2addr v6, v7

    sget v7, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕЕ0415041504150415:I

    rem-int/2addr v6, v7

    sget v7, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    if-eq v6, v7, :cond_d

    const/4 v6, 0x2

    sput v6, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    const/16 v6, 0x36

    sput v6, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    :cond_d
    :try_start_15
    new-instance v6, Ljava/io/FileNotFoundException;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    :try_start_16
    invoke-direct {v6, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    const-string v7, "haptic_download_exception"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_e

    iget-boolean v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v5, :cond_e

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v5, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_e
    const-string v3, "HapticDownloadThread"

    invoke-static {v3, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v1, v4}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0427ЧЧЧЧЧ()I

    move-result v3

    add-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    mul-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕЕ0415041504150415:I

    rem-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    if-eq v1, v3, :cond_10

    const/16 v1, 0x2f

    sput v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->b0415ЕЕ041504150415:I

    const/16 v1, 0x56

    sput v1, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->bЕ0415Е041504150415:I

    :cond_10
    :try_start_17
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->g:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v1, v0}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->i:Z
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_0

    move v0, v2

    goto/16 :goto_1

    :cond_11
    :goto_3
    :try_start_18
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->isInterrupted()Z

    move-result v3

    if-nez v3, :cond_c

    iget-boolean v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->j:Z

    if-nez v3, :cond_c

    const/4 v3, 0x0

    const/16 v6, 0x1000

    invoke-virtual {v4, v5, v3, v6}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v3

    if-ltz v3, :cond_c

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6, v3}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/2addr v1, v3

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->f:Ljava/lang/Thread;

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-boolean v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    if-nez v3, :cond_12

    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->h:Z

    :cond_12
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v1, v7}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v3

    iget-object v6, p0, Lcom/immersion/hapticmediasdk/controllers/HapticDownloadThread;->d:Landroid/os/Handler;

    invoke-virtual {v6, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    move-object v3, v4

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    goto/16 :goto_2

    :catch_1
    move-exception v0

    throw v0

    :catchall_2
    move-exception v0

    move-object v1, v3

    move-object v3, v4

    goto/16 :goto_2
.end method

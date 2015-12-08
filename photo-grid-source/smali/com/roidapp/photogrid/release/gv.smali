.class final Lcom/roidapp/photogrid/release/gv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/io/File;

.field private f:J

.field private g:I

.field private h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:Z

.field private k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Ljava/net/HttpURLConnection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;JJ)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 723
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 724
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/gv;->a:Ljava/lang/ref/WeakReference;

    .line 725
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gv;->b:Landroid/content/Context;

    .line 726
    iput-object p3, p0, Lcom/roidapp/photogrid/release/gv;->c:Ljava/lang/String;

    .line 727
    iput-object p4, p0, Lcom/roidapp/photogrid/release/gv;->d:Ljava/lang/String;

    .line 728
    iput-object p5, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    .line 729
    iput-wide p6, p0, Lcom/roidapp/photogrid/release/gv;->f:J

    .line 730
    long-to-int v0, p8

    iput v0, p0, Lcom/roidapp/photogrid/release/gv;->g:I

    .line 731
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 732
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 733
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;JJB)V
    .locals 0

    .prologue
    .line 710
    invoke-direct/range {p0 .. p9}, Lcom/roidapp/photogrid/release/gv;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;JJ)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/gv;)V
    .locals 2

    .prologue
    .line 710
    .line 1736
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1737
    :cond_0
    :goto_0
    return-void

    .line 1738
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1739
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->k:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    if-eqz v0, :cond_0

    .line 1740
    invoke-static {}, Lcom/roidapp/photogrid/release/ge;->b()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/gw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/gw;-><init>(Lcom/roidapp/photogrid/release/gv;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/gv;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->k:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 15

    .prologue
    .line 757
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 758
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 868
    :cond_0
    :goto_0
    return-void

    .line 761
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/gv;->b:Landroid/content/Context;

    .line 763
    invoke-static {}, Lcom/roidapp/photogrid/release/ge;->a()Z

    move-result v1

    if-nez v1, :cond_2

    .line 764
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 767
    :cond_2
    const/4 v2, 0x0

    .line 768
    const/4 v5, 0x0

    .line 769
    const/4 v4, 0x0

    .line 770
    const/4 v3, 0x0

    .line 772
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 773
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 774
    new-instance v1, Ljava/net/URL;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/roidapp/photogrid/release/gv;->d:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/gv;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 775
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 776
    :try_start_1
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/gv;->k:Ljava/lang/ref/WeakReference;

    .line 777
    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 778
    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 779
    const-string v2, "GET"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 780
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result v2

    if-eqz v2, :cond_5

    .line 855
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 857
    if-eqz v1, :cond_3

    .line 859
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 865
    :cond_3
    :goto_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v2, 0x8

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    :goto_2
    invoke-static {v0, v2, v3, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 866
    :cond_4
    const/4 v1, 0x0

    goto :goto_2

    .line 782
    :cond_5
    :try_start_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    .line 783
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result v2

    if-eqz v2, :cond_8

    .line 855
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 857
    if-eqz v1, :cond_6

    .line 859
    :try_start_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 865
    :cond_6
    :goto_3
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v2, 0x8

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    :goto_4
    invoke-static {v0, v2, v3, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_0

    .line 866
    :cond_7
    const/4 v1, 0x0

    goto :goto_4

    .line 785
    :cond_8
    :try_start_5
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v6, 0xc8

    if-eq v2, v6, :cond_b

    .line 786
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 787
    const/4 v6, 0x3

    iput v6, v2, Landroid/os/Message;->what:I

    .line 788
    iget-object v6, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    iput-object v6, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 789
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_c
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 855
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 857
    if-eqz v1, :cond_9

    .line 859
    :try_start_6
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 865
    :cond_9
    :goto_5
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v2, 0x8

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    :goto_6
    invoke-static {v0, v2, v3, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_0

    .line 866
    :cond_a
    const/4 v1, 0x0

    goto :goto_6

    .line 792
    :cond_b
    :try_start_7
    iget v2, p0, Lcom/roidapp/photogrid/release/gv;->g:I

    if-lez v2, :cond_10

    iget v2, p0, Lcom/roidapp/photogrid/release/gv;->g:I

    move v7, v2

    .line 793
    :goto_7
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_c
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-result-object v6

    .line 794
    :try_start_8
    new-instance v5, Ljava/io/FileOutputStream;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-direct {v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_d
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 795
    const/4 v2, 0x0

    .line 797
    const/16 v4, 0x5000

    :try_start_9
    new-array v4, v4, [B

    .line 798
    new-instance v8, Ljava/util/zip/CRC32;

    invoke-direct {v8}, Ljava/util/zip/CRC32;-><init>()V

    .line 799
    :goto_8
    invoke-virtual {v6, v4}, Ljava/io/InputStream;->read([B)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_11

    .line 800
    iget-object v10, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v10

    if-nez v10, :cond_11

    .line 803
    add-int/2addr v2, v9

    .line 804
    const/4 v10, 0x0

    invoke-virtual {v5, v4, v10, v9}, Ljava/io/OutputStream;->write([BII)V

    .line 805
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v10

    .line 806
    const/4 v11, 0x1

    iput v11, v10, Landroid/os/Message;->what:I

    .line 807
    mul-int/lit8 v11, v2, 0x64

    div-int/2addr v11, v7

    iput v11, v10, Landroid/os/Message;->arg1:I

    .line 808
    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 810
    const/4 v10, 0x0

    invoke-virtual {v8, v4, v10, v9}, Ljava/util/zip/CRC32;->update([BII)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_8

    .line 827
    :catch_0
    move-exception v2

    move-object v4, v6

    move v14, v3

    move-object v3, v5

    move-object v5, v1

    move-object v1, v2

    move v2, v14

    .line 828
    :goto_9
    :try_start_a
    iget-object v6, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-result v6

    if-eqz v6, :cond_20

    .line 844
    if-eqz v4, :cond_c

    .line 845
    :try_start_b
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 847
    :cond_c
    if-eqz v3, :cond_d

    .line 848
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    .line 854
    :cond_d
    :goto_a
    if-nez v2, :cond_e

    .line 855
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 857
    :cond_e
    if-eqz v5, :cond_f

    .line 859
    :try_start_c
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    .line 865
    :cond_f
    :goto_b
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v3, 0x8

    if-eqz v2, :cond_1e

    const/4 v1, 0x1

    :goto_c
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1f

    const/4 v2, 0x1

    :goto_d
    invoke-static {v0, v3, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_0

    .line 792
    :cond_10
    :try_start_d
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    move-result v2

    move v7, v2

    goto/16 :goto_7

    .line 812
    :cond_11
    if-ne v2, v7, :cond_17

    :try_start_e
    iget-wide v10, p0, Lcom/roidapp/photogrid/release/gv;->f:J

    const-wide/16 v12, 0x0

    cmp-long v2, v10, v12

    if-ltz v2, :cond_12

    invoke-virtual {v8}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v8

    iget-wide v10, p0, Lcom/roidapp/photogrid/release/gv;->f:J

    cmp-long v2, v8, v10

    if-nez v2, :cond_17

    .line 813
    :cond_12
    const/4 v3, 0x1

    .line 814
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 815
    const/4 v4, 0x2

    iput v4, v2, Landroid/os/Message;->what:I

    .line 816
    iget-object v4, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    iput-object v4, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 817
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 844
    :cond_13
    :goto_e
    if-eqz v6, :cond_14

    .line 845
    :try_start_f
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 848
    :cond_14
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e

    .line 854
    :goto_f
    if-nez v3, :cond_15

    .line 855
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 857
    :cond_15
    if-eqz v1, :cond_16

    .line 859
    :try_start_10
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    .line 865
    :cond_16
    :goto_10
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v4, 0x8

    if-eqz v3, :cond_1c

    const/4 v1, 0x1

    :goto_11
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v2, 0x1

    :goto_12
    invoke-static {v0, v4, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_0

    .line 820
    :cond_17
    :try_start_11
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_13

    .line 822
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 823
    const/4 v4, 0x7

    iput v4, v2, Landroid/os/Message;->what:I

    .line 824
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_e

    .line 843
    :catchall_0
    move-exception v2

    move-object v4, v5

    move-object v5, v6

    move-object v14, v2

    move v2, v3

    move-object v3, v14

    .line 844
    :goto_13
    if-eqz v5, :cond_18

    .line 845
    :try_start_12
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 847
    :cond_18
    if-eqz v4, :cond_19

    .line 848
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 854
    :cond_19
    :goto_14
    if-nez v2, :cond_1a

    .line 855
    iget-object v4, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 857
    :cond_1a
    if-eqz v1, :cond_1b

    .line 859
    :try_start_13
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_7

    .line 865
    :cond_1b
    :goto_15
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v4, 0x8

    if-eqz v2, :cond_28

    const/4 v1, 0x1

    :goto_16
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_29

    const/4 v2, 0x1

    :goto_17
    invoke-static {v0, v4, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v3

    .line 866
    :cond_1c
    const/4 v1, 0x0

    goto :goto_11

    :cond_1d
    const/4 v2, 0x0

    goto :goto_12

    :cond_1e
    const/4 v1, 0x0

    goto/16 :goto_c

    :cond_1f
    const/4 v2, 0x0

    goto/16 :goto_d

    .line 830
    :cond_20
    :try_start_14
    instance-of v6, v1, Ljava/net/UnknownHostException;

    if-eqz v6, :cond_25

    .line 831
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 832
    const/4 v7, 0x3

    iput v7, v6, Landroid/os/Message;->what:I

    .line 833
    iget-object v7, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    iput-object v7, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 834
    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 840
    :goto_18
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 844
    if-eqz v4, :cond_21

    .line 845
    :try_start_15
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 847
    :cond_21
    if-eqz v3, :cond_22

    .line 848
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9

    .line 854
    :cond_22
    :goto_19
    if-nez v2, :cond_23

    .line 855
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gv;->e:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 857
    :cond_23
    if-eqz v5, :cond_24

    .line 859
    :try_start_16
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6

    .line 865
    :cond_24
    :goto_1a
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/gv;->j:Z

    .line 866
    const/16 v3, 0x8

    if-eqz v2, :cond_26

    const/4 v1, 0x1

    :goto_1b
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gv;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_27

    const/4 v2, 0x1

    :goto_1c
    invoke-static {v0, v3, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gv;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_0

    .line 836
    :cond_25
    :try_start_17
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 837
    const/4 v7, 0x7

    iput v7, v6, Landroid/os/Message;->what:I

    .line 838
    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    goto :goto_18

    .line 843
    :catchall_1
    move-exception v1

    move-object v14, v1

    move-object v1, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v14

    goto/16 :goto_13

    .line 866
    :cond_26
    const/4 v1, 0x0

    goto :goto_1b

    :cond_27
    const/4 v2, 0x0

    goto :goto_1c

    :cond_28
    const/4 v1, 0x0

    goto/16 :goto_16

    :cond_29
    const/4 v2, 0x0

    goto :goto_17

    :catch_1
    move-exception v1

    goto/16 :goto_1

    :catch_2
    move-exception v1

    goto/16 :goto_3

    :catch_3
    move-exception v1

    goto/16 :goto_5

    :catch_4
    move-exception v1

    goto/16 :goto_10

    :catch_5
    move-exception v1

    goto/16 :goto_b

    :catch_6
    move-exception v1

    goto :goto_1a

    :catch_7
    move-exception v1

    goto/16 :goto_15

    :catch_8
    move-exception v4

    goto/16 :goto_14

    .line 843
    :catchall_2
    move-exception v1

    move-object v14, v1

    move-object v1, v2

    move v2, v3

    move-object v3, v14

    goto/16 :goto_13

    :catchall_3
    move-exception v2

    move-object v14, v2

    move v2, v3

    move-object v3, v14

    goto/16 :goto_13

    :catchall_4
    move-exception v2

    move-object v5, v6

    move v14, v3

    move-object v3, v2

    move v2, v14

    goto/16 :goto_13

    :catch_9
    move-exception v1

    goto :goto_19

    :catch_a
    move-exception v1

    goto/16 :goto_a

    .line 827
    :catch_b
    move-exception v1

    move v14, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v2

    move v2, v14

    goto/16 :goto_9

    :catch_c
    move-exception v2

    move-object v14, v2

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v1

    move-object v1, v14

    goto/16 :goto_9

    :catch_d
    move-exception v2

    move-object v5, v1

    move-object v1, v2

    move v2, v3

    move-object v3, v4

    move-object v4, v6

    goto/16 :goto_9

    :catch_e
    move-exception v2

    goto/16 :goto_f
.end method

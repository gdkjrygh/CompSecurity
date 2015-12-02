.class public Landroid_src/mms/transaction/TransactionService;
.super Landroid/app/Service;
.source "TransactionService.java"

# interfaces
.implements Landroid_src/mms/transaction/l;


# instance fields
.field public a:Landroid/os/Handler;

.field private b:Landroid_src/mms/transaction/v;

.field private c:Landroid/os/Looper;

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid_src/mms/transaction/r;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid_src/mms/transaction/r;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/net/ConnectivityManager;

.field private g:Landroid_src/mms/transaction/u;

.field private h:Landroid/os/PowerManager$WakeLock;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 83
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->e:Ljava/util/ArrayList;

    .line 136
    new-instance v0, Landroid_src/mms/transaction/t;

    invoke-direct {v0, p0}, Landroid_src/mms/transaction/t;-><init>(Landroid_src/mms/transaction/TransactionService;)V

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->a:Landroid/os/Handler;

    .line 83
    return-void
.end method

.method static synthetic a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 276
    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    monitor-enter v1

    .line 277
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    const-string v0, "fb-mms:TransactionService"

    const-string v2, "stopSelfIfIdle: STOP!"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    const-string v0, "fb-mms:TransactionService"

    const-string v2, "stopSelfIfIdle: unRegisterForConnectionStateChanges"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    :cond_1
    invoke-virtual {p0}, Landroid_src/mms/transaction/TransactionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/transaction/i;->b(Landroid/content/Context;)V

    .line 287
    invoke-virtual {p0, p1}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    .line 289
    :cond_2
    monitor-exit v1

    .line 290
    return-void

    .line 289
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(II)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v0, 0x2

    .line 332
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 333
    const-string v3, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onNetworkUnavailable: sid="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", type="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    :cond_0
    if-ne p2, v1, :cond_2

    .line 342
    :goto_0
    if-eq v0, v2, :cond_1

    .line 343
    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 345
    :cond_1
    invoke-virtual {p0, p1}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    .line 346
    return-void

    .line 339
    :cond_2
    if-ne p2, v0, :cond_3

    move v0, v1

    .line 340
    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method private a(ILandroid_src/mms/transaction/s;Z)V
    .locals 4

    .prologue
    .line 316
    if-eqz p3, :cond_0

    .line 317
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "launchTransaction: no network error!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    invoke-virtual {p2}, Landroid_src/mms/transaction/s;->a()I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid_src/mms/transaction/TransactionService;->a(II)V

    .line 329
    :goto_0
    return-void

    .line 321
    :cond_0
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/v;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 322
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 323
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 325
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 326
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "launchTransaction: sending message "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    :cond_1
    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    invoke-virtual {v1, v0}, Landroid_src/mms/transaction/v;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method static synthetic b(Landroid_src/mms/transaction/TransactionService;)V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->g()V

    return-void
.end method

.method private static b(I)Z
    .locals 1

    .prologue
    .line 293
    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    if-lez p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(I)I
    .locals 3

    .prologue
    .line 302
    sparse-switch p1, :sswitch_data_0

    .line 310
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized MESSAGE_TYPE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const/4 v0, -0x1

    :goto_0
    return v0

    .line 304
    :sswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 306
    :sswitch_1
    const/4 v0, 0x3

    goto :goto_0

    .line 308
    :sswitch_2
    const/4 v0, 0x2

    goto :goto_0

    .line 302
    nop

    :sswitch_data_0
    .sparse-switch
        0x80 -> :sswitch_2
        0x82 -> :sswitch_0
        0x87 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic c(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->f:Landroid/net/ConnectivityManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 298
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic d(Landroid_src/mms/transaction/TransactionService;)Landroid_src/mms/transaction/v;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    return-object v0
.end method

.method private declared-synchronized d()V
    .locals 3

    .prologue
    .line 455
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 456
    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/TransactionService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 457
    const/4 v1, 0x1

    const-string v2, "MMS Connectivity"

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    .line 458
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    :cond_0
    monitor-exit p0

    return-void

    .line 455
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 465
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 466
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 470
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 471
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->h:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 473
    :cond_0
    return-void
.end method

.method private g()V
    .locals 4

    .prologue
    .line 837
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid_src/mms/transaction/v;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid_src/mms/transaction/v;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 840
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 4

    .prologue
    .line 477
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->d()V

    .line 479
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->f:Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    const-string v2, "enableMMS"

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->startUsingNetworkFeature(ILjava/lang/String;)I

    move-result v0

    .line 482
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 483
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "beginMmsConnectivity: result="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 493
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot establish MMS connectivity"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 489
    :pswitch_0
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->e()V

    .line 490
    return v0

    .line 486
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid_src/mms/transaction/k;)V
    .locals 6

    .prologue
    const/4 v0, 0x2

    .line 374
    check-cast p1, Landroid_src/mms/transaction/r;

    .line 375
    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->e()I

    move-result v1

    .line 377
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    const-string v0, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update transaction "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    :cond_0
    :try_start_0
    iget-object v2, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 383
    :try_start_1
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 384
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 385
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 386
    const-string v0, "fb-mms:TransactionService"

    const-string v3, "update: handle next pending transaction..."

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    :cond_1
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    const/4 v3, 0x4

    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->f()Landroid_src/mms/transaction/w;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid_src/mms/transaction/v;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 391
    iget-object v3, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    invoke-virtual {v3, v0}, Landroid_src/mms/transaction/v;->sendMessage(Landroid/os/Message;)Z

    .line 399
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 401
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.TRANSACTION_COMPLETED_ACTION"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 402
    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->d()Landroid_src/mms/transaction/x;

    move-result-object v2

    .line 403
    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->a()I

    move-result v3

    .line 404
    const-string v4, "state"

    invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 405
    const-string v4, "uri"

    invoke-virtual {v2}, Landroid_src/mms/transaction/x;->b()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 407
    packed-switch v3, :pswitch_data_0

    .line 434
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 435
    const-string v2, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Transaction state unknown: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    :cond_2
    :goto_1
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 442
    const-string v2, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "update: broadcast transaction result "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    :cond_3
    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/TransactionService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 447
    invoke-virtual {p1, p0}, Landroid_src/mms/transaction/r;->b(Landroid_src/mms/transaction/l;)V

    .line 448
    invoke-virtual {p0}, Landroid_src/mms/transaction/TransactionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/transaction/i;->b(Landroid/content/Context;)V

    .line 449
    invoke-virtual {p0, v1}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    .line 451
    return-void

    .line 394
    :cond_4
    const/4 v0, 0x2

    :try_start_3
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 395
    const-string v0, "fb-mms:TransactionService"

    const-string v3, "update: endMmsConnectivity"

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    :cond_5
    invoke-virtual {p0}, Landroid_src/mms/transaction/TransactionService;->b()V

    goto/16 :goto_0

    .line 399
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 447
    :catchall_1
    move-exception v0

    invoke-virtual {p1, p0}, Landroid_src/mms/transaction/r;->b(Landroid_src/mms/transaction/l;)V

    .line 448
    invoke-virtual {p0}, Landroid_src/mms/transaction/TransactionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid_src/mms/transaction/i;->b(Landroid/content/Context;)V

    .line 449
    invoke-virtual {p0, v1}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    throw v0

    .line 409
    :pswitch_0
    const/4 v2, 0x2

    :try_start_5
    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 410
    const-string v2, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Transaction complete: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    :cond_6
    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->b()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    goto :goto_1

    .line 419
    :pswitch_1
    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v2, v4}, Landroid_src/mms/transaction/d;->b(Landroid/content/Context;ZZ)V

    .line 421
    invoke-static {p0}, Landroid_src/mms/transaction/d;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 424
    :pswitch_2
    invoke-static {}, Landroid_src/mms/g/l;->a()Landroid_src/mms/g/l;

    move-result-object v2

    invoke-virtual {v2}, Landroid_src/mms/g/l;->b()V

    goto/16 :goto_1

    .line 429
    :pswitch_3
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 430
    const-string v2, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Transaction failed: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    .line 407
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 414
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected b()V
    .locals 3

    .prologue
    .line 498
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "endMmsConnectivity"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    :cond_0
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/v;->removeMessages(I)V

    .line 504
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->f:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_1

    .line 505
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->f:Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    const-string v2, "enableMMS"

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->stopUsingNetworkFeature(ILjava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 510
    :cond_1
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->f()V

    .line 512
    return-void

    .line 510
    :catchall_0
    move-exception v0

    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->f()V

    throw v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 366
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 156
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "Creating TransactionService"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TransactionService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 166
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->c:Landroid/os/Looper;

    .line 167
    new-instance v0, Landroid_src/mms/transaction/v;

    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->c:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/transaction/v;-><init>(Landroid_src/mms/transaction/TransactionService;Landroid/os/Looper;)V

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    .line 169
    new-instance v0, Landroid_src/mms/transaction/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid_src/mms/transaction/u;-><init>(Landroid_src/mms/transaction/TransactionService;Landroid_src/mms/transaction/t;)V

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->g:Landroid_src/mms/transaction/u;

    .line 170
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 171
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 172
    iget-object v1, p0, Landroid_src/mms/transaction/TransactionService;->g:Landroid_src/mms/transaction/u;

    invoke-virtual {p0, v1, v0}, Landroid_src/mms/transaction/TransactionService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 173
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 350
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "Destroying TransactionService"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    :cond_0
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "TransactionService exiting with transaction still pending"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    :cond_1
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->f()V

    .line 359
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->g:Landroid_src/mms/transaction/u;

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/TransactionService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 361
    iget-object v0, p0, Landroid_src/mms/transaction/TransactionService;->b:Landroid_src/mms/transaction/v;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/v;->sendEmptyMessage(I)Z

    .line 362
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v8, 0x2

    .line 177
    if-nez p1, :cond_0

    .line 272
    :goto_0
    return v8

    .line 180
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/TransactionService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Landroid_src/mms/transaction/TransactionService;->f:Landroid/net/ConnectivityManager;

    .line 181
    invoke-direct {p0}, Landroid_src/mms/transaction/TransactionService;->c()Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v1

    .line 183
    :goto_1
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 184
    const-string v3, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onStart: #"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " intent="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v3, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "    networkAvailable="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    if-nez v0, :cond_6

    :goto_2
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_1
    const-string v1, "android.intent.action.ACTION_ONALARM"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_f

    .line 190
    :cond_2
    invoke-static {p0}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid_src/mms/e/t;->a(J)Landroid/database/Cursor;

    move-result-object v1

    .line 192
    if-eqz v1, :cond_d

    .line 194
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    .line 196
    const/4 v3, 0x2

    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 197
    const-string v3, "fb-mms:TransactionService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onStart: cursor.count="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    :cond_3
    if-nez v2, :cond_7

    .line 201
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 202
    const-string v0, "fb-mms:TransactionService"

    const-string v2, "onStart: no pending messages. Stopping service."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :cond_4
    invoke-static {p0}, Landroid_src/mms/transaction/p;->b(Landroid/content/Context;)V

    .line 205
    invoke-direct {p0, p3}, Landroid_src/mms/transaction/TransactionService;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    :cond_5
    move v0, v2

    .line 181
    goto/16 :goto_1

    :cond_6
    move v1, v2

    .line 185
    goto :goto_2

    .line 209
    :cond_7
    :try_start_1
    const-string v2, "msg_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 210
    const-string v3, "msg_type"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    .line 213
    if-eqz v0, :cond_9

    .line 215
    const/4 v4, 0x2

    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 216
    const-string v4, "fb-mms:TransactionService"

    const-string v5, "onStart: registerForConnectionStateChanges"

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :cond_8
    invoke-virtual {p0}, Landroid_src/mms/transaction/TransactionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid_src/mms/transaction/i;->a(Landroid/content/Context;)V

    .line 222
    :cond_9
    :goto_3
    :pswitch_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 223
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 224
    invoke-direct {p0, v4}, Landroid_src/mms/transaction/TransactionService;->c(I)I

    move-result v4

    .line 225
    if-eqz v0, :cond_a

    .line 226
    invoke-direct {p0, p3, v4}, Landroid_src/mms/transaction/TransactionService;->a(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 255
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    .line 229
    :cond_a
    packed-switch v4, :pswitch_data_0

    .line 244
    :cond_b
    :pswitch_1
    :try_start_2
    sget-object v5, Landroid_src/c/d;->a:Landroid/net/Uri;

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v5

    .line 247
    new-instance v6, Landroid_src/mms/transaction/s;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v4, v5}, Landroid_src/mms/transaction/s;-><init>(ILjava/lang/String;)V

    .line 250
    const/4 v4, 0x0

    invoke-direct {p0, p3, v6, v4}, Landroid_src/mms/transaction/TransactionService;->a(ILandroid_src/mms/transaction/s;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 255
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 236
    :pswitch_2
    :try_start_3
    const-string v5, "err_type"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 239
    invoke-static {v5}, Landroid_src/mms/transaction/TransactionService;->b(I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v5

    if-nez v5, :cond_b

    goto :goto_3

    .line 255
    :cond_c
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    .line 258
    :cond_d
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 259
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "onStart: no pending messages. Stopping service."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    :cond_e
    invoke-static {p0}, Landroid_src/mms/transaction/p;->b(Landroid/content/Context;)V

    .line 262
    invoke-direct {p0, p3}, Landroid_src/mms/transaction/TransactionService;->a(I)V

    goto/16 :goto_0

    .line 265
    :cond_f
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 266
    const-string v1, "fb-mms:TransactionService"

    const-string v2, "onStart: launch transaction..."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    :cond_10
    new-instance v1, Landroid_src/mms/transaction/s;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid_src/mms/transaction/s;-><init>(Landroid/os/Bundle;)V

    .line 270
    invoke-direct {p0, p3, v1, v0}, Landroid_src/mms/transaction/TransactionService;->a(ILandroid_src/mms/transaction/s;Z)V

    goto/16 :goto_0

    .line 229
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.class final Landroid_src/mms/transaction/v;
.super Landroid/os/Handler;
.source "TransactionService.java"


# instance fields
.field final synthetic a:Landroid_src/mms/transaction/TransactionService;


# direct methods
.method public constructor <init>(Landroid_src/mms/transaction/TransactionService;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 515
    iput-object p1, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    .line 516
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 517
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 533
    if-nez p1, :cond_0

    .line 534
    const-string v0, "NOTIFICATION_TRANSACTION"

    .line 542
    :goto_0
    return-object v0

    .line 535
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 536
    const-string v0, "RETRIEVE_TRANSACTION"

    goto :goto_0

    .line 537
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 538
    const-string v0, "SEND_TRANSACTION"

    goto :goto_0

    .line 539
    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 540
    const-string v0, "READREC_TRANSACTION"

    goto :goto_0

    .line 542
    :cond_3
    const-string v0, "invalid transaction type"

    goto :goto_0
.end method

.method private a(Landroid/os/Message;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 520
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    .line 521
    const-string v0, "EVENT_QUIT"

    .line 529
    :goto_0
    return-object v0

    .line 522
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 523
    const-string v0, "EVENT_CONTINUE_MMS_CONNECTIVITY"

    goto :goto_0

    .line 524
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 525
    const-string v0, "EVENT_TRANSACTION_REQUEST"

    goto :goto_0

    .line 526
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 527
    const-string v0, "EVENT_HANDLE_NEXT_PENDING_TRANSACTION"

    goto :goto_0

    .line 529
    :cond_3
    const-string v0, "unknown message.what"

    goto :goto_0
.end method

.method private a(Landroid_src/mms/transaction/r;)Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x2

    .line 776
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1

    .line 777
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->c(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/transaction/r;

    .line 778
    invoke-virtual {v0, p1}, Landroid_src/mms/transaction/r;->a(Landroid_src/mms/transaction/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 779
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 780
    const-string v0, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Transaction already pending: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    :cond_1
    monitor-exit v1

    .line 831
    :goto_0
    return v5

    .line 786
    :cond_2
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/transaction/r;

    .line 787
    invoke-virtual {v0, p1}, Landroid_src/mms/transaction/r;->a(Landroid_src/mms/transaction/r;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 788
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 789
    const-string v0, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Duplicated transaction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    :cond_4
    monitor-exit v1

    goto :goto_0

    .line 818
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 801
    :cond_5
    const/4 v0, 0x2

    :try_start_1
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 802
    const-string v0, "fb-mms:TransactionService"

    const-string v2, "processTransaction: call beginMmsConnectivity..."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    :cond_6
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->a()I

    move-result v0

    .line 805
    if-ne v0, v5, :cond_8

    .line 806
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->c(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 808
    const-string v0, "fb-mms:TransactionService"

    const-string v2, "processTransaction: connResult=APN_REQUEST_STARTED, defer transaction pending MMS connectivity"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    :cond_7
    monitor-exit v1

    goto :goto_0

    .line 814
    :cond_8
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 815
    const-string v0, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding transaction to \'mProcessing\' list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    :cond_9
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 821
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid_src/mms/transaction/v;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v1, 0x7530

    invoke-virtual {p0, v0, v1, v2}, Landroid_src/mms/transaction/v;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 824
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 825
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processTransaction: starting transaction "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 829
    :cond_a
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {p1, v0}, Landroid_src/mms/transaction/r;->a(Landroid_src/mms/transaction/l;)V

    .line 830
    invoke-virtual {p1}, Landroid_src/mms/transaction/r;->a()V

    goto/16 :goto_0
.end method


# virtual methods
.method public a(Landroid_src/mms/transaction/r;Landroid_src/mms/transaction/w;)V
    .locals 5

    .prologue
    const/4 v3, 0x2

    .line 717
    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 718
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processPendingTxn: transaction="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    :cond_0
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1

    .line 723
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->c(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_7

    .line 724
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->c(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/transaction/r;

    .line 726
    :goto_0
    iget-object v2, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v2}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 727
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 729
    if-eqz v0, :cond_5

    .line 730
    if-eqz p2, :cond_1

    .line 731
    invoke-virtual {v0, p2}, Landroid_src/mms/transaction/r;->a(Landroid_src/mms/transaction/w;)V

    .line 738
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid_src/mms/transaction/r;->e()I

    move-result v1

    .line 740
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 741
    const-string v2, "fb-mms:TransactionService"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "processPendingTxn: process "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    :cond_2
    invoke-direct {p0, v0}, Landroid_src/mms/transaction/v;->a(Landroid_src/mms/transaction/r;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 745
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 746
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Started deferred processing of transaction  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 764
    :cond_3
    :goto_1
    return-void

    .line 727
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 751
    :cond_4
    :try_start_3
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 753
    :catch_0
    move-exception v0

    .line 754
    const-string v1, "fb-mms:TransactionService"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 757
    :cond_5
    if-nez v2, :cond_3

    .line 758
    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 759
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "processPendingTxn: no more transaction, endMmsConnectivity"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    :cond_6
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    goto :goto_1

    :cond_7
    move-object v0, p1

    goto/16 :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v8, 0x2

    .line 552
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 553
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Handling incoming message: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0, p1}, Landroid_src/mms/transaction/v;->a(Landroid/os/Message;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 709
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "what="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    :cond_1
    :goto_0
    return-void

    .line 560
    :sswitch_0
    invoke-virtual {p0}, Landroid_src/mms/transaction/v;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    goto :goto_0

    .line 564
    :sswitch_1
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1

    .line 565
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 566
    monitor-exit v1

    goto :goto_0

    .line 568
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 570
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 571
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "handle EVENT_CONTINUE_MMS_CONNECTIVITY event..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    :cond_3
    :try_start_2
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->a()I

    move-result v0

    .line 576
    if-eqz v0, :cond_4

    .line 577
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Extending MMS connectivity returned "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " instead of APN_ALREADY_ACTIVE"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 583
    :catch_0
    move-exception v0

    .line 584
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "Attempt to extend use of MMS connectivity failed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 589
    :cond_4
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->b(Landroid_src/mms/transaction/TransactionService;)V

    goto :goto_0

    .line 593
    :sswitch_2
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 595
    :try_start_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid_src/mms/transaction/s;

    .line 598
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 599
    const-string v1, "fb-mms:TransactionService"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "EVENT_TRANSACTION_REQUEST MmscUrl="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " proxy port: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    :cond_5
    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->d()Ljava/lang/String;

    move-result-object v3

    .line 606
    if-eqz v3, :cond_8

    .line 607
    new-instance v1, Landroid_src/mms/transaction/w;

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->f()I

    move-result v6

    invoke-direct {v1, v3, v5, v6}, Landroid_src/mms/transaction/w;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object v3, v1

    .line 614
    :goto_1
    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->a()I

    move-result v1

    .line 616
    const/4 v5, 0x2

    invoke-static {v5}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 617
    const-string v5, "fb-mms:TransactionService"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "handle EVENT_TRANSACTION_REQUEST: transactionType="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-direct {p0, v1}, Landroid_src/mms/transaction/v;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 622
    :cond_6
    packed-switch v1, :pswitch_data_0

    .line 663
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid transaction type: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 696
    if-nez v2, :cond_1

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 698
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction was null. Stopping self: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_7
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    goto/16 :goto_0

    .line 610
    :cond_8
    :try_start_4
    new-instance v1, Landroid_src/mms/transaction/w;

    iget-object v3, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5}, Landroid_src/mms/transaction/w;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v3, v1

    goto/16 :goto_1

    .line 624
    :pswitch_0
    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->b()Ljava/lang/String;

    move-result-object v5

    .line 625
    if-eqz v5, :cond_a

    .line 626
    new-instance v1, Landroid_src/mms/transaction/j;

    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-direct {v1, v0, v4, v3, v5}, Landroid_src/mms/transaction/j;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 668
    :goto_2
    :try_start_5
    invoke-direct {p0, v1}, Landroid_src/mms/transaction/v;->a(Landroid_src/mms/transaction/r;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-result v0

    if-nez v0, :cond_11

    .line 696
    if-nez v2, :cond_1

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 698
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction was null. Stopping self: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_9
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    goto/16 :goto_0

    .line 631
    :cond_a
    :try_start_6
    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->c()[B

    move-result-object v0

    .line 632
    new-instance v1, Landroid_src/mms/e/r;

    invoke-direct {v1, v0}, Landroid_src/mms/e/r;-><init>([B)V

    .line 633
    invoke-virtual {v1}, Landroid_src/mms/e/r;->a()Landroid_src/mms/e/f;

    move-result-object v0

    .line 635
    const/16 v1, 0x82

    .line 636
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid_src/mms/e/f;->f()I

    move-result v5

    if-ne v5, v1, :cond_d

    .line 637
    new-instance v1, Landroid_src/mms/transaction/j;

    iget-object v5, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    check-cast v0, Landroid_src/mms/e/h;

    invoke-direct {v1, v5, v4, v3, v0}, Landroid_src/mms/transaction/j;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Landroid_src/mms/e/h;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    .line 676
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 677
    :goto_3
    :try_start_7
    const-string v3, "fb-mms:TransactionService"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception occurred while handling message: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 679
    if-eqz v1, :cond_14

    .line 681
    :try_start_8
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v1, v0}, Landroid_src/mms/transaction/r;->b(Landroid_src/mms/transaction/l;)V

    .line 682
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 683
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v3

    monitor-enter v3
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 684
    :try_start_9
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->a(Landroid_src/mms/transaction/TransactionService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 685
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 696
    :cond_b
    :goto_4
    if-nez v2, :cond_1

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 698
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction was null. Stopping self: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_c
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    goto/16 :goto_0

    .line 641
    :cond_d
    :try_start_a
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "Invalid PUSH data."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 696
    if-nez v2, :cond_1

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 698
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction was null. Stopping self: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_e
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    goto/16 :goto_0

    .line 648
    :pswitch_1
    :try_start_b
    new-instance v1, Landroid_src/mms/transaction/o;

    iget-object v5, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v5, v4, v3, v0}, Landroid_src/mms/transaction/o;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto/16 :goto_2

    .line 696
    :catchall_1
    move-exception v0

    :goto_5
    if-nez v2, :cond_10

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 698
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Transaction was null. Stopping self: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_f
    iget-object v1, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v1}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v1, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v1, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    :cond_10
    throw v0

    .line 653
    :pswitch_2
    :try_start_c
    new-instance v1, Landroid_src/mms/transaction/q;

    iget-object v5, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v5, v4, v3, v0}, Landroid_src/mms/transaction/q;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 658
    :pswitch_3
    new-instance v1, Landroid_src/mms/transaction/n;

    iget-object v5, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v5, v4, v3, v0}, Landroid_src/mms/transaction/n;-><init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto/16 :goto_2

    .line 673
    :cond_11
    const/4 v0, 0x2

    :try_start_d
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 674
    const-string v0, "fb-mms:TransactionService"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Started processing of incoming message: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 696
    :cond_12
    if-nez v1, :cond_1

    .line 697
    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 698
    const-string v0, "fb-mms:TransactionService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction was null. Stopping self: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_13
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid_src/mms/transaction/TransactionService;->b()V

    .line 701
    iget-object v0, p0, Landroid_src/mms/transaction/v;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0, v4}, Landroid_src/mms/transaction/TransactionService;->stopSelf(I)V

    goto/16 :goto_0

    .line 685
    :catchall_2
    move-exception v0

    :try_start_e
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 687
    :catch_2
    move-exception v0

    .line 688
    :try_start_10
    const-string v1, "fb-mms:TransactionService"

    const-string v3, "Unexpected Throwable."

    invoke-static {v1, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    goto/16 :goto_4

    .line 692
    :catchall_3
    move-exception v0

    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 706
    :sswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid_src/mms/transaction/w;

    invoke-virtual {p0, v2, v0}, Landroid_src/mms/transaction/v;->a(Landroid_src/mms/transaction/r;Landroid_src/mms/transaction/w;)V

    goto/16 :goto_0

    .line 696
    :catchall_4
    move-exception v0

    move-object v2, v1

    goto/16 :goto_5

    .line 676
    :catch_3
    move-exception v0

    goto/16 :goto_3

    :cond_14
    move-object v2, v1

    goto/16 :goto_4

    .line 558
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x3 -> :sswitch_1
        0x4 -> :sswitch_3
        0x64 -> :sswitch_0
    .end sparse-switch

    .line 622
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

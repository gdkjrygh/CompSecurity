.class public Lcom/facebook/orca/g/u;
.super Lcom/facebook/orca/server/a;
.source "DbServiceHandler.java"


# instance fields
.field private a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/base/broadcast/a;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/orca/g/k;

.field private final e:Lcom/facebook/orca/g/h;

.field private final f:Lcom/facebook/orca/g/n;

.field private final g:Lcom/facebook/orca/g/m;

.field private final h:Lcom/facebook/orca/g/t;

.field private final i:Lcom/facebook/orca/g/y;

.field private final j:Lcom/facebook/orca/g/aa;

.field private final k:Lcom/facebook/orca/threads/i;


# direct methods
.method constructor <init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/orca/f/k;Lcom/facebook/orca/g/k;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/n;Lcom/facebook/orca/g/m;Lcom/facebook/orca/g/t;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/threads/i;)V
    .locals 1

    .prologue
    .line 90
    const-string v0, "DbServiceHandler"

    invoke-direct {p0, v0}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 65
    const-class v0, Lcom/facebook/orca/g/u;

    iput-object v0, p0, Lcom/facebook/orca/g/u;->a:Ljava/lang/Class;

    .line 91
    iput-object p1, p0, Lcom/facebook/orca/g/u;->b:Lcom/facebook/base/broadcast/a;

    .line 92
    iput-object p2, p0, Lcom/facebook/orca/g/u;->c:Lcom/facebook/orca/f/k;

    .line 93
    iput-object p3, p0, Lcom/facebook/orca/g/u;->d:Lcom/facebook/orca/g/k;

    .line 94
    iput-object p4, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    .line 95
    iput-object p5, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    .line 96
    iput-object p6, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    .line 97
    iput-object p7, p0, Lcom/facebook/orca/g/u;->h:Lcom/facebook/orca/g/t;

    .line 98
    iput-object p8, p0, Lcom/facebook/orca/g/u;->i:Lcom/facebook/orca/g/y;

    .line 99
    iput-object p9, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    .line 100
    iput-object p10, p0, Lcom/facebook/orca/g/u;->k:Lcom/facebook/orca/threads/i;

    .line 101
    return-void
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8

    .prologue
    .line 614
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 615
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    .line 617
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 619
    :cond_0
    const/4 p2, 0x0

    .line 660
    :cond_1
    :goto_0
    return-object p2

    .line 622
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    if-eq v1, v2, :cond_1

    .line 629
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/g/u;->b(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    .line 631
    invoke-direct {p0, p1, v1, p3}, Lcom/facebook/orca/g/u;->c(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    iget-object v1, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 660
    new-instance p2, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-direct {p2, v1, v0}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/server/FetchThreadResult;)V

    goto :goto_0

    .line 632
    :catch_0
    move-exception v0

    .line 639
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->c()Lcom/facebook/fbservice/service/s;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-eq v1, v2, :cond_3

    .line 643
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_HAD_SERVER_ERROR:Lcom/facebook/fbservice/c/b;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v5

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    move-object p2, v0

    goto :goto_0

    .line 651
    :cond_3
    throw v0
.end method

.method private a(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/server/FetchThreadResult;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 730
    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne p1, v1, :cond_1

    .line 734
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 668
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    .line 669
    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/g/u;->a(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/server/FetchThreadResult;)Z

    move-result v0

    .line 672
    if-nez v0, :cond_0

    .line 718
    :goto_0
    return-object p2

    .line 678
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    .line 680
    invoke-virtual {v3}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 681
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v2, v0

    .line 687
    :goto_1
    const-wide/16 v0, -0x1

    .line 688
    if-eqz v2, :cond_2

    .line 689
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    const-wide/16 v6, 0x1

    sub-long/2addr v0, v6

    .line 692
    :cond_2
    new-instance v2, Lcom/facebook/orca/server/ac;

    invoke-direct {v2}, Lcom/facebook/orca/server/ac;-><init>()V

    invoke-virtual {v2, p1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/ac;

    move-result-object v2

    sget-object v4, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/server/ac;->b(J)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 698
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 699
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 700
    new-instance v0, Lcom/facebook/fbservice/service/ad;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v0, v2, v1}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    invoke-interface {p3, v0}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 702
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/facebook/orca/server/FetchThreadResult;

    .line 704
    iget-object v0, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 705
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 707
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v0, p2, v4}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 708
    iget-object v0, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 709
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 711
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 715
    iget-object v0, p0, Lcom/facebook/orca/g/u;->k:Lcom/facebook/orca/threads/i;

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/facebook/orca/threads/i;->b(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    .line 718
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    move-object p2, v0

    goto/16 :goto_0

    .line 711
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :cond_3
    move-object v2, v5

    goto/16 :goto_1
.end method

.method private c(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 10

    .prologue
    .line 744
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 786
    :cond_0
    :goto_0
    return-object p2

    .line 750
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v8

    .line 751
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v7

    .line 752
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v9

    .line 753
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    .line 754
    invoke-virtual {v7}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v1

    .line 755
    sub-int v6, v0, v1

    .line 758
    if-lez v6, :cond_0

    .line 762
    invoke-virtual {v7}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v7, v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v4

    .line 764
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    invoke-static {v9}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v4

    add-int/lit8 v6, v6, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreMessagesParams;-><init>(Lcom/facebook/orca/server/ThreadCriteria;JJI)V

    .line 770
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 771
    const-string v2, "fetchMoreMessagesParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 772
    new-instance v0, Lcom/facebook/fbservice/service/ad;

    sget-object v2, Lcom/facebook/orca/server/aq;->u:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v0, v2, v1}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    invoke-interface {p3, v0}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 774
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 777
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v9, p2, v0}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchMoreMessagesResult;)V

    .line 781
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 782
    iget-object v1, p0, Lcom/facebook/orca/g/u;->k:Lcom/facebook/orca/threads/i;

    invoke-virtual {v1, v7, v0}, Lcom/facebook/orca/threads/i;->b(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    .line 786
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object v2, v8

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    move-object p2, v0

    goto :goto_0
.end method


# virtual methods
.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 189
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v6

    .line 190
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 191
    const-string v1, "fetchThreadListParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 192
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v1

    .line 194
    const-string v4, "DbServiceHandler.handleFetchThreadList"

    invoke-static {v4}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v7

    .line 198
    :try_start_0
    iget-object v4, p0, Lcom/facebook/orca/g/u;->d:Lcom/facebook/orca/g/k;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v4

    .line 202
    sget-object v5, Lcom/facebook/orca/g/v;->a:[I

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/s;->ordinal()I

    move-result v1

    aget v1, v5, v1

    packed-switch v1, :pswitch_data_0

    move v1, v3

    .line 223
    :goto_0
    if-eqz v1, :cond_2

    .line 225
    invoke-static {v4}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 270
    :goto_1
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 204
    :pswitch_0
    :try_start_1
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v5, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v1, v5, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_0

    :pswitch_1
    move v1, v2

    .line 209
    goto :goto_0

    .line 213
    :pswitch_2
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v5, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    if-ne v1, v5, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_0

    .line 227
    :cond_2
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListResult;->k()J

    move-result-wide v4

    .line 228
    const-wide/16 v8, 0x0

    cmp-long v1, v4, v8

    if-lez v1, :cond_3

    move v3, v2

    .line 231
    :cond_3
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/y;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;

    move-result-object v8

    if-eqz v3, :cond_5

    move-wide v1, v4

    :goto_2
    invoke-virtual {v8, v1, v2}, Lcom/facebook/orca/server/y;->a(J)Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v4

    .line 237
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 238
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 240
    new-instance v2, Lcom/facebook/fbservice/service/ad;

    invoke-direct {v2, v6, v1}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    invoke-interface {p2, v2}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 242
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 243
    const-string v5, "DbServiceHandler.handleFetchThreadList#insertData"

    invoke-static {v5}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v5

    .line 244
    iget-object v6, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v6}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 245
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    :try_start_2
    iget-object v8, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v8, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadListResult;)V

    .line 248
    iget-object v8, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadListResult;->c()Lcom/google/common/a/es;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 249
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    :try_start_3
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 252
    invoke-virtual {v5}, Lcom/facebook/debug/d/e;->a()J

    .line 254
    if-nez v3, :cond_4

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    sget-object v4, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-ne v3, v4, :cond_6

    .line 258
    :cond_4
    iget-object v2, p0, Lcom/facebook/orca/g/u;->d:Lcom/facebook/orca/g/k;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 261
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/server/FetchThreadListResult;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadListResult;->i()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 265
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_1

    .line 231
    :cond_5
    const-wide/16 v1, -0x1

    goto :goto_2

    .line 251
    :catchall_0
    move-exception v0

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 252
    invoke-virtual {v5}, Lcom/facebook/debug/d/e;->a()J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 270
    :catchall_1
    move-exception v0

    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    :cond_6
    move-object v0, v2

    goto/16 :goto_1

    .line 202
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 278
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 279
    const-string v1, "fetchMoreThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/g/u;->d:Lcom/facebook/orca/g/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/orca/server/FetchMoreThreadsResult;

    move-result-object v1

    .line 284
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadsCollection;->e()I

    move-result v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v3

    if-ne v2, v3, :cond_1

    .line 286
    :cond_0
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 298
    :goto_0
    return-object v0

    .line 288
    :cond_1
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 289
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    .line 290
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchMoreThreadsResult;)V

    .line 291
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-ne v1, v3, :cond_2

    .line 294
    iget-object v1, p0, Lcom/facebook/orca/g/u;->d:Lcom/facebook/orca/g/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/orca/server/FetchMoreThreadsResult;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    goto :goto_0
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/orca/g/u;->h:Lcom/facebook/orca/g/t;

    invoke-virtual {v0}, Lcom/facebook/orca/g/t;->a()V

    .line 306
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 307
    const-string v1, "fetchThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 308
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    .line 309
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v3

    .line 310
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    .line 312
    const-string v4, "DbServiceHandler.handleFetchThread"

    invoke-static {v4}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v4

    .line 315
    :try_start_0
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 319
    iget-object v5, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v3}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    .line 333
    :goto_0
    sget-object v5, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    if-ne v2, v5, :cond_2

    .line 334
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 376
    :goto_1
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 323
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 324
    iget-object v5, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v5, v1, v3}, Lcom/facebook/orca/g/h;->a(Lcom/facebook/user/UserKey;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    goto :goto_0

    .line 329
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No threadid or userkey specified for thread fetch"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 376
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    .line 337
    :cond_2
    :try_start_2
    invoke-direct {p0, v0, v1, p2}, Lcom/facebook/orca/g/u;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 339
    if-eqz v0, :cond_3

    .line 340
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_1

    .line 342
    :cond_3
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 343
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 344
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 345
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 347
    :try_start_3
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 348
    iget-object v5, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v5, v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 350
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 351
    iget-object v1, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 354
    :cond_5
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 356
    :try_start_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 359
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 362
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 363
    iget-object v1, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v1, v0, v3}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    .line 364
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-direct {v0, v2, v1}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 371
    :goto_2
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_1

    .line 356
    :catchall_1
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 366
    :cond_6
    new-instance v1, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-direct {v1, v2, v0}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/server/FetchThreadResult;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v1

    goto :goto_2
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/g/u;->h:Lcom/facebook/orca/g/t;

    invoke-virtual {v0}, Lcom/facebook/orca/g/t;->a()V

    .line 108
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 109
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 110
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 111
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 113
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 114
    iget-object v3, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 115
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 119
    return-object v1

    .line 117
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/orca/g/u;->h:Lcom/facebook/orca/g/t;

    invoke-virtual {v0}, Lcom/facebook/orca/g/t;->a()V

    .line 127
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendBroadcastResult;

    .line 129
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 130
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 132
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 133
    iget-object v4, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 134
    iget-object v4, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 136
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 140
    return-object v1
.end method

.method protected g(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/orca/g/u;->h:Lcom/facebook/orca/g/t;

    invoke-virtual {v0}, Lcom/facebook/orca/g/t;->a()V

    .line 149
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 150
    const-string v1, "outgoingMessage"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 151
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 153
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 170
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 171
    const-string v1, "addMembersParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/AddMembersParams;

    .line 172
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 174
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 175
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 177
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 178
    iget-object v3, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 179
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 183
    return-object v1

    .line 181
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 462
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 463
    const-string v1, "removeMemberParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/RemoveMemberParams;

    .line 464
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 465
    iget-object v0, p0, Lcom/facebook/orca/g/u;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/f/k;->a()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    .line 466
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 467
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 468
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 470
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 471
    iget-object v3, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 472
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/g/u;->b:Lcom/facebook/base/broadcast/a;

    const-string v3, "com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS"

    invoke-virtual {v0, v3}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 475
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 477
    return-object v1

    .line 475
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 484
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 485
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 491
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/MarkThreadParams;)V

    .line 493
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 494
    return-object v0
.end method

.method protected k(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 501
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 502
    const-string v1, "readReceiptParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ReadReceiptParams;

    .line 503
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/ReadReceiptParams;)V

    .line 505
    iget-object v1, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ReadReceiptParams;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 507
    new-instance v1, Lcom/facebook/orca/server/ReceiptResult;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/orca/server/ReceiptResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 510
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected l(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 517
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 518
    const-string v1, "deliveredReceiptParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeliveredReceiptParams;

    .line 519
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/DeliveredReceiptParams;)V

    .line 521
    iget-object v1, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v0}, Lcom/facebook/orca/server/DeliveredReceiptParams;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 523
    new-instance v1, Lcom/facebook/orca/server/ReceiptResult;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/facebook/orca/server/ReceiptResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 526
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 533
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 534
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 535
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 536
    iget-object v2, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/DeleteThreadParams;)V

    .line 537
    return-object v1
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 10

    .prologue
    const-wide/16 v2, -0x1

    const/4 v6, 0x1

    .line 544
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 545
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 548
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 549
    invoke-virtual {v7}, Lcom/facebook/orca/server/DeleteMessagesParams;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 550
    invoke-static {v0}, Lcom/facebook/orca/threads/m;->f(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->h(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 553
    :cond_1
    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 556
    :cond_2
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    .line 557
    invoke-virtual {v0}, Lcom/google/common/a/fi;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 558
    new-instance v1, Lcom/facebook/orca/server/DeleteMessagesParams;

    invoke-virtual {v7}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Lcom/facebook/orca/server/DeleteMessagesParams;-><init>(Ljava/lang/String;Lcom/google/common/a/fi;)V

    .line 561
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 562
    const-string v4, "deleteMessagesParams"

    invoke-virtual {v0, v4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 563
    new-instance v1, Lcom/facebook/fbservice/service/ad;

    sget-object v4, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v1, v4, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 565
    invoke-interface {p2, v1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    .line 567
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v0, v7}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/DeleteMessagesParams;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v9

    .line 571
    const/4 v8, 0x0

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v7}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v1

    move-wide v4, v2

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;JJI)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    .line 574
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 576
    iget-object v0, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    new-instance v1, Lcom/facebook/orca/server/DeleteThreadParams;

    invoke-virtual {v7}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/orca/server/DeleteThreadParams;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/DeleteThreadParams;)V

    .line 580
    :goto_1
    new-instance v0, Lcom/facebook/orca/server/DeleteMessagesResult;

    invoke-direct {v0, v9, v6}, Lcom/facebook/orca/server/DeleteMessagesResult;-><init>(Ljava/util/Map;Z)V

    .line 584
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    :cond_4
    move v6, v8

    goto :goto_1
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 591
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    .line 592
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 593
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 594
    iget-object v2, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v2}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 595
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 597
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 598
    iget-object v3, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 599
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 601
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 603
    return-object v1

    .line 601
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method protected p(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 160
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 161
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 162
    const-string v2, "draft"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/MessageDraft;

    .line 163
    iget-object v2, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 164
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected r(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    .line 799
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 800
    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/facebook/messages/model/threads/Message;

    .line 803
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    .line 804
    sget-object v1, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 806
    :cond_0
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    .line 810
    :cond_1
    invoke-static {v0}, Lcom/facebook/orca/g/s;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v0

    .line 811
    iget-object v1, p0, Lcom/facebook/orca/g/u;->i:Lcom/facebook/orca/g/y;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;Z)V

    .line 813
    new-instance v0, Lcom/facebook/orca/server/NewMessageResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V

    .line 819
    iget-object v1, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/NewMessageResult;)Lcom/facebook/orca/server/NewMessageResult;

    move-result-object v0

    .line 820
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected s(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 384
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 385
    const-string v1, "fetchGroupThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchGroupThreadsParams;

    .line 388
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 389
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchGroupThreadsResult;

    .line 390
    iget-object v3, p0, Lcom/facebook/orca/g/u;->j:Lcom/facebook/orca/g/aa;

    invoke-virtual {v3}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 391
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 393
    :try_start_0
    iget-object v4, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v4, v0, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchGroupThreadsParams;Lcom/facebook/orca/server/FetchGroupThreadsResult;)V

    .line 397
    iget-object v0, p0, Lcom/facebook/orca/g/u;->g:Lcom/facebook/orca/g/m;

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/m;->a(Ljava/util/List;)V

    .line 398
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 400
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 402
    return-object v2

    .line 400
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 408
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 409
    const-string v1, "fetchMoreMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 411
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    .line 412
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    .line 414
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v2

    .line 415
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v4

    .line 416
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v6

    .line 418
    const-string v0, "DbServiceHandler.handleFetchThread"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v7

    .line 421
    :try_start_0
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 425
    iget-object v0, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;JJI)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    move-object v2, v0

    .line 443
    :goto_0
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 444
    sget-object v1, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a:Lcom/facebook/orca/server/FetchMoreMessagesResult;

    if-eq v2, v1, :cond_3

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-eq v1, v6, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 447
    :cond_0
    invoke-static {v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 455
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    :goto_1
    return-object v0

    .line 431
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 432
    iget-object v0, p0, Lcom/facebook/orca/g/u;->e:Lcom/facebook/orca/g/h;

    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/g/h;->a(Lcom/facebook/user/UserKey;JJI)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    .line 439
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No threadid or userkey specified for more messages fetch"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 455
    :catchall_0
    move-exception v0

    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    .line 449
    :cond_3
    :try_start_2
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 450
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 451
    iget-object v3, p0, Lcom/facebook/orca/g/u;->f:Lcom/facebook/orca/g/n;

    invoke-virtual {v3, v2, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchMoreMessagesResult;Lcom/facebook/orca/server/FetchMoreMessagesResult;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 455
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    move-object v0, v1

    goto :goto_1
.end method

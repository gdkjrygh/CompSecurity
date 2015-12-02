.class public Lcom/facebook/orca/contacts/divebar/ad;
.super Landroid/support/v4/a/a;
.source "DivebarLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/a/a",
        "<",
        "Lcom/facebook/orca/contacts/divebar/an;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:Ljava/util/concurrent/Executor;

.field private final B:Lcom/facebook/contacts/data/p;

.field private C:Lcom/facebook/orca/contacts/divebar/am;

.field private D:Lcom/facebook/orca/contacts/divebar/an;

.field private E:Ljava/lang/Object;

.field private F:Lcom/facebook/fbservice/ops/m;

.field private G:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private H:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "dataLoadLock"
    .end annotation
.end field

.field private I:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final m:Lcom/facebook/orca/contacts/divebar/e;

.field private final n:Lcom/facebook/contacts/a/d;

.field private final o:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/z;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Lcom/facebook/l/k;

.field private final r:Lcom/facebook/base/broadcast/q;

.field private final s:Lcom/facebook/l/v;

.field private final t:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Lcom/facebook/contacts/data/k;

.field private final x:Lcom/facebook/fbservice/ops/k;

.field private final y:Lcom/facebook/common/executors/a;

.field private final z:Lcom/google/common/d/a/u;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/contacts/a/d;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/l/k;Lcom/facebook/fbservice/ops/k;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/common/executors/a;Lcom/facebook/contacts/data/k;Lcom/facebook/contacts/data/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/orca/contacts/divebar/e;",
            "Lcom/facebook/contacts/a/d;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/z;",
            ">;",
            "Lcom/facebook/l/k;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/google/common/d/a/u;",
            "Ljava/util/concurrent/Executor;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/contacts/data/p;",
            ")V"
        }
    .end annotation

    .prologue
    .line 287
    invoke-direct {p0, p1}, Landroid/support/v4/a/a;-><init>(Landroid/content/Context;)V

    .line 197
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    .line 201
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    .line 289
    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->y:Lcom/facebook/common/executors/a;

    .line 290
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    .line 291
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/ad;->n:Lcom/facebook/contacts/a/d;

    .line 292
    iput-object p4, p0, Lcom/facebook/orca/contacts/divebar/ad;->o:Ljavax/inject/a;

    .line 293
    iput-object p5, p0, Lcom/facebook/orca/contacts/divebar/ad;->p:Ljavax/inject/a;

    .line 294
    iput-object p6, p0, Lcom/facebook/orca/contacts/divebar/ad;->q:Lcom/facebook/l/k;

    .line 295
    iput-object p11, p0, Lcom/facebook/orca/contacts/divebar/ad;->u:Ljavax/inject/a;

    .line 296
    iput-object p10, p0, Lcom/facebook/orca/contacts/divebar/ad;->t:Ljavax/inject/a;

    .line 297
    iput-object p12, p0, Lcom/facebook/orca/contacts/divebar/ad;->v:Ljavax/inject/a;

    .line 298
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->w:Lcom/facebook/contacts/data/k;

    .line 299
    iput-object p7, p0, Lcom/facebook/orca/contacts/divebar/ad;->x:Lcom/facebook/fbservice/ops/k;

    .line 300
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->B:Lcom/facebook/contacts/data/p;

    .line 301
    iput-object p8, p0, Lcom/facebook/orca/contacts/divebar/ad;->z:Lcom/google/common/d/a/u;

    .line 302
    iput-object p9, p0, Lcom/facebook/orca/contacts/divebar/ad;->A:Ljava/util/concurrent/Executor;

    .line 304
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 305
    const-string v2, "com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 306
    const-string v2, "com.facebook.orca.FAVORITE_CONTACT_SYNC_PROGRESS"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 307
    const-string v2, "com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 308
    new-instance v2, Lcom/facebook/orca/contacts/divebar/ae;

    invoke-direct {v2, p0, p1, v1}, Lcom/facebook/orca/contacts/divebar/ae;-><init>(Lcom/facebook/orca/contacts/divebar/ad;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->r:Lcom/facebook/base/broadcast/q;

    .line 316
    new-instance v1, Lcom/facebook/orca/contacts/divebar/af;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/af;-><init>(Lcom/facebook/orca/contacts/divebar/ad;)V

    iput-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->s:Lcom/facebook/l/v;

    .line 323
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->B:Lcom/facebook/contacts/data/p;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/ag;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/ag;-><init>(Lcom/facebook/orca/contacts/divebar/ad;)V

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/contacts/data/r;)V

    .line 334
    return-void
.end method

.method private A()Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 812
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 813
    const-string v1, "syncToCacheParams"

    new-instance v2, Lcom/facebook/contacts/server/SyncToCacheParams;

    sget-object v3, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-direct {v2, v3}, Lcom/facebook/contacts/server/SyncToCacheParams;-><init>(Lcom/facebook/fbservice/service/s;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 815
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->x:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->b()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 820
    const/4 v1, 0x0

    .line 822
    :try_start_0
    invoke-interface {v0}, Lcom/google/common/d/a/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 828
    :goto_0
    if-nez v0, :cond_0

    .line 829
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 833
    :goto_1
    return-object v0

    .line 823
    :catch_0
    move-exception v0

    .line 824
    const-string v2, "orca:FriendListsLoader"

    const-string v3, "Failure during SYNC_TOP_LAST_ACTIVE"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 827
    goto :goto_0

    .line 825
    :catch_1
    move-exception v0

    .line 826
    const-string v2, "orca:FriendListsLoader"

    const-string v3, "Failure during SYNC_TOP_LAST_ACTIVE"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0

    .line 832
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchLastActiveResult;

    .line 833
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_1
.end method

.method private B()Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 837
    const-string v0, "getFavoriteFriends"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 838
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 839
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 840
    invoke-interface {v0}, Lcom/facebook/user/e;->b()V

    .line 842
    :try_start_0
    const-string v1, "#fetch"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 844
    :goto_0
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 845
    invoke-virtual {v3, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 848
    :catch_0
    move-exception v1

    .line 849
    :try_start_1
    const-string v4, "orca:FriendListsLoader"

    const-string v5, "Exception reading favorite users"

    invoke-static {v4, v5, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 851
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 853
    :goto_1
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 854
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 847
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 851
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1
.end method

.method private C()Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 859
    const-string v0, "getTopFriends"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 860
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 861
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 862
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-static {v1}, Lcom/facebook/orca/contacts/divebar/am;->a(Lcom/facebook/orca/contacts/divebar/am;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/facebook/user/e;->a(I)V

    .line 864
    :try_start_0
    const-string v1, "#fetch"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 866
    :goto_0
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 867
    invoke-virtual {v3, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 870
    :catch_0
    move-exception v1

    .line 871
    :try_start_1
    const-string v4, "orca:FriendListsLoader"

    const-string v5, "Exception reading facebook users"

    invoke-static {v4, v5, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 873
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 875
    :goto_1
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 876
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 869
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 873
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1
.end method

.method private D()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 928
    const-string v0, "getOnlineFriends"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 929
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->q:Lcom/facebook/l/k;

    invoke-virtual {v1}, Lcom/facebook/l/k;->c()Ljava/util/Collection;

    move-result-object v1

    .line 930
    invoke-direct {p0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    .line 931
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 932
    return-object v1
.end method

.method private E()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 937
    const-string v0, "getMobileFriends"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 938
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->q:Lcom/facebook/l/k;

    invoke-virtual {v1}, Lcom/facebook/l/k;->d()Ljava/util/Collection;

    move-result-object v1

    .line 939
    invoke-direct {p0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    .line 940
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 941
    return-object v1
.end method

.method private F()Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 963
    const-string v0, "getTopGroups"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 964
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 965
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->p:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/z;

    .line 967
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-static {v1}, Lcom/facebook/orca/contacts/divebar/am;->b(Lcom/facebook/orca/contacts/divebar/am;)I

    move-result v1

    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-static {v4}, Lcom/facebook/orca/contacts/divebar/am;->c(Lcom/facebook/orca/contacts/divebar/am;)J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lcom/facebook/orca/g/z;->a(IJ)V

    .line 968
    const-string v1, "#fetch"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 970
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->a()Lcom/facebook/orca/threads/v;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 971
    invoke-virtual {v4}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 974
    :catch_0
    move-exception v1

    .line 975
    :try_start_1
    const-string v4, "orca:FriendListsLoader"

    const-string v5, "Exception reading thread summary"

    invoke-static {v4, v5, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 977
    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->b()V

    .line 979
    :goto_1
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 980
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 973
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 977
    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->b()V

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/orca/g/z;->b()V

    throw v1
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;Lcom/google/common/a/es;)Lcom/facebook/orca/contacts/divebar/an;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/contacts/divebar/an;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/facebook/orca/contacts/divebar/an;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x1

    .line 443
    if-nez p1, :cond_0

    move-object v0, v5

    .line 507
    :goto_0
    return-object v0

    .line 447
    :cond_0
    const/4 v2, 0x0

    .line 448
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v6

    .line 449
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 450
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-interface {v6, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 453
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v0

    .line 454
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v4

    .line 455
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->e()Lcom/google/common/a/es;

    move-result-object v7

    .line 456
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v8

    .line 458
    invoke-direct {p0, v0, v6}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/google/common/a/es;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v1

    .line 462
    if-eq v1, v0, :cond_6

    .line 464
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->n:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/a/d;->a(Lcom/google/common/a/es;)V

    move v0, v3

    .line 468
    :goto_2
    invoke-direct {p0, v4, v6}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/google/common/a/es;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v2

    .line 472
    if-eq v2, v4, :cond_5

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/e;->a(Lcom/google/common/a/es;)V

    move v0, v3

    .line 478
    :goto_3
    invoke-direct {p0, v7, v6}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/google/common/a/es;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v4

    .line 481
    if-eq v4, v7, :cond_2

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/contacts/divebar/e;->d(Lcom/google/common/a/es;)V

    move v0, v3

    .line 487
    :cond_2
    invoke-direct {p0, v8, v6}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/google/common/a/es;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v4

    .line 490
    if-eq v4, v8, :cond_4

    .line 492
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/contacts/divebar/e;->c(Lcom/google/common/a/es;)V

    .line 496
    :goto_4
    if-eqz v3, :cond_3

    .line 497
    new-instance v0, Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->c()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->e()Lcom/google/common/a/es;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->f()Lcom/google/common/a/es;

    move-result-object v6

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->y()Z

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/contacts/divebar/an;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Z)V

    goto :goto_0

    :cond_3
    move-object v0, v5

    .line 507
    goto :goto_0

    :cond_4
    move v3, v0

    goto :goto_4

    :cond_5
    move-object v2, v4

    goto :goto_3

    :cond_6
    move-object v1, v0

    move v0, v2

    goto :goto_2
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 884
    const-string v0, "getOtherContacts"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 885
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 886
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 888
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v4

    .line 889
    if-eqz p1, :cond_0

    .line 890
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    .line 891
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/google/common/a/eo;->a(Ljava/lang/Object;)Lcom/google/common/a/eo;

    goto :goto_0

    .line 895
    :cond_0
    if-eqz p2, :cond_1

    .line 896
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    .line 897
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/google/common/a/eo;->a(Ljava/lang/Object;)Lcom/google/common/a/eo;

    goto :goto_1

    .line 901
    :cond_1
    if-eqz p3, :cond_2

    .line 902
    invoke-virtual {p3}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    .line 903
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/google/common/a/eo;->a(Ljava/lang/Object;)Lcom/google/common/a/eo;

    goto :goto_2

    .line 908
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->v:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/google/common/a/eo;->a(Ljava/lang/Object;)Lcom/google/common/a/eo;

    .line 910
    invoke-virtual {v4}, Lcom/google/common/a/eo;->a()Lcom/google/common/a/em;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/user/e;->a(Lcom/google/common/a/em;)V

    .line 912
    :try_start_0
    const-string v1, "#fetch"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    .line 914
    :goto_3
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 915
    invoke-virtual {v3, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 917
    :catch_0
    move-exception v1

    .line 918
    :try_start_1
    const-string v1, "orca:FriendListsLoader"

    const-string v4, "Exception reading facebook users"

    invoke-static {v1, v4}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 920
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 922
    :goto_4
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 923
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 920
    :cond_3
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    goto :goto_4

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1
.end method

.method private a(Lcom/google/common/a/es;Ljava/util/Map;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/LastActive;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 534
    if-nez p1, :cond_1

    .line 535
    const/4 p1, 0x0

    .line 561
    :cond_0
    :goto_0
    return-object p1

    .line 537
    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 541
    const/4 v0, 0x0

    .line 542
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 545
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 546
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/LastActive;

    .line 547
    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v5

    invoke-static {v5, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 548
    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    move v0, v2

    :goto_2
    move v2, v0

    .line 556
    goto :goto_1

    .line 550
    :cond_2
    new-instance v2, Lcom/facebook/user/o;

    invoke-direct {v2}, Lcom/facebook/user/o;-><init>()V

    .line 551
    invoke-virtual {v2, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/User;)Lcom/facebook/user/o;

    .line 552
    invoke-virtual {v2, v1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/LastActive;)Lcom/facebook/user/o;

    .line 553
    invoke-virtual {v2}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 554
    const/4 v0, 0x1

    goto :goto_2

    .line 558
    :cond_3
    if-eqz v2, :cond_0

    .line 559
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object p1

    goto :goto_0
.end method

.method private a(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 945
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 946
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 947
    invoke-interface {v0, p1}, Lcom/facebook/user/e;->a(Ljava/util/Collection;)V

    .line 950
    :goto_0
    :try_start_0
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 951
    invoke-virtual {v2, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 953
    :catch_0
    move-exception v1

    .line 954
    :try_start_1
    const-string v3, "orca:FriendListsLoader"

    const-string v4, "Exception reading facebook users"

    invoke-static {v3, v4, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 956
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 958
    :goto_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 956
    :cond_0
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 375
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchLastActiveResult;

    .line 376
    const-string v2, "orca:FriendListsLoader"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onFetchLastActiveSucceeded. freshness="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    iget-object v8, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    monitor-enter v8

    .line 386
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 387
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    const-wide/16 v3, 0x1388

    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 427
    :catch_0
    move-exception v0

    .line 428
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 430
    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 390
    :cond_0
    :try_start_2
    iget-boolean v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 391
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    .line 392
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->a()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v3

    sget-object v4, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v3, v4, :cond_4

    .line 394
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/an;Lcom/google/common/a/es;)Lcom/facebook/orca/contacts/divebar/an;

    move-result-object v0

    .line 396
    if-eqz v0, :cond_1

    .line 400
    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    .line 407
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 408
    if-eqz v0, :cond_3

    .line 409
    const-string v1, "orca:FriendListsLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFetchLastActiveSucceeded. sending updated result to client. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/an;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/an;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 430
    :cond_2
    :goto_2
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 431
    return-void

    .line 413
    :cond_3
    :try_start_4
    new-instance v0, Lcom/facebook/orca/contacts/divebar/an;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->y()Z

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/contacts/divebar/an;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Z)V

    .line 422
    const-string v1, "orca:FriendListsLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFetchLastActiveSucceeded. no changes detected. skipping update. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/an;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/an;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ad;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->z()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 2

    .prologue
    .line 512
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->y:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/ai;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/contacts/divebar/ai;-><init>(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/orca/contacts/divebar/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 521
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ad;Z)Z
    .locals 0

    .prologue
    .line 66
    iput-boolean p1, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/ad;)Lcom/facebook/orca/contacts/divebar/an;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/divebar/ad;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    return-object v0
.end method

.method private u()V
    .locals 4

    .prologue
    .line 348
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->F:Lcom/facebook/fbservice/ops/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->F:Lcom/facebook/fbservice/ops/m;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    :goto_0
    return-void

    .line 352
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 353
    const-string v1, "syncToCacheParams"

    new-instance v2, Lcom/facebook/contacts/server/SyncToCacheParams;

    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {v2, v3}, Lcom/facebook/contacts/server/SyncToCacheParams;-><init>(Lcom/facebook/fbservice/service/s;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 355
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->x:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->F:Lcom/facebook/fbservice/ops/m;

    .line 359
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "start SYNC_TOP_LAST_ACTIVE"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->F:Lcom/facebook/fbservice/ops/m;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->G:Lcom/google/common/d/a/s;

    .line 361
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->G:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/ah;-><init>(Lcom/facebook/orca/contacts/divebar/ad;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private v()V
    .locals 3

    .prologue
    .line 606
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 638
    :goto_0
    return-void

    .line 610
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->z:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/aj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/aj;-><init>(Lcom/facebook/orca/contacts/divebar/ad;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    .line 623
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/ak;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/ak;-><init>(Lcom/facebook/orca/contacts/divebar/ad;)V

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->A:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method private w()Z
    .locals 4

    .prologue
    .line 650
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->w:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    .line 652
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private x()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 657
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/divebar/am;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 659
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->w:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->c:Lcom/facebook/contacts/data/j;

    const-wide/16 v3, -0x1

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    const/4 v0, 0x1

    .line 663
    :cond_0
    return v0
.end method

.method private y()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 667
    const-string v1, "orca:FriendListsLoader"

    const-string v2, "waitingForContactSynch"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 671
    const-string v1, "orca:FriendListsLoader"

    const-string v2, "Waiting for contacts"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    :goto_0
    return v0

    .line 675
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 676
    const-string v1, "orca:FriendListsLoader"

    const-string v2, "Waiting for favorites"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 680
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private z()V
    .locals 2

    .prologue
    .line 806
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onPresenceReceived"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->q()V

    .line 808
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/contacts/divebar/am;)V
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 344
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    .line 345
    return-void

    .line 343
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->r()Lcom/facebook/orca/contacts/divebar/an;

    move-result-object v0

    return-object v0
.end method

.method protected i()V
    .locals 2

    .prologue
    .line 569
    invoke-super {p0}, Landroid/support/v4/a/a;->i()V

    .line 570
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->I:Lcom/google/common/d/a/s;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 576
    :cond_0
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onStartLoading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    if-eqz v0, :cond_1

    .line 579
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "Using cached result"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/ad;->b(Ljava/lang/Object;)V

    .line 583
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    if-nez v0, :cond_2

    .line 584
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "Forcing a load"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->j()V

    .line 588
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->r:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 589
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->e()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 590
    :cond_3
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "presenceManager.addPresenceReceivedListener"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->q:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->s:Lcom/facebook/l/v;

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/l/v;)V

    .line 593
    :cond_4
    return-void
.end method

.method protected l()V
    .locals 2

    .prologue
    .line 597
    invoke-super {p0}, Landroid/support/v4/a/a;->l()V

    .line 598
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onStopLoading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->b()Z

    .line 600
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 601
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->v()V

    .line 603
    :cond_0
    return-void
.end method

.method protected p()V
    .locals 2

    .prologue
    .line 642
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onReset"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 643
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->l()V

    .line 644
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    .line 645
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->r:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 646
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->q:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->s:Lcom/facebook/l/v;

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->b(Lcom/facebook/l/v;)V

    .line 647
    return-void
.end method

.method public r()Lcom/facebook/orca/contacts/divebar/an;
    .locals 12

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 687
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "starting loadInBackground"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    iget-object v10, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    monitor-enter v10

    .line 691
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    .line 693
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->y()Z

    move-result v11

    .line 697
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez v11, :cond_2

    .line 698
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->u()V

    .line 699
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->B:Lcom/facebook/contacts/data/p;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/p;->a()V

    move v9, v8

    .line 703
    :goto_0
    const-string v0, "orca:FriendListsLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadInBackground. waitForLastActiveData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->s()Lcom/facebook/orca/contacts/divebar/an;

    move-result-object v6

    .line 705
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "loadInBackground. loadLocalData loaded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    new-instance v0, Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->c()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->e()Lcom/google/common/a/es;

    move-result-object v5

    invoke-virtual {v6}, Lcom/facebook/orca/contacts/divebar/an;->f()Lcom/google/common/a/es;

    move-result-object v6

    if-nez v11, :cond_0

    if-eqz v9, :cond_1

    :cond_0
    move v7, v8

    :cond_1
    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/contacts/divebar/an;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Z)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 717
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    .line 722
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->E:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 723
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 725
    const-string v0, "orca:FriendListsLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadInBackground result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/divebar/an;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->D:Lcom/facebook/orca/contacts/divebar/an;

    return-object v0

    .line 717
    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    :try_start_2
    iput-boolean v1, p0, Lcom/facebook/orca/contacts/divebar/ad;->H:Z

    throw v0

    .line 723
    :catchall_1
    move-exception v0

    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_2
    move v9, v7

    goto :goto_0
.end method

.method s()Lcom/facebook/orca/contacts/divebar/an;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 730
    .line 737
    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 738
    const-string v0, "loadInBackground"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v7

    .line 739
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 740
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "checking favorite friends"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 741
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->B()Lcom/google/common/a/es;

    move-result-object v1

    .line 742
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->n:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/a/d;->a(Lcom/google/common/a/es;)V

    .line 745
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 746
    const-string v0, "orca:FriendListsLoader"

    const-string v2, "checking top friends"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->C()Lcom/google/common/a/es;

    move-result-object v2

    .line 748
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/e;->a(Lcom/google/common/a/es;)V

    .line 751
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->t:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 752
    const-string v0, "orca:FriendListsLoader"

    const-string v3, "checking online friends"

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->D()Lcom/google/common/a/es;

    move-result-object v3

    .line 754
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/contacts/divebar/e;->b(Lcom/google/common/a/es;)V

    .line 757
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->t:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 758
    const-string v0, "orca:FriendListsLoader"

    const-string v4, "checking mobile friends"

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->E()Lcom/google/common/a/es;

    move-result-object v5

    .line 760
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/contacts/divebar/e;->d(Lcom/google/common/a/es;)V

    .line 763
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->u:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 764
    const-string v0, "orca:FriendListsLoader"

    const-string v4, "checking other contacts"

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 765
    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v4

    .line 766
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/contacts/divebar/e;->c(Lcom/google/common/a/es;)V

    .line 770
    :goto_4
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->C:Lcom/facebook/orca/contacts/divebar/am;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/am;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 771
    const-string v0, "orca:FriendListsLoader"

    const-string v6, "checking top Groups"

    invoke-static {v0, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 772
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->F()Lcom/google/common/a/es;

    move-result-object v6

    .line 773
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ad;->m:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/contacts/divebar/e;->e(Lcom/google/common/a/es;)V

    .line 776
    :cond_0
    new-instance v0, Lcom/facebook/orca/contacts/divebar/an;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/an;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 789
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ad;->A()Lcom/google/common/a/es;

    move-result-object v1

    .line 790
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/an;Lcom/google/common/a/es;)Lcom/facebook/orca/contacts/divebar/an;

    move-result-object v1

    .line 791
    if-eqz v1, :cond_1

    move-object v0, v1

    .line 795
    :cond_1
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    .line 796
    const-string v1, "orca:FriendListsLoader"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 797
    return-object v0

    :cond_2
    move-object v4, v6

    goto :goto_4

    :cond_3
    move-object v5, v6

    goto :goto_3

    :cond_4
    move-object v3, v6

    goto/16 :goto_2

    :cond_5
    move-object v2, v6

    goto/16 :goto_1

    :cond_6
    move-object v1, v6

    goto/16 :goto_0
.end method

.method public t()V
    .locals 2

    .prologue
    .line 801
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onFriendSyncProgress"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/ad;->q()V

    .line 803
    return-void
.end method

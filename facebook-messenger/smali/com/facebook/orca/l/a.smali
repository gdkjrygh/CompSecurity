.class public Lcom/facebook/orca/l/a;
.super Lcom/facebook/orca/server/a;
.source "MergeServiceHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/concurrent/ExecutorService;

.field private final c:Lcom/facebook/auth/viewercontext/e;

.field private final d:Lcom/facebook/contacts/data/l;

.field private final e:Lcom/facebook/orca/f/g;

.field private final f:Lcom/facebook/orca/f/i;

.field private final g:Lcom/facebook/orca/app/g;

.field private final h:Lcom/facebook/orca/notify/av;

.field private final i:Lcom/facebook/orca/f/z;

.field private final j:Lcom/facebook/orca/prefs/av;

.field private final k:Lcom/facebook/orca/prefs/b;

.field private final l:Lcom/facebook/orca/f/l;

.field private final m:Lcom/facebook/orca/threads/g;

.field private final n:Lcom/facebook/orca/f/r;

.field private final o:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 98
    const-class v0, Lcom/facebook/orca/l/a;

    sput-object v0, Lcom/facebook/orca/l/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/contacts/data/l;Lcom/facebook/orca/f/g;Lcom/facebook/orca/f/i;Lcom/facebook/orca/app/g;Lcom/facebook/orca/notify/av;Lcom/facebook/orca/f/z;Lcom/facebook/orca/prefs/av;Lcom/facebook/orca/prefs/b;Lcom/facebook/orca/f/l;Lcom/facebook/orca/threads/g;Lcom/facebook/orca/f/r;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/facebook/auth/viewercontext/e;",
            "Lcom/facebook/contacts/data/l;",
            "Lcom/facebook/orca/f/g;",
            "Lcom/facebook/orca/f/i;",
            "Lcom/facebook/orca/app/g;",
            "Lcom/facebook/orca/notify/av;",
            "Lcom/facebook/orca/f/z;",
            "Lcom/facebook/orca/prefs/av;",
            "Lcom/facebook/orca/prefs/b;",
            "Lcom/facebook/orca/f/l;",
            "Lcom/facebook/orca/threads/g;",
            "Lcom/facebook/orca/f/r;",
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
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 136
    const-string v1, "MergeServiceHandler"

    invoke-direct {p0, v1}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 137
    iput-object p1, p0, Lcom/facebook/orca/l/a;->b:Ljava/util/concurrent/ExecutorService;

    .line 138
    iput-object p2, p0, Lcom/facebook/orca/l/a;->c:Lcom/facebook/auth/viewercontext/e;

    .line 139
    iput-object p3, p0, Lcom/facebook/orca/l/a;->d:Lcom/facebook/contacts/data/l;

    .line 140
    iput-object p4, p0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    .line 141
    iput-object p5, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    .line 142
    iput-object p6, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    .line 143
    iput-object p7, p0, Lcom/facebook/orca/l/a;->h:Lcom/facebook/orca/notify/av;

    .line 144
    iput-object p8, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    .line 145
    iput-object p9, p0, Lcom/facebook/orca/l/a;->j:Lcom/facebook/orca/prefs/av;

    .line 146
    iput-object p10, p0, Lcom/facebook/orca/l/a;->k:Lcom/facebook/orca/prefs/b;

    .line 147
    iput-object p11, p0, Lcom/facebook/orca/l/a;->l:Lcom/facebook/orca/f/l;

    .line 148
    iput-object p12, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    .line 149
    iput-object p13, p0, Lcom/facebook/orca/l/a;->n:Lcom/facebook/orca/f/r;

    .line 150
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/orca/l/a;->o:Ljavax/inject/a;

    .line 151
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/orca/l/a;->p:Ljavax/inject/a;

    .line 152
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/orca/l/a;->q:Ljavax/inject/a;

    .line 153
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    .line 154
    return-void
.end method

.method private A(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;
    .locals 1

    .prologue
    .line 1061
    new-instance v0, Lcom/facebook/orca/l/k;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/l/k;-><init>(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)V

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/l/a;)Lcom/facebook/auth/viewercontext/e;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/l/a;->c:Lcom/facebook/auth/viewercontext/e;

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 400
    :try_start_0
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 401
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/google/common/base/Optional;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 418
    :goto_0
    return-object v0

    .line 402
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 403
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 404
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 405
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 406
    throw v1

    .line 408
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 410
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/google/common/base/Optional;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 412
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 413
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/server/FetchThreadListResult;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-static {v1}, Lcom/facebook/fbservice/service/ServiceException;->a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 417
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/google/common/base/Optional;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/ad;",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/fbservice/service/s;",
            ">;",
            "Lcom/facebook/fbservice/service/e;",
            ")",
            "Lcom/facebook/fbservice/service/OperationResult;"
        }
    .end annotation

    .prologue
    .line 428
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    .line 429
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 430
    const-string v0, "fetchThreadListParams"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 432
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/y;

    move-result-object v3

    invoke-virtual {v3, p2}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/common/base/Optional;->or(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/s;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v3

    .line 437
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 438
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 439
    new-instance v2, Lcom/facebook/fbservice/service/ad;

    invoke-direct {v2, v1, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 440
    invoke-interface {p4, v2}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;
    .locals 5

    .prologue
    .line 1102
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 1104
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 1106
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 1107
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v3

    .line 1108
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 1109
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v3

    .line 1110
    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v3, v4, :cond_0

    .line 1111
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 1114
    :cond_1
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v3

    .line 1115
    invoke-static {v3}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1116
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 1120
    :cond_2
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;-><init>(Lcom/facebook/orca/threads/FolderName;Lcom/google/common/a/es;)V

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;
    .locals 1

    .prologue
    .line 1092
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 1093
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    if-ne p1, v0, :cond_2

    .line 1094
    invoke-direct {p0, p2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    move-result-object v0

    .line 1096
    :goto_1
    return-object v0

    .line 1092
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1096
    :cond_2
    invoke-direct {p0, p2}, Lcom/facebook/orca/l/a;->b(Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    move-result-object v0

    goto :goto_1
.end method

.method private a(Ljava/util/Collection;Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchMultipleThreadsResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            "Lcom/facebook/fbservice/service/e;",
            ")",
            "Lcom/facebook/orca/server/FetchMultipleThreadsResult;"
        }
    .end annotation

    .prologue
    .line 1034
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1035
    sget-object v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a:Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    .line 1055
    :goto_0
    return-object v0

    .line 1037
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 1038
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 1039
    new-instance v3, Lcom/facebook/orca/server/ac;

    invoke-direct {v3}, Lcom/facebook/orca/server/ac;-><init>()V

    invoke-virtual {v3, p2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/ac;

    move-result-object v3

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 1043
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 1046
    :cond_1
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;-><init>(Lcom/facebook/orca/threads/FolderName;Lcom/google/common/a/es;)V

    .line 1050
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1051
    const-string v2, "fetchMultipleThreadsParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1052
    new-instance v0, Lcom/facebook/fbservice/service/ad;

    sget-object v2, Lcom/facebook/orca/server/aq;->l:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v0, v2, v1}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 1054
    invoke-virtual {p0, v0, p3}, Lcom/facebook/orca/l/a;->u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1055
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadParams;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;)",
            "Lcom/facebook/orca/server/FetchThreadResult;"
        }
    .end annotation

    .prologue
    .line 868
    const/4 v1, 0x0

    .line 869
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 870
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 871
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v4

    .line 872
    if-nez v1, :cond_0

    invoke-virtual {v4}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    :goto_1
    move-object v1, v0

    .line 878
    goto :goto_0

    .line 876
    :cond_0
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    move-object v0, v1

    goto :goto_1

    .line 879
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/l/w;->a(ILcom/facebook/orca/server/FetchThreadResult;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8

    .prologue
    .line 1344
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1349
    :goto_0
    return-object p2

    .line 1347
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 1349
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

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
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ReceiptResult;)Lcom/facebook/orca/server/ReceiptResult;
    .locals 5

    .prologue
    .line 1369
    invoke-virtual {p2}, Lcom/facebook/orca/server/ReceiptResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 1371
    new-instance v1, Lcom/facebook/orca/server/ReceiptResult;

    invoke-virtual {p2}, Lcom/facebook/orca/server/ReceiptResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/orca/server/ReceiptResult;->f()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/orca/server/ReceiptResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;J)V

    return-object v1
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 1385
    invoke-static {}, Lcom/facebook/orca/threads/ThreadSummary;->newBuilder()Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 3

    .prologue
    .line 716
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 717
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 718
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 720
    :cond_0
    new-instance v0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/service/s;Lcom/facebook/fbservice/service/e;Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/s;",
            "Lcom/facebook/fbservice/service/e;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 635
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 637
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 638
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 639
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v3

    .line 640
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 645
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/l/a;->d:Lcom/facebook/contacts/data/l;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/data/l;->a(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v2

    .line 649
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v3

    .line 650
    invoke-virtual {v2}, Lcom/google/common/a/ex;->l()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 651
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 652
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 655
    :cond_3
    invoke-virtual {v2}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 656
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 657
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 660
    :cond_5
    new-instance v0, Lcom/facebook/orca/server/ac;

    invoke-direct {v0}, Lcom/facebook/orca/server/ac;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 664
    invoke-direct {p0, v3, v0, p2}, Lcom/facebook/orca/l/a;->a(Ljava/util/Collection;Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    move-result-object v0

    .line 668
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 670
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lcom/facebook/orca/l/a;->a(Lcom/google/common/a/et;Ljava/util/List;)V

    .line 673
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 676
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 677
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 678
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v4

    .line 679
    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 683
    :cond_6
    invoke-static {v1, v2}, Lcom/facebook/orca/l/w;->a(Ljava/util/Map;Lcom/google/common/a/iw;)Lcom/google/common/a/ev;

    move-result-object v1

    .line 688
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 689
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 690
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 691
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v5

    .line 692
    if-eqz v5, :cond_8

    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 693
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 694
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v5

    .line 695
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 696
    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 697
    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 700
    :cond_8
    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_4

    .line 703
    :cond_9
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/l/v;Lcom/google/common/a/es;)Lcom/google/common/a/ev;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/l/v;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;)",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1543
    iget-object v0, p0, Lcom/facebook/orca/l/a;->c:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    .line 1544
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 1545
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 1546
    new-instance v4, Lcom/facebook/orca/l/n;

    invoke-direct {v4, p0, v0, v1, p1}, Lcom/facebook/orca/l/n;-><init>(Lcom/facebook/orca/l/a;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/auth/viewercontext/ViewerContext;Lcom/facebook/orca/l/v;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1570
    :cond_0
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v3

    .line 1571
    iget-object v0, p0, Lcom/facebook/orca/l/a;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 1572
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {p2}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1574
    :try_start_0
    invoke-virtual {p2, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1572
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1575
    :catch_0
    move-exception v0

    .line 1576
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 1577
    const-class v1, Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/google/common/base/Throwables;->propagateIfPossible(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 1578
    invoke-static {v0}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 1581
    :cond_1
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Lcom/facebook/orca/l/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private a(Ljava/util/Collection;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;",
            "Lcom/facebook/fbservice/service/ad;",
            "Lcom/facebook/fbservice/service/e;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 962
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 963
    const-string v1, "fetchMoreMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 967
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v8

    .line 968
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/facebook/user/UserKey;

    .line 969
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    invoke-static {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v2

    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v4

    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreMessagesParams;-><init>(Lcom/facebook/orca/server/ThreadCriteria;JJI)V

    .line 975
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "fetchMoreMessagesParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 978
    invoke-interface {p3, p2}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 979
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 980
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 982
    :cond_0
    return-object v8
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadListResult;)V
    .locals 2

    .prologue
    .line 374
    iget-object v0, p0, Lcom/facebook/orca/l/a;->h:Lcom/facebook/orca/notify/av;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->h()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/threads/FolderCounts;)V

    .line 375
    iget-object v0, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->a()V

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/l/a;->j:Lcom/facebook/orca/prefs/av;

    invoke-virtual {v0}, Lcom/facebook/orca/prefs/av;->a()V

    .line 377
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->i()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/facebook/orca/l/a;->k:Lcom/facebook/orca/prefs/b;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->i()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/b;->a(Lcom/facebook/orca/notify/NotificationSetting;)V

    .line 381
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 7
    .param p2    # Lcom/facebook/orca/server/FetchThreadResult;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 810
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 811
    if-nez v1, :cond_1

    .line 840
    :cond_0
    :goto_0
    return-void

    .line 816
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 817
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    .line 818
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v4

    .line 819
    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 825
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 826
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 827
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v3

    .line 828
    iget-object v4, p0, Lcom/facebook/orca/l/a;->c:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v4}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v4

    .line 829
    new-instance v5, Lcom/facebook/user/UserKey;

    sget-object v6, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v5, v6, v4}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 830
    invoke-static {v3, v5}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 831
    iget-object v2, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v3

    invoke-virtual {v2, v5, v3, v4}, Lcom/facebook/orca/f/z;->a(Lcom/facebook/user/UserKey;J)V

    .line 838
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 839
    iget-object v2, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method private a(Lcom/google/common/a/et;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 851
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 852
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 853
    invoke-virtual {p1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 856
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/fbservice/service/e;)V
    .locals 3

    .prologue
    .line 1497
    iget-object v1, p0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    iget-object v0, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-static {p1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 1500
    if-eqz v0, :cond_0

    .line 1512
    :goto_0
    return-void

    .line 1503
    :cond_0
    new-instance v0, Lcom/facebook/orca/server/ac;

    invoke-direct {v0}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v1, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 1508
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1509
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1510
    new-instance v0, Lcom/facebook/fbservice/service/ad;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v0, v2, v1}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 1511
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/l/a;->d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    goto :goto_0
.end method

.method private b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 609
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    .line 610
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 611
    const-string v0, "fetchMoreThreadsParams"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 613
    new-instance v3, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b()J

    move-result-wide v4

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v0

    invoke-direct {v3, p2, v4, v5, v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;-><init>(Lcom/facebook/orca/threads/FolderName;JI)V

    .line 615
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 616
    const-string v2, "fetchMoreThreadsParams"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 617
    new-instance v2, Lcom/facebook/fbservice/service/ad;

    invoke-direct {v2, v1, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 618
    invoke-interface {p3, v2}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/l/a;->b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;
    .locals 5

    .prologue
    .line 1127
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 1129
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 1131
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 1132
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v3

    .line 1133
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 1134
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v3

    .line 1135
    sget-object v4, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v3, v4, :cond_0

    .line 1136
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 1139
    :cond_1
    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v3

    .line 1140
    invoke-static {v3}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1141
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 1145
    :cond_2
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;-><init>(Lcom/facebook/orca/threads/FolderName;Lcom/google/common/a/es;)V

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 590
    iget-object v0, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->a()V

    .line 591
    return-void
.end method

.method private c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 1073
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    .line 1074
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 1075
    const-string v0, "fetchMultipleThreadsParams"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    .line 1078
    invoke-direct {p0, p2, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchMultipleThreadsParams;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    move-result-object v3

    .line 1080
    invoke-virtual {v3}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1081
    sget-object v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a:Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1086
    :goto_0
    return-object v0

    .line 1083
    :cond_0
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 1084
    const-string v2, "fetchMultipleThreadsParams"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1085
    new-instance v2, Lcom/facebook/fbservice/service/ad;

    invoke-direct {v2, v1, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 1086
    invoke-interface {p3, v2}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/l/a;->c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private y(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;
    .locals 1

    .prologue
    .line 386
    new-instance v0, Lcom/facebook/orca/l/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/l/d;-><init>(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)V

    return-object v0
.end method

.method private z(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;
    .locals 1

    .prologue
    .line 596
    new-instance v0, Lcom/facebook/orca/l/j;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/l/j;-><init>(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)V

    return-object v0
.end method


# virtual methods
.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 19

    .prologue
    .line 161
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v4

    .line 162
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 163
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v6

    .line 165
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v3

    .line 167
    if-eq v2, v3, :cond_9

    .line 171
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v4, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    move-object v4, v3

    .line 173
    :goto_0
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    .line 174
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v3, v6, v2}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Z

    move-result v2

    .line 177
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v6}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 178
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v3

    .line 179
    if-nez v2, :cond_0

    .line 180
    invoke-virtual {v3}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 181
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchThreadListResult;)V

    :cond_0
    move-object v2, v3

    .line 365
    :goto_1
    return-object v2

    .line 186
    :cond_1
    if-eqz v2, :cond_2

    .line 187
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v2, v6}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v2

    .line 189
    invoke-static {v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    goto :goto_1

    .line 192
    :cond_2
    invoke-direct/range {p0 .. p2}, Lcom/facebook/orca/l/a;->y(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v6}, Lcom/facebook/orca/threads/g;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/v;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v2

    .line 198
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v5

    .line 200
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 201
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v3}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 203
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_2

    .line 205
    :cond_3
    invoke-virtual {v5}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v7

    .line 209
    invoke-virtual {v7}, Lcom/google/common/a/ev;->c()Lcom/google/common/a/em;

    move-result-object v2

    .line 211
    new-instance v3, Lcom/facebook/orca/l/b;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/b;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v8

    .line 220
    new-instance v3, Lcom/facebook/orca/l/m;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/m;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v8, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v5

    .line 229
    new-instance v3, Lcom/facebook/orca/l/o;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/o;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v9

    .line 238
    new-instance v3, Lcom/facebook/orca/l/p;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/p;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v10

    .line 247
    new-instance v3, Lcom/facebook/orca/l/q;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/q;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v11

    .line 256
    new-instance v3, Lcom/facebook/orca/l/r;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/r;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v12

    .line 265
    new-instance v3, Lcom/facebook/orca/l/s;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/s;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v13

    .line 274
    new-instance v3, Lcom/facebook/orca/l/t;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/t;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v14

    .line 283
    new-instance v3, Lcom/facebook/orca/l/u;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/u;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v15

    .line 292
    new-instance v3, Lcom/facebook/orca/l/c;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/l/c;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v2, v3}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v16

    .line 302
    const/4 v3, 0x0

    .line 303
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :cond_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 304
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadListResult;->n()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 305
    const/4 v2, 0x1

    move v3, v2

    .line 311
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/l/a;->o:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 313
    new-instance v2, Lcom/facebook/orca/threads/w;

    invoke-direct {v2}, Lcom/facebook/orca/threads/w;-><init>()V

    invoke-static {v2, v5}, Lcom/facebook/orca/l/w;->a(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    .line 317
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v5, v1, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/fbservice/service/s;Lcom/facebook/fbservice/service/e;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v5

    .line 323
    const/4 v2, 0x1

    .line 324
    invoke-virtual {v5}, Lcom/google/common/a/es;->size()I

    move-result v17

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v18

    move/from16 v0, v17

    move/from16 v1, v18

    if-le v0, v1, :cond_8

    .line 325
    const/4 v2, 0x0

    .line 326
    const/16 v17, 0x0

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v4

    move/from16 v0, v17

    invoke-virtual {v5, v0, v4}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v4

    .line 329
    :goto_3
    invoke-static {v8}, Lcom/facebook/orca/l/w;->c(Ljava/util/Collection;)Z

    move-result v5

    if-eqz v5, :cond_6

    if-nez v2, :cond_6

    const/4 v2, 0x1

    .line 334
    :goto_4
    new-instance v5, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v5, v4, v2}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    move-object v2, v5

    .line 342
    :goto_5
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    .line 346
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v4

    invoke-static {v9}, Lcom/facebook/orca/l/w;->d(Ljava/util/Collection;)Lcom/facebook/fbservice/c/b;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v10}, Lcom/facebook/orca/l/w;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/aa;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v11}, Lcom/facebook/orca/l/w;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/aa;->a(Ljava/util/List;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v12}, Lcom/facebook/orca/l/w;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/aa;->b(Ljava/util/List;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v13}, Lcom/facebook/orca/l/w;->e(Ljava/util/Collection;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;

    move-result-object v4

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v7, v2}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadListResult;

    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadListResult;->i()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v14}, Lcom/facebook/orca/l/w;->f(Ljava/util/Collection;)Z

    move-result v4

    invoke-virtual {v2, v4}, Lcom/facebook/orca/server/aa;->a(Z)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static {v15}, Lcom/facebook/orca/l/w;->g(Ljava/util/Collection;)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/server/aa;->a(J)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-static/range {v16 .. v16}, Lcom/facebook/orca/l/w;->g(Ljava/util/Collection;)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/server/aa;->b(J)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/facebook/orca/server/aa;->b(Z)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/facebook/orca/server/aa;->a(Ljava/util/Map;)Lcom/facebook/orca/server/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v2

    .line 363
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadListResult;)V

    .line 364
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchThreadListResult;)V

    .line 365
    invoke-static {v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    goto/16 :goto_1

    .line 329
    :cond_6
    const/4 v2, 0x0

    goto/16 :goto_4

    .line 336
    :cond_7
    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v2

    invoke-static {v2, v8}, Lcom/facebook/orca/l/w;->a(ILjava/util/Collection;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    goto/16 :goto_5

    :cond_8
    move-object v4, v5

    goto/16 :goto_3

    :cond_9
    move-object v4, v2

    goto/16 :goto_0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 17

    .prologue
    .line 448
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 449
    const-string v3, "fetchMoreThreadsParams"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 450
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v4

    .line 452
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v4}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 453
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 454
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/l/a;->b()V

    .line 582
    :goto_0
    return-object v2

    .line 458
    :cond_0
    invoke-direct/range {p0 .. p2}, Lcom/facebook/orca/l/a;->z(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v5, v4}, Lcom/facebook/orca/threads/g;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-direct {v0, v3, v5}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/v;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v3

    .line 464
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v6

    .line 466
    invoke-virtual {v3}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 467
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v5}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    .line 469
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3, v5}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 471
    :cond_1
    invoke-virtual {v6}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v9

    .line 475
    invoke-virtual {v9}, Lcom/google/common/a/ev;->c()Lcom/google/common/a/em;

    move-result-object v3

    .line 476
    new-instance v5, Lcom/facebook/orca/l/e;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lcom/facebook/orca/l/e;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v3, v5}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v6

    .line 485
    new-instance v5, Lcom/facebook/orca/l/f;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lcom/facebook/orca/l/f;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v6, v5}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v5

    .line 494
    new-instance v7, Lcom/facebook/orca/l/g;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lcom/facebook/orca/l/g;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v3, v7}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v7

    .line 503
    new-instance v8, Lcom/facebook/orca/l/h;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lcom/facebook/orca/l/h;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v3, v8}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v8

    .line 512
    new-instance v10, Lcom/facebook/orca/l/i;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lcom/facebook/orca/l/i;-><init>(Lcom/facebook/orca/l/a;)V

    invoke-static {v3, v10}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v10

    .line 523
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->o:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 525
    new-instance v3, Lcom/facebook/orca/threads/w;

    invoke-direct {v3}, Lcom/facebook/orca/threads/w;-><init>()V

    invoke-static {v3, v5}, Lcom/facebook/orca/l/w;->a(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v3

    .line 529
    sget-object v5, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v5, v1, v3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/fbservice/service/s;Lcom/facebook/fbservice/service/e;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v11

    .line 535
    const/4 v3, 0x0

    .line 536
    invoke-virtual {v11}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v5, v3

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/ThreadSummary;

    .line 537
    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v13

    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b()J

    move-result-wide v15

    cmp-long v3, v13, v15

    if-lez v3, :cond_2

    .line 538
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto :goto_2

    .line 545
    :cond_2
    const/4 v3, 0x1

    .line 546
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v2

    add-int/2addr v2, v5

    .line 547
    invoke-virtual {v11}, Lcom/google/common/a/es;->size()I

    move-result v12

    if-ge v12, v2, :cond_3

    .line 548
    const/4 v3, 0x0

    .line 549
    invoke-virtual {v11}, Lcom/google/common/a/es;->size()I

    move-result v2

    .line 551
    :cond_3
    invoke-virtual {v11, v5, v2}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v5

    .line 554
    invoke-static {v6}, Lcom/facebook/orca/l/w;->c(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez v3, :cond_4

    const/4 v2, 0x1

    .line 557
    :goto_3
    new-instance v3, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v3, v5, v2}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    move-object v2, v3

    .line 567
    :goto_4
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v5

    .line 571
    new-instance v2, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    invoke-static {v7}, Lcom/facebook/orca/l/w;->d(Ljava/util/Collection;)Lcom/facebook/fbservice/c/b;

    move-result-object v3

    invoke-static {v8}, Lcom/facebook/orca/l/w;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v6

    invoke-static {v10}, Lcom/facebook/orca/l/w;->g(Ljava/util/Collection;)J

    move-result-wide v7

    invoke-direct/range {v2 .. v9}, Lcom/facebook/orca/server/FetchMoreThreadsResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;JLcom/google/common/a/ev;)V

    .line 580
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchMoreThreadsResult;)V

    .line 581
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/l/a;->b()V

    .line 582
    invoke-static {v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    goto/16 :goto_0

    .line 554
    :cond_4
    const/4 v2, 0x0

    goto :goto_3

    .line 561
    :cond_5
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v2

    invoke-static {v2, v6}, Lcom/facebook/orca/l/w;->a(ILjava/util/Collection;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    goto :goto_4
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 731
    iget-object v0, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 734
    iget-object v1, p0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v6

    .line 736
    iget-object v1, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v6, :cond_0

    .line 737
    invoke-static {v6}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 798
    :goto_0
    return-object v0

    .line 740
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 741
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchThreadParams;

    .line 742
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v3

    .line 743
    invoke-virtual {v3}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadResult;

    .line 746
    iget-object v4, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 747
    invoke-direct {p0, v2, v6}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V

    move-object v0, v3

    .line 748
    goto :goto_0

    .line 756
    :cond_1
    invoke-static {}, Lcom/google/common/a/ex;->c()Lcom/google/common/a/ex;

    move-result-object v5

    .line 757
    const/4 v3, 0x0

    .line 758
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 759
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v3

    move-object v4, v3

    .line 764
    :goto_1
    iget-object v3, p0, Lcom/facebook/orca/l/a;->o:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    .line 765
    iget-object v3, p0, Lcom/facebook/orca/l/a;->d:Lcom/facebook/contacts/data/l;

    invoke-virtual {v3, v4}, Lcom/facebook/contacts/data/l;->b(Lcom/facebook/user/UserKey;)Lcom/google/common/a/ex;

    move-result-object v3

    .line 768
    :goto_2
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v5

    .line 769
    invoke-virtual {v3}, Lcom/google/common/a/ex;->l()Lcom/google/common/a/fi;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 770
    invoke-virtual {v3}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 771
    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 773
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 775
    invoke-direct {p0, v5, v1, p2}, Lcom/facebook/orca/l/a;->a(Ljava/util/Collection;Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    move-result-object v3

    .line 779
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v4

    .line 781
    invoke-virtual {v4, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 782
    invoke-virtual {v3}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a()Lcom/google/common/a/es;

    move-result-object v3

    invoke-direct {p0, v4, v3}, Lcom/facebook/orca/l/a;->a(Lcom/google/common/a/et;Ljava/util/List;)V

    .line 785
    invoke-virtual {v4}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v3

    .line 789
    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_2

    .line 790
    invoke-direct {p0, v1, v3}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchThreadParams;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v2

    .line 795
    :cond_2
    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 796
    iget-object v2, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 797
    invoke-direct {p0, v0, v6}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 798
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_0

    .line 760
    :cond_3
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 761
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v3

    move-object v4, v3

    goto :goto_1

    :cond_4
    move-object v3, v5

    goto :goto_2

    :cond_5
    move-object v4, v3

    goto :goto_1
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1155
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1156
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1157
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1158
    iget-object v2, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1159
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 1160
    iget-object v1, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 1162
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 1163
    iget-object v2, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v2}, Lcom/facebook/orca/f/z;->a()V

    .line 1164
    iget-object v2, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 1165
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 1173
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1174
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendBroadcastResult;

    .line 1175
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1176
    iget-object v2, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v2}, Lcom/facebook/orca/f/z;->a()V

    .line 1177
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1178
    iget-object v4, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1179
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v2

    .line 1180
    iget-object v4, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v2}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 1182
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 1183
    iget-object v4, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 1185
    :cond_1
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 1194
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 1195
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1196
    const-string v1, "outgoingMessage"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 1197
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1198
    iget-object v3, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1199
    iget-object v3, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;)V

    .line 1201
    :cond_0
    return-object v2
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 1253
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1254
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1255
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 1257
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 1265
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1266
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1267
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 1269
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1277
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1278
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 1284
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1285
    iget-object v2, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1286
    iget-object v2, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/MarkThreadParams;)V

    .line 1290
    :cond_0
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected k(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 1298
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1299
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ReceiptResult;

    .line 1300
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ReceiptResult;)Lcom/facebook/orca/server/ReceiptResult;

    move-result-object v0

    .line 1302
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected l(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 1310
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1311
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ReceiptResult;

    .line 1312
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ReceiptResult;)Lcom/facebook/orca/server/ReceiptResult;

    move-result-object v0

    .line 1314
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 1393
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1394
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 1395
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 1396
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteThreadParams;->a()Ljava/lang/String;

    move-result-object v2

    .line 1397
    iget-object v0, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 1398
    iget-object v3, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1399
    iget-object v3, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v0, v2}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    .line 1401
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/app/g;->c(Ljava/lang/String;)V

    .line 1402
    return-object v1
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    .line 1410
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1411
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 1412
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v3

    .line 1413
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteMessagesParams;->b()Lcom/google/common/a/fi;

    move-result-object v4

    .line 1415
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v5

    .line 1416
    invoke-virtual {v5}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/DeleteMessagesResult;

    .line 1418
    iget-object v2, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/FolderName;

    .line 1419
    iget-object v6, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v6, v2}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 1420
    iget-object v6, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v6, v2, v0, v1}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/DeleteMessagesParams;Lcom/facebook/orca/server/DeleteMessagesResult;)V

    .line 1425
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/orca/server/DeleteMessagesResult;->a()Lcom/google/common/a/ev;

    move-result-object v0

    .line 1427
    invoke-virtual {v0}, Lcom/google/common/a/ev;->c()Lcom/google/common/a/em;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1428
    iget-object v6, p0, Lcom/facebook/orca/l/a;->n:Lcom/facebook/orca/f/r;

    invoke-virtual {v6, v3, v0}, Lcom/facebook/orca/f/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1430
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/orca/server/DeleteMessagesResult;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1431
    iget-object v0, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/app/g;->c(Ljava/lang/String;)V

    .line 1436
    :goto_1
    return-object v5

    .line 1433
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 1434
    iget-object v0, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v3, v4}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Lcom/google/common/a/fi;)V

    goto :goto_1
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1322
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1323
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1324
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1325
    iget-object v2, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1326
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 1327
    iget-object v1, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/i;->b(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 1329
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v1}, Lcom/facebook/orca/f/z;->a()V

    .line 1330
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected p(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 1208
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 1209
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1210
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1211
    const-string v1, "draft"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/MessageDraft;

    .line 1212
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1213
    iget-object v4, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1214
    iget-object v4, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v1, v3, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 1216
    :cond_0
    return-object v2
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 1224
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    .line 1225
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 1226
    const-string v0, "folderName"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 1227
    iget-object v3, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1228
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 1245
    :goto_0
    return-object v0

    .line 1231
    :cond_0
    new-instance v3, Lcom/facebook/orca/l/l;

    invoke-direct {v3, p0, v2, v1, p2}, Lcom/facebook/orca/l/l;-><init>(Lcom/facebook/orca/l/a;Landroid/os/Bundle;Lcom/facebook/fbservice/service/OperationType;Lcom/facebook/fbservice/service/e;)V

    iget-object v1, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v3, v1}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/v;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    .line 1243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 1244
    iget-object v3, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v0, v1, v2}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;J)V

    .line 1245
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method

.method protected r(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 1446
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1447
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1448
    invoke-direct {p0, v2, p2}, Lcom/facebook/orca/l/a;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/e;)V

    .line 1452
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v3

    .line 1453
    invoke-virtual {v3}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/NewMessageResult;

    .line 1455
    if-eqz v0, :cond_2

    .line 1456
    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v4

    .line 1458
    iget-object v1, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    .line 1459
    iget-object v5, p0, Lcom/facebook/orca/l/a;->m:Lcom/facebook/orca/threads/g;

    invoke-virtual {v5, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1460
    iget-object v5, p0, Lcom/facebook/orca/l/a;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v5, v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/NewMessageResult;)V

    .line 1463
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/l/a;->c:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    .line 1464
    new-instance v1, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v1, v5, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 1465
    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1466
    iget-object v0, p0, Lcom/facebook/orca/l/a;->i:Lcom/facebook/orca/f/z;

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v6

    invoke-virtual {v0, v5, v6, v7}, Lcom/facebook/orca/f/z;->a(Lcom/facebook/user/UserKey;J)V

    .line 1472
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/l/a;->g:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 1475
    iget-object v5, p0, Lcom/facebook/orca/l/a;->e:Lcom/facebook/orca/f/g;

    iget-object v0, p0, Lcom/facebook/orca/l/a;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-static {v2}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v6

    invoke-virtual {v5, v0, v6}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 1478
    if-eqz v0, :cond_2

    invoke-static {v2}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1483
    iget-object v0, p0, Lcom/facebook/orca/l/a;->l:Lcom/facebook/orca/f/l;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/f/l;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 1487
    :cond_2
    return-object v3
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 890
    iget-object v0, p0, Lcom/facebook/orca/l/a;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/l/a;->p:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/l/a;->q:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 893
    :cond_0
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 945
    :goto_0
    return-object v0

    .line 895
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 896
    const-string v1, "fetchMoreMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 900
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v2, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v1

    .line 905
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 906
    const-string v3, "fetchThreadParams"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 907
    new-instance v1, Lcom/facebook/fbservice/service/ad;

    sget-object v3, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v1, v3, v2}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 909
    invoke-interface {p2, v1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 910
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchThreadResult;

    .line 913
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 914
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 915
    iget-object v2, p0, Lcom/facebook/orca/l/a;->d:Lcom/facebook/contacts/data/l;

    invoke-virtual {v2, v1}, Lcom/facebook/contacts/data/l;->b(Lcom/facebook/user/UserKey;)Lcom/google/common/a/ex;

    move-result-object v1

    .line 917
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 918
    invoke-virtual {v1}, Lcom/google/common/a/ex;->o()Lcom/google/common/a/fe;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 919
    invoke-virtual {v1}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 922
    invoke-direct {p0, v2, p1, p2}, Lcom/facebook/orca/l/a;->a(Ljava/util/Collection;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Ljava/util/List;

    move-result-object v3

    .line 928
    const/4 v2, 0x0

    .line 929
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 930
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v5

    .line 931
    if-eqz v5, :cond_2

    invoke-static {v5}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 933
    invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 938
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v0

    invoke-static {v0, v1, v3}, Lcom/facebook/orca/l/w;->a(ILcom/facebook/orca/server/FetchMoreMessagesResult;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    .line 943
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_0

    .line 945
    :cond_3
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    move-object v1, v2

    goto :goto_1
.end method

.method protected u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 990
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 991
    const-string v1, "fetchMultipleThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    .line 993
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 995
    sget-object v1, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threads/FolderName;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 996
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Fetching multiple threads for %1$s not currently supported"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderName;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1001
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/l/a;->A(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/orca/l/v;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-static {v1, v2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/v;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v1

    .line 1006
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    .line 1008
    sget-object v2, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v2}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    .line 1011
    new-instance v2, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/util/Collection;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-static {v3}, Lcom/facebook/orca/l/w;->a([Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;-><init>(Lcom/google/common/a/es;)V

    .line 1017
    invoke-static {v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.class public Lcom/facebook/orca/threadlist/bf;
.super Ljava/lang/Object;
.source "ThreadListLoader.java"


# static fields
.field public static a:Lcom/facebook/orca/threadlist/bm;

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/fbservice/ops/k;

.field private final e:Lcom/facebook/common/time/a;

.field private f:Lcom/facebook/orca/threads/FolderName;

.field private g:Lcom/facebook/orca/threadlist/bi;

.field private h:Lcom/facebook/fbservice/service/s;

.field private i:Lcom/facebook/common/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/g/c",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/facebook/common/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/g/c",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/facebook/orca/threadlist/bl;

.field private l:Lcom/facebook/orca/threadlist/bm;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const-wide/16 v2, 0x0

    .line 44
    const-class v0, Lcom/facebook/orca/threadlist/bf;

    sput-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    .line 69
    new-instance v0, Lcom/facebook/orca/threadlist/bm;

    invoke-static {}, Lcom/facebook/orca/threads/ThreadsCollection;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    sget-object v6, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    move-wide v4, v2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threadlist/bm;-><init>(Lcom/facebook/orca/threads/ThreadsCollection;JJLcom/facebook/fbservice/c/b;)V

    sput-object v0, Lcom/facebook/orca/threadlist/bf;->a:Lcom/facebook/orca/threadlist/bm;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/f/k;Lcom/facebook/fbservice/ops/k;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    .line 154
    iput-object p2, p0, Lcom/facebook/orca/threadlist/bf;->d:Lcom/facebook/fbservice/ops/k;

    .line 155
    iput-object p3, p0, Lcom/facebook/orca/threadlist/bf;->e:Lcom/facebook/common/time/a;

    .line 156
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    return-object p1
.end method

.method private static a(Lcom/facebook/orca/threadlist/bl;Lcom/facebook/orca/threadlist/bl;)Lcom/facebook/orca/threadlist/bl;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 243
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-eqz v0, :cond_5

    :cond_0
    move v0, v2

    .line 244
    :goto_0
    iget-boolean v3, p0, Lcom/facebook/orca/threadlist/bl;->b:Z

    if-nez v3, :cond_1

    iget-boolean v3, p1, Lcom/facebook/orca/threadlist/bl;->b:Z

    if-eqz v3, :cond_2

    :cond_1
    move v1, v2

    .line 245
    :cond_2
    iget-boolean v2, p0, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-ne v2, v0, :cond_3

    iget-boolean v2, p0, Lcom/facebook/orca/threadlist/bl;->b:Z

    if-eq v2, v1, :cond_4

    .line 247
    :cond_3
    new-instance p0, Lcom/facebook/orca/threadlist/bl;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadlist/bl;-><init>(ZZ)V

    .line 249
    :cond_4
    return-object p0

    :cond_5
    move v0, v1

    .line 243
    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 10

    .prologue
    .line 316
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "onFetchThreadsSucceeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 317
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 319
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    .line 320
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->h()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->d()J

    move-result-wide v4

    .line 321
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->f()J

    move-result-wide v2

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v8

    .line 323
    new-instance v0, Lcom/facebook/orca/threadlist/bm;

    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threadlist/bm;-><init>(Lcom/facebook/orca/threads/ThreadsCollection;JJLcom/facebook/fbservice/c/b;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    .line 327
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    sget-object v1, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    if-ne v0, v1, :cond_0

    .line 328
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->m()Lcom/google/common/a/ev;

    move-result-object v0

    .line 330
    sget-object v1, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 331
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListResult;->n()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 333
    new-instance v1, Lcom/facebook/orca/threadlist/bj;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListResult;->n()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v2, v2, Lcom/facebook/orca/threadlist/bl;->b:Z

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/threadlist/bj;-><init>(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v2, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v0, v2, v1}, Lcom/facebook/orca/threadlist/bi;->b(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V

    .line 341
    :cond_0
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    .line 342
    invoke-virtual {v7}, Lcom/facebook/orca/server/FetchThreadListResult;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->h:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne v1, v2, :cond_1

    .line 344
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Subfolder failure. Won\'t reattempt server fetch. Finished loading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 345
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 346
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadlist/bi;->b(Lcom/facebook/orca/threadlist/bk;)V

    .line 369
    :goto_0
    return-void

    .line 347
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v1, v1, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->h:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-eq v1, v2, :cond_2

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-eq v0, v1, :cond_2

    .line 351
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting load because need to hit server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 353
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0

    .line 354
    :cond_2
    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    if-ne v0, v1, :cond_3

    .line 356
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting load because data from cache was stale"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 358
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0

    .line 359
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-wide v0, v0, Lcom/facebook/orca/threadlist/bm;->b:J

    sub-long v0, v8, v0

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-ltz v0, :cond_4

    .line 361
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting load because haven\'t checked the server recently"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 362
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 363
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0

    .line 365
    :cond_4
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Finished loading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 367
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadlist/bi;->b(Lcom/facebook/orca/threadlist/bk;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 377
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "onFetchThreadsError"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 378
    new-instance v0, Lcom/facebook/orca/threadlist/bj;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v1, v1, Lcom/facebook/orca/threadlist/bl;->b:Z

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threadlist/bj;-><init>(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 379
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v2, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v1, v2, v0}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V

    .line 380
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/s;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 274
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_0

    .line 308
    :goto_0
    return-void

    .line 279
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting thread list fetch (%s)"

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->h:Lcom/facebook/fbservice/service/s;

    .line 281
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/server/y;->a(Z)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v0

    .line 286
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 287
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 289
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 292
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v2, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;)V

    .line 293
    new-instance v1, Lcom/facebook/orca/threadlist/bg;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/bg;-><init>(Lcom/facebook/orca/threadlist/bf;)V

    .line 306
    invoke-static {v0, v1}, Lcom/facebook/common/g/c;->a(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)Lcom/facebook/common/g/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    .line 307
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    return-object p1
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 7

    .prologue
    .line 434
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    if-nez v0, :cond_0

    .line 449
    :goto_0
    return-void

    .line 437
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    .line 438
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-object v0, v0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/ThreadsCollection;->a(Lcom/facebook/orca/threads/ThreadsCollection;Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    .line 441
    new-instance v0, Lcom/facebook/orca/threadlist/bm;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-wide v2, v2, Lcom/facebook/orca/threadlist/bm;->b:J

    iget-object v4, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-wide v4, v4, Lcom/facebook/orca/threadlist/bm;->c:J

    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threadlist/bm;-><init>(Lcom/facebook/orca/threads/ThreadsCollection;JJLcom/facebook/fbservice/c/b;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    .line 447
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    .line 448
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadlist/bi;->b(Lcom/facebook/orca/threadlist/bk;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 4

    .prologue
    .line 455
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    new-instance v2, Lcom/facebook/orca/threadlist/bj;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Lcom/facebook/orca/threadlist/bj;-><init>(Lcom/facebook/fbservice/service/ServiceException;Z)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V

    .line 456
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/bf;->b(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/bf;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/bf;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private f()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    invoke-virtual {v0, v2}, Lcom/facebook/common/g/c;->a(Z)V

    .line 173
    iput-object v1, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    invoke-virtual {v0, v2}, Lcom/facebook/common/g/c;->a(Z)V

    .line 177
    iput-object v1, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    .line 179
    :cond_1
    iput-object v1, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    .line 180
    iput-object v1, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    .line 181
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/bf;->f()V

    .line 240
    return-void
.end method

.method public a(Lcom/facebook/orca/threadlist/bi;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    .line 168
    return-void
.end method

.method public a(Lcom/facebook/orca/threadlist/bl;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 189
    sget-object v1, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v2, "startLoad called with %s"

    new-array v3, v7, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    sget-object v1, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v2, "startLoad"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 193
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 194
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Have cached data"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    .line 196
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/k;->f(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v2

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v4, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/f/k;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->d()J

    move-result-wide v4

    .line 198
    new-instance v0, Lcom/facebook/orca/threadlist/bm;

    sget-object v6, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threadlist/bm;-><init>(Lcom/facebook/orca/threads/ThreadsCollection;JJLcom/facebook/fbservice/c/b;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    move v0, v7

    .line 204
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    if-nez v1, :cond_1

    .line 205
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    .line 215
    if-eqz v0, :cond_4

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v0, v0, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-eqz v0, :cond_2

    .line 218
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting load because need to hit server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    .line 233
    :goto_0
    return-void

    .line 208
    :cond_1
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Load already in progress"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bl;Lcom/facebook/orca/threadlist/bl;)Lcom/facebook/orca/threadlist/bl;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    goto :goto_0

    .line 220
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->d(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 221
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Starting load because data cache said to request new update"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 222
    sget-object v0, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0

    .line 224
    :cond_3
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "Finished loading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadlist/bi;->b(Lcom/facebook/orca/threadlist/bk;)V

    goto :goto_0

    .line 230
    :cond_4
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->b:Ljava/lang/Class;

    const-string v1, "No cached data. Starting load"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)V
    .locals 1

    .prologue
    .line 159
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    if-eq p1, v0, :cond_0

    .line 161
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    .line 162
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/bf;->f()V

    .line 164
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v0, v0, Lcom/facebook/orca/threadlist/bl;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->e(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->k:Lcom/facebook/orca/threadlist/bl;

    iget-boolean v0, v0, Lcom/facebook/orca/threadlist/bl;->b:Z

    .line 269
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 5

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->i:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_1

    .line 428
    :cond_0
    :goto_0
    return-void

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    if-nez v0, :cond_0

    .line 395
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-object v0, v0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bf;->l:Lcom/facebook/orca/threadlist/bm;

    iget-object v0, v0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 402
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->e()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threads/ThreadsCollection;->a(I)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    .line 405
    new-instance v2, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    iget-object v3, p0, Lcom/facebook/orca/threadlist/bf;->f:Lcom/facebook/orca/threads/FolderName;

    const/16 v4, 0xa

    invoke-direct {v2, v3, v0, v1, v4}, Lcom/facebook/orca/server/FetchMoreThreadsParams;-><init>(Lcom/facebook/orca/threads/FolderName;JI)V

    .line 407
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 408
    const-string v1, "fetchMoreThreadsParams"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 409
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->j:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 412
    iget-object v1, p0, Lcom/facebook/orca/threadlist/bf;->g:Lcom/facebook/orca/threadlist/bi;

    sget-object v2, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    invoke-interface {v1, v2}, Lcom/facebook/orca/threadlist/bi;->a(Lcom/facebook/orca/threadlist/bk;)V

    .line 413
    new-instance v1, Lcom/facebook/orca/threadlist/bh;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/bh;-><init>(Lcom/facebook/orca/threadlist/bf;)V

    .line 426
    invoke-static {v0, v1}, Lcom/facebook/common/g/c;->a(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)Lcom/facebook/common/g/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadlist/bf;->j:Lcom/facebook/common/g/c;

    .line 427
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

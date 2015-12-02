.class public Lcom/facebook/orca/threadview/ci;
.super Ljava/lang/Object;
.source "ThreadViewLoader.java"


# static fields
.field public static a:Lcom/facebook/orca/threadview/cp;

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

.field private final e:Lcom/facebook/orca/threads/l;

.field private final f:Lcom/facebook/orca/f/r;

.field private final g:Lcom/facebook/orca/threadview/z;

.field private final h:Lcom/facebook/orca/threads/i;

.field private final i:Lcom/facebook/common/e/h;

.field private j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private k:Lcom/facebook/orca/threadview/cl;

.field private l:Ljava/lang/String;

.field private m:Lcom/facebook/common/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/g/c",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/facebook/common/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/g/c",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/facebook/fbservice/service/s;

.field private p:Lcom/facebook/orca/threadview/co;

.field private q:Lcom/facebook/orca/threadview/cp;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 55
    const-class v0, Lcom/facebook/orca/threadview/ci;

    sput-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    .line 70
    new-instance v0, Lcom/facebook/orca/threadview/cp;

    invoke-direct {v0, v1, v1, v1}, Lcom/facebook/orca/threadview/cp;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;)V

    sput-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/f/k;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/threads/l;Lcom/facebook/orca/f/r;Lcom/facebook/orca/threadview/z;Lcom/facebook/orca/threads/i;Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    .line 160
    iput-object p2, p0, Lcom/facebook/orca/threadview/ci;->d:Lcom/facebook/fbservice/ops/k;

    .line 161
    iput-object p3, p0, Lcom/facebook/orca/threadview/ci;->e:Lcom/facebook/orca/threads/l;

    .line 162
    iput-object p4, p0, Lcom/facebook/orca/threadview/ci;->f:Lcom/facebook/orca/f/r;

    .line 163
    iput-object p5, p0, Lcom/facebook/orca/threadview/ci;->g:Lcom/facebook/orca/threadview/z;

    .line 164
    iput-object p6, p0, Lcom/facebook/orca/threadview/ci;->h:Lcom/facebook/orca/threads/i;

    .line 165
    iput-object p7, p0, Lcom/facebook/orca/threadview/ci;->i:Lcom/facebook/common/e/h;

    .line 166
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    return-object p1
.end method

.method private static a(Lcom/facebook/orca/threadview/co;Lcom/facebook/orca/threadview/co;)Lcom/facebook/orca/threadview/co;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 247
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/co;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/facebook/orca/threadview/co;->a:Z

    if-eqz v0, :cond_5

    :cond_0
    move v0, v2

    .line 248
    :goto_0
    iget-boolean v3, p0, Lcom/facebook/orca/threadview/co;->b:Z

    if-nez v3, :cond_1

    iget-boolean v3, p1, Lcom/facebook/orca/threadview/co;->b:Z

    if-eqz v3, :cond_2

    :cond_1
    move v1, v2

    .line 249
    :cond_2
    iget-boolean v2, p0, Lcom/facebook/orca/threadview/co;->a:Z

    if-ne v2, v0, :cond_3

    iget-boolean v2, p0, Lcom/facebook/orca/threadview/co;->b:Z

    if-eq v2, v1, :cond_4

    .line 251
    :cond_3
    new-instance p0, Lcom/facebook/orca/threadview/co;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    .line 253
    :cond_4
    return-object p0

    :cond_5
    move v0, v1

    .line 247
    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threadview/cp;
    .locals 4

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->e:Lcom/facebook/orca/threads/l;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/threads/l;->a(Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 386
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->g:Lcom/facebook/orca/threadview/z;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->f:Lcom/facebook/orca/f/r;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/threadview/z;->a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v1

    .line 390
    new-instance v2, Lcom/facebook/orca/threadview/cp;

    invoke-direct {v2, p1, v0, v1}, Lcom/facebook/orca/threadview/cp;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;)V

    return-object v2
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 325
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 326
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 327
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 334
    :goto_0
    return-void

    .line 328
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 329
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/orca/server/FetchThreadResult;)V

    goto :goto_0

    .line 331
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->i:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Successful fetch w/o thread or user"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    invoke-static {v0}, Lcom/facebook/fbservice/service/ServiceException;->a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 378
    new-instance v0, Lcom/facebook/orca/threadview/cm;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    iget-boolean v1, v1, Lcom/facebook/orca/threadview/co;->b:Z

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threadview/cm;-><init>(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 379
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v2, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v1, v2, v0}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V

    .line 380
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/s;)V
    .locals 4

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_0

    .line 319
    :goto_0
    return-void

    .line 289
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Starting thread fetch (%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->o:Lcom/facebook/fbservice/service/s;

    .line 293
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 294
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v2}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    const/16 v2, 0x14

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v1

    .line 299
    const-string v2, "fetchThreadParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 300
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 303
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v2, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;)V

    .line 304
    new-instance v1, Lcom/facebook/orca/threadview/cj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/cj;-><init>(Lcom/facebook/orca/threadview/ci;)V

    .line 317
    invoke-static {v0, v1}, Lcom/facebook/common/g/c;->a(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)Lcom/facebook/common/g/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    .line 318
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 4

    .prologue
    .line 337
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 338
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    .line 340
    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 341
    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 346
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threadview/cp;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cp;)V

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    .line 350
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    .line 351
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    iget-boolean v1, v1, Lcom/facebook/orca/threadview/co;->a:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->o:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-eq v1, v2, :cond_1

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_HAD_SERVER_ERROR:Lcom/facebook/fbservice/c/b;

    if-eq v0, v1, :cond_1

    .line 356
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Starting load because need to hit server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 357
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/s;)V

    .line 366
    :goto_1
    return-void

    .line 343
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    goto :goto_0

    .line 358
    :cond_1
    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    if-ne v0, v1, :cond_2

    .line 360
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Starting load because data from cache was stale"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 361
    sget-object v0, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_1

    .line 363
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Finished loading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/cl;->b(Lcom/facebook/orca/threadview/cn;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/cp;)V
    .locals 2

    .prologue
    .line 491
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 498
    :goto_0
    return-void

    .line 494
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 495
    const-string v1, "Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    const/16 v1, 0xa

    invoke-direct {p0, v0, p1, v1}, Lcom/facebook/orca/threadview/ci;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threadview/cp;I)V

    .line 497
    sget-object v1, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threadview/cp;I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 501
    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 503
    :cond_0
    const-string v0, "    none\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    :cond_1
    return-void

    :cond_2
    move v3, v1

    move v2, v1

    .line 506
    :goto_0
    if-ge v2, p3, :cond_3

    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 507
    iget-object v0, p2, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 508
    const-string v4, "   "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "(PENDING) \n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    add-int/lit8 v2, v2, 0x1

    .line 506
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_3
    move v0, v1

    move v1, v2

    .line 511
    :goto_1
    if-ge v1, p3, :cond_1

    iget-object v2, p2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 512
    iget-object v2, p2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 513
    const-string v3, "   "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    add-int/lit8 v1, v1, 0x1

    .line 511
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/common/g/c;)Lcom/facebook/common/g/c;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    return-object p1
.end method

.method private b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 267
    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    .line 268
    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    .line 269
    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    .line 270
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    invoke-virtual {v0, v2}, Lcom/facebook/common/g/c;->a(Z)V

    .line 272
    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    invoke-virtual {v0, v2}, Lcom/facebook/common/g/c;->a(Z)V

    .line 276
    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    .line 278
    :cond_1
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 4

    .prologue
    .line 462
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    if-nez v0, :cond_1

    .line 480
    :cond_0
    :goto_0
    return-void

    .line 465
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ci;->r:Z

    .line 466
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    if-eqz v0, :cond_0

    .line 467
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 468
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->h:Lcom/facebook/orca/threads/i;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 472
    new-instance v1, Lcom/facebook/orca/threadview/cp;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v3, v3, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    invoke-direct {v1, v2, v0, v3}, Lcom/facebook/orca/threadview/cp;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    .line 477
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cp;)V

    .line 478
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 4

    .prologue
    .line 486
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    new-instance v2, Lcom/facebook/orca/threadview/cm;

    iget-boolean v3, p0, Lcom/facebook/orca/threadview/ci;->r:Z

    invoke-direct {v2, p1, v3}, Lcom/facebook/orca/threadview/cm;-><init>(Lcom/facebook/fbservice/service/ServiceException;Z)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V

    .line 487
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ci;->r:Z

    .line 488
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 2

    .prologue
    .line 369
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Got canonical user but no thread"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 370
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/user/User;)V

    .line 371
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/cl;->b(Lcom/facebook/orca/threadview/cn;)V

    .line 372
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ci;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ci;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0, p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 171
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ci;->b()V

    .line 173
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/cl;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    .line 177
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/co;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    .line 194
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 195
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 196
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 197
    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/f/k;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    .line 198
    if-eqz v1, :cond_3

    if-eqz v2, :cond_3

    .line 199
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threadview/cp;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cp;)V

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    .line 202
    const/4 v0, 0x1

    .line 217
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    if-nez v1, :cond_5

    .line 218
    iput-object p1, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    .line 225
    if-eqz v0, :cond_8

    .line 227
    iget-boolean v0, p1, Lcom/facebook/orca/threadview/co;->a:Z

    if-eqz v0, :cond_6

    .line 229
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Starting load because need to hit server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 230
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/s;)V

    .line 244
    :goto_2
    return-void

    .line 183
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    .line 185
    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 186
    if-eqz v0, :cond_0

    .line 187
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 188
    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    goto :goto_0

    .line 203
    :cond_3
    if-eqz v1, :cond_1

    .line 204
    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    invoke-interface {v2, v1}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 208
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->f:Lcom/facebook/orca/f/r;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ci;->j:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;

    move-result-object v1

    .line 210
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 211
    new-instance v2, Lcom/facebook/orca/threadview/cp;

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v2, v3, v3, v1}, Lcom/facebook/orca/threadview/cp;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;)V

    .line 212
    invoke-direct {p0, v2}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cp;)V

    .line 213
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v3, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v1, v3, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    goto :goto_1

    .line 220
    :cond_5
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Load already in progress"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/co;Lcom/facebook/orca/threadview/co;)Lcom/facebook/orca/threadview/co;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    goto :goto_2

    .line 231
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 232
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Starting load because data cache said to request new update"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 233
    sget-object v0, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_2

    .line 235
    :cond_7
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "Finished loading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/cl;->b(Lcom/facebook/orca/threadview/cn;)V

    goto/16 :goto_2

    .line 241
    :cond_8
    sget-object v0, Lcom/facebook/orca/threadview/ci;->b:Ljava/lang/Class;

    const-string v1, "No cached data. Starting load"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 242
    sget-object v0, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/fbservice/service/s;)V

    goto/16 :goto_2
.end method

.method public a(Z)V
    .locals 7

    .prologue
    .line 398
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->m:Lcom/facebook/common/g/c;

    if-eqz v0, :cond_1

    .line 456
    :cond_0
    :goto_0
    return-void

    .line 402
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    if-nez v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 415
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-eqz v1, :cond_0

    .line 419
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->q:Lcom/facebook/orca/threadview/cp;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 424
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 426
    const-wide/16 v2, 0x0

    .line 427
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v4

    .line 428
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    const/16 v6, 0x14

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreMessagesParams;-><init>(Lcom/facebook/orca/server/ThreadCriteria;JJI)V

    .line 434
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 435
    const-string v2, "fetchMoreMessagesParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 436
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->u:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 439
    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->k:Lcom/facebook/orca/threadview/cl;

    sget-object v2, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    invoke-interface {v1, v2}, Lcom/facebook/orca/threadview/cl;->a(Lcom/facebook/orca/threadview/cn;)V

    .line 440
    iput-boolean p1, p0, Lcom/facebook/orca/threadview/ci;->r:Z

    .line 441
    new-instance v1, Lcom/facebook/orca/threadview/ck;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/ck;-><init>(Lcom/facebook/orca/threadview/ci;)V

    .line 454
    invoke-static {v0, v1}, Lcom/facebook/common/g/c;->a(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)Lcom/facebook/common/g/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadview/ci;->n:Lcom/facebook/common/g/c;

    .line 455
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->p:Lcom/facebook/orca/threadview/co;

    iget-boolean v0, v0, Lcom/facebook/orca/threadview/co;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ci;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ci;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->e(Ljava/lang/String;)Z

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

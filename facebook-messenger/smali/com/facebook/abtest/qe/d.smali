.class public Lcom/facebook/abtest/qe/d;
.super Ljava/lang/Object;
.source "QuickExperimentManagerImpl.java"

# interfaces
.implements Lcom/facebook/abtest/qe/c;


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
.field private final b:Lcom/facebook/abtest/qe/b/a;

.field private final c:Lcom/facebook/abtest/qe/c/e;

.field private final d:Lcom/facebook/abtest/qe/e/a;

.field private final e:Lcom/google/common/d/a/u;

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/facebook/abtest/qe/g/a;

.field private final h:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/abtest/qe/d;

    sput-object v0, Lcom/facebook/abtest/qe/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/c/e;Lcom/facebook/abtest/qe/e/a;Lcom/google/common/d/a/u;Lcom/facebook/common/executors/a;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/common/e/h;)V
    .locals 1
    .param p4    # Lcom/google/common/d/a/u;
        .annotation runtime Lcom/facebook/common/executors/DefaultExecutorService;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->b:Lcom/facebook/abtest/qe/b/a;

    .line 65
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c/e;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->c:Lcom/facebook/abtest/qe/c/e;

    .line 66
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/e/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->d:Lcom/facebook/abtest/qe/e/a;

    .line 67
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/u;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->e:Lcom/google/common/d/a/u;

    .line 68
    invoke-static {p5}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->f:Lcom/facebook/common/executors/a;

    .line 69
    invoke-static {p6}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/g/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->g:Lcom/facebook/abtest/qe/g/a;

    .line 70
    invoke-static {p7}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d;->h:Lcom/facebook/common/e/h;

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/d;Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Lcom/facebook/abtest/qe/d;->b(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/abtest/qe/d;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 163
    iget-object v0, p0, Lcom/facebook/abtest/qe/d;->c:Lcom/facebook/abtest/qe/c/e;

    sget-object v1, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/abtest/qe/c/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 157
    sget-object v0, Lcom/facebook/abtest/qe/d;->a:Ljava/lang/Class;

    const-string v1, "%s - %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lcom/facebook/abtest/qe/d;->h:Lcom/facebook/common/e/h;

    invoke-interface {v0, p1, p2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/d;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 108
    invoke-virtual {p0, p1, v0, p2}, Lcom/facebook/abtest/qe/d;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/data/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 114
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/d;->b:Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/abtest/qe/b/a;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/data/d;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/abtest/qe/d;->e:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/abtest/qe/e;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/abtest/qe/e;-><init>(Lcom/facebook/abtest/qe/d;Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/data/d;)Z
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 132
    if-eqz p2, :cond_2

    const/4 v0, 0x1

    .line 133
    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "QuickExperiment Name failure: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Storage returned value of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/abtest/qe/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 139
    :cond_0
    iget-object v2, p0, Lcom/facebook/abtest/qe/d;->g:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v2}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 140
    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QuickExperiment Locale failure: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , got "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/abtest/qe/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 147
    :cond_1
    if-eqz v0, :cond_3

    invoke-interface {p3, p2}, Lcom/facebook/abtest/qe/data/d;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "QuickExperiment Invalid: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to validate object "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/abtest/qe/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    :goto_1
    return v1

    :cond_2
    move v0, v1

    .line 132
    goto/16 :goto_0

    :cond_3
    move v1, v0

    goto :goto_1
.end method

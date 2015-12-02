.class public Lcom/facebook/bugreporter/activity/tasklist/c;
.super Ljava/lang/Object;
.source "TaskListFetcher.java"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/http/protocol/aq;

.field private final c:Lcom/facebook/bugreporter/activity/tasklist/e;

.field private final d:Lcom/google/common/d/a/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/bugreporter/activity/tasklist/e;Lcom/google/common/d/a/u;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->b:Lcom/facebook/http/protocol/aq;

    .line 29
    iput-object p2, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->c:Lcom/facebook/bugreporter/activity/tasklist/e;

    .line 30
    iput-object p3, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->d:Lcom/google/common/d/a/u;

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/tasklist/c;Ljava/lang/String;Lcom/facebook/bugreporter/l;)Lcom/google/common/a/es;
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/facebook/bugreporter/activity/tasklist/c;->b(Ljava/lang/String;Lcom/facebook/bugreporter/l;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Lcom/facebook/bugreporter/l;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/bugreporter/l;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;"
        }
    .end annotation

    .prologue
    .line 59
    :try_start_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 60
    invoke-interface {p2}, Lcom/facebook/bugreporter/l;->b()Lcom/google/common/a/fi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    .line 61
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 63
    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/f;

    invoke-direct {v1, v0, p1}, Lcom/facebook/bugreporter/activity/tasklist/f;-><init>(Lcom/google/common/a/es;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->b:Lcom/facebook/http/protocol/aq;

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->c:Lcom/facebook/bugreporter/activity/tasklist/e;

    invoke-interface {v0, v2, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/es;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    if-eqz v0, :cond_0

    .line 74
    :goto_0
    return-object v0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    sget-object v1, Lcom/facebook/bugreporter/activity/tasklist/c;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception caught running SingleMethodRunner: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/bugreporter/l;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/bugreporter/l;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/c;->d:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/d;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/bugreporter/activity/tasklist/d;-><init>(Lcom/facebook/bugreporter/activity/tasklist/c;Ljava/lang/String;Lcom/facebook/bugreporter/l;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.class public Lcom/facebook/orca/f/x;
.super Ljava/lang/Object;
.source "SpamThreadManager.java"


# instance fields
.field private final a:Lcom/facebook/orca/app/g;

.field private final b:Lcom/facebook/fbservice/ops/k;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/app/g;Lcom/facebook/fbservice/ops/k;)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/f/x;->a:Lcom/facebook/orca/app/g;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/f/x;->b:Lcom/facebook/fbservice/ops/k;

    .line 34
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    .line 35
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 79
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/f/x;->a:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/x;Lcom/facebook/fbservice/service/OperationResult;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/fbservice/service/OperationResult;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/x;Lcom/facebook/fbservice/service/ServiceException;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/fbservice/service/ServiceException;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 6

    .prologue
    .line 43
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    .line 44
    new-instance v0, Lcom/facebook/orca/server/MarkThreadParams;

    sget-object v2, Lcom/facebook/orca/server/ai;->SPAM:Lcom/facebook/orca/server/ai;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/MarkThreadParams;-><init>(Ljava/lang/String;Lcom/facebook/orca/server/ai;ZJ)V

    .line 50
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 51
    const-string v3, "markThreadParams"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/f/x;->b:Lcom/facebook/fbservice/ops/k;

    sget-object v3, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v3, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 55
    new-instance v2, Lcom/facebook/orca/f/y;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/f/y;-><init>(Lcom/facebook/orca/f/x;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/f/x;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.class public Lcom/facebook/orca/f/o;
.super Ljava/lang/Object;
.source "ReadThreadManager.java"


# instance fields
.field private final a:Lcom/facebook/orca/app/g;

.field private final b:Lcom/facebook/fbservice/ops/k;

.field private final c:Lcom/facebook/orca/f/ad;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/app/g;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/f/ad;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/f/o;->a:Lcom/facebook/orca/app/g;

    .line 27
    iput-object p2, p0, Lcom/facebook/orca/f/o;->b:Lcom/facebook/fbservice/ops/k;

    .line 28
    iput-object p3, p0, Lcom/facebook/orca/f/o;->c:Lcom/facebook/orca/f/ad;

    .line 29
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 6

    .prologue
    .line 37
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    .line 38
    iget-object v0, p0, Lcom/facebook/orca/f/o;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;J)V

    .line 40
    new-instance v0, Lcom/facebook/orca/server/MarkThreadParams;

    sget-object v2, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/MarkThreadParams;-><init>(Ljava/lang/String;Lcom/facebook/orca/server/ai;ZJ)V

    .line 44
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 45
    const-string v3, "markThreadParams"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 46
    iget-object v0, p0, Lcom/facebook/orca/f/o;->b:Lcom/facebook/fbservice/ops/k;

    sget-object v3, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v3, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/f/o;->a:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/app/g;->b(Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 6

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/f/o;->c:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;J)V

    .line 61
    new-instance v0, Lcom/facebook/orca/server/MarkThreadParams;

    sget-object v2, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    const/4 v3, 0x0

    move-object v1, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/MarkThreadParams;-><init>(Ljava/lang/String;Lcom/facebook/orca/server/ai;ZJ)V

    .line 67
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 68
    const-string v2, "markThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/f/o;->b:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/f/o;->a:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/app/g;->b(Ljava/lang/String;)V

    .line 73
    return-void
.end method

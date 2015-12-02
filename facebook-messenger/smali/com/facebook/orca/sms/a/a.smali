.class public Lcom/facebook/orca/sms/a/a;
.super Ljava/lang/Object;
.source "ExternalSmsOperationsHandler.java"


# instance fields
.field private final a:Lcom/facebook/auth/b/b;

.field private final b:Lcom/facebook/fbservice/ops/k;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/app/dt;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/fbservice/ops/k;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/app/dt;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/sms/a/a;->a:Lcom/facebook/auth/b/b;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/sms/a/a;->b:Lcom/facebook/fbservice/ops/k;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/sms/a/a;->c:Ljavax/inject/a;

    .line 31
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 35
    new-instance v0, Lcom/facebook/orca/server/DeleteThreadParams;

    invoke-static {v2, v3}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/orca/server/DeleteThreadParams;-><init>(Ljava/lang/String;)V

    .line 37
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 38
    const-string v3, "deleteThreadParams"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 39
    iget-object v0, p0, Lcom/facebook/orca/sms/a/a;->b:Lcom/facebook/fbservice/ops/k;

    sget-object v3, Lcom/facebook/orca/server/aq;->g:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v3, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/a/a;->a:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    iget-object v0, p0, Lcom/facebook/orca/sms/a/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/dt;

    invoke-virtual {v0}, Lcom/facebook/orca/app/dt;->b()V

    .line 45
    :cond_1
    return-void
.end method

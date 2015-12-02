.class public Lcom/facebook/orca/push/b;
.super Ljava/lang/Object;
.source "MessagesPushHandler.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/notify/av;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/base/a/d;

.field private final e:Lcom/facebook/analytics/cn;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/orca/notify/av;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/a/d;Lcom/facebook/analytics/cn;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;",
            "Lcom/facebook/orca/notify/av;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/base/a/d;",
            "Lcom/facebook/analytics/cn;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/push/b;->a:Ljavax/inject/a;

    .line 44
    iput-object p2, p0, Lcom/facebook/orca/push/b;->b:Lcom/facebook/orca/notify/av;

    .line 45
    iput-object p3, p0, Lcom/facebook/orca/push/b;->c:Lcom/facebook/fbservice/ops/k;

    .line 46
    iput-object p4, p0, Lcom/facebook/orca/push/b;->d:Lcom/facebook/base/a/d;

    .line 47
    iput-object p5, p0, Lcom/facebook/orca/push/b;->e:Lcom/facebook/analytics/cn;

    .line 48
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V
    .locals 5

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/push/b;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/push/b;->e:Lcom/facebook/analytics/cn;

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/facebook/push/g;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "from_viewer"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :goto_0
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/b;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/notify/av;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/notify/bi;)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/push/b;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/bi;)V

    .line 99
    return-void
.end method

.method public a(Lcom/facebook/orca/notify/w;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/push/b;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/w;)V

    .line 84
    return-void
.end method

.method public a(Lcom/facebook/orca/push/a;)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/orca/push/b;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/push/a;)V

    .line 95
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/push/b;->d:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 64
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    const-string v1, "threadId"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v1, "message"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 67
    iget-object v1, p0, Lcom/facebook/orca/push/b;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->y:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Z)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    .line 70
    if-eqz p1, :cond_0

    .line 71
    invoke-direct {p0, p1, p3, p4}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    .line 73
    :cond_0
    return-void
.end method

.class public Lcom/facebook/orca/threads/x;
.super Ljava/lang/Object;
.source "ThreadSummaryStitching.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/threads/r;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/orca/threads/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/threads/r;",
            ")V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/threads/x;->a:Ljavax/inject/a;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/threads/x;->b:Lcom/facebook/orca/threads/r;

    .line 29
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 8

    .prologue
    const/16 v7, 0x78

    const/4 v2, 0x0

    .line 34
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 39
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 40
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->m()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 42
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 43
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threads/x;->b:Lcom/facebook/orca/threads/r;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/threads/r;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v0

    .line 48
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v7, :cond_3

    .line 49
    invoke-virtual {v0, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 52
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threads/x;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 53
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 56
    :goto_2
    new-instance v2, Lcom/facebook/orca/threads/v;

    invoke-direct {v2}, Lcom/facebook/orca/threads/v;-><init>()V

    invoke-virtual {v2, p1}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/threads/v;->c(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/threads/v;->d(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/v;->d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/orca/threads/v;->d(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v2

    .line 53
    goto :goto_2

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.class public Lcom/facebook/orca/threads/q;
.super Ljava/lang/Object;
.source "ThreadParticipantUtils.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/orca/threads/q;

    sput-object v0, Lcom/facebook/orca/threads/q;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/threads/q;->b:Ljavax/inject/a;

    .line 24
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 4

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/threads/q;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 34
    if-eqz v0, :cond_1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 36
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 41
    :goto_0
    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    move-object v1, v0

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 1

    .prologue
    .line 45
    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/q;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 51
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threads/q;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 62
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 63
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 64
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v4

    sget-object v5, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-static {v4, v5}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 66
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 69
    :cond_1
    return-object v2
.end method

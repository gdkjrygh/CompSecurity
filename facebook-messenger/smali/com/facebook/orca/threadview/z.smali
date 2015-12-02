.class public Lcom/facebook/orca/threadview/z;
.super Ljava/lang/Object;
.source "PendingSendsDeduper.java"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/threadview/z;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threadview/z;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 37
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 65
    :goto_0
    return-object v0

    .line 43
    :cond_0
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 44
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 45
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 50
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 52
    sget-object v3, Lcom/facebook/orca/threadview/z;->a:Ljava/lang/String;

    const-string v4, "Deduped message %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    .line 58
    :cond_3
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 59
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 60
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 61
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_3

    .line 65
    :cond_5
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.class Lcom/facebook/messages/ipc/peer/a;
.super Ljava/lang/Object;
.source "ActiveThreadsForPeerRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Lcom/facebook/common/u/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/u/c",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    .line 43
    iput-object p1, p0, Lcom/facebook/messages/ipc/peer/a;->a:Landroid/net/Uri;

    .line 44
    new-instance v0, Lcom/facebook/common/u/c;

    invoke-direct {v0}, Lcom/facebook/common/u/c;-><init>()V

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->b:Lcom/facebook/common/u/c;

    .line 45
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->b:Lcom/facebook/common/u/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/{thread_id}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "THREAD"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->d:Ljava/lang/String;

    .line 47
    return-void
.end method

.method private b(Landroid/net/Uri;)Lcom/google/common/base/Optional;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 151
    .line 153
    :try_start_0
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->b:Lcom/facebook/common/u/c;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;)Lcom/facebook/common/u/i;

    move-result-object v0

    .line 154
    if-eqz v0, :cond_0

    const-string v1, "THREAD"

    iget-object v2, v0, Lcom/facebook/common/u/i;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 155
    iget-object v0, v0, Lcom/facebook/common/u/i;->b:Landroid/os/Bundle;

    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;
    :try_end_0
    .catch Lcom/facebook/common/u/d; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 161
    :goto_0
    return-object v0

    .line 158
    :catch_0
    move-exception v0

    .line 161
    :cond_0
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 85
    return-void
.end method

.method a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
    .locals 2

    .prologue
    .line 133
    invoke-direct {p0, p1}, Lcom/facebook/messages/ipc/peer/a;->b(Landroid/net/Uri;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 135
    iget-object v1, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 136
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p2, Lcom/facebook/i/a/a/d;->b:Z

    .line 142
    :cond_0
    return-void
.end method

.method a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-static {v1}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 57
    return-void
.end method

.method a(Landroid/net/Uri;)Z
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->a:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/messages/ipc/peer/a;->b(Landroid/net/Uri;)Lcom/google/common/base/Optional;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

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

.method a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->a:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 108
    const/4 v0, 0x1

    .line 122
    :goto_0
    return v0

    .line 111
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/messages/ipc/peer/a;->b(Landroid/net/Uri;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 113
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 115
    if-eqz v1, :cond_1

    .line 116
    iget-object v1, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 118
    :cond_1
    iget-object v1, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 122
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 67
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/a;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    const-class v0, Lcom/facebook/messages/ipc/peer/a;

    const-string v1, "%s should not be null in the bundle, it happened because some bad upgrade had happened."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/messages/ipc/peer/a;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    :cond_0
    return-void

    .line 75
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 76
    iget-object v2, p0, Lcom/facebook/messages/ipc/peer/a;->c:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

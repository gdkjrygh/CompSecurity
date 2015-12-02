.class public Lcom/facebook/contacts/a/b;
.super Ljava/lang/Object;
.source "ContactsCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/contacts/models/Contact;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/contacts/models/ContactDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const-wide/16 v3, 0x258

    const/16 v2, 0x64

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v1}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/a/b;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 36
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v1}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/a/b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 40
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/Contact;
    .locals 1

    .prologue
    .line 48
    if-nez p1, :cond_0

    .line 49
    const/4 v0, 0x0

    .line 51
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/a/b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/a/b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 44
    iget-object v0, p0, Lcom/facebook/contacts/a/b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 45
    return-void
.end method

.method public a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V
    .locals 3
    .param p2    # Lcom/facebook/contacts/models/ContactDetails;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 62
    invoke-static {p1}, Lcom/facebook/contacts/models/f;->b(Lcom/facebook/contacts/models/Contact;)Lcom/google/common/a/em;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 63
    iget-object v2, p0, Lcom/facebook/contacts/a/b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v0, p1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    if-eqz p2, :cond_0

    .line 65
    iget-object v2, p0, Lcom/facebook/contacts/a/b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v0, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 68
    :cond_1
    return-void
.end method

.method public b(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;
    .locals 1

    .prologue
    .line 55
    if-nez p1, :cond_0

    .line 56
    const/4 v0, 0x0

    .line 58
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/a/b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/ContactDetails;

    goto :goto_0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/facebook/contacts/a/b;->a()V

    .line 78
    return-void
.end method

.class public Lcom/facebook/contacts/a/c;
.super Ljava/lang/Object;
.source "DynamicContactDataCache.java"

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
            "Lcom/facebook/user/LastActive;",
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
            "Lcom/facebook/user/ChatContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x258

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/a/c;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 41
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/a/c;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 45
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/LastActive;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/LastActive;

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 70
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;Lcom/facebook/user/LastActive;)V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/ChatContext;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->putAll(Ljava/util/Map;)V

    .line 61
    return-void
.end method

.method public b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/contacts/a/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/ChatContext;

    return-object v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/contacts/a/c;->a()V

    .line 75
    return-void
.end method

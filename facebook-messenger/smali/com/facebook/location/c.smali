.class public Lcom/facebook/location/c;
.super Ljava/lang/Object;
.source "GeocodingCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Lcom/facebook/location/g;


# instance fields
.field private final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/location/p;",
            "Lcom/facebook/location/g;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/location/p;",
            "Lcom/facebook/location/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/location/Coordinates;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/location/g;

    invoke-direct {v0}, Lcom/facebook/location/g;-><init>()V

    sput-object v0, Lcom/facebook/location/c;->a:Lcom/facebook/location/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x384

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/c;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 39
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x708

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/c;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 43
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x258

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/c;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 47
    return-void
.end method

.method private a(Lcom/facebook/location/g;)Lcom/facebook/location/g;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Lcom/facebook/location/c;->a:Lcom/facebook/location/g;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method private a(Ljava/util/concurrent/ConcurrentMap;Lcom/facebook/location/Coordinates;)Lcom/facebook/location/g;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/location/p;",
            "Lcom/facebook/location/g;",
            ">;",
            "Lcom/facebook/location/Coordinates;",
            ")",
            "Lcom/facebook/location/g;"
        }
    .end annotation

    .prologue
    .line 105
    invoke-static {p2}, Lcom/facebook/location/p;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/p;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/g;

    .line 107
    if-eqz v0, :cond_0

    .line 108
    invoke-direct {p0, v0}, Lcom/facebook/location/c;->a(Lcom/facebook/location/g;)Lcom/facebook/location/g;

    move-result-object v8

    .line 126
    :goto_0
    return-object v8

    .line 114
    :cond_0
    invoke-interface {p1}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/facebook/location/g;

    .line 115
    sget-object v0, Lcom/facebook/location/c;->a:Lcom/facebook/location/g;

    if-eq v8, v0, :cond_1

    .line 118
    invoke-virtual {p2}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v2

    invoke-virtual {v8}, Lcom/facebook/location/g;->a()D

    move-result-wide v4

    invoke-virtual {v8}, Lcom/facebook/location/g;->b()D

    move-result-wide v6

    invoke-static/range {v0 .. v7}, Lcom/facebook/location/ab;->a(DDDD)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 126
    :cond_2
    const/4 v8, 0x0

    goto :goto_0
.end method

.method private b(Lcom/facebook/location/g;)Lcom/facebook/location/g;
    .locals 0

    .prologue
    .line 100
    if-nez p1, :cond_0

    sget-object p1, Lcom/facebook/location/c;->a:Lcom/facebook/location/g;

    :cond_0
    return-object p1
.end method


# virtual methods
.method public a(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/g;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/location/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-direct {p0, v0, p1}, Lcom/facebook/location/c;->a(Ljava/util/concurrent/ConcurrentMap;Lcom/facebook/location/Coordinates;)Lcom/facebook/location/g;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/location/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 162
    iget-object v0, p0, Lcom/facebook/location/c;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 163
    iget-object v0, p0, Lcom/facebook/location/c;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 164
    return-void
.end method

.method public a(Lcom/facebook/location/Coordinates;Lcom/facebook/location/g;)V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/location/c;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, Lcom/facebook/location/p;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/p;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/location/c;->b(Lcom/facebook/location/g;)Lcom/facebook/location/g;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    return-void
.end method

.method public a(Lcom/facebook/location/Coordinates;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/location/c;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    return-void
.end method

.method public b(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/g;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/location/c;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-direct {p0, v0, p1}, Lcom/facebook/location/c;->a(Ljava/util/concurrent/ConcurrentMap;Lcom/facebook/location/Coordinates;)Lcom/facebook/location/g;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/location/Coordinates;Lcom/facebook/location/g;)V
    .locals 3

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/location/c;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, Lcom/facebook/location/p;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/p;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/location/c;->b(Lcom/facebook/location/g;)Lcom/facebook/location/g;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    return-void
.end method

.method public c(Lcom/facebook/location/Coordinates;)Ljava/lang/String;
    .locals 10

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/location/c;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/facebook/location/Coordinates;

    .line 139
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v2

    invoke-virtual {v8}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v4

    invoke-virtual {v8}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v6

    invoke-static/range {v0 .. v7}, Lcom/facebook/location/ab;->a(DDDD)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/facebook/location/c;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v8}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 147
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/facebook/location/c;->a()V

    .line 169
    return-void
.end method

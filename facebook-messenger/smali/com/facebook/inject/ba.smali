.class public Lcom/facebook/inject/ba;
.super Ljava/lang/Object;
.source "SingletonScope.java"

# interfaces
.implements Lcom/facebook/inject/au;
.implements Lcom/facebook/inject/ax;
.implements Lcom/facebook/inject/ay;


# instance fields
.field private final a:Z

.field private b:Lcom/facebook/inject/t;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Z)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-boolean p1, p0, Lcom/facebook/inject/ba;->a:Z

    .line 30
    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 60
    const-string v0, "SingletonScope.initializeEagerSingletons"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 61
    iget-object v0, p0, Lcom/facebook/inject/ba;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/s;

    .line 62
    iget-object v3, v0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    sget-object v4, Lcom/facebook/inject/f;->EAGER:Lcom/facebook/inject/f;

    if-ne v3, v4, :cond_0

    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Key: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 64
    iget-object v4, p0, Lcom/facebook/inject/ba;->b:Lcom/facebook/inject/t;

    iget-object v0, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-virtual {v4, v0}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    .line 65
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 69
    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;Ljavax/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/inject/az;

    invoke-direct {v0, p2}, Lcom/facebook/inject/az;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method a()V
    .locals 5

    .prologue
    .line 75
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 76
    iget-object v0, p0, Lcom/facebook/inject/ba;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/s;

    .line 77
    iget-object v3, v0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    sget-object v4, Lcom/facebook/inject/f;->LESS_EAGER_ON_UI_THREAD:Lcom/facebook/inject/f;

    if-ne v3, v4, :cond_0

    .line 78
    iget-object v0, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_1
    new-instance v0, Lcom/facebook/inject/ad;

    iget-object v2, p0, Lcom/facebook/inject/ba;->b:Lcom/facebook/inject/t;

    invoke-direct {v0, v2}, Lcom/facebook/inject/ad;-><init>(Lcom/facebook/inject/t;)V

    .line 83
    invoke-virtual {v0, v1}, Lcom/facebook/inject/ad;->a(Ljava/util/Set;)V

    .line 84
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/inject/ba;->b:Lcom/facebook/inject/t;

    .line 40
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/s;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/inject/ba;->c:Ljava/util/List;

    .line 46
    iget-boolean v0, p0, Lcom/facebook/inject/ba;->a:Z

    if-eqz v0, :cond_0

    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/ba;->b()V

    .line 49
    :cond_0
    return-void
.end method

.method public annotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    const-class v0, Ljavax/inject/Singleton;

    return-object v0
.end method

.class public Lcom/facebook/inject/l;
.super Lcom/facebook/inject/a;
.source "ContextAwareInjector.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/inject/n;

.field private final c:Lcom/facebook/inject/ab;


# direct methods
.method public constructor <init>(Lcom/facebook/inject/ab;Lcom/facebook/inject/n;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/inject/a;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    .line 29
    iput-object p2, p0, Lcom/facebook/inject/l;->b:Lcom/facebook/inject/n;

    .line 30
    iput-object p3, p0, Lcom/facebook/inject/l;->a:Landroid/content/Context;

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/facebook/inject/l;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/l;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/inject/l;)Lcom/facebook/inject/n;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/l;->b:Lcom/facebook/inject/n;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/inject/l;)Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    .line 38
    new-instance v1, Lcom/facebook/inject/m;

    invoke-direct {v1, p0, v0}, Lcom/facebook/inject/m;-><init>(Lcom/facebook/inject/l;Ljavax/inject/a;)V

    return-object v1
.end method

.method public c(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/inject/l;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    invoke-interface {v0}, Lcom/facebook/inject/ab;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/inject/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->d(Lcom/google/inject/a;)Z

    move-result v0

    return v0
.end method

.method public e()Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/inject/l;->c:Lcom/facebook/inject/ab;

    invoke-interface {v0}, Lcom/facebook/inject/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    return-object v0
.end method

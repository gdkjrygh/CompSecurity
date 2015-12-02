.class public Lcom/facebook/inject/ah;
.super Ljava/lang/Object;
.source "MultiBinder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/inject/t;

.field private final b:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<+TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/inject/t;Lcom/google/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/t;",
            "Lcom/google/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/inject/ah;->a:Lcom/facebook/inject/t;

    .line 26
    iput-object p2, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    .line 27
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/ah;->c:Ljava/util/Set;

    .line 28
    return-void
.end method

.method static synthetic a(Lcom/facebook/inject/ah;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/ah;->c:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/inject/ah;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/ah;->a:Lcom/facebook/inject/t;

    return-object v0
.end method


# virtual methods
.method a()Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/inject/ai;

    invoke-direct {v0, p0}, Lcom/facebook/inject/ai;-><init>(Lcom/facebook/inject/ah;)V

    return-object v0
.end method

.method public a(Lcom/google/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/inject/ah;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    return-void
.end method

.method b()Lcom/google/inject/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/a",
            "<+TT;>;"
        }
    .end annotation

    .prologue
    .line 57
    new-instance v0, Lcom/google/inject/a/g;

    const/4 v1, 0x0

    const-class v2, Ljava/util/Set;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/reflect/Type;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    invoke-virtual {v5}, Lcom/google/inject/a;->a()Lcom/google/inject/f;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/f;->b()Ljava/lang/reflect/Type;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/a/g;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 60
    iget-object v1, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    invoke-virtual {v1}, Lcom/google/inject/a;->c()Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    iget-object v1, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    invoke-virtual {v1}, Lcom/google/inject/a;->c()Ljava/lang/annotation/Annotation;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/inject/a;->a(Ljava/lang/reflect/Type;Ljava/lang/annotation/Annotation;)Lcom/google/inject/a;

    move-result-object v0

    .line 68
    :goto_0
    return-object v0

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    invoke-virtual {v1}, Lcom/google/inject/a;->b()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 63
    iget-object v1, p0, Lcom/facebook/inject/ah;->b:Lcom/google/inject/a;

    invoke-virtual {v1}, Lcom/google/inject/a;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/inject/a;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v0}, Lcom/google/inject/a;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/a;

    move-result-object v0

    goto :goto_0
.end method

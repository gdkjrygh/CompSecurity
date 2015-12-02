.class public Lcom/facebook/ui/images/b/ab;
.super Ljava/lang/Object;
.source "MultiFetchImageParams.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/ui/images/b/m;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ui/images/base/a;


# direct methods
.method public constructor <init>(Lcom/google/common/a/es;Lcom/facebook/ui/images/base/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/ui/images/b/m;",
            ">;",
            "Lcom/facebook/ui/images/base/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    .line 31
    iput-object p2, p0, Lcom/facebook/ui/images/b/ab;->b:Lcom/facebook/ui/images/base/a;

    .line 32
    return-void
.end method

.method public static a(Lcom/facebook/ui/images/b/ab;Lcom/facebook/ui/images/b/ab;)Z
    .locals 1

    .prologue
    .line 79
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 80
    const/4 v0, 0x1

    .line 84
    :goto_0
    return v0

    .line 81
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    .line 82
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/ab;->a(Lcom/facebook/ui/images/b/ab;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/ui/images/b/m;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public a(Lcom/facebook/ui/images/b/ab;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 59
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    iget-object v1, p1, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 72
    :cond_0
    :goto_0
    return v3

    :cond_1
    move v2, v3

    .line 62
    :goto_1
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 63
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    invoke-virtual {v0, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    iget-object v1, p1, Lcom/facebook/ui/images/b/ab;->a:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/images/b/m;

    invoke-static {v0, v1}, Lcom/facebook/ui/images/b/m;->a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/m;)Z

    move-result v0

    .line 67
    if-eqz v0, :cond_0

    .line 62
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->b:Lcom/facebook/ui/images/base/a;

    iget-object v1, p1, Lcom/facebook/ui/images/b/ab;->b:Lcom/facebook/ui/images/base/a;

    if-ne v0, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0
.end method

.method public b()Lcom/facebook/ui/images/base/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/ui/images/b/ab;->b:Lcom/facebook/ui/images/base/a;

    return-object v0
.end method

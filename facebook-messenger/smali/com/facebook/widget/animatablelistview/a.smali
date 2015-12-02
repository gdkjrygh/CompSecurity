.class public Lcom/facebook/widget/animatablelistview/a;
.super Ljava/lang/Object;
.source "AnimatingItemInfo.java"


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
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/widget/animatablelistview/b;",
            ">;"
        }
    .end annotation
.end field

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/widget/animatablelistview/a",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->a:Ljava/util/Set;

    .line 33
    iput v1, p0, Lcom/facebook/widget/animatablelistview/a;->b:F

    .line 34
    iput v1, p0, Lcom/facebook/widget/animatablelistview/a;->c:F

    .line 35
    iput v1, p0, Lcom/facebook/widget/animatablelistview/a;->d:F

    .line 36
    iput v1, p0, Lcom/facebook/widget/animatablelistview/a;->e:F

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/animatablelistview/a;->f:I

    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/b;

    .line 166
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/b;->a()V

    goto :goto_0

    .line 168
    :cond_0
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/facebook/widget/animatablelistview/a;->b:F

    return v0
.end method

.method public a(I)Lcom/facebook/widget/animatablelistview/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/facebook/widget/animatablelistview/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 179
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/common/a/ik;->a(I)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/a;

    .line 182
    if-nez v0, :cond_1

    .line 183
    new-instance v0, Lcom/facebook/widget/animatablelistview/a;

    invoke-direct {v0}, Lcom/facebook/widget/animatablelistview/a;-><init>()V

    .line 184
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    :cond_1
    return-object v0
.end method

.method public a(Lcom/facebook/widget/animatablelistview/b;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    return-void
.end method

.method public b()F
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/facebook/widget/animatablelistview/a;->c:F

    return v0
.end method

.method public b(Lcom/facebook/widget/animatablelistview/b;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 162
    return-void
.end method

.method public c()F
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/facebook/widget/animatablelistview/a;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/facebook/widget/animatablelistview/a;->e:F

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 133
    iget v0, p0, Lcom/facebook/widget/animatablelistview/a;->f:I

    return v0
.end method

.method public f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/widget/animatablelistview/a",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 195
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/a;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 198
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0
.end method

.method public setAlpha(F)V
    .locals 0

    .prologue
    .line 123
    iput p1, p0, Lcom/facebook/widget/animatablelistview/a;->e:F

    .line 124
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/a;->g()V

    .line 125
    return-void
.end method

.method public setAnimationOffset(F)V
    .locals 1

    .prologue
    .line 65
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 66
    iput p1, p0, Lcom/facebook/widget/animatablelistview/a;->b:F

    .line 67
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/a;->g()V

    .line 68
    return-void

    .line 65
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setScaleX(F)V
    .locals 0

    .prologue
    .line 85
    iput p1, p0, Lcom/facebook/widget/animatablelistview/a;->c:F

    .line 86
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/a;->g()V

    .line 87
    return-void
.end method

.method public setScaleY(F)V
    .locals 0

    .prologue
    .line 104
    iput p1, p0, Lcom/facebook/widget/animatablelistview/a;->d:F

    .line 105
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/a;->g()V

    .line 106
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .prologue
    .line 142
    iput p1, p0, Lcom/facebook/widget/animatablelistview/a;->f:I

    .line 143
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/a;->g()V

    .line 144
    return-void
.end method

.class public final Lcom/roidapp/baselib/c/y;
.super Landroid/support/v7/widget/al;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/support/v7/widget/al;",
        ">",
        "Landroid/support/v7/widget/al",
        "<",
        "Landroid/support/v7/widget/bi;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v7/widget/al;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/al;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/support/v7/widget/al;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    .line 45
    iput-object p1, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    .line 47
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    new-instance v1, Lcom/roidapp/baselib/c/z;

    invoke-direct {v1, p0}, Lcom/roidapp/baselib/c/z;-><init>(Lcom/roidapp/baselib/c/y;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/al;->a(Landroid/support/v7/widget/an;)V

    .line 74
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 194
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final a(I)I
    .locals 2

    .prologue
    .line 199
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 200
    add-int/lit16 v0, p1, -0x3e8

    .line 206
    :goto_0
    return v0

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    add-int/2addr v0, v1

    if-ge p1, v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/al;->a(I)I

    move-result v0

    goto :goto_0

    .line 206
    :cond_1
    add-int/lit16 v0, p1, -0x7d0

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 163
    .line 1154
    const/16 v2, -0x3e8

    if-lt p2, v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit16 v2, v2, -0x3e8

    if-ge p2, v2, :cond_0

    move v2, v0

    .line 163
    :goto_0
    if-eqz v2, :cond_1

    .line 164
    add-int/lit16 v0, p2, 0x3e8

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 165
    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 166
    new-instance v1, Lcom/roidapp/baselib/c/aa;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/baselib/c/aa;-><init>(Lcom/roidapp/baselib/c/y;Landroid/view/View;)V

    move-object v0, v1

    .line 173
    :goto_1
    return-object v0

    :cond_0
    move v2, v1

    .line 1154
    goto :goto_0

    .line 1158
    :cond_1
    const/16 v2, -0x7d0

    if-lt p2, v2, :cond_2

    iget-object v2, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit16 v2, v2, -0x7d0

    if-ge p2, v2, :cond_2

    .line 167
    :goto_2
    if-eqz v0, :cond_3

    .line 168
    add-int/lit16 v0, p2, 0x7d0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 169
    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 170
    new-instance v1, Lcom/roidapp/baselib/c/ab;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/baselib/c/ab;-><init>(Lcom/roidapp/baselib/c/y;Landroid/view/View;)V

    move-object v0, v1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 1158
    goto :goto_2

    .line 173
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/al;->a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;

    move-result-object v0

    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/bi;I)V
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    add-int/2addr v0, v1

    if-ge p2, v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    iget-object v1, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/widget/al;->a(Landroid/support/v7/widget/bi;I)V

    .line 190
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 87
    if-nez p1, :cond_0

    .line 88
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You can\'t have a null header!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 108
    if-nez p1, :cond_0

    .line 109
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You can\'t have a null footer!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    return-void
.end method

.method public final d()Landroid/support/v7/widget/al;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->a:Landroid/support/v7/widget/al;

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 102
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 123
    return-void
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/roidapp/baselib/c/y;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.class final Landroid/support/v7/widget/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Landroid/support/v7/widget/f;

.field final b:Landroid/support/v7/widget/e;

.field final c:Ljava/util/List;
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
.method constructor <init>(Landroid/support/v7/widget/f;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    .line 50
    new-instance v0, Landroid/support/v7/widget/e;

    invoke-direct {v0}, Landroid/support/v7/widget/e;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    .line 52
    return-void
.end method

.method private e(I)I
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 90
    if-gez p1, :cond_1

    move v0, v1

    .line 107
    :cond_0
    :goto_0
    return v0

    .line 93
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->a()I

    move-result v2

    move v0, p1

    .line 95
    :goto_1
    if-ge v0, v2, :cond_3

    .line 96
    iget-object v3, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/e;->d(I)I

    move-result v3

    .line 97
    sub-int v3, v0, v3

    sub-int v3, p1, v3

    .line 98
    if-nez v3, :cond_2

    .line 99
    :goto_2
    iget-object v1, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/e;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 104
    :cond_2
    add-int/2addr v0, v3

    .line 106
    goto :goto_1

    :cond_3
    move v0, v1

    .line 107
    goto :goto_0
.end method


# virtual methods
.method final a()I
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->a()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method final a(I)V
    .locals 3

    .prologue
    .line 136
    invoke-direct {p0, p1}, Landroid/support/v7/widget/d;->e(I)I

    move-result v0

    .line 137
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, v0}, Landroid/support/v7/widget/f;->b(I)Landroid/view/View;

    move-result-object v1

    .line 138
    if-nez v1, :cond_0

    .line 148
    :goto_0
    return-void

    .line 141
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/e;->c(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 142
    iget-object v2, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 144
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, v0}, Landroid/support/v7/widget/f;->a(I)V

    goto :goto_0
.end method

.method final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 61
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroid/support/v7/widget/d;->a(Landroid/view/View;IZ)V

    .line 62
    return-void
.end method

.method final a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 2

    .prologue
    .line 203
    if-gez p2, :cond_1

    .line 204
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->a()I

    move-result v0

    .line 208
    :goto_0
    iget-object v1, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1, v0, p4}, Landroid/support/v7/widget/e;->a(IZ)V

    .line 209
    if-eqz p4, :cond_0

    .line 210
    iget-object v1, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, p1, v0, p3}, Landroid/support/v7/widget/f;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 217
    return-void

    .line 206
    :cond_1
    invoke-direct {p0, p2}, Landroid/support/v7/widget/d;->e(I)I

    move-result v0

    goto :goto_0
.end method

.method final a(Landroid/view/View;IZ)V
    .locals 2

    .prologue
    .line 74
    if-gez p2, :cond_1

    .line 75
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->a()I

    move-result v0

    .line 79
    :goto_0
    iget-object v1, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1, v0, p3}, Landroid/support/v7/widget/e;->a(IZ)V

    .line 80
    if-eqz p3, :cond_0

    .line 81
    iget-object v1, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, p1, v0}, Landroid/support/v7/widget/f;->a(Landroid/view/View;I)V

    .line 87
    return-void

    .line 77
    :cond_1
    invoke-direct {p0, p2}, Landroid/support/v7/widget/d;->e(I)I

    move-result v0

    goto :goto_0
.end method

.method final b()I
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->a()I

    move-result v0

    return v0
.end method

.method final b(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 156
    invoke-direct {p0, p1}, Landroid/support/v7/widget/d;->e(I)I

    move-result v0

    .line 157
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, v0}, Landroid/support/v7/widget/f;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method final b(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method final c(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/f;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method final d(I)V
    .locals 2

    .prologue
    .line 255
    invoke-direct {p0, p1}, Landroid/support/v7/widget/d;->e(I)I

    move-result v0

    .line 256
    iget-object v1, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/e;->c(I)Z

    .line 257
    iget-object v1, p0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, v0}, Landroid/support/v7/widget/f;->c(I)V

    .line 261
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1}, Landroid/support/v7/widget/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

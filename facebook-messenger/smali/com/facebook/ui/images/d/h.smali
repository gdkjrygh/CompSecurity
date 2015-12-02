.class public Lcom/facebook/ui/images/d/h;
.super Ljava/lang/Object;
.source "GraphicOpConstraints.java"


# instance fields
.field private final a:Lcom/facebook/ui/images/d/b;

.field private final b:Lcom/facebook/ui/images/d/f;

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private volatile j:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/d/i;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/d/h;->a:Lcom/facebook/ui/images/d/b;

    .line 39
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->f()Lcom/facebook/ui/images/d/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/d/h;->b:Lcom/facebook/ui/images/d/f;

    .line 40
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/h;->c:I

    .line 41
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->b()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/h;->d:I

    .line 42
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->c()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/h;->e:I

    .line 43
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/h;->f:I

    .line 44
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/d/h;->g:Z

    .line 45
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/d/h;->h:Z

    .line 47
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/i;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/d/h;->i:Z

    .line 48
    return-void
.end method

.method private a(Ljava/util/List;Landroid/graphics/Rect;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/d/g;",
            ">;",
            "Landroid/graphics/Rect;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v2, -0x1

    .line 150
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/h;->i:Z

    if-eqz v0, :cond_1

    .line 180
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v1

    if-le v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v0

    if-ne v0, v2, :cond_5

    :cond_2
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v1

    if-le v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v0

    if-ne v0, v2, :cond_5

    :cond_3
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v0

    if-ne v0, v2, :cond_5

    :cond_4
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v1

    if-ge v0, v1, :cond_0

    :cond_5
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 162
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->b()Lcom/facebook/ui/images/d/f;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 163
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->b()Lcom/facebook/ui/images/d/f;

    move-result-object v0

    .line 165
    new-instance v1, Lcom/facebook/ui/images/d/a;

    invoke-direct {v1, v0}, Lcom/facebook/ui/images/d/a;-><init>(Lcom/facebook/ui/images/d/f;)V

    .line 166
    invoke-virtual {v1, p2, p2}, Lcom/facebook/ui/images/d/a;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 167
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->a()Lcom/facebook/ui/images/d/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->a()Lcom/facebook/ui/images/d/b;

    move-result-object v0

    .line 172
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 173
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 174
    new-instance v1, Lcom/facebook/ui/images/d/e;

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Lcom/facebook/ui/images/d/e;-><init>(Lcom/facebook/ui/images/d/b;II)V

    .line 177
    invoke-virtual {v1, p2, p2}, Lcom/facebook/ui/images/d/e;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 178
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private b(Ljava/util/List;Landroid/graphics/Rect;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/d/g;",
            ">;",
            "Landroid/graphics/Rect;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v7, -0x1

    .line 183
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v3

    if-le v0, v3, :cond_3

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v0

    if-eq v0, v7, :cond_3

    move v0, v1

    .line 184
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v4

    if-le v3, v4, :cond_4

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v3

    if-eq v3, v7, :cond_4

    move v3, v1

    .line 185
    :goto_1
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v5

    if-ge v4, v5, :cond_5

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v4

    if-eq v4, v7, :cond_5

    move v4, v1

    .line 186
    :goto_2
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v5

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v6

    if-ge v5, v6, :cond_6

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v5

    if-eq v5, v7, :cond_6

    .line 187
    :goto_3
    iget-boolean v2, p0, Lcom/facebook/ui/images/d/h;->i:Z

    if-eqz v2, :cond_0

    if-nez v0, :cond_1

    if-nez v3, :cond_1

    :cond_0
    iget-boolean v2, p0, Lcom/facebook/ui/images/d/h;->i:Z

    if-nez v2, :cond_7

    if-eqz v0, :cond_7

    if-eqz v3, :cond_7

    .line 190
    :cond_1
    new-instance v0, Lcom/facebook/ui/images/d/m;

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/d/m;-><init>(II)V

    .line 191
    invoke-virtual {v0, p2, p2}, Lcom/facebook/ui/images/d/m;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 192
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    :cond_2
    :goto_4
    return-void

    :cond_3
    move v0, v2

    .line 183
    goto :goto_0

    :cond_4
    move v3, v2

    .line 184
    goto :goto_1

    :cond_5
    move v4, v2

    .line 185
    goto :goto_2

    :cond_6
    move v1, v2

    .line 186
    goto :goto_3

    .line 193
    :cond_7
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/h;->i:Z

    if-eqz v0, :cond_8

    if-nez v4, :cond_9

    if-nez v1, :cond_9

    :cond_8
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/h;->i:Z

    if-nez v0, :cond_2

    if-eqz v4, :cond_2

    if-eqz v1, :cond_2

    .line 196
    :cond_9
    new-instance v0, Lcom/facebook/ui/images/d/m;

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v2

    sget-object v3, Lcom/facebook/ui/images/d/n;->UPSCALE:Lcom/facebook/ui/images/d/n;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/ui/images/d/m;-><init>(IILcom/facebook/ui/images/d/n;)V

    .line 198
    invoke-virtual {v0, p2, p2}, Lcom/facebook/ui/images/d/m;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 199
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4
.end method


# virtual methods
.method public a(IIII)Landroid/graphics/Matrix;
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x1

    .line 115
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 116
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 119
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v3

    if-le v2, v3, :cond_0

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->e()I

    move-result v2

    if-ne v2, v4, :cond_2

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v3

    if-le v2, v3, :cond_1

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->f()I

    move-result v2

    if-ne v2, v4, :cond_2

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v3

    if-lt v2, v3, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 127
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->b()Lcom/facebook/ui/images/d/f;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 128
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->b()Lcom/facebook/ui/images/d/f;

    move-result-object v2

    invoke-virtual {v2, v0, v0}, Lcom/facebook/ui/images/d/f;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 131
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->a()Lcom/facebook/ui/images/d/b;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 132
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->a()Lcom/facebook/ui/images/d/b;

    move-result-object v2

    .line 133
    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->c()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/ui/images/d/h;->d()I

    move-result v4

    invoke-virtual {v2, v0, v3, v4, v0}, Lcom/facebook/ui/images/d/b;->a(Landroid/graphics/Rect;IILandroid/graphics/Rect;)V

    .line 137
    :cond_4
    iget v2, v0, Landroid/graphics/Rect;->left:I

    neg-int v2, v2

    int-to-float v2, v2

    iget v0, v0, Landroid/graphics/Rect;->top:I

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 138
    int-to-float v0, p3

    int-to-float v2, p1

    div-float/2addr v0, v2

    int-to-float v2, p4

    int-to-float v3, p2

    div-float/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 144
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 146
    return-object v1
.end method

.method public a()Lcom/facebook/ui/images/d/b;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->a:Lcom/facebook/ui/images/d/b;

    return-object v0
.end method

.method public a(Landroid/graphics/Rect;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/d/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 103
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 106
    invoke-direct {p0, v0, p1}, Lcom/facebook/ui/images/d/h;->a(Ljava/util/List;Landroid/graphics/Rect;)V

    .line 109
    invoke-direct {p0, v0, p1}, Lcom/facebook/ui/images/d/h;->b(Ljava/util/List;Landroid/graphics/Rect;)V

    .line 111
    return-object v0
.end method

.method public b()Lcom/facebook/ui/images/d/f;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->b:Lcom/facebook/ui/images/d/f;

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/facebook/ui/images/d/h;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/facebook/ui/images/d/h;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/ui/images/d/h;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lcom/facebook/ui/images/d/h;->f:I

    return v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/h;->h:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 7

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/facebook/ui/images/d/h;->g:Z

    if-eqz v0, :cond_0

    .line 84
    sget-object v0, Lcom/facebook/ui/images/base/b;->d:Ljava/lang/String;

    .line 99
    :goto_0
    return-object v0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->j:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 88
    const-string v0, ":"

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v1

    const-string v2, "3"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->a:Lcom/facebook/ui/images/d/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->a:Lcom/facebook/ui/images/d/b;

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/b;->a()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x6

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "("

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->b:Lcom/facebook/ui/images/d/f;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->b:Lcom/facebook/ui/images/d/f;

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/f;->a()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ")"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    iget v5, p0, Lcom/facebook/ui/images/d/h;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x2

    iget v5, p0, Lcom/facebook/ui/images/d/h;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x3

    iget v5, p0, Lcom/facebook/ui/images/d/h;->e:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x4

    iget v5, p0, Lcom/facebook/ui/images/d/h;->f:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x5

    iget-boolean v5, p0, Lcom/facebook/ui/images/d/h;->h:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/d/h;->j:Ljava/lang/String;

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/images/d/h;->j:Ljava/lang/String;

    goto/16 :goto_0

    .line 88
    :cond_2
    const-string v0, "null"

    goto :goto_1

    :cond_3
    const-string v0, "null"

    goto :goto_2
.end method

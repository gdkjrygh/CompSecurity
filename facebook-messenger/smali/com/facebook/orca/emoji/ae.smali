.class public Lcom/facebook/orca/emoji/ae;
.super Ljava/lang/Object;
.source "GridSizingCalculator.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/facebook/orca/emoji/af;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/facebook/orca/emoji/af;)V
    .locals 0

    .prologue
    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    .line 184
    iput-object p2, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    .line 185
    return-void
.end method


# virtual methods
.method public a(IIZ)Lcom/facebook/orca/emoji/ag;
    .locals 14

    .prologue
    .line 196
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->d()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v3

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->f()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v4

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->e()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v7

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->g()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v8

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->c()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v11

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/emoji/ae;->a:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/af;->h()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v0

    .line 205
    sub-int v5, p2, v0

    .line 207
    div-int v1, p1, v11

    .line 209
    iget-object v2, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/af;->a()I

    move-result v2

    if-le v1, v2, :cond_0

    .line 212
    iget-object v2, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/af;->a()I

    move-result v2

    add-int/lit8 v1, v1, -0x2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 215
    :cond_0
    div-int v2, v5, v11

    .line 216
    if-lez v2, :cond_2

    .line 219
    :goto_0
    if-nez p3, :cond_1

    iget-object v6, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v6}, Lcom/facebook/orca/emoji/af;->b()I

    move-result v6

    if-le v2, v6, :cond_1

    .line 222
    iget-object v2, p0, Lcom/facebook/orca/emoji/ae;->b:Lcom/facebook/orca/emoji/af;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/af;->b()I

    move-result v2

    .line 232
    :cond_1
    div-int v9, p1, v1

    .line 233
    if-le v9, v11, :cond_4

    .line 234
    sub-int v6, v9, v11

    .line 236
    div-int/lit8 v10, v6, 0x2

    rem-int/lit8 v12, v6, 0x2

    add-int/2addr v10, v12

    add-int/2addr v3, v10

    .line 237
    div-int/lit8 v6, v6, 0x2

    add-int/2addr v4, v6

    .line 239
    :goto_1
    div-int v10, v5, v2

    .line 240
    if-le v10, v11, :cond_3

    .line 241
    sub-int v6, v10, v11

    .line 243
    div-int/lit8 v5, v6, 0x2

    rem-int/lit8 v12, v6, 0x2

    add-int/2addr v5, v12

    add-int/2addr v5, v7

    .line 244
    div-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v8

    .line 248
    :goto_2
    mul-int v12, v2, v9

    add-int/2addr v12, v0

    .line 250
    new-instance v0, Lcom/facebook/orca/emoji/ag;

    invoke-direct/range {v0 .. v12}, Lcom/facebook/orca/emoji/ag;-><init>(IIIIIIIIIIII)V

    return-object v0

    .line 216
    :cond_2
    int-to-double v9, v5

    int-to-double v12, v11

    div-double/2addr v9, v12

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v2, v9

    goto :goto_0

    :cond_3
    move v6, v8

    move v5, v7

    move v10, v11

    goto :goto_2

    :cond_4
    move v9, v11

    goto :goto_1
.end method

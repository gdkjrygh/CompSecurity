.class final Lcom/roidapp/photogrid/release/fk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/fi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fi;I)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iput p2, p0, Lcom/roidapp/photogrid/release/fk;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v4, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 350
    :cond_0
    :goto_0
    return-void

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->c(Lcom/roidapp/photogrid/release/fi;)I

    move-result v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v5

    sub-int/2addr v0, v5

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v6

    invoke-virtual {v6}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v6

    sub-int/2addr v5, v6

    sub-int/2addr v0, v5

    .line 269
    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->d(Lcom/roidapp/photogrid/release/fi;)I

    move-result v5

    if-ge v0, v5, :cond_6

    .line 270
    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/fi;->d(Lcom/roidapp/photogrid/release/fi;)I

    move-result v6

    sub-int v0, v6, v0

    invoke-virtual {v5, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 281
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->e(Lcom/roidapp/photogrid/release/fi;)I

    move-result v0

    if-ne v0, v5, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/fk;->a:I

    add-int/lit8 v0, v0, -0x1

    if-ne v5, v0, :cond_0

    .line 305
    :cond_3
    if-nez v5, :cond_10

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->e(Lcom/roidapp/photogrid/release/fi;)I

    move-result v0

    iget v6, p0, Lcom/roidapp/photogrid/release/fk;->a:I

    add-int/lit8 v6, v6, -0x1

    if-ne v0, v6, :cond_b

    .line 308
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->Z()[F

    move-result-object v6

    .line 310
    if-eqz v6, :cond_12

    .line 311
    aget v0, v6, v4

    cmpl-float v0, v0, v8

    if-nez v0, :cond_7

    .line 312
    aget v0, v6, v2

    aget v7, v6, v3

    div-float/2addr v0, v7

    .line 313
    aput v1, v6, v4

    .line 319
    :goto_2
    iget-object v6, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_8

    move v1, v2

    :goto_3
    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;Z)Z

    .line 320
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->f(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 321
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v2, v3

    :cond_4
    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    .line 325
    :goto_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 326
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 341
    :goto_5
    if-eqz v5, :cond_11

    .line 342
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->e(Lcom/roidapp/photogrid/release/fi;)I

    move-result v0

    if-lez v0, :cond_5

    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->h(Lcom/roidapp/photogrid/release/fi;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->e(Lcom/roidapp/photogrid/release/fi;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 345
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->h(Lcom/roidapp/photogrid/release/fi;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;I)I

    goto/16 :goto_0

    .line 273
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v5

    sub-int/2addr v0, v5

    .line 275
    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->d(Lcom/roidapp/photogrid/release/fi;)I

    move-result v5

    if-ge v0, v5, :cond_2

    .line 276
    iget-object v5, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/fi;->d(Lcom/roidapp/photogrid/release/fi;)I

    move-result v6

    sub-int/2addr v0, v6

    invoke-virtual {v5, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto/16 :goto_1

    .line 315
    :cond_7
    aget v0, v6, v3

    aget v7, v6, v2

    div-float/2addr v0, v7

    .line 316
    aput v8, v6, v4

    goto/16 :goto_2

    :cond_8
    move v1, v3

    .line 319
    goto/16 :goto_3

    .line 323
    :cond_9
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v4

    :goto_6
    invoke-static {v2, v1}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    goto/16 :goto_4

    :cond_a
    const/4 v1, 0x3

    goto :goto_6

    .line 329
    :cond_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v0

    if-nez v0, :cond_d

    move v0, v2

    :goto_7
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;Z)Z

    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->f(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v1

    if-eqz v1, :cond_c

    move v2, v3

    :cond_c
    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    .line 335
    :goto_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->e(Lcom/roidapp/photogrid/release/fi;)I

    move-result v1

    iget v2, p0, Lcom/roidapp/photogrid/release/fk;->a:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;II)V

    goto/16 :goto_5

    :cond_d
    move v0, v3

    .line 329
    goto :goto_7

    .line 333
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_9
    invoke-static {v0, v4}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    goto :goto_8

    :cond_f
    const/4 v4, 0x3

    goto :goto_9

    .line 338
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    iget v1, p0, Lcom/roidapp/photogrid/release/fk;->a:I

    invoke-static {v0, v5, v1}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;II)V

    goto/16 :goto_5

    .line 348
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fk;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->i(Lcom/roidapp/photogrid/release/fi;)V

    goto/16 :goto_0

    :cond_12
    move v0, v1

    goto/16 :goto_2
.end method

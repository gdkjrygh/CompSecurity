.class final Lcom/roidapp/photogrid/release/oh;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/release/og;

.field final synthetic b:Lcom/roidapp/photogrid/release/oa;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/oa;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 372
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 373
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oh;->c:Landroid/view/LayoutInflater;

    .line 374
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->a(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    const/4 v0, 0x2

    .line 390
    :goto_0
    return v0

    .line 380
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->e(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 381
    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    const/4 v0, 0x4

    goto :goto_0

    .line 384
    :cond_1
    const/4 v0, 0x3

    goto :goto_0

    .line 387
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->g(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->h(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oa;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->h(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 388
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 390
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v0

    array-length v0, v0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 397
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 402
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f0203ac

    const/4 v3, 0x1

    const/4 v2, 0x5

    const/4 v5, 0x0

    const/16 v4, 0x8

    .line 408
    if-nez p2, :cond_0

    .line 409
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f0300fc

    invoke-virtual {v0, v1, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 411
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 412
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/og;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    .line 422
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->a(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->e(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 423
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->g(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->h(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oa;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->h(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 424
    :cond_2
    if-eqz p1, :cond_7

    .line 425
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v0

    array-length v0, v0

    .line 426
    if-lt v0, v2, :cond_5

    .line 427
    if-ne p1, v2, :cond_4

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v0

    if-nez v0, :cond_4

    .line 428
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 430
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 506
    :goto_1
    return-object p2

    .line 414
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/release/og;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/og;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    .line 415
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    const v0, 0x7f0d03f7

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    .line 416
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    const v0, 0x7f0d03f9

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    .line 417
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    const v0, 0x7f0d03f8

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/og;->c:Landroid/widget/ImageView;

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 432
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 433
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 436
    :cond_5
    if-ne p1, v0, :cond_6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v0

    if-nez v0, :cond_6

    .line 437
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 439
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 441
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 446
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f070269

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 450
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v0

    array-length v0, v0

    .line 451
    if-lt v0, v2, :cond_a

    .line 452
    const/4 v0, 0x4

    if-ne p1, v0, :cond_9

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v0

    if-nez v0, :cond_9

    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    aget v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 458
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    aget v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 462
    :cond_a
    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_b

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v0

    if-nez v0, :cond_b

    .line 463
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    aget v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 468
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    aget v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 475
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->e(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 476
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 478
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 481
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 484
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 487
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 493
    :cond_d
    packed-switch p1, :pswitch_data_1

    goto/16 :goto_1

    .line 495
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 498
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oh;->a:Lcom/roidapp/photogrid/release/og;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/og;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oh;->b:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 476
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 493
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

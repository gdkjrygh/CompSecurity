.class final Lcom/roidapp/photogrid/bg;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/bf;

.field final synthetic b:Lcom/roidapp/photogrid/ba;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/ba;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 239
    iput-object p1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 240
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/bg;->c:Landroid/view/LayoutInflater;

    .line 241
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 3

    .prologue
    const/4 v0, 0x7

    const/4 v2, 0x1

    .line 245
    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->a(Lcom/roidapp/photogrid/ba;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 246
    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    if-eq v1, v2, :cond_1

    .line 247
    const/16 v0, 0x8

    .line 256
    :cond_0
    :goto_0
    return v0

    .line 248
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    if-eq v1, v2, :cond_0

    .line 250
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v2, :cond_3

    .line 251
    const/16 v0, 0x9

    goto :goto_0

    .line 253
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 262
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 267
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/16 v3, 0x8

    .line 272
    if-nez p2, :cond_0

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f0300fc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 275
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 276
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/bf;

    iput-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    .line 283
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->g(Lcom/roidapp/photogrid/ba;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    packed-switch p1, :pswitch_data_0

    .line 357
    :goto_1
    return-object p2

    .line 278
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/bf;

    invoke-direct {v0}, Lcom/roidapp/photogrid/bf;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    .line 279
    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    const v0, 0x7f0d03f7

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    .line 280
    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    const v0, 0x7f0d03f8

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 286
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 290
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 294
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 298
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 302
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 306
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->i(Lcom/roidapp/photogrid/ba;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 308
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 310
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 314
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 318
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 322
    :pswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 326
    :pswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 333
    :cond_3
    packed-switch p1, :pswitch_data_1

    goto/16 :goto_1

    .line 335
    :pswitch_a
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 338
    :pswitch_b
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 341
    :pswitch_c
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 344
    :pswitch_d
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 347
    :pswitch_e
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 350
    :pswitch_f
    iget-object v0, p0, Lcom/roidapp/photogrid/bg;->a:Lcom/roidapp/photogrid/bf;

    iget-object v0, v0, Lcom/roidapp/photogrid/bf;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/bg;->b:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 284
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 333
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

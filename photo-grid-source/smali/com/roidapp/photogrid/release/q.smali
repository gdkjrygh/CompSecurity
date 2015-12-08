.class final Lcom/roidapp/photogrid/release/q;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/release/p;

.field final synthetic b:Lcom/roidapp/photogrid/release/c;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 2

    .prologue
    .line 1300
    iput-object p1, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1301
    invoke-static {p1}, Lcom/roidapp/photogrid/release/c;->h(Lcom/roidapp/photogrid/release/c;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1302
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/c;Ljava/util/List;)Ljava/util/List;

    .line 1304
    :cond_0
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 1308
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->h(Lcom/roidapp/photogrid/release/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1314
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 1319
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x0

    .line 1325
    if-nez p2, :cond_0

    .line 1326
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->n(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030125

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 1328
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1329
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/p;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    .line 1344
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1347
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->o(Lcom/roidapp/photogrid/release/c;)I

    move-result v0

    if-ne v0, p1, :cond_4

    .line 1348
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1353
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->h(Lcom/roidapp/photogrid/release/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 2158
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1355
    if-eqz v1, :cond_5

    .line 1357
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/p;->a:Landroid/widget/TextView;

    .line 3134
    iget-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 1357
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1359
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/p;->b:Landroid/widget/ImageView;

    .line 3142
    iget v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 1359
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 3166
    :cond_1
    :goto_2
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->g:Z

    .line 1388
    if-eqz v1, :cond_2

    .line 1389
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/p;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4150
    :cond_2
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 1392
    if-eqz v0, :cond_8

    .line 1393
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1398
    :goto_3
    return-object p2

    .line 1331
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/release/p;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/p;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    .line 1332
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d0382

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->a:Landroid/widget/TextView;

    .line 1333
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d04c2

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->b:Landroid/widget/ImageView;

    .line 1334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d04c4

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->c:Landroid/widget/ImageView;

    .line 1335
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d04c5

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->d:Landroid/widget/ImageView;

    .line 1336
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d037f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->e:Landroid/widget/ImageView;

    .line 1337
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    const v0, 0x7f0d04c3

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/p;->f:Landroid/widget/ImageView;

    .line 1339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1350
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 1361
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_2

    .line 1365
    :cond_5
    iget-object v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->m:Ljava/lang/String;

    .line 1366
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 1368
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/bumptech/glide/p;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/p;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/b;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 1376
    :cond_6
    :goto_4
    iget-object v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    if-eqz v1, :cond_1

    .line 1378
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/q;->b:Lcom/roidapp/photogrid/release/c;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;I)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 1379
    if-eqz v1, :cond_7

    iget-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1380
    iget-object v2, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/p;->a:Landroid/widget/TextView;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1373
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_4

    .line 1382
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v2, v1, Lcom/roidapp/photogrid/release/p;->a:Landroid/widget/TextView;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    const-string v3, "en"

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1395
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->c:Landroid/widget/ImageView;

    const v1, 0x7f020383

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1396
    iget-object v0, p0, Lcom/roidapp/photogrid/release/q;->a:Lcom/roidapp/photogrid/release/p;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/p;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3
.end method

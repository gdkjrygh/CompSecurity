.class public final Lcom/roidapp/cloudlib/upload/o;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/roidapp/cloudlib/upload/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

.field private b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/upload/e;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 301
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/o;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    .line 302
    sget v0, Lcom/roidapp/cloudlib/as;->ak:I

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 303
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/o;->b:Landroid/view/LayoutInflater;

    .line 304
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 313
    if-eqz p2, :cond_1

    .line 314
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/s;

    move-object v1, v0

    .line 331
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/upload/o;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/e;

    .line 332
    new-instance v4, Ljava/io/File;

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->b:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 333
    iget-object v5, v1, Lcom/roidapp/cloudlib/upload/s;->c:Landroid/widget/TextView;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    iget-object v4, v1, Lcom/roidapp/cloudlib/upload/s;->a:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lcom/roidapp/cloudlib/upload/e;->d:Ljava/lang/String;

    invoke-virtual {v6, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, v0, Lcom/roidapp/cloudlib/upload/e;->d:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    iget-object v4, v1, Lcom/roidapp/cloudlib/upload/s;->e:Landroid/widget/ImageView;

    iget v5, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 336
    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    iget-object v5, v1, Lcom/roidapp/cloudlib/upload/s;->e:Landroid/widget/ImageView;

    .line 1345
    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1346
    sget-object v6, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    if-ne v4, v6, :cond_2

    .line 1347
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1348
    sget v4, Lcom/roidapp/cloudlib/aq;->S:I

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1349
    new-instance v4, Lcom/roidapp/cloudlib/upload/p;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/upload/p;-><init>(Lcom/roidapp/cloudlib/upload/o;)V

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    :goto_1
    iget-object v4, v1, Lcom/roidapp/cloudlib/upload/s;->d:Landroid/widget/ImageView;

    iget v5, v0, Lcom/roidapp/cloudlib/upload/e;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 338
    iget-object v4, v0, Lcom/roidapp/cloudlib/upload/e;->f:Lcom/roidapp/cloudlib/upload/f;

    iget-object v5, v1, Lcom/roidapp/cloudlib/upload/s;->d:Landroid/widget/ImageView;

    .line 1366
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 1367
    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1368
    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1369
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 1373
    sget-object v6, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    if-ne v4, v6, :cond_3

    .line 1374
    sget v4, Lcom/roidapp/cloudlib/aq;->u:I

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 339
    :cond_0
    :goto_2
    iget-object v4, p0, Lcom/roidapp/cloudlib/upload/o;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/s;->b:Landroid/widget/ImageView;

    iget-object v5, v0, Lcom/roidapp/cloudlib/upload/e;->h:Ljava/lang/String;

    iget-object v6, v0, Lcom/roidapp/cloudlib/upload/e;->e:Ljava/lang/String;

    if-eqz v6, :cond_6

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/e;->e:Ljava/lang/String;

    const-string v6, "video/"

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v2

    :goto_3
    invoke-static {v4, v1, v5, v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Landroid/widget/ImageView;Ljava/lang/String;Z)V

    .line 340
    return-object p2

    .line 316
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/o;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->ak:I

    invoke-virtual {v0, v1, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 318
    new-instance v1, Lcom/roidapp/cloudlib/upload/s;

    invoke-direct {v1, p0, v3}, Lcom/roidapp/cloudlib/upload/s;-><init>(Lcom/roidapp/cloudlib/upload/o;B)V

    .line 319
    sget v0, Lcom/roidapp/cloudlib/ar;->bj:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/upload/s;->b:Landroid/widget/ImageView;

    .line 321
    sget v0, Lcom/roidapp/cloudlib/ar;->cK:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/upload/s;->c:Landroid/widget/TextView;

    .line 323
    sget v0, Lcom/roidapp/cloudlib/ar;->cM:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/upload/s;->a:Landroid/widget/TextView;

    .line 325
    sget v0, Lcom/roidapp/cloudlib/ar;->bk:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/upload/s;->d:Landroid/widget/ImageView;

    .line 327
    sget v0, Lcom/roidapp/cloudlib/ar;->bh:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/upload/s;->e:Landroid/widget/ImageView;

    .line 328
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1360
    :cond_2
    const/4 v4, 0x4

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 1375
    :cond_3
    sget-object v6, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    if-ne v4, v6, :cond_4

    .line 1376
    sget v4, Lcom/roidapp/cloudlib/aq;->b:I

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1377
    new-instance v4, Lcom/roidapp/cloudlib/upload/q;

    invoke-direct {v4, p0, v5}, Lcom/roidapp/cloudlib/upload/q;-><init>(Lcom/roidapp/cloudlib/upload/o;Landroid/widget/ImageView;)V

    const-wide/16 v6, 0xc8

    invoke-virtual {v5, v4, v6, v7}, Landroid/widget/ImageView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    .line 1392
    :cond_4
    sget-object v6, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    if-ne v4, v6, :cond_5

    .line 1393
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 1394
    sget v4, Lcom/roidapp/cloudlib/aq;->L:I

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1395
    new-instance v4, Lcom/roidapp/cloudlib/upload/r;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/upload/r;-><init>(Lcom/roidapp/cloudlib/upload/o;)V

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_2

    .line 1405
    :cond_5
    sget-object v6, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    if-ne v4, v6, :cond_0

    .line 1406
    sget v4, Lcom/roidapp/cloudlib/aq;->t:I

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_2

    :cond_6
    move v0, v3

    .line 339
    goto/16 :goto_3
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    .line 308
    const/4 v0, 0x0

    return v0
.end method

.class final Lcom/roidapp/cloudlib/instagram/l;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 336
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/l;->a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 337
    iput-object p2, p0, Lcom/roidapp/cloudlib/instagram/l;->b:Landroid/content/Context;

    .line 338
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/l;->c:Landroid/view/LayoutInflater;

    .line 339
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 343
    const/4 v0, 0x2

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 348
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 353
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    .line 358
    if-nez p2, :cond_0

    .line 359
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/l;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->h:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 362
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->cG:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 363
    sget v1, Lcom/roidapp/cloudlib/ar;->bd:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 364
    packed-switch p1, :pswitch_data_0

    .line 380
    :goto_0
    return-object p2

    .line 366
    :pswitch_0
    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/l;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 367
    sget v2, Lcom/roidapp/cloudlib/at;->M:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 368
    sget v0, Lcom/roidapp/cloudlib/aq;->z:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 370
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/l;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/l;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 372
    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/l;->a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    .line 1234
    invoke-static {}, Lcom/roidapp/cloudlib/common/c;->a()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1235
    sget v0, Lcom/roidapp/cloudlib/at;->ag:I

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 1239
    :cond_2
    new-instance v3, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1240
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_3

    .line 1241
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 1243
    :cond_3
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1244
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1245
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1246
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1248
    invoke-static {v3}, Landroid/graphics/drawable/BitmapDrawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1249
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 1253
    :cond_4
    new-instance v4, Lcom/roidapp/cloudlib/instagram/j;

    invoke-direct {v4, v2, v3, v0, v1}, Lcom/roidapp/cloudlib/instagram/j;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;)V

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/instagram/j;->start()V

    goto/16 :goto_0

    .line 376
    :pswitch_1
    sget v2, Lcom/roidapp/cloudlib/aq;->G:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 377
    sget v1, Lcom/roidapp/cloudlib/at;->L:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 364
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

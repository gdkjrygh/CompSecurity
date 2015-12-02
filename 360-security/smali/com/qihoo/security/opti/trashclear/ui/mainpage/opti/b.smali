.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;
.super Lcom/qihoo/security/opti/trashclear/ui/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/opti/trashclear/ui/a",
        "<",
        "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lcom/qihoo/security/locale/d;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 42
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    .line 44
    sget v0, Lcom/qihoo/security/opti/trashclear/ui/e;->a:I

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d:I

    .line 48
    return-void
.end method

.method private a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 7

    .prologue
    const v3, 0x7f08005c

    const/4 v6, 0x0

    .line 318
    const v0, 0x7f0b00e6

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 319
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 320
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 324
    :goto_0
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 325
    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 326
    if-lez v1, :cond_1

    .line 327
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f0001

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 338
    :goto_1
    return-void

    .line 322
    :cond_0
    invoke-virtual {v0, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0

    .line 331
    :cond_1
    iget-object v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 332
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    goto :goto_1

    .line 335
    :cond_2
    iget-object v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 336
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    goto :goto_1
.end method

.method private a(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 277
    const v0, 0x7f0b00e5

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 278
    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 279
    return-void
.end method

.method private a(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 253
    const v0, 0x7f0b00e5

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 254
    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTag(Ljava/lang/Object;)V

    .line 255
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b$1;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;Lcom/qihoo/security/locale/widget/LocaleTextView;)V

    const-string/jumbo v0, "appLabel"

    invoke-virtual {v1, v2, v0, p2, p3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    return-void
.end method

.method private b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 4

    .prologue
    .line 347
    const v0, 0x7f0b00e4

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 348
    iget-wide v2, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 349
    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_1

    .line 350
    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 355
    :cond_0
    :goto_0
    return-void

    .line 351
    :cond_1
    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_0

    .line 352
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v1, v2

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v1

    .line 353
    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private b()Z
    .locals 1

    .prologue
    .line 542
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 2

    .prologue
    .line 401
    const v0, 0x7f0b00e2

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 402
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    packed-switch v1, :pswitch_data_0

    .line 412
    :goto_0
    return-void

    .line 404
    :pswitch_0
    const v1, 0x7f0200b5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 407
    :pswitch_1
    const v1, 0x7f0200b4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 402
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v3, 0x7f0c0216

    const v5, 0x7f0c01f2

    .line 150
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 152
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 154
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 155
    const-string/jumbo v1, ""

    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 158
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    const v3, 0x7f08005d

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v1, v3, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 160
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 165
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 167
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 173
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 174
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 177
    :cond_0
    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;I)V

    .line 178
    return-void

    .line 162
    :cond_1
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 3

    .prologue
    const v2, 0x7f020044

    .line 421
    const v0, 0x7f0b00e2

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 422
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->iconId:I

    if-lez v1, :cond_0

    .line 423
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->iconId:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    .line 440
    :goto_0
    return-void

    .line 425
    :cond_0
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    packed-switch v1, :pswitch_data_0

    .line 436
    :pswitch_0
    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    goto :goto_0

    .line 427
    :pswitch_1
    iget-object v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    goto :goto_0

    .line 430
    :pswitch_2
    const v1, 0x7f020147

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    goto :goto_0

    .line 433
    :pswitch_3
    iget-object v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->path:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c(Ljava/lang/String;I)V

    goto :goto_0

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 187
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 189
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 191
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 193
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 195
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 203
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    if-eqz v1, :cond_0

    .line 204
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 206
    :cond_0
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    invoke-virtual {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;I)V

    .line 208
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 210
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 212
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->g(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 214
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->h(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 215
    return-void
.end method

.method private e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 4

    .prologue
    const v3, 0x7f0200b3

    const/4 v2, 0x4

    .line 449
    const v0, 0x7f0b00f5

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 450
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    packed-switch v1, :pswitch_data_0

    .line 465
    :goto_0
    return-void

    .line 452
    :pswitch_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 453
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 456
    :pswitch_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 457
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 460
    :pswitch_2
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 450
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v4, 0x7f0c020d

    .line 224
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 226
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 228
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 229
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 231
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->path:Ljava/lang/String;

    invoke-direct {p0, p1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    :goto_0
    const v2, 0x7f0b00e6

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 238
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 240
    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    if-nez v2, :cond_0

    .line 241
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 243
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 247
    :cond_0
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    invoke-virtual {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;I)V

    .line 249
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 250
    return-void

    .line 233
    :cond_1
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0x8

    .line 474
    const v0, 0x7f0b00e8

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 475
    const v1, 0x7f0b00e7

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 476
    iget v2, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    packed-switch v2, :pswitch_data_0

    .line 486
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 487
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 490
    :goto_0
    return-void

    .line 478
    :pswitch_0
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 479
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 482
    :pswitch_1
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 483
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 476
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private f(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 288
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 289
    const v1, 0x7f0b00e6

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 290
    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    packed-switch v2, :pswitch_data_0

    .line 306
    :cond_0
    :pswitch_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 309
    :goto_0
    return-void

    .line 292
    :pswitch_1
    const-string/jumbo v2, "bigfile_default"

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 293
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 294
    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0

    .line 298
    :cond_1
    :pswitch_2
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0248

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 301
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 302
    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0

    .line 290
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private g(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 499
    const v0, 0x7f0b00e1

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 500
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->upShadowType:I

    packed-switch v1, :pswitch_data_0

    .line 508
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 511
    :goto_0
    return-void

    .line 502
    :pswitch_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 505
    :pswitch_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 500
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private h(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 520
    const v0, 0x7f0b00e9

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 521
    iget v1, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    packed-switch v1, :pswitch_data_0

    .line 529
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 532
    :goto_0
    return-void

    .line 523
    :pswitch_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 526
    :pswitch_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 521
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 3

    .prologue
    const v2, 0x7f020054

    const/4 v1, 0x0

    .line 367
    const v0, 0x7f0b00e3

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 368
    packed-switch p2, :pswitch_data_0

    .line 392
    :goto_0
    return-void

    .line 370
    :pswitch_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 371
    const v1, 0x7f020055

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 374
    :pswitch_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 375
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 378
    :pswitch_2
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 379
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 382
    :pswitch_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 383
    const v1, 0x7f020156

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 386
    :pswitch_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 387
    const v1, 0x7f020056

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 368
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 126
    const v0, 0x7f0b00e3

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 127
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    .line 128
    packed-switch v0, :pswitch_data_0

    .line 141
    :goto_0
    return-void

    .line 130
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->c(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 133
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 136
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 128
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 538
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->d:I

    .line 539
    return-void
.end method

.method protected c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 52
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 53
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    packed-switch v1, :pswitch_data_0

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 56
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v1, v4, :cond_3

    .line 57
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 58
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->upShadowType:I

    .line 59
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 70
    :cond_1
    :goto_1
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-eq v1, v4, :cond_2

    .line 71
    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 73
    :cond_2
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 74
    if-lez v0, :cond_0

    .line 75
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    goto :goto_0

    .line 61
    :cond_3
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v1, v5, :cond_1

    .line 62
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 63
    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 64
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 65
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    invoke-interface {v3}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v3

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 66
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    goto :goto_1

    .line 79
    :pswitch_1
    iput v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 80
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v1, v4, :cond_5

    .line 81
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 82
    :goto_2
    if-ge v2, v3, :cond_7

    .line 83
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    if-eqz v1, :cond_4

    .line 84
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v5, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 82
    :cond_4
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    .line 87
    :cond_5
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v1, v5, :cond_7

    .line 88
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_6

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_6

    .line 90
    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 92
    :cond_6
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    .line 93
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 96
    :cond_7
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_9

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_9

    .line 98
    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 104
    :cond_8
    :goto_3
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 105
    if-lez v0, :cond_0

    .line 106
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    goto/16 :goto_0

    .line 100
    :cond_9
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-eq v1, v4, :cond_8

    .line 101
    iput v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    goto :goto_3

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

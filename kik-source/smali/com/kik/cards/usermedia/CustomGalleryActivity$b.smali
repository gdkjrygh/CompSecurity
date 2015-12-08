.class final Lcom/kik/cards/usermedia/CustomGalleryActivity$b;
.super Lcom/kik/cards/usermedia/CustomGalleryActivity$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/usermedia/CustomGalleryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;
    }
.end annotation


# instance fields
.field c:Ljava/util/Map;

.field d:I

.field final synthetic e:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method public constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Landroid/content/Context;Landroid/database/Cursor;I)V
    .locals 1

    .prologue
    .line 351
    iput-object p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    .line 352
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Landroid/content/Context;Landroid/database/Cursor;I)V

    .line 347
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->c:Ljava/util/Map;

    .line 348
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->d:I

    .line 353
    iput p4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->d:I

    .line 354
    return-void
.end method


# virtual methods
.method protected final a(I)V
    .locals 0

    .prologue
    .line 364
    invoke-super {p0, p1}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->a(I)V

    .line 365
    iput p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->d:I

    .line 366
    return-void
.end method

.method public final a(Lcom/kik/cards/usermedia/q;)V
    .locals 3

    .prologue
    .line 402
    if-eqz p1, :cond_0

    .line 403
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/cards/usermedia/q;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lkik/android/widget/UserMediaImageThumbNailList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/widget/UserMediaImageThumbNailList;->a(Ljava/lang/Object;)Lcom/kik/g/aq;

    .line 406
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    .line 408
    iget-object v1, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    const v2, 0x7f070047

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 409
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 412
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a()V

    .line 413
    return-void
.end method

.method public final bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 371
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    .line 372
    iget-object v1, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->e:Lcom/kik/cards/usermedia/q;

    if-eqz v1, :cond_0

    .line 373
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->c:Ljava/util/Map;

    iget-object v2, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->e:Lcom/kik/cards/usermedia/q;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    :cond_0
    invoke-interface {p3}, Landroid/database/Cursor;->getPosition()I

    move-result v1

    .line 377
    const-string v2, "_id"

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 378
    const-string v4, "orientation"

    invoke-interface {p3, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p3, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 379
    new-instance v5, Lcom/kik/cards/usermedia/q;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Lcom/kik/cards/usermedia/q;-><init>(Ljava/lang/Long;I)V

    .line 381
    iget-object v4, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->c:Lcom/kik/sdkutils/LazyLoadingImage;

    iget-object v6, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v6}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->d(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/d;

    move-result-object v6

    iget-object v7, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v7}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->d(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/d;

    move-result-object v7

    invoke-virtual {v7}, Lcom/kik/cache/d;->c()Lcom/kik/sdkutils/b/a;

    move-result-object v7

    iget-object v8, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v8}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/sdkutils/b/b;

    move-result-object v8

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/kik/sdkutils/LazyLoadingImage;->a(Ljava/lang/Object;Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;Lcom/kik/sdkutils/b/b;)V

    .line 383
    iget-object v4, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->a:Landroid/widget/RelativeLayout;

    new-instance v6, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;

    invoke-direct {v6, p0, v1, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity$b;ILcom/kik/cards/usermedia/CustomGalleryActivity$a$a;)V

    invoke-virtual {v4, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 384
    iget-object v1, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/AbsListView$LayoutParams;

    .line 385
    iget v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->a:I

    iput v4, v1, Landroid/widget/AbsListView$LayoutParams;->width:I

    .line 386
    iget v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->a:I

    iput v4, v1, Landroid/widget/AbsListView$LayoutParams;->height:I

    .line 387
    iget-object v4, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    iput-object v5, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->e:Lcom/kik/cards/usermedia/q;

    .line 389
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->c:Ljava/util/Map;

    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 391
    iget-object v1, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    const v2, 0x7f070048

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 392
    new-array v1, v10, [Landroid/view/View;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    aput-object v0, v1, v9

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 398
    :goto_0
    return-void

    .line 395
    :cond_1
    iget-object v1, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    const v2, 0x7f070047

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 396
    new-array v1, v10, [Landroid/view/View;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    aput-object v0, v1, v9

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.class final Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/usermedia/CustomGalleryActivity$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

.field private b:I

.field private c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;


# direct methods
.method public constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity$b;ILcom/kik/cards/usermedia/CustomGalleryActivity$a$a;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    iput p2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->b:I

    .line 430
    iput-object p3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    .line 431
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 436
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v0

    iget v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->b:I

    invoke-interface {v0, v1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 437
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v1, v1, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v1

    const-string v2, "_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    .line 438
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v3, v3, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v3}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v3

    const-string v4, "orientation"

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 439
    new-instance v3, Lcom/kik/cards/usermedia/q;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lcom/kik/cards/usermedia/q;-><init>(Ljava/lang/Long;I)V

    .line 440
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v2

    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;

    move-result-object v4

    const-string v5, "_data"

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 442
    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    move-result v4

    iget-object v5, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v5, v5, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v5}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->h(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 443
    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    new-instance v6, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;

    iget-object v7, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v7, v7, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct {v6, v7, v2, v8}, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    iget v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->b:I

    invoke-virtual {v2, v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(I)V

    .line 450
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 451
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lkik/android/widget/UserMediaImageThumbNailList;

    move-result-object v2

    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->j(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/c;

    move-result-object v4

    iget-object v5, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v5, v5, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v5}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->d(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/kik/cache/d;->c()Lcom/kik/sdkutils/b/a;

    move-result-object v5

    iget-object v6, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v6, v6, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v6}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/sdkutils/b/b;

    move-result-object v6

    invoke-virtual {v2, v4, v5, v6, v3}, Lkik/android/widget/UserMediaImageThumbNailList;->a(Lcom/kik/cache/c;Lcom/kik/sdkutils/b/a;Lcom/kik/sdkutils/b/b;Ljava/lang/Object;)V

    .line 457
    :goto_1
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-virtual {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a()V

    .line 459
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 460
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    const v1, 0x7f070048

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 461
    new-array v0, v11, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    iget-object v1, v1, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    aput-object v1, v0, v10

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 468
    :goto_2
    return-void

    .line 446
    :cond_1
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    iget-object v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v4, v4, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->h(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I

    move-result v4

    if-lt v2, v4, :cond_0

    .line 447
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->i(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 454
    :cond_2
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, v2, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->e:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lkik/android/widget/UserMediaImageThumbNailList;

    move-result-object v2

    invoke-virtual {v2, v3}, Lkik/android/widget/UserMediaImageThumbNailList;->a(Ljava/lang/Object;)Lcom/kik/g/aq;

    goto :goto_1

    .line 464
    :cond_3
    new-array v0, v11, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    iget-object v1, v1, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->d:Landroid/view/View;

    aput-object v1, v0, v10

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 465
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b$a;->c:Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;

    iget-object v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a$a;->b:Landroid/widget/ImageView;

    const v1, 0x7f070047

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2
.end method

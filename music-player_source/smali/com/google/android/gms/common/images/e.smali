.class public final Lcom/google/android/gms/common/images/e;
.super Ljava/lang/Object;


# instance fields
.field final a:Lcom/google/android/gms/common/images/f;

.field b:I

.field private c:I

.field private d:I

.field private e:Ljava/lang/ref/WeakReference;

.field private f:Ljava/lang/ref/WeakReference;

.field private g:Ljava/lang/ref/WeakReference;

.field private h:I

.field private i:Z

.field private j:I


# direct methods
.method private static a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/fk;
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    instance-of v0, p0, Lcom/google/android/gms/internal/fk;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/fk;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fk;->a()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    :cond_0
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/fk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/fk;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_1
    move-object p0, v0

    goto :goto_0
.end method

.method private a(Landroid/graphics/drawable/Drawable;Z)V
    .locals 10

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget v0, p0, Lcom/google/android/gms/common/images/e;->b:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/images/e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/images/e;->a:Lcom/google/android/gms/common/images/f;

    iget-object v0, v0, Lcom/google/android/gms/common/images/f;->a:Landroid/net/Uri;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/common/images/e;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    if-nez p2, :cond_3

    :goto_1
    if-eqz v4, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/internal/fp;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/fp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/fp;->a()I

    move-result v1

    iget v2, p0, Lcom/google/android/gms/common/images/e;->c:I

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/google/android/gms/common/images/e;->c:I

    if-eq v1, v2, :cond_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/common/images/e;->a()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/common/images/e;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    instance-of v2, v0, Lcom/google/android/gms/internal/fp;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/google/android/gms/internal/fp;

    if-eqz p2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/common/images/e;->a:Lcom/google/android/gms/common/images/f;

    iget-object v2, v2, Lcom/google/android/gms/common/images/f;->a:Landroid/net/Uri;

    :goto_3
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/fp;->a(Landroid/net/Uri;)V

    if-eqz v4, :cond_5

    iget v2, p0, Lcom/google/android/gms/common/images/e;->c:I

    :goto_4
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/fp;->a(I)V

    :cond_2
    if-eqz v5, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/fk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fk;->b()V

    goto :goto_0

    :cond_3
    move v4, v3

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_3

    :cond_5
    move v2, v3

    goto :goto_4

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/common/images/e;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget v6, p0, Lcom/google/android/gms/common/images/e;->h:I

    invoke-direct {p0}, Lcom/google/android/gms/common/images/e;->a()Z

    move-result v7

    invoke-static {}, Lcom/google/android/gms/internal/ik;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object v2, v1

    :goto_5
    aget-object v1, v2, v6

    if-eqz v7, :cond_c

    invoke-static {v1, p1}, Lcom/google/android/gms/common/images/e;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    :goto_6
    if-nez v6, :cond_7

    move-object v5, v1

    :goto_7
    if-ne v6, v4, :cond_8

    move-object v4, v1

    :goto_8
    if-ne v6, v8, :cond_9

    move-object v3, v1

    :goto_9
    if-ne v6, v9, :cond_a

    move-object v2, v1

    :goto_a
    invoke-static {}, Lcom/google/android/gms/internal/ik;->b()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v0, v5, v4, v3, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :goto_b
    if-eqz v7, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/fk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fk;->b()V

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object v2, v1

    goto :goto_5

    :cond_7
    aget-object v3, v2, v3

    move-object v5, v3

    goto :goto_7

    :cond_8
    aget-object v3, v2, v4

    move-object v4, v3

    goto :goto_8

    :cond_9
    aget-object v3, v2, v8

    goto :goto_9

    :cond_a
    aget-object v2, v2, v9

    goto :goto_a

    :cond_b
    invoke-virtual {v0, v5, v4, v3, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_b

    :cond_c
    move-object v1, p1

    goto :goto_6

    :cond_d
    move-object v1, p1

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/e;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a(Landroid/content/Context;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x0

    iget v0, p0, Lcom/google/android/gms/common/images/e;->c:I

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v0, p0, Lcom/google/android/gms/common/images/e;->c:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v3, p0, Lcom/google/android/gms/common/images/e;->j:I

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    if-nez v0, :cond_1

    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/fo;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :cond_0
    :goto_1
    invoke-direct {p0, v0, v6}, Lcom/google/android/gms/common/images/e;->a(Landroid/graphics/drawable/Drawable;Z)V

    return-void

    :cond_1
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    invoke-virtual {v0, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method final a(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/internal/fq;->a(Ljava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/common/images/e;->j:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/fo;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    :cond_0
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/common/images/e;->a(Landroid/graphics/drawable/Drawable;Z)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    instance-of v2, p1, Lcom/google/android/gms/common/images/e;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-ne p0, p1, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/common/images/e;

    invoke-virtual {p1}, Lcom/google/android/gms/common/images/e;->hashCode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/common/images/e;->hashCode()I

    move-result v3

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/images/e;->d:I

    return v0
.end method

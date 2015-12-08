.class public Lkik/android/widget/IconImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/IconImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    sget-object v0, Lkik/android/ag$b;->e:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 31
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lkik/android/widget/IconImageView;->a:Landroid/graphics/drawable/Drawable;

    .line 32
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkik/a/e/n;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 97
    if-nez p1, :cond_1

    .line 98
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/IconImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 110
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    invoke-static {p1}, Lkik/android/util/e;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    if-nez v0, :cond_0

    .line 103
    invoke-interface {p2, p1, v1}, Lkik/a/e/n;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 104
    if-eqz v0, :cond_0

    .line 106
    invoke-static {v0, p1}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 107
    invoke-virtual {p0, v0}, Lkik/android/widget/IconImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {p0, v0}, Lkik/android/widget/IconImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x1

    goto :goto_1
.end method

.method public final a(Lkik/a/d/a/a;Lkik/a/e/n;)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 48
    if-nez p1, :cond_0

    .line 49
    invoke-virtual {p0, v4, p2}, Lkik/android/widget/IconImageView;->a(Ljava/lang/String;Lkik/a/e/n;)V

    .line 74
    :goto_0
    return v2

    .line 54
    :cond_0
    if-eqz p1, :cond_2

    const-string v0, "com.kik.ext.gallery"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.kik.ext.video-gallery"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 55
    const v0, 0x7f020009

    invoke-virtual {p0, v0}, Lkik/android/widget/IconImageView;->setImageResource(I)V

    move v0, v1

    :goto_2
    move v2, v0

    .line 71
    goto :goto_0

    :cond_2
    move v0, v2

    .line 54
    goto :goto_1

    .line 58
    :cond_3
    if-eqz p1, :cond_5

    const-string v0, "com.kik.ext.camera"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "com.kik.ext.video-camera"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v0, v1

    :goto_3
    if-eqz v0, :cond_6

    .line 59
    const v0, 0x7f020008

    invoke-virtual {p0, v0}, Lkik/android/widget/IconImageView;->setImageResource(I)V

    move v0, v1

    .line 60
    goto :goto_2

    :cond_5
    move v0, v2

    .line 58
    goto :goto_3

    .line 64
    :cond_6
    const-string v0, "icon"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    .line 65
    if-eqz v0, :cond_7

    instance-of v3, v0, Lkik/a/d/d;

    if-nez v3, :cond_8

    .line 66
    :cond_7
    invoke-virtual {p0, v4, p2}, Lkik/android/widget/IconImageView;->a(Ljava/lang/String;Lkik/a/e/n;)V

    goto :goto_0

    .line 69
    :cond_8
    check-cast v0, Lkik/a/d/d;

    .line 70
    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, p2}, Lkik/android/widget/IconImageView;->a(Ljava/lang/String;Lkik/a/e/n;)V

    .line 71
    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    move v0, v1

    goto :goto_2

    :cond_9
    move v0, v2

    goto :goto_2
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 126
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 127
    iget-object v0, p0, Lkik/android/widget/IconImageView;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lkik/android/widget/IconImageView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lkik/android/widget/IconImageView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/IconImageView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 129
    iget-object v0, p0, Lkik/android/widget/IconImageView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 131
    :cond_0
    return-void
.end method

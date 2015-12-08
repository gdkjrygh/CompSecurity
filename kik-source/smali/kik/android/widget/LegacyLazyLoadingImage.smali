.class public Lkik/android/widget/LegacyLazyLoadingImage;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field protected a:Lkik/android/widget/v;

.field private b:Ljava/lang/String;

.field private c:Landroid/graphics/Bitmap;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/16 v2, 0xcc

    const/16 v1, 0x8e

    .line 61
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->e:Z

    .line 36
    iput v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->f:I

    .line 37
    iput v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->g:I

    .line 39
    iput v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->h:I

    .line 40
    iput v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->i:I

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->k:Z

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/16 v1, 0xcc

    const/16 v0, 0x8e

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 66
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    iput-boolean v3, p0, Lkik/android/widget/LegacyLazyLoadingImage;->e:Z

    .line 36
    iput v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->f:I

    .line 37
    iput v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->g:I

    .line 39
    iput v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->h:I

    .line 40
    iput v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->i:I

    .line 44
    iput-boolean v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->k:Z

    .line 67
    sget-object v0, Lkik/android/ag$b;->m:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 68
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->j:Landroid/graphics/drawable/Drawable;

    .line 69
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->k:Z

    .line 70
    new-instance v0, Lkik/android/widget/v;

    invoke-direct {v0}, Lkik/android/widget/v;-><init>()V

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    .line 72
    invoke-virtual {p0}, Lkik/android/widget/LegacyLazyLoadingImage;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 73
    iput-boolean v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->e:Z

    .line 75
    :cond_0
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    invoke-virtual {v0, p0}, Lkik/android/widget/v;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 76
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/v;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 229
    new-instance v0, Lkik/android/widget/v;

    iget-object v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->b:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lkik/android/widget/v;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    .line 230
    return-void
.end method

.method private a(Lkik/android/widget/v;)V
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->e:Z

    if-nez v0, :cond_1

    .line 95
    invoke-virtual {p1}, Lkik/android/widget/v;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->j:Landroid/graphics/drawable/Drawable;

    :cond_0
    invoke-virtual {p0, p1}, Lkik/android/widget/LegacyLazyLoadingImage;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    :goto_0
    return-void

    .line 98
    :cond_1
    invoke-virtual {p1}, Lkik/android/widget/v;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->j:Landroid/graphics/drawable/Drawable;

    :cond_2
    invoke-virtual {p0, p1}, Lkik/android/widget/LegacyLazyLoadingImage;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lkik/a/e/n;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v1, 0x0

    .line 108
    if-nez p1, :cond_1

    .line 109
    new-instance v0, Lkik/android/widget/v;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lkik/android/widget/v;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    .line 110
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    invoke-direct {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Lkik/android/widget/v;)V

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    iput-object p1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->b:Ljava/lang/String;

    .line 114
    iput v4, p0, Lkik/android/widget/LegacyLazyLoadingImage;->d:I

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lkik/android/widget/LegacyLazyLoadingImage;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "-f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 116
    iget-boolean v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->k:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->b:Ljava/lang/String;

    invoke-interface {p3, v0, v1}, Lkik/a/e/n;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    .line 119
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    .line 120
    invoke-interface {p3, p2}, Lkik/a/e/n;->e(Ljava/lang/String;)[B

    move-result-object v0

    .line 121
    if-eqz v0, :cond_2

    .line 122
    array-length v3, v0

    invoke-static {v0, v1, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    .line 125
    :cond_2
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_6

    .line 126
    iget v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->d:I

    if-ne v0, v4, :cond_0

    const v0, 0x7f0201a8

    invoke-virtual {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->setImageResource(I)V

    goto :goto_0

    .line 116
    :cond_3
    invoke-static {v2}, Lkik/android/util/e;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    invoke-direct {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Lkik/android/widget/v;)V

    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    .line 133
    :cond_6
    invoke-interface {p3, p2}, Lkik/a/e/n;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 135
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    iget v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->h:I

    iget v3, p0, Lkik/android/widget/LegacyLazyLoadingImage;->i:I

    invoke-static {v0, v1, v3}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    .line 143
    :goto_2
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    invoke-static {v0, v2}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Landroid/graphics/Bitmap;)V

    .line 153
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    invoke-direct {p0, v0}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Lkik/android/widget/v;)V

    goto/16 :goto_0

    .line 139
    :cond_7
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    iget v1, p0, Lkik/android/widget/LegacyLazyLoadingImage;->f:I

    iget v3, p0, Lkik/android/widget/LegacyLazyLoadingImage;->g:I

    invoke-static {v0, v1, v3}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->c:Landroid/graphics/Bitmap;

    goto :goto_2
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 241
    iget-object v0, p0, Lkik/android/widget/LegacyLazyLoadingImage;->a:Lkik/android/widget/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/v;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 242
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 243
    return-void
.end method

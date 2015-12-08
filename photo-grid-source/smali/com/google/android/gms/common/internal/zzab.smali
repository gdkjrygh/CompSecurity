.class public final Lcom/google/android/gms/common/internal/zzab;
.super Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/common/internal/zzab;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010048

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static a(III)I
    .locals 3

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown color scheme: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move p1, p2

    :pswitch_1
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Landroid/content/res/Resources;II)V
    .locals 8

    .prologue
    const/high16 v7, 0x42400000    # 48.0f

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    if-ltz p2, :cond_0

    const/4 v0, 0x3

    if-ge p2, v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Unknown button size %d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-ltz p3, :cond_1

    const/4 v0, 0x2

    if-ge p3, v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Unknown color scheme %s"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setTextSize(F)V

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v1, v0, v7

    add-float/2addr v1, v6

    float-to-int v1, v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/internal/zzab;->setMinHeight(I)V

    mul-float/2addr v0, v7

    add-float/2addr v0, v6

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setMinWidth(I)V

    .line 2000
    packed-switch p2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown button size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move v0, v2

    .line 0
    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    .line 2000
    :pswitch_0
    sget v0, Lcom/google/android/gms/c;->e:I

    sget v1, Lcom/google/android/gms/c;->f:I

    invoke-static {p3, v0, v1}, Lcom/google/android/gms/common/internal/zzab;->a(III)I

    move-result v0

    :goto_2
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find background resource!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget v0, Lcom/google/android/gms/c;->c:I

    sget v1, Lcom/google/android/gms/c;->d:I

    invoke-static {p3, v0, v1}, Lcom/google/android/gms/common/internal/zzab;->a(III)I

    move-result v0

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3000
    sget v0, Lcom/google/android/gms/b;->a:I

    sget v1, Lcom/google/android/gms/b;->b:I

    invoke-static {p3, v0, v1}, Lcom/google/android/gms/common/internal/zzab;->a(III)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setTextColor(Landroid/content/res/ColorStateList;)V

    packed-switch p2, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown button size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    sget v0, Lcom/google/android/gms/d;->C:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void

    :pswitch_3
    sget v0, Lcom/google/android/gms/d;->D:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :pswitch_4
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/zzab;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 2000
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 3000
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

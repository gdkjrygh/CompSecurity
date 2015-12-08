.class public final Lkik/android/scan/widget/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/scan/widget/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Paint;

.field private d:I

.field private final e:Ljava/util/ArrayList;

.field private final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 63
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 21
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/scan/widget/a;->b:Landroid/graphics/Paint;

    .line 22
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/scan/widget/a;->c:Landroid/graphics/Paint;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/scan/widget/a;->f:Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lkik/android/scan/widget/a;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 65
    iget-object v0, p0, Lkik/android/scan/widget/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 66
    iput p1, p0, Lkik/android/scan/widget/a;->a:I

    .line 67
    return-void
.end method


# virtual methods
.method public final a(ILandroid/graphics/Point;)V
    .locals 4

    .prologue
    .line 78
    new-instance v0, Lkik/android/scan/widget/a$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v2, v3, p1, p2}, Lkik/android/scan/widget/a$a;-><init>(JILandroid/graphics/Point;)V

    .line 79
    iget-object v1, p0, Lkik/android/scan/widget/a;->f:Ljava/lang/Object;

    monitor-enter v1

    .line 80
    :try_start_0
    iget-object v2, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-virtual {p0}, Lkik/android/scan/widget/a;->invalidateSelf()V

    .line 83
    return-void

    .line 81
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 88
    iget-object v3, p0, Lkik/android/scan/widget/a;->f:Ljava/lang/Object;

    monitor-enter v3

    move v1, v2

    .line 89
    :goto_0
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 91
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/scan/widget/a$a;

    invoke-virtual {v0}, Lkik/android/scan/widget/a$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/scan/widget/a$a;

    .line 96
    add-int/lit8 v1, v1, -0x1

    .line 99
    invoke-static {v0}, Lkik/android/scan/widget/a$a;->a(Lkik/android/scan/widget/a$a;)I

    move-result v0

    iput v0, p0, Lkik/android/scan/widget/a;->a:I

    :cond_0
    move v0, v1

    .line 89
    add-int/lit8 v1, v0, 0x1

    goto :goto_0

    .line 102
    :cond_1
    iget-object v0, p0, Lkik/android/scan/widget/a;->b:Landroid/graphics/Paint;

    iget v1, p0, Lkik/android/scan/widget/a;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 103
    invoke-virtual {p0}, Lkik/android/scan/widget/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/widget/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    move v1, v2

    .line 105
    :goto_1
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 106
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/scan/widget/a$a;

    .line 107
    iget-object v2, p0, Lkik/android/scan/widget/a;->c:Landroid/graphics/Paint;

    invoke-static {v0}, Lkik/android/scan/widget/a$a;->a(Lkik/android/scan/widget/a$a;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    iget v2, p0, Lkik/android/scan/widget/a;->d:I

    int-to-float v2, v2

    invoke-virtual {v0}, Lkik/android/scan/widget/a$a;->a()F

    move-result v4

    mul-float/2addr v2, v4

    .line 109
    invoke-static {v0}, Lkik/android/scan/widget/a$a;->b(Lkik/android/scan/widget/a$a;)Landroid/graphics/Point;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 110
    invoke-static {v0}, Lkik/android/scan/widget/a$a;->b(Lkik/android/scan/widget/a$a;)Landroid/graphics/Point;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    invoke-static {v0}, Lkik/android/scan/widget/a$a;->b(Lkik/android/scan/widget/a$a;)Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget-object v5, p0, Lkik/android/scan/widget/a;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0, v2, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 105
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 113
    :cond_3
    iget-object v0, p0, Lkik/android/scan/widget/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 114
    invoke-virtual {p0}, Lkik/android/scan/widget/a;->invalidateSelf()V

    .line 116
    :cond_4
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final getOpacity()I
    .locals 1

    .prologue
    .line 134
    const/4 v0, -0x1

    return v0
.end method

.method protected final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 72
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 73
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lkik/android/scan/widget/a;->d:I

    .line 74
    return-void
.end method

.method public final setAlpha(I)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 129
    return-void
.end method

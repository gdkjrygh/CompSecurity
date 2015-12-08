.class public Lkik/android/widget/ClampedContentPreviewView;
.super Lcom/kik/cache/ContentPreviewImageView;
.source "SourceFile"


# instance fields
.field private h:Landroid/graphics/Point;

.field private i:Ljava/lang/reflect/Field;

.field private j:Ljava/lang/reflect/Field;

.field private k:Ljava/lang/reflect/Field;

.field private l:Ljava/lang/reflect/Field;

.field private m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/kik/cache/ContentPreviewImageView;-><init>(Landroid/content/Context;)V

    .line 25
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    .line 36
    invoke-direct {p0}, Lkik/android/widget/ClampedContentPreviewView;->a()V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/kik/cache/ContentPreviewImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    .line 42
    invoke-direct {p0}, Lkik/android/widget/ClampedContentPreviewView;->a()V

    .line 43
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 53
    :try_start_0
    const-class v0, Landroid/widget/ImageView;

    const-string v1, "mMaxWidth"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->i:Ljava/lang/reflect/Field;

    .line 54
    const-class v0, Landroid/widget/ImageView;

    const-string v1, "mMaxHeight"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->j:Ljava/lang/reflect/Field;

    .line 55
    const-class v0, Landroid/view/View;

    const-string v1, "mMinWidth"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->k:Ljava/lang/reflect/Field;

    .line 56
    const-class v0, Landroid/view/View;

    const-string v1, "mMinHeight"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->l:Ljava/lang/reflect/Field;

    .line 57
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->i:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 58
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->j:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 59
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->k:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 60
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->l:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected final b(II)Landroid/graphics/Point;
    .locals 4

    .prologue
    .line 174
    const/16 v0, 0xcd

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    .line 175
    const/16 v0, 0x10b

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    .line 178
    :try_start_0
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->i:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 179
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->j:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v2

    .line 183
    :goto_0
    invoke-static {p1, p2, v1, v0}, Lkik/android/util/e;->a(IIII)Landroid/graphics/Point;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move v0, v2

    move v3, v1

    move v1, v0

    move v0, v3

    goto :goto_0
.end method

.method public final d(I)V
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lkik/android/widget/ClampedContentPreviewView;->m:I

    .line 48
    return-void
.end method

.method protected onMeasure(II)V
    .locals 12

    .prologue
    .line 69
    invoke-virtual {p0}, Lkik/android/widget/ClampedContentPreviewView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 70
    if-nez v1, :cond_0

    .line 71
    invoke-super {p0, p1, p2}, Lcom/kik/cache/ContentPreviewImageView;->onMeasure(II)V

    .line 168
    :goto_0
    return-void

    .line 74
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 75
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    .line 79
    iget-object v2, p0, Lkik/android/widget/ClampedContentPreviewView;->a:Landroid/graphics/Point;

    if-nez v2, :cond_8

    .line 81
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/ClampedContentPreviewView;->b(II)Landroid/graphics/Point;

    move-result-object v2

    iput-object v2, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    .line 90
    :goto_1
    iget-object v2, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    if-eqz v2, :cond_c

    .line 91
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 92
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    move v2, v1

    move v1, v0

    .line 95
    :goto_2
    const/4 v5, 0x0

    .line 96
    const/4 v4, 0x0

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v6, 0x0

    .line 101
    :try_start_0
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->i:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 102
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->j:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 103
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->k:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 104
    iget-object v0, p0, Lkik/android/widget/ClampedContentPreviewView;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v7, v3

    move v6, v4

    move v4, v5

    move v5, v0

    .line 113
    :goto_3
    if-lez v7, :cond_1

    if-ge v2, v7, :cond_1

    move v2, v7

    .line 116
    :cond_1
    if-lez v6, :cond_2

    if-le v2, v6, :cond_2

    move v2, v6

    .line 119
    :cond_2
    if-lez v5, :cond_b

    if-ge v1, v5, :cond_b

    move v0, v5

    .line 122
    :goto_4
    if-lez v4, :cond_3

    if-le v0, v4, :cond_3

    move v0, v4

    .line 126
    :cond_3
    int-to-double v8, v2

    int-to-double v10, v0

    div-double/2addr v8, v10

    .line 128
    const-wide/high16 v10, 0x3fe2000000000000L    # 0.5625

    cmpg-double v1, v8, v10

    if-gez v1, :cond_a

    .line 132
    if-le v2, v0, :cond_9

    .line 133
    int-to-double v2, v2

    .line 134
    int-to-double v0, v0

    .line 141
    :goto_5
    iget v8, p0, Lkik/android/widget/ClampedContentPreviewView;->m:I

    int-to-double v8, v8

    sub-double/2addr v0, v8

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 143
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 144
    :goto_6
    if-lez v7, :cond_4

    if-ge v1, v7, :cond_4

    move v1, v7

    .line 154
    :cond_4
    if-lez v6, :cond_5

    if-le v1, v6, :cond_5

    move v1, v6

    .line 157
    :cond_5
    if-lez v5, :cond_6

    if-ge v0, v5, :cond_6

    move v0, v5

    .line 160
    :cond_6
    if-lez v4, :cond_7

    if-le v0, v4, :cond_7

    move v0, v4

    .line 165
    :cond_7
    iget v2, p0, Lkik/android/widget/ClampedContentPreviewView;->b:I

    iget v3, p0, Lkik/android/widget/ClampedContentPreviewView;->c:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    .line 167
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/ClampedContentPreviewView;->setMeasuredDimension(II)V

    goto/16 :goto_0

    .line 88
    :cond_8
    iget-object v2, p0, Lkik/android/widget/ClampedContentPreviewView;->a:Landroid/graphics/Point;

    iput-object v2, p0, Lkik/android/widget/ClampedContentPreviewView;->h:Landroid/graphics/Point;

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v7, v0

    move v6, v3

    goto :goto_3

    .line 138
    :cond_9
    const/16 v0, 0x10b

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    int-to-double v0, v0

    .line 139
    const/16 v2, 0x10b

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v8, 0x3fe2000000000000L    # 0.5625

    mul-double/2addr v2, v8

    goto :goto_5

    :cond_a
    move v1, v2

    goto :goto_6

    :cond_b
    move v0, v1

    goto :goto_4

    :cond_c
    move v2, v1

    move v1, v0

    goto/16 :goto_2
.end method

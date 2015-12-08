.class public Lkik/android/widget/cx;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# instance fields
.field a:[I

.field private b:Landroid/view/View;

.field private c:Z

.field private d:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private e:I

.field private final f:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 50
    invoke-direct {p0, p1, v0, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 25
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lkik/android/widget/cx;->a:[I

    .line 27
    new-instance v0, Lkik/android/widget/cy;

    invoke-direct {v0, p0}, Lkik/android/widget/cy;-><init>(Lkik/android/widget/cx;)V

    iput-object v0, p0, Lkik/android/widget/cx;->d:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/widget/cx;->e:I

    .line 39
    new-instance v0, Lkik/android/widget/cz;

    invoke-direct {v0, p0}, Lkik/android/widget/cz;-><init>(Lkik/android/widget/cx;)V

    iput-object v0, p0, Lkik/android/widget/cx;->f:Landroid/view/View$OnTouchListener;

    .line 51
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/cx;->d:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 181
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/widget/cx;)[I
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lkik/android/widget/cx;->b()[I

    move-result-object v0

    return-object v0
.end method

.method private b()[I
    .locals 2

    .prologue
    .line 185
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 186
    iget-object v1, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 187
    iget-object v1, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 189
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .prologue
    .line 91
    iput-object p1, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    .line 92
    invoke-virtual {p0}, Lkik/android/widget/cx;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {p0, v0}, Lkik/android/widget/cx;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/cx;->getContentView()Landroid/view/View;

    move-result-object v4

    .line 100
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 101
    const/high16 v0, -0x80000000

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    const/high16 v3, -0x80000000

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v4, v0, v2}, Landroid/view/View;->measure(II)V

    .line 104
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 105
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v2, v0

    .line 108
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 109
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 111
    const/4 v3, 0x0

    aget v6, v0, v3

    .line 112
    const/4 v3, 0x1

    aget v7, v0, v3

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float v8, v0, v3

    .line 114
    int-to-float v0, v6

    add-float/2addr v0, v8

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    sub-float/2addr v0, v3

    .line 115
    add-float v3, v0, v2

    int-to-float v9, v1

    cmpl-float v3, v3, v9

    if-lez v3, :cond_4

    .line 116
    int-to-float v0, v1

    sub-float/2addr v0, v2

    move v3, v0

    .line 123
    :goto_0
    const/4 v1, 0x0

    .line 124
    const/4 v0, 0x0

    .line 125
    if-eqz p2, :cond_7

    .line 126
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 127
    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 128
    invoke-virtual {p2, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 129
    invoke-virtual {p2, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 130
    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v9, 0x0

    aget v9, v2, v9

    sub-int/2addr v1, v9

    .line 131
    const/4 v9, 0x1

    aget v0, v0, v9

    const/4 v9, 0x1

    aget v2, v2, v9

    sub-int/2addr v0, v2

    move v2, v1

    move v1, v0

    .line 135
    :goto_1
    const v0, 0x7f0e0098

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 136
    if-eqz v9, :cond_2

    .line 137
    if-eqz v9, :cond_1

    if-nez v4, :cond_5

    .line 138
    :cond_1
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v10, 0x40000000    # 2.0f

    div-float v10, v0, v10

    .line 139
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 142
    int-to-float v6, v6

    add-float/2addr v6, v8

    sub-float/2addr v6, v3

    sub-float/2addr v6, v10

    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float v4, v6, v4

    float-to-int v4, v4

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0, v4, v6, v8, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 143
    invoke-virtual {v9, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    :cond_2
    if-nez p2, :cond_6

    .line 146
    :goto_2
    const/4 v0, 0x0

    float-to-int v3, v3

    add-int/2addr v2, v3

    sub-int v3, v7, v5

    add-int/2addr v1, v3

    iget v3, p0, Lkik/android/widget/cx;->e:I

    add-int/2addr v1, v3

    invoke-virtual {p0, p1, v0, v2, v1}, Lkik/android/widget/cx;->showAtLocation(Landroid/view/View;III)V

    .line 148
    invoke-direct {p0}, Lkik/android/widget/cx;->b()[I

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/cx;->a:[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    aget v3, v0, v3

    aput v3, v1, v2

    iget-object v1, p0, Lkik/android/widget/cx;->a:[I

    const/4 v2, 0x1

    const/4 v3, 0x1

    aget v0, v0, v3

    aput v0, v1, v2

    .line 149
    iget-boolean v0, p0, Lkik/android/widget/cx;->c:Z

    if-eqz v0, :cond_3

    .line 150
    invoke-direct {p0}, Lkik/android/widget/cx;->a()V

    iget-object v0, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/widget/cx;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/cx;->d:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 152
    :cond_3
    return-void

    .line 118
    :cond_4
    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_8

    .line 119
    const/4 v0, 0x0

    move v3, v0

    goto/16 :goto_0

    .line 137
    :cond_5
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, v4, :cond_1

    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Indicator must be a direct child of the root hint view for placement to work properly"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object p1, p2

    .line 145
    goto :goto_2

    :cond_7
    move v2, v1

    move v1, v0

    goto/16 :goto_1

    :cond_8
    move v3, v0

    goto/16 :goto_0
.end method

.method public dismiss()V
    .locals 0

    .prologue
    .line 172
    invoke-super {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 173
    invoke-direct {p0}, Lkik/android/widget/cx;->a()V

    .line 174
    return-void
.end method

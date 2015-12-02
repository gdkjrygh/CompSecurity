.class public Lcom/facebook/widget/HorizontalOrVerticalViewGroup;
.super Landroid/view/ViewGroup;
.source "HorizontalOrVerticalViewGroup.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/widget/h;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

    sput-object v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    sget-object v0, Lcom/facebook/widget/h;->VERTICAL:Lcom/facebook/widget/h;

    iput-object v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    .line 71
    sget-object v0, Lcom/facebook/q;->HorizontalOrVerticalViewGroup:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 73
    sget v1, Lcom/facebook/q;->HorizontalOrVerticalViewGroup_childMargin:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->c:I

    .line 75
    return-void
.end method

.method private a(IILcom/facebook/widget/h;)Lcom/facebook/widget/i;
    .locals 11

    .prologue
    .line 146
    invoke-direct {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getVisibleChildren()Lcom/google/common/a/es;

    move-result-object v5

    .line 147
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 149
    const/high16 v3, -0x80000000

    .line 150
    const/high16 v2, -0x80000000

    .line 155
    sget-object v0, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    if-ne p3, v0, :cond_0

    .line 156
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v4, -0x1

    invoke-direct {v0, v1, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object v1, v0

    .line 161
    :goto_0
    const/4 v0, 0x0

    move v4, v3

    move v3, v2

    move v2, v0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 162
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 163
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->measureChild(Landroid/view/View;II)V

    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 169
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 171
    sget-object v8, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Visible child "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " initial measurement: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "x"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 174
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 175
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 161
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 158
    :cond_0
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v1, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object v1, v0

    goto :goto_0

    .line 178
    :cond_1
    const/high16 v0, -0x80000000

    if-ne v4, v0, :cond_2

    const/high16 v0, -0x80000000

    if-ne v3, v0, :cond_2

    .line 179
    sget-object v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    const-string v1, "No visible children, collapsing view group to zero size."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 180
    new-instance v0, Lcom/facebook/widget/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/widget/i;-><init>(Lcom/facebook/widget/HorizontalOrVerticalViewGroup;II)V

    .line 207
    :goto_2
    return-object v0

    .line 185
    :cond_2
    iget v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->c:I

    add-int/lit8 v1, v6, -0x1

    mul-int/2addr v0, v1

    .line 187
    sget-object v1, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    if-ne p3, v1, :cond_3

    .line 188
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 207
    :goto_3
    new-instance v0, Lcom/facebook/widget/i;

    invoke-direct {v0, p0, v4, v3}, Lcom/facebook/widget/i;-><init>(Lcom/facebook/widget/HorizontalOrVerticalViewGroup;II)V

    goto :goto_2

    .line 191
    :sswitch_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int v0, v1, v0

    div-int/2addr v0, v6

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_3

    .line 197
    :cond_3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto :goto_3

    .line 200
    :sswitch_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int v0, v1, v0

    div-int/2addr v0, v6

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_3

    .line 188
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 197
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(Lcom/facebook/widget/i;IILcom/facebook/widget/h;)Lcom/facebook/widget/i;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 219
    invoke-direct {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getVisibleChildren()Lcom/google/common/a/es;

    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 221
    iget v1, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->c:I

    add-int/lit8 v3, v0, -0x1

    mul-int/2addr v3, v1

    .line 225
    sget-object v1, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    if-ne p4, v1, :cond_0

    .line 226
    iget v1, p1, Lcom/facebook/widget/i;->a:I

    mul-int/2addr v0, v1

    .line 227
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int v1, v0, v3

    .line 228
    iget v0, p1, Lcom/facebook/widget/i;->b:I

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingTop()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v0, v3

    .line 235
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 236
    invoke-static {v3, p2}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->resolveSize(II)I

    move-result v3

    .line 237
    if-le v1, v3, :cond_1

    .line 238
    sget-object v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Desired width "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " > spec width "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", switching modes..."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v2

    .line 250
    :goto_1
    return-object v0

    .line 230
    :cond_0
    iget v1, p1, Lcom/facebook/widget/i;->b:I

    mul-int/2addr v0, v1

    .line 231
    iget v1, p1, Lcom/facebook/widget/i;->a:I

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingLeft()I

    move-result v4

    add-int/2addr v1, v4

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v1, v4

    .line 232
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingTop()I

    move-result v4

    add-int/2addr v0, v4

    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingBottom()I

    move-result v4

    add-int/2addr v0, v4

    add-int/2addr v0, v3

    goto :goto_0

    .line 243
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 244
    invoke-static {v1, p3}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->resolveSize(II)I

    move-result v1

    .line 245
    if-le v0, v1, :cond_2

    .line 246
    sget-object v3, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Desired height "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " > spec height "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v2

    .line 247
    goto :goto_1

    .line 250
    :cond_2
    new-instance v0, Lcom/facebook/widget/i;

    invoke-direct {v0, p0, v3, v1}, Lcom/facebook/widget/i;-><init>(Lcom/facebook/widget/HorizontalOrVerticalViewGroup;II)V

    goto :goto_1
.end method

.method private getVisibleChildren()Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .prologue
    .line 254
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getChildCount()I

    move-result v1

    .line 255
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 256
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 257
    invoke-virtual {p0, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 258
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    .line 259
    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 256
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 262
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getMode()Lcom/facebook/widget/h;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 14

    .prologue
    .line 267
    invoke-direct {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getVisibleChildren()Lcom/google/common/a/es;

    move-result-object v2

    .line 268
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingLeft()I

    move-result v1

    .line 269
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getPaddingTop()I

    move-result v0

    .line 271
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v1

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 272
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v2

    .line 273
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, v1

    .line 274
    sget-object v6, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Laying out child "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " @ "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ","

    invoke-static {v8}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v11, v12

    const/4 v12, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-virtual {v8, v9, v10, v11}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 276
    invoke-virtual {v0, v2, v1, v4, v5}, Landroid/view/View;->layout(IIII)V

    .line 278
    iget-object v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    sget-object v6, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    if-ne v0, v6, :cond_0

    .line 280
    iget v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->c:I

    add-int v2, v4, v0

    move v0, v1

    move v1, v2

    :goto_1
    move v2, v1

    move v1, v0

    .line 285
    goto :goto_0

    .line 283
    :cond_0
    iget v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->c:I

    add-int/2addr v0, v5

    move v1, v2

    goto :goto_1

    .line 286
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    .prologue
    const/high16 v7, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 86
    invoke-virtual {p0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getChildCount()I

    move-result v3

    .line 87
    if-lez v3, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Must have at least one child"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 90
    sget-object v0, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a(IILcom/facebook/widget/h;)Lcom/facebook/widget/i;

    move-result-object v2

    .line 91
    sget-object v0, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    invoke-direct {p0, v2, p1, p2, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a(Lcom/facebook/widget/i;IILcom/facebook/widget/h;)Lcom/facebook/widget/i;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    sget-object v4, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Laying out view group horizontally, size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 99
    sget-object v4, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    iput-object v4, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    .line 123
    :goto_1
    iget v4, v2, Lcom/facebook/widget/i;->a:I

    invoke-static {v7, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 126
    iget v5, v2, Lcom/facebook/widget/i;->b:I

    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 130
    :goto_2
    if-ge v1, v3, :cond_4

    .line 131
    invoke-virtual {p0, v1}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 132
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_3

    .line 130
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_0
    move v0, v1

    .line 87
    goto :goto_0

    .line 101
    :cond_1
    sget-object v0, Lcom/facebook/widget/h;->VERTICAL:Lcom/facebook/widget/h;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a(IILcom/facebook/widget/h;)Lcom/facebook/widget/i;

    move-result-object v2

    .line 102
    sget-object v0, Lcom/facebook/widget/h;->VERTICAL:Lcom/facebook/widget/h;

    invoke-direct {p0, v2, p1, p2, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a(Lcom/facebook/widget/i;IILcom/facebook/widget/h;)Lcom/facebook/widget/i;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    sget-object v4, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Laying out view group vertically, size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 107
    sget-object v4, Lcom/facebook/widget/h;->VERTICAL:Lcom/facebook/widget/h;

    iput-object v4, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    goto :goto_1

    .line 113
    :cond_2
    sget-object v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Children of view group "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " do not fit either horizontally or vertically."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 115
    sget-object v0, Lcom/facebook/widget/h;->VERTICAL:Lcom/facebook/widget/h;

    iput-object v0, p0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->b:Lcom/facebook/widget/h;

    .line 116
    new-instance v0, Lcom/facebook/widget/i;

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    invoke-direct {v0, p0, v4, v5}, Lcom/facebook/widget/i;-><init>(Lcom/facebook/widget/HorizontalOrVerticalViewGroup;II)V

    goto :goto_1

    .line 135
    :cond_3
    sget-object v7, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->a:Ljava/lang/Class;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Setting measured size of child "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " to "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 136
    invoke-virtual {v6, v4, v5}, Landroid/view/View;->measure(II)V

    goto/16 :goto_3

    .line 139
    :cond_4
    iget v1, v0, Lcom/facebook/widget/i;->a:I

    iget v0, v0, Lcom/facebook/widget/i;->b:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->setMeasuredDimension(II)V

    .line 140
    return-void
.end method

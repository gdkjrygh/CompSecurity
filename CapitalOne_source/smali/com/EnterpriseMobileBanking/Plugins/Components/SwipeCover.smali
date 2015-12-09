.class public Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
.super Landroid/widget/HorizontalScrollView;
.source "SwipeCover.java"


# static fields
.field private static final FLING_THRESHOLD:I

.field private static final USE_TWO_THIRDS:Z = true

.field private static checkDelay:I

.field private static last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;


# instance fields
.field private SPRING_THRESHOLD:I

.field private ignoreButtons:Z

.field private lastButton:I

.field private scrollStart:I

.field private snapCheck:Ljava/lang/Runnable;

.field private threshold:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    const/high16 v0, 0x41c80000    # 25.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->FLING_THRESHOLD:I

    .line 22
    const/16 v0, 0x19

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->checkDelay:I

    .line 24
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 43
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 20
    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    .line 26
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 28
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    .line 30
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    .line 32
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    .line 46
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v2, 0x0

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    .line 26
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 28
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    .line 30
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    .line 32
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    .line 46
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v2, 0x0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    .line 26
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 28
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    .line 30
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    .line 32
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    .line 46
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;

    .line 36
    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    .prologue
    .line 14
    sget v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->FLING_THRESHOLD:I

    return v0
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .prologue
    .line 14
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    return v0
.end method

.method static synthetic access$200(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .prologue
    .line 14
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    return v0
.end method

.method static synthetic access$300(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .prologue
    .line 14
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    return v0
.end method

.method static synthetic access$402(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;I)I
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    .param p1, "x1"    # I

    .prologue
    .line 14
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    return p1
.end method

.method static synthetic access$502(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    .param p1, "x1"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    return p1
.end method

.method static synthetic access$600(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)Ljava/lang/Runnable;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .prologue
    .line 14
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$700()I
    .locals 1

    .prologue
    .line 14
    sget v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->checkDelay:I

    return v0
.end method

.method private getParentRow()Landroid/view/View;
    .locals 3

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 135
    .local v0, "ret":Landroid/view/View;
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f08007f

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f080080

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f080081

    if-eq v1, v2, :cond_0

    .line 136
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .end local v0    # "ret":Landroid/view/View;
    check-cast v0, Landroid/view/View;

    .restart local v0    # "ret":Landroid/view/View;
    goto :goto_0

    .line 139
    :cond_0
    return-object v0
.end method

.method private setContentDescription(Z)V
    .locals 9
    .param p1, "setNull"    # Z

    .prologue
    .line 197
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getParentRow()Landroid/view/View;

    move-result-object v6

    .line 198
    .local v6, "parentRow":Landroid/view/View;
    const/4 v7, 0x3

    new-array v2, v7, [I

    fill-array-data v2, :array_0

    .line 200
    .local v2, "carpetArray":[I
    move-object v0, v2

    .local v0, "arr$":[I
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_1

    aget v3, v0, v4

    .line 201
    .local v3, "carpetID":I
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f080084

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 202
    .local v1, "carpet":Landroid/view/View;
    if-eqz p1, :cond_0

    const v7, 0x7f090132

    invoke-static {v7}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {v1, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 200
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 206
    .end local v1    # "carpet":Landroid/view/View;
    .end local v3    # "carpetID":I
    :cond_1
    return-void

    .line 198
    nop

    :array_0
    .array-data 4
        0x7f0800c0
        0x7f0800c1
        0x7f0800c2
    .end array-data
.end method


# virtual methods
.method public clearLast()V
    .locals 1

    .prologue
    .line 153
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .line 154
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 2
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "oldl"    # I
    .param p4, "oldt"    # I

    .prologue
    .line 159
    if-nez p3, :cond_1

    .line 160
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x3

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 172
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onScrollChanged(IIII)V

    .line 174
    return-void

    .line 161
    :cond_1
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    if-ne p3, v0, :cond_0

    .line 162
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 163
    if-ge p1, p3, :cond_0

    .line 164
    const v0, 0x7f08009a

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 71
    const v8, 0x7f080098

    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    div-int/lit8 v7, v8, 0x3

    .line 72
    .local v7, "targetSize":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    int-to-float v9, v7

    div-float/2addr v8, v9

    float-to-int v1, v8

    .line 73
    .local v1, "button":I
    const/4 v8, 0x3

    new-array v3, v8, [I

    fill-array-data v3, :array_0

    .line 75
    .local v3, "carpetIds":[I
    array-length v8, v3

    add-int/lit8 v8, v8, -0x1

    if-ne v1, v8, :cond_0

    .line 76
    const-string v8, "SC"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Off by: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget v10, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    int-to-float v10, v10

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v11

    sub-float/2addr v10, v11

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    int-to-float v8, v8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    sub-float/2addr v8, v9

    const/high16 v9, 0x41a00000    # 20.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v10

    mul-float/2addr v9, v10

    cmpg-float v8, v8, v9

    if-gez v8, :cond_0

    .line 78
    add-int/lit8 v1, v1, 0x1

    .line 82
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_1

    .line 83
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;

    sget v9, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->checkDelay:I

    int-to-long v10, v9

    invoke-virtual {p0, v8, v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 86
    :cond_1
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollX()I

    move-result v8

    iget v9, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    if-eq v8, v9, :cond_2

    iget-boolean v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    if-nez v8, :cond_2

    array-length v8, v3

    if-lt v1, v8, :cond_4

    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    const v9, 0x7fffffff

    if-eq v8, v9, :cond_4

    .line 87
    :cond_2
    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    array-length v9, v3

    if-ge v8, v9, :cond_3

    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    const/4 v9, -0x1

    if-le v8, v9, :cond_3

    .line 88
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getParentRow()Landroid/view/View;

    move-result-object v8

    iget v9, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    aget v9, v3, v9

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/view/View;->setPressed(Z)V

    .line 96
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v8

    .line 125
    :goto_1
    return v8

    .line 90
    :cond_3
    const-string v8, "SC"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Scrolled to: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollX()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const/high16 v8, -0x80000000

    iput v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    .line 92
    const/4 v8, 0x1

    iput-boolean v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z

    .line 93
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    .line 94
    sput-object p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    goto :goto_0

    .line 99
    :cond_4
    const/4 v6, 0x0

    .line 101
    .local v6, "row":Landroid/view/View;
    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    const/high16 v9, -0x80000000

    if-ne v8, v9, :cond_5

    .line 102
    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    .line 106
    :cond_5
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getParentRow()Landroid/view/View;

    move-result-object v6

    .line 108
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v8

    const/4 v9, 0x3

    if-eq v8, v9, :cond_8

    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    if-ne v8, v1, :cond_8

    .line 110
    const-string v8, "SC"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Button: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_7

    .line 112
    const-string v8, "SC"

    const-string v9, "Sending Click!"

    invoke-static {v8, v9}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    aget v8, v3, v1

    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/view/View;->setPressed(Z)V

    .line 114
    aget v8, v3, v1

    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->performClick()Z

    .line 125
    :cond_6
    :goto_2
    const/4 v8, 0x1

    goto :goto_1

    .line 116
    :cond_7
    aget v8, v3, v1

    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Landroid/view/View;->setPressed(Z)V

    goto :goto_2

    .line 118
    :cond_8
    iget v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    const/high16 v9, -0x80000000

    if-eq v8, v9, :cond_6

    .line 119
    move-object v0, v3

    .local v0, "arr$":[I
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_3
    if-ge v4, v5, :cond_9

    aget v2, v0, v4

    .line 120
    .local v2, "carpet":I
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/view/View;->setPressed(Z)V

    .line 119
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 122
    .end local v2    # "carpet":I
    :cond_9
    const v8, 0x7fffffff

    iput v8, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I

    goto :goto_2

    .line 73
    nop

    :array_0
    .array-data 4
        0x7f0800c0
        0x7f0800c1
        0x7f0800c2
    .end array-data
.end method

.method public openScroll()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 189
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    .line 190
    const v0, 0x7f08009a

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollY()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->smoothScrollTo(II)V

    .line 192
    sput-object p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .line 193
    invoke-direct {p0, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->setContentDescription(Z)V

    .line 194
    return-void
.end method

.method public resetLast()Z
    .locals 2

    .prologue
    .line 143
    const/4 v0, 0x0

    .line 144
    .local v0, "ret":Z
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    if-eq v1, p0, :cond_0

    .line 145
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 146
    const/4 v0, 0x1

    .line 147
    const/4 v1, 0x0

    sput-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->last:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    .line 149
    :cond_0
    return v0
.end method

.method public resetScroll()V
    .locals 2

    .prologue
    .line 183
    const v0, 0x7f08009a

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 184
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->smoothScrollTo(II)V

    .line 185
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->setContentDescription(Z)V

    .line 186
    return-void
.end method

.method public setScrollStart(I)V
    .locals 2
    .param p1, "startX"    # I

    .prologue
    .line 177
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    .line 178
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I

    .line 179
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollTo(II)V

    .line 180
    return-void
.end method

.class public Lcom/thetransitapp/droid/widget/PopoverView;
.super Landroid/widget/RelativeLayout;
.source "PopoverView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final PopoverArrowDirectionAny:I = 0xe

.field public static final PopoverArrowDirectionDown:I = 0x2

.field public static final PopoverArrowDirectionLeft:I = 0x4

.field public static final PopoverArrowDirectionRight:I = 0x8


# instance fields
.field private animationTime:I

.field private contentSizeForViewInPopover:Landroid/graphics/Point;

.field private isAnimating:Z

.field public popoverArrowDownLeftDrawable:I

.field public popoverArrowDownRightDrawable:I

.field public popoverArrowLeftDrawable:I

.field public popoverArrowRightDrawable:I

.field private popoverLayoutRect:Landroid/graphics/Rect;

.field private popoverView:Landroid/widget/RelativeLayout;

.field private possibleRects:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private realContentSize:Landroid/graphics/Point;

.field private superview:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "layoutId"    # I

    .prologue
    const/4 v1, 0x0

    .line 77
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 79
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 80
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "layoutId"    # I

    .prologue
    const/4 v1, 0x0

    .line 83
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 85
    const/4 v0, 0x0

    invoke-static {p1, p3, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 86
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I
    .param p4, "layoutId"    # I

    .prologue
    const/4 v1, 0x0

    .line 89
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 91
    const/4 v0, 0x0

    invoke-static {p1, p4, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I
    .param p4, "popoverView"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x0

    .line 107
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 109
    invoke-direct {p0, p4}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 110
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "popoverView"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x0

    .line 101
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 103
    invoke-direct {p0, p3}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 104
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "popoverView"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x0

    .line 95
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 52
    const v0, 0x7f0200b1

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    .line 54
    const v0, 0x7f0200b2

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    .line 56
    const v0, 0x7f0200b3

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    .line 58
    const v0, 0x7f0200b4

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 72
    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 73
    const/16 v0, 0xc8

    iput v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    .line 97
    invoke-direct {p0, p2}, Lcom/thetransitapp/droid/widget/PopoverView;->initPopoverView(Landroid/view/View;)V

    .line 98
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/PopoverView;Z)V
    .locals 0

    .prologue
    .line 72
    iput-boolean p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/widget/PopoverView;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/widget/PopoverView;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->superview:Landroid/view/ViewGroup;

    return-object v0
.end method

.method private addAvailableRects(Landroid/graphics/Rect;I)V
    .locals 4
    .param p1, "originRect"    # Landroid/graphics/Rect;
    .param p2, "arrowDirections"    # I

    .prologue
    const/16 v3, 0xa

    const/4 v2, 0x6

    .line 254
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    .line 256
    and-int/lit8 v0, p2, 0x6

    if-ne v0, v2, :cond_0

    .line 257
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    .line 258
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;->getRectForArrowDownLeft(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v1

    .line 257
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 261
    :cond_0
    and-int/lit8 v0, p2, 0xa

    if-ne v0, v3, :cond_1

    .line 262
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    .line 263
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;->getRectForArrowDownRight(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v1

    .line 262
    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 266
    :cond_1
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_2

    .line 267
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    const/16 v1, 0x8

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;->getRectForArrowRight(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 270
    :cond_2
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_3

    .line 271
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    const/4 v1, 0x4

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;->getRectForArrowLeft(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 273
    :cond_3
    return-void
.end method

.method private addPopoverInRect(Landroid/graphics/Rect;)V
    .locals 3
    .param p1, "insertRect"    # Landroid/graphics/Rect;

    .prologue
    .line 121
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 122
    .local v0, "insertParams":Landroid/widget/RelativeLayout$LayoutParams;
    iget v1, p1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 123
    iget v1, p1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 125
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v1, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    return-void
.end method

.method private getBestRect()Ljava/lang/Integer;
    .locals 8

    .prologue
    .line 276
    const/4 v1, 0x0

    .line 278
    .local v1, "best":Ljava/lang/Integer;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-lt v4, v5, :cond_1

    move-object v0, v1

    .line 295
    :cond_0
    return-object v0

    .line 279
    :cond_1
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 281
    .local v0, "arrowDir":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    and-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_2

    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    const/16 v6, 0x19

    if-gt v5, v6, :cond_0

    .line 285
    :cond_2
    if-nez v1, :cond_4

    .line 286
    move-object v1, v0

    .line 278
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 288
    :cond_4
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    .line 289
    .local v2, "bestRect":Landroid/graphics/Rect;
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    .line 290
    .local v3, "checkRect":Landroid/graphics/Rect;
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v6

    mul-int/2addr v5, v6

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v7

    mul-int/2addr v6, v7

    if-ge v5, v6, :cond_3

    .line 291
    move-object v1, v0

    goto :goto_1
.end method

.method public static getFrameForView(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 7
    .param p0, "v"    # Landroid/view/View;

    .prologue
    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 61
    const/4 v1, 0x2

    new-array v0, v1, [I

    .line 62
    .local v0, "location":[I
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 64
    new-instance v1, Landroid/graphics/Rect;

    aget v2, v0, v4

    aget v3, v0, v6

    aget v4, v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v4, v5

    aget v5, v0, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method private getRectForArrowDownLeft(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 11
    .param p1, "originRect"    # Landroid/graphics/Rect;

    .prologue
    .line 129
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v6

    .line 130
    .local v6, "xAvailable":I
    iget v8, p1, Landroid/graphics/Rect;->top:I

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    sub-int v7, v8, v9

    .line 132
    .local v7, "yAvailable":I
    if-gez v6, :cond_0

    .line 133
    const/4 v6, 0x0

    .line 134
    :cond_0
    if-gez v7, :cond_1

    .line 135
    const/4 v7, 0x0

    .line 137
    :cond_1
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 138
    .local v5, "padding":Landroid/graphics/Rect;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    iget v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 139
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f080029

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 141
    .local v0, "arrowPosition":I
    move v1, v6

    .line 142
    .local v1, "finalX":I
    move v2, v7

    .line 144
    .local v2, "finalY":I
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    if-lez v8, :cond_2

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v8, v9

    if-ge v8, v1, :cond_2

    .line 145
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->right:I

    add-int v1, v8, v9

    .line 146
    :cond_2
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    if-lez v8, :cond_3

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v9

    if-ge v8, v2, :cond_3

    .line 147
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    add-int v2, v8, v9

    .line 149
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result v8

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v9

    sub-int v3, v8, v0

    .line 150
    .local v3, "originX":I
    iget v8, p1, Landroid/graphics/Rect;->top:I

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    sub-int/2addr v8, v2

    add-int/lit8 v4, v8, -0x5

    .line 152
    .local v4, "originY":I
    iget v8, v5, Landroid/graphics/Rect;->left:I

    neg-int v8, v8

    if-ge v3, v8, :cond_5

    .line 153
    iget v8, v5, Landroid/graphics/Rect;->left:I

    neg-int v3, v8

    .line 157
    :cond_4
    :goto_0
    new-instance v8, Landroid/graphics/Rect;

    add-int v9, v3, v1

    add-int v10, v4, v2

    invoke-direct {v8, v3, v4, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v8

    .line 154
    :cond_5
    add-int v8, v3, v1

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    if-le v8, v9, :cond_4

    .line 155
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v8

    sub-int v3, v8, v1

    goto :goto_0
.end method

.method private getRectForArrowDownRight(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 11
    .param p1, "originRect"    # Landroid/graphics/Rect;

    .prologue
    .line 161
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v6

    .line 162
    .local v6, "xAvailable":I
    if-gez v6, :cond_0

    .line 163
    const/4 v6, 0x0

    .line 164
    :cond_0
    iget v8, p1, Landroid/graphics/Rect;->top:I

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    sub-int v7, v8, v9

    .line 165
    .local v7, "yAvailable":I
    if-gez v7, :cond_1

    .line 166
    const/4 v7, 0x0

    .line 168
    :cond_1
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 169
    .local v5, "padding":Landroid/graphics/Rect;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    iget v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 170
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f080029

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 172
    .local v0, "arrowPosition":I
    move v1, v6

    .line 173
    .local v1, "finalX":I
    move v2, v7

    .line 175
    .local v2, "finalY":I
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    if-lez v8, :cond_2

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v8, v9

    if-ge v8, v1, :cond_2

    .line 176
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->right:I

    add-int v1, v8, v9

    .line 177
    :cond_2
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    if-lez v8, :cond_3

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v9

    if-ge v8, v2, :cond_3

    .line 178
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    add-int v2, v8, v9

    .line 180
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result v8

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v9

    sub-int v9, v1, v0

    sub-int v3, v8, v9

    .line 181
    .local v3, "originX":I
    iget v8, p1, Landroid/graphics/Rect;->top:I

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    sub-int/2addr v8, v2

    add-int/lit8 v4, v8, -0x5

    .line 183
    .local v4, "originY":I
    if-gez v3, :cond_5

    .line 184
    const/4 v3, 0x0

    .line 188
    :cond_4
    :goto_0
    new-instance v8, Landroid/graphics/Rect;

    add-int v9, v3, v1

    add-int v10, v4, v2

    invoke-direct {v8, v3, v4, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v8

    .line 185
    :cond_5
    add-int v8, v3, v1

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    if-le v8, v9, :cond_4

    .line 186
    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v8

    sub-int/2addr v8, v1

    sub-int v3, v8, v0

    goto :goto_0
.end method

.method private getRectForArrowLeft(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 10
    .param p1, "originRect"    # Landroid/graphics/Rect;

    .prologue
    .line 223
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    iget v8, p1, Landroid/graphics/Rect;->right:I

    iget-object v9, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v9

    sub-int v5, v7, v8

    .line 224
    .local v5, "xAvailable":I
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v6

    .line 226
    .local v6, "yAvailable":I
    if-gez v5, :cond_0

    .line 227
    const/4 v5, 0x0

    .line 228
    :cond_0
    if-gez v6, :cond_1

    .line 229
    const/4 v6, 0x0

    .line 231
    :cond_1
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 232
    .local v4, "padding":Landroid/graphics/Rect;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 234
    move v0, v5

    .line 235
    .local v0, "finalX":I
    move v1, v6

    .line 237
    .local v1, "finalY":I
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    if-lez v7, :cond_2

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v8

    if-ge v7, v0, :cond_2

    .line 238
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    add-int v0, v7, v8

    .line 239
    :cond_2
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    if-lez v7, :cond_3

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v8

    if-ge v7, v1, :cond_3

    .line 240
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    add-int v1, v7, v8

    .line 242
    :cond_3
    iget v7, p1, Landroid/graphics/Rect;->right:I

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    add-int/lit8 v2, v7, 0x5

    .line 243
    .local v2, "originX":I
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result v7

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v8

    div-int/lit8 v8, v1, 0x2

    sub-int v3, v7, v8

    .line 245
    .local v3, "originY":I
    if-gez v3, :cond_5

    .line 246
    const/4 v3, 0x0

    .line 250
    :cond_4
    :goto_0
    new-instance v7, Landroid/graphics/Rect;

    add-int v8, v2, v0

    add-int v9, v3, v1

    invoke-direct {v7, v2, v3, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v7

    .line 247
    :cond_5
    add-int v7, v3, v1

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    if-le v7, v8, :cond_4

    .line 248
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    sub-int v3, v7, v1

    goto :goto_0
.end method

.method private getRectForArrowRight(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 10
    .param p1, "originRect"    # Landroid/graphics/Rect;

    .prologue
    .line 192
    iget v7, p1, Landroid/graphics/Rect;->left:I

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    sub-int v5, v7, v8

    .line 193
    .local v5, "xAvailable":I
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v6

    .line 195
    .local v6, "yAvailable":I
    if-gez v5, :cond_0

    .line 196
    const/4 v5, 0x0

    .line 197
    :cond_0
    if-gez v6, :cond_1

    .line 198
    const/4 v6, 0x0

    .line 200
    :cond_1
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 201
    .local v4, "padding":Landroid/graphics/Rect;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 203
    move v0, v5

    .line 204
    .local v0, "finalX":I
    move v1, v6

    .line 206
    .local v1, "finalY":I
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    if-lez v7, :cond_2

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v8

    if-ge v7, v0, :cond_2

    .line 207
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v8, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->right:I

    add-int v0, v7, v8

    .line 208
    :cond_2
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    if-lez v7, :cond_3

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v8

    if-ge v7, v1, :cond_3

    .line 209
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v7, v7, Landroid/graphics/Point;->y:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    add-int v1, v7, v8

    .line 211
    :cond_3
    iget v7, p1, Landroid/graphics/Rect;->left:I

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    add-int/lit8 v7, v7, -0x5

    sub-int v2, v7, v0

    .line 212
    .local v2, "originX":I
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result v7

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v8

    div-int/lit8 v8, v1, 0x2

    sub-int v3, v7, v8

    .line 214
    .local v3, "originY":I
    if-gez v3, :cond_5

    .line 215
    const/4 v3, 0x0

    .line 219
    :cond_4
    :goto_0
    new-instance v7, Landroid/graphics/Rect;

    add-int v8, v2, v0

    add-int v9, v3, v1

    invoke-direct {v7, v2, v3, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v7

    .line 216
    :cond_5
    add-int v7, v3, v1

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    if-le v7, v8, :cond_4

    .line 217
    iget-object v7, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    sub-int v3, v7, v1

    goto :goto_0
.end method

.method private initPopoverView(Landroid/view/View;)V
    .locals 3
    .param p1, "viewToEnclose"    # Landroid/view/View;

    .prologue
    const/4 v2, -0x1

    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->setBackgroundColor(I)V

    .line 114
    invoke-virtual {p0, p0}, Lcom/thetransitapp/droid/widget/PopoverView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 116
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    .line 117
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    .line 118
    return-void
.end method


# virtual methods
.method public dissmissPopover(Z)V
    .locals 3
    .param p1, "animated"    # Z

    .prologue
    .line 407
    if-nez p1, :cond_1

    .line 408
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 409
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/PopoverView;->removeAllViews()V

    .line 410
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->superview:Landroid/view/ViewGroup;

    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 438
    :cond_0
    :goto_0
    return-void

    .line 411
    :cond_1
    iget-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    if-nez v1, :cond_0

    .line 412
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 413
    .local v0, "animation":Landroid/view/animation/AlphaAnimation;
    iget v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 414
    new-instance v1, Lcom/thetransitapp/droid/widget/PopoverView$2;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/widget/PopoverView$2;-><init>(Lcom/thetransitapp/droid/widget/PopoverView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 435
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 436
    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public getContentSizeForViewInPopover()Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    return-object v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 442
    iget-boolean v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    if-nez v0, :cond_0

    if-ne p1, p0, :cond_0

    .line 443
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/PopoverView;->dissmissPopover(Z)V

    .line 446
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setContentSizeForViewInPopover(Landroid/graphics/Point;)V
    .locals 4
    .param p1, "contentSizeForViewInPopover"    # Landroid/graphics/Point;

    .prologue
    .line 303
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->contentSizeForViewInPopover:Landroid/graphics/Point;

    .line 305
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, p1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    .line 306
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getPaddingLeft()I

    move-result v2

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Point;->x:I

    .line 307
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView;->realContentSize:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->y:I

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Point;->y:I

    .line 308
    return-void
.end method

.method public setPopoverArrowDownLeftDrawable(I)V
    .locals 0
    .param p1, "popoverArrowDownLeftDrawable"    # I

    .prologue
    .line 51
    iput p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    return-void
.end method

.method public setPopoverArrowDownRightDrawable(I)V
    .locals 0
    .param p1, "popoverArrowDownRightDrawable"    # I

    .prologue
    .line 53
    iput p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    return-void
.end method

.method public setPopoverArrowLeftDrawable(I)V
    .locals 0
    .param p1, "popoverArrowLeftDrawable"    # I

    .prologue
    .line 55
    iput p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    return-void
.end method

.method public setPopoverArrowRightDrawable(I)V
    .locals 0
    .param p1, "popoverArrowRightDrawable"    # I

    .prologue
    .line 57
    iput p1, p0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    return-void
.end method

.method public showPopoverFromRectInViewGroup(Landroid/view/ViewGroup;Landroid/graphics/Rect;IZ)V
    .locals 24
    .param p1, "group"    # Landroid/view/ViewGroup;
    .param p2, "originRect"    # Landroid/graphics/Rect;
    .param p3, "arrowDirections"    # I
    .param p4, "animated"    # Z

    .prologue
    .line 311
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/thetransitapp/droid/widget/PopoverView;->superview:Landroid/view/ViewGroup;

    .line 313
    new-instance v22, Landroid/view/ViewGroup$LayoutParams;

    .line 314
    const/4 v6, -0x1

    const/4 v7, -0x1

    .line 313
    move-object/from16 v0, v22

    invoke-direct {v0, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 315
    .local v22, "insertParams":Landroid/view/ViewGroup$LayoutParams;
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, v22

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->superview:Landroid/view/ViewGroup;

    invoke-static {v6}, Lcom/thetransitapp/droid/widget/PopoverView;->getFrameForView(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v6

    move-object/from16 v0, p0

    iput-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverLayoutRect:Landroid/graphics/Rect;

    .line 319
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/PopoverView;->addAvailableRects(Landroid/graphics/Rect;I)V

    .line 320
    invoke-direct/range {p0 .. p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getBestRect()Ljava/lang/Integer;

    move-result-object v19

    .line 322
    .local v19, "best":Ljava/lang/Integer;
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v6

    packed-switch v6, :pswitch_data_0

    .line 340
    :goto_0
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->possibleRects:Landroid/util/SparseArray;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Landroid/graphics/Rect;

    .line 341
    .local v20, "bestRect":Landroid/graphics/Rect;
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/widget/PopoverView;->addPopoverInRect(Landroid/graphics/Rect;)V

    .line 343
    if-eqz p4, :cond_0

    move-object/from16 v0, p0

    iget-boolean v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    if-nez v6, :cond_0

    .line 344
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/widget/PopoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f080029

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    .line 347
    .local v9, "arrowPosition":F
    const v4, 0x3d4ccccd    # 0.05f

    .line 348
    .local v4, "from":F
    const/high16 v5, 0x3f800000    # 1.0f

    .line 350
    .local v5, "to":F
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v6

    packed-switch v6, :pswitch_data_1

    .line 371
    :pswitch_1
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    invoke-direct {v3, v4, v5, v4, v5}, Landroid/view/animation/ScaleAnimation;-><init>(FFFF)V

    .line 375
    .local v3, "scale":Landroid/view/animation/ScaleAnimation;
    :goto_1
    new-instance v21, Landroid/view/animation/AlphaAnimation;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move-object/from16 v0, v21

    invoke-direct {v0, v6, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 376
    .local v21, "fade":Landroid/view/animation/AlphaAnimation;
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    move-object/from16 v0, v21

    invoke-virtual {v0, v6}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 378
    new-instance v6, Landroid/view/animation/OvershootInterpolator;

    const/high16 v7, 0x40000000    # 2.0f

    invoke-direct {v6, v7}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v3, v6}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 380
    new-instance v23, Landroid/view/animation/AnimationSet;

    const/4 v6, 0x0

    move-object/from16 v0, v23

    invoke-direct {v0, v6}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 381
    .local v23, "set":Landroid/view/animation/AnimationSet;
    move-object/from16 v0, v23

    invoke-virtual {v0, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 382
    move-object/from16 v0, v23

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 383
    move-object/from16 v0, p0

    iget v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->animationTime:I

    int-to-long v6, v6

    move-object/from16 v0, v23

    invoke-virtual {v0, v6, v7}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 384
    new-instance v6, Lcom/thetransitapp/droid/widget/PopoverView$1;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lcom/thetransitapp/droid/widget/PopoverView$1;-><init>(Lcom/thetransitapp/droid/widget/PopoverView;)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v6}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 401
    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput-boolean v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->isAnimating:Z

    .line 402
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    move-object/from16 v0, v23

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 404
    .end local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    .end local v4    # "from":F
    .end local v5    # "to":F
    .end local v9    # "arrowPosition":F
    .end local v21    # "fade":Landroid/view/animation/AlphaAnimation;
    .end local v23    # "set":Landroid/view/animation/AnimationSet;
    :cond_0
    return-void

    .line 324
    .end local v20    # "bestRect":Landroid/graphics/Rect;
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget v7, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownLeftDrawable:I

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 328
    :pswitch_3
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget v7, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowDownRightDrawable:I

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 332
    :pswitch_4
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget v7, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowRightDrawable:I

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 336
    :pswitch_5
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget v7, v0, Lcom/thetransitapp/droid/widget/PopoverView;->popoverArrowLeftDrawable:I

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 352
    .restart local v4    # "from":F
    .restart local v5    # "to":F
    .restart local v9    # "arrowPosition":F
    .restart local v20    # "bestRect":Landroid/graphics/Rect;
    :pswitch_6
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    const/4 v8, 0x0

    .line 353
    const/4 v10, 0x1

    const/high16 v11, 0x3f800000    # 1.0f

    move v6, v4

    move v7, v5

    .line 352
    invoke-direct/range {v3 .. v11}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 354
    .restart local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    goto/16 :goto_1

    .line 357
    .end local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    :pswitch_7
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    const/4 v15, 0x0

    .line 358
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    sub-float v16, v6, v9

    const/16 v17, 0x1

    const/high16 v18, 0x3f800000    # 1.0f

    move-object v10, v3

    move v11, v4

    move v12, v5

    move v13, v4

    move v14, v5

    .line 357
    invoke-direct/range {v10 .. v18}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 359
    .restart local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    goto/16 :goto_1

    .line 362
    .end local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    :pswitch_8
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    const/4 v15, 0x1

    const/high16 v16, 0x3f800000    # 1.0f

    .line 363
    const/16 v17, 0x1

    const/high16 v18, 0x3f000000    # 0.5f

    move-object v10, v3

    move v11, v4

    move v12, v5

    move v13, v5

    move v14, v5

    .line 362
    invoke-direct/range {v10 .. v18}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 364
    .restart local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    goto/16 :goto_1

    .line 367
    .end local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    :pswitch_9
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    const/4 v15, 0x0

    const/high16 v16, 0x3f000000    # 0.5f

    move-object v10, v3

    move v11, v4

    move v12, v5

    move v13, v5

    move v14, v5

    invoke-direct/range {v10 .. v16}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 368
    .restart local v3    # "scale":Landroid/view/animation/ScaleAnimation;
    goto/16 :goto_1

    .line 322
    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_5
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 350
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_9
        :pswitch_1
        :pswitch_6
        :pswitch_1
        :pswitch_8
        :pswitch_1
        :pswitch_7
    .end packed-switch
.end method

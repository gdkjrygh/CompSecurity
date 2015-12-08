.class public Lorg/chromium/ui/DropdownPopupWindow;
.super Landroid/widget/ListPopupWindow;
.source "DropdownPopupWindow.java"


# instance fields
.field mAdapter:Landroid/widget/ListAdapter;

.field private mAnchorHeight:F

.field private final mAnchorView:Landroid/view/View;

.field private mAnchorWidth:F

.field private mAnchorX:F

.field private mAnchorY:F

.field private final mContext:Landroid/content/Context;

.field private mLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

.field private mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

.field private final mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/base/ViewAndroidDelegate;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "viewAndroidDelegate"    # Lorg/chromium/ui/base/ViewAndroidDelegate;

    .prologue
    .line 42
    const/4 v0, 0x0

    const/4 v1, 0x0

    sget v2, Lorg/chromium/ui/R$style;->DropdownPopupWindow:I

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 43
    iput-object p1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mContext:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lorg/chromium/ui/DropdownPopupWindow;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    .line 46
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    invoke-interface {v0}, Lorg/chromium/ui/base/ViewAndroidDelegate;->acquireAnchorView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    .line 47
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    sget v1, Lorg/chromium/ui/R$id;->dropdown_popup_window:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 48
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 50
    new-instance v0, Lorg/chromium/ui/DropdownPopupWindow$1;

    invoke-direct {v0, p0}, Lorg/chromium/ui/DropdownPopupWindow$1;-><init>(Lorg/chromium/ui/DropdownPopupWindow;)V

    iput-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    .line 57
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    iget-object v1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 59
    new-instance v0, Lorg/chromium/ui/DropdownPopupWindow$2;

    invoke-direct {v0, p0}, Lorg/chromium/ui/DropdownPopupWindow$2;-><init>(Lorg/chromium/ui/DropdownPopupWindow;)V

    invoke-super {p0, v0}, Landroid/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 71
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lorg/chromium/ui/DropdownPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 72
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/ui/DropdownPopupWindow;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/DropdownPopupWindow;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/ui/DropdownPopupWindow;)Landroid/widget/PopupWindow$OnDismissListener;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/DropdownPopupWindow;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    return-object v0
.end method

.method static synthetic access$200(Lorg/chromium/ui/DropdownPopupWindow;)Landroid/view/View$OnLayoutChangeListener;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/DropdownPopupWindow;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    return-object v0
.end method

.method static synthetic access$300(Lorg/chromium/ui/DropdownPopupWindow;)Lorg/chromium/ui/base/ViewAndroidDelegate;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/DropdownPopupWindow;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    return-object v0
.end method

.method private measureContentWidth()I
    .locals 9

    .prologue
    const/4 v8, -0x2

    const/4 v6, 0x0

    .line 132
    const/4 v3, 0x0

    .line 133
    .local v3, "maxWidth":I
    const/4 v2, 0x0

    .line 134
    .local v2, "itemView":Landroid/view/View;
    iget-object v7, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    if-nez v7, :cond_0

    .line 147
    :goto_0
    return v6

    .line 136
    :cond_0
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 137
    .local v5, "widthMeasureSpec":I
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 138
    .local v0, "heightMeasureSpec":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    iget-object v6, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v6}, Landroid/widget/ListAdapter;->getCount()I

    move-result v6

    if-ge v1, v6, :cond_1

    .line 139
    iget-object v6, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    const/4 v7, 0x0

    invoke-interface {v6, v1, v2, v7}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 140
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 143
    .local v4, "params":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 144
    invoke-virtual {v2, v5, v0}, Landroid/view/View;->measure(II)V

    .line 145
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 138
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .end local v4    # "params":Landroid/widget/LinearLayout$LayoutParams;
    :cond_1
    move v6, v3

    .line 147
    goto :goto_0
.end method


# virtual methods
.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 0
    .param p1, "adapter"    # Landroid/widget/ListAdapter;

    .prologue
    .line 95
    iput-object p1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    .line 96
    invoke-super {p0, p1}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 97
    return-void
.end method

.method public setAnchorRect(FFFF)V
    .locals 6
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "width"    # F
    .param p4, "height"    # F

    .prologue
    .line 83
    iput p3, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorWidth:F

    .line 84
    iput p4, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorHeight:F

    .line 85
    iput p1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorX:F

    .line 86
    iput p2, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorY:F

    .line 87
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    iget-object v1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    iget v2, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorX:F

    iget v3, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorY:F

    iget v4, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorWidth:F

    iget v5, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorHeight:F

    invoke-interface/range {v0 .. v5}, Lorg/chromium/ui/base/ViewAndroidDelegate;->setAnchorViewPosition(Landroid/view/View;FFFF)V

    .line 91
    :cond_0
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0
    .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;

    .prologue
    .line 124
    iput-object p1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    .line 125
    return-void
.end method

.method public show()V
    .locals 9

    .prologue
    .line 102
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/chromium/ui/DropdownPopupWindow;->setInputMethodMode(I)V

    .line 103
    invoke-direct {p0}, Lorg/chromium/ui/DropdownPopupWindow;->measureContentWidth()I

    move-result v6

    .line 104
    .local v6, "contentWidth":I
    int-to-float v0, v6

    iget-object v1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float v7, v0, v1

    .line 106
    .local v7, "contentWidthInDip":F
    iget v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorWidth:F

    cmpl-float v0, v7, v0

    if-lez v0, :cond_1

    .line 107
    invoke-virtual {p0, v6}, Lorg/chromium/ui/DropdownPopupWindow;->setContentWidth(I)V

    .line 108
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 109
    .local v8, "displayFrame":Landroid/graphics/Rect;
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 110
    invoke-virtual {p0}, Lorg/chromium/ui/DropdownPopupWindow;->getWidth()I

    move-result v0

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 111
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/chromium/ui/DropdownPopupWindow;->setWidth(I)V

    .line 116
    .end local v8    # "displayFrame":Landroid/graphics/Rect;
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/chromium/ui/DropdownPopupWindow;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    iget-object v1, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorView:Landroid/view/View;

    iget v2, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorX:F

    iget v3, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorY:F

    iget v4, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorWidth:F

    iget v5, p0, Lorg/chromium/ui/DropdownPopupWindow;->mAnchorHeight:F

    invoke-interface/range {v0 .. v5}, Lorg/chromium/ui/base/ViewAndroidDelegate;->setAnchorViewPosition(Landroid/view/View;FFFF)V

    .line 118
    invoke-super {p0}, Landroid/widget/ListPopupWindow;->show()V

    .line 119
    invoke-virtual {p0}, Lorg/chromium/ui/DropdownPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 120
    return-void

    .line 114
    :cond_1
    const/4 v0, -0x2

    invoke-virtual {p0, v0}, Lorg/chromium/ui/DropdownPopupWindow;->setWidth(I)V

    goto :goto_0
.end method

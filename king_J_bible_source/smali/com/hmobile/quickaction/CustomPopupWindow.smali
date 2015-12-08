.class public Lcom/hmobile/quickaction/CustomPopupWindow;
.super Ljava/lang/Object;
.source "CustomPopupWindow.java"


# instance fields
.field protected final anchor:Landroid/view/View;

.field private background:Landroid/graphics/drawable/Drawable;

.field private root:Landroid/view/View;

.field protected final window:Landroid/widget/PopupWindow;

.field protected final windowManager:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->background:Landroid/graphics/drawable/Drawable;

    .line 40
    iput-object p1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    .line 41
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    .line 45
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/hmobile/quickaction/CustomPopupWindow$1;

    invoke-direct {v1, p0}, Lcom/hmobile/quickaction/CustomPopupWindow$1;-><init>(Lcom/hmobile/quickaction/CustomPopupWindow;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 58
    const-string v1, "window"

    .line 57
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->windowManager:Landroid/view/WindowManager;

    .line 60
    invoke-virtual {p0}, Lcom/hmobile/quickaction/CustomPopupWindow;->onCreate()V

    .line 61
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 215
    return-void
.end method

.method protected onCreate()V
    .locals 0

    .prologue
    .line 68
    return-void
.end method

.method protected onShow()V
    .locals 0

    .prologue
    .line 74
    return-void
.end method

.method protected preShow()V
    .locals 4

    .prologue
    const/4 v3, -0x2

    const/4 v2, 0x1

    .line 77
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    const-string v1, "setContentView was not called with a view to display."

    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/quickaction/CustomPopupWindow;->onShow()V

    .line 84
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->background:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 85
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 95
    :goto_0
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 96
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 97
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 98
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 99
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 101
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 102
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->background:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "background"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 105
    iput-object p1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->background:Landroid/graphics/drawable/Drawable;

    .line 106
    return-void
.end method

.method public setContentView(I)V
    .locals 3
    .param p1, "layoutResID"    # I

    .prologue
    .line 126
    iget-object v1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 127
    const-string v2, "layout_inflater"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 126
    check-cast v0, Landroid/view/LayoutInflater;

    .line 129
    .local v0, "inflator":Landroid/view/LayoutInflater;
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/hmobile/quickaction/CustomPopupWindow;->setContentView(Landroid/view/View;)V

    .line 130
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1
    .param p1, "root"    # Landroid/view/View;

    .prologue
    .line 115
    iput-object p1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    .line 117
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 118
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;

    .prologue
    .line 138
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 139
    return-void
.end method

.method public showDropDown()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 145
    invoke-virtual {p0, v0, v0}, Lcom/hmobile/quickaction/CustomPopupWindow;->showDropDown(II)V

    .line 146
    return-void
.end method

.method public showDropDown(II)V
    .locals 2
    .param p1, "xOffset"    # I
    .param p2, "yOffset"    # I

    .prologue
    .line 157
    invoke-virtual {p0}, Lcom/hmobile/quickaction/CustomPopupWindow;->preShow()V

    .line 159
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    const v1, 0x7f0a002a

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 161
    iget-object v0, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 162
    return-void
.end method

.method public showLikeQuickAction()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 168
    invoke-virtual {p0, v0, v0}, Lcom/hmobile/quickaction/CustomPopupWindow;->showLikeQuickAction(II)V

    .line 169
    return-void
.end method

.method public showLikeQuickAction(II)V
    .locals 12
    .param p1, "xOffset"    # I
    .param p2, "yOffset"    # I

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/hmobile/quickaction/CustomPopupWindow;->preShow()V

    .line 182
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    const v8, 0x7f0a0030

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 184
    const/4 v7, 0x2

    new-array v1, v7, [I

    .line 185
    .local v1, "location":[I
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    invoke-virtual {v7, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 187
    new-instance v0, Landroid/graphics/Rect;

    const/4 v7, 0x0

    aget v7, v1, v7

    const/4 v8, 0x1

    aget v8, v1, v8

    const/4 v9, 0x0

    aget v9, v1, v9

    .line 188
    iget-object v10, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v10

    add-int/2addr v9, v10

    const/4 v10, 0x1

    aget v10, v1, v10

    iget-object v11, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    move-result v11

    add-int/2addr v10, v11

    .line 187
    invoke-direct {v0, v7, v8, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 190
    .local v0, "anchorRect":Landroid/graphics/Rect;
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    .line 191
    const/4 v10, -0x2

    invoke-direct {v8, v9, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 190
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    const/4 v8, -0x2

    const/4 v9, -0x2

    invoke-virtual {v7, v8, v9}, Landroid/view/View;->measure(II)V

    .line 194
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 195
    .local v3, "rootWidth":I
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->root:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 197
    .local v2, "rootHeight":I
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->windowManager:Landroid/view/WindowManager;

    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v4

    .line 200
    .local v4, "screenWidth":I
    sub-int v7, v4, v3

    div-int/lit8 v7, v7, 0x2

    add-int v5, v7, p1

    .line 201
    .local v5, "xPos":I
    iget v7, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v2

    add-int v6, v7, p2

    .line 204
    .local v6, "yPos":I
    iget v7, v0, Landroid/graphics/Rect;->top:I

    if-le v2, v7, :cond_0

    .line 205
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    add-int v6, v7, p2

    .line 207
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    const v8, 0x7f0a002b

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 210
    :cond_0
    iget-object v7, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->window:Landroid/widget/PopupWindow;

    iget-object v8, p0, Lcom/hmobile/quickaction/CustomPopupWindow;->anchor:Landroid/view/View;

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9, v5, v6}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 211
    return-void
.end method

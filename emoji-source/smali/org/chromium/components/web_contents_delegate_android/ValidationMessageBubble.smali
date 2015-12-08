.class Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;
.super Ljava/lang/Object;
.source "ValidationMessageBubble.java"


# instance fields
.field private mPopup:Landroid/widget/PopupWindow;


# direct methods
.method private constructor <init>(Lorg/chromium/content/browser/ContentViewCore;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "anchor"    # Landroid/graphics/RectF;
    .param p3, "mainText"    # Ljava/lang/String;
    .param p4, "subText"    # Ljava/lang/String;

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lorg/chromium/content/R$layout;->validation_message_bubble:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 57
    .local v1, "root":Landroid/view/ViewGroup;
    new-instance v2, Landroid/widget/PopupWindow;

    invoke-direct {v2, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    .line 58
    invoke-static {v1, p3, p4}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->updateTextViews(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->measure(Lorg/chromium/content/browser/RenderCoordinates;)V

    .line 60
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-direct {p0}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->getAnchorOffset()F

    move-result v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    iget v3, p2, Landroid/graphics/RectF;->bottom:F

    float-to-int v3, v3

    invoke-direct {p0, p1, v2, v3}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->adjustWindowPosition(Lorg/chromium/content/browser/ContentViewCore;II)Landroid/graphics/Point;

    move-result-object v0

    .line 62
    .local v0, "origin":Landroid/graphics/Point;
    iget-object v2, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v3

    const/4 v4, 0x0

    iget v5, v0, Landroid/graphics/Point;->x:I

    iget v6, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 64
    return-void
.end method

.method private adjustWindowPosition(Lorg/chromium/content/browser/ContentViewCore;II)Landroid/graphics/Point;
    .locals 7
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "x"    # I
    .param p3, "y"    # I

    .prologue
    .line 146
    invoke-virtual {p1}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v0

    .line 147
    .local v0, "coordinates":Lorg/chromium/content/browser/RenderCoordinates;
    invoke-virtual {v0}, Lorg/chromium/content/browser/RenderCoordinates;->getLastFrameViewportWidthPixInt()I

    move-result v3

    .line 148
    .local v3, "viewWidth":I
    invoke-static {p1}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->getWebViewOffsetYPixInScreen(Lorg/chromium/content/browser/ContentViewCore;)F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v0}, Lorg/chromium/content/browser/RenderCoordinates;->getLastFrameViewportHeightPixInt()I

    move-result v6

    add-int v2, v5, v6

    .line 150
    .local v2, "viewBottom":I
    iget-object v5, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 151
    .local v4, "width":I
    iget-object v5, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 152
    .local v1, "height":I
    if-gez p2, :cond_2

    .line 153
    const/4 p2, 0x0

    .line 157
    :cond_0
    :goto_0
    add-int v5, p3, v1

    if-le v5, v2, :cond_1

    .line 158
    sub-int p3, v2, v1

    .line 160
    :cond_1
    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5, p2, p3}, Landroid/graphics/Point;-><init>(II)V

    return-object v5

    .line 154
    :cond_2
    add-int v5, p2, v4

    if-le v5, v3, :cond_0

    .line 155
    sub-int p2, v3, v4

    goto :goto_0
.end method

.method private close()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 71
    :goto_0
    return-void

    .line 69
    :cond_0
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    goto :goto_0
.end method

.method private static createAndShow(Lorg/chromium/content/browser/ContentViewCore;IIIILjava/lang/String;Ljava/lang/String;)Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;
    .locals 2
    .param p0, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p1, "anchorX"    # I
    .param p2, "anchorY"    # I
    .param p3, "anchorWidth"    # I
    .param p4, "anchorHeight"    # I
    .param p5, "mainText"    # Ljava/lang/String;
    .param p6, "subText"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 48
    invoke-static {p0, p1, p2, p3, p4}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->makePixRectInScreen(Lorg/chromium/content/browser/ContentViewCore;IIII)Landroid/graphics/RectF;

    move-result-object v0

    .line 50
    .local v0, "anchorPixInScreen":Landroid/graphics/RectF;
    new-instance v1, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;

    invoke-direct {v1, p0, v0, p5, p6}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;-><init>(Lorg/chromium/content/browser/ContentViewCore;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private getAnchorOffset()F
    .locals 5

    .prologue
    .line 135
    iget-object v3, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    .line 136
    .local v1, "root":Landroid/view/View;
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 137
    .local v2, "width":I
    sget v3, Lorg/chromium/content/R$id;->arrow_image:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 138
    .local v0, "arrowWidth":I
    invoke-static {v1}, Lorg/chromium/base/ApiCompatibilityUtils;->isLayoutRtl(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    mul-int/lit8 v3, v2, 0x3

    div-int/lit8 v3, v3, 0x4

    div-int/lit8 v4, v0, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    :goto_0
    return v3

    :cond_0
    div-int/lit8 v3, v2, 0x4

    div-int/lit8 v4, v0, 0x2

    add-int/2addr v3, v4

    int-to-float v3, v3

    goto :goto_0
.end method

.method private static getWebViewOffsetYPixInScreen(Lorg/chromium/content/browser/ContentViewCore;)F
    .locals 3
    .param p0, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 105
    const/4 v1, 0x2

    new-array v0, v1, [I

    .line 106
    .local v0, "location":[I
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 107
    const/4 v1, 0x1

    aget v1, v0, v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content/browser/RenderCoordinates;->getContentOffsetYPix()F

    move-result v2

    add-float/2addr v1, v2

    return v1
.end method

.method private static makePixRectInScreen(Lorg/chromium/content/browser/ContentViewCore;IIII)Landroid/graphics/RectF;
    .locals 7
    .param p0, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p1, "anchorX"    # I
    .param p2, "anchorY"    # I
    .param p3, "anchorWidth"    # I
    .param p4, "anchorHeight"    # I

    .prologue
    .line 95
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v0

    .line 96
    .local v0, "coordinates":Lorg/chromium/content/browser/RenderCoordinates;
    invoke-static {p0}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->getWebViewOffsetYPixInScreen(Lorg/chromium/content/browser/ContentViewCore;)F

    move-result v1

    .line 97
    .local v1, "yOffset":F
    new-instance v2, Landroid/graphics/RectF;

    int-to-float v3, p1

    invoke-virtual {v0, v3}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v3

    int-to-float v4, p2

    invoke-virtual {v0, v4}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v4

    add-float/2addr v4, v1

    add-int v5, p1, p3

    int-to-float v5, v5

    invoke-virtual {v0, v5}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v5

    add-int v6, p2, p4

    int-to-float v6, v6

    invoke-virtual {v0, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v6

    add-float/2addr v6, v1

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v2
.end method

.method private measure(Lorg/chromium/content/browser/RenderCoordinates;)V
    .locals 4
    .param p1, "coordinates"    # Lorg/chromium/content/browser/RenderCoordinates;

    .prologue
    const/high16 v3, -0x80000000

    const/4 v2, -0x2

    .line 121
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2, v2}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 123
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lorg/chromium/content/browser/RenderCoordinates;->getLastFrameViewportWidthPixInt()I

    move-result v1

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1}, Lorg/chromium/content/browser/RenderCoordinates;->getLastFrameViewportHeightPixInt()I

    move-result v2

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 132
    return-void
.end method

.method private setPositionRelativeToAnchor(Lorg/chromium/content/browser/ContentViewCore;IIII)V
    .locals 7
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "anchorX"    # I
    .param p3, "anchorY"    # I
    .param p4, "anchorWidth"    # I
    .param p5, "anchorHeight"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 86
    invoke-static {p1, p2, p3, p4, p5}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->makePixRectInScreen(Lorg/chromium/content/browser/ContentViewCore;IIII)Landroid/graphics/RectF;

    move-result-object v0

    .line 88
    .local v0, "anchor":Landroid/graphics/RectF;
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-direct {p0}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->getAnchorOffset()F

    move-result v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v3, v3

    invoke-direct {p0, p1, v2, v3}, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->adjustWindowPosition(Lorg/chromium/content/browser/ContentViewCore;II)Landroid/graphics/Point;

    move-result-object v1

    .line 90
    .local v1, "origin":Landroid/graphics/Point;
    iget-object v2, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v4, v1, Landroid/graphics/Point;->y:I

    iget-object v5, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v5

    iget-object v6, p0, Lorg/chromium/components/web_contents_delegate_android/ValidationMessageBubble;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/PopupWindow;->update(IIII)V

    .line 91
    return-void
.end method

.method private static updateTextViews(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "root"    # Landroid/view/ViewGroup;
    .param p1, "mainText"    # Ljava/lang/String;
    .param p2, "subText"    # Ljava/lang/String;

    .prologue
    .line 111
    sget v1, Lorg/chromium/content/R$id;->main_text:I

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    sget v1, Lorg/chromium/content/R$id;->sub_text:I

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 113
    .local v0, "subTextView":Landroid/widget/TextView;
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 114
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :goto_0
    return-void

    .line 116
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0
.end method

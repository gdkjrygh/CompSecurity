.class public Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;
.super Ljava/lang/Object;
.source "BrowserAccessibilityManager.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BrowserAccessibilityManager"


# instance fields
.field private mAccessibilityFocusId:I

.field private mAccessibilityFocusRect:Landroid/graphics/Rect;

.field private final mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field private mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private mCurrentRootId:I

.field private mIsHovering:Z

.field private mLastHoverId:I

.field private mNativeObj:J

.field private mNotifyFrameInfoInitializedCalled:Z

.field private mPendingScrollToMakeNodeVisible:Z

.field private final mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

.field private final mTempLocation:[I

.field private mUserHasTouchExplored:Z

.field private final mView:Landroid/view/ViewGroup;


# direct methods
.method protected constructor <init>(JLorg/chromium/content/browser/ContentViewCore;)V
    .locals 3
    .param p1, "nativeBrowserAccessibilityManagerAndroid"    # J
    .param p3, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    const/4 v1, -0x1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mLastHoverId:I

    .line 52
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mTempLocation:[I

    .line 85
    iput-wide p1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    .line 86
    iput-object p3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 87
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p0}, Lorg/chromium/content/browser/ContentViewCore;->setBrowserAccessibilityManager(Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;)V

    .line 88
    iput v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mIsHovering:Z

    .line 90
    iput v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mCurrentRootId:I

    .line 91
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    .line 92
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    .line 93
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    .line 96
    return-void
.end method

.method private addAccessibilityNodeInfoChild(Landroid/view/accessibility/AccessibilityNodeInfo;I)V
    .locals 1
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "childId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 484
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 485
    return-void
.end method

.method private announceLiveRegionText(Ljava/lang/String;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 474
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 475
    return-void
.end method

.method private static create(JLorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;
    .locals 2
    .param p0, "nativeBrowserAccessibilityManagerAndroid"    # J
    .param p2, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 74
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 75
    new-instance v0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;

    invoke-direct {v0, p0, p1, p2}, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;-><init>(JLorg/chromium/content/browser/ContentViewCore;)V

    .line 78
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    invoke-direct {v0, p0, p1, p2}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;-><init>(JLorg/chromium/content/browser/ContentViewCore;)V

    goto :goto_0
.end method

.method private createNodeForHost(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 5
    .param p1, "rootId"    # I

    .prologue
    .line 358
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-static {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    .line 359
    .local v2, "result":Landroid/view/accessibility/AccessibilityNodeInfo;
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-static {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v3

    .line 360
    .local v3, "source":Landroid/view/accessibility/AccessibilityNodeInfo;
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 363
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 364
    .local v1, "rect":Landroid/graphics/Rect;
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 365
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 366
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 367
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 370
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v0

    .line 371
    .local v0, "parent":Landroid/view/ViewParent;
    instance-of v4, v0, Landroid/view/View;

    if-eqz v4, :cond_0

    .line 372
    check-cast v0, Landroid/view/View;

    .end local v0    # "parent":Landroid/view/ViewParent;
    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 376
    :cond_0
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 377
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 378
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 379
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 382
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->isFrameInfoInitialized()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 383
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v2, v4, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 386
    :cond_1
    return-object v2
.end method

.method private getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;
    .locals 1
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;

    .prologue
    .line 347
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getParcelableData()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 348
    .local v0, "bundle":Landroid/os/Bundle;
    if-nez v0, :cond_0

    .line 349
    new-instance v0, Landroid/os/Bundle;

    .end local v0    # "bundle":Landroid/os/Bundle;
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 350
    .restart local v0    # "bundle":Landroid/os/Bundle;
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setParcelableData(Landroid/os/Parcelable;)V

    .line 352
    :cond_0
    return-object v0
.end method

.method private handleCheckStateChanged(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 419
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 420
    return-void
.end method

.method private handleContentChanged(I)V
    .locals 5
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/16 v4, 0x800

    .line 434
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v2, v3}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeGetRootId(J)I

    move-result v0

    .line 435
    .local v0, "rootId":I
    iget v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mCurrentRootId:I

    if-eq v0, v1, :cond_0

    .line 436
    iput v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mCurrentRootId:I

    .line 437
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 441
    :goto_0
    return-void

    .line 439
    :cond_0
    invoke-direct {p0, p1, v4}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    goto :goto_0
.end method

.method private handleEditableTextChanged(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 429
    const/16 v0, 0x10

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 430
    return-void
.end method

.method private handleFocusChanged(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 413
    const/16 v0, 0x8

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 414
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToId(I)Z

    .line 415
    return-void
.end method

.method private handleHover(I)V
    .locals 2
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 464
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mLastHoverId:I

    if-ne v0, p1, :cond_0

    .line 470
    :goto_0
    return-void

    .line 467
    :cond_0
    const/16 v0, 0x80

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 468
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mLastHoverId:I

    const/16 v1, 0x100

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 469
    iput p1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mLastHoverId:I

    goto :goto_0
.end method

.method private handleNavigate()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 445
    const/4 v0, -0x1

    iput v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    .line 446
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    .line 447
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mUserHasTouchExplored:Z

    .line 449
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    const/16 v1, 0x800

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 450
    return-void
.end method

.method private handlePageLoaded(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 404
    iget-boolean v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mUserHasTouchExplored:Z

    if-eqz v0, :cond_1

    .line 409
    :cond_0
    :goto_0
    return-void

    .line 406
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->shouldSetAccessibilityFocusOnPageLoad()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToIdAndRefocusIfNeeded(I)V

    goto :goto_0
.end method

.method private handleScrollPositionChanged(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 454
    const/16 v0, 0x1000

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 455
    return-void
.end method

.method private handleScrolledToAnchor(I)V
    .locals 0
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 459
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToId(I)Z

    .line 460
    return-void
.end method

.method private handleTextSelectionChanged(I)V
    .locals 1
    .param p1, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 424
    const/16 v0, 0x2000

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 425
    return-void
.end method

.method private isFrameInfoInitialized()Z
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 398
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v0}, Lorg/chromium/content/browser/RenderCoordinates;->getContentWidthCss()F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v0}, Lorg/chromium/content/browser/RenderCoordinates;->getContentHeightCss()F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private jumpToElementType(Ljava/lang/String;Z)Z
    .locals 7
    .param p1, "elementType"    # Ljava/lang/String;
    .param p2, "forwards"    # Z

    .prologue
    .line 281
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    iget v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    move-object v1, p0

    move-object v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeFindElementType(JILjava/lang/String;Z)I

    move-result v0

    .line 282
    .local v0, "id":I
    if-nez v0, :cond_0

    .line 283
    const/4 v1, 0x0

    .line 286
    :goto_0
    return v1

    .line 285
    :cond_0
    invoke-direct {p0, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToId(I)Z

    .line 286
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private moveAccessibilityFocusToId(I)Z
    .locals 2
    .param p1, "newAccessibilityFocusId"    # I

    .prologue
    .line 290
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    if-ne p1, v0, :cond_0

    .line 291
    const/4 v0, 0x0

    .line 297
    :goto_0
    return v0

    .line 293
    :cond_0
    iput p1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    .line 294
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    .line 295
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    const v1, 0x8000

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 297
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private moveAccessibilityFocusToIdAndRefocusIfNeeded(I)V
    .locals 1
    .param p1, "newAccessibilityFocusId"    # I

    .prologue
    .line 304
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    if-ne p1, v0, :cond_0

    .line 305
    const/high16 v0, 0x10000

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 307
    const/4 v0, -0x1

    iput v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    .line 310
    :cond_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToId(I)Z

    .line 311
    return-void
.end method

.method private native nativeBlur(J)V
.end method

.method private native nativeClick(JI)V
.end method

.method private native nativeFindElementType(JILjava/lang/String;Z)I
.end method

.method private native nativeFocus(JI)V
.end method

.method private native nativeGetRootId(J)I
.end method

.method private native nativeHitTest(JII)V
.end method

.method private native nativeIsNodeValid(JI)Z
.end method

.method private native nativePopulateAccessibilityEvent(JLandroid/view/accessibility/AccessibilityEvent;II)Z
.end method

.method private native nativePopulateAccessibilityNodeInfo(JLandroid/view/accessibility/AccessibilityNodeInfo;I)Z
.end method

.method private native nativeScrollToMakeNodeVisible(JI)V
.end method

.method private onNativeObjectDestroyed()V
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 100
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getBrowserAccessibilityManager()Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 101
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, v2}, Lorg/chromium/content/browser/ContentViewCore;->setBrowserAccessibilityManager(Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;)V

    .line 103
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    .line 104
    iput-object v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 105
    return-void
.end method

.method private sendAccessibilityEvent(II)V
    .locals 7
    .param p1, "virtualViewId"    # I
    .param p2, "eventType"    # I

    .prologue
    .line 317
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->isFrameInfoInitialized()Z

    move-result v0

    if-nez v0, :cond_1

    .line 344
    :cond_0
    :goto_0
    return-void

    .line 326
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->postInvalidate()V

    .line 330
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 331
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    goto :goto_0

    .line 335
    :cond_2
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v4

    .line 336
    .local v4, "event":Landroid/view/accessibility/AccessibilityEvent;
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 337
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v4, v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;I)V

    .line 338
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    move-object v1, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativePopulateAccessibilityEvent(JLandroid/view/accessibility/AccessibilityEvent;II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 339
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityEvent;->recycle()V

    goto :goto_0

    .line 343
    :cond_3
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v4}, Landroid/view/ViewGroup;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    goto :goto_0
.end method

.method private setAccessibilityEventBooleanAttributes(Landroid/view/accessibility/AccessibilityEvent;ZZZZ)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "checked"    # Z
    .param p3, "enabled"    # Z
    .param p4, "password"    # Z
    .param p5, "scrollable"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 630
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setChecked(Z)V

    .line 631
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V

    .line 632
    invoke-virtual {p1, p4}, Landroid/view/accessibility/AccessibilityEvent;->setPassword(Z)V

    .line 633
    invoke-virtual {p1, p5}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    .line 634
    return-void
.end method

.method private setAccessibilityEventClassName(Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/String;)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "className"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 638
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 639
    return-void
.end method

.method private setAccessibilityEventListAttributes(Landroid/view/accessibility/AccessibilityEvent;II)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "currentItemIndex"    # I
    .param p3, "itemCount"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 644
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setCurrentItemIndex(I)V

    .line 645
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 646
    return-void
.end method

.method private setAccessibilityEventScrollAttributes(Landroid/view/accessibility/AccessibilityEvent;IIII)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "scrollX"    # I
    .param p3, "scrollY"    # I
    .param p4, "maxScrollX"    # I
    .param p5, "maxScrollY"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 651
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V

    .line 652
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V

    .line 653
    invoke-virtual {p1, p4}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollX(I)V

    .line 654
    invoke-virtual {p1, p5}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollY(I)V

    .line 655
    return-void
.end method

.method private setAccessibilityEventSelectionAttrs(Landroid/view/accessibility/AccessibilityEvent;IIILjava/lang/String;)V
    .locals 1
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "fromIndex"    # I
    .param p3, "addedCount"    # I
    .param p4, "itemCount"    # I
    .param p5, "text"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 670
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 671
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityEvent;->setAddedCount(I)V

    .line 672
    invoke-virtual {p1, p4}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 673
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 674
    return-void
.end method

.method private setAccessibilityEventTextChangedAttrs(Landroid/view/accessibility/AccessibilityEvent;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "fromIndex"    # I
    .param p3, "addedCount"    # I
    .param p4, "removedCount"    # I
    .param p5, "beforeText"    # Ljava/lang/String;
    .param p6, "text"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 660
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 661
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityEvent;->setAddedCount(I)V

    .line 662
    invoke-virtual {p1, p4}, Landroid/view/accessibility/AccessibilityEvent;->setRemovedCount(I)V

    .line 663
    invoke-virtual {p1, p5}, Landroid/view/accessibility/AccessibilityEvent;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 664
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 665
    return-void
.end method

.method private setAccessibilityNodeInfoBooleanAttributes(Landroid/view/accessibility/AccessibilityNodeInfo;IZZZZZZZZZZ)V
    .locals 2
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "virtualViewId"    # I
    .param p3, "checkable"    # Z
    .param p4, "checked"    # Z
    .param p5, "clickable"    # Z
    .param p6, "enabled"    # Z
    .param p7, "focusable"    # Z
    .param p8, "focused"    # Z
    .param p9, "password"    # Z
    .param p10, "scrollable"    # Z
    .param p11, "selected"    # Z
    .param p12, "visibleToUser"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 492
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 493
    invoke-virtual {p1, p4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 494
    invoke-virtual {p1, p5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 495
    invoke-virtual {p1, p6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 496
    invoke-virtual {p1, p7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 497
    invoke-virtual {p1, p8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 498
    invoke-virtual {p1, p9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 499
    invoke-virtual {p1, p10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 500
    invoke-virtual {p1, p11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 501
    invoke-virtual {p1, p12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 503
    const/16 v0, 0x400

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 504
    const/16 v0, 0x800

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 506
    if-eqz p7, :cond_0

    .line 507
    if-eqz p8, :cond_2

    .line 508
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 514
    :cond_0
    :goto_0
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    if-ne v0, p2, :cond_3

    .line 515
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 516
    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 522
    :goto_1
    if-eqz p5, :cond_1

    .line 523
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 525
    :cond_1
    return-void

    .line 510
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    goto :goto_0

    .line 518
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 519
    const/16 v0, 0x40

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    goto :goto_1
.end method

.method private setAccessibilityNodeInfoClassName(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "className"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 530
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 531
    return-void
.end method

.method private setAccessibilityNodeInfoContentDescription(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)V
    .locals 4
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "contentDescription"    # Ljava/lang/String;
    .param p3, "annotateAsLink"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 536
    if-eqz p3, :cond_0

    .line 537
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 538
    .local v0, "spannable":Landroid/text/SpannableString;
    new-instance v1, Landroid/text/style/URLSpan;

    const-string v2, ""

    invoke-direct {v1, v2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 539
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 543
    .end local v0    # "spannable":Landroid/text/SpannableString;
    :goto_0
    return-void

    .line 541
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private setAccessibilityNodeInfoLocation(Landroid/view/accessibility/AccessibilityNodeInfo;IIIIIIIZ)V
    .locals 6
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "virtualViewId"    # I
    .param p3, "absoluteLeft"    # I
    .param p4, "absoluteTop"    # I
    .param p5, "parentRelativeLeft"    # I
    .param p6, "parentRelativeTop"    # I
    .param p7, "width"    # I
    .param p8, "height"    # I
    .param p9, "isRootNode"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 551
    new-instance v0, Landroid/graphics/Rect;

    add-int v3, p5, p7

    add-int v4, p6, p8

    invoke-direct {v0, p5, p6, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 553
    .local v0, "boundsInParent":Landroid/graphics/Rect;
    if-eqz p9, :cond_0

    .line 555
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v3}, Lorg/chromium/content/browser/RenderCoordinates;->getContentOffsetYPix()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v0, v5, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 557
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 560
    new-instance v1, Landroid/graphics/Rect;

    add-int v3, p3, p7

    add-int v4, p4, p8

    invoke-direct {v1, p3, p4, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 563
    .local v1, "rect":Landroid/graphics/Rect;
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v3}, Lorg/chromium/content/browser/RenderCoordinates;->getScrollX()F

    move-result v3

    float-to-int v3, v3

    neg-int v3, v3

    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v4}, Lorg/chromium/content/browser/RenderCoordinates;->getScrollY()F

    move-result v4

    float-to-int v4, v4

    neg-int v4, v4

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Rect;->offset(II)V

    .line 567
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v3

    float-to-int v3, v3

    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 568
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    iget v4, v1, Landroid/graphics/Rect;->top:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v3

    float-to-int v3, v3

    iput v3, v1, Landroid/graphics/Rect;->top:I

    .line 569
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    iget v4, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v3

    float-to-int v3, v3

    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 570
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    iget v4, v1, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v3

    float-to-int v3, v3

    iput v3, v1, Landroid/graphics/Rect;->right:I

    .line 573
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v3}, Lorg/chromium/content/browser/RenderCoordinates;->getContentOffsetYPix()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v5, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 577
    const/4 v3, 0x2

    new-array v2, v3, [I

    .line 578
    .local v2, "viewLocation":[I
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 579
    aget v3, v2, v5

    const/4 v4, 0x1

    aget v4, v2, v4

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Rect;->offset(II)V

    .line 581
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 588
    iget v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    if-ne p2, v3, :cond_1

    iget v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mCurrentRootId:I

    if-eq p2, v3, :cond_1

    .line 589
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    if-nez v3, :cond_2

    .line 590
    iput-object v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    .line 596
    :cond_1
    :goto_0
    return-void

    .line 591
    :cond_2
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    invoke-virtual {v3, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 592
    iput-object v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    .line 593
    invoke-direct {p0, p2}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToIdAndRefocusIfNeeded(I)V

    goto :goto_0
.end method

.method private setAccessibilityNodeInfoParent(Landroid/view/accessibility/AccessibilityNodeInfo;I)V
    .locals 1
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "parentId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 479
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 480
    return-void
.end method


# virtual methods
.method protected createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 8
    .param p1, "virtualViewId"    # I

    .prologue
    const/4 v2, 0x0

    .line 118
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-nez v3, :cond_2

    :cond_0
    move-object v0, v2

    .line 144
    :cond_1
    :goto_0
    return-object v0

    .line 122
    :cond_2
    iget-wide v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v4, v5}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeGetRootId(J)I

    move-result v1

    .line 124
    .local v1, "rootId":I
    const/4 v3, -0x1

    if-ne p1, v3, :cond_3

    .line 125
    invoke-direct {p0, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->createNodeForHost(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    goto :goto_0

    .line 128
    :cond_3
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->isFrameInfoInitialized()Z

    move-result v3

    if-nez v3, :cond_4

    move-object v0, v2

    .line 129
    goto :goto_0

    .line 132
    :cond_4
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-static {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    .line 133
    .local v0, "info":Landroid/view/accessibility/AccessibilityNodeInfo;
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 136
    if-ne p1, v1, :cond_5

    .line 137
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 140
    :cond_5
    iget-wide v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v4, v5, v0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativePopulateAccessibilityNodeInfo(JLandroid/view/accessibility/AccessibilityNodeInfo;I)Z

    move-result v3

    if-nez v3, :cond_1

    .line 143
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    move-object v0, v2

    .line 144
    goto :goto_0
.end method

.method protected findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "virtualViewId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List",
            "<",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x0

    return-object v0
.end method

.method public notifyFrameInfoInitialized()V
    .locals 2

    .prologue
    .line 264
    iget-boolean v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNotifyFrameInfoInitializedCalled:Z

    if-eqz v0, :cond_1

    .line 278
    :cond_0
    :goto_0
    return-void

    .line 267
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNotifyFrameInfoInitializedCalled:Z

    .line 271
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mView:Landroid/view/ViewGroup;

    const/16 v1, 0x800

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 275
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 276
    iget v0, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToIdAndRefocusIfNeeded(I)V

    goto :goto_0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 10
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 229
    iget-object v6, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v6

    if-eqz v6, :cond_0

    iget-wide v6, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-nez v6, :cond_1

    :cond_0
    move v4, v5

    .line 255
    :goto_0
    return v4

    .line 233
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    const/16 v7, 0xa

    if-ne v6, v7, :cond_3

    .line 234
    iput-boolean v5, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mIsHovering:Z

    .line 235
    iget-boolean v6, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mPendingScrollToMakeNodeVisible:Z

    if-eqz v6, :cond_2

    .line 236
    iget-wide v6, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    iget v8, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    invoke-direct {p0, v6, v7, v8}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeScrollToMakeNodeVisible(JI)V

    .line 239
    :cond_2
    iput-boolean v5, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mPendingScrollToMakeNodeVisible:Z

    goto :goto_0

    .line 243
    :cond_3
    iput-boolean v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mIsHovering:Z

    .line 244
    iput-boolean v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mUserHasTouchExplored:Z

    .line 245
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 246
    .local v2, "x":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 249
    .local v3, "y":F
    iget-object v5, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v5, v2}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToLocalCss(F)F

    move-result v5

    float-to-int v0, v5

    .line 250
    .local v0, "cssX":I
    iget-object v5, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-virtual {v5, v3}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToLocalCss(F)F

    move-result v5

    float-to-int v1, v5

    .line 254
    .local v1, "cssY":I
    iget-wide v6, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v6, v7, v0, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeHitTest(JII)V

    goto :goto_0
.end method

.method protected performAction(IILandroid/os/Bundle;)Z
    .locals 8
    .param p1, "virtualViewId"    # I
    .param p2, "action"    # I
    .param p3, "arguments"    # Landroid/os/Bundle;

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 162
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-eqz v3, :cond_0

    iget-wide v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v4, v5, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeIsNodeValid(JI)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    move v1, v2

    .line 222
    :cond_1
    :goto_0
    return v1

    .line 167
    :cond_2
    sparse-switch p2, :sswitch_data_0

    move v1, v2

    .line 222
    goto :goto_0

    .line 169
    :sswitch_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->moveAccessibilityFocusToId(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 171
    iget-boolean v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mIsHovering:Z

    if-nez v2, :cond_3

    .line 172
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    iget v4, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    invoke-direct {p0, v2, v3, v4}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeScrollToMakeNodeVisible(JI)V

    goto :goto_0

    .line 175
    :cond_3
    iput-boolean v1, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mPendingScrollToMakeNodeVisible:Z

    goto :goto_0

    .line 179
    :sswitch_1
    iget v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    if-ne v2, p1, :cond_1

    .line 180
    iget v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    const/high16 v3, 0x10000

    invoke-direct {p0, v2, v3}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    .line 182
    const/4 v2, -0x1

    iput v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusId:I

    .line 183
    const/4 v2, 0x0

    iput-object v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mAccessibilityFocusRect:Landroid/graphics/Rect;

    goto :goto_0

    .line 187
    :sswitch_2
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v2, v3, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeClick(JI)V

    .line 188
    invoke-direct {p0, p1, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->sendAccessibilityEvent(II)V

    goto :goto_0

    .line 192
    :sswitch_3
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v2, v3, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeFocus(JI)V

    goto :goto_0

    .line 195
    :sswitch_4
    iget-wide v2, p0, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->mNativeObj:J

    invoke-direct {p0, v2, v3}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->nativeBlur(J)V

    goto :goto_0

    .line 199
    :sswitch_5
    if-nez p3, :cond_4

    move v1, v2

    .line 200
    goto :goto_0

    .line 201
    :cond_4
    const-string v3, "ACTION_ARGUMENT_HTML_ELEMENT_STRING"

    invoke-virtual {p3, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 203
    .local v0, "elementType":Ljava/lang/String;
    if-nez v0, :cond_5

    move v1, v2

    .line 204
    goto :goto_0

    .line 205
    :cond_5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 206
    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->jumpToElementType(Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_0

    .line 209
    .end local v0    # "elementType":Ljava/lang/String;
    :sswitch_6
    if-nez p3, :cond_6

    move v1, v2

    .line 210
    goto :goto_0

    .line 211
    :cond_6
    const-string v1, "ACTION_ARGUMENT_HTML_ELEMENT_STRING"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 213
    .restart local v0    # "elementType":Ljava/lang/String;
    if-nez v0, :cond_7

    move v1, v2

    .line 214
    goto :goto_0

    .line 215
    :cond_7
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 216
    invoke-direct {p0, v0, v2}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->jumpToElementType(Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_0

    .line 167
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
        0x10 -> :sswitch_2
        0x40 -> :sswitch_0
        0x80 -> :sswitch_1
        0x400 -> :sswitch_5
        0x800 -> :sswitch_6
    .end sparse-switch
.end method

.method protected setAccessibilityEventCollectionInfo(Landroid/view/accessibility/AccessibilityEvent;IIZ)V
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rowCount"    # I
    .param p3, "columnCount"    # I
    .param p4, "hierarchical"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 698
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;

    move-result-object v0

    .line 699
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "AccessibilityNodeInfo.CollectionInfo.rowCount"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 700
    const-string v1, "AccessibilityNodeInfo.CollectionInfo.columnCount"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 701
    const-string v1, "AccessibilityNodeInfo.CollectionInfo.hierarchical"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 702
    return-void
.end method

.method protected setAccessibilityEventCollectionItemInfo(Landroid/view/accessibility/AccessibilityEvent;IIII)V
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rowIndex"    # I
    .param p3, "rowSpan"    # I
    .param p4, "columnIndex"    # I
    .param p5, "columnSpan"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 716
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;

    move-result-object v0

    .line 717
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "AccessibilityNodeInfo.CollectionItemInfo.rowIndex"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 718
    const-string v1, "AccessibilityNodeInfo.CollectionItemInfo.rowSpan"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 719
    const-string v1, "AccessibilityNodeInfo.CollectionItemInfo.columnIndex"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 720
    const-string v1, "AccessibilityNodeInfo.CollectionItemInfo.columnSpan"

    invoke-virtual {v0, v1, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 721
    return-void
.end method

.method protected setAccessibilityEventHeadingFlag(Landroid/view/accessibility/AccessibilityEvent;Z)V
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "heading"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 708
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;

    move-result-object v0

    .line 709
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "AccessibilityNodeInfo.CollectionItemInfo.heading"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 710
    return-void
.end method

.method protected setAccessibilityEventKitKatAttributes(Landroid/view/accessibility/AccessibilityEvent;ZZZZII)V
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "canOpenPopup"    # Z
    .param p3, "contentInvalid"    # Z
    .param p4, "dismissable"    # Z
    .param p5, "multiLine"    # Z
    .param p6, "inputType"    # I
    .param p7, "liveRegion"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 685
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;

    move-result-object v0

    .line 686
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "AccessibilityNodeInfo.canOpenPopup"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 687
    const-string v1, "AccessibilityNodeInfo.contentInvalid"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 688
    const-string v1, "AccessibilityNodeInfo.dismissable"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 689
    const-string v1, "AccessibilityNodeInfo.multiLine"

    invoke-virtual {v0, v1, p5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 690
    const-string v1, "AccessibilityNodeInfo.inputType"

    invoke-virtual {v0, v1, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 691
    const-string v1, "AccessibilityNodeInfo.liveRegion"

    invoke-virtual {v0, v1, p7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 692
    return-void
.end method

.method protected setAccessibilityEventRangeInfo(Landroid/view/accessibility/AccessibilityEvent;IFFF)V
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rangeType"    # I
    .param p3, "min"    # F
    .param p4, "max"    # F
    .param p5, "current"    # F
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 727
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->getOrCreateBundleForAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Landroid/os/Bundle;

    move-result-object v0

    .line 728
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v1, "AccessibilityNodeInfo.RangeInfo.type"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 729
    const-string v1, "AccessibilityNodeInfo.RangeInfo.min"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 730
    const-string v1, "AccessibilityNodeInfo.RangeInfo.max"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 731
    const-string v1, "AccessibilityNodeInfo.RangeInfo.current"

    invoke-virtual {v0, v1, p5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 732
    return-void
.end method

.method protected setAccessibilityNodeInfoCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IIZ)V
    .locals 0
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rowCount"    # I
    .param p3, "columnCount"    # I
    .param p4, "hierarchical"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 613
    return-void
.end method

.method protected setAccessibilityNodeInfoCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IIIIZ)V
    .locals 0
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rowIndex"    # I
    .param p3, "rowSpan"    # I
    .param p4, "columnIndex"    # I
    .param p5, "columnSpan"    # I
    .param p6, "heading"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 619
    return-void
.end method

.method protected setAccessibilityNodeInfoKitKatAttributes(Landroid/view/accessibility/AccessibilityNodeInfo;ZZZZII)V
    .locals 0
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "canOpenPopup"    # Z
    .param p3, "contentInvalid"    # Z
    .param p4, "dismissable"    # Z
    .param p5, "multiLine"    # Z
    .param p6, "inputType"    # I
    .param p7, "liveRegion"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 607
    return-void
.end method

.method protected setAccessibilityNodeInfoRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IFFF)V
    .locals 0
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rangeType"    # I
    .param p3, "min"    # F
    .param p4, "max"    # F
    .param p5, "current"    # F
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 625
    return-void
.end method

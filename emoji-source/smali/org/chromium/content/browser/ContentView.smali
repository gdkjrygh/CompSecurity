.class public Lorg/chromium/content/browser/ContentView;
.super Landroid/widget/FrameLayout;
.source "ContentView.java"

# interfaces
.implements Lorg/chromium/content/browser/ContentViewCore$InternalAccessDelegate;
.implements Lorg/chromium/content/browser/SmartClipProvider;


# static fields
.field private static final TAG:Ljava/lang/String; = "ContentView"


# instance fields
.field protected final mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cvc"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 54
    const/4 v0, 0x0

    const v1, 0x1010085

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentView;->getScrollBarStyle()I

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/ContentView;->setHorizontalScrollBarEnabled(Z)V

    .line 58
    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/ContentView;->setVerticalScrollBarEnabled(Z)V

    .line 61
    :cond_0
    invoke-virtual {p0, v3}, Lorg/chromium/content/browser/ContentView;->setFocusable(Z)V

    .line 62
    invoke-virtual {p0, v3}, Lorg/chromium/content/browser/ContentView;->setFocusableInTouchMode(Z)V

    .line 64
    iput-object p2, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 65
    return-void
.end method

.method public static newInstance(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/ContentView;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "cvc"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 47
    new-instance v0, Lorg/chromium/content/browser/ContentView;

    invoke-direct {v0, p0, p1}, Lorg/chromium/content/browser/ContentView;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)V

    .line 49
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/chromium/content/browser/JellyBeanContentView;

    invoke-direct {v0, p0, p1}, Lorg/chromium/content/browser/JellyBeanContentView;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)V

    goto :goto_0
.end method


# virtual methods
.method public awakenScrollBars()Z
    .locals 1

    .prologue
    .line 219
    invoke-super {p0}, Landroid/widget/FrameLayout;->awakenScrollBars()Z

    move-result v0

    return v0
.end method

.method public awakenScrollBars(IZ)Z
    .locals 1
    .param p1, "startDelay"    # I
    .param p2, "invalidate"    # Z

    .prologue
    .line 214
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->awakenScrollBars(IZ)Z

    move-result v0

    return v0
.end method

.method protected computeHorizontalScrollExtent()I
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeHorizontalScrollExtent()I

    move-result v0

    return v0
.end method

.method protected computeHorizontalScrollOffset()I
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeHorizontalScrollOffset()I

    move-result v0

    return v0
.end method

.method protected computeHorizontalScrollRange()I
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeHorizontalScrollRange()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollExtent()I
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollOffset()I
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeVerticalScrollOffset()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollRange()I
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->computeVerticalScrollRange()I

    move-result v0

    return v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 123
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    .line 126
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 118
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 1
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .param p2, "child"    # Landroid/view/View;
    .param p3, "drawingTime"    # J

    .prologue
    .line 70
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v0

    return v0
.end method

.method public extractSmartClipData(IIII)V
    .locals 1
    .param p1, "x"    # I
    .param p2, "y"    # I
    .param p3, "width"    # I
    .param p4, "height"    # I

    .prologue
    .line 259
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/chromium/content/browser/ContentViewCore;->extractSmartClipData(IIII)V

    .line 260
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 240
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 241
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->onAttachedToWindow()V

    .line 242
    return-void
.end method

.method public onCheckIsTextEditor()Z
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->onCheckIsTextEditor()Z

    move-result v0

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 159
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 160
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1
    .param p1, "outAttrs"    # Landroid/view/inputmethod/EditorInfo;

    .prologue
    .line 89
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 246
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 247
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->onDetachedFromWindow()V

    .line 248
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 1
    .param p1, "gainFocus"    # Z
    .param p2, "direction"    # I
    .param p3, "previouslyFocusedRect"    # Landroid/graphics/Rect;

    .prologue
    .line 99
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 100
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 101
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onFocusChanged(Z)V

    .line 102
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 103
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 149
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 142
    iget-object v1, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1, p1}, Lorg/chromium/content/browser/ContentViewCore;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 143
    .local v0, "consumed":Z
    iget-object v1, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->isTouchExplorationEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 144
    :cond_0
    return v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;

    .prologue
    .line 234
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 235
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 236
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1
    .param p1, "info"    # Landroid/view/accessibility/AccessibilityNodeInfo;

    .prologue
    .line 224
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 225
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 226
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 113
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onScrollChanged(IIII)V
    .locals 0
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "oldl"    # I
    .param p4, "oldt"    # I

    .prologue
    .line 76
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onScrollChanged(IIII)V

    .line 77
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "ow"    # I
    .param p4, "oh"    # I

    .prologue
    .line 81
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 82
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 83
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/chromium/content/browser/ContentViewCore;->onSizeChanged(IIII)V

    .line 84
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 85
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 132
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1
    .param p1, "changedView"    # Landroid/view/View;
    .param p2, "visibility"    # I

    .prologue
    .line 252
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onVisibilityChanged(Landroid/view/View;I)V

    .line 253
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->onVisibilityChanged(Landroid/view/View;I)V

    .line 254
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1
    .param p1, "hasWindowFocus"    # Z

    .prologue
    .line 107
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 108
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->onWindowFocusChanged(Z)V

    .line 109
    return-void
.end method

.method public performLongClick()Z
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    return v0
.end method

.method public scrollBy(II)V
    .locals 1
    .param p1, "x"    # I
    .param p2, "y"    # I

    .prologue
    .line 170
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->scrollBy(II)V

    .line 171
    return-void
.end method

.method public scrollTo(II)V
    .locals 1
    .param p1, "x"    # I
    .param p2, "y"    # I

    .prologue
    .line 175
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->scrollTo(II)V

    .line 176
    return-void
.end method

.method public setSmartClipResultHandler(Landroid/os/Handler;)V
    .locals 2
    .param p1, "resultHandler"    # Landroid/os/Handler;

    .prologue
    .line 265
    if-nez p1, :cond_0

    .line 266
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewCore;->setSmartClipDataListener(Lorg/chromium/content/browser/ContentViewCore$SmartClipDataListener;)V

    .line 286
    :goto_0
    return-void

    .line 269
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    new-instance v1, Lorg/chromium/content/browser/ContentView$1;

    invoke-direct {v1, p0, p1}, Lorg/chromium/content/browser/ContentView$1;-><init>(Lorg/chromium/content/browser/ContentView;Landroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewCore;->setSmartClipDataListener(Lorg/chromium/content/browser/ContentViewCore$SmartClipDataListener;)V

    goto :goto_0
.end method

.method public super_awakenScrollBars(IZ)Z
    .locals 1
    .param p1, "startDelay"    # I
    .param p2, "invalidate"    # Z

    .prologue
    .line 319
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->awakenScrollBars(IZ)Z

    move-result v0

    return v0
.end method

.method public super_dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 304
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public super_dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 299
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public super_onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 314
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 315
    return-void
.end method

.method public super_onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 309
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public super_onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 294
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

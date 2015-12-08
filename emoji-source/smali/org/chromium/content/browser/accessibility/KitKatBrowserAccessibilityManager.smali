.class public Lorg/chromium/content/browser/accessibility/KitKatBrowserAccessibilityManager;
.super Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;
.source "KitKatBrowserAccessibilityManager.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# direct methods
.method constructor <init>(JLorg/chromium/content/browser/ContentViewCore;)V
    .locals 1
    .param p1, "nativeBrowserAccessibilityManagerAndroid"    # J
    .param p3, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;-><init>(JLorg/chromium/content/browser/ContentViewCore;)V

    .line 26
    return-void
.end method


# virtual methods
.method protected setAccessibilityEventCollectionInfo(Landroid/view/accessibility/AccessibilityEvent;IIZ)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rowCount"    # I
    .param p3, "columnCount"    # I
    .param p4, "hierarchical"    # Z

    .prologue
    .line 82
    return-void
.end method

.method protected setAccessibilityEventCollectionItemInfo(Landroid/view/accessibility/AccessibilityEvent;IIII)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rowIndex"    # I
    .param p3, "rowSpan"    # I
    .param p4, "columnIndex"    # I
    .param p5, "columnSpan"    # I

    .prologue
    .line 96
    return-void
.end method

.method protected setAccessibilityEventHeadingFlag(Landroid/view/accessibility/AccessibilityEvent;Z)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "heading"    # Z

    .prologue
    .line 89
    return-void
.end method

.method protected setAccessibilityEventKitKatAttributes(Landroid/view/accessibility/AccessibilityEvent;ZZZZII)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "canOpenPopup"    # Z
    .param p3, "contentInvalid"    # Z
    .param p4, "dismissable"    # Z
    .param p5, "multiLine"    # Z
    .param p6, "inputType"    # I
    .param p7, "liveRegion"    # I

    .prologue
    .line 75
    return-void
.end method

.method protected setAccessibilityEventRangeInfo(Landroid/view/accessibility/AccessibilityEvent;IFFF)V
    .locals 0
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
    .param p2, "rangeType"    # I
    .param p3, "min"    # F
    .param p4, "max"    # F
    .param p5, "current"    # F

    .prologue
    .line 103
    return-void
.end method

.method protected setAccessibilityNodeInfoCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IIZ)V
    .locals 1
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rowCount"    # I
    .param p3, "columnCount"    # I
    .param p4, "hierarchical"    # Z

    .prologue
    .line 47
    invoke-static {p2, p3, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 49
    return-void
.end method

.method protected setAccessibilityNodeInfoCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IIIIZ)V
    .locals 1
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rowIndex"    # I
    .param p3, "rowSpan"    # I
    .param p4, "columnIndex"    # I
    .param p5, "columnSpan"    # I
    .param p6, "heading"    # Z

    .prologue
    .line 54
    invoke-static {p2, p3, p4, p5, p6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 56
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

    .prologue
    .line 36
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCanOpenPopup(Z)V

    .line 37
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 38
    invoke-virtual {p1, p3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 39
    invoke-virtual {p1, p5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMultiLine(Z)V

    .line 40
    invoke-virtual {p1, p6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setInputType(I)V

    .line 41
    invoke-virtual {p1, p7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 42
    return-void
.end method

.method protected setAccessibilityNodeInfoRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;IFFF)V
    .locals 1
    .param p1, "node"    # Landroid/view/accessibility/AccessibilityNodeInfo;
    .param p2, "rangeType"    # I
    .param p3, "min"    # F
    .param p4, "max"    # F
    .param p5, "current"    # F

    .prologue
    .line 61
    invoke-static {p2, p3, p4, p5}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 63
    return-void
.end method

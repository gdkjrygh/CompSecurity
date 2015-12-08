.class Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "JellyBeanBrowserAccessibilityManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;-><init>(JLorg/chromium/content/browser/ContentViewCore;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;

.field final synthetic val$delegate:Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;->this$0:Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager;

    iput-object p2, p0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;->val$delegate:Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1
    .param p1, "virtualViewId"    # I

    .prologue
    .line 32
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;->val$delegate:Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    return-object v0
.end method

.method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
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
    .line 38
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;->val$delegate:Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public performAction(IILandroid/os/Bundle;)Z
    .locals 1
    .param p1, "virtualViewId"    # I
    .param p2, "action"    # I
    .param p3, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 43
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanBrowserAccessibilityManager$1;->val$delegate:Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;

    invoke-virtual {v0, p1, p2, p3}, Lorg/chromium/content/browser/accessibility/BrowserAccessibilityManager;->performAction(IILandroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

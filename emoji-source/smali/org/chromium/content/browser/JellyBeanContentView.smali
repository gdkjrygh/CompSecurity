.class Lorg/chromium/content/browser/JellyBeanContentView;
.super Lorg/chromium/content/browser/ContentView;
.source "JellyBeanContentView.java"


# direct methods
.method constructor <init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cvc"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/ContentView;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewCore;)V

    .line 17
    return-void
.end method


# virtual methods
.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 2

    .prologue
    .line 30
    iget-object v1, p0, Lorg/chromium/content/browser/JellyBeanContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;

    move-result-object v0

    .line 31
    .local v0, "provider":Landroid/view/accessibility/AccessibilityNodeProvider;
    if-eqz v0, :cond_0

    .line 34
    .end local v0    # "provider":Landroid/view/accessibility/AccessibilityNodeProvider;
    :goto_0
    return-object v0

    .restart local v0    # "provider":Landroid/view/accessibility/AccessibilityNodeProvider;
    :cond_0
    invoke-super {p0}, Lorg/chromium/content/browser/ContentView;->getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;

    move-result-object v0

    goto :goto_0
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 1
    .param p1, "action"    # I
    .param p2, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 21
    iget-object v0, p0, Lorg/chromium/content/browser/JellyBeanContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->supportsAccessibilityAction(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lorg/chromium/content/browser/JellyBeanContentView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/ContentViewCore;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result v0

    .line 25
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lorg/chromium/content/browser/ContentView;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result v0

    goto :goto_0
.end method

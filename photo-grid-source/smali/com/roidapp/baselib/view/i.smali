.class final Lcom/roidapp/baselib/view/i;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/FixedDrawerLayout;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;)V
    .locals 0

    .prologue
    .line 1790
    iput-object p1, p0, Lcom/roidapp/baselib/view/i;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 1

    .prologue
    .line 1794
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1795
    invoke-static {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->h(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1799
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V

    .line 1801
    :cond_0
    return-void
.end method

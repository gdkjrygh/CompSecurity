.class Landroid/support/v4/view/ViewParentCompat$ViewParentCompatICSImpl;
.super Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 140
    invoke-static {p1, p2, p3}, Landroid/support/v4/view/ViewParentCompatICS;->requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    return v0
.end method

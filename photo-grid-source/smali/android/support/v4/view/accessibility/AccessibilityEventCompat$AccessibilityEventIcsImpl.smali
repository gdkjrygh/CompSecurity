.class Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;
.super Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public appendRecord(Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 68
    invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityEventCompatIcs;->appendRecord(Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method public getRecord(Landroid/view/accessibility/AccessibilityEvent;I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 73
    invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityEventCompatIcs;->getRecord(Landroid/view/accessibility/AccessibilityEvent;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getRecordCount(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 1

    .prologue
    .line 78
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompatIcs;->getRecordCount(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result v0

    return v0
.end method

.class Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;
.super Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
    .locals 1

    .prologue
    .line 56
    invoke-static {p1}, Landroid/support/v4/view/ViewConfigurationCompatFroyo;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I

    move-result v0

    return v0
.end method

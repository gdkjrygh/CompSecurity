.class Landroid/support/v4/view/ViewConfigurationCompat$IcsViewConfigurationVersionImpl;
.super Landroid/support/v4/view/ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Landroid/support/v4/view/ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public hasPermanentMenuKey(Landroid/view/ViewConfiguration;)Z
    .locals 1

    .prologue
    .line 77
    invoke-static {p1}, Landroid/support/v4/view/ViewConfigurationCompatICS;->hasPermanentMenuKey(Landroid/view/ViewConfiguration;)Z

    move-result v0

    return v0
.end method

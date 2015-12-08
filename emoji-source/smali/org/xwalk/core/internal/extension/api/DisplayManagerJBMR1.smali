.class public Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;
.super Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
.source "DisplayManagerJBMR1.java"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# instance fields
.field private mDisplayManager:Landroid/hardware/display/DisplayManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 17
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;-><init>()V

    .line 18
    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    .line 19
    return-void
.end method


# virtual methods
.method public getDisplay(I)Landroid/view/Display;
    .locals 1
    .param p1, "displayId"    # I

    .prologue
    .line 23
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, p1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public getDisplays()[Landroid/view/Display;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public getPresentationDisplays()[Landroid/view/Display;
    .locals 2

    .prologue
    .line 33
    const-string v0, "android.hardware.display.category.PRESENTATION"

    .line 34
    .local v0, "category":Ljava/lang/String;
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v1, v0}, Landroid/hardware/display/DisplayManager;->getDisplays(Ljava/lang/String;)[Landroid/view/Display;

    move-result-object v1

    return-object v1
.end method

.method public onDisplayAdded(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->notifyDisplayAdded(I)V

    .line 54
    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 63
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->notifyDisplayChanged(I)V

    .line 64
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 58
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->notifyDisplayRemoved(I)V

    .line 59
    return-void
.end method

.method public registerDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V
    .locals 2
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .prologue
    .line 39
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->registerDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V

    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 41
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 42
    :cond_0
    return-void
.end method

.method public unregisterDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V
    .locals 1
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .prologue
    .line 46
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->unregisterDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V

    .line 47
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;->mDisplayManager:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, p0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 49
    :cond_0
    return-void
.end method

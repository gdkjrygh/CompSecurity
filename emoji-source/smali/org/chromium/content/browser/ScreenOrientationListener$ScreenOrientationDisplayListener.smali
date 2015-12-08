.class Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;
.super Ljava/lang/Object;
.source "ScreenOrientationListener.java"

# interfaces
.implements Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ScreenOrientationListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ScreenOrientationDisplayListener"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ScreenOrientationListener;


# direct methods
.method private constructor <init>(Lorg/chromium/content/browser/ScreenOrientationListener;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;->this$0:Lorg/chromium/content/browser/ScreenOrientationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/content/browser/ScreenOrientationListener;Lorg/chromium/content/browser/ScreenOrientationListener$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/content/browser/ScreenOrientationListener;
    .param p2, "x1"    # Lorg/chromium/content/browser/ScreenOrientationListener$1;

    .prologue
    .line 155
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;-><init>(Lorg/chromium/content/browser/ScreenOrientationListener;)V

    return-void
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 188
    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 1
    .param p1, "displayId"    # I

    .prologue
    .line 196
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;->this$0:Lorg/chromium/content/browser/ScreenOrientationListener;

    # invokes: Lorg/chromium/content/browser/ScreenOrientationListener;->notifyObservers()V
    invoke-static {v0}, Lorg/chromium/content/browser/ScreenOrientationListener;->access$200(Lorg/chromium/content/browser/ScreenOrientationListener;)V

    .line 197
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 192
    return-void
.end method

.method public startAccurateListening()V
    .locals 0

    .prologue
    .line 177
    return-void
.end method

.method public startListening()V
    .locals 3

    .prologue
    .line 162
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;->this$0:Lorg/chromium/content/browser/ScreenOrientationListener;

    # getter for: Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ScreenOrientationListener;->access$000(Lorg/chromium/content/browser/ScreenOrientationListener;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "display"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 164
    .local v0, "displayManager":Landroid/hardware/display/DisplayManager;
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 165
    return-void
.end method

.method public stopAccurateListening()V
    .locals 0

    .prologue
    .line 182
    return-void
.end method

.method public stopListening()V
    .locals 3

    .prologue
    .line 169
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;->this$0:Lorg/chromium/content/browser/ScreenOrientationListener;

    # getter for: Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ScreenOrientationListener;->access$000(Lorg/chromium/content/browser/ScreenOrientationListener;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "display"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 171
    .local v0, "displayManager":Landroid/hardware/display/DisplayManager;
    invoke-virtual {v0, p0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 172
    return-void
.end method

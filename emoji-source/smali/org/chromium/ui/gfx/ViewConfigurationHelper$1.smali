.class Lorg/chromium/ui/gfx/ViewConfigurationHelper$1;
.super Ljava/lang/Object;
.source "ViewConfigurationHelper.java"

# interfaces
.implements Landroid/content/ComponentCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/gfx/ViewConfigurationHelper;->registerListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/gfx/ViewConfigurationHelper;


# direct methods
.method constructor <init>(Lorg/chromium/ui/gfx/ViewConfigurationHelper;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper$1;->this$0:Lorg/chromium/ui/gfx/ViewConfigurationHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1, "configuration"    # Landroid/content/res/Configuration;

    .prologue
    .line 44
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper$1;->this$0:Lorg/chromium/ui/gfx/ViewConfigurationHelper;

    # invokes: Lorg/chromium/ui/gfx/ViewConfigurationHelper;->updateNativeViewConfigurationIfNecessary()V
    invoke-static {v0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->access$000(Lorg/chromium/ui/gfx/ViewConfigurationHelper;)V

    .line 45
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .prologue
    .line 49
    return-void
.end method

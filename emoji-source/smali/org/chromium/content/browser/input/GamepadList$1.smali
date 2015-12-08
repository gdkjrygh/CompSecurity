.class Lorg/chromium/content/browser/input/GamepadList$1;
.super Ljava/lang/Object;
.source "GamepadList.java"

# interfaces
.implements Landroid/hardware/input/InputManager$InputDeviceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/input/GamepadList;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/input/GamepadList;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/input/GamepadList;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lorg/chromium/content/browser/input/GamepadList$1;->this$0:Lorg/chromium/content/browser/input/GamepadList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInputDeviceAdded(I)V
    .locals 1
    .param p1, "deviceId"    # I

    .prologue
    .line 56
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadList$1;->this$0:Lorg/chromium/content/browser/input/GamepadList;

    # invokes: Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceAddedImpl(I)V
    invoke-static {v0, p1}, Lorg/chromium/content/browser/input/GamepadList;->access$200(Lorg/chromium/content/browser/input/GamepadList;I)V

    .line 57
    return-void
.end method

.method public onInputDeviceChanged(I)V
    .locals 1
    .param p1, "deviceId"    # I

    .prologue
    .line 46
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadList$1;->this$0:Lorg/chromium/content/browser/input/GamepadList;

    # invokes: Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceChangedImpl(I)V
    invoke-static {v0, p1}, Lorg/chromium/content/browser/input/GamepadList;->access$000(Lorg/chromium/content/browser/input/GamepadList;I)V

    .line 47
    return-void
.end method

.method public onInputDeviceRemoved(I)V
    .locals 1
    .param p1, "deviceId"    # I

    .prologue
    .line 51
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadList$1;->this$0:Lorg/chromium/content/browser/input/GamepadList;

    # invokes: Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceRemovedImpl(I)V
    invoke-static {v0, p1}, Lorg/chromium/content/browser/input/GamepadList;->access$100(Lorg/chromium/content/browser/input/GamepadList;I)V

    .line 52
    return-void
.end method

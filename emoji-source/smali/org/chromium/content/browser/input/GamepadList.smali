.class public Lorg/chromium/content/browser/input/GamepadList;
.super Ljava/lang/Object;
.source "GamepadList.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/input/GamepadList$LazyHolder;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final MAX_GAMEPADS:I = 0x4


# instance fields
.field private mAttachedToWindowCounter:I

.field private final mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

.field private mInputDeviceListener:Landroid/hardware/input/InputManager$InputDeviceListener;

.field private mInputManager:Landroid/hardware/input/InputManager;

.field private mIsGamepadAccessed:Z

.field private final mLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lorg/chromium/content/browser/input/GamepadList;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/input/GamepadList;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    .line 34
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/chromium/content/browser/input/GamepadDevice;

    iput-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    .line 42
    new-instance v0, Lorg/chromium/content/browser/input/GamepadList$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/input/GamepadList$1;-><init>(Lorg/chromium/content/browser/input/GamepadList;)V

    iput-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputDeviceListener:Landroid/hardware/input/InputManager$InputDeviceListener;

    .line 59
    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/content/browser/input/GamepadList$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/content/browser/input/GamepadList$1;

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/chromium/content/browser/input/GamepadList;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/input/GamepadList;I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/GamepadList;
    .param p1, "x1"    # I

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceChangedImpl(I)V

    return-void
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/input/GamepadList;I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/GamepadList;
    .param p1, "x1"    # I

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceRemovedImpl(I)V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/input/GamepadList;I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/GamepadList;
    .param p1, "x1"    # I

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->onInputDeviceAddedImpl(I)V

    return-void
.end method

.method private attachedToWindow(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 88
    iget v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mAttachedToWindowCounter:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mAttachedToWindowCounter:I

    if-nez v0, :cond_0

    .line 89
    const-string v0, "input"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/input/InputManager;

    iput-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputManager:Landroid/hardware/input/InputManager;

    .line 90
    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 91
    :try_start_0
    invoke-direct {p0}, Lorg/chromium/content/browser/input/GamepadList;->initializeDevices()V

    .line 92
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputManager:Landroid/hardware/input/InputManager;

    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputDeviceListener:Landroid/hardware/input/InputManager$InputDeviceListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/hardware/input/InputManager;->registerInputDeviceListener(Landroid/hardware/input/InputManager$InputDeviceListener;Landroid/os/Handler;)V

    .line 96
    :cond_0
    return-void

    .line 92
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private detachedFromWindow()V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 110
    iget v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mAttachedToWindowCounter:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mAttachedToWindowCounter:I

    if-nez v1, :cond_1

    .line 111
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 112
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 113
    :try_start_0
    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    const/4 v3, 0x0

    aput-object v3, v1, v0

    .line 112
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 115
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputManager:Landroid/hardware/input/InputManager;

    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputDeviceListener:Landroid/hardware/input/InputManager$InputDeviceListener;

    invoke-virtual {v1, v2}, Landroid/hardware/input/InputManager;->unregisterInputDeviceListener(Landroid/hardware/input/InputManager$InputDeviceListener;)V

    .line 117
    iput-object v4, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputManager:Landroid/hardware/input/InputManager;

    .line 119
    .end local v0    # "i":I
    :cond_1
    return-void

    .line 115
    .restart local v0    # "i":I
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2
    .param p0, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v0, 0x0

    .line 184
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v1

    if-nez v1, :cond_1

    .line 186
    :cond_0
    :goto_0
    return v0

    .line 185
    :cond_1
    invoke-static {p0}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 186
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/input/GamepadList;->handleKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method private getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 175
    sget-boolean v0, Lorg/chromium/content/browser/input/GamepadList;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    if-ltz p1, :cond_0

    const/4 v0, 0x4

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 176
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    aget-object v0, v0, p1

    return-object v0
.end method

.method private getDeviceById(I)Lorg/chromium/content/browser/input/GamepadDevice;
    .locals 3
    .param p1, "deviceId"    # I

    .prologue
    .line 164
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 165
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    aget-object v0, v2, v1

    .line 166
    .local v0, "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getId()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 170
    .end local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :goto_1
    return-object v0

    .line 164
    .restart local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 170
    .end local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private getDeviceCount()I
    .locals 3

    .prologue
    .line 147
    const/4 v0, 0x0

    .line 148
    .local v0, "count":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 149
    invoke-direct {p0, v1}, Lorg/chromium/content/browser/input/GamepadList;->getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 150
    add-int/lit8 v0, v0, 0x1

    .line 148
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 153
    :cond_1
    return v0
.end method

.method private getGamepadForEvent(Landroid/view/InputEvent;)Lorg/chromium/content/browser/input/GamepadDevice;
    .locals 1
    .param p1, "event"    # Landroid/view/InputEvent;

    .prologue
    .line 256
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDeviceId()I

    move-result v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/GamepadList;->getDeviceById(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    return-object v0
.end method

.method private static getInstance()Lorg/chromium/content/browser/input/GamepadList;
    .locals 1

    .prologue
    .line 142
    sget-boolean v0, Lorg/chromium/content/browser/input/GamepadList;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 143
    :cond_0
    # getter for: Lorg/chromium/content/browser/input/GamepadList$LazyHolder;->INSTANCE:Lorg/chromium/content/browser/input/GamepadList;
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList$LazyHolder;->access$300()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    return-object v0
.end method

.method private getNextAvailableIndex()I
    .locals 2

    .prologue
    .line 224
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 225
    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/GamepadList;->getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v1

    if-nez v1, :cond_0

    .line 230
    .end local v0    # "i":I
    :goto_1
    return v0

    .line 224
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 230
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private grabGamepadData(J)V
    .locals 13
    .param p1, "webGamepadsPtr"    # J

    .prologue
    .line 295
    iget-object v12, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v12

    .line 296
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    const/4 v1, 0x4

    if-ge v4, v1, :cond_1

    .line 297
    :try_start_0
    invoke-direct {p0, v4}, Lorg/chromium/content/browser/input/GamepadList;->getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    .line 298
    .local v0, "device":Lorg/chromium/content/browser/input/GamepadDevice;
    if-eqz v0, :cond_0

    .line 299
    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->updateButtonsAndAxesMapping()V

    .line 300
    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->isStandardGamepad()Z

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getTimestamp()J

    move-result-wide v8

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getAxes()[F

    move-result-object v10

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getButtons()[F

    move-result-object v11

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v11}, Lorg/chromium/content/browser/input/GamepadList;->nativeSetGamepadData(JIZZLjava/lang/String;J[F[F)V

    .line 296
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 304
    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v11}, Lorg/chromium/content/browser/input/GamepadList;->nativeSetGamepadData(JIZZLjava/lang/String;J[F[F)V

    goto :goto_1

    .line 307
    .end local v0    # "device":Lorg/chromium/content/browser/input/GamepadDevice;
    :catchall_0
    move-exception v1

    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :try_start_1
    monitor-exit v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 308
    return-void
.end method

.method private handleKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x0

    .line 190
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 191
    :try_start_0
    iget-boolean v3, p0, Lorg/chromium/content/browser/input/GamepadList;->mIsGamepadAccessed:Z

    if-nez v3, :cond_0

    monitor-exit v2

    .line 194
    :goto_0
    return v1

    .line 192
    :cond_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->getGamepadForEvent(Landroid/view/InputEvent;)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    .line 193
    .local v0, "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    if-nez v0, :cond_1

    monitor-exit v2

    goto :goto_0

    .line 195
    .end local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 194
    .restart local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :cond_1
    :try_start_1
    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/input/GamepadDevice;->handleKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private handleMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v1, 0x0

    .line 209
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 210
    :try_start_0
    iget-boolean v3, p0, Lorg/chromium/content/browser/input/GamepadList;->mIsGamepadAccessed:Z

    if-nez v3, :cond_0

    monitor-exit v2

    .line 213
    :goto_0
    return v1

    .line 211
    :cond_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->getGamepadForEvent(Landroid/view/InputEvent;)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    .line 212
    .local v0, "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    if-nez v0, :cond_1

    monitor-exit v2

    goto :goto_0

    .line 214
    .end local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 213
    .restart local v0    # "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    :cond_1
    :try_start_1
    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/input/GamepadDevice;->handleMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private initializeDevices()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 64
    iget-object v3, p0, Lorg/chromium/content/browser/input/GamepadList;->mInputManager:Landroid/hardware/input/InputManager;

    invoke-virtual {v3}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    move-result-object v0

    .line 65
    .local v0, "deviceIds":[I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v3, v0

    if-ge v1, v3, :cond_1

    .line 66
    aget v3, v0, v1

    invoke-static {v3}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v2

    .line 68
    .local v2, "inputDevice":Landroid/view/InputDevice;
    invoke-static {v2}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadDevice(Landroid/view/InputDevice;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 70
    invoke-direct {p0, v2}, Lorg/chromium/content/browser/input/GamepadList;->registerGamepad(Landroid/view/InputDevice;)Z

    .line 65
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 73
    .end local v2    # "inputDevice":Landroid/view/InputDevice;
    :cond_1
    return-void
.end method

.method private isDeviceConnected(I)Z
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 157
    const/4 v0, 0x4

    if-ge p1, v0, :cond_0

    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 158
    const/4 v0, 0x1

    .line 160
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isGamepadDevice(Landroid/view/InputDevice;)Z
    .locals 3
    .param p0, "inputDevice"    # Landroid/view/InputDevice;

    .prologue
    const v2, 0x1000010

    const/4 v0, 0x0

    .line 250
    if-nez p0, :cond_1

    .line 251
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/InputDevice;->getSources()I

    move-result v1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static isGamepadEvent(Landroid/view/KeyEvent;)Z
    .locals 2
    .param p0, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 270
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 271
    .local v0, "keyCode":I
    packed-switch v0, :pswitch_data_0

    .line 280
    invoke-static {v0}, Landroid/view/KeyEvent;->isGamepadButton(I)Z

    move-result v1

    :goto_0
    return v1

    .line 278
    :pswitch_0
    const/4 v1, 0x1

    goto :goto_0

    .line 271
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static isGamepadEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p0, "event"    # Landroid/view/MotionEvent;

    .prologue
    const v1, 0x1000010

    .line 263
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isGamepadSupported()Z
    .locals 2

    .prologue
    .line 285
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private native nativeSetGamepadData(JIZZLjava/lang/String;J[F[F)V
.end method

.method static notifyForGamepadsAccess(Z)V
    .locals 2
    .param p0, "isAccessPaused"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 312
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 314
    :goto_0
    return-void

    .line 313
    :cond_0
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v1

    if-nez p0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-direct {v1, v0}, Lorg/chromium/content/browser/input/GamepadList;->setIsGamepadAccessed(Z)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static onAttachedToWindow(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 81
    sget-boolean v0, Lorg/chromium/content/browser/input/GamepadList;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/chromium/base/ThreadUtils;->runningOnUiThread()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 82
    :cond_0
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    :goto_0
    return-void

    .line 83
    :cond_1
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/input/GamepadList;->attachedToWindow(Landroid/content/Context;)V

    goto :goto_0
.end method

.method public static onDetachedFromWindow()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    .prologue
    .line 103
    sget-boolean v0, Lorg/chromium/content/browser/input/GamepadList;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/chromium/base/ThreadUtils;->runningOnUiThread()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 104
    :cond_0
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v0

    if-nez v0, :cond_1

    .line 106
    :goto_0
    return-void

    .line 105
    :cond_1
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    invoke-direct {v0}, Lorg/chromium/content/browser/input/GamepadList;->detachedFromWindow()V

    goto :goto_0
.end method

.method public static onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p0, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v0, 0x0

    .line 203
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v1

    if-nez v1, :cond_1

    .line 205
    :cond_0
    :goto_0
    return v0

    .line 204
    :cond_1
    invoke-static {p0}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 205
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/input/GamepadList;->handleMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method private onInputDeviceAddedImpl(I)V
    .locals 3
    .param p1, "deviceId"    # I

    .prologue
    .line 132
    invoke-static {p1}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    .line 133
    .local v0, "inputDevice":Landroid/view/InputDevice;
    invoke-static {v0}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadDevice(Landroid/view/InputDevice;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 137
    :goto_0
    return-void

    .line 134
    :cond_0
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 135
    :try_start_0
    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/GamepadList;->registerGamepad(Landroid/view/InputDevice;)Z

    .line 136
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private onInputDeviceChangedImpl(I)V
    .locals 0
    .param p1, "deviceId"    # I

    .prologue
    .line 123
    return-void
.end method

.method private onInputDeviceRemovedImpl(I)V
    .locals 2
    .param p1, "deviceId"    # I

    .prologue
    .line 126
    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 127
    :try_start_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->unregisterGamepad(I)V

    .line 128
    monitor-exit v1

    .line 129
    return-void

    .line 128
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private registerGamepad(Landroid/view/InputDevice;)Z
    .locals 3
    .param p1, "inputDevice"    # Landroid/view/InputDevice;

    .prologue
    .line 234
    invoke-direct {p0}, Lorg/chromium/content/browser/input/GamepadList;->getNextAvailableIndex()I

    move-result v1

    .line 235
    .local v1, "index":I
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v2, 0x0

    .line 239
    :goto_0
    return v2

    .line 237
    :cond_0
    new-instance v0, Lorg/chromium/content/browser/input/GamepadDevice;

    invoke-direct {v0, v1, p1}, Lorg/chromium/content/browser/input/GamepadDevice;-><init>(ILandroid/view/InputDevice;)V

    .line 238
    .local v0, "gamepad":Lorg/chromium/content/browser/input/GamepadDevice;
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    aput-object v0, v2, v1

    .line 239
    const/4 v2, 0x1

    goto :goto_0
.end method

.method private setIsGamepadAccessed(Z)V
    .locals 4
    .param p1, "isGamepadAccessed"    # Z

    .prologue
    .line 317
    iget-object v3, p0, Lorg/chromium/content/browser/input/GamepadList;->mLock:Ljava/lang/Object;

    monitor-enter v3

    .line 318
    :try_start_0
    iput-boolean p1, p0, Lorg/chromium/content/browser/input/GamepadList;->mIsGamepadAccessed:Z

    .line 319
    if-eqz p1, :cond_1

    .line 320
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 321
    invoke-direct {p0, v1}, Lorg/chromium/content/browser/input/GamepadList;->getDevice(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    .line 322
    .local v0, "gamepadDevice":Lorg/chromium/content/browser/input/GamepadDevice;
    if-nez v0, :cond_0

    .line 320
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->clearData()V

    goto :goto_1

    .line 326
    .end local v0    # "gamepadDevice":Lorg/chromium/content/browser/input/GamepadDevice;
    .end local v1    # "i":I
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    return-void
.end method

.method private unregisterGamepad(I)V
    .locals 4
    .param p1, "deviceId"    # I

    .prologue
    .line 243
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->getDeviceById(I)Lorg/chromium/content/browser/input/GamepadDevice;

    move-result-object v0

    .line 244
    .local v0, "gamepadDevice":Lorg/chromium/content/browser/input/GamepadDevice;
    if-nez v0, :cond_0

    .line 247
    :goto_0
    return-void

    .line 245
    :cond_0
    invoke-virtual {v0}, Lorg/chromium/content/browser/input/GamepadDevice;->getIndex()I

    move-result v1

    .line 246
    .local v1, "index":I
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadList;->mGamepadDevices:[Lorg/chromium/content/browser/input/GamepadDevice;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    goto :goto_0
.end method

.method static updateGamepadData(J)V
    .locals 2
    .param p0, "webGamepadsPtr"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 290
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    :goto_0
    return-void

    .line 291
    :cond_0
    invoke-static {}, Lorg/chromium/content/browser/input/GamepadList;->getInstance()Lorg/chromium/content/browser/input/GamepadList;

    move-result-object v0

    invoke-direct {v0, p0, p1}, Lorg/chromium/content/browser/input/GamepadList;->grabGamepadData(J)V

    goto :goto_0
.end method

.class Lorg/chromium/content/browser/input/GamepadDevice;
.super Ljava/lang/Object;
.source "GamepadDevice.java"


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mAxes:[I

.field private final mAxisValues:[F

.field private final mButtonsValues:[F

.field private mDeviceId:I

.field private mDeviceIndex:I

.field private mDeviceName:Ljava/lang/String;

.field private mIsStandardGamepad:Z

.field private final mRawAxes:[F

.field private final mRawButtons:[F

.field private mTimestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lorg/chromium/content/browser/input/GamepadDevice;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/input/GamepadDevice;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(ILandroid/view/InputDevice;)V
    .locals 9
    .param p1, "index"    # I
    .param p2, "inputDevice"    # Landroid/view/InputDevice;

    .prologue
    const/16 v8, 0x100

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v6, 0x4

    new-array v6, v6, [F

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxisValues:[F

    .line 35
    const/16 v6, 0x11

    new-array v6, v6, [F

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mButtonsValues:[F

    .line 41
    new-array v6, v8, [F

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawButtons:[F

    .line 42
    new-array v6, v8, [F

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawAxes:[F

    .line 51
    iput p1, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceIndex:I

    .line 52
    invoke-virtual {p2}, Landroid/view/InputDevice;->getId()I

    move-result v6

    iput v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceId:I

    .line 53
    invoke-virtual {p2}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceName:Ljava/lang/String;

    .line 54
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mTimestamp:J

    .line 56
    invoke-virtual {p2}, Landroid/view/InputDevice;->getMotionRanges()Ljava/util/List;

    move-result-object v5

    .line 57
    .local v5, "ranges":Ljava/util/List;, "Ljava/util/List<Landroid/view/InputDevice$MotionRange;>;"
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [I

    iput-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxes:[I

    .line 58
    const/4 v1, 0x0

    .line 59
    .local v1, "i":I
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/InputDevice$MotionRange;

    .line 60
    .local v4, "range":Landroid/view/InputDevice$MotionRange;
    invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getSource()I

    move-result v6

    and-int/lit8 v6, v6, 0x10

    if-eqz v6, :cond_0

    .line 61
    invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v0

    .line 62
    .local v0, "axis":I
    sget-boolean v6, Lorg/chromium/content/browser/input/GamepadDevice;->$assertionsDisabled:Z

    if-nez v6, :cond_1

    if-lt v0, v8, :cond_1

    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6

    .line 63
    :cond_1
    iget-object v6, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxes:[I

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "i":I
    .local v2, "i":I
    aput v0, v6, v1

    move v1, v2

    .end local v2    # "i":I
    .restart local v1    # "i":I
    goto :goto_0

    .line 66
    .end local v0    # "axis":I
    .end local v4    # "range":Landroid/view/InputDevice$MotionRange;
    :cond_2
    return-void
.end method


# virtual methods
.method public clearData()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 116
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxisValues:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 117
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawAxes:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 118
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mButtonsValues:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 119
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawButtons:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 120
    return-void
.end method

.method public getAxes()[F
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxisValues:[F

    return-object v0
.end method

.method public getButtons()[F
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mButtonsValues:[F

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceId:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceIndex:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .prologue
    .line 99
    iget-wide v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mTimestamp:J

    return-wide v0
.end method

.method public handleKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x1

    .line 128
    invoke-static {p1}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadEvent(Landroid/view/KeyEvent;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    .line 139
    :goto_0
    return v1

    .line 129
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 130
    .local v0, "keyCode":I
    sget-boolean v2, Lorg/chromium/content/browser/input/GamepadDevice;->$assertionsDisabled:Z

    if-nez v2, :cond_1

    const/16 v2, 0x100

    if-lt v0, v2, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 132
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_3

    .line 133
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawButtons:[F

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v2, v0

    .line 137
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mTimestamp:J

    goto :goto_0

    .line 134
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 135
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawButtons:[F

    const/4 v3, 0x0

    aput v3, v2, v0

    goto :goto_1
.end method

.method public handleMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 148
    invoke-static {p1}, Lorg/chromium/content/browser/input/GamepadList;->isGamepadEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 155
    :goto_0
    return v2

    .line 150
    :cond_0
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxes:[I

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 151
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxes:[I

    aget v0, v2, v1

    .line 152
    .local v0, "axis":I
    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawAxes:[F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    aput v3, v2, v0

    .line 150
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 154
    .end local v0    # "axis":I
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mTimestamp:J

    .line 155
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public isStandardGamepad()Z
    .locals 1

    .prologue
    .line 84
    iget-boolean v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mIsStandardGamepad:Z

    return v0
.end method

.method public updateButtonsAndAxesMapping()V
    .locals 5

    .prologue
    .line 72
    iget-object v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mAxisValues:[F

    iget-object v1, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mButtonsValues:[F

    iget-object v2, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawAxes:[F

    iget-object v3, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mRawButtons:[F

    iget-object v4, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mDeviceName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lorg/chromium/content/browser/input/GamepadMappings;->mapToStandardGamepad([F[F[F[FLjava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/content/browser/input/GamepadDevice;->mIsStandardGamepad:Z

    .line 74
    return-void
.end method

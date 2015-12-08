.class Lorg/chromium/content/browser/input/GamepadMappings;
.super Ljava/lang/Object;
.source "GamepadMappings.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final MICROSOFT_XBOX_PAD_DEVICE_NAME:Ljava/lang/String; = "Microsoft X-Box 360 pad"

.field private static final NVIDIA_SHIELD_DEVICE_NAME_PREFIX:Ljava/lang/String; = "NVIDIA Corporation NVIDIA Controller"

.field private static final PS3_SIXAXIS_DEVICE_NAME:Ljava/lang/String; = "Sony PLAYSTATION(R)3 Controller"

.field private static final SAMSUNG_EI_GP20_DEVICE_NAME:Ljava/lang/String; = "Samsung Game Pad EI-GP20"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static mapCommonDpadButtons([F[F)V
    .locals 5
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F

    .prologue
    .line 79
    const/16 v4, 0x14

    aget v0, p1, v4

    .line 80
    .local v0, "dpadDown":F
    const/16 v4, 0x13

    aget v3, p1, v4

    .line 81
    .local v3, "dpadUp":F
    const/16 v4, 0x15

    aget v1, p1, v4

    .line 82
    .local v1, "dpadLeft":F
    const/16 v4, 0x16

    aget v2, p1, v4

    .line 83
    .local v2, "dpadRight":F
    const/16 v4, 0xd

    aput v0, p0, v4

    .line 84
    const/16 v4, 0xc

    aput v3, p0, v4

    .line 85
    const/16 v4, 0xe

    aput v1, p0, v4

    .line 86
    const/16 v4, 0xf

    aput v2, p0, v4

    .line 87
    return-void
.end method

.method private static mapCommonStartSelectMetaButtons([F[F)V
    .locals 4
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F

    .prologue
    .line 56
    const/16 v3, 0x6c

    aget v2, p1, v3

    .line 57
    .local v2, "start":F
    const/16 v3, 0x6d

    aget v1, p1, v3

    .line 58
    .local v1, "select":F
    const/16 v3, 0x6e

    aget v0, p1, v3

    .line 59
    .local v0, "mode":F
    const/16 v3, 0x9

    aput v2, p0, v3

    .line 60
    const/16 v3, 0x8

    aput v1, p0, v3

    .line 61
    const/16 v3, 0x10

    aput v0, p0, v3

    .line 62
    return-void
.end method

.method private static mapCommonThumbstickButtons([F[F)V
    .locals 3
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F

    .prologue
    .line 65
    const/16 v2, 0x6a

    aget v0, p1, v2

    .line 66
    .local v0, "thumbL":F
    const/16 v2, 0x6b

    aget v1, p1, v2

    .line 67
    .local v1, "thumbR":F
    const/16 v2, 0xa

    aput v0, p0, v2

    .line 68
    const/16 v2, 0xb

    aput v1, p0, v2

    .line 69
    return-void
.end method

.method private static mapCommonTriggerButtons([F[F)V
    .locals 3
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F

    .prologue
    .line 72
    const/16 v2, 0x66

    aget v0, p1, v2

    .line 73
    .local v0, "l1":F
    const/16 v2, 0x67

    aget v1, p1, v2

    .line 74
    .local v1, "r1":F
    const/4 v2, 0x6

    aput v0, p0, v2

    .line 75
    const/4 v2, 0x7

    aput v1, p0, v2

    .line 76
    return-void
.end method

.method private static mapCommonXYABButtons([F[F)V
    .locals 5
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F

    .prologue
    .line 44
    const/16 v4, 0x60

    aget v0, p1, v4

    .line 45
    .local v0, "a":F
    const/16 v4, 0x61

    aget v1, p1, v4

    .line 46
    .local v1, "b":F
    const/16 v4, 0x63

    aget v2, p1, v4

    .line 47
    .local v2, "x":F
    const/16 v4, 0x64

    aget v3, p1, v4

    .line 48
    .local v3, "y":F
    const/4 v4, 0x0

    aput v0, p0, v4

    .line 49
    const/4 v4, 0x1

    aput v1, p0, v4

    .line 50
    const/4 v4, 0x2

    aput v2, p0, v4

    .line 51
    const/4 v4, 0x3

    aput v3, p0, v4

    .line 52
    return-void
.end method

.method private static mapHatAxisToDpadButtons([F[F)V
    .locals 5
    .param p0, "mappedButtons"    # [F
    .param p1, "rawAxes"    # [F

    .prologue
    const/16 v4, 0xf

    .line 120
    aget v0, p1, v4

    .line 121
    .local v0, "hatX":F
    const/16 v2, 0x10

    aget v1, p1, v2

    .line 122
    .local v1, "hatY":F
    const/16 v2, 0xe

    invoke-static {v0}, Lorg/chromium/content/browser/input/GamepadMappings;->negativeAxisValueAsButton(F)F

    move-result v3

    aput v3, p0, v2

    .line 123
    invoke-static {v0}, Lorg/chromium/content/browser/input/GamepadMappings;->positiveAxisValueAsButton(F)F

    move-result v2

    aput v2, p0, v4

    .line 124
    const/16 v2, 0xc

    invoke-static {v1}, Lorg/chromium/content/browser/input/GamepadMappings;->negativeAxisValueAsButton(F)F

    move-result v3

    aput v3, p0, v2

    .line 125
    const/16 v2, 0xd

    invoke-static {v1}, Lorg/chromium/content/browser/input/GamepadMappings;->positiveAxisValueAsButton(F)F

    move-result v3

    aput v3, p0, v2

    .line 126
    return-void
.end method

.method private static mapPS3SixAxisGamepad([F[F[F[F)V
    .locals 5
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F
    .param p2, "mappedAxes"    # [F
    .param p3, "rawAxes"    # [F

    .prologue
    .line 158
    const/16 v4, 0x60

    aget v0, p1, v4

    .line 159
    .local v0, "a":F
    const/16 v4, 0x61

    aget v1, p1, v4

    .line 160
    .local v1, "b":F
    const/16 v4, 0x63

    aget v2, p1, v4

    .line 161
    .local v2, "x":F
    const/16 v4, 0x64

    aget v3, p1, v4

    .line 162
    .local v3, "y":F
    const/4 v4, 0x0

    aput v2, p0, v4

    .line 163
    const/4 v4, 0x1

    aput v3, p0, v4

    .line 164
    const/4 v4, 0x2

    aput v0, p0, v4

    .line 165
    const/4 v4, 0x3

    aput v1, p0, v4

    .line 167
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonTriggerButtons([F[F)V

    .line 168
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonThumbstickButtons([F[F)V

    .line 169
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonDpadButtons([F[F)V

    .line 170
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonStartSelectMetaButtons([F[F)V

    .line 171
    invoke-static {p0, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapTriggerAxexToShoulderButtons([F[F)V

    .line 173
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapXYAxes([F[F)V

    .line 174
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapZAndRZAxesToRightStick([F[F)V

    .line 175
    return-void
.end method

.method private static mapRXAndRYAxesToRightStick([F[F)V
    .locals 2
    .param p0, "mappedAxes"    # [F
    .param p1, "rawAxes"    # [F

    .prologue
    .line 95
    const/4 v0, 0x2

    const/16 v1, 0xc

    aget v1, p1, v1

    aput v1, p0, v0

    .line 96
    const/4 v0, 0x3

    const/16 v1, 0xd

    aget v1, p1, v1

    aput v1, p0, v0

    .line 97
    return-void
.end method

.method private static mapSamsungEIGP20Gamepad([F[F[F[F)V
    .locals 0
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F
    .param p2, "mappedAxes"    # [F
    .param p3, "rawAxes"    # [F

    .prologue
    .line 179
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonXYABButtons([F[F)V

    .line 180
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonTriggerButtons([F[F)V

    .line 181
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonThumbstickButtons([F[F)V

    .line 182
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonStartSelectMetaButtons([F[F)V

    .line 183
    invoke-static {p0, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapHatAxisToDpadButtons([F[F)V

    .line 185
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapXYAxes([F[F)V

    .line 186
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapRXAndRYAxesToRightStick([F[F)V

    .line 187
    return-void
.end method

.method private static mapShieldGamepad([F[F[F[F)V
    .locals 0
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F
    .param p2, "mappedAxes"    # [F
    .param p3, "rawAxes"    # [F

    .prologue
    .line 134
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonXYABButtons([F[F)V

    .line 135
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonTriggerButtons([F[F)V

    .line 136
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonThumbstickButtons([F[F)V

    .line 137
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonStartSelectMetaButtons([F[F)V

    .line 138
    invoke-static {p0, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapTriggerAxexToShoulderButtons([F[F)V

    .line 139
    invoke-static {p0, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapHatAxisToDpadButtons([F[F)V

    .line 141
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapXYAxes([F[F)V

    .line 142
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapZAndRZAxesToRightStick([F[F)V

    .line 143
    return-void
.end method

.method public static mapToStandardGamepad([F[F[F[FLjava/lang/String;)Z
    .locals 2
    .param p0, "mappedAxes"    # [F
    .param p1, "mappedButtons"    # [F
    .param p2, "rawAxes"    # [F
    .param p3, "rawButtons"    # [F
    .param p4, "deviceName"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    .line 25
    const-string v1, "NVIDIA Corporation NVIDIA Controller"

    invoke-virtual {p4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 26
    invoke-static {p1, p3, p0, p2}, Lorg/chromium/content/browser/input/GamepadMappings;->mapShieldGamepad([F[F[F[F)V

    .line 40
    :goto_0
    return v0

    .line 28
    :cond_0
    const-string v1, "Microsoft X-Box 360 pad"

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    invoke-static {p1, p3, p0, p2}, Lorg/chromium/content/browser/input/GamepadMappings;->mapXBox360Gamepad([F[F[F[F)V

    goto :goto_0

    .line 31
    :cond_1
    const-string v1, "Sony PLAYSTATION(R)3 Controller"

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 32
    invoke-static {p1, p3, p0, p2}, Lorg/chromium/content/browser/input/GamepadMappings;->mapPS3SixAxisGamepad([F[F[F[F)V

    goto :goto_0

    .line 34
    :cond_2
    const-string v1, "Samsung Game Pad EI-GP20"

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 35
    invoke-static {p1, p3, p0, p2}, Lorg/chromium/content/browser/input/GamepadMappings;->mapSamsungEIGP20Gamepad([F[F[F[F)V

    goto :goto_0

    .line 39
    :cond_3
    invoke-static {p1, p3, p0, p2}, Lorg/chromium/content/browser/input/GamepadMappings;->mapUnknownGamepad([F[F[F[F)V

    .line 40
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static mapTriggerAxexToShoulderButtons([F[F)V
    .locals 3
    .param p0, "mappedButtons"    # [F
    .param p1, "rawAxes"    # [F

    .prologue
    .line 105
    const/16 v2, 0x11

    aget v0, p1, v2

    .line 106
    .local v0, "lTrigger":F
    const/16 v2, 0x12

    aget v1, p1, v2

    .line 107
    .local v1, "rTrigger":F
    const/4 v2, 0x4

    aput v0, p0, v2

    .line 108
    const/4 v2, 0x5

    aput v1, p0, v2

    .line 109
    return-void
.end method

.method private static mapUnknownGamepad([F[F[F[F)V
    .locals 0
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F
    .param p2, "mappedAxes"    # [F
    .param p3, "rawAxes"    # [F

    .prologue
    .line 195
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonXYABButtons([F[F)V

    .line 196
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonTriggerButtons([F[F)V

    .line 197
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonThumbstickButtons([F[F)V

    .line 198
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonStartSelectMetaButtons([F[F)V

    .line 199
    invoke-static {p0, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapTriggerAxexToShoulderButtons([F[F)V

    .line 200
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/GamepadMappings;->mapCommonDpadButtons([F[F)V

    .line 202
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapXYAxes([F[F)V

    .line 203
    invoke-static {p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapRXAndRYAxesToRightStick([F[F)V

    .line 204
    return-void
.end method

.method private static mapXBox360Gamepad([F[F[F[F)V
    .locals 0
    .param p0, "mappedButtons"    # [F
    .param p1, "rawButtons"    # [F
    .param p2, "mappedAxes"    # [F
    .param p3, "rawAxes"    # [F

    .prologue
    .line 152
    invoke-static {p0, p1, p2, p3}, Lorg/chromium/content/browser/input/GamepadMappings;->mapShieldGamepad([F[F[F[F)V

    .line 153
    return-void
.end method

.method private static mapXYAxes([F[F)V
    .locals 3
    .param p0, "mappedAxes"    # [F
    .param p1, "rawAxes"    # [F

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 90
    aget v0, p1, v1

    aput v0, p0, v1

    .line 91
    aget v0, p1, v2

    aput v0, p0, v2

    .line 92
    return-void
.end method

.method private static mapZAndRZAxesToRightStick([F[F)V
    .locals 2
    .param p0, "mappedAxes"    # [F
    .param p1, "rawAxes"    # [F

    .prologue
    .line 100
    const/4 v0, 0x2

    const/16 v1, 0xb

    aget v1, p1, v1

    aput v1, p0, v0

    .line 101
    const/4 v0, 0x3

    const/16 v1, 0xe

    aget v1, p1, v1

    aput v1, p0, v0

    .line 102
    return-void
.end method

.method private static negativeAxisValueAsButton(F)F
    .locals 1
    .param p0, "input"    # F

    .prologue
    .line 112
    const/high16 v0, -0x41000000    # -0.5f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static positiveAxisValueAsButton(F)F
    .locals 1
    .param p0, "input"    # F

    .prologue
    .line 116
    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

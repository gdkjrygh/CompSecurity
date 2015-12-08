.class public final enum Lcom/google/zxing/client/android/camera/FrontLightMode;
.super Ljava/lang/Enum;
.source "FrontLightMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/zxing/client/android/camera/FrontLightMode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AUTO:Lcom/google/zxing/client/android/camera/FrontLightMode;

.field private static final synthetic ENUM$VALUES:[Lcom/google/zxing/client/android/camera/FrontLightMode;

.field public static final enum OFF:Lcom/google/zxing/client/android/camera/FrontLightMode;

.field public static final enum ON:Lcom/google/zxing/client/android/camera/FrontLightMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Lcom/google/zxing/client/android/camera/FrontLightMode;

    const-string v1, "ON"

    invoke-direct {v0, v1, v2}, Lcom/google/zxing/client/android/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    .line 28
    sput-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->ON:Lcom/google/zxing/client/android/camera/FrontLightMode;

    .line 29
    new-instance v0, Lcom/google/zxing/client/android/camera/FrontLightMode;

    const-string v1, "AUTO"

    invoke-direct {v0, v1, v3}, Lcom/google/zxing/client/android/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    .line 30
    sput-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->AUTO:Lcom/google/zxing/client/android/camera/FrontLightMode;

    .line 31
    new-instance v0, Lcom/google/zxing/client/android/camera/FrontLightMode;

    const-string v1, "OFF"

    invoke-direct {v0, v1, v4}, Lcom/google/zxing/client/android/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    .line 32
    sput-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->OFF:Lcom/google/zxing/client/android/camera/FrontLightMode;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/zxing/client/android/camera/FrontLightMode;

    sget-object v1, Lcom/google/zxing/client/android/camera/FrontLightMode;->ON:Lcom/google/zxing/client/android/camera/FrontLightMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/zxing/client/android/camera/FrontLightMode;->AUTO:Lcom/google/zxing/client/android/camera/FrontLightMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/zxing/client/android/camera/FrontLightMode;->OFF:Lcom/google/zxing/client/android/camera/FrontLightMode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->ENUM$VALUES:[Lcom/google/zxing/client/android/camera/FrontLightMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static parse(Ljava/lang/String;)Lcom/google/zxing/client/android/camera/FrontLightMode;
    .locals 1
    .param p0, "modeString"    # Ljava/lang/String;

    .prologue
    .line 35
    if-nez p0, :cond_0

    sget-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->OFF:Lcom/google/zxing/client/android/camera/FrontLightMode;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/google/zxing/client/android/camera/FrontLightMode;->valueOf(Ljava/lang/String;)Lcom/google/zxing/client/android/camera/FrontLightMode;

    move-result-object v0

    goto :goto_0
.end method

.method public static readPref(Landroid/content/SharedPreferences;)Lcom/google/zxing/client/android/camera/FrontLightMode;
    .locals 2
    .param p0, "sharedPrefs"    # Landroid/content/SharedPreferences;

    .prologue
    .line 39
    const-string v0, "preferences_front_light_mode"

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/zxing/client/android/camera/FrontLightMode;->parse(Ljava/lang/String;)Lcom/google/zxing/client/android/camera/FrontLightMode;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/zxing/client/android/camera/FrontLightMode;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/google/zxing/client/android/camera/FrontLightMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/android/camera/FrontLightMode;

    return-object v0
.end method

.method public static values()[Lcom/google/zxing/client/android/camera/FrontLightMode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/google/zxing/client/android/camera/FrontLightMode;->ENUM$VALUES:[Lcom/google/zxing/client/android/camera/FrontLightMode;

    array-length v1, v0

    new-array v2, v1, [Lcom/google/zxing/client/android/camera/FrontLightMode;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

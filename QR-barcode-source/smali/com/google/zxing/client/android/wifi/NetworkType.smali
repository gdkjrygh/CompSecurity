.class final enum Lcom/google/zxing/client/android/wifi/NetworkType;
.super Ljava/lang/Enum;
.source "NetworkType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/zxing/client/android/wifi/NetworkType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/google/zxing/client/android/wifi/NetworkType;

.field public static final enum NO_PASSWORD:Lcom/google/zxing/client/android/wifi/NetworkType;

.field public static final enum WEP:Lcom/google/zxing/client/android/wifi/NetworkType;

.field public static final enum WPA:Lcom/google/zxing/client/android/wifi/NetworkType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lcom/google/zxing/client/android/wifi/NetworkType;

    const-string v1, "WEP"

    invoke-direct {v0, v1, v2}, Lcom/google/zxing/client/android/wifi/NetworkType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->WEP:Lcom/google/zxing/client/android/wifi/NetworkType;

    .line 22
    new-instance v0, Lcom/google/zxing/client/android/wifi/NetworkType;

    const-string v1, "WPA"

    invoke-direct {v0, v1, v3}, Lcom/google/zxing/client/android/wifi/NetworkType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->WPA:Lcom/google/zxing/client/android/wifi/NetworkType;

    .line 23
    new-instance v0, Lcom/google/zxing/client/android/wifi/NetworkType;

    const-string v1, "NO_PASSWORD"

    invoke-direct {v0, v1, v4}, Lcom/google/zxing/client/android/wifi/NetworkType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->NO_PASSWORD:Lcom/google/zxing/client/android/wifi/NetworkType;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/zxing/client/android/wifi/NetworkType;

    sget-object v1, Lcom/google/zxing/client/android/wifi/NetworkType;->WEP:Lcom/google/zxing/client/android/wifi/NetworkType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/zxing/client/android/wifi/NetworkType;->WPA:Lcom/google/zxing/client/android/wifi/NetworkType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/zxing/client/android/wifi/NetworkType;->NO_PASSWORD:Lcom/google/zxing/client/android/wifi/NetworkType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->ENUM$VALUES:[Lcom/google/zxing/client/android/wifi/NetworkType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static forIntentValue(Ljava/lang/String;)Lcom/google/zxing/client/android/wifi/NetworkType;
    .locals 1
    .param p0, "networkTypeString"    # Ljava/lang/String;

    .prologue
    .line 26
    if-nez p0, :cond_0

    .line 27
    sget-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->NO_PASSWORD:Lcom/google/zxing/client/android/wifi/NetworkType;

    .line 36
    :goto_0
    return-object v0

    .line 29
    :cond_0
    const-string v0, "WPA"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    sget-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->WPA:Lcom/google/zxing/client/android/wifi/NetworkType;

    goto :goto_0

    .line 32
    :cond_1
    const-string v0, "WEP"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 33
    sget-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->WEP:Lcom/google/zxing/client/android/wifi/NetworkType;

    goto :goto_0

    .line 35
    :cond_2
    const-string v0, "nopass"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 36
    sget-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->NO_PASSWORD:Lcom/google/zxing/client/android/wifi/NetworkType;

    goto :goto_0

    .line 38
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/zxing/client/android/wifi/NetworkType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/google/zxing/client/android/wifi/NetworkType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/android/wifi/NetworkType;

    return-object v0
.end method

.method public static values()[Lcom/google/zxing/client/android/wifi/NetworkType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/google/zxing/client/android/wifi/NetworkType;->ENUM$VALUES:[Lcom/google/zxing/client/android/wifi/NetworkType;

    array-length v1, v0

    new-array v2, v1, [Lcom/google/zxing/client/android/wifi/NetworkType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

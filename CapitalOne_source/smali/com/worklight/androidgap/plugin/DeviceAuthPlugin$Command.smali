.class final enum Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
.super Ljava/lang/Enum;
.source "DeviceAuthPlugin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "Command"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

.field public static final enum createCSR:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

.field public static final enum createDeviceAuthHeader:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

.field public static final enum init:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

.field public static final enum isCertificateExists:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

.field public static final enum noValue:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 32
    new-instance v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    const-string v1, "isCertificateExists"

    invoke-direct {v0, v1, v2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->isCertificateExists:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    new-instance v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    const-string v1, "createDeviceAuthHeader"

    invoke-direct {v0, v1, v3}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createDeviceAuthHeader:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    new-instance v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    const-string v1, "createCSR"

    invoke-direct {v0, v1, v4}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createCSR:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    new-instance v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    const-string v1, "init"

    invoke-direct {v0, v1, v5}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->init:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    new-instance v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    const-string v1, "noValue"

    invoke-direct {v0, v1, v6}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->noValue:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    .line 31
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->isCertificateExists:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    aput-object v1, v0, v2

    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createDeviceAuthHeader:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    aput-object v1, v0, v3

    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createCSR:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    aput-object v1, v0, v4

    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->init:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    aput-object v1, v0, v5

    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->noValue:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    aput-object v1, v0, v6

    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ENUM$VALUES:[Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
    .locals 2
    .param p0, "Str"    # Ljava/lang/String;

    .prologue
    .line 37
    :try_start_0
    invoke-static {p0}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->valueOf(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 39
    :goto_0
    return-object v1

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .local v0, "ex":Ljava/lang/Exception;
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->noValue:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    return-object v0
.end method

.method public static values()[Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ENUM$VALUES:[Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    array-length v1, v0

    new-array v2, v1, [Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

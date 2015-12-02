.class final enum Lcom/facebook/orca/f/ah;
.super Ljava/lang/Enum;
.source "ThreadsCacheUpdateRateLimiter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/f/ah;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/f/ah;

.field public static final enum DATA_KNOWN_TO_BE_STALE:Lcom/facebook/orca/f/ah;

.field public static final enum DEFAULT:Lcom/facebook/orca/f/ah;

.field public static final enum MQTT_CONNECTED:Lcom/facebook/orca/f/ah;

.field public static final enum MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED:Lcom/facebook/orca/f/ah;

.field public static final enum MQTT_RECENTLY_DISCONNECTED:Lcom/facebook/orca/f/ah;

.field public static final enum OLD_DATA:Lcom/facebook/orca/f/ah;

.field public static final enum SPECIFIC_INTENTION:Lcom/facebook/orca/f/ah;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 102
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "SPECIFIC_INTENTION"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->SPECIFIC_INTENTION:Lcom/facebook/orca/f/ah;

    .line 103
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "MQTT_RECENTLY_DISCONNECTED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->MQTT_RECENTLY_DISCONNECTED:Lcom/facebook/orca/f/ah;

    .line 104
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED:Lcom/facebook/orca/f/ah;

    .line 105
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "MQTT_CONNECTED"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->MQTT_CONNECTED:Lcom/facebook/orca/f/ah;

    .line 106
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "OLD_DATA"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->OLD_DATA:Lcom/facebook/orca/f/ah;

    .line 107
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "DATA_KNOWN_TO_BE_STALE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->DATA_KNOWN_TO_BE_STALE:Lcom/facebook/orca/f/ah;

    .line 108
    new-instance v0, Lcom/facebook/orca/f/ah;

    const-string v1, "DEFAULT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ah;->DEFAULT:Lcom/facebook/orca/f/ah;

    .line 101
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/orca/f/ah;

    sget-object v1, Lcom/facebook/orca/f/ah;->SPECIFIC_INTENTION:Lcom/facebook/orca/f/ah;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/f/ah;->MQTT_RECENTLY_DISCONNECTED:Lcom/facebook/orca/f/ah;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/f/ah;->MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED:Lcom/facebook/orca/f/ah;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/f/ah;->MQTT_CONNECTED:Lcom/facebook/orca/f/ah;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/f/ah;->OLD_DATA:Lcom/facebook/orca/f/ah;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/f/ah;->DATA_KNOWN_TO_BE_STALE:Lcom/facebook/orca/f/ah;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/orca/f/ah;->DEFAULT:Lcom/facebook/orca/f/ah;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/f/ah;->$VALUES:[Lcom/facebook/orca/f/ah;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 101
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/f/ah;
    .locals 1

    .prologue
    .line 101
    const-class v0, Lcom/facebook/orca/f/ah;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ah;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/f/ah;
    .locals 1

    .prologue
    .line 101
    sget-object v0, Lcom/facebook/orca/f/ah;->$VALUES:[Lcom/facebook/orca/f/ah;

    invoke-virtual {v0}, [Lcom/facebook/orca/f/ah;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/f/ah;

    return-object v0
.end method

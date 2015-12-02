.class public final enum Lcom/facebook/push/g;
.super Ljava/lang/Enum;
.source "PushSource.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/g;

.field public static final enum C2DM:Lcom/facebook/push/g;

.field public static final enum C2DM_OVER_MQTT:Lcom/facebook/push/g;

.field public static final enum INTEGRATION_TEST:Lcom/facebook/push/g;

.field public static final enum MMS:Lcom/facebook/push/g;

.field public static final enum MQTT:Lcom/facebook/push/g;

.field public static final enum SMS:Lcom/facebook/push/g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 9
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "C2DM"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->C2DM:Lcom/facebook/push/g;

    .line 10
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "MQTT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    .line 12
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "C2DM_OVER_MQTT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->C2DM_OVER_MQTT:Lcom/facebook/push/g;

    .line 13
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "SMS"

    invoke-direct {v0, v1, v6}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->SMS:Lcom/facebook/push/g;

    .line 14
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "MMS"

    invoke-direct {v0, v1, v7}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->MMS:Lcom/facebook/push/g;

    .line 15
    new-instance v0, Lcom/facebook/push/g;

    const-string v1, "INTEGRATION_TEST"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/g;->INTEGRATION_TEST:Lcom/facebook/push/g;

    .line 8
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/push/g;

    sget-object v1, Lcom/facebook/push/g;->C2DM:Lcom/facebook/push/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/push/g;->C2DM_OVER_MQTT:Lcom/facebook/push/g;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/push/g;->SMS:Lcom/facebook/push/g;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/push/g;->MMS:Lcom/facebook/push/g;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/push/g;->INTEGRATION_TEST:Lcom/facebook/push/g;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/push/g;->$VALUES:[Lcom/facebook/push/g;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/g;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/push/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/g;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/push/g;->$VALUES:[Lcom/facebook/push/g;

    invoke-virtual {v0}, [Lcom/facebook/push/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/g;

    return-object v0
.end method

.class public final enum Lcom/facebook/push/mqtt/bu;
.super Ljava/lang/Enum;
.source "MqttPushService.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/mqtt/bu;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/mqtt/bu;

.field public static final enum CONNECTED:Lcom/facebook/push/mqtt/bu;

.field public static final enum CONNECTING:Lcom/facebook/push/mqtt/bu;

.field public static final enum DISCONNECTED:Lcom/facebook/push/mqtt/bu;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 60
    new-instance v0, Lcom/facebook/push/mqtt/bu;

    const-string v1, "CONNECTING"

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/mqtt/bu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/bu;->CONNECTING:Lcom/facebook/push/mqtt/bu;

    .line 61
    new-instance v0, Lcom/facebook/push/mqtt/bu;

    const-string v1, "CONNECTED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/mqtt/bu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    .line 62
    new-instance v0, Lcom/facebook/push/mqtt/bu;

    const-string v1, "DISCONNECTED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/push/mqtt/bu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    .line 59
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/push/mqtt/bu;

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTING:Lcom/facebook/push/mqtt/bu;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/push/mqtt/bu;->$VALUES:[Lcom/facebook/push/mqtt/bu;

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
    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 59
    const-class v0, Lcom/facebook/push/mqtt/bu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/bu;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/facebook/push/mqtt/bu;->$VALUES:[Lcom/facebook/push/mqtt/bu;

    invoke-virtual {v0}, [Lcom/facebook/push/mqtt/bu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/mqtt/bu;

    return-object v0
.end method

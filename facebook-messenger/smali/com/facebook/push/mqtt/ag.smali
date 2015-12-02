.class final enum Lcom/facebook/push/mqtt/ag;
.super Ljava/lang/Enum;
.source "MqttConnectionManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/mqtt/ag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/mqtt/ag;

.field public static final enum BY_REQUEST:Lcom/facebook/push/mqtt/ag;

.field public static final enum CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

.field public static final enum CONNECT_FAILED:Lcom/facebook/push/mqtt/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 76
    new-instance v0, Lcom/facebook/push/mqtt/ag;

    const-string v1, "CONNECT_FAILED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/mqtt/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/ag;->CONNECT_FAILED:Lcom/facebook/push/mqtt/ag;

    .line 78
    new-instance v0, Lcom/facebook/push/mqtt/ag;

    const-string v1, "CONNECTION_LOST"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/mqtt/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    .line 80
    new-instance v0, Lcom/facebook/push/mqtt/ag;

    const-string v1, "BY_REQUEST"

    invoke-direct {v0, v1, v4}, Lcom/facebook/push/mqtt/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/ag;->BY_REQUEST:Lcom/facebook/push/mqtt/ag;

    .line 74
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/push/mqtt/ag;

    sget-object v1, Lcom/facebook/push/mqtt/ag;->CONNECT_FAILED:Lcom/facebook/push/mqtt/ag;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/push/mqtt/ag;->BY_REQUEST:Lcom/facebook/push/mqtt/ag;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/push/mqtt/ag;->$VALUES:[Lcom/facebook/push/mqtt/ag;

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
    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/mqtt/ag;
    .locals 1

    .prologue
    .line 74
    const-class v0, Lcom/facebook/push/mqtt/ag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ag;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/mqtt/ag;
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/facebook/push/mqtt/ag;->$VALUES:[Lcom/facebook/push/mqtt/ag;

    invoke-virtual {v0}, [Lcom/facebook/push/mqtt/ag;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/mqtt/ag;

    return-object v0
.end method

.class final enum Lcom/facebook/mqtt/n;
.super Ljava/lang/Enum;
.source "MqttClient.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/n;

.field public static final enum CONNECTED:Lcom/facebook/mqtt/n;

.field public static final enum CONNECTING:Lcom/facebook/mqtt/n;

.field public static final enum DISCONNECTED:Lcom/facebook/mqtt/n;

.field public static final enum INIT:Lcom/facebook/mqtt/n;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 73
    new-instance v0, Lcom/facebook/mqtt/n;

    const-string v1, "INIT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/n;->INIT:Lcom/facebook/mqtt/n;

    .line 74
    new-instance v0, Lcom/facebook/mqtt/n;

    const-string v1, "CONNECTING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/mqtt/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    .line 75
    new-instance v0, Lcom/facebook/mqtt/n;

    const-string v1, "CONNECTED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/mqtt/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;

    .line 76
    new-instance v0, Lcom/facebook/mqtt/n;

    const-string v1, "DISCONNECTED"

    invoke-direct {v0, v1, v5}, Lcom/facebook/mqtt/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    .line 72
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->INIT:Lcom/facebook/mqtt/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/mqtt/n;->$VALUES:[Lcom/facebook/mqtt/n;

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
    .line 72
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/n;
    .locals 1

    .prologue
    .line 72
    const-class v0, Lcom/facebook/mqtt/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/n;
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/facebook/mqtt/n;->$VALUES:[Lcom/facebook/mqtt/n;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/n;

    return-object v0
.end method

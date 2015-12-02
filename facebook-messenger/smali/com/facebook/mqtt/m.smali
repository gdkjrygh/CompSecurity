.class final enum Lcom/facebook/mqtt/m;
.super Ljava/lang/Enum;
.source "MqttClient.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/m;

.field public static final enum DISCONNECT:Lcom/facebook/mqtt/m;

.field public static final enum NETWORK_THREAD_LOOP:Lcom/facebook/mqtt/m;

.field public static final enum PING:Lcom/facebook/mqtt/m;

.field public static final enum PUBACK:Lcom/facebook/mqtt/m;

.field public static final enum PUBLISH:Lcom/facebook/mqtt/m;

.field public static final enum SUBSCRIBE:Lcom/facebook/mqtt/m;

.field public static final enum UNSUBSCRIBE:Lcom/facebook/mqtt/m;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 80
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "DISCONNECT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->DISCONNECT:Lcom/facebook/mqtt/m;

    .line 81
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "NETWORK_THREAD_LOOP"

    invoke-direct {v0, v1, v4}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->NETWORK_THREAD_LOOP:Lcom/facebook/mqtt/m;

    .line 82
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "PUBLISH"

    invoke-direct {v0, v1, v5}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->PUBLISH:Lcom/facebook/mqtt/m;

    .line 83
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "PUBACK"

    invoke-direct {v0, v1, v6}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->PUBACK:Lcom/facebook/mqtt/m;

    .line 84
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "PING"

    invoke-direct {v0, v1, v7}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->PING:Lcom/facebook/mqtt/m;

    .line 85
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "SUBSCRIBE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->SUBSCRIBE:Lcom/facebook/mqtt/m;

    .line 86
    new-instance v0, Lcom/facebook/mqtt/m;

    const-string v1, "UNSUBSCRIBE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/m;->UNSUBSCRIBE:Lcom/facebook/mqtt/m;

    .line 79
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/mqtt/m;

    sget-object v1, Lcom/facebook/mqtt/m;->DISCONNECT:Lcom/facebook/mqtt/m;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/mqtt/m;->NETWORK_THREAD_LOOP:Lcom/facebook/mqtt/m;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/mqtt/m;->PUBLISH:Lcom/facebook/mqtt/m;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/mqtt/m;->PUBACK:Lcom/facebook/mqtt/m;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/mqtt/m;->PING:Lcom/facebook/mqtt/m;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/mqtt/m;->SUBSCRIBE:Lcom/facebook/mqtt/m;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/mqtt/m;->UNSUBSCRIBE:Lcom/facebook/mqtt/m;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/mqtt/m;->$VALUES:[Lcom/facebook/mqtt/m;

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
    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/m;
    .locals 1

    .prologue
    .line 79
    const-class v0, Lcom/facebook/mqtt/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/m;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/m;
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lcom/facebook/mqtt/m;->$VALUES:[Lcom/facebook/mqtt/m;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/m;

    return-object v0
.end method

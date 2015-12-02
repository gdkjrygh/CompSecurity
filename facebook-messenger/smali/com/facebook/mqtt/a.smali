.class public final enum Lcom/facebook/mqtt/a;
.super Ljava/lang/Enum;
.source "ConnectionFailureReason.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/a;

.field public static final enum FAILED_CONNECTION_REFUSED:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_CONNECT_MESSAGE:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_CREATE_IOSTREAM:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_DNS_UNRESOLVED:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_INVALID_CONACK:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_SOCKET_CONNECT_ERROR:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_SOCKET_ERROR:Lcom/facebook/mqtt/a;

.field public static final enum FAILED_UNEXPECTED_DISCONNECT:Lcom/facebook/mqtt/a;

.field public static final enum MQTT_ERROR:Lcom/facebook/mqtt/a;

.field public static final enum NETWORK_ERROR:Lcom/facebook/mqtt/a;


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
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "NETWORK_ERROR"

    invoke-direct {v0, v1, v3}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->NETWORK_ERROR:Lcom/facebook/mqtt/a;

    .line 10
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "MQTT_ERROR"

    invoke-direct {v0, v1, v4}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->MQTT_ERROR:Lcom/facebook/mqtt/a;

    .line 11
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_SOCKET_ERROR"

    invoke-direct {v0, v1, v5}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_SOCKET_ERROR:Lcom/facebook/mqtt/a;

    .line 12
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_SOCKET_CONNECT_ERROR"

    invoke-direct {v0, v1, v6}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_SOCKET_CONNECT_ERROR:Lcom/facebook/mqtt/a;

    .line 13
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_CONNECT_MESSAGE"

    invoke-direct {v0, v1, v7}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_CONNECT_MESSAGE:Lcom/facebook/mqtt/a;

    .line 14
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_INVALID_CONACK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_INVALID_CONACK:Lcom/facebook/mqtt/a;

    .line 15
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_DNS_UNRESOLVED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_DNS_UNRESOLVED:Lcom/facebook/mqtt/a;

    .line 16
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_CREATE_IOSTREAM"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_CREATE_IOSTREAM:Lcom/facebook/mqtt/a;

    .line 17
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_CONNECTION_REFUSED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_CONNECTION_REFUSED:Lcom/facebook/mqtt/a;

    .line 18
    new-instance v0, Lcom/facebook/mqtt/a;

    const-string v1, "FAILED_UNEXPECTED_DISCONNECT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/a;->FAILED_UNEXPECTED_DISCONNECT:Lcom/facebook/mqtt/a;

    .line 8
    const/16 v0, 0xa

    new-array v0, v0, [Lcom/facebook/mqtt/a;

    sget-object v1, Lcom/facebook/mqtt/a;->NETWORK_ERROR:Lcom/facebook/mqtt/a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/mqtt/a;->MQTT_ERROR:Lcom/facebook/mqtt/a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_SOCKET_ERROR:Lcom/facebook/mqtt/a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_SOCKET_CONNECT_ERROR:Lcom/facebook/mqtt/a;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_CONNECT_MESSAGE:Lcom/facebook/mqtt/a;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_INVALID_CONACK:Lcom/facebook/mqtt/a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_DNS_UNRESOLVED:Lcom/facebook/mqtt/a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_CREATE_IOSTREAM:Lcom/facebook/mqtt/a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_CONNECTION_REFUSED:Lcom/facebook/mqtt/a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_UNEXPECTED_DISCONNECT:Lcom/facebook/mqtt/a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/mqtt/a;->$VALUES:[Lcom/facebook/mqtt/a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/a;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/mqtt/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/a;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/mqtt/a;->$VALUES:[Lcom/facebook/mqtt/a;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/a;

    return-object v0
.end method

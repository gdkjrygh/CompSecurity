.class public final enum Lcom/facebook/messages/model/threads/c;
.super Ljava/lang/Enum;
.source "Message.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/messages/model/threads/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/messages/model/threads/c;

.field public static final enum API:Lcom/facebook/messages/model/threads/c;

.field public static final enum C2DM:Lcom/facebook/messages/model/threads/c;

.field public static final enum CALL_LOG:Lcom/facebook/messages/model/threads/c;

.field public static final enum MMS:Lcom/facebook/messages/model/threads/c;

.field public static final enum MQTT:Lcom/facebook/messages/model/threads/c;

.field public static final enum SEND:Lcom/facebook/messages/model/threads/c;

.field public static final enum SMS:Lcom/facebook/messages/model/threads/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 54
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "API"

    invoke-direct {v0, v1, v3}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->API:Lcom/facebook/messages/model/threads/c;

    .line 55
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "CALL_LOG"

    invoke-direct {v0, v1, v4}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->CALL_LOG:Lcom/facebook/messages/model/threads/c;

    .line 56
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "C2DM"

    invoke-direct {v0, v1, v5}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->C2DM:Lcom/facebook/messages/model/threads/c;

    .line 57
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "MQTT"

    invoke-direct {v0, v1, v6}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->MQTT:Lcom/facebook/messages/model/threads/c;

    .line 58
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "MMS"

    invoke-direct {v0, v1, v7}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    .line 59
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "SEND"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->SEND:Lcom/facebook/messages/model/threads/c;

    .line 60
    new-instance v0, Lcom/facebook/messages/model/threads/c;

    const-string v1, "SMS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    .line 53
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/messages/model/threads/c;

    sget-object v1, Lcom/facebook/messages/model/threads/c;->API:Lcom/facebook/messages/model/threads/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/messages/model/threads/c;->CALL_LOG:Lcom/facebook/messages/model/threads/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/messages/model/threads/c;->C2DM:Lcom/facebook/messages/model/threads/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/messages/model/threads/c;->MQTT:Lcom/facebook/messages/model/threads/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/messages/model/threads/c;->SEND:Lcom/facebook/messages/model/threads/c;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/messages/model/threads/c;->$VALUES:[Lcom/facebook/messages/model/threads/c;

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
    .line 53
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/messages/model/threads/c;
    .locals 1

    .prologue
    .line 53
    const-class v0, Lcom/facebook/messages/model/threads/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/messages/model/threads/c;
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/facebook/messages/model/threads/c;->$VALUES:[Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v0}, [Lcom/facebook/messages/model/threads/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/messages/model/threads/c;

    return-object v0
.end method

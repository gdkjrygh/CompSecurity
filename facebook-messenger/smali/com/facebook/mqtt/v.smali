.class public final enum Lcom/facebook/mqtt/v;
.super Ljava/lang/Enum;
.source "MqttException.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/v;

.field public static final enum NOT_CONNECTED:Lcom/facebook/mqtt/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/facebook/mqtt/v;

    const-string v1, "NOT_CONNECTED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/mqtt/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    .line 10
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/mqtt/v;

    sget-object v1, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/mqtt/v;->$VALUES:[Lcom/facebook/mqtt/v;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/v;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/mqtt/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/v;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/v;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/mqtt/v;->$VALUES:[Lcom/facebook/mqtt/v;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/v;

    return-object v0
.end method

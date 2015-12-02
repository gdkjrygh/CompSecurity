.class final enum Lcom/facebook/mqtt/k;
.super Ljava/lang/Enum;
.source "MqttClient.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/k;

.field public static final enum ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/k;


# instance fields
.field private final mPosition:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 93
    new-instance v0, Lcom/facebook/mqtt/k;

    const-string v1, "ACKNOWLEDGED_DELIVERY"

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/mqtt/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/mqtt/k;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/k;

    .line 92
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/mqtt/k;

    sget-object v1, Lcom/facebook/mqtt/k;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/k;

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/mqtt/k;->$VALUES:[Lcom/facebook/mqtt/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 97
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 98
    if-ltz p3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bit position too small."

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 99
    const/16 v0, 0x40

    if-ge p3, v0, :cond_1

    :goto_1
    const-string v0, "Bit position too big."

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 100
    int-to-byte v0, p3

    iput-byte v0, p0, Lcom/facebook/mqtt/k;->mPosition:B

    .line 101
    return-void

    :cond_0
    move v0, v2

    .line 98
    goto :goto_0

    :cond_1
    move v1, v2

    .line 99
    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/k;
    .locals 1

    .prologue
    .line 92
    const-class v0, Lcom/facebook/mqtt/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/k;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/k;
    .locals 1

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/mqtt/k;->$VALUES:[Lcom/facebook/mqtt/k;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/k;

    return-object v0
.end method


# virtual methods
.method public getPosition()B
    .locals 1

    .prologue
    .line 104
    iget-byte v0, p0, Lcom/facebook/mqtt/k;->mPosition:B

    return v0
.end method

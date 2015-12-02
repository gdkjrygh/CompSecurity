.class final enum Lcom/facebook/push/mqtt/e;
.super Ljava/lang/Enum;
.source "ConnectionRetryManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/mqtt/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/mqtt/e;

.field public static final enum BACK_OFF:Lcom/facebook/push/mqtt/e;

.field public static final enum BACK_TO_BACK:Lcom/facebook/push/mqtt/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 22
    new-instance v0, Lcom/facebook/push/mqtt/e;

    const-string v1, "BACK_OFF"

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/mqtt/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/e;->BACK_OFF:Lcom/facebook/push/mqtt/e;

    .line 23
    new-instance v0, Lcom/facebook/push/mqtt/e;

    const-string v1, "BACK_TO_BACK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/mqtt/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/mqtt/e;->BACK_TO_BACK:Lcom/facebook/push/mqtt/e;

    .line 21
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/push/mqtt/e;

    sget-object v1, Lcom/facebook/push/mqtt/e;->BACK_OFF:Lcom/facebook/push/mqtt/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/push/mqtt/e;->BACK_TO_BACK:Lcom/facebook/push/mqtt/e;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/push/mqtt/e;->$VALUES:[Lcom/facebook/push/mqtt/e;

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
    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/mqtt/e;
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/push/mqtt/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/mqtt/e;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/push/mqtt/e;->$VALUES:[Lcom/facebook/push/mqtt/e;

    invoke-virtual {v0}, [Lcom/facebook/push/mqtt/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/mqtt/e;

    return-object v0
.end method

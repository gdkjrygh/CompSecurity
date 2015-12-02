.class final enum Lcom/facebook/e/g;
.super Ljava/lang/Enum;
.source "DeviceConditionHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/e/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/e/g;

.field public static final enum WIFI_OFF:Lcom/facebook/e/g;

.field public static final enum WIFI_ON:Lcom/facebook/e/g;

.field public static final enum WIFI_UNKNOWN:Lcom/facebook/e/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/facebook/e/g;

    const-string v1, "WIFI_ON"

    invoke-direct {v0, v1, v2}, Lcom/facebook/e/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/e/g;->WIFI_ON:Lcom/facebook/e/g;

    .line 36
    new-instance v0, Lcom/facebook/e/g;

    const-string v1, "WIFI_OFF"

    invoke-direct {v0, v1, v3}, Lcom/facebook/e/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/e/g;->WIFI_OFF:Lcom/facebook/e/g;

    .line 37
    new-instance v0, Lcom/facebook/e/g;

    const-string v1, "WIFI_UNKNOWN"

    invoke-direct {v0, v1, v4}, Lcom/facebook/e/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/e/g;->WIFI_UNKNOWN:Lcom/facebook/e/g;

    .line 34
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/e/g;

    sget-object v1, Lcom/facebook/e/g;->WIFI_ON:Lcom/facebook/e/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/e/g;->WIFI_OFF:Lcom/facebook/e/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/e/g;->WIFI_UNKNOWN:Lcom/facebook/e/g;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/e/g;->$VALUES:[Lcom/facebook/e/g;

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
    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/e/g;
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/e/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/e/g;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/facebook/e/g;->$VALUES:[Lcom/facebook/e/g;

    invoke-virtual {v0}, [Lcom/facebook/e/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/e/g;

    return-object v0
.end method

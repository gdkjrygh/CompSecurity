.class public final enum Lcom/facebook/common/hardware/c;
.super Ljava/lang/Enum;
.source "BatteryStateManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/hardware/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/hardware/c;

.field public static final enum CHARGING_AC:Lcom/facebook/common/hardware/c;

.field public static final enum CHARGING_USB:Lcom/facebook/common/hardware/c;

.field public static final enum DISCHARGING:Lcom/facebook/common/hardware/c;

.field public static final enum FULL:Lcom/facebook/common/hardware/c;

.field public static final enum NOT_CHARGING:Lcom/facebook/common/hardware/c;

.field public static final enum UNKNOWN:Lcom/facebook/common/hardware/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 20
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->UNKNOWN:Lcom/facebook/common/hardware/c;

    .line 21
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "DISCHARGING"

    invoke-direct {v0, v1, v4}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->DISCHARGING:Lcom/facebook/common/hardware/c;

    .line 22
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "NOT_CHARGING"

    invoke-direct {v0, v1, v5}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->NOT_CHARGING:Lcom/facebook/common/hardware/c;

    .line 23
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "CHARGING_USB"

    invoke-direct {v0, v1, v6}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->CHARGING_USB:Lcom/facebook/common/hardware/c;

    .line 24
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "CHARGING_AC"

    invoke-direct {v0, v1, v7}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->CHARGING_AC:Lcom/facebook/common/hardware/c;

    .line 25
    new-instance v0, Lcom/facebook/common/hardware/c;

    const-string v1, "FULL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/hardware/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/c;->FULL:Lcom/facebook/common/hardware/c;

    .line 19
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/common/hardware/c;

    sget-object v1, Lcom/facebook/common/hardware/c;->UNKNOWN:Lcom/facebook/common/hardware/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/common/hardware/c;->DISCHARGING:Lcom/facebook/common/hardware/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/common/hardware/c;->NOT_CHARGING:Lcom/facebook/common/hardware/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/common/hardware/c;->CHARGING_USB:Lcom/facebook/common/hardware/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/common/hardware/c;->CHARGING_AC:Lcom/facebook/common/hardware/c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/common/hardware/c;->FULL:Lcom/facebook/common/hardware/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/common/hardware/c;->$VALUES:[Lcom/facebook/common/hardware/c;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/hardware/c;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/common/hardware/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/common/hardware/c;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/common/hardware/c;->$VALUES:[Lcom/facebook/common/hardware/c;

    invoke-virtual {v0}, [Lcom/facebook/common/hardware/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/hardware/c;

    return-object v0
.end method

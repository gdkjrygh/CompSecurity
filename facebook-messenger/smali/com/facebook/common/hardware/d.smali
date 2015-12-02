.class public final enum Lcom/facebook/common/hardware/d;
.super Ljava/lang/Enum;
.source "BatteryStateManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/hardware/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/hardware/d;

.field public static final enum COLD:Lcom/facebook/common/hardware/d;

.field public static final enum DEAD:Lcom/facebook/common/hardware/d;

.field public static final enum GOOD:Lcom/facebook/common/hardware/d;

.field public static final enum OVERHEAT:Lcom/facebook/common/hardware/d;

.field public static final enum OVER_VOLTAGE:Lcom/facebook/common/hardware/d;

.field public static final enum UNKNOWN:Lcom/facebook/common/hardware/d;

.field public static final enum UNSPECIFIED_FAILURE:Lcom/facebook/common/hardware/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 29
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->UNKNOWN:Lcom/facebook/common/hardware/d;

    .line 30
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "GOOD"

    invoke-direct {v0, v1, v4}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->GOOD:Lcom/facebook/common/hardware/d;

    .line 31
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "OVERHEAT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->OVERHEAT:Lcom/facebook/common/hardware/d;

    .line 32
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "DEAD"

    invoke-direct {v0, v1, v6}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->DEAD:Lcom/facebook/common/hardware/d;

    .line 33
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "OVER_VOLTAGE"

    invoke-direct {v0, v1, v7}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->OVER_VOLTAGE:Lcom/facebook/common/hardware/d;

    .line 34
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "UNSPECIFIED_FAILURE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->UNSPECIFIED_FAILURE:Lcom/facebook/common/hardware/d;

    .line 35
    new-instance v0, Lcom/facebook/common/hardware/d;

    const-string v1, "COLD"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/hardware/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/hardware/d;->COLD:Lcom/facebook/common/hardware/d;

    .line 28
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/common/hardware/d;

    sget-object v1, Lcom/facebook/common/hardware/d;->UNKNOWN:Lcom/facebook/common/hardware/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/common/hardware/d;->GOOD:Lcom/facebook/common/hardware/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/common/hardware/d;->OVERHEAT:Lcom/facebook/common/hardware/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/common/hardware/d;->DEAD:Lcom/facebook/common/hardware/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/common/hardware/d;->OVER_VOLTAGE:Lcom/facebook/common/hardware/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/common/hardware/d;->UNSPECIFIED_FAILURE:Lcom/facebook/common/hardware/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/common/hardware/d;->COLD:Lcom/facebook/common/hardware/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/common/hardware/d;->$VALUES:[Lcom/facebook/common/hardware/d;

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
    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/hardware/d;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/common/hardware/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/common/hardware/d;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/common/hardware/d;->$VALUES:[Lcom/facebook/common/hardware/d;

    invoke-virtual {v0}, [Lcom/facebook/common/hardware/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/hardware/d;

    return-object v0
.end method

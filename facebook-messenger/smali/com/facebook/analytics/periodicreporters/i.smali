.class final enum Lcom/facebook/analytics/periodicreporters/i;
.super Ljava/lang/Enum;
.source "DeviceInfoPeriodicReporter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/periodicreporters/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/periodicreporters/i;

.field public static final enum SERVICE_DISABLED:Lcom/facebook/analytics/periodicreporters/i;

.field public static final enum SERVICE_ENABLED:Lcom/facebook/analytics/periodicreporters/i;

.field public static final enum SERVICE_INVALID:Lcom/facebook/analytics/periodicreporters/i;

.field public static final enum SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 253
    new-instance v0, Lcom/facebook/analytics/periodicreporters/i;

    const-string v1, "SERVICE_ENABLED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/periodicreporters/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_ENABLED:Lcom/facebook/analytics/periodicreporters/i;

    .line 254
    new-instance v0, Lcom/facebook/analytics/periodicreporters/i;

    const-string v1, "SERVICE_DISABLED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/periodicreporters/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_DISABLED:Lcom/facebook/analytics/periodicreporters/i;

    .line 255
    new-instance v0, Lcom/facebook/analytics/periodicreporters/i;

    const-string v1, "SERVICE_INVALID"

    invoke-direct {v0, v1, v4}, Lcom/facebook/analytics/periodicreporters/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_INVALID:Lcom/facebook/analytics/periodicreporters/i;

    .line 256
    new-instance v0, Lcom/facebook/analytics/periodicreporters/i;

    const-string v1, "SERVICE_MISSING"

    invoke-direct {v0, v1, v5}, Lcom/facebook/analytics/periodicreporters/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;

    .line 252
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/analytics/periodicreporters/i;

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_ENABLED:Lcom/facebook/analytics/periodicreporters/i;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_DISABLED:Lcom/facebook/analytics/periodicreporters/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_INVALID:Lcom/facebook/analytics/periodicreporters/i;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/analytics/periodicreporters/i;->$VALUES:[Lcom/facebook/analytics/periodicreporters/i;

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
    .line 252
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/periodicreporters/i;
    .locals 1

    .prologue
    .line 252
    const-class v0, Lcom/facebook/analytics/periodicreporters/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/periodicreporters/i;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/periodicreporters/i;
    .locals 1

    .prologue
    .line 252
    sget-object v0, Lcom/facebook/analytics/periodicreporters/i;->$VALUES:[Lcom/facebook/analytics/periodicreporters/i;

    invoke-virtual {v0}, [Lcom/facebook/analytics/periodicreporters/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/periodicreporters/i;

    return-object v0
.end method

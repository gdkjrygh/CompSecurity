.class public final enum Lcom/facebook/analytics/h/b;
.super Ljava/lang/Enum;
.source "TimeSpentAnalyticsClientEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/h/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/h/b;

.field public static final enum CLOCK_RESET:Lcom/facebook/analytics/h/b;

.field public static final enum FORCE:Lcom/facebook/analytics/h/b;

.field public static final enum FORCE_RESET:Lcom/facebook/analytics/h/b;

.field public static final enum PASSIVE:Lcom/facebook/analytics/h/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 43
    new-instance v0, Lcom/facebook/analytics/h/b;

    const-string v1, "FORCE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/h/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/b;->FORCE:Lcom/facebook/analytics/h/b;

    .line 44
    new-instance v0, Lcom/facebook/analytics/h/b;

    const-string v1, "FORCE_RESET"

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/h/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/b;->FORCE_RESET:Lcom/facebook/analytics/h/b;

    .line 45
    new-instance v0, Lcom/facebook/analytics/h/b;

    const-string v1, "PASSIVE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/analytics/h/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/b;->PASSIVE:Lcom/facebook/analytics/h/b;

    .line 46
    new-instance v0, Lcom/facebook/analytics/h/b;

    const-string v1, "CLOCK_RESET"

    invoke-direct {v0, v1, v5}, Lcom/facebook/analytics/h/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/b;->CLOCK_RESET:Lcom/facebook/analytics/h/b;

    .line 42
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/analytics/h/b;

    sget-object v1, Lcom/facebook/analytics/h/b;->FORCE:Lcom/facebook/analytics/h/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/analytics/h/b;->FORCE_RESET:Lcom/facebook/analytics/h/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/analytics/h/b;->PASSIVE:Lcom/facebook/analytics/h/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/h/b;->CLOCK_RESET:Lcom/facebook/analytics/h/b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/analytics/h/b;->$VALUES:[Lcom/facebook/analytics/h/b;

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
    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/h/b;
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/facebook/analytics/h/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/h/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/h/b;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/facebook/analytics/h/b;->$VALUES:[Lcom/facebook/analytics/h/b;

    invoke-virtual {v0}, [Lcom/facebook/analytics/h/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/h/b;

    return-object v0
.end method

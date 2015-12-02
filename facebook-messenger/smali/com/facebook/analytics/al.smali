.class public final enum Lcom/facebook/analytics/al;
.super Ljava/lang/Enum;
.source "AnalyticsConfig.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/al;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/al;

.field public static final enum CORE:Lcom/facebook/analytics/al;

.field public static final enum CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

.field public static final enum NONE:Lcom/facebook/analytics/al;

.field public static final enum UNSET:Lcom/facebook/analytics/al;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/facebook/analytics/al;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/al;->NONE:Lcom/facebook/analytics/al;

    .line 13
    new-instance v0, Lcom/facebook/analytics/al;

    const-string v1, "CORE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    .line 14
    new-instance v0, Lcom/facebook/analytics/al;

    const-string v1, "CORE_AND_SAMPLED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/analytics/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    .line 15
    new-instance v0, Lcom/facebook/analytics/al;

    const-string v1, "UNSET"

    invoke-direct {v0, v1, v5}, Lcom/facebook/analytics/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/al;->UNSET:Lcom/facebook/analytics/al;

    .line 11
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/analytics/al;

    sget-object v1, Lcom/facebook/analytics/al;->NONE:Lcom/facebook/analytics/al;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/al;->UNSET:Lcom/facebook/analytics/al;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/analytics/al;->$VALUES:[Lcom/facebook/analytics/al;

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
    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/al;
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/facebook/analytics/al;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/al;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/al;
    .locals 1

    .prologue
    .line 11
    sget-object v0, Lcom/facebook/analytics/al;->$VALUES:[Lcom/facebook/analytics/al;

    invoke-virtual {v0}, [Lcom/facebook/analytics/al;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/al;

    return-object v0
.end method

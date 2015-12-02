.class public final enum Lcom/facebook/analytics/h/e;
.super Ljava/lang/Enum;
.source "TimeSpentBitArray.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/h/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/h/e;

.field public static final enum BACKGROUNDED:Lcom/facebook/analytics/h/e;

.field public static final enum CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

.field public static final enum FOREGROUNDED:Lcom/facebook/analytics/h/e;

.field public static final enum IGNORE:Lcom/facebook/analytics/h/e;

.field public static final enum USER_ACTION:Lcom/facebook/analytics/h/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 88
    new-instance v0, Lcom/facebook/analytics/h/e;

    const-string v1, "FOREGROUNDED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/h/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/e;->FOREGROUNDED:Lcom/facebook/analytics/h/e;

    .line 89
    new-instance v0, Lcom/facebook/analytics/h/e;

    const-string v1, "USER_ACTION"

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/h/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/e;->USER_ACTION:Lcom/facebook/analytics/h/e;

    .line 90
    new-instance v0, Lcom/facebook/analytics/h/e;

    const-string v1, "BACKGROUNDED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/analytics/h/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/e;->BACKGROUNDED:Lcom/facebook/analytics/h/e;

    .line 91
    new-instance v0, Lcom/facebook/analytics/h/e;

    const-string v1, "CLOCK_CHANGE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/analytics/h/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/e;->CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

    .line 92
    new-instance v0, Lcom/facebook/analytics/h/e;

    const-string v1, "IGNORE"

    invoke-direct {v0, v1, v6}, Lcom/facebook/analytics/h/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/h/e;->IGNORE:Lcom/facebook/analytics/h/e;

    .line 87
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/analytics/h/e;

    sget-object v1, Lcom/facebook/analytics/h/e;->FOREGROUNDED:Lcom/facebook/analytics/h/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/analytics/h/e;->USER_ACTION:Lcom/facebook/analytics/h/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/analytics/h/e;->BACKGROUNDED:Lcom/facebook/analytics/h/e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/h/e;->CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/analytics/h/e;->IGNORE:Lcom/facebook/analytics/h/e;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/analytics/h/e;->$VALUES:[Lcom/facebook/analytics/h/e;

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
    .line 87
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/h/e;
    .locals 1

    .prologue
    .line 87
    const-class v0, Lcom/facebook/analytics/h/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/h/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/h/e;
    .locals 1

    .prologue
    .line 87
    sget-object v0, Lcom/facebook/analytics/h/e;->$VALUES:[Lcom/facebook/analytics/h/e;

    invoke-virtual {v0}, [Lcom/facebook/analytics/h/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/h/e;

    return-object v0
.end method

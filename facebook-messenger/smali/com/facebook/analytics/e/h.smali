.class public final enum Lcom/facebook/analytics/e/h;
.super Ljava/lang/Enum;
.source "MarkerType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/e/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/e/h;

.field public static final enum ACTIVITY_CREATED:Lcom/facebook/analytics/e/h;

.field public static final enum ACTIVITY_RESUMED:Lcom/facebook/analytics/e/h;

.field public static final enum CLIENT_TTI:Lcom/facebook/analytics/e/h;

.field public static final enum DATA_RECEIVED:Lcom/facebook/analytics/e/h;

.field public static final enum DATA_REQUESTED:Lcom/facebook/analytics/e/h;

.field public static final enum MARK:Lcom/facebook/analytics/e/h;

.field public static final enum START:Lcom/facebook/analytics/e/h;

.field public static final enum STOP:Lcom/facebook/analytics/e/h;

.field public static final enum VALUE:Lcom/facebook/analytics/e/h;


# instance fields
.field private final mMarkerName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 7
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "START"

    const-string v2, "start"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->START:Lcom/facebook/analytics/e/h;

    .line 8
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "STOP"

    const-string v2, "stop"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->STOP:Lcom/facebook/analytics/e/h;

    .line 9
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "MARK"

    const-string v2, "mark"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->MARK:Lcom/facebook/analytics/e/h;

    .line 10
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "CLIENT_TTI"

    const-string v2, "client_tti"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->CLIENT_TTI:Lcom/facebook/analytics/e/h;

    .line 11
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "VALUE"

    const-string v2, "value"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->VALUE:Lcom/facebook/analytics/e/h;

    .line 12
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "DATA_REQUESTED"

    const/4 v2, 0x5

    const-string v3, "data_requested"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->DATA_REQUESTED:Lcom/facebook/analytics/e/h;

    .line 13
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "DATA_RECEIVED"

    const/4 v2, 0x6

    const-string v3, "data_received"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->DATA_RECEIVED:Lcom/facebook/analytics/e/h;

    .line 14
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "ACTIVITY_CREATED"

    const/4 v2, 0x7

    const-string v3, "activity_created"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->ACTIVITY_CREATED:Lcom/facebook/analytics/e/h;

    .line 15
    new-instance v0, Lcom/facebook/analytics/e/h;

    const-string v1, "ACTIVITY_RESUMED"

    const/16 v2, 0x8

    const-string v3, "activity_resumed"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/e/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/e/h;->ACTIVITY_RESUMED:Lcom/facebook/analytics/e/h;

    .line 5
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/facebook/analytics/e/h;

    sget-object v1, Lcom/facebook/analytics/e/h;->START:Lcom/facebook/analytics/e/h;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/e/h;->STOP:Lcom/facebook/analytics/e/h;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/analytics/e/h;->MARK:Lcom/facebook/analytics/e/h;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/analytics/e/h;->CLIENT_TTI:Lcom/facebook/analytics/e/h;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/analytics/e/h;->VALUE:Lcom/facebook/analytics/e/h;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/analytics/e/h;->DATA_REQUESTED:Lcom/facebook/analytics/e/h;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/analytics/e/h;->DATA_RECEIVED:Lcom/facebook/analytics/e/h;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/analytics/e/h;->ACTIVITY_CREATED:Lcom/facebook/analytics/e/h;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/analytics/e/h;->ACTIVITY_RESUMED:Lcom/facebook/analytics/e/h;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/analytics/e/h;->$VALUES:[Lcom/facebook/analytics/e/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    iput-object p3, p0, Lcom/facebook/analytics/e/h;->mMarkerName:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/e/h;
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/facebook/analytics/e/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/e/h;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/e/h;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/facebook/analytics/e/h;->$VALUES:[Lcom/facebook/analytics/e/h;

    invoke-virtual {v0}, [Lcom/facebook/analytics/e/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/e/h;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/analytics/e/h;->mMarkerName:Ljava/lang/String;

    return-object v0
.end method

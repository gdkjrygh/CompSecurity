.class public final enum Lcom/facebook/analytics/c;
.super Ljava/lang/Enum;
.source "AnalyticEventNames.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/c;

.field public static final enum ACTIVE:Lcom/facebook/analytics/c;

.field public static final enum BACKGROUNDED:Lcom/facebook/analytics/c;

.field public static final enum FOREGROUNDED:Lcom/facebook/analytics/c;

.field public static final enum INIT:Lcom/facebook/analytics/c;

.field public static final enum LAUNCH:Lcom/facebook/analytics/c;

.field public static final enum RESIGN:Lcom/facebook/analytics/c;


# instance fields
.field private stateName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 105
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "INIT"

    const-string v2, "init"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->INIT:Lcom/facebook/analytics/c;

    .line 106
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "LAUNCH"

    const-string v2, "launch"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->LAUNCH:Lcom/facebook/analytics/c;

    .line 107
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "ACTIVE"

    const-string v2, "active"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->ACTIVE:Lcom/facebook/analytics/c;

    .line 108
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "RESIGN"

    const-string v2, "resign"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->RESIGN:Lcom/facebook/analytics/c;

    .line 109
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "FOREGROUNDED"

    const-string v2, "foreground"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->FOREGROUNDED:Lcom/facebook/analytics/c;

    .line 110
    new-instance v0, Lcom/facebook/analytics/c;

    const-string v1, "BACKGROUNDED"

    const/4 v2, 0x5

    const-string v3, "background"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c;->BACKGROUNDED:Lcom/facebook/analytics/c;

    .line 103
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/analytics/c;

    sget-object v1, Lcom/facebook/analytics/c;->INIT:Lcom/facebook/analytics/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/c;->LAUNCH:Lcom/facebook/analytics/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/analytics/c;->ACTIVE:Lcom/facebook/analytics/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/analytics/c;->RESIGN:Lcom/facebook/analytics/c;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/analytics/c;->FOREGROUNDED:Lcom/facebook/analytics/c;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/analytics/c;->BACKGROUNDED:Lcom/facebook/analytics/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/analytics/c;->$VALUES:[Lcom/facebook/analytics/c;

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
    .line 114
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 115
    iput-object p3, p0, Lcom/facebook/analytics/c;->stateName:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/c;
    .locals 1

    .prologue
    .line 103
    const-class v0, Lcom/facebook/analytics/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/c;
    .locals 1

    .prologue
    .line 103
    sget-object v0, Lcom/facebook/analytics/c;->$VALUES:[Lcom/facebook/analytics/c;

    invoke-virtual {v0}, [Lcom/facebook/analytics/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/c;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/analytics/c;->stateName:Ljava/lang/String;

    return-object v0
.end method

.class public final enum Lcom/facebook/orca/presence/g;
.super Ljava/lang/Enum;
.source "MobilePresenceIconExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/presence/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/presence/g;

.field public static final enum BLUE_DOT:Lcom/facebook/orca/presence/g;

.field public static final enum GONE:Lcom/facebook/orca/presence/g;

.field public static final enum GREEN_PHONE:Lcom/facebook/orca/presence/g;

.field public static final enum NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

.field public static final enum STROKED_GREEN_DOT:Lcom/facebook/orca/presence/g;

.field public static final enum WHITE_PHONE:Lcom/facebook/orca/presence/g;

.field public static final enum YELLOW_DOT:Lcom/facebook/orca/presence/g;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 26
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "NOT_SPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    .line 27
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "GONE"

    const-string v2, "gone"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->GONE:Lcom/facebook/orca/presence/g;

    .line 28
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "STROKED_GREEN_DOT"

    const-string v2, "stroked_green_dot"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->STROKED_GREEN_DOT:Lcom/facebook/orca/presence/g;

    .line 29
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "YELLOW_DOT"

    const-string v2, "yellow_dot"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->YELLOW_DOT:Lcom/facebook/orca/presence/g;

    .line 30
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "BLUE_DOT"

    const-string v2, "blue_dot"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->BLUE_DOT:Lcom/facebook/orca/presence/g;

    .line 31
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "GREEN_PHONE"

    const/4 v2, 0x5

    const-string v3, "green_phone"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->GREEN_PHONE:Lcom/facebook/orca/presence/g;

    .line 32
    new-instance v0, Lcom/facebook/orca/presence/g;

    const-string v1, "WHITE_PHONE"

    const/4 v2, 0x6

    const-string v3, "white_phone"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/presence/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/presence/g;->WHITE_PHONE:Lcom/facebook/orca/presence/g;

    .line 25
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/orca/presence/g;

    sget-object v1, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/presence/g;->GONE:Lcom/facebook/orca/presence/g;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/presence/g;->STROKED_GREEN_DOT:Lcom/facebook/orca/presence/g;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/presence/g;->YELLOW_DOT:Lcom/facebook/orca/presence/g;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/orca/presence/g;->BLUE_DOT:Lcom/facebook/orca/presence/g;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/presence/g;->GREEN_PHONE:Lcom/facebook/orca/presence/g;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/orca/presence/g;->WHITE_PHONE:Lcom/facebook/orca/presence/g;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/presence/g;->$VALUES:[Lcom/facebook/orca/presence/g;

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
    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-object p3, p0, Lcom/facebook/orca/presence/g;->mName:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public static fromName(Ljava/lang/String;)Lcom/facebook/orca/presence/g;
    .locals 5

    .prologue
    .line 48
    if-nez p0, :cond_1

    .line 49
    sget-object v0, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    .line 58
    :cond_0
    :goto_0
    return-object v0

    .line 52
    :cond_1
    invoke-static {}, Lcom/facebook/orca/presence/g;->values()[Lcom/facebook/orca/presence/g;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v0, v2, v1

    .line 53
    invoke-virtual {v0}, Lcom/facebook/orca/presence/g;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 52
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 58
    :cond_2
    sget-object v0, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/presence/g;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/orca/presence/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/presence/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/presence/g;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/orca/presence/g;->$VALUES:[Lcom/facebook/orca/presence/g;

    invoke-virtual {v0}, [Lcom/facebook/orca/presence/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/presence/g;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/presence/g;->mName:Ljava/lang/String;

    return-object v0
.end method

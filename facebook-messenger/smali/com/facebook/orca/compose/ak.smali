.class final enum Lcom/facebook/orca/compose/ak;
.super Ljava/lang/Enum;
.source "ComposeFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/compose/ak;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/compose/ak;

.field public static final enum FINDING_LOCATION:Lcom/facebook/orca/compose/ak;

.field public static final enum HAS_LOCATION:Lcom/facebook/orca/compose/ak;

.field public static final enum INIT:Lcom/facebook/orca/compose/ak;

.field public static final enum LOCATION_ERROR:Lcom/facebook/orca/compose/ak;

.field public static final enum NO_LOCATION:Lcom/facebook/orca/compose/ak;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 177
    new-instance v0, Lcom/facebook/orca/compose/ak;

    const-string v1, "INIT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/compose/ak;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ak;->INIT:Lcom/facebook/orca/compose/ak;

    .line 178
    new-instance v0, Lcom/facebook/orca/compose/ak;

    const-string v1, "HAS_LOCATION"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/compose/ak;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    .line 179
    new-instance v0, Lcom/facebook/orca/compose/ak;

    const-string v1, "FINDING_LOCATION"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/compose/ak;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ak;->FINDING_LOCATION:Lcom/facebook/orca/compose/ak;

    .line 180
    new-instance v0, Lcom/facebook/orca/compose/ak;

    const-string v1, "NO_LOCATION"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/compose/ak;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    .line 181
    new-instance v0, Lcom/facebook/orca/compose/ak;

    const-string v1, "LOCATION_ERROR"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/compose/ak;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ak;->LOCATION_ERROR:Lcom/facebook/orca/compose/ak;

    .line 176
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->INIT:Lcom/facebook/orca/compose/ak;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/compose/ak;->FINDING_LOCATION:Lcom/facebook/orca/compose/ak;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/compose/ak;->LOCATION_ERROR:Lcom/facebook/orca/compose/ak;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/orca/compose/ak;->$VALUES:[Lcom/facebook/orca/compose/ak;

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
    .line 176
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/compose/ak;
    .locals 1

    .prologue
    .line 176
    const-class v0, Lcom/facebook/orca/compose/ak;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ak;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/compose/ak;
    .locals 1

    .prologue
    .line 176
    sget-object v0, Lcom/facebook/orca/compose/ak;->$VALUES:[Lcom/facebook/orca/compose/ak;

    invoke-virtual {v0}, [Lcom/facebook/orca/compose/ak;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/compose/ak;

    return-object v0
.end method

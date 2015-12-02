.class public final enum Lcom/facebook/orca/compose/ap;
.super Ljava/lang/Enum;
.source "ComposeMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/compose/ap;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/compose/ap;

.field public static final enum EXPANDED:Lcom/facebook/orca/compose/ap;

.field public static final enum SHRUNK:Lcom/facebook/orca/compose/ap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 10
    new-instance v0, Lcom/facebook/orca/compose/ap;

    const-string v1, "EXPANDED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/compose/ap;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    .line 13
    new-instance v0, Lcom/facebook/orca/compose/ap;

    const-string v1, "SHRUNK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/compose/ap;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/compose/ap;->$VALUES:[Lcom/facebook/orca/compose/ap;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/compose/ap;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/orca/compose/ap;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ap;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/compose/ap;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/orca/compose/ap;->$VALUES:[Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0}, [Lcom/facebook/orca/compose/ap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/compose/ap;

    return-object v0
.end method

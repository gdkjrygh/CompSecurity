.class public final enum Lcom/facebook/orca/protocol/methods/au;
.super Ljava/lang/Enum;
.source "SendViaChatResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/protocol/methods/au;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/protocol/methods/au;

.field public static final enum FAILED:Lcom/facebook/orca/protocol/methods/au;

.field public static final enum SKIPPED:Lcom/facebook/orca/protocol/methods/au;

.field public static final enum SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/orca/protocol/methods/au;

    const-string v1, "SKIPPED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/protocol/methods/au;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/au;->SKIPPED:Lcom/facebook/orca/protocol/methods/au;

    .line 21
    new-instance v0, Lcom/facebook/orca/protocol/methods/au;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/protocol/methods/au;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    .line 22
    new-instance v0, Lcom/facebook/orca/protocol/methods/au;

    const-string v1, "SUCCEEDED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/protocol/methods/au;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/au;->SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/protocol/methods/au;

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SKIPPED:Lcom/facebook/orca/protocol/methods/au;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/protocol/methods/au;->$VALUES:[Lcom/facebook/orca/protocol/methods/au;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/protocol/methods/au;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/protocol/methods/au;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/au;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/protocol/methods/au;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/orca/protocol/methods/au;->$VALUES:[Lcom/facebook/orca/protocol/methods/au;

    invoke-virtual {v0}, [Lcom/facebook/orca/protocol/methods/au;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/protocol/methods/au;

    return-object v0
.end method

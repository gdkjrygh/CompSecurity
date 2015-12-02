.class public final enum Lcom/facebook/orca/chatheads/ac;
.super Ljava/lang/Enum;
.source "ChatHeadTextBubbleView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/chatheads/ac;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/chatheads/ac;

.field public static final enum LEFT:Lcom/facebook/orca/chatheads/ac;

.field public static final enum RIGHT:Lcom/facebook/orca/chatheads/ac;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 44
    new-instance v0, Lcom/facebook/orca/chatheads/ac;

    const-string v1, "RIGHT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/ac;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/ac;->RIGHT:Lcom/facebook/orca/chatheads/ac;

    .line 45
    new-instance v0, Lcom/facebook/orca/chatheads/ac;

    const-string v1, "LEFT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/chatheads/ac;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    .line 43
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/chatheads/ac;

    sget-object v1, Lcom/facebook/orca/chatheads/ac;->RIGHT:Lcom/facebook/orca/chatheads/ac;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/chatheads/ac;->$VALUES:[Lcom/facebook/orca/chatheads/ac;

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
    .line 43
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/chatheads/ac;
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/orca/chatheads/ac;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ac;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/chatheads/ac;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/facebook/orca/chatheads/ac;->$VALUES:[Lcom/facebook/orca/chatheads/ac;

    invoke-virtual {v0}, [Lcom/facebook/orca/chatheads/ac;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/chatheads/ac;

    return-object v0
.end method

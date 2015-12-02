.class public final enum Lcom/facebook/orca/chatheads/b/e;
.super Ljava/lang/Enum;
.source "ChatHeadNuxBubbleView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/chatheads/b/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/chatheads/b/e;

.field public static final enum BOTTOM:Lcom/facebook/orca/chatheads/b/e;

.field public static final enum LEFT:Lcom/facebook/orca/chatheads/b/e;

.field public static final enum RIGHT:Lcom/facebook/orca/chatheads/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Lcom/facebook/orca/chatheads/b/e;

    const-string v1, "RIGHT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/b/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    .line 28
    new-instance v0, Lcom/facebook/orca/chatheads/b/e;

    const-string v1, "LEFT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/chatheads/b/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    .line 29
    new-instance v0, Lcom/facebook/orca/chatheads/b/e;

    const-string v1, "BOTTOM"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/chatheads/b/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/chatheads/b/e;

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/chatheads/b/e;->$VALUES:[Lcom/facebook/orca/chatheads/b/e;

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
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/chatheads/b/e;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/orca/chatheads/b/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/chatheads/b/e;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/orca/chatheads/b/e;->$VALUES:[Lcom/facebook/orca/chatheads/b/e;

    invoke-virtual {v0}, [Lcom/facebook/orca/chatheads/b/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/chatheads/b/e;

    return-object v0
.end method

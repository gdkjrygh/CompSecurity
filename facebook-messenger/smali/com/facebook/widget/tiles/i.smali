.class public final enum Lcom/facebook/widget/tiles/i;
.super Ljava/lang/Enum;
.source "ThreadTileView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/tiles/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/tiles/i;

.field public static final enum LEFT:Lcom/facebook/widget/tiles/i;

.field public static final enum RIGHT:Lcom/facebook/widget/tiles/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 39
    new-instance v0, Lcom/facebook/widget/tiles/i;

    const-string v1, "LEFT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/tiles/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    .line 40
    new-instance v0, Lcom/facebook/widget/tiles/i;

    const-string v1, "RIGHT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/tiles/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/tiles/i;->RIGHT:Lcom/facebook/widget/tiles/i;

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/widget/tiles/i;

    sget-object v1, Lcom/facebook/widget/tiles/i;->LEFT:Lcom/facebook/widget/tiles/i;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/tiles/i;->RIGHT:Lcom/facebook/widget/tiles/i;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/widget/tiles/i;->$VALUES:[Lcom/facebook/widget/tiles/i;

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
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/tiles/i;
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/widget/tiles/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/i;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/tiles/i;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/widget/tiles/i;->$VALUES:[Lcom/facebook/widget/tiles/i;

    invoke-virtual {v0}, [Lcom/facebook/widget/tiles/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/tiles/i;

    return-object v0
.end method

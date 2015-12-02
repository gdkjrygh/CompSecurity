.class final enum Lcom/facebook/orca/threadlist/k;
.super Ljava/lang/Enum;
.source "PublisherController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadlist/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadlist/k;

.field public static final enum HIDDEN:Lcom/facebook/orca/threadlist/k;

.field public static final enum VISIBLE:Lcom/facebook/orca/threadlist/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 32
    new-instance v0, Lcom/facebook/orca/threadlist/k;

    const-string v1, "VISIBLE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadlist/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    .line 33
    new-instance v0, Lcom/facebook/orca/threadlist/k;

    const-string v1, "HIDDEN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadlist/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/k;->HIDDEN:Lcom/facebook/orca/threadlist/k;

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadlist/k;->HIDDEN:Lcom/facebook/orca/threadlist/k;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/threadlist/k;->$VALUES:[Lcom/facebook/orca/threadlist/k;

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
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadlist/k;
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/orca/threadlist/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/k;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadlist/k;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/facebook/orca/threadlist/k;->$VALUES:[Lcom/facebook/orca/threadlist/k;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadlist/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadlist/k;

    return-object v0
.end method

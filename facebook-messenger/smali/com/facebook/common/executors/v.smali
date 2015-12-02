.class public final enum Lcom/facebook/common/executors/v;
.super Ljava/lang/Enum;
.source "PrioritySerialExecutor.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/executors/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/executors/v;

.field public static final enum HIGH:Lcom/facebook/common/executors/v;

.field public static final enum LOW:Lcom/facebook/common/executors/v;

.field public static final enum NORMAL:Lcom/facebook/common/executors/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 15
    new-instance v0, Lcom/facebook/common/executors/v;

    const-string v1, "HIGH"

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/executors/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/executors/v;->HIGH:Lcom/facebook/common/executors/v;

    new-instance v0, Lcom/facebook/common/executors/v;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/executors/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/executors/v;->NORMAL:Lcom/facebook/common/executors/v;

    new-instance v0, Lcom/facebook/common/executors/v;

    const-string v1, "LOW"

    invoke-direct {v0, v1, v4}, Lcom/facebook/common/executors/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/executors/v;->LOW:Lcom/facebook/common/executors/v;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/common/executors/v;

    sget-object v1, Lcom/facebook/common/executors/v;->HIGH:Lcom/facebook/common/executors/v;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/common/executors/v;->NORMAL:Lcom/facebook/common/executors/v;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/common/executors/v;->LOW:Lcom/facebook/common/executors/v;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/common/executors/v;->$VALUES:[Lcom/facebook/common/executors/v;

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
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/executors/v;
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/common/executors/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/v;

    return-object v0
.end method

.method public static values()[Lcom/facebook/common/executors/v;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/common/executors/v;->$VALUES:[Lcom/facebook/common/executors/v;

    invoke-virtual {v0}, [Lcom/facebook/common/executors/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/executors/v;

    return-object v0
.end method

.class public final enum Lcom/facebook/fbservice/ops/j;
.super Ljava/lang/Enum;
.source "BlueServiceOperation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/fbservice/ops/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/fbservice/ops/j;

.field public static final enum COMPLETED:Lcom/facebook/fbservice/ops/j;

.field public static final enum INIT:Lcom/facebook/fbservice/ops/j;

.field public static final enum OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

.field public static final enum READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 77
    new-instance v0, Lcom/facebook/fbservice/ops/j;

    const-string v1, "INIT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/ops/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    .line 78
    new-instance v0, Lcom/facebook/fbservice/ops/j;

    const-string v1, "READY_TO_QUEUE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/fbservice/ops/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    .line 79
    new-instance v0, Lcom/facebook/fbservice/ops/j;

    const-string v1, "OPERATION_QUEUED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/fbservice/ops/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    .line 80
    new-instance v0, Lcom/facebook/fbservice/ops/j;

    const-string v1, "COMPLETED"

    invoke-direct {v0, v1, v5}, Lcom/facebook/fbservice/ops/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    .line 76
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/fbservice/ops/j;->$VALUES:[Lcom/facebook/fbservice/ops/j;

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
    .line 76
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/ops/j;
    .locals 1

    .prologue
    .line 76
    const-class v0, Lcom/facebook/fbservice/ops/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/fbservice/ops/j;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/facebook/fbservice/ops/j;->$VALUES:[Lcom/facebook/fbservice/ops/j;

    invoke-virtual {v0}, [Lcom/facebook/fbservice/ops/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/fbservice/ops/j;

    return-object v0
.end method

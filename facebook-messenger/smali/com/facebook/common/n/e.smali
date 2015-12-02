.class final enum Lcom/facebook/common/n/e;
.super Ljava/lang/Enum;
.source "NumberTruncationUtil.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/n/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/n/e;

.field public static final enum LONG:Lcom/facebook/common/n/e;

.field public static final enum SHORT:Lcom/facebook/common/n/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lcom/facebook/common/n/e;

    const-string v1, "SHORT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/n/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/n/e;->SHORT:Lcom/facebook/common/n/e;

    .line 22
    new-instance v0, Lcom/facebook/common/n/e;

    const-string v1, "LONG"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/n/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/n/e;->LONG:Lcom/facebook/common/n/e;

    .line 20
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/common/n/e;

    sget-object v1, Lcom/facebook/common/n/e;->SHORT:Lcom/facebook/common/n/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/common/n/e;->LONG:Lcom/facebook/common/n/e;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/common/n/e;->$VALUES:[Lcom/facebook/common/n/e;

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
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/n/e;
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/common/n/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/n/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/common/n/e;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/common/n/e;->$VALUES:[Lcom/facebook/common/n/e;

    invoke-virtual {v0}, [Lcom/facebook/common/n/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/n/e;

    return-object v0
.end method

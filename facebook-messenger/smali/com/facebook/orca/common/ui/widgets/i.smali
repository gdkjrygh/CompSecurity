.class final enum Lcom/facebook/orca/common/ui/widgets/i;
.super Ljava/lang/Enum;
.source "SlidingOutSuggestionViewBase.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/common/ui/widgets/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/common/ui/widgets/i;

.field public static final enum ANIMATE_IN:Lcom/facebook/orca/common/ui/widgets/i;

.field public static final enum ANIMATE_OUT:Lcom/facebook/orca/common/ui/widgets/i;

.field public static final enum HIDE:Lcom/facebook/orca/common/ui/widgets/i;

.field public static final enum SHOW:Lcom/facebook/orca/common/ui/widgets/i;

.field public static final enum WHATEVER:Lcom/facebook/orca/common/ui/widgets/i;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 32
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/i;

    const-string v1, "WHATEVER"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/common/ui/widgets/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->WHATEVER:Lcom/facebook/orca/common/ui/widgets/i;

    new-instance v0, Lcom/facebook/orca/common/ui/widgets/i;

    const-string v1, "SHOW"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/common/ui/widgets/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->SHOW:Lcom/facebook/orca/common/ui/widgets/i;

    new-instance v0, Lcom/facebook/orca/common/ui/widgets/i;

    const-string v1, "HIDE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/common/ui/widgets/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->HIDE:Lcom/facebook/orca/common/ui/widgets/i;

    new-instance v0, Lcom/facebook/orca/common/ui/widgets/i;

    const-string v1, "ANIMATE_IN"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/common/ui/widgets/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->ANIMATE_IN:Lcom/facebook/orca/common/ui/widgets/i;

    new-instance v0, Lcom/facebook/orca/common/ui/widgets/i;

    const-string v1, "ANIMATE_OUT"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/common/ui/widgets/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->ANIMATE_OUT:Lcom/facebook/orca/common/ui/widgets/i;

    .line 31
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/orca/common/ui/widgets/i;

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/i;->WHATEVER:Lcom/facebook/orca/common/ui/widgets/i;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/i;->SHOW:Lcom/facebook/orca/common/ui/widgets/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/i;->HIDE:Lcom/facebook/orca/common/ui/widgets/i;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/i;->ANIMATE_IN:Lcom/facebook/orca/common/ui/widgets/i;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/i;->ANIMATE_OUT:Lcom/facebook/orca/common/ui/widgets/i;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/i;->$VALUES:[Lcom/facebook/orca/common/ui/widgets/i;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/common/ui/widgets/i;
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/orca/common/ui/widgets/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/i;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/common/ui/widgets/i;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/i;->$VALUES:[Lcom/facebook/orca/common/ui/widgets/i;

    invoke-virtual {v0}, [Lcom/facebook/orca/common/ui/widgets/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/common/ui/widgets/i;

    return-object v0
.end method

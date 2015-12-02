.class public final enum Lcom/facebook/orca/common/ui/widgets/d;
.super Ljava/lang/Enum;
.source "AnchorableToast.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/common/ui/widgets/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/common/ui/widgets/d;

.field public static final enum NORMAL:Lcom/facebook/orca/common/ui/widgets/d;

.field public static final enum WARNING:Lcom/facebook/orca/common/ui/widgets/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 40
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/d;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/common/ui/widgets/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/d;->NORMAL:Lcom/facebook/orca/common/ui/widgets/d;

    .line 41
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/d;

    const-string v1, "WARNING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/common/ui/widgets/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    .line 39
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/common/ui/widgets/d;

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/d;->NORMAL:Lcom/facebook/orca/common/ui/widgets/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/d;->$VALUES:[Lcom/facebook/orca/common/ui/widgets/d;

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
    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/common/ui/widgets/d;
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/facebook/orca/common/ui/widgets/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/common/ui/widgets/d;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/d;->$VALUES:[Lcom/facebook/orca/common/ui/widgets/d;

    invoke-virtual {v0}, [Lcom/facebook/orca/common/ui/widgets/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/common/ui/widgets/d;

    return-object v0
.end method

.class public final enum Lcom/facebook/orca/common/b/a;
.super Ljava/lang/Enum;
.source "VisualAppTheme.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/common/b/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/common/b/a;

.field public static final enum FB4A:Lcom/facebook/orca/common/b/a;

.field public static final enum ORCA:Lcom/facebook/orca/common/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 9
    new-instance v0, Lcom/facebook/orca/common/b/a;

    const-string v1, "ORCA"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/common/b/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/b/a;->ORCA:Lcom/facebook/orca/common/b/a;

    .line 10
    new-instance v0, Lcom/facebook/orca/common/b/a;

    const-string v1, "FB4A"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/common/b/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/b/a;->FB4A:Lcom/facebook/orca/common/b/a;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/common/b/a;

    sget-object v1, Lcom/facebook/orca/common/b/a;->ORCA:Lcom/facebook/orca/common/b/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/common/b/a;->FB4A:Lcom/facebook/orca/common/b/a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/common/b/a;->$VALUES:[Lcom/facebook/orca/common/b/a;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/common/b/a;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/orca/common/b/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/b/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/common/b/a;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/orca/common/b/a;->$VALUES:[Lcom/facebook/orca/common/b/a;

    invoke-virtual {v0}, [Lcom/facebook/orca/common/b/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/common/b/a;

    return-object v0
.end method

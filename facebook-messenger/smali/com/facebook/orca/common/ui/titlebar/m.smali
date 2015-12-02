.class public final enum Lcom/facebook/orca/common/ui/titlebar/m;
.super Ljava/lang/Enum;
.source "DivebarController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/common/ui/titlebar/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/common/ui/titlebar/m;

.field public static final enum ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

.field public static final enum CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

.field public static final enum OPENED:Lcom/facebook/orca/common/ui/titlebar/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 86
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/m;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/common/ui/titlebar/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 87
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/m;

    const-string v1, "OPENED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/common/ui/titlebar/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 88
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/m;

    const-string v1, "ANIMATING"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/common/ui/titlebar/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    .line 85
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->CLOSED:Lcom/facebook/orca/common/ui/titlebar/m;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->ANIMATING:Lcom/facebook/orca/common/ui/titlebar/m;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->$VALUES:[Lcom/facebook/orca/common/ui/titlebar/m;

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
    .line 85
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/common/ui/titlebar/m;
    .locals 1

    .prologue
    .line 85
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/m;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/common/ui/titlebar/m;
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->$VALUES:[Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-virtual {v0}, [Lcom/facebook/orca/common/ui/titlebar/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/common/ui/titlebar/m;

    return-object v0
.end method

.class final enum Lcom/facebook/orca/camera/n;
.super Ljava/lang/Enum;
.source "HighlightView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/camera/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/camera/n;

.field public static final enum Grow:Lcom/facebook/orca/camera/n;

.field public static final enum Move:Lcom/facebook/orca/camera/n;

.field public static final enum None:Lcom/facebook/orca/camera/n;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 400
    new-instance v0, Lcom/facebook/orca/camera/n;

    const-string v1, "None"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/camera/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/n;->None:Lcom/facebook/orca/camera/n;

    new-instance v0, Lcom/facebook/orca/camera/n;

    const-string v1, "Move"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/camera/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/n;->Move:Lcom/facebook/orca/camera/n;

    new-instance v0, Lcom/facebook/orca/camera/n;

    const-string v1, "Grow"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/camera/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/n;->Grow:Lcom/facebook/orca/camera/n;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/camera/n;

    sget-object v1, Lcom/facebook/orca/camera/n;->None:Lcom/facebook/orca/camera/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/camera/n;->Move:Lcom/facebook/orca/camera/n;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/camera/n;->Grow:Lcom/facebook/orca/camera/n;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/camera/n;->$VALUES:[Lcom/facebook/orca/camera/n;

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
    .line 400
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/camera/n;
    .locals 1

    .prologue
    .line 400
    const-class v0, Lcom/facebook/orca/camera/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/camera/n;
    .locals 1

    .prologue
    .line 400
    sget-object v0, Lcom/facebook/orca/camera/n;->$VALUES:[Lcom/facebook/orca/camera/n;

    invoke-virtual {v0}, [Lcom/facebook/orca/camera/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/camera/n;

    return-object v0
.end method

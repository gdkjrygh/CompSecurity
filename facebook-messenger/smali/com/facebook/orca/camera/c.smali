.class final enum Lcom/facebook/orca/camera/c;
.super Ljava/lang/Enum;
.source "BitmapManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/camera/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/camera/c;

.field public static final enum ALLOW:Lcom/facebook/orca/camera/c;

.field public static final enum CANCEL:Lcom/facebook/orca/camera/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 39
    new-instance v0, Lcom/facebook/orca/camera/c;

    const-string v1, "CANCEL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/camera/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/c;->CANCEL:Lcom/facebook/orca/camera/c;

    new-instance v0, Lcom/facebook/orca/camera/c;

    const-string v1, "ALLOW"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/camera/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/c;->ALLOW:Lcom/facebook/orca/camera/c;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/camera/c;

    sget-object v1, Lcom/facebook/orca/camera/c;->CANCEL:Lcom/facebook/orca/camera/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/camera/c;->ALLOW:Lcom/facebook/orca/camera/c;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/camera/c;->$VALUES:[Lcom/facebook/orca/camera/c;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/camera/c;
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/facebook/orca/camera/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/camera/c;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/facebook/orca/camera/c;->$VALUES:[Lcom/facebook/orca/camera/c;

    invoke-virtual {v0}, [Lcom/facebook/orca/camera/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/camera/c;

    return-object v0
.end method

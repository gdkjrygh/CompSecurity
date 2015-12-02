.class public final enum Lcom/facebook/orca/camera/p;
.super Ljava/lang/Enum;
.source "ImageManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/camera/p;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/camera/p;

.field public static final enum ALL:Lcom/facebook/orca/camera/p;

.field public static final enum EXTERNAL:Lcom/facebook/orca/camera/p;

.field public static final enum INTERNAL:Lcom/facebook/orca/camera/p;

.field public static final enum NONE:Lcom/facebook/orca/camera/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 122
    new-instance v0, Lcom/facebook/orca/camera/p;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/camera/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/p;->NONE:Lcom/facebook/orca/camera/p;

    new-instance v0, Lcom/facebook/orca/camera/p;

    const-string v1, "INTERNAL"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/camera/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/p;->INTERNAL:Lcom/facebook/orca/camera/p;

    new-instance v0, Lcom/facebook/orca/camera/p;

    const-string v1, "EXTERNAL"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/camera/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/p;->EXTERNAL:Lcom/facebook/orca/camera/p;

    new-instance v0, Lcom/facebook/orca/camera/p;

    const-string v1, "ALL"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/camera/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/camera/p;->ALL:Lcom/facebook/orca/camera/p;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/orca/camera/p;

    sget-object v1, Lcom/facebook/orca/camera/p;->NONE:Lcom/facebook/orca/camera/p;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/camera/p;->INTERNAL:Lcom/facebook/orca/camera/p;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/camera/p;->EXTERNAL:Lcom/facebook/orca/camera/p;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/camera/p;->ALL:Lcom/facebook/orca/camera/p;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/camera/p;->$VALUES:[Lcom/facebook/orca/camera/p;

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
    .line 122
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/camera/p;
    .locals 1

    .prologue
    .line 122
    const-class v0, Lcom/facebook/orca/camera/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/p;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/camera/p;
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/facebook/orca/camera/p;->$VALUES:[Lcom/facebook/orca/camera/p;

    invoke-virtual {v0}, [Lcom/facebook/orca/camera/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/camera/p;

    return-object v0
.end method

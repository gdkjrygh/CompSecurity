.class public final enum Lcom/facebook/ui/images/d/n;
.super Ljava/lang/Enum;
.source "ScaleGraphicOp.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/images/d/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/images/d/n;

.field public static final enum DOWNSCALE:Lcom/facebook/ui/images/d/n;

.field public static final enum UPSCALE:Lcom/facebook/ui/images/d/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 16
    new-instance v0, Lcom/facebook/ui/images/d/n;

    const-string v1, "DOWNSCALE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/d/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/n;->DOWNSCALE:Lcom/facebook/ui/images/d/n;

    .line 17
    new-instance v0, Lcom/facebook/ui/images/d/n;

    const-string v1, "UPSCALE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/images/d/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/n;->UPSCALE:Lcom/facebook/ui/images/d/n;

    .line 15
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/ui/images/d/n;

    sget-object v1, Lcom/facebook/ui/images/d/n;->DOWNSCALE:Lcom/facebook/ui/images/d/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/ui/images/d/n;->UPSCALE:Lcom/facebook/ui/images/d/n;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/ui/images/d/n;->$VALUES:[Lcom/facebook/ui/images/d/n;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/images/d/n;
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/ui/images/d/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/images/d/n;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/ui/images/d/n;->$VALUES:[Lcom/facebook/ui/images/d/n;

    invoke-virtual {v0}, [Lcom/facebook/ui/images/d/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/images/d/n;

    return-object v0
.end method

.class public final enum Lcom/facebook/ui/images/d/c;
.super Ljava/lang/Enum;
.source "CropRegionConstraints.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/images/d/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/images/d/c;

.field public static final enum BOTTOM_OR_RIGHT:Lcom/facebook/ui/images/d/c;

.field public static final enum CENTER:Lcom/facebook/ui/images/d/c;

.field public static final enum DEFAULT:Lcom/facebook/ui/images/d/c;

.field public static final enum TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 18
    new-instance v0, Lcom/facebook/ui/images/d/c;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/d/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/c;->DEFAULT:Lcom/facebook/ui/images/d/c;

    .line 19
    new-instance v0, Lcom/facebook/ui/images/d/c;

    const-string v1, "CENTER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/images/d/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    .line 20
    new-instance v0, Lcom/facebook/ui/images/d/c;

    const-string v1, "TOP_OR_LEFT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/images/d/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/c;->TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;

    .line 21
    new-instance v0, Lcom/facebook/ui/images/d/c;

    const-string v1, "BOTTOM_OR_RIGHT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/ui/images/d/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/d/c;->BOTTOM_OR_RIGHT:Lcom/facebook/ui/images/d/c;

    .line 15
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/ui/images/d/c;

    sget-object v1, Lcom/facebook/ui/images/d/c;->DEFAULT:Lcom/facebook/ui/images/d/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/images/d/c;->TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/ui/images/d/c;->BOTTOM_OR_RIGHT:Lcom/facebook/ui/images/d/c;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/ui/images/d/c;->$VALUES:[Lcom/facebook/ui/images/d/c;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/images/d/c;
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/ui/images/d/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/images/d/c;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/ui/images/d/c;->$VALUES:[Lcom/facebook/ui/images/d/c;

    invoke-virtual {v0}, [Lcom/facebook/ui/images/d/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/images/d/c;

    return-object v0
.end method

.class public final enum Lcom/facebook/reflex/view/c/m;
.super Ljava/lang/Enum;
.source "RefreshController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/view/c/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/view/c/m;

.field public static final enum Loading:Lcom/facebook/reflex/view/c/m;

.field public static final enum Normal:Lcom/facebook/reflex/view/c/m;

.field public static final enum PullToRefresh:Lcom/facebook/reflex/view/c/m;

.field public static final enum ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 15
    new-instance v0, Lcom/facebook/reflex/view/c/m;

    const-string v1, "Normal"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/view/c/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/m;->Normal:Lcom/facebook/reflex/view/c/m;

    .line 16
    new-instance v0, Lcom/facebook/reflex/view/c/m;

    const-string v1, "PullToRefresh"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/view/c/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/m;->PullToRefresh:Lcom/facebook/reflex/view/c/m;

    .line 17
    new-instance v0, Lcom/facebook/reflex/view/c/m;

    const-string v1, "ReleaseToRefresh"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/view/c/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    .line 18
    new-instance v0, Lcom/facebook/reflex/view/c/m;

    const-string v1, "Loading"

    invoke-direct {v0, v1, v5}, Lcom/facebook/reflex/view/c/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    .line 14
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/reflex/view/c/m;

    sget-object v1, Lcom/facebook/reflex/view/c/m;->Normal:Lcom/facebook/reflex/view/c/m;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/view/c/m;->PullToRefresh:Lcom/facebook/reflex/view/c/m;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/view/c/m;->ReleaseToRefresh:Lcom/facebook/reflex/view/c/m;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/reflex/view/c/m;->Loading:Lcom/facebook/reflex/view/c/m;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/reflex/view/c/m;->$VALUES:[Lcom/facebook/reflex/view/c/m;

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
    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/view/c/m;
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/facebook/reflex/view/c/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/m;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/view/c/m;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/reflex/view/c/m;->$VALUES:[Lcom/facebook/reflex/view/c/m;

    invoke-virtual {v0}, [Lcom/facebook/reflex/view/c/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/view/c/m;

    return-object v0
.end method

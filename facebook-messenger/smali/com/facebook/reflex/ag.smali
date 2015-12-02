.class public final enum Lcom/facebook/reflex/ag;
.super Ljava/lang/Enum;
.source "Scrollable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/ag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/ag;

.field public static final enum Inertial:Lcom/facebook/reflex/ag;

.field public static final enum Paginated:Lcom/facebook/reflex/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 23
    new-instance v0, Lcom/facebook/reflex/ag;

    const-string v1, "Inertial"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/ag;->Inertial:Lcom/facebook/reflex/ag;

    new-instance v0, Lcom/facebook/reflex/ag;

    const-string v1, "Paginated"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/ag;->Paginated:Lcom/facebook/reflex/ag;

    .line 22
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/reflex/ag;

    sget-object v1, Lcom/facebook/reflex/ag;->Inertial:Lcom/facebook/reflex/ag;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/ag;->Paginated:Lcom/facebook/reflex/ag;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/reflex/ag;->$VALUES:[Lcom/facebook/reflex/ag;

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
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/ag;
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/reflex/ag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/ag;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/ag;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/reflex/ag;->$VALUES:[Lcom/facebook/reflex/ag;

    invoke-virtual {v0}, [Lcom/facebook/reflex/ag;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/ag;

    return-object v0
.end method

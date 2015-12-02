.class final enum Lcom/facebook/reflex/view/c/g;
.super Ljava/lang/Enum;
.source "LayoutController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/view/c/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/view/c/g;

.field public static final enum AFTER:Lcom/facebook/reflex/view/c/g;

.field public static final enum BEFORE:Lcom/facebook/reflex/view/c/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 55
    new-instance v0, Lcom/facebook/reflex/view/c/g;

    const-string v1, "BEFORE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/view/c/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/g;->BEFORE:Lcom/facebook/reflex/view/c/g;

    .line 56
    new-instance v0, Lcom/facebook/reflex/view/c/g;

    const-string v1, "AFTER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/view/c/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/c/g;->AFTER:Lcom/facebook/reflex/view/c/g;

    .line 54
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/reflex/view/c/g;

    sget-object v1, Lcom/facebook/reflex/view/c/g;->BEFORE:Lcom/facebook/reflex/view/c/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/view/c/g;->AFTER:Lcom/facebook/reflex/view/c/g;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/reflex/view/c/g;->$VALUES:[Lcom/facebook/reflex/view/c/g;

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
    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/view/c/g;
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/reflex/view/c/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/view/c/g;
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lcom/facebook/reflex/view/c/g;->$VALUES:[Lcom/facebook/reflex/view/c/g;

    invoke-virtual {v0}, [Lcom/facebook/reflex/view/c/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/view/c/g;

    return-object v0
.end method

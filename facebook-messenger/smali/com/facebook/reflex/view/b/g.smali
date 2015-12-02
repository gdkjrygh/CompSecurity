.class public final enum Lcom/facebook/reflex/view/b/g;
.super Ljava/lang/Enum;
.source "ContainerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/view/b/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/view/b/g;

.field public static final enum GenericTouches:Lcom/facebook/reflex/view/b/g;

.field public static final enum HorizontalPans:Lcom/facebook/reflex/view/b/g;

.field public static final enum Taps:Lcom/facebook/reflex/view/b/g;

.field public static final enum UnconstrainedPans:Lcom/facebook/reflex/view/b/g;

.field public static final enum VerticalPans:Lcom/facebook/reflex/view/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 49
    new-instance v0, Lcom/facebook/reflex/view/b/g;

    const-string v1, "Taps"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/view/b/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/b/g;->Taps:Lcom/facebook/reflex/view/b/g;

    .line 50
    new-instance v0, Lcom/facebook/reflex/view/b/g;

    const-string v1, "HorizontalPans"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/view/b/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/b/g;->HorizontalPans:Lcom/facebook/reflex/view/b/g;

    .line 51
    new-instance v0, Lcom/facebook/reflex/view/b/g;

    const-string v1, "VerticalPans"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/view/b/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/b/g;->VerticalPans:Lcom/facebook/reflex/view/b/g;

    .line 52
    new-instance v0, Lcom/facebook/reflex/view/b/g;

    const-string v1, "UnconstrainedPans"

    invoke-direct {v0, v1, v5}, Lcom/facebook/reflex/view/b/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/b/g;->UnconstrainedPans:Lcom/facebook/reflex/view/b/g;

    .line 53
    new-instance v0, Lcom/facebook/reflex/view/b/g;

    const-string v1, "GenericTouches"

    invoke-direct {v0, v1, v6}, Lcom/facebook/reflex/view/b/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/view/b/g;->GenericTouches:Lcom/facebook/reflex/view/b/g;

    .line 48
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/reflex/view/b/g;

    sget-object v1, Lcom/facebook/reflex/view/b/g;->Taps:Lcom/facebook/reflex/view/b/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/view/b/g;->HorizontalPans:Lcom/facebook/reflex/view/b/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/view/b/g;->VerticalPans:Lcom/facebook/reflex/view/b/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/reflex/view/b/g;->UnconstrainedPans:Lcom/facebook/reflex/view/b/g;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/reflex/view/b/g;->GenericTouches:Lcom/facebook/reflex/view/b/g;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/reflex/view/b/g;->$VALUES:[Lcom/facebook/reflex/view/b/g;

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
    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/view/b/g;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/facebook/reflex/view/b/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/view/b/g;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/reflex/view/b/g;->$VALUES:[Lcom/facebook/reflex/view/b/g;

    invoke-virtual {v0}, [Lcom/facebook/reflex/view/b/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/view/b/g;

    return-object v0
.end method

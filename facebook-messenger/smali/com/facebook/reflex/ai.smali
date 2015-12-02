.class public final enum Lcom/facebook/reflex/ai;
.super Ljava/lang/Enum;
.source "Scrollable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/ai;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/ai;

.field public static final enum Horizontal:Lcom/facebook/reflex/ai;

.field public static final enum Vertical:Lcom/facebook/reflex/ai;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    new-instance v0, Lcom/facebook/reflex/ai;

    const-string v1, "Horizontal"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/ai;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/ai;->Horizontal:Lcom/facebook/reflex/ai;

    new-instance v0, Lcom/facebook/reflex/ai;

    const-string v1, "Vertical"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/ai;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/ai;->Vertical:Lcom/facebook/reflex/ai;

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/reflex/ai;

    sget-object v1, Lcom/facebook/reflex/ai;->Horizontal:Lcom/facebook/reflex/ai;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/ai;->Vertical:Lcom/facebook/reflex/ai;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/reflex/ai;->$VALUES:[Lcom/facebook/reflex/ai;

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
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/ai;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/reflex/ai;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/ai;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/ai;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/reflex/ai;->$VALUES:[Lcom/facebook/reflex/ai;

    invoke-virtual {v0}, [Lcom/facebook/reflex/ai;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/ai;

    return-object v0
.end method

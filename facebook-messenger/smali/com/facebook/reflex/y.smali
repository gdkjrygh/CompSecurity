.class public final enum Lcom/facebook/reflex/y;
.super Ljava/lang/Enum;
.source "PanListener.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/y;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/y;

.field public static final enum PanHorizontal:Lcom/facebook/reflex/y;

.field public static final enum PanUnconstrained:Lcom/facebook/reflex/y;

.field public static final enum PanVertical:Lcom/facebook/reflex/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    new-instance v0, Lcom/facebook/reflex/y;

    const-string v1, "PanHorizontal"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/y;->PanHorizontal:Lcom/facebook/reflex/y;

    .line 12
    new-instance v0, Lcom/facebook/reflex/y;

    const-string v1, "PanVertical"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/y;->PanVertical:Lcom/facebook/reflex/y;

    .line 13
    new-instance v0, Lcom/facebook/reflex/y;

    const-string v1, "PanUnconstrained"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/y;->PanUnconstrained:Lcom/facebook/reflex/y;

    .line 10
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/reflex/y;

    sget-object v1, Lcom/facebook/reflex/y;->PanHorizontal:Lcom/facebook/reflex/y;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/y;->PanVertical:Lcom/facebook/reflex/y;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/y;->PanUnconstrained:Lcom/facebook/reflex/y;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/reflex/y;->$VALUES:[Lcom/facebook/reflex/y;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/y;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/reflex/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/y;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/y;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/reflex/y;->$VALUES:[Lcom/facebook/reflex/y;

    invoke-virtual {v0}, [Lcom/facebook/reflex/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/y;

    return-object v0
.end method

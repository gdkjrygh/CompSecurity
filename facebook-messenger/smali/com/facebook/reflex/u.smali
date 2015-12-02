.class public final enum Lcom/facebook/reflex/u;
.super Ljava/lang/Enum;
.source "Image.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/u;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/u;

.field public static final enum Opaque:Lcom/facebook/reflex/u;

.field public static final enum PartiallyTransparent:Lcom/facebook/reflex/u;

.field public static final enum Unknown:Lcom/facebook/reflex/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/facebook/reflex/u;

    const-string v1, "Opaque"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/u;->Opaque:Lcom/facebook/reflex/u;

    .line 13
    new-instance v0, Lcom/facebook/reflex/u;

    const-string v1, "PartiallyTransparent"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/u;->PartiallyTransparent:Lcom/facebook/reflex/u;

    .line 17
    new-instance v0, Lcom/facebook/reflex/u;

    const-string v1, "Unknown"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/u;->Unknown:Lcom/facebook/reflex/u;

    .line 11
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/reflex/u;

    sget-object v1, Lcom/facebook/reflex/u;->Opaque:Lcom/facebook/reflex/u;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/u;->PartiallyTransparent:Lcom/facebook/reflex/u;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/u;->Unknown:Lcom/facebook/reflex/u;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/reflex/u;->$VALUES:[Lcom/facebook/reflex/u;

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
    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/u;
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/facebook/reflex/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/u;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/u;
    .locals 1

    .prologue
    .line 11
    sget-object v0, Lcom/facebook/reflex/u;->$VALUES:[Lcom/facebook/reflex/u;

    invoke-virtual {v0}, [Lcom/facebook/reflex/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/u;

    return-object v0
.end method

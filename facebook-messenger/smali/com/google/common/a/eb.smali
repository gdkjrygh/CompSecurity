.class final enum Lcom/google/common/a/eb;
.super Ljava/lang/Enum;
.source "GenericMapMaker.java"

# interfaces
.implements Lcom/google/common/a/ii;


# annotations
.annotation build Lcom/google/common/annotations/GwtIncompatible;
    value = "To be supported"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/eb;",
        ">;",
        "Lcom/google/common/a/ii",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/eb;

.field public static final enum INSTANCE:Lcom/google/common/a/eb;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    new-instance v0, Lcom/google/common/a/eb;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/eb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/eb;->INSTANCE:Lcom/google/common/a/eb;

    .line 43
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/common/a/eb;

    sget-object v1, Lcom/google/common/a/eb;->INSTANCE:Lcom/google/common/a/eb;

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/common/a/eb;->$VALUES:[Lcom/google/common/a/eb;

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
    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/eb;
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/google/common/a/eb;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/eb;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/eb;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/google/common/a/eb;->$VALUES:[Lcom/google/common/a/eb;

    invoke-virtual {v0}, [Lcom/google/common/a/eb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/eb;

    return-object v0
.end method


# virtual methods
.method public onRemoval(Lcom/google/common/a/ij;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ij",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    return-void
.end method

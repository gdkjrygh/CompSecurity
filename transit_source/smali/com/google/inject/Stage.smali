.class public final enum Lcom/google/inject/Stage;
.super Ljava/lang/Enum;
.source "Stage.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/Stage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/Stage;

.field public static final enum DEVELOPMENT:Lcom/google/inject/Stage;

.field public static final enum PRODUCTION:Lcom/google/inject/Stage;

.field public static final enum TOOL:Lcom/google/inject/Stage;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 32
    new-instance v0, Lcom/google/inject/Stage;

    const-string v1, "TOOL"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/Stage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    .line 38
    new-instance v0, Lcom/google/inject/Stage;

    const-string v1, "DEVELOPMENT"

    invoke-direct {v0, v1, v3}, Lcom/google/inject/Stage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/Stage;->DEVELOPMENT:Lcom/google/inject/Stage;

    .line 43
    new-instance v0, Lcom/google/inject/Stage;

    const-string v1, "PRODUCTION"

    invoke-direct {v0, v1, v4}, Lcom/google/inject/Stage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/Stage;->PRODUCTION:Lcom/google/inject/Stage;

    .line 24
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/inject/Stage;

    sget-object v1, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/inject/Stage;->DEVELOPMENT:Lcom/google/inject/Stage;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/inject/Stage;->PRODUCTION:Lcom/google/inject/Stage;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/inject/Stage;->$VALUES:[Lcom/google/inject/Stage;

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
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/Stage;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 24
    const-class v0, Lcom/google/inject/Stage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Stage;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/Stage;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/google/inject/Stage;->$VALUES:[Lcom/google/inject/Stage;

    invoke-virtual {v0}, [Lcom/google/inject/Stage;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/Stage;

    return-object v0
.end method

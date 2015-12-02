.class public final enum Lcom/facebook/http/protocol/m;
.super Ljava/lang/Enum;
.source "ApiMethodRunnerParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/http/protocol/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/http/protocol/m;

.field public static final enum BOOTSTRAP:Lcom/facebook/http/protocol/m;

.field public static final enum DEFAULT:Lcom/facebook/http/protocol/m;

.field public static final enum PROD:Lcom/facebook/http/protocol/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-instance v0, Lcom/facebook/http/protocol/m;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/http/protocol/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/m;->DEFAULT:Lcom/facebook/http/protocol/m;

    .line 31
    new-instance v0, Lcom/facebook/http/protocol/m;

    const-string v1, "PROD"

    invoke-direct {v0, v1, v3}, Lcom/facebook/http/protocol/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/m;->PROD:Lcom/facebook/http/protocol/m;

    .line 36
    new-instance v0, Lcom/facebook/http/protocol/m;

    const-string v1, "BOOTSTRAP"

    invoke-direct {v0, v1, v4}, Lcom/facebook/http/protocol/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    .line 20
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/http/protocol/m;

    sget-object v1, Lcom/facebook/http/protocol/m;->DEFAULT:Lcom/facebook/http/protocol/m;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/http/protocol/m;->PROD:Lcom/facebook/http/protocol/m;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/http/protocol/m;->$VALUES:[Lcom/facebook/http/protocol/m;

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
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/http/protocol/m;
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/http/protocol/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/m;

    return-object v0
.end method

.method public static values()[Lcom/facebook/http/protocol/m;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/http/protocol/m;->$VALUES:[Lcom/facebook/http/protocol/m;

    invoke-virtual {v0}, [Lcom/facebook/http/protocol/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/http/protocol/m;

    return-object v0
.end method

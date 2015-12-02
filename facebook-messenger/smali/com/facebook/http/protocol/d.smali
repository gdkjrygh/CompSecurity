.class public final enum Lcom/facebook/http/protocol/d;
.super Ljava/lang/Enum;
.source "ApiErrorResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/http/protocol/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/http/protocol/d;

.field public static final enum API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

.field public static final enum GRAPHQL_KERROR_DOMAIN:Lcom/facebook/http/protocol/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    new-instance v0, Lcom/facebook/http/protocol/d;

    const-string v1, "API_EC_DOMAIN"

    invoke-direct {v0, v1, v2}, Lcom/facebook/http/protocol/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    .line 20
    new-instance v0, Lcom/facebook/http/protocol/d;

    const-string v1, "GRAPHQL_KERROR_DOMAIN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/http/protocol/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/d;->GRAPHQL_KERROR_DOMAIN:Lcom/facebook/http/protocol/d;

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/http/protocol/d;

    sget-object v1, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/http/protocol/d;->GRAPHQL_KERROR_DOMAIN:Lcom/facebook/http/protocol/d;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/http/protocol/d;->$VALUES:[Lcom/facebook/http/protocol/d;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/http/protocol/d;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/http/protocol/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/http/protocol/d;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/http/protocol/d;->$VALUES:[Lcom/facebook/http/protocol/d;

    invoke-virtual {v0}, [Lcom/facebook/http/protocol/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/http/protocol/d;

    return-object v0
.end method

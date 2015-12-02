.class public final enum Lcom/facebook/http/protocol/o;
.super Ljava/lang/Enum;
.source "ApiRequest.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/http/protocol/o;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/http/protocol/o;

.field public static final enum MULTI_PART_ENTITY:Lcom/facebook/http/protocol/o;

.field public static final enum SINGLE_STRING_ENTITY:Lcom/facebook/http/protocol/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/facebook/http/protocol/o;

    const-string v1, "MULTI_PART_ENTITY"

    invoke-direct {v0, v1, v2}, Lcom/facebook/http/protocol/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/o;->MULTI_PART_ENTITY:Lcom/facebook/http/protocol/o;

    .line 44
    new-instance v0, Lcom/facebook/http/protocol/o;

    const-string v1, "SINGLE_STRING_ENTITY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/http/protocol/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/http/protocol/o;->SINGLE_STRING_ENTITY:Lcom/facebook/http/protocol/o;

    .line 29
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/http/protocol/o;

    sget-object v1, Lcom/facebook/http/protocol/o;->MULTI_PART_ENTITY:Lcom/facebook/http/protocol/o;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/http/protocol/o;->SINGLE_STRING_ENTITY:Lcom/facebook/http/protocol/o;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/http/protocol/o;->$VALUES:[Lcom/facebook/http/protocol/o;

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
    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/http/protocol/o;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/http/protocol/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/o;

    return-object v0
.end method

.method public static values()[Lcom/facebook/http/protocol/o;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/http/protocol/o;->$VALUES:[Lcom/facebook/http/protocol/o;

    invoke-virtual {v0}, [Lcom/facebook/http/protocol/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/http/protocol/o;

    return-object v0
.end method

.class public final enum Lcom/facebook/push/c2dm/x;
.super Ljava/lang/Enum;
.source "FacebookPushServerRegistrar.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/c2dm/x;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/c2dm/x;

.field public static final enum CURRENT:Lcom/facebook/push/c2dm/x;

.field public static final enum EXPIRED:Lcom/facebook/push/c2dm/x;

.field public static final enum NONE:Lcom/facebook/push/c2dm/x;

.field public static final enum WRONG_USER:Lcom/facebook/push/c2dm/x;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 96
    new-instance v0, Lcom/facebook/push/c2dm/x;

    const-string v1, "CURRENT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/c2dm/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/x;->CURRENT:Lcom/facebook/push/c2dm/x;

    .line 97
    new-instance v0, Lcom/facebook/push/c2dm/x;

    const-string v1, "EXPIRED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/c2dm/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/x;->EXPIRED:Lcom/facebook/push/c2dm/x;

    .line 98
    new-instance v0, Lcom/facebook/push/c2dm/x;

    const-string v1, "WRONG_USER"

    invoke-direct {v0, v1, v4}, Lcom/facebook/push/c2dm/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/x;->WRONG_USER:Lcom/facebook/push/c2dm/x;

    .line 99
    new-instance v0, Lcom/facebook/push/c2dm/x;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/push/c2dm/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/x;->NONE:Lcom/facebook/push/c2dm/x;

    .line 95
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/push/c2dm/x;

    sget-object v1, Lcom/facebook/push/c2dm/x;->CURRENT:Lcom/facebook/push/c2dm/x;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/push/c2dm/x;->EXPIRED:Lcom/facebook/push/c2dm/x;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/push/c2dm/x;->WRONG_USER:Lcom/facebook/push/c2dm/x;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/push/c2dm/x;->NONE:Lcom/facebook/push/c2dm/x;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/push/c2dm/x;->$VALUES:[Lcom/facebook/push/c2dm/x;

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
    .line 95
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/c2dm/x;
    .locals 1

    .prologue
    .line 95
    const-class v0, Lcom/facebook/push/c2dm/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/x;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/c2dm/x;
    .locals 1

    .prologue
    .line 95
    sget-object v0, Lcom/facebook/push/c2dm/x;->$VALUES:[Lcom/facebook/push/c2dm/x;

    invoke-virtual {v0}, [Lcom/facebook/push/c2dm/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/c2dm/x;

    return-object v0
.end method

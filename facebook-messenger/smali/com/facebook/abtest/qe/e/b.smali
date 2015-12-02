.class public final enum Lcom/facebook/abtest/qe/e/b;
.super Ljava/lang/Enum;
.source "QuickExperimentLogger.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/abtest/qe/e/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/abtest/qe/e/b;

.field public static final enum APP_UPGRADE:Lcom/facebook/abtest/qe/e/b;

.field public static final enum CHANGE_GROUP:Lcom/facebook/abtest/qe/e/b;

.field public static final enum CLIENT_EXPIRE:Lcom/facebook/abtest/qe/e/b;

.field public static final enum SERVER_EXPIRE:Lcom/facebook/abtest/qe/e/b;

.field public static final enum USER_LOGOUT:Lcom/facebook/abtest/qe/e/b;


# instance fields
.field private final eventContext:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 30
    new-instance v0, Lcom/facebook/abtest/qe/e/b;

    const-string v1, "APP_UPGRADE"

    const-string v2, "app_upgrade"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/abtest/qe/e/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->APP_UPGRADE:Lcom/facebook/abtest/qe/e/b;

    .line 31
    new-instance v0, Lcom/facebook/abtest/qe/e/b;

    const-string v1, "USER_LOGOUT"

    const-string v2, "user_logout"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/abtest/qe/e/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->USER_LOGOUT:Lcom/facebook/abtest/qe/e/b;

    .line 32
    new-instance v0, Lcom/facebook/abtest/qe/e/b;

    const-string v1, "CLIENT_EXPIRE"

    const-string v2, "client_expire"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/abtest/qe/e/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->CLIENT_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    .line 33
    new-instance v0, Lcom/facebook/abtest/qe/e/b;

    const-string v1, "SERVER_EXPIRE"

    const-string v2, "server_expire"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/abtest/qe/e/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->SERVER_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    .line 34
    new-instance v0, Lcom/facebook/abtest/qe/e/b;

    const-string v1, "CHANGE_GROUP"

    const-string v2, "change_group"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/abtest/qe/e/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->CHANGE_GROUP:Lcom/facebook/abtest/qe/e/b;

    .line 29
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/abtest/qe/e/b;

    sget-object v1, Lcom/facebook/abtest/qe/e/b;->APP_UPGRADE:Lcom/facebook/abtest/qe/e/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/abtest/qe/e/b;->USER_LOGOUT:Lcom/facebook/abtest/qe/e/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/abtest/qe/e/b;->CLIENT_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/abtest/qe/e/b;->SERVER_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/abtest/qe/e/b;->CHANGE_GROUP:Lcom/facebook/abtest/qe/e/b;

    aput-object v1, v0, v7

    sput-object v0, Lcom/facebook/abtest/qe/e/b;->$VALUES:[Lcom/facebook/abtest/qe/e/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput-object p3, p0, Lcom/facebook/abtest/qe/e/b;->eventContext:Ljava/lang/String;

    .line 40
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/abtest/qe/e/b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/abtest/qe/e/b;->eventContext:Ljava/lang/String;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/abtest/qe/e/b;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/abtest/qe/e/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/e/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/abtest/qe/e/b;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/abtest/qe/e/b;->$VALUES:[Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v0}, [Lcom/facebook/abtest/qe/e/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/abtest/qe/e/b;

    return-object v0
.end method

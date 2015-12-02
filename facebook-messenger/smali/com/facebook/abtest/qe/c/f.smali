.class public final enum Lcom/facebook/abtest/qe/c/f;
.super Ljava/lang/Enum;
.source "QuickExperimentStorage.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/abtest/qe/c/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/abtest/qe/c/f;

.field public static final enum FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

.field public static final enum FROM_USER:Lcom/facebook/abtest/qe/c/f;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 42
    new-instance v0, Lcom/facebook/abtest/qe/c/f;

    const-string v1, "FROM_SERVER"

    const-string v2, "from_server"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/abtest/qe/c/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    .line 43
    new-instance v0, Lcom/facebook/abtest/qe/c/f;

    const-string v1, "FROM_USER"

    const-string v2, "from_user"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/abtest/qe/c/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/abtest/qe/c/f;->FROM_USER:Lcom/facebook/abtest/qe/c/f;

    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/abtest/qe/c/f;

    sget-object v1, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/abtest/qe/c/f;->FROM_USER:Lcom/facebook/abtest/qe/c/f;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/abtest/qe/c/f;->$VALUES:[Lcom/facebook/abtest/qe/c/f;

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
    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 49
    iput-object p3, p0, Lcom/facebook/abtest/qe/c/f;->name:Ljava/lang/String;

    .line 50
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/abtest/qe/c/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/f;->name:Ljava/lang/String;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/abtest/qe/c/f;
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/abtest/qe/c/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c/f;

    return-object v0
.end method

.method public static values()[Lcom/facebook/abtest/qe/c/f;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/facebook/abtest/qe/c/f;->$VALUES:[Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v0}, [Lcom/facebook/abtest/qe/c/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/abtest/qe/c/f;

    return-object v0
.end method

.class public final enum Lcom/facebook/orca/server/j;
.super Ljava/lang/Enum;
.source "FetchGroupThreadsParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/server/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/server/j;

.field public static final enum QUERY:Lcom/facebook/orca/server/j;

.field public static final enum TOP_RANKED:Lcom/facebook/orca/server/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lcom/facebook/orca/server/j;

    const-string v1, "TOP_RANKED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/server/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    new-instance v0, Lcom/facebook/orca/server/j;

    const-string v1, "QUERY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/server/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/server/j;->QUERY:Lcom/facebook/orca/server/j;

    .line 20
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/server/j;

    sget-object v1, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/server/j;->QUERY:Lcom/facebook/orca/server/j;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/server/j;->$VALUES:[Lcom/facebook/orca/server/j;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/server/j;
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/server/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/server/j;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/orca/server/j;->$VALUES:[Lcom/facebook/orca/server/j;

    invoke-virtual {v0}, [Lcom/facebook/orca/server/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/server/j;

    return-object v0
.end method

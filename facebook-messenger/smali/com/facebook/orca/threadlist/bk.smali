.class public final enum Lcom/facebook/orca/threadlist/bk;
.super Ljava/lang/Enum;
.source "ThreadListLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadlist/bk;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadlist/bk;

.field public static final enum MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

.field public static final enum THREAD_LIST:Lcom/facebook/orca/threadlist/bk;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 111
    new-instance v0, Lcom/facebook/orca/threadlist/bk;

    const-string v1, "THREAD_LIST"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadlist/bk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    .line 112
    new-instance v0, Lcom/facebook/orca/threadlist/bk;

    const-string v1, "MORE_THREADS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadlist/bk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    .line 110
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/threadlist/bk;

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/threadlist/bk;->$VALUES:[Lcom/facebook/orca/threadlist/bk;

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
    .line 110
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadlist/bk;
    .locals 1

    .prologue
    .line 110
    const-class v0, Lcom/facebook/orca/threadlist/bk;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/bk;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadlist/bk;
    .locals 1

    .prologue
    .line 110
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->$VALUES:[Lcom/facebook/orca/threadlist/bk;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadlist/bk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadlist/bk;

    return-object v0
.end method

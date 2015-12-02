.class public final enum Lcom/facebook/orca/threadview/cn;
.super Ljava/lang/Enum;
.source "ThreadViewLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/cn;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/cn;

.field public static final enum MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

.field public static final enum THREAD_VIEW:Lcom/facebook/orca/threadview/cn;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 105
    new-instance v0, Lcom/facebook/orca/threadview/cn;

    const-string v1, "THREAD_VIEW"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    .line 106
    new-instance v0, Lcom/facebook/orca/threadview/cn;

    const-string v1, "MORE_MESSAGES"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    .line 104
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/threadview/cn;

    sget-object v1, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/threadview/cn;->$VALUES:[Lcom/facebook/orca/threadview/cn;

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
    .line 104
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/cn;
    .locals 1

    .prologue
    .line 104
    const-class v0, Lcom/facebook/orca/threadview/cn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/cn;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/cn;
    .locals 1

    .prologue
    .line 104
    sget-object v0, Lcom/facebook/orca/threadview/cn;->$VALUES:[Lcom/facebook/orca/threadview/cn;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/cn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/cn;

    return-object v0
.end method

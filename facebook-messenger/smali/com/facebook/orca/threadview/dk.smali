.class final enum Lcom/facebook/orca/threadview/dk;
.super Ljava/lang/Enum;
.source "ThreadViewMessagesAdapterUpdater.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/dk;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/dk;

.field public static final enum HIDE:Lcom/facebook/orca/threadview/dk;

.field public static final enum NONE:Lcom/facebook/orca/threadview/dk;

.field public static final enum REVEAL:Lcom/facebook/orca/threadview/dk;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 101
    new-instance v0, Lcom/facebook/orca/threadview/dk;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/dk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/dk;->NONE:Lcom/facebook/orca/threadview/dk;

    .line 102
    new-instance v0, Lcom/facebook/orca/threadview/dk;

    const-string v1, "HIDE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/dk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/dk;->HIDE:Lcom/facebook/orca/threadview/dk;

    .line 103
    new-instance v0, Lcom/facebook/orca/threadview/dk;

    const-string v1, "REVEAL"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/threadview/dk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/dk;->REVEAL:Lcom/facebook/orca/threadview/dk;

    .line 100
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/threadview/dk;

    sget-object v1, Lcom/facebook/orca/threadview/dk;->NONE:Lcom/facebook/orca/threadview/dk;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadview/dk;->HIDE:Lcom/facebook/orca/threadview/dk;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/threadview/dk;->REVEAL:Lcom/facebook/orca/threadview/dk;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/threadview/dk;->$VALUES:[Lcom/facebook/orca/threadview/dk;

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
    .line 100
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/dk;
    .locals 1

    .prologue
    .line 100
    const-class v0, Lcom/facebook/orca/threadview/dk;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dk;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/dk;
    .locals 1

    .prologue
    .line 100
    sget-object v0, Lcom/facebook/orca/threadview/dk;->$VALUES:[Lcom/facebook/orca/threadview/dk;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/dk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/dk;

    return-object v0
.end method

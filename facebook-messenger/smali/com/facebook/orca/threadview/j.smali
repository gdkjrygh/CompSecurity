.class public final enum Lcom/facebook/orca/threadview/j;
.super Ljava/lang/Enum;
.source "MessageDeliveredReadInfo.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/j;

.field public static final enum DELIVEREE:Lcom/facebook/orca/threadview/j;

.field public static final enum READER:Lcom/facebook/orca/threadview/j;

.field public static final enum SENDER:Lcom/facebook/orca/threadview/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/orca/threadview/j;

    const-string v1, "READER"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    .line 21
    new-instance v0, Lcom/facebook/orca/threadview/j;

    const-string v1, "SENDER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/j;->SENDER:Lcom/facebook/orca/threadview/j;

    .line 22
    new-instance v0, Lcom/facebook/orca/threadview/j;

    const-string v1, "DELIVEREE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/threadview/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/j;->DELIVEREE:Lcom/facebook/orca/threadview/j;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/threadview/j;

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadview/j;->SENDER:Lcom/facebook/orca/threadview/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/threadview/j;->DELIVEREE:Lcom/facebook/orca/threadview/j;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/threadview/j;->$VALUES:[Lcom/facebook/orca/threadview/j;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/j;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/threadview/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/j;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/orca/threadview/j;->$VALUES:[Lcom/facebook/orca/threadview/j;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/j;

    return-object v0
.end method

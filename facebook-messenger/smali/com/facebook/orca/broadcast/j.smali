.class final enum Lcom/facebook/orca/broadcast/j;
.super Ljava/lang/Enum;
.source "BroadcastActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/broadcast/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/broadcast/j;

.field public static final enum FROM_LEFT:Lcom/facebook/orca/broadcast/j;

.field public static final enum FROM_RIGHT:Lcom/facebook/orca/broadcast/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 86
    new-instance v0, Lcom/facebook/orca/broadcast/j;

    const-string v1, "FROM_RIGHT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/broadcast/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/broadcast/j;->FROM_RIGHT:Lcom/facebook/orca/broadcast/j;

    .line 87
    new-instance v0, Lcom/facebook/orca/broadcast/j;

    const-string v1, "FROM_LEFT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/broadcast/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/broadcast/j;->FROM_LEFT:Lcom/facebook/orca/broadcast/j;

    .line 85
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/broadcast/j;

    sget-object v1, Lcom/facebook/orca/broadcast/j;->FROM_RIGHT:Lcom/facebook/orca/broadcast/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/broadcast/j;->FROM_LEFT:Lcom/facebook/orca/broadcast/j;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/broadcast/j;->$VALUES:[Lcom/facebook/orca/broadcast/j;

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
    .line 85
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/broadcast/j;
    .locals 1

    .prologue
    .line 85
    const-class v0, Lcom/facebook/orca/broadcast/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/broadcast/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/broadcast/j;
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/facebook/orca/broadcast/j;->$VALUES:[Lcom/facebook/orca/broadcast/j;

    invoke-virtual {v0}, [Lcom/facebook/orca/broadcast/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/broadcast/j;

    return-object v0
.end method

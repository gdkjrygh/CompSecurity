.class public final enum Lcom/facebook/messages/ipc/peer/j;
.super Ljava/lang/Enum;
.source "MessageNotificationPeerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/messages/ipc/peer/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/messages/ipc/peer/j;

.field public static final enum Dash:Lcom/facebook/messages/ipc/peer/j;

.field public static final enum Fb4a:Lcom/facebook/messages/ipc/peer/j;

.field public static final enum Messenger:Lcom/facebook/messages/ipc/peer/j;

.field public static final enum PMA:Lcom/facebook/messages/ipc/peer/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/facebook/messages/ipc/peer/j;

    const-string v1, "Dash"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/ipc/peer/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/ipc/peer/j;->Dash:Lcom/facebook/messages/ipc/peer/j;

    .line 36
    new-instance v0, Lcom/facebook/messages/ipc/peer/j;

    const-string v1, "Messenger"

    invoke-direct {v0, v1, v3}, Lcom/facebook/messages/ipc/peer/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/ipc/peer/j;->Messenger:Lcom/facebook/messages/ipc/peer/j;

    .line 37
    new-instance v0, Lcom/facebook/messages/ipc/peer/j;

    const-string v1, "Fb4a"

    invoke-direct {v0, v1, v4}, Lcom/facebook/messages/ipc/peer/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/ipc/peer/j;->Fb4a:Lcom/facebook/messages/ipc/peer/j;

    .line 38
    new-instance v0, Lcom/facebook/messages/ipc/peer/j;

    const-string v1, "PMA"

    invoke-direct {v0, v1, v5}, Lcom/facebook/messages/ipc/peer/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/messages/ipc/peer/j;->PMA:Lcom/facebook/messages/ipc/peer/j;

    .line 34
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/messages/ipc/peer/j;

    sget-object v1, Lcom/facebook/messages/ipc/peer/j;->Dash:Lcom/facebook/messages/ipc/peer/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/messages/ipc/peer/j;->Messenger:Lcom/facebook/messages/ipc/peer/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/messages/ipc/peer/j;->Fb4a:Lcom/facebook/messages/ipc/peer/j;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/messages/ipc/peer/j;->PMA:Lcom/facebook/messages/ipc/peer/j;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/messages/ipc/peer/j;->$VALUES:[Lcom/facebook/messages/ipc/peer/j;

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
    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/messages/ipc/peer/j;
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/messages/ipc/peer/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/ipc/peer/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/messages/ipc/peer/j;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/facebook/messages/ipc/peer/j;->$VALUES:[Lcom/facebook/messages/ipc/peer/j;

    invoke-virtual {v0}, [Lcom/facebook/messages/ipc/peer/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/messages/ipc/peer/j;

    return-object v0
.end method

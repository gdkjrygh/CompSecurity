.class public final enum Lcom/facebook/orca/notify/aj;
.super Ljava/lang/Enum;
.source "MessagingNotification.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/notify/aj;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/notify/aj;

.field public static final enum FAILED_TO_SEND:Lcom/facebook/orca/notify/aj;

.field public static final enum FRIEND_INSTALL:Lcom/facebook/orca/notify/aj;

.field public static final enum LOGGED_OUT:Lcom/facebook/orca/notify/aj;

.field public static final enum NEW_BUILD:Lcom/facebook/orca/notify/aj;

.field public static final enum NEW_MESSAGE:Lcom/facebook/orca/notify/aj;

.field public static final enum READ_THREAD:Lcom/facebook/orca/notify/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 11
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "NEW_MESSAGE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->NEW_MESSAGE:Lcom/facebook/orca/notify/aj;

    .line 12
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "LOGGED_OUT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->LOGGED_OUT:Lcom/facebook/orca/notify/aj;

    .line 13
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "FRIEND_INSTALL"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->FRIEND_INSTALL:Lcom/facebook/orca/notify/aj;

    .line 14
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "FAILED_TO_SEND"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->FAILED_TO_SEND:Lcom/facebook/orca/notify/aj;

    .line 15
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "READ_THREAD"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->READ_THREAD:Lcom/facebook/orca/notify/aj;

    .line 16
    new-instance v0, Lcom/facebook/orca/notify/aj;

    const-string v1, "NEW_BUILD"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/notify/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/aj;->NEW_BUILD:Lcom/facebook/orca/notify/aj;

    .line 10
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/orca/notify/aj;

    sget-object v1, Lcom/facebook/orca/notify/aj;->NEW_MESSAGE:Lcom/facebook/orca/notify/aj;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/notify/aj;->LOGGED_OUT:Lcom/facebook/orca/notify/aj;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/notify/aj;->FRIEND_INSTALL:Lcom/facebook/orca/notify/aj;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/notify/aj;->FAILED_TO_SEND:Lcom/facebook/orca/notify/aj;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/notify/aj;->READ_THREAD:Lcom/facebook/orca/notify/aj;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/notify/aj;->NEW_BUILD:Lcom/facebook/orca/notify/aj;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/notify/aj;->$VALUES:[Lcom/facebook/orca/notify/aj;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/notify/aj;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/orca/notify/aj;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/aj;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/notify/aj;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/orca/notify/aj;->$VALUES:[Lcom/facebook/orca/notify/aj;

    invoke-virtual {v0}, [Lcom/facebook/orca/notify/aj;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/notify/aj;

    return-object v0
.end method

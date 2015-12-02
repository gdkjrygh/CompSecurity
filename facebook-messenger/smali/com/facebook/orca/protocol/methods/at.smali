.class public final enum Lcom/facebook/orca/protocol/methods/at;
.super Ljava/lang/Enum;
.source "SendViaChatResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/protocol/methods/at;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/protocol/methods/at;

.field public static final enum NONE:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_FAILED_PUBLISH_FAILED:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_FAILED_SERVER_RETURNED_FAILURE:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_FAILED_TIMED_OUT_AFTER_PUBLISH:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_FAILED_UNKNOWN_EXCEPTION:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_SKIPPED_ATTACHMENT:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_SKIPPED_ATTACHMENT_FBID:Lcom/facebook/orca/protocol/methods/at;

.field public static final enum SEND_SKIPPED_NOT_CONNECTED:Lcom/facebook/orca/protocol/methods/at;


# instance fields
.field public final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 29
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    .line 30
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_SKIPPED_ATTACHMENT"

    const-string v2, "message has attachment"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_ATTACHMENT:Lcom/facebook/orca/protocol/methods/at;

    .line 31
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_SKIPPED_ATTACHMENT_FBID"

    const-string v2, "message has object_attachment fbid"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_ATTACHMENT_FBID:Lcom/facebook/orca/protocol/methods/at;

    .line 32
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_SKIPPED_NOT_CONNECTED"

    const-string v2, "MQTT not conencted"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_NOT_CONNECTED:Lcom/facebook/orca/protocol/methods/at;

    .line 33
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_FAILED_TIMED_OUT_AFTER_PUBLISH"

    const-string v2, "timed out after publish"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_AFTER_PUBLISH:Lcom/facebook/orca/protocol/methods/at;

    .line 34
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE"

    const/4 v2, 0x5

    const-string v3, "timed out waiting for response"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE:Lcom/facebook/orca/protocol/methods/at;

    .line 35
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_FAILED_SERVER_RETURNED_FAILURE"

    const/4 v2, 0x6

    const-string v3, "server returned failure"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_SERVER_RETURNED_FAILURE:Lcom/facebook/orca/protocol/methods/at;

    .line 36
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_FAILED_PUBLISH_FAILED"

    const/4 v2, 0x7

    const-string v3, "publish failed"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_PUBLISH_FAILED:Lcom/facebook/orca/protocol/methods/at;

    .line 37
    new-instance v0, Lcom/facebook/orca/protocol/methods/at;

    const-string v1, "SEND_FAILED_UNKNOWN_EXCEPTION"

    const/16 v2, 0x8

    const-string v3, "Failed to send via MQTT (%1$s)"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/protocol/methods/at;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_UNKNOWN_EXCEPTION:Lcom/facebook/orca/protocol/methods/at;

    .line 28
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/facebook/orca/protocol/methods/at;

    sget-object v1, Lcom/facebook/orca/protocol/methods/at;->NONE:Lcom/facebook/orca/protocol/methods/at;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_ATTACHMENT:Lcom/facebook/orca/protocol/methods/at;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_ATTACHMENT_FBID:Lcom/facebook/orca/protocol/methods/at;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_NOT_CONNECTED:Lcom/facebook/orca/protocol/methods/at;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_AFTER_PUBLISH:Lcom/facebook/orca/protocol/methods/at;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE:Lcom/facebook/orca/protocol/methods/at;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_SERVER_RETURNED_FAILURE:Lcom/facebook/orca/protocol/methods/at;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_PUBLISH_FAILED:Lcom/facebook/orca/protocol/methods/at;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_UNKNOWN_EXCEPTION:Lcom/facebook/orca/protocol/methods/at;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/protocol/methods/at;->$VALUES:[Lcom/facebook/orca/protocol/methods/at;

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
    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 41
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/at;->message:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/protocol/methods/at;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/at;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/protocol/methods/at;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->$VALUES:[Lcom/facebook/orca/protocol/methods/at;

    invoke-virtual {v0}, [Lcom/facebook/orca/protocol/methods/at;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/protocol/methods/at;

    return-object v0
.end method

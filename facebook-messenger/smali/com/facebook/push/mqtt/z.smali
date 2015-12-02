.class synthetic Lcom/facebook/push/mqtt/z;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 623
    invoke-static {}, Lcom/facebook/mqtt/messages/k;->values()[Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/push/mqtt/z;->b:[I

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/z;->b:[I

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/push/mqtt/z;->b:[I

    sget-object v1, Lcom/facebook/mqtt/messages/k;->SUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_1
    :try_start_2
    sget-object v0, Lcom/facebook/push/mqtt/z;->b:[I

    sget-object v1, Lcom/facebook/mqtt/messages/k;->UNSUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_2
    :try_start_3
    sget-object v0, Lcom/facebook/push/mqtt/z;->b:[I

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PINGRESP:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 165
    :goto_3
    invoke-static {}, Lcom/facebook/push/mqtt/ag;->values()[Lcom/facebook/push/mqtt/ag;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/push/mqtt/z;->a:[I

    :try_start_4
    sget-object v0, Lcom/facebook/push/mqtt/z;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/ag;->CONNECT_FAILED:Lcom/facebook/push/mqtt/ag;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_4
    :try_start_5
    sget-object v0, Lcom/facebook/push/mqtt/z;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_5
    :try_start_6
    sget-object v0, Lcom/facebook/push/mqtt/z;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/ag;->BY_REQUEST:Lcom/facebook/push/mqtt/ag;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_6
    return-void

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_4

    .line 623
    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_0
.end method

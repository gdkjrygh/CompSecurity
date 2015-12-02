.class synthetic Lcom/facebook/push/mqtt/cf;
.super Ljava/lang/Object;
.source "MqttPushServiceManager.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 558
    invoke-static {}, Lcom/facebook/push/mqtt/ar;->values()[Lcom/facebook/push/mqtt/ar;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/push/mqtt/cf;->b:[I

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/cf;->b:[I

    sget-object v1, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ar;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/push/mqtt/cf;->b:[I

    sget-object v1, Lcom/facebook/push/mqtt/ar;->DEVICE_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ar;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3

    :goto_1
    :try_start_2
    sget-object v0, Lcom/facebook/push/mqtt/cf;->b:[I

    sget-object v1, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ar;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 470
    :goto_2
    invoke-static {}, Lcom/facebook/push/mqtt/cj;->values()[Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/push/mqtt/cf;->a:[I

    :try_start_3
    sget-object v0, Lcom/facebook/push/mqtt/cf;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/cj;->SERVICE_STARTED:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1

    :goto_3
    :try_start_4
    sget-object v0, Lcom/facebook/push/mqtt/cf;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/cj;->SERVICE_STOPPED:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    .line 558
    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_0
.end method

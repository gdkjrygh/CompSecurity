.class synthetic Lcom/facebook/orca/common/ui/titlebar/v;
.super Ljava/lang/Object;
.source "TitleBar.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 493
    invoke-static {}, Lcom/facebook/orca/common/ui/titlebar/w;->values()[Lcom/facebook/orca/common/ui/titlebar/w;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->b:[I

    :try_start_0
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->b:[I

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/w;->FACEBOOK:Lcom/facebook/orca/common/ui/titlebar/w;

    invoke-virtual {v1}, Lcom/facebook/orca/common/ui/titlebar/w;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->b:[I

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/w;->SMS_ONLY:Lcom/facebook/orca/common/ui/titlebar/w;

    invoke-virtual {v1}, Lcom/facebook/orca/common/ui/titlebar/w;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3

    .line 225
    :goto_1
    invoke-static {}, Lcom/facebook/push/mqtt/bu;->values()[Lcom/facebook/push/mqtt/bu;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->a:[I

    :try_start_2
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/bu;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :goto_2
    :try_start_3
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTING:Lcom/facebook/push/mqtt/bu;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/bu;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1

    :goto_3
    :try_start_4
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/bu;->ordinal()I

    move-result v1

    const/4 v2, 0x3

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

    :catch_2
    move-exception v0

    goto :goto_2

    .line 493
    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_0
.end method

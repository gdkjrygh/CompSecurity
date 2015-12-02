.class synthetic Lcom/facebook/push/a/g;
.super Ljava/lang/Object;
.source "PushServerRegistrationInitialStatusClientEvent.java"


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 27
    invoke-static {}, Lcom/facebook/push/c2dm/x;->values()[Lcom/facebook/push/c2dm/x;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/push/a/g;->a:[I

    :try_start_0
    sget-object v0, Lcom/facebook/push/a/g;->a:[I

    sget-object v1, Lcom/facebook/push/c2dm/x;->CURRENT:Lcom/facebook/push/c2dm/x;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/x;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/push/a/g;->a:[I

    sget-object v1, Lcom/facebook/push/c2dm/x;->EXPIRED:Lcom/facebook/push/c2dm/x;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/x;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    :try_start_2
    sget-object v0, Lcom/facebook/push/a/g;->a:[I

    sget-object v1, Lcom/facebook/push/c2dm/x;->NONE:Lcom/facebook/push/c2dm/x;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/x;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0
.end method

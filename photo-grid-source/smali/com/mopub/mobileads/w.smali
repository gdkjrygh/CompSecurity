.class final synthetic Lcom/mopub/mobileads/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 94
    invoke-static {}, Lcom/mopub/mobileads/x;->values$8b52fb8()[I

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/mopub/mobileads/w;->a:[I

    :try_start_0
    sget-object v0, Lcom/mopub/mobileads/w;->a:[I

    sget v1, Lcom/mopub/mobileads/x;->CUSTOM_EVENT_AD_READY$414e0682:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

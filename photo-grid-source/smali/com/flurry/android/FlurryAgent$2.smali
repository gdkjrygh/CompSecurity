.class synthetic Lcom/flurry/android/FlurryAgent$2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 113
    invoke-static {}, Lcom/flurry/sdk/lc$a;->values()[Lcom/flurry/sdk/lc$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/flurry/android/FlurryAgent$2;->a:[I

    :try_start_0
    sget-object v0, Lcom/flurry/android/FlurryAgent$2;->a:[I

    sget-object v1, Lcom/flurry/sdk/lc$a;->b:Lcom/flurry/sdk/lc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/lc$a;->ordinal()I

    move-result v1

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

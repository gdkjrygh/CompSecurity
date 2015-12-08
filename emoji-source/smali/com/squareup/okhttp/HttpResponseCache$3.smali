.class synthetic Lcom/squareup/okhttp/HttpResponseCache$3;
.super Ljava/lang/Object;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/HttpResponseCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$squareup$okhttp$ResponseSource:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 351
    invoke-static {}, Lcom/squareup/okhttp/ResponseSource;->values()[Lcom/squareup/okhttp/ResponseSource;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/squareup/okhttp/HttpResponseCache$3;->$SwitchMap$com$squareup$okhttp$ResponseSource:[I

    :try_start_0
    sget-object v0, Lcom/squareup/okhttp/HttpResponseCache$3;->$SwitchMap$com$squareup$okhttp$ResponseSource:[I

    sget-object v1, Lcom/squareup/okhttp/ResponseSource;->CACHE:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseSource;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    :try_start_1
    sget-object v0, Lcom/squareup/okhttp/HttpResponseCache$3;->$SwitchMap$com$squareup$okhttp$ResponseSource:[I

    sget-object v1, Lcom/squareup/okhttp/ResponseSource;->CONDITIONAL_CACHE:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseSource;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    :try_start_2
    sget-object v0, Lcom/squareup/okhttp/HttpResponseCache$3;->$SwitchMap$com$squareup$okhttp$ResponseSource:[I

    sget-object v1, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseSource;->ordinal()I

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

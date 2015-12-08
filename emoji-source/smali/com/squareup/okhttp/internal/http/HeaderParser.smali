.class final Lcom/squareup/okhttp/internal/http/HeaderParser;
.super Ljava/lang/Object;
.source "HeaderParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    return-void
.end method

.method public static parseCacheControl(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;)V
    .locals 7
    .param p0, "value"    # Ljava/lang/String;
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;

    .prologue
    .line 27
    const/4 v3, 0x0

    .line 28
    .local v3, "pos":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_3

    .line 29
    move v4, v3

    .line 30
    .local v4, "tokenStart":I
    const-string v5, "=,;"

    invoke-static {p0, v3, v5}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 31
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 33
    .local v0, "directive":Ljava/lang/String;
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v3, v5, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2c

    if-eq v5, v6, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3b

    if-ne v5, v6, :cond_1

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    const/4 v5, 0x0

    invoke-interface {p1, v0, v5}, Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;->handle(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    invoke-static {p0, v3}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipWhitespace(Ljava/lang/String;I)I

    move-result v3

    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x22

    if-ne v5, v6, :cond_2

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    move v2, v3

    .line 48
    .local v2, "parameterStart":I
    const-string v5, "\""

    invoke-static {p0, v3, v5}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 49
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 50
    .local v1, "parameter":Ljava/lang/String;
    add-int/lit8 v3, v3, 0x1

    .line 59
    :goto_1
    invoke-interface {p1, v0, v1}, Lcom/squareup/okhttp/internal/http/HeaderParser$CacheControlHandler;->handle(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 54
    .end local v1    # "parameter":Ljava/lang/String;
    .end local v2    # "parameterStart":I
    :cond_2
    move v2, v3

    .line 55
    .restart local v2    # "parameterStart":I
    const-string v5, ",;"

    invoke-static {p0, v3, v5}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 56
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .restart local v1    # "parameter":Ljava/lang/String;
    goto :goto_1

    .line 61
    .end local v0    # "directive":Ljava/lang/String;
    .end local v1    # "parameter":Ljava/lang/String;
    .end local v2    # "parameterStart":I
    .end local v4    # "tokenStart":I
    :cond_3
    return-void
.end method

.method public static parseSeconds(Ljava/lang/String;)I
    .locals 6
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 97
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 98
    .local v2, "seconds":J
    const-wide/32 v4, 0x7fffffff

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    .line 99
    const v1, 0x7fffffff

    .line 106
    .end local v2    # "seconds":J
    :goto_0
    return v1

    .line 100
    .restart local v2    # "seconds":J
    :cond_0
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    .line 101
    const/4 v1, 0x0

    goto :goto_0

    .line 103
    :cond_1
    long-to-int v1, v2

    goto :goto_0

    .line 105
    .end local v2    # "seconds":J
    :catch_0
    move-exception v0

    .line 106
    .local v0, "e":Ljava/lang/NumberFormatException;
    const/4 v1, -0x1

    goto :goto_0
.end method

.method public static skipUntil(Ljava/lang/String;ILjava/lang/String;)I
    .locals 2
    .param p0, "input"    # Ljava/lang/String;
    .param p1, "pos"    # I
    .param p2, "characters"    # Ljava/lang/String;

    .prologue
    .line 69
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 74
    :cond_0
    return p1

    .line 69
    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0
.end method

.method public static skipWhitespace(Ljava/lang/String;I)I
    .locals 2
    .param p0, "input"    # Ljava/lang/String;
    .param p1, "pos"    # I

    .prologue
    .line 82
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 84
    .local v0, "c":C
    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    .line 88
    .end local v0    # "c":C
    :cond_0
    return p1

    .line 82
    .restart local v0    # "c":C
    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0
.end method

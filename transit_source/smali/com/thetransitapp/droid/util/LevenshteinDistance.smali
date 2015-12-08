.class public Lcom/thetransitapp/droid/util/LevenshteinDistance;
.super Ljava/lang/Object;
.source "LevenshteinDistance.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DefaultLocale"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static computeDistance(Ljava/lang/String;Ljava/lang/String;)I
    .locals 9
    .param p0, "s1"    # Ljava/lang/String;
    .param p1, "s2"    # Ljava/lang/String;

    .prologue
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string v7, " "

    const-string v8, ""

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string v7, " "

    const-string v8, ""

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    new-array v1, v6, [I

    .line 13
    .local v1, "costs":[I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-le v2, v6, :cond_0

    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    aget v6, v1, v6

    return v6

    .line 14
    :cond_0
    move v4, v2

    .line 15
    .local v4, "lastValue":I
    const/4 v3, 0x0

    .local v3, "j":I
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-le v3, v6, :cond_2

    .line 32
    if-lez v2, :cond_1

    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    aput v4, v1, v6

    .line 13
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16
    :cond_2
    if-nez v2, :cond_4

    .line 17
    aput v3, v1, v3

    .line 15
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 19
    :cond_4
    if-lez v3, :cond_3

    .line 20
    add-int/lit8 v6, v3, -0x1

    aget v5, v1, v6

    .line 22
    .local v5, "newValue":I
    add-int/lit8 v6, v2, -0x1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v6, v7, :cond_5

    .line 23
    const/4 v0, -0x3

    .line 26
    .local v0, "change":I
    :goto_3
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    aget v7, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int v5, v6, v0

    .line 27
    add-int/lit8 v6, v3, -0x1

    aput v4, v1, v6

    .line 28
    move v4, v5

    goto :goto_2

    .line 25
    .end local v0    # "change":I
    :cond_5
    const/4 v0, 0x1

    .restart local v0    # "change":I
    goto :goto_3
.end method

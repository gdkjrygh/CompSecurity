.class public Lcom/qihoo360/common/utils/StringUtils;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static questionMarkMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v2, v1, :cond_0

    .line 33
    :goto_0
    return v0

    :cond_0
    move v1, v0

    .line 25
    :goto_1
    if-lt v1, v2, :cond_1

    .line 33
    const/4 v0, 0x1

    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 27
    const/16 v4, 0x3f

    if-ne v3, v4, :cond_3

    .line 25
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 29
    :cond_3
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_2

    goto :goto_0
.end method

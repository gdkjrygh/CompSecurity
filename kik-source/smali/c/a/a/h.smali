.class public final Lc/a/a/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 57
    add-int/lit8 v0, v2, 0x2

    new-array v3, v0, [C

    .line 58
    const/16 v0, 0x69

    aput-char v0, v3, v4

    .line 59
    const/16 v0, 0x73

    aput-char v0, v3, v1

    .line 60
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 61
    const/16 v4, 0x61

    if-lt v0, v4, :cond_0

    const/16 v4, 0x7a

    if-gt v0, v4, :cond_0

    .line 62
    add-int/lit8 v0, v0, -0x20

    int-to-char v0, v0

    .line 63
    :cond_0
    const/4 v4, 0x2

    aput-char v0, v3, v4

    move v0, v1

    .line 64
    :goto_0
    if-ge v0, v2, :cond_1

    .line 65
    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aput-char v4, v3, v1

    .line 64
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 67
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

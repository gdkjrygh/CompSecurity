.class public final Lorg/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:C

.field private static final b:C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x5c

    .line 113
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 120
    sput-char v0, Lorg/a/a/a/b;->a:C

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    .line 121
    const/16 v0, 0x2f

    sput-char v0, Lorg/a/a/a/b;->b:C

    .line 125
    :goto_1
    return-void

    .line 120
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 123
    :cond_1
    sput-char v1, Lorg/a/a/a/b;->b:C

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 884
    if-nez p0, :cond_1

    .line 885
    const/4 p0, 0x0

    .line 891
    :cond_0
    :goto_0
    return-object p0

    .line 887
    :cond_1
    if-nez p0, :cond_3

    move v0, v1

    .line 888
    :cond_2
    :goto_1
    if-eq v0, v1, :cond_0

    .line 891
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 887
    :cond_3
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-nez p0, :cond_4

    move v2, v1

    :goto_2
    if-le v2, v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_4
    const/16 v2, 0x2f

    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/16 v3, 0x5c

    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_2
.end method

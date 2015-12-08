.class final Lc/a/a/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/a/a/j$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lc/a/a/j$d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 53
    if-nez p1, :cond_1

    .line 79
    :cond_0
    :goto_0
    return v0

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 56
    if-nez v3, :cond_2

    move v0, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    if-eq v2, p1, :cond_3

    move v0, v1

    .line 59
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 62
    const/16 v4, 0x30

    if-lt v2, v4, :cond_4

    const/16 v4, 0x39

    if-le v2, v4, :cond_5

    :cond_4
    const/16 v4, 0x2d

    if-ne v2, v4, :cond_6

    :cond_5
    move v0, v1

    .line 63
    goto :goto_0

    :cond_6
    move v2, v0

    .line 65
    :goto_1
    if-ge v2, v3, :cond_b

    .line 66
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 67
    invoke-static {v4}, Lc/a/a/j;->a(C)Z

    move-result v5

    if-eqz v5, :cond_7

    move v0, v1

    .line 68
    goto :goto_0

    .line 69
    :cond_7
    invoke-static {v4}, Lc/a/a/j;->d(C)Z

    move-result v5

    if-eqz v5, :cond_8

    move v0, v1

    .line 70
    goto :goto_0

    .line 71
    :cond_8
    invoke-static {v4}, Lc/a/a/j;->b(C)Z

    move-result v5

    if-eqz v5, :cond_9

    move v0, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_9
    invoke-static {v4}, Lc/a/a/j;->e(C)Z

    move-result v4

    if-eqz v4, :cond_a

    move v0, v1

    .line 74
    goto :goto_0

    .line 65
    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 77
    :cond_b
    invoke-static {p1}, Lc/a/a/j;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 78
    goto :goto_0
.end method

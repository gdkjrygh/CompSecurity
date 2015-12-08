.class final Lcom/c/a/a/c$e;
.super Lcom/c/a/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final q:[C

.field private final r:[C


# direct methods
.method constructor <init>(Ljava/lang/String;[C[C)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 107
    invoke-direct {p0, p1}, Lcom/c/a/a/c;-><init>(Ljava/lang/String;)V

    .line 108
    iput-object p2, p0, Lcom/c/a/a/c$e;->q:[C

    .line 109
    iput-object p3, p0, Lcom/c/a/a/c$e;->r:[C

    .line 110
    array-length v0, p2

    array-length v3, p3

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/c/a/a/u;->a(Z)V

    move v0, v2

    .line 111
    :goto_1
    array-length v3, p2

    if-ge v0, v3, :cond_4

    .line 112
    aget-char v3, p2, v0

    aget-char v4, p3, v0

    if-gt v3, v4, :cond_2

    move v3, v1

    :goto_2
    invoke-static {v3}, Lcom/c/a/a/u;->a(Z)V

    .line 113
    add-int/lit8 v3, v0, 0x1

    array-length v4, p2

    if-ge v3, v4, :cond_0

    .line 114
    aget-char v3, p3, v0

    add-int/lit8 v4, v0, 0x1

    aget-char v4, p2, v4

    if-ge v3, v4, :cond_3

    move v3, v1

    :goto_3
    invoke-static {v3}, Lcom/c/a/a/u;->a(Z)V

    .line 111
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    .line 110
    goto :goto_0

    :cond_2
    move v3, v2

    .line 112
    goto :goto_2

    :cond_3
    move v3, v2

    .line 114
    goto :goto_3

    .line 117
    :cond_4
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 102
    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, Lcom/c/a/a/c;->a(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method

.method public final c(C)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 121
    iget-object v1, p0, Lcom/c/a/a/c$e;->q:[C

    invoke-static {v1, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v1

    .line 122
    if-ltz v1, :cond_1

    .line 126
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    xor-int/lit8 v1, v1, -0x1

    add-int/lit8 v1, v1, -0x1

    .line 126
    if-ltz v1, :cond_2

    iget-object v2, p0, Lcom/c/a/a/c$e;->r:[C

    aget-char v1, v2, v1

    if-le p1, v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

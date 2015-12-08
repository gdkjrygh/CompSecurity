.class public final Lorg/a/a/b/b/a/e;
.super Lorg/a/a/b/b/a/b;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;

.field private final b:I

.field private final c:I


# direct methods
.method public varargs constructor <init>([[Ljava/lang/CharSequence;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 40
    invoke-direct {p0}, Lorg/a/a/b/b/a/b;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/a/a/b/b/a/e;->a:Ljava/util/HashMap;

    .line 42
    const v0, 0x7fffffff

    .line 44
    if-eqz p1, :cond_3

    .line 45
    array-length v5, p1

    move v4, v2

    move v1, v2

    move v3, v0

    :goto_0
    if-ge v4, v5, :cond_1

    aget-object v0, p1, v4

    .line 46
    iget-object v6, p0, Lorg/a/a/b/b/a/e;->a:Ljava/util/HashMap;

    aget-object v7, v0, v2

    const/4 v8, 0x1

    aget-object v8, v0, v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    aget-object v0, v0, v2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 48
    if-ge v0, v3, :cond_0

    move v3, v0

    .line 51
    :cond_0
    if-le v0, v1, :cond_2

    .line 45
    :goto_1
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v3

    .line 56
    :goto_2
    iput v0, p0, Lorg/a/a/b/b/a/e;->b:I

    .line 57
    iput v1, p0, Lorg/a/a/b/b/a/e;->c:I

    .line 58
    return-void

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 3

    .prologue
    .line 65
    iget v0, p0, Lorg/a/a/b/b/a/e;->c:I

    .line 66
    iget v1, p0, Lorg/a/a/b/b/a/e;->c:I

    add-int/2addr v1, p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-le v1, v2, :cond_2

    .line 67
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p2

    move v1, v0

    .line 70
    :goto_0
    iget v0, p0, Lorg/a/a/b/b/a/e;->b:I

    if-lt v1, v0, :cond_1

    .line 71
    add-int v0, p2, v1

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 72
    iget-object v2, p0, Lorg/a/a/b/b/a/e;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 73
    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 78
    :goto_1
    return v1

    .line 70
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 78
    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.class public abstract Lorg/a/a/b/b/a/c;
.super Lorg/a/a/b/b/a/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/a/a/b/b/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 1

    .prologue
    .line 37
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 38
    invoke-virtual {p0, v0, p3}, Lorg/a/a/b/b/a/c;->a(ILjava/io/Writer;)Z

    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    const/4 v0, 0x1

    .line 42
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract a(ILjava/io/Writer;)Z
.end method

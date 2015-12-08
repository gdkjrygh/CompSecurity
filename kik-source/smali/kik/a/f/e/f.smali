.class public Lkik/a/f/e/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;
.implements Lkik/a/f/e/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/o;Lkik/a/d/a/g;)J
    .locals 2

    .prologue
    .line 32
    const-string v0, "is-typing"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 33
    const-string v1, "val"

    check-cast p2, Lkik/a/d/a/f;

    invoke-virtual {p2}, Lkik/a/d/a/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "true"

    :goto_0
    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "is-typing"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 36
    const-wide/16 v0, 0x0

    return-wide v0

    .line 33
    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method

.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 19
    .line 20
    const-string v1, "is-typing"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 21
    const-string v1, "true"

    const-string v2, "val"

    invoke-virtual {p1, v0, v2}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 22
    new-instance v0, Lkik/a/d/a/f;

    invoke-direct {v0, v1}, Lkik/a/d/a/f;-><init>(Z)V

    .line 25
    :cond_0
    return-object v0
.end method

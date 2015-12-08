.class public Lkik/a/f/e/j;
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
    .line 30
    const-string v0, "pong"

    check-cast p2, Lkik/a/d/a/i;

    invoke-virtual {p2}, Lkik/a/d/a/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 2

    .prologue
    .line 18
    const-string v0, "ping"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    .line 20
    new-instance v0, Lkik/a/d/a/i;

    invoke-direct {v0, v1}, Lkik/a/d/a/i;-><init>(Ljava/lang/String;)V

    .line 23
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

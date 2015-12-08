.class public abstract Lkik/a/f/f/w;
.super Lkik/a/f/f/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected a(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 67
    return-void
.end method

.method public final a(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 33
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lkik/a/f/f/w;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "type"

    iget-object v1, p0, Lkik/a/f/f/w;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :cond_0
    const-string v0, "id"

    iget-object v1, p0, Lkik/a/f/f/w;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1}, Lkik/a/f/f/w;->b(Lkik/a/f/o;)V

    .line 39
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lkik/a/f/o;->c()V

    .line 41
    return-void
.end method

.method protected abstract b(Lkik/a/f/o;)V
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    return v0
.end method

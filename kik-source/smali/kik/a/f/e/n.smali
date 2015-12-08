.class public Lkik/a/f/e/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 17
    const-string v1, "status"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 18
    const-string v1, "jid"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 19
    const-string v1, "special-visibility"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    const-string v1, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 22
    :goto_0
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v3

    .line 24
    new-instance v1, Lkik/a/d/a/l;

    invoke-direct {v1, v3, v2, v0}, Lkik/a/d/a/l;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v0, v1

    .line 26
    :cond_0
    return-object v0

    .line 20
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

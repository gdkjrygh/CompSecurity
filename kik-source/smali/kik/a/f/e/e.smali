.class public Lkik/a/f/e/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 18
    .line 20
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 21
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 24
    const-string v3, "g"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v3, "jid"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 26
    const-string v3, "1"

    const-string v4, "ack-needed"

    invoke-virtual {p1, v0, v4}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    move-object v4, v0

    move-object v3, v0

    .line 27
    :goto_0
    const-string v7, "g"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 28
    const-string v7, "n"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 29
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v3

    .line 41
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 31
    :cond_1
    const-string v7, "c"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 32
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {v1, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    .line 35
    :cond_2
    const-string v7, "m"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 36
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    .line 38
    :cond_3
    const-string v7, "l"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 39
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    .line 43
    :cond_4
    if-nez v5, :cond_5

    .line 47
    :goto_2
    return-object v0

    :cond_5
    new-instance v0, Lkik/a/d/a/e;

    invoke-direct/range {v0 .. v6}, Lkik/a/d/a/e;-><init>(Ljava/util/Vector;Ljava/util/Vector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_2
.end method

.class public Lkik/a/f/e/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 20
    .line 22
    const-string v0, "friend-attribution"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v0, v4

    move-object v1, v4

    move-object v2, v4

    move-object v3, v4

    .line 23
    :goto_0
    const-string v5, "friend-attribution"

    invoke-virtual {p1, v5}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 24
    const-string v5, "context"

    invoke-virtual {p1, v5}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 25
    const-string v1, "type"

    invoke-virtual {p1, v4, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 26
    const-string v1, "reply"

    invoke-virtual {p1, v4, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    const-string v1, "referrer"

    invoke-virtual {p1, v4, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 36
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 29
    :cond_1
    const-string v5, "body"

    invoke-virtual {p1, v5}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 30
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 33
    const-string v5, "^\"|\"$"

    const-string v6, ""

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v5, v0

    move-object v0, v2

    move-object v2, v3

    move-object v3, v1

    .line 40
    :goto_2
    invoke-static {v2}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v3}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 41
    new-instance v1, Lkik/a/d/a/d;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v1 .. v7}, Lkik/a/d/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    .line 43
    :goto_3
    return-object v1

    :cond_3
    move-object v1, v4

    goto :goto_3

    :cond_4
    move-object v5, v4

    move-object v3, v4

    move-object v0, v4

    move-object v2, v4

    goto :goto_2
.end method

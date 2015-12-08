.class public final Lkik/a/f/f/h;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;

.field private i:Lkik/a/d/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 30
    const/4 v0, 0x0

    const-string v1, "get"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/h;->b:Ljava/util/List;

    .line 36
    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid hashtag, contains a dash"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_0
    iput-object p1, p0, Lkik/a/f/f/h;->a:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 59
    const-string v0, "query"

    invoke-virtual {p1, v5, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v5

    move-object v1, v5

    move-object v2, v5

    move-object v3, v5

    .line 64
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 65
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    const-string v0, "action"

    const-string v3, "search"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "jid"

    invoke-virtual {p1, v5, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 69
    :cond_0
    const-string v0, "n"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v2

    .line 72
    :cond_1
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    .line 75
    :cond_2
    const-string v0, "m"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v0, v5

    move-object v6, v5

    .line 77
    :goto_1
    const-string v7, "m"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 78
    const-string v7, "first-name"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 79
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 81
    :cond_3
    const-string v7, "pic"

    invoke-virtual {p1, v7}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 82
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 84
    :cond_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 86
    :cond_5
    new-instance v7, Lkik/a/d/l;

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_7

    move-object v0, v5

    :goto_2
    const/4 v8, 0x0

    invoke-direct {v7, v6, v0, v8}, Lkik/a/d/l;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 87
    iget-object v0, p0, Lkik/a/f/f/h;->b:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    :cond_6
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 90
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 92
    :goto_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    move-object v4, v0

    goto/16 :goto_0

    .line 86
    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, "/thumb.jpg"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 95
    :cond_8
    new-instance v0, Lkik/a/d/m;

    invoke-static {v4}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object v4, v5

    :goto_4
    const-string v5, ""

    iget-object v6, p0, Lkik/a/f/f/h;->b:Ljava/util/List;

    invoke-direct/range {v0 .. v6}, Lkik/a/d/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lkik/a/f/f/h;->i:Lkik/a/d/m;

    .line 96
    return-void

    .line 95
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/thumb.jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_a
    move-object v0, v4

    goto :goto_3
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 2

    .prologue
    .line 119
    instance-of v0, p1, Lkik/a/f/f/h;

    if-eqz v0, :cond_0

    .line 120
    check-cast p1, Lkik/a/f/f/h;

    iget-object v0, p1, Lkik/a/f/f/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/f/f/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 123
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 101
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    const-string v0, "item-not-found"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/h;->c(I)V

    .line 109
    :cond_0
    return-void

    .line 107
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 45
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 48
    const-string v0, "action"

    const-string v1, "search"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lkik/a/f/f/h;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 51
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 52
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 53
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public final d()Lkik/a/d/m;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lkik/a/f/f/h;->i:Lkik/a/d/m;

    return-object v0
.end method

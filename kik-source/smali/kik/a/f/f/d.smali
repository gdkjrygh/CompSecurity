.class public final Lkik/a/f/f/d;
.super Lkik/a/f/f/y;
.source "SourceFile"


# static fields
.field private static final i:Lorg/c/b;


# instance fields
.field final a:Ljava/util/Set;

.field final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-string v0, "CheckLinkSpamRequest"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/f/d;->i:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x0

    const-string v1, "get"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 28
    iput-object p1, p0, Lkik/a/f/f/d;->a:Ljava/util/Set;

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lkik/a/f/f/d;->b:Ljava/util/HashMap;

    .line 30
    return-void
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 108
    const-string v0, "#"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 109
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    :goto_0
    return-object p0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lkik/a/d/r;
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lkik/a/f/f/d;->b:Ljava/util/HashMap;

    invoke-static {p1}, Lkik/a/f/f/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/r;

    return-object v0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 11

    .prologue
    const/4 v7, 0x0

    .line 57
    const-string v0, "query"

    invoke-virtual {p1, v7, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "xmlns"

    const-string v1, "kik:iq:linkmod"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v8

    .line 60
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 61
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 62
    const-string v0, "warn"

    invoke-virtual {p1, v7, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 63
    :goto_1
    const-wide/32 v2, 0x36ee80

    .line 66
    :try_start_0
    const-string v1, "expiry-minutes"

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v2, v8

    :goto_2
    move-object v1, v7

    move-object v4, v7

    move-object v5, v7

    move-object v6, v7

    .line 76
    :goto_3
    const-string v10, "item"

    invoke-virtual {p1, v10}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_5

    .line 77
    const-string v10, "link"

    invoke-virtual {p1, v10}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 78
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 89
    :cond_0
    :goto_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_3

    .line 62
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 80
    :cond_2
    const-string v10, "title"

    invoke-virtual {p1, v10}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 81
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    .line 83
    :cond_3
    const-string v10, "body"

    invoke-virtual {p1, v10}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 84
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    .line 86
    :cond_4
    const-string v10, "source"

    invoke-virtual {p1, v10}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 87
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 93
    :cond_5
    if-eqz v0, :cond_7

    .line 94
    invoke-static {v2, v3, v5, v4, v1}, Lkik/a/d/r;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/r;

    move-result-object v0

    .line 99
    :goto_5
    iget-object v1, p0, Lkik/a/f/f/d;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_6
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto/16 :goto_0

    .line 97
    :cond_7
    invoke-static {v2, v3}, Lkik/a/d/r;->a(J)Lkik/a/d/r;

    move-result-object v0

    goto :goto_5

    .line 103
    :cond_8
    return-void

    :catch_0
    move-exception v1

    goto :goto_2
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 41
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 42
    const-string v0, "xmlns"

    const-string v1, "kik:iq:linkmod"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lkik/a/f/f/d;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 44
    const-string v2, "item"

    invoke-virtual {p1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 45
    const-string v2, "link"

    invoke-virtual {p1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    invoke-static {v0}, Lkik/a/f/f/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 47
    const-string v0, "link"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 48
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :cond_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 51
    return-void
.end method

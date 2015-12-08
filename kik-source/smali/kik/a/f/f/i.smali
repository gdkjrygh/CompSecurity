.class public final Lkik/a/f/f/i;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:Z

.field private i:Ljava/util/ArrayList;

.field private j:Lkik/a/d/m;

.field private k:Ljava/lang/String;


# direct methods
.method private constructor <init>([BLjava/lang/String;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/i;->i:Ljava/util/ArrayList;

    .line 40
    iput-object p1, p0, Lkik/a/f/f/i;->a:[B

    .line 41
    return-void
.end method

.method public static a([B)Lkik/a/f/f/i;
    .locals 2

    .prologue
    .line 46
    if-eqz p0, :cond_0

    array-length v0, p0

    const/16 v1, 0xc8

    if-le v0, v1, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 49
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lkik/a/f/f/i;

    const-string v1, "get"

    invoke-direct {v0, p0, v1}, Lkik/a/f/f/i;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 69
    const-string v0, "query"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, "xmlns"

    const-string v2, "kik:groups:admin"

    invoke-virtual {p1, v0, v2}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v1

    move-object v2, v1

    move-object v3, v1

    .line 74
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 75
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    const-string v0, "action"

    const-string v3, "lookup"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    :try_start_0
    const-string v0, "is-public"

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/f/f/i;->b:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_1
    const-string v0, "jid"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 83
    iput-object v3, p0, Lkik/a/f/f/i;->k:Ljava/lang/String;

    .line 102
    :cond_0
    :goto_2
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 103
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 105
    :goto_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    move-object v4, v0

    goto :goto_0

    .line 85
    :cond_1
    const-string v0, "n"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 88
    :cond_2
    const-string v0, "m"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    move-object v5, v1

    .line 90
    :goto_4
    const-string v6, "m"

    invoke-virtual {p1, v6}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 91
    const-string v6, "first-name"

    invoke-virtual {p1, v6}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 92
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v5

    .line 94
    :cond_3
    const-string v6, "pic"

    invoke-virtual {p1, v6}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 95
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 97
    :cond_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_4

    .line 99
    :cond_5
    new-instance v6, Lkik/a/d/l;

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_6

    move-object v0, v1

    :goto_5
    const/4 v7, 0x0

    invoke-direct {v6, v5, v0, v7}, Lkik/a/d/l;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 100
    iget-object v0, p0, Lkik/a/f/f/i;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 99
    :cond_6
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, "/thumb.jpg"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 108
    :cond_7
    new-instance v0, Lkik/a/d/m;

    invoke-static {v4}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object v4, v1

    :goto_6
    iget-object v5, p0, Lkik/a/f/f/i;->a:[B

    invoke-static {v5}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lkik/a/f/f/i;->i:Ljava/util/ArrayList;

    invoke-direct/range {v0 .. v6}, Lkik/a/d/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lkik/a/f/f/i;->j:Lkik/a/d/m;

    .line 109
    return-void

    .line 108
    :cond_8
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/thumb.jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_9
    move-object v0, v4

    goto/16 :goto_3
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 55
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 56
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 58
    const-string v0, "action"

    const-string v1, "lookup"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lkik/a/f/f/i;->a:[B

    if-eqz v0, :cond_0

    .line 60
    const-string v0, "invite-code"

    iget-object v1, p0, Lkik/a/f/f/i;->a:[B

    invoke-static {v1}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :cond_0
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 63
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lkik/a/f/f/i;->k:Ljava/lang/String;

    return-object v0
.end method

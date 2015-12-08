.class public final Lkik/a/f/f/ai;
.super Lkik/a/f/f/y;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/util/Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-string v0, "ReportSpamRequest"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/f/ai;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lkik/a/f/f/ai;->b:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lkik/a/f/f/ai;->i:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lkik/a/f/f/ai;->j:Ljava/util/Vector;

    .line 37
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    .line 42
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "kik:iq:spam"

    const-string v1, "xmlns"

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 43
    :cond_0
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Expected spam query response"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 137
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 138
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const-string v0, "code"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 140
    const-string v1, "type"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    if-eqz v0, :cond_0

    .line 142
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lkik/a/f/f/ai;->c(I)V

    .line 145
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 147
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 6

    .prologue
    .line 50
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 51
    const-string v0, "xmlns"

    const-string v1, "kik:iq:spam"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lkik/a/f/f/ai;->b:Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 54
    const-string v0, "report"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 55
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/ai;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lkik/a/f/f/ai;->j:Ljava/util/Vector;

    if-eqz v0, :cond_a

    .line 57
    iget-object v0, p0, Lkik/a/f/f/ai;->j:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 58
    const-class v1, Lkik/a/d/a/l;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-nez v1, :cond_0

    const-class v1, Lkik/a/d/a/m;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-nez v1, :cond_0

    .line 60
    const-string v1, "msg"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 61
    const-string v1, "id"

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v3, "from"

    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lkik/a/f/f/ai;->i:Ljava/lang/String;

    :goto_1
    invoke-virtual {p1, v3, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v1, "type"

    const-string v3, "chat"

    invoke-virtual {p1, v1, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v1, "timestamp"

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 66
    if-eqz v1, :cond_9

    .line 67
    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    .line 68
    const-string v4, "com.kik.ext.camera"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "com.kik.ext.gallery"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "com.kik.ext.video-camera"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "com.kik.ext.video-gallery"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 72
    :cond_1
    const-string v4, "keys"

    invoke-virtual {p1, v4}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0}, Lkik/a/d/s;->o()[B

    move-result-object v4

    if-eqz v4, :cond_2

    .line 74
    const-string v4, "d"

    invoke-virtual {p1, v4}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 75
    const-string v4, "key"

    invoke-virtual {v0}, Lkik/a/d/s;->o()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "d"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 78
    :cond_2
    const-string v0, "keys"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 79
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 80
    const-string v0, "app-id"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, "id"

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 83
    const-string v0, "app-name"

    const-string v3, "app-name"

    invoke-virtual {v1, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 85
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 121
    :goto_2
    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 62
    :cond_3
    iget-object v1, p0, Lkik/a/f/f/ai;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 87
    :cond_4
    const-string v0, "com.kik.cards"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 88
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 89
    const-string v0, "app-id"

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "id"

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 92
    const-string v0, "title"

    const-string v3, "title"

    invoke-virtual {v1, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "card-icon"

    const-string v3, "card-icon"

    invoke-virtual {v1, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "app-name"

    const-string v3, "app-name"

    invoke-virtual {v1, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 96
    const-string v0, "uris"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v1}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v3

    .line 98
    const/4 v0, 0x0

    move v1, v0

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 99
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 100
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 101
    const-string v4, "uri"

    invoke-virtual {p1, v4}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    .line 103
    if-eqz v4, :cond_5

    .line 104
    const-string v5, "platform"

    invoke-virtual {p1, v5, v4}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    :cond_5
    const-string v4, "priority"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 108
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 98
    :cond_6
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 111
    :cond_7
    const-string v0, "uris"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 112
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 115
    :cond_8
    sget-object v0, Lkik/a/f/f/ai;->a:Lorg/c/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Unknown message app Id: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 119
    :cond_9
    const-string v1, "body"

    invoke-virtual {v0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/a/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 126
    :cond_a
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/ai;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_b
    const-string v0, "report"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 130
    :cond_c
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 131
    return-void
.end method

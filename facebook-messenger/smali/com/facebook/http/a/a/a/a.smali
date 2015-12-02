.class public Lcom/facebook/http/a/a/a/a;
.super Ljava/lang/Object;
.source "FormBodyPart.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/http/a/a/a/b;

.field private final c:Lcom/facebook/http/a/a/a/a/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V
    .locals 2

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    if-nez p1, :cond_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    if-nez p2, :cond_1

    .line 57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Body may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_1
    iput-object p1, p0, Lcom/facebook/http/a/a/a/a;->a:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lcom/facebook/http/a/a/a/a;->c:Lcom/facebook/http/a/a/a/a/b;

    .line 61
    new-instance v0, Lcom/facebook/http/a/a/a/b;

    invoke-direct {v0}, Lcom/facebook/http/a/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/http/a/a/a/a;->b:Lcom/facebook/http/a/a/a/b;

    .line 63
    invoke-virtual {p0, p2}, Lcom/facebook/http/a/a/a/a;->a(Lcom/facebook/http/a/a/a/a/b;)V

    .line 64
    invoke-virtual {p0, p2}, Lcom/facebook/http/a/a/a/a;->b(Lcom/facebook/http/a/a/a/a/b;)V

    .line 65
    invoke-virtual {p0, p2}, Lcom/facebook/http/a/a/a/a;->c(Lcom/facebook/http/a/a/a/a/b;)V

    .line 66
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected a(Lcom/facebook/http/a/a/a/a/b;)V
    .locals 2

    .prologue
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    const-string v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 101
    const-string v1, "; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    :cond_0
    const-string v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/http/a/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 81
    if-nez p1, :cond_0

    .line 82
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Field name may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a;->b:Lcom/facebook/http/a/a/a/b;

    new-instance v1, Lcom/facebook/http/a/a/a/h;

    invoke-direct {v1, p1, p2}, Lcom/facebook/http/a/a/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/http/a/a/a/b;->a(Lcom/facebook/http/a/a/a/h;)V

    .line 85
    return-void
.end method

.method public b()Lcom/facebook/http/a/a/a/a/b;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a;->c:Lcom/facebook/http/a/a/a/a/b;

    return-object v0
.end method

.method protected b(Lcom/facebook/http/a/a/a/a/b;)V
    .locals 2

    .prologue
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 112
    const-string v1, "; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    :cond_0
    const-string v1, "Content-Type"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/http/a/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    return-void
.end method

.method public c()Lcom/facebook/http/a/a/a/b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a;->b:Lcom/facebook/http/a/a/a/b;

    return-object v0
.end method

.method protected c(Lcom/facebook/http/a/a/a/a/b;)V
    .locals 2

    .prologue
    .line 119
    const-string v0, "Content-Transfer-Encoding"

    invoke-interface {p1}, Lcom/facebook/http/a/a/a/a/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/http/a/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public d()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 2

    .prologue
    .line 92
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    return-object v0
.end method

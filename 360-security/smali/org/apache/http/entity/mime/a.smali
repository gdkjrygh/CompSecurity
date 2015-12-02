.class public Lorg/apache/http/entity/mime/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/apache/http/entity/mime/b;

.field private final c:Lorg/apache/http/entity/mime/a/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/apache/http/entity/mime/a/c;)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    if-nez p1, :cond_0

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Name may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    if-nez p2, :cond_1

    .line 52
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Body may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_1
    iput-object p1, p0, Lorg/apache/http/entity/mime/a;->a:Ljava/lang/String;

    .line 55
    iput-object p2, p0, Lorg/apache/http/entity/mime/a;->c:Lorg/apache/http/entity/mime/a/c;

    .line 56
    new-instance v0, Lorg/apache/http/entity/mime/b;

    invoke-direct {v0}, Lorg/apache/http/entity/mime/b;-><init>()V

    iput-object v0, p0, Lorg/apache/http/entity/mime/a;->b:Lorg/apache/http/entity/mime/b;

    .line 58
    invoke-virtual {p0, p2}, Lorg/apache/http/entity/mime/a;->a(Lorg/apache/http/entity/mime/a/c;)V

    .line 59
    invoke-virtual {p0, p2}, Lorg/apache/http/entity/mime/a;->b(Lorg/apache/http/entity/mime/a/c;)V

    .line 60
    invoke-virtual {p0, p2}, Lorg/apache/http/entity/mime/a;->c(Lorg/apache/http/entity/mime/a/c;)V

    .line 61
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/apache/http/entity/mime/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 76
    if-nez p1, :cond_0

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Field name may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    iget-object v0, p0, Lorg/apache/http/entity/mime/a;->b:Lorg/apache/http/entity/mime/b;

    new-instance v1, Lorg/apache/http/entity/mime/e;

    invoke-direct {v1, p1, p2}, Lorg/apache/http/entity/mime/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/apache/http/entity/mime/b;->a(Lorg/apache/http/entity/mime/e;)V

    .line 80
    return-void
.end method

.method protected a(Lorg/apache/http/entity/mime/a/c;)V
    .locals 2

    .prologue
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    const-string/jumbo v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    invoke-virtual {p0}, Lorg/apache/http/entity/mime/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    const-string/jumbo v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 88
    const-string/jumbo v1, "; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string/jumbo v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :cond_0
    const-string/jumbo v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lorg/apache/http/entity/mime/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public b()Lorg/apache/http/entity/mime/a/c;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lorg/apache/http/entity/mime/a;->c:Lorg/apache/http/entity/mime/a/c;

    return-object v0
.end method

.method protected b(Lorg/apache/http/entity/mime/a/c;)V
    .locals 2

    .prologue
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 99
    const-string/jumbo v1, "; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    :cond_0
    const-string/jumbo v1, "Content-Type"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lorg/apache/http/entity/mime/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method public c()Lorg/apache/http/entity/mime/b;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lorg/apache/http/entity/mime/a;->b:Lorg/apache/http/entity/mime/b;

    return-object v0
.end method

.method protected c(Lorg/apache/http/entity/mime/a/c;)V
    .locals 2

    .prologue
    .line 106
    const-string/jumbo v0, "Content-Transfer-Encoding"

    invoke-interface {p1}, Lorg/apache/http/entity/mime/a/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/apache/http/entity/mime/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    return-void
.end method

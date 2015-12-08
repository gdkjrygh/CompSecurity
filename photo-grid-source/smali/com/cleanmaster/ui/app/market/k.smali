.class public Lcom/cleanmaster/ui/app/market/k;
.super Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field final synthetic d:Lcom/cleanmaster/ui/app/market/i;


# direct methods
.method public constructor <init>(Lcom/cleanmaster/ui/app/market/i;)V
    .locals 1

    .prologue
    .line 103
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/k;->d:Lcom/cleanmaster/ui/app/market/i;

    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;-><init>()V

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/k;->a:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/k;->b:Ljava/lang/String;

    .line 106
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/k;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 103
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/k;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 109
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 125
    :cond_0
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/k;->d:Lcom/cleanmaster/ui/app/market/i;

    invoke-virtual {v1, v0}, Lcom/cleanmaster/ui/app/market/i;->a(Ljava/lang/String;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 126
    if-eqz v1, :cond_2

    .line 128
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    .line 129
    if-eqz v2, :cond_2

    .line 131
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    .line 138
    const/16 v3, 0x12d

    if-eq v2, v3, :cond_1

    const/16 v3, 0x12e

    if-ne v2, v3, :cond_2

    .line 139
    :cond_1
    const-string v0, "Location"

    invoke-interface {v1, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 144
    if-eqz v0, :cond_2

    .line 146
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 159
    :cond_2
    return-object v0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 103
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/k;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 165
    new-instance v0, Lcom/cleanmaster/ui/app/market/l;

    invoke-direct {v0, p0, p1}, Lcom/cleanmaster/ui/app/market/l;-><init>(Lcom/cleanmaster/ui/app/market/k;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/cleanmaster/util/s;->a(Ljava/lang/Runnable;)V

    .line 183
    return-void
.end method

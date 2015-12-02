.class public Lcom/facebook/http/b/as;
.super Lcom/facebook/http/b/f;
.source "FbOpenConnectionEventListener.java"


# instance fields
.field private final a:Lcom/facebook/analytics/e/i;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private d:Lcom/facebook/analytics/e/g;

.field private e:Lcom/facebook/analytics/e/g;

.field private f:Lcom/facebook/analytics/e/g;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/e/i;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/http/b/f;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/http/b/as;->a:Lcom/facebook/analytics/e/i;

    .line 24
    iput-object p2, p0, Lcom/facebook/http/b/as;->b:Ljava/lang/String;

    .line 25
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/as;->c:Ljava/lang/String;

    .line 26
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/facebook/analytics/e/g;
    .locals 4

    .prologue
    .line 86
    new-instance v0, Lcom/facebook/analytics/e/g;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/e/g;-><init>(Ljava/lang/String;)V

    .line 88
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 89
    const-string v2, "hostname"

    iget-object v3, p0, Lcom/facebook/http/b/as;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const-string v2, "identifier"

    iget-object v3, p0, Lcom/facebook/http/b/as;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    invoke-virtual {v0, v1}, Lcom/facebook/analytics/e/g;->a(Ljava/util/Map;)Lcom/facebook/analytics/e/g;

    .line 94
    iget-object v1, p0, Lcom/facebook/http/b/as;->a:Lcom/facebook/analytics/e/i;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/e/i;->a(Lcom/facebook/analytics/e/g;)V

    .line 96
    return-object v0
.end method

.method private a(Lcom/facebook/analytics/e/g;Ljava/io/IOException;)V
    .locals 3

    .prologue
    .line 100
    if-eqz p2, :cond_0

    .line 101
    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->j()Ljava/util/Map;

    move-result-object v0

    const-string v1, "exception_name"

    invoke-virtual {p2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/b/as;->a:Lcom/facebook/analytics/e/i;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/e/i;->b(Lcom/facebook/analytics/e/g;)V

    .line 107
    return-void
.end method

.method private b(Ljava/io/IOException;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/http/b/as;->d:Lcom/facebook/analytics/e/g;

    invoke-direct {p0, v0, p1}, Lcom/facebook/http/b/as;->a(Lcom/facebook/analytics/e/g;Ljava/io/IOException;)V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/b/as;->d:Lcom/facebook/analytics/e/g;

    .line 42
    return-void
.end method

.method private c(Ljava/io/IOException;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/http/b/as;->e:Lcom/facebook/analytics/e/g;

    invoke-direct {p0, v0, p1}, Lcom/facebook/http/b/as;->a(Lcom/facebook/analytics/e/g;Ljava/io/IOException;)V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/b/as;->e:Lcom/facebook/analytics/e/g;

    .line 57
    return-void
.end method

.method private d(Ljava/io/IOException;)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/http/b/as;->f:Lcom/facebook/analytics/e/g;

    invoke-direct {p0, v0, p1}, Lcom/facebook/http/b/as;->a(Lcom/facebook/analytics/e/g;Ljava/io/IOException;)V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/b/as;->f:Lcom/facebook/analytics/e/g;

    .line 72
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "DNSResolution"

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->a(Ljava/lang/String;)Lcom/facebook/analytics/e/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/as;->d:Lcom/facebook/analytics/e/g;

    .line 32
    return-void
.end method

.method public a(Ljava/io/IOException;)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/http/b/as;->d:Lcom/facebook/analytics/e/g;

    if-eqz v0, :cond_1

    .line 77
    invoke-direct {p0, p1}, Lcom/facebook/http/b/as;->b(Ljava/io/IOException;)V

    .line 83
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/facebook/http/b/as;->e:Lcom/facebook/analytics/e/g;

    if-eqz v0, :cond_2

    .line 79
    invoke-direct {p0, p1}, Lcom/facebook/http/b/as;->c(Ljava/io/IOException;)V

    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/facebook/http/b/as;->f:Lcom/facebook/analytics/e/g;

    if-eqz v0, :cond_0

    .line 81
    invoke-direct {p0, p1}, Lcom/facebook/http/b/as;->d(Ljava/io/IOException;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->b(Ljava/io/IOException;)V

    .line 37
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 46
    const-string v0, "TCPConnect"

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->a(Ljava/lang/String;)Lcom/facebook/analytics/e/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/as;->e:Lcom/facebook/analytics/e/g;

    .line 47
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->c(Ljava/io/IOException;)V

    .line 52
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 61
    const-string v0, "TLSSetup"

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->a(Ljava/lang/String;)Lcom/facebook/analytics/e/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/as;->f:Lcom/facebook/analytics/e/g;

    .line 62
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/http/b/as;->d(Ljava/io/IOException;)V

    .line 67
    return-void
.end method

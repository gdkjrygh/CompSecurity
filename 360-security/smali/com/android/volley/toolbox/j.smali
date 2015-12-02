.class public abstract Lcom/android/volley/toolbox/j;
.super Lcom/android/volley/Request;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/android/volley/Request",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/android/volley/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/k$b",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/android/volley/k$b",
            "<TT;>;",
            "Lcom/android/volley/k$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p5}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/k$a;)V

    .line 53
    iput-object p4, p0, Lcom/android/volley/toolbox/j;->a:Lcom/android/volley/k$b;

    .line 54
    iput-object p3, p0, Lcom/android/volley/toolbox/j;->b:Ljava/lang/String;

    .line 55
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/android/volley/toolbox/j;->a:Lcom/android/volley/k$b;

    invoke-interface {v0, p1}, Lcom/android/volley/k$b;->a(Ljava/lang/Object;)V

    .line 60
    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/android/volley/toolbox/j;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()[B
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/android/volley/toolbox/j;->q()[B

    move-result-object v0

    return-object v0
.end method

.method public q()[B
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 91
    :try_start_0
    iget-object v1, p0, Lcom/android/volley/toolbox/j;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 95
    :goto_0
    return-object v0

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/android/volley/toolbox/j;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/android/volley/toolbox/j;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 92
    :catch_0
    move-exception v1

    .line 93
    const-string/jumbo v1, "Unsupported Encoding while trying to get the bytes of %s using %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/android/volley/toolbox/j;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 94
    invoke-virtual {p0}, Lcom/android/volley/toolbox/j;->o()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 93
    invoke-static {v1, v2}, Lcom/android/volley/n;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.class public abstract Lcom/qihoo/antivirus/update/ag;
.super Lcom/qihoo/antivirus/update/l;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/x$a;


# instance fields
.field protected final c:Lcom/qihoo/antivirus/update/d;

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;I)V
    .locals 2

    .prologue
    .line 14
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "updateurl"

    invoke-direct {p0, v0, v1}, Lcom/qihoo/antivirus/update/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lcom/qihoo/antivirus/update/ag;->c:Lcom/qihoo/antivirus/update/d;

    .line 17
    iput p2, p0, Lcom/qihoo/antivirus/update/ag;->d:I

    .line 18
    return-void
.end method


# virtual methods
.method protected abstract a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 102
    iget v0, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 103
    if-gez p1, :cond_0

    .line 104
    neg-int p1, p1

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ag;->b:[I

    iget v1, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    aput p1, v0, v1

    .line 108
    :cond_1
    return-void
.end method

.method public a(JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 99
    return-void
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 0

    .prologue
    .line 96
    return-void
.end method

.method public a(Lorg/apache/http/client/HttpClient;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/ag;->a()Ljava/lang/String;

    move-result-object v2

    .line 38
    iput v1, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    .line 40
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/qihoo/antivirus/update/ag;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_2

    .line 82
    :cond_0
    if-ltz v3, :cond_3

    .line 89
    :cond_1
    :goto_1
    return v0

    .line 45
    :cond_2
    const/4 v4, -0x4

    if-eq v3, v4, :cond_0

    const/16 v4, -0x63

    if-eq v3, v4, :cond_0

    .line 46
    const/16 v4, -0x62

    if-eq v3, v4, :cond_0

    const/16 v4, -0x61

    if-eq v3, v4, :cond_0

    .line 51
    sget-boolean v4, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    if-nez v4, :cond_1

    .line 59
    iget v4, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    .line 60
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/ag;->b()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo/antivirus/update/af;->b(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 66
    iget v4, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    const/4 v5, 0x2

    if-ge v4, v5, :cond_0

    .line 71
    const-wide/16 v4, 0x2710

    iget v3, p0, Lcom/qihoo/antivirus/update/ag;->a:I

    int-to-long v6, v3

    mul-long/2addr v4, v6

    .line 77
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 78
    :catch_0
    move-exception v3

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public d()I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/qihoo/antivirus/update/ag;->d:I

    return v0
.end method

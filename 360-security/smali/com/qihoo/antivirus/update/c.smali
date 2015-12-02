.class public Lcom/qihoo/antivirus/update/c;
.super Landroid/os/AsyncTask;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/x$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "Lcom/qihoo/antivirus/update/ab;",
        ">;",
        "Lcom/qihoo/antivirus/update/x$a;"
    }
.end annotation


# instance fields
.field public final a:Lcom/qihoo/antivirus/update/d;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:J

.field private final g:Z

.field private h:J


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 3

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 116
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/antivirus/update/c;->h:J

    .line 23
    iput-object p1, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    .line 24
    iput-object p2, p0, Lcom/qihoo/antivirus/update/c;->b:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Lcom/qihoo/antivirus/update/c;->c:Ljava/lang/String;

    .line 26
    iput-object p4, p0, Lcom/qihoo/antivirus/update/c;->e:Ljava/lang/String;

    .line 27
    iput-wide p5, p0, Lcom/qihoo/antivirus/update/c;->f:J

    .line 28
    iput-boolean p7, p0, Lcom/qihoo/antivirus/update/c;->g:Z

    .line 32
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ".patch"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/qihoo/antivirus/update/ab;
    .locals 9

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v1

    .line 38
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v2

    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz v2, :cond_0

    .line 41
    const/16 v0, 0x2710

    .line 46
    :cond_0
    invoke-static {v1}, Lcom/qihoo/antivirus/update/x;->e(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/HttpHost;I)Lorg/apache/http/client/HttpClient;

    move-result-object v8

    .line 48
    iget-boolean v0, p0, Lcom/qihoo/antivirus/update/c;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/antivirus/update/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/antivirus/update/c;->d:Ljava/lang/String;

    .line 55
    new-instance v0, Lcom/qihoo/antivirus/update/t;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    iget-object v2, p0, Lcom/qihoo/antivirus/update/c;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/antivirus/update/c;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/antivirus/update/c;->e:Ljava/lang/String;

    iget-wide v6, p0, Lcom/qihoo/antivirus/update/c;->f:J

    move-object v4, p0

    invoke-direct/range {v0 .. v7}, Lcom/qihoo/antivirus/update/t;-><init>(Lcom/qihoo/antivirus/update/d;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/antivirus/update/c;Ljava/lang/String;J)V

    .line 56
    invoke-virtual {v0, v8}, Lcom/qihoo/antivirus/update/t;->a(Lorg/apache/http/client/HttpClient;)Z

    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 65
    :goto_1
    return-object v0

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->c:Ljava/lang/String;

    goto :goto_0

    .line 65
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 109
    return-void
.end method

.method public a(JJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 98
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Long;

    const/4 v1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/antivirus/update/c;->publishProgress([Ljava/lang/Object;)V

    .line 102
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/c;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 104
    :cond_0
    return-void
.end method

.method protected a(Lcom/qihoo/antivirus/update/ab;)V
    .locals 2

    .prologue
    .line 83
    if-nez p1, :cond_0

    .line 84
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/d;->f(Ljava/lang/String;)V

    .line 88
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/antivirus/update/d;->b(Lcom/qihoo/antivirus/update/ab;)V

    goto :goto_0
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 0

    .prologue
    .line 114
    return-void
.end method

.method protected varargs a([Ljava/lang/Long;)V
    .locals 6

    .prologue
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 75
    iget-wide v2, p0, Lcom/qihoo/antivirus/update/c;->h:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 76
    iput-wide v0, p0, Lcom/qihoo/antivirus/update/c;->h:J

    .line 77
    iget-object v0, p0, Lcom/qihoo/antivirus/update/c;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 v1, 0x1

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/qihoo/antivirus/update/d;->b(JJ)V

    .line 79
    :cond_0
    return-void
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/c;->a([Ljava/lang/String;)Lcom/qihoo/antivirus/update/ab;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo/antivirus/update/ab;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/c;->a(Lcom/qihoo/antivirus/update/ab;)V

    return-void
.end method

.method protected varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/c;->a([Ljava/lang/Long;)V

    return-void
.end method

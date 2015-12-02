.class Lcom/qihoo/antivirus/update/o;
.super Landroid/os/AsyncTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Lcom/qihoo/antivirus/update/ab;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/qihoo/antivirus/update/d;


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qihoo/antivirus/update/o;->a:Lcom/qihoo/antivirus/update/d;

    .line 11
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/qihoo/antivirus/update/ab;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 15
    .line 22
    new-instance v0, Lcom/qihoo/antivirus/update/n;

    iget-object v2, p0, Lcom/qihoo/antivirus/update/o;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3}, Lcom/qihoo/antivirus/update/n;-><init>(Lcom/qihoo/antivirus/update/d;I)V

    .line 24
    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/n;->a(Lorg/apache/http/client/HttpClient;)Z

    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 35
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method protected a(Lcom/qihoo/antivirus/update/ab;)V
    .locals 1

    .prologue
    .line 50
    if-nez p1, :cond_0

    .line 51
    iget-object v0, p0, Lcom/qihoo/antivirus/update/o;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/d;->h()V

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/o;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/antivirus/update/d;->a(Lcom/qihoo/antivirus/update/ab;)V

    goto :goto_0
.end method

.method protected varargs a([Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 46
    return-void
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/o;->a([Ljava/lang/Void;)Lcom/qihoo/antivirus/update/ab;

    move-result-object v0

    return-object v0
.end method

.method protected onCancelled()V
    .locals 0

    .prologue
    .line 40
    invoke-super {p0}, Landroid/os/AsyncTask;->onCancelled()V

    .line 41
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo/antivirus/update/ab;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/o;->a(Lcom/qihoo/antivirus/update/ab;)V

    return-void
.end method

.method protected varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/o;->a([Ljava/lang/Integer;)V

    return-void
.end method

.class Lcom/umeng/common/net/m$b;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/common/net/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lcom/umeng/common/net/o$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/common/net/m;

.field private b:Lcom/umeng/common/net/n;

.field private c:Lcom/umeng/common/net/m$a;


# direct methods
.method public constructor <init>(Lcom/umeng/common/net/m;Lcom/umeng/common/net/n;Lcom/umeng/common/net/m$a;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/common/net/m$b;->a:Lcom/umeng/common/net/m;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/umeng/common/net/m$b;->b:Lcom/umeng/common/net/n;

    iput-object p3, p0, Lcom/umeng/common/net/m$b;->c:Lcom/umeng/common/net/m$a;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Integer;)Lcom/umeng/common/net/o$a;
    .locals 2

    iget-object v0, p0, Lcom/umeng/common/net/m$b;->a:Lcom/umeng/common/net/m;

    iget-object v1, p0, Lcom/umeng/common/net/m$b;->b:Lcom/umeng/common/net/n;

    invoke-virtual {v0, v1}, Lcom/umeng/common/net/m;->a(Lcom/umeng/common/net/n;)Lcom/umeng/common/net/o$a;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/umeng/common/net/o$a;)V
    .locals 1

    iget-object v0, p0, Lcom/umeng/common/net/m$b;->c:Lcom/umeng/common/net/m$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/umeng/common/net/m$b;->c:Lcom/umeng/common/net/m$a;

    invoke-interface {v0, p1}, Lcom/umeng/common/net/m$a;->a(Lcom/umeng/common/net/o$a;)V

    :cond_0
    return-void
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/umeng/common/net/m$b;->a([Ljava/lang/Integer;)Lcom/umeng/common/net/o$a;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/umeng/common/net/o$a;

    invoke-virtual {p0, p1}, Lcom/umeng/common/net/m$b;->a(Lcom/umeng/common/net/o$a;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    iget-object v0, p0, Lcom/umeng/common/net/m$b;->c:Lcom/umeng/common/net/m$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/umeng/common/net/m$b;->c:Lcom/umeng/common/net/m$a;

    invoke-interface {v0}, Lcom/umeng/common/net/m$a;->a()V

    :cond_0
    return-void
.end method

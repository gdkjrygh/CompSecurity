.class public Lcom/umeng/common/net/m;
.super Lcom/umeng/common/net/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/common/net/m$a;,
        Lcom/umeng/common/net/m$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/umeng/common/net/r;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/common/net/n;)Lcom/umeng/common/net/o$a;
    .locals 1

    const-class v0, Lcom/umeng/common/net/o;

    invoke-virtual {p0, p1, v0}, Lcom/umeng/common/net/m;->a(Lcom/umeng/common/net/s;Ljava/lang/Class;)Lcom/umeng/common/net/t;

    move-result-object v0

    check-cast v0, Lcom/umeng/common/net/o;

    if-nez v0, :cond_0

    sget-object v0, Lcom/umeng/common/net/o$a;->b:Lcom/umeng/common/net/o$a;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/umeng/common/net/o;->a:Lcom/umeng/common/net/o$a;

    goto :goto_0
.end method

.method public a(Lcom/umeng/common/net/n;Lcom/umeng/common/net/m$a;)V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/umeng/common/net/m$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/umeng/common/net/m$b;-><init>(Lcom/umeng/common/net/m;Lcom/umeng/common/net/n;Lcom/umeng/common/net/m$a;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/umeng/common/net/m$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    if-eqz p2, :cond_0

    sget-object v0, Lcom/umeng/common/net/o$a;->b:Lcom/umeng/common/net/o$a;

    invoke-interface {p2, v0}, Lcom/umeng/common/net/m$a;->a(Lcom/umeng/common/net/o$a;)V

    goto :goto_0
.end method

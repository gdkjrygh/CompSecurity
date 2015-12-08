.class Lcom/umeng/common/net/p$c;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/common/net/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Integer;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Landroid/widget/ImageView;

.field private d:Lcom/umeng/common/net/p$b;

.field private e:Z

.field private f:Lcom/umeng/common/net/p$a;

.field private g:Landroid/view/animation/Animation;

.field private h:Z

.field private i:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Lcom/umeng/common/net/p$b;Ljava/io/File;ZLcom/umeng/common/net/p$a;Landroid/view/animation/Animation;Z)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p5, p0, Lcom/umeng/common/net/p$c;->i:Ljava/io/File;

    iput-object p1, p0, Lcom/umeng/common/net/p$c;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/umeng/common/net/p$c;->b:Ljava/lang/String;

    iput-object p7, p0, Lcom/umeng/common/net/p$c;->f:Lcom/umeng/common/net/p$a;

    iput-object p4, p0, Lcom/umeng/common/net/p$c;->d:Lcom/umeng/common/net/p$b;

    iput-boolean p6, p0, Lcom/umeng/common/net/p$c;->e:Z

    iput-object p8, p0, Lcom/umeng/common/net/p$c;->g:Landroid/view/animation/Animation;

    iput-object p2, p0, Lcom/umeng/common/net/p$c;->c:Landroid/widget/ImageView;

    iput-boolean p9, p0, Lcom/umeng/common/net/p$c;->h:Z

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 4

    const/4 v1, 0x0

    sget-boolean v0, Lcom/umeng/common/net/p;->a:Z

    if-eqz v0, :cond_0

    const-wide/16 v2, 0xbb8

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/umeng/common/net/p$c;->i:Ljava/io/File;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->i:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->i:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/common/net/p;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/umeng/common/net/p$c;->i:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    invoke-static {}, Lcom/umeng/common/net/p;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "get drawable from cacheFile."

    invoke-static {v1, v2}, Lcom/umeng/common/Log;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/umeng/common/net/p$c;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/umeng/common/net/p$c;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/umeng/common/net/p;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/umeng/common/net/p$c;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/umeng/common/net/p;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/common/net/p;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_2
    invoke-static {}, Lcom/umeng/common/net/p;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "get drawable from net else file."

    invoke-static {v2, v3}, Lcom/umeng/common/Log;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/umeng/common/net/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lcom/umeng/common/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v0, v1

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method protected a(Landroid/graphics/drawable/Drawable;)V
    .locals 8

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/umeng/common/net/p$c;->c:Landroid/widget/ImageView;

    iget-boolean v3, p0, Lcom/umeng/common/net/p$c;->e:Z

    iget-object v4, p0, Lcom/umeng/common/net/p$c;->f:Lcom/umeng/common/net/p$a;

    iget-object v5, p0, Lcom/umeng/common/net/p$c;->g:Landroid/view/animation/Animation;

    iget-boolean v6, p0, Lcom/umeng/common/net/p$c;->h:Z

    iget-object v7, p0, Lcom/umeng/common/net/p$c;->b:Ljava/lang/String;

    move-object v2, p1

    invoke-static/range {v0 .. v7}, Lcom/umeng/common/net/p;->a(Landroid/content/Context;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;ZLcom/umeng/common/net/p$a;Landroid/view/animation/Animation;ZLjava/lang/String;)V

    return-void
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lcom/umeng/common/net/p$c;->a([Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lcom/umeng/common/net/p$c;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->f:Lcom/umeng/common/net/p$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/umeng/common/net/p$c;->f:Lcom/umeng/common/net/p$a;

    iget-object v1, p0, Lcom/umeng/common/net/p$c;->d:Lcom/umeng/common/net/p$b;

    invoke-interface {v0, v1}, Lcom/umeng/common/net/p$a;->a(Lcom/umeng/common/net/p$b;)V

    :cond_0
    return-void
.end method

.class final Lcom/kik/cards/web/usermedia/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Landroid/graphics/Bitmap$CompressFormat;

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:Lcom/kik/cards/web/usermedia/PhotoPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Lcom/kik/cards/web/plugin/a;IIZLandroid/graphics/Bitmap$CompressFormat;III)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    iput p3, p0, Lcom/kik/cards/web/usermedia/d;->b:I

    iput p4, p0, Lcom/kik/cards/web/usermedia/d;->c:I

    iput-boolean p5, p0, Lcom/kik/cards/web/usermedia/d;->d:Z

    iput-object p6, p0, Lcom/kik/cards/web/usermedia/d;->e:Landroid/graphics/Bitmap$CompressFormat;

    iput p7, p0, Lcom/kik/cards/web/usermedia/d;->f:I

    iput p8, p0, Lcom/kik/cards/web/usermedia/d;->g:I

    iput p9, p0, Lcom/kik/cards/web/usermedia/d;->h:I

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 310
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-virtual {v0, p1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b(Ljava/lang/String;)Lcom/kik/cards/web/usermedia/c;

    move-result-object v0

    instance-of v1, v0, Lcom/kik/cards/usermedia/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/DeviceUtils;->e(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    const/16 v1, 0x194

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V

    :goto_0
    return-void

    :cond_0
    iget v1, p0, Lcom/kik/cards/web/usermedia/d;->b:I

    iget v2, p0, Lcom/kik/cards/web/usermedia/d;->c:I

    iget-boolean v3, p0, Lcom/kik/cards/web/usermedia/d;->d:Z

    invoke-interface {v0, v1, v2, v3}, Lcom/kik/cards/web/usermedia/c;->a(IIZ)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/usermedia/e;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/usermedia/e;-><init>(Lcom/kik/cards/web/usermedia/d;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 314
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    const/16 v1, 0xc8

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V

    .line 315
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 316
    return-void
.end method

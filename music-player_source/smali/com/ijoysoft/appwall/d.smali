.class public final Lcom/ijoysoft/appwall/d;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/HashMap;

.field private b:Landroid/os/Handler;

.field private c:Ljava/util/ArrayList;

.field private d:Ljava/lang/Thread;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    new-instance v0, Lcom/ijoysoft/appwall/e;

    invoke-direct {v0, p0}, Lcom/ijoysoft/appwall/e;-><init>(Lcom/ijoysoft/appwall/d;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/d;->b:Landroid/os/Handler;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/d;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ijoysoft/appwall/d;->e:Z

    new-instance v0, Lcom/ijoysoft/appwall/f;

    invoke-direct {v0, p0}, Lcom/ijoysoft/appwall/f;-><init>(Lcom/ijoysoft/appwall/d;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/d;->d:Ljava/lang/Thread;

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->d:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/d;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/ijoysoft/appwall/d;->e:Z

    return v0
.end method

.method static synthetic b(Lcom/ijoysoft/appwall/d;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/ijoysoft/appwall/d;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->b:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/ijoysoft/appwall/d;)Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/ijoysoft/appwall/o;Lcom/ijoysoft/appwall/g;)Landroid/graphics/Bitmap;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const-string v1, "changle-icon"

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    const-string v1, "changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"

    const-string v2, "\u7f13\u5b58\u4e2d\u53d6"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"

    const-string v1, "\u7f13\u5b58\u4e2d\u6ca1BM"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/ijoysoft/appwall/d;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/ijoysoft/appwall/GiftActivity;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"

    const-string v2, "\u83b7\u53d6"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/ijoysoft/appwall/h;

    invoke-direct {v2, p0}, Lcom/ijoysoft/appwall/h;-><init>(Lcom/ijoysoft/appwall/d;)V

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ijoysoft/appwall/h;->a(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ijoysoft/appwall/o;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ijoysoft/appwall/h;->b(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V

    invoke-static {v2, v1}, Lcom/ijoysoft/appwall/h;->c(Lcom/ijoysoft/appwall/h;Ljava/lang/String;)V

    invoke-static {v2, p2}, Lcom/ijoysoft/appwall/h;->a(Lcom/ijoysoft/appwall/h;Lcom/ijoysoft/appwall/g;)V

    iget-object v1, p0, Lcom/ijoysoft/appwall/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/ijoysoft/appwall/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/ijoysoft/appwall/d;->d:Ljava/lang/Thread;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/ijoysoft/appwall/d;->d:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    const-string v1, "changle~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"

    const-string v2, "\u56de\u8c03"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

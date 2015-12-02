.class Lcom/qihoo/security/ui/b/a$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Lcom/qihoo/security/ui/b/a$d;

.field b:Ljava/util/concurrent/CountDownLatch;

.field c:Lcom/qihoo/security/ui/b/a$f;

.field d:Ljava/lang/String;

.field final synthetic e:Lcom/qihoo/security/ui/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/a;Lcom/qihoo/security/ui/b/a$d;)V
    .locals 2

    .prologue
    .line 223
    iput-object p1, p0, Lcom/qihoo/security/ui/b/a$c;->e:Lcom/qihoo/security/ui/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->b:Ljava/util/concurrent/CountDownLatch;

    .line 224
    iput-object p2, p0, Lcom/qihoo/security/ui/b/a$c;->a:Lcom/qihoo/security/ui/b/a$d;

    .line 225
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$f;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 259
    :try_start_0
    new-instance v0, Lcom/qihoo/security/ui/b/a$f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    .line 260
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a$c;->e:Lcom/qihoo/security/ui/b/a;

    invoke-static {v2}, Lcom/qihoo/security/ui/b/a;->c(Lcom/qihoo/security/ui/b/a;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget v3, p1, Lcom/qihoo/security/ui/b/a$d;->b:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 261
    iput-object v3, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 263
    iget-object v4, p1, Lcom/qihoo/security/ui/b/a$d;->c:[I

    .line 264
    if-eqz v4, :cond_0

    .line 265
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 266
    iput-object v5, v0, Lcom/qihoo/security/ui/b/a$f;->c:Landroid/util/SparseArray;

    .line 267
    array-length v6, v4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v6, :cond_0

    aget v7, v4, v2

    .line 268
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 267
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 271
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/ui/b/a$c;->d:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    :goto_1
    return-object v0

    .line 279
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 284
    goto :goto_1
.end method


# virtual methods
.method public a()Lcom/qihoo/security/ui/b/a$f;
    .locals 1

    .prologue
    .line 229
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->c:Lcom/qihoo/security/ui/b/a$f;

    return-object v0

    .line 230
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->a:Lcom/qihoo/security/ui/b/a$d;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/a$c;->a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->c:Lcom/qihoo/security/ui/b/a$f;

    .line 251
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$c;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 255
    return-void
.end method

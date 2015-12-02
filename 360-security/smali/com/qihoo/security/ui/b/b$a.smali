.class final Lcom/qihoo/security/ui/b/b$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/util/Printer;
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/b/b$a$a;
    }
.end annotation


# instance fields
.field final a:I

.field b:J

.field c:J

.field d:I

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/ViewTreeObserver;",
            ">;"
        }
    .end annotation
.end field

.field final f:Z

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/b/b$a$a;",
            ">;"
        }
    .end annotation
.end field

.field h:Z

.field i:Lcom/qihoo/security/ui/b/b$a$a;


# direct methods
.method constructor <init>(I)V
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 229
    iput p1, p0, Lcom/qihoo/security/ui/b/b$a;->a:I

    .line 230
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->c()Lcom/qihoo/security/ui/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/b;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/b/b$a;->f:Z

    .line 231
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .prologue
    .line 234
    iget-wide v0, p0, Lcom/qihoo/security/ui/b/b$a;->c:J

    iget-wide v2, p0, Lcom/qihoo/security/ui/b/b$a;->b:J

    sub-long/2addr v0, v2

    .line 235
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    .line 236
    const/4 v0, -0x1

    .line 241
    :goto_0
    return v0

    .line 238
    :cond_0
    iget v2, p0, Lcom/qihoo/security/ui/b/b$a;->d:I

    if-gtz v2, :cond_1

    .line 239
    const/4 v0, 0x0

    goto :goto_0

    .line 241
    :cond_1
    iget v2, p0, Lcom/qihoo/security/ui/b/b$a;->d:I

    int-to-float v2, v2

    const v3, 0x4e6e6b28    # 1.0E9f

    mul-float/2addr v2, v3

    long-to-float v0, v0

    div-float v0, v2, v0

    float-to-int v0, v0

    goto :goto_0
.end method

.method final a(Landroid/view/ViewTreeObserver;)V
    .locals 2

    .prologue
    .line 278
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->e:Ljava/lang/ref/WeakReference;

    .line 279
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 280
    iget-boolean v0, p0, Lcom/qihoo/security/ui/b/b$a;->f:Z

    if-eqz v0, :cond_0

    .line 281
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->g:Ljava/util/List;

    .line 282
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Looper;->setMessageLogging(Landroid/util/Printer;)V

    .line 284
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/b/b$a;->b:J

    .line 285
    return-void
.end method

.method final b()V
    .locals 2

    .prologue
    .line 288
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/b/b$a;->c:J

    .line 289
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/b/b$a;->h:Z

    .line 290
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewTreeObserver;

    .line 291
    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 294
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/ui/b/b$a;->f:Z

    if-eqz v0, :cond_1

    .line 295
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Looper;->setMessageLogging(Landroid/util/Printer;)V

    .line 297
    :cond_1
    return-void
.end method

.method public onPreDraw()Z
    .locals 4

    .prologue
    .line 301
    iget v0, p0, Lcom/qihoo/security/ui/b/b$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/b/b$a;->d:I

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/ui/b/b$a$a;->c:J

    .line 305
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public println(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 246
    iget-boolean v0, p0, Lcom/qihoo/security/ui/b/b$a;->h:Z

    if-eqz v0, :cond_1

    .line 257
    :cond_0
    :goto_0
    return-void

    .line 249
    :cond_1
    const-string/jumbo v0, ">>>>> Dispatching to Handler "

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    new-instance v0, Lcom/qihoo/security/ui/b/b$a$a;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/b$a$a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    .line 251
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    iput-object p1, v0, Lcom/qihoo/security/ui/b/b$a$a;->d:Ljava/lang/String;

    .line 252
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/ui/b/b$a$a;->a:J

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->g:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 254
    :cond_2
    const-string/jumbo v0, "<<<<< Finished to "

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$a;->i:Lcom/qihoo/security/ui/b/b$a$a;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/ui/b/b$a$a;->b:J

    goto :goto_0
.end method

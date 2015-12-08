.class final Lcrittercism/android/az$6;
.super Lcrittercism/android/di;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:J

.field final synthetic c:Lcrittercism/android/az;


# direct methods
.method constructor <init>(Lcrittercism/android/az;Ljava/lang/Throwable;J)V
    .locals 0

    .prologue
    .line 681
    iput-object p1, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iput-object p2, p0, Lcrittercism/android/az$6;->a:Ljava/lang/Throwable;

    iput-wide p3, p0, Lcrittercism/android/az$6;->b:J

    invoke-direct {p0}, Lcrittercism/android/di;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    .line 683
    iget-object v0, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v0, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 712
    :cond_0
    :goto_0
    return-void

    .line 685
    :cond_1
    new-instance v0, Lcrittercism/android/bk;

    iget-object v1, p0, Lcrittercism/android/az$6;->a:Ljava/lang/Throwable;

    iget-wide v2, p0, Lcrittercism/android/az$6;->b:J

    invoke-direct {v0, v1, v2, v3}, Lcrittercism/android/bk;-><init>(Ljava/lang/Throwable;J)V

    .line 686
    const-string v1, "current_session"

    iget-object v2, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v2, v2, Lcrittercism/android/az;->k:Lcrittercism/android/br;

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/bk;->a(Ljava/lang/String;Lcrittercism/android/br;)V

    .line 688
    const-string v1, "he"

    iput-object v1, v0, Lcrittercism/android/bk;->d:Ljava/lang/String;

    .line 692
    iget-object v1, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v1, v1, Lcrittercism/android/az;->h:Lcrittercism/android/br;

    invoke-virtual {v1, v0}, Lcrittercism/android/br;->a(Lcrittercism/android/cg;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 693
    sget-object v1, Lcrittercism/android/az;->a:Lcrittercism/android/az;

    new-instance v2, Lcrittercism/android/bx;

    iget-object v3, v0, Lcrittercism/android/bk;->b:Ljava/lang/String;

    iget-object v0, v0, Lcrittercism/android/bk;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v0}, Lcrittercism/android/bx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcrittercism/android/az;->a(Lcrittercism/android/ch;)V

    .line 696
    iget-object v0, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v0, v0, Lcrittercism/android/az;->q:Lcrittercism/android/cv;

    invoke-virtual {v0}, Lcrittercism/android/cv;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 697
    new-instance v0, Lcrittercism/android/df;

    iget-object v1, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v1, v1, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcrittercism/android/df;-><init>(Landroid/content/Context;)V

    .line 699
    iget-object v1, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v1, v1, Lcrittercism/android/az;->h:Lcrittercism/android/br;

    new-instance v2, Lcrittercism/android/da$a;

    invoke-direct {v2}, Lcrittercism/android/da$a;-><init>()V

    iget-object v3, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v3, v3, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/android_v2/handle_exceptions"

    const/4 v5, 0x0

    sget-object v6, Lcrittercism/android/az;->a:Lcrittercism/android/az;

    new-instance v7, Lcrittercism/android/cu$a;

    invoke-direct {v7}, Lcrittercism/android/cu$a;-><init>()V

    invoke-virtual/range {v0 .. v7}, Lcrittercism/android/df;->a(Lcrittercism/android/br;Lcrittercism/android/cz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrittercism/android/au;Lcrittercism/android/cx;)V

    .line 708
    iget-object v1, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v1, v1, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    iget-object v2, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v2, v2, Lcrittercism/android/az;->s:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/df;->a(Lcrittercism/android/dg;Ljava/util/concurrent/ExecutorService;)V

    .line 709
    iget-object v0, p0, Lcrittercism/android/az$6;->c:Lcrittercism/android/az;

    iget-object v0, v0, Lcrittercism/android/az;->q:Lcrittercism/android/cv;

    invoke-virtual {v0}, Lcrittercism/android/cv;->b()V

    goto :goto_0
.end method

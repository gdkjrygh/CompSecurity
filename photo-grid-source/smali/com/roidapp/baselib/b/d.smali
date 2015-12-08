.class public final Lcom/roidapp/baselib/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/b/b;

.field private final b:Lcom/roidapp/baselib/b/f;

.field private c:Z


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/f;)V
    .locals 0

    .prologue
    .line 790
    iput-object p1, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 791
    iput-object p2, p0, Lcom/roidapp/baselib/b/d;->b:Lcom/roidapp/baselib/b/f;

    .line 792
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/f;B)V
    .locals 0

    .prologue
    .line 786
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/b/d;-><init>(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/f;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/f;
    .locals 1

    .prologue
    .line 786
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->b:Lcom/roidapp/baselib/b/f;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/baselib/b/d;)Z
    .locals 1

    .prologue
    .line 786
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/b/d;->c:Z

    return v0
.end method


# virtual methods
.method public final a()Ljava/io/OutputStream;
    .locals 5

    .prologue
    .line 827
    iget-object v1, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    monitor-enter v1

    .line 828
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->b:Lcom/roidapp/baselib/b/f;

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 829
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "This entry editor error"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 832
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 831
    :cond_0
    :try_start_1
    new-instance v0, Lcom/roidapp/baselib/b/e;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/roidapp/baselib/b/d;->b:Lcom/roidapp/baselib/b/f;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/roidapp/baselib/b/f;->b(I)Ljava/io/File;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lcom/roidapp/baselib/b/e;-><init>(Lcom/roidapp/baselib/b/d;Ljava/io/OutputStream;B)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 853
    iget-boolean v0, p0, Lcom/roidapp/baselib/b/d;->c:Z

    if-eqz v0, :cond_0

    .line 854
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/roidapp/baselib/b/b;->a(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/d;Z)V

    .line 855
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    iget-object v1, p0, Lcom/roidapp/baselib/b/d;->b:Lcom/roidapp/baselib/b/f;

    invoke-static {v1}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/b;->c(Ljava/lang/String;)Z

    .line 859
    :goto_0
    return-void

    .line 857
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lcom/roidapp/baselib/b/b;->a(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/d;Z)V

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 866
    iget-object v0, p0, Lcom/roidapp/baselib/b/d;->a:Lcom/roidapp/baselib/b/b;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/roidapp/baselib/b/b;->a(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/d;Z)V

    .line 867
    return-void
.end method

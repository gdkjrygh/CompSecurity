.class public Lcom/kik/g/p;
.super Lcom/kik/g/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/p$1;,
        Lcom/kik/g/p$a;
    }
.end annotation


# instance fields
.field private volatile b:Ljava/lang/Throwable;

.field private volatile c:Ljava/lang/Object;

.field private volatile d:I

.field private e:Z

.field private f:Ljava/util/List;

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/kik/g/q;-><init>()V

    .line 29
    sget v0, Lcom/kik/g/p$a;->a:I

    iput v0, p0, Lcom/kik/g/p;->d:I

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/g/p;->f:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/g/p;->g:Ljava/lang/Object;

    .line 38
    return-void
.end method

.method private a(ILcom/kik/g/r;)V
    .locals 2

    .prologue
    .line 44
    :try_start_0
    sget-object v0, Lcom/kik/g/p$1;->a:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch v0, :pswitch_data_0

    .line 62
    :goto_0
    iget-object v0, p0, Lcom/kik/g/p;->c:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->b(Ljava/lang/Object;)V

    .line 63
    invoke-virtual {p2}, Lcom/kik/g/r;->a()V

    .line 64
    return-void

    .line 46
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/kik/g/p;->c:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p2}, Lcom/kik/g/r;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/kik/g/p;->c:Ljava/lang/Object;

    invoke-virtual {p2, v1}, Lcom/kik/g/r;->b(Ljava/lang/Object;)V

    .line 63
    invoke-virtual {p2}, Lcom/kik/g/r;->a()V

    throw v0

    .line 51
    :pswitch_1
    :try_start_2
    invoke-virtual {p2}, Lcom/kik/g/r;->b()V

    .line 52
    iget-object v0, p0, Lcom/kik/g/p;->b:Ljava/lang/Throwable;

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 56
    :pswitch_2
    iget-object v0, p0, Lcom/kik/g/p;->b:Ljava/lang/Throwable;

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    .line 57
    iget-object v0, p0, Lcom/kik/g/p;->b:Ljava/lang/Throwable;

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 44
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(ILjava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 69
    iget-object v2, p0, Lcom/kik/g/p;->f:Ljava/util/List;

    .line 71
    iget-object v1, p0, Lcom/kik/g/p;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 72
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/g/p;->e:Z

    if-nez v0, :cond_0

    .line 74
    iput-object p2, p0, Lcom/kik/g/p;->c:Ljava/lang/Object;

    .line 75
    iput p1, p0, Lcom/kik/g/p;->d:I

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/g/p;->e:Z

    .line 77
    iput-object p3, p0, Lcom/kik/g/p;->b:Ljava/lang/Throwable;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/g/p;->f:Ljava/util/List;

    .line 83
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 88
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/r;

    invoke-direct {p0, p1, v0}, Lcom/kik/g/p;->a(ILcom/kik/g/r;)V

    .line 87
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 81
    :cond_0
    :try_start_1
    monitor-exit v1

    .line 93
    :goto_1
    return-void

    .line 83
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 92
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    goto :goto_1
.end method


# virtual methods
.method public final a(Lcom/kik/g/r;)Lcom/kik/g/r;
    .locals 2

    .prologue
    .line 113
    iget-object v1, p0, Lcom/kik/g/p;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 114
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/g/p;->e:Z

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/kik/g/p;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    monitor-exit v1

    .line 125
    :goto_0
    return-object p1

    .line 120
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    iget v0, p0, Lcom/kik/g/p;->d:I

    invoke-direct {p0, v0, p1}, Lcom/kik/g/p;->a(ILcom/kik/g/r;)V

    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 134
    sget v0, Lcom/kik/g/p$a;->b:I

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/kik/g/p;->a(ILjava/lang/Object;Ljava/lang/Throwable;)V

    .line 135
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 143
    sget v0, Lcom/kik/g/p$a;->c:I

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/kik/g/p;->a(ILjava/lang/Object;Ljava/lang/Throwable;)V

    .line 144
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 151
    sget v0, Lcom/kik/g/p$a;->d:I

    invoke-direct {p0, v0, v1, v1}, Lcom/kik/g/p;->a(ILjava/lang/Object;Ljava/lang/Throwable;)V

    .line 152
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/kik/g/p;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final g()Z
    .locals 2

    .prologue
    .line 169
    iget v0, p0, Lcom/kik/g/p;->d:I

    sget v1, Lcom/kik/g/p$a;->a:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Z
    .locals 2

    .prologue
    .line 174
    iget v0, p0, Lcom/kik/g/p;->d:I

    sget v1, Lcom/kik/g/p$a;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 2

    .prologue
    .line 179
    iget v0, p0, Lcom/kik/g/p;->d:I

    sget v1, Lcom/kik/g/p$a;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 184
    iget v0, p0, Lcom/kik/g/p;->d:I

    sget v1, Lcom/kik/g/p$a;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

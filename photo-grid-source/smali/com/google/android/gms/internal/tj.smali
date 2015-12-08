.class public abstract Lcom/google/android/gms/internal/tj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/internal/tj",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/xw;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/vp;

.field private f:Ljava/lang/Integer;

.field private g:Lcom/google/android/gms/internal/tm;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:J

.field private l:Lcom/google/android/gms/internal/ws;

.field private m:Lcom/google/android/gms/internal/be;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/vp;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/internal/xw;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/xw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xw;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/tj;->a:Lcom/google/android/gms/internal/xw;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tj;->h:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/tj;->i:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/tj;->j:Z

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/internal/tj;->k:J

    iput-object v1, p0, Lcom/google/android/gms/internal/tj;->m:Lcom/google/android/gms/internal/be;

    iput v2, p0, Lcom/google/android/gms/internal/tj;->b:I

    iput-object p1, p0, Lcom/google/android/gms/internal/tj;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/tj;->e:Lcom/google/android/gms/internal/vp;

    new-instance v0, Lcom/google/android/gms/internal/fe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fe;-><init>()V

    .line 1000
    iput-object v0, p0, Lcom/google/android/gms/internal/tj;->l:Lcom/google/android/gms/internal/ws;

    .line 2000
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 0
    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/tj;->d:I

    return-void

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    .line 2000
    goto :goto_1
.end method

.method protected static a(Lcom/google/android/gms/internal/xm;)Lcom/google/android/gms/internal/xm;
    .locals 0

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tj;)Lcom/google/android/gms/internal/xw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->a:Lcom/google/android/gms/internal/xw;

    return-object v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 0
    const-string v0, "application/x-www-form-urlencoded; charset=UTF-8"

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/tj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/gms/internal/tj",
            "<*>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/tj;->f:Ljava/lang/Integer;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/be;)Lcom/google/android/gms/internal/tj;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/be;",
            ")",
            "Lcom/google/android/gms/internal/tj",
            "<*>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/tj;->m:Lcom/google/android/gms/internal/be;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/tm;)Lcom/google/android/gms/internal/tj;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/tm;",
            ")",
            "Lcom/google/android/gms/internal/tj",
            "<*>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/tj;->g:Lcom/google/android/gms/internal/tm;

    return-object p0
.end method

.method protected abstract a(Lcom/google/android/gms/internal/pl;)Lcom/google/android/gms/internal/vo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pl;",
            ")",
            "Lcom/google/android/gms/internal/vo",
            "<TT;>;"
        }
    .end annotation
.end method

.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected abstract a(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/internal/xw;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->a:Lcom/google/android/gms/internal/xw;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/internal/xw;->a(Ljava/lang/String;J)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/tj;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/tj;->k:J

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/tj;->b:I

    return v0
.end method

.method public final b(Lcom/google/android/gms/internal/xm;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->e:Lcom/google/android/gms/internal/vp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->e:Lcom/google/android/gms/internal/vp;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/vp;->a(Lcom/google/android/gms/internal/xm;)V

    :cond_0
    return-void
.end method

.method final b(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->g:Lcom/google/android/gms/internal/tm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->g:Lcom/google/android/gms/internal/tm;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/tm;->b(Lcom/google/android/gms/internal/tj;)V

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/xw;->a:Z

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v2, v3, :cond_2

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/google/android/gms/internal/tk;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/google/android/gms/internal/tk;-><init>(Lcom/google/android/gms/internal/tj;Ljava/lang/String;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/tj;->a:Lcom/google/android/gms/internal/xw;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/internal/xw;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->a:Lcom/google/android/gms/internal/xw;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/tj;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/xw;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/tj;->k:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-string v2, "%d ms: %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/tj;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v0

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/xv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/tj;->d:I

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/tj;

    .line 9000
    sget-object v0, Lcom/google/android/gms/internal/tl;->b:Lcom/google/android/gms/internal/tl;

    .line 10000
    sget-object v1, Lcom/google/android/gms/internal/tl;->b:Lcom/google/android/gms/internal/tl;

    .line 8000
    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p1, Lcom/google/android/gms/internal/tj;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/tl;->ordinal()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tl;->ordinal()I

    move-result v0

    sub-int v0, v1, v0

    .line 0
    goto :goto_0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 0
    .line 3000
    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->c:Ljava/lang/String;

    .line 0
    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/be;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->m:Lcom/google/android/gms/internal/be;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tj;->i:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tj;->h:Z

    return v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->l:Lcom/google/android/gms/internal/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ws;->a()I

    move-result v0

    return v0
.end method

.method public final k()Lcom/google/android/gms/internal/ws;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tj;->l:Lcom/google/android/gms/internal/ws;

    return-object v0
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tj;->j:Z

    return-void
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tj;->j:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5000
    iget v1, p0, Lcom/google/android/gms/internal/tj;->d:I

    .line 0
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tj;->i:Z

    if-eqz v0, :cond_0

    const-string v0, "[X] "

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 6000
    iget-object v2, p0, Lcom/google/android/gms/internal/tj;->c:Ljava/lang/String;

    .line 0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 7000
    sget-object v1, Lcom/google/android/gms/internal/tl;->b:Lcom/google/android/gms/internal/tl;

    .line 0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/tj;->f:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "[ ] "

    goto :goto_0
.end method

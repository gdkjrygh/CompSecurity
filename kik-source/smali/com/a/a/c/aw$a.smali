.class final Lcom/a/a/c/aw$a;
.super Lb/a/a/a/a/b/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/aw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/c/aw;

.field private final b:F


# direct methods
.method constructor <init>(Lcom/a/a/c/aw;F)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/a/a/c/aw$a;->a:Lcom/a/a/c/aw;

    invoke-direct {p0}, Lb/a/a/a/a/b/i;-><init>()V

    .line 125
    iput p2, p0, Lcom/a/a/c/aw$a;->b:F

    .line 126
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .prologue
    .line 131
    :try_start_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Starting report processing in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/a/a/c/aw$a;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " second(s)..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/a/a/c/aw$a;->b:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    :try_start_1
    iget v0, p0, Lcom/a/a/c/aw$a;->b:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :try_start_2
    invoke-static {}, Lcom/a/a/c/g;->f()Lcom/a/a/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c/g;->l()Lcom/a/a/c/x;

    move-result-object v2

    iget-object v1, p0, Lcom/a/a/c/aw$a;->a:Lcom/a/a/c/aw;

    invoke-virtual {v1}, Lcom/a/a/c/aw;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Lcom/a/a/c/x;->a()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v2

    new-instance v3, Lcom/a/a/c/m;

    invoke-direct {v3, v0}, Lcom/a/a/c/m;-><init>(Lcom/a/a/c/g;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lb/a/a/a/a/g/q;->a(Lb/a/a/a/a/g/q$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "User declined to send. Removing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " Report(s)."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/av;

    invoke-interface {v0}, Lcom/a/a/c/av;->a()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 132
    :catch_0
    move-exception v0

    .line 133
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "An unexpected error occurred while attempting to upload crash reports."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/a/a/c/aw$a;->a:Lcom/a/a/c/aw;

    invoke-static {v0}, Lcom/a/a/c/aw;->a(Lcom/a/a/c/aw;)Ljava/lang/Thread;

    .line 138
    return-void

    .line 131
    :catch_1
    move-exception v0

    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    move-object v8, v1

    move v1, v0

    move-object v0, v8

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/a/a/c/g;->f()Lcom/a/a/c/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/a/a/c/g;->l()Lcom/a/a/c/x;

    move-result-object v2

    invoke-virtual {v2}, Lcom/a/a/c/x;->a()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attempting to send "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report(s)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/av;

    iget-object v3, p0, Lcom/a/a/c/aw$a;->a:Lcom/a/a/c/aw;

    invoke-virtual {v3, v0}, Lcom/a/a/c/aw;->a(Lcom/a/a/c/av;)Z

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/a/a/c/aw$a;->a:Lcom/a/a/c/aw;

    invoke-virtual {v0}, Lcom/a/a/c/aw;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/a/a/c/aw;->b()[S

    move-result-object v3

    add-int/lit8 v2, v1, 0x1

    invoke-static {}, Lcom/a/a/c/aw;->b()[S

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    aget-short v1, v3, v1

    int-to-long v4, v1

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Report submisson: scheduling delayed retry in "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " seconds"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    :try_start_4
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move v1, v2

    goto :goto_2

    :catch_2
    move-exception v0

    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_1
.end method

.class public Lcom/qihoo/security/engine/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/qihoo/security/services/d;

.field final d:Lcom/qihoo/security/engine/a$a;

.field private e:I

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/qihoo/security/services/d;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;",
            "Lcom/qihoo/security/engine/a$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a;->f:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a;->g:Z

    iput p1, p0, Lcom/qihoo/security/engine/a;->a:I

    iput-object p2, p0, Lcom/qihoo/security/engine/a;->c:Lcom/qihoo/security/services/d;

    iput-object p3, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/qihoo/security/engine/a;->d:Lcom/qihoo/security/engine/a$a;

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/a;->e:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a;->g:Z

    iget-boolean v0, p0, Lcom/qihoo/security/engine/a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/a;->c:Lcom/qihoo/security/services/d;

    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/services/d;->a(I)Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->f(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const v0, -0x7fff0001

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcom/qihoo/security/engine/a;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/qihoo/security/engine/a;

    iget v1, p1, Lcom/qihoo/security/engine/a;->a:I

    iget v2, p0, Lcom/qihoo/security/engine/a;->a:I

    if-ne v1, v2, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public run()V
    .locals 5

    const/4 v4, 0x0

    iget-boolean v0, p0, Lcom/qihoo/security/engine/a;->g:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/engine/a;->g:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/a;->d:Lcom/qihoo/security/engine/a$a;

    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    iget-object v2, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/engine/a$a;->a(ILjava/util/List;)V

    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/a;->c:Lcom/qihoo/security/services/d;

    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/services/d;->a(I)Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/qihoo/security/engine/a;->f:Z

    :try_start_0
    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    iget-object v2, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/services/a;->a(ILjava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/a;->e:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v4, p0, Lcom/qihoo/security/engine/a;->f:Z

    goto :goto_0

    :catch_0
    move-exception v0

    const v1, -0x7fffbffb

    :try_start_1
    iput v1, p0, Lcom/qihoo/security/engine/a;->e:I

    iget-object v1, p0, Lcom/qihoo/security/engine/a;->d:Lcom/qihoo/security/engine/a$a;

    iget v2, p0, Lcom/qihoo/security/engine/a;->a:I

    iget-object v3, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lcom/qihoo/security/engine/a$a;->a(ILjava/util/List;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v4, p0, Lcom/qihoo/security/engine/a;->f:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean v4, p0, Lcom/qihoo/security/engine/a;->f:Z

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/a;->d:Lcom/qihoo/security/engine/a$a;

    iget v1, p0, Lcom/qihoo/security/engine/a;->a:I

    iget v2, p0, Lcom/qihoo/security/engine/a;->e:I

    iget-object v3, p0, Lcom/qihoo/security/engine/a;->b:Ljava/util/List;

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/engine/a$a;->a(IILjava/util/List;)V

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/a;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

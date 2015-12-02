.class public Lcom/qihoo/security/opti/b/a$b;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/opti/b/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/b/a$a;)V
    .locals 1

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 105
    const/16 v0, 0x14

    iput v0, p0, Lcom/qihoo/security/opti/b/a$b;->b:I

    .line 109
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/b/a$b;->c:Ljava/lang/ref/WeakReference;

    .line 110
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 113
    iget-boolean v0, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    .line 118
    return-void
.end method

.method public run()V
    .locals 4

    .prologue
    .line 122
    const/4 v0, 0x0

    .line 124
    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    if-eqz v1, :cond_3

    .line 143
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    if-nez v0, :cond_2

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/opti/b/a$b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/opti/b/a$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/b/a$a;

    .line 146
    if-eqz v0, :cond_2

    .line 147
    invoke-interface {v0}, Lcom/qihoo/security/opti/b/a$a;->a()V

    .line 151
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    .line 152
    return-void

    .line 128
    :cond_3
    const-wide/32 v2, 0xea60

    :try_start_0
    invoke-static {v2, v3}, Lcom/qihoo/security/opti/b/a$b;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :goto_1
    iget-boolean v1, p0, Lcom/qihoo/security/opti/b/a$b;->a:Z

    if-nez v1, :cond_1

    .line 137
    add-int/lit8 v0, v0, 0x1

    .line 138
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/qihoo/security/opti/b/a;->d()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/qihoo/security/opti/b/a$b;->b:I

    if-ge v0, v1, :cond_1

    invoke-static {}, Lcom/qihoo/security/opti/b/a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 129
    :catch_0
    move-exception v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1
.end method

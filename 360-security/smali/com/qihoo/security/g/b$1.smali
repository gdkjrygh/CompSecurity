.class Lcom/qihoo/security/g/b$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/g/b;->a()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/g/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/g/b;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 129
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v0}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v0}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/g/b$a;->a()V

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v0}, Lcom/qihoo/security/g/b;->b(Lcom/qihoo/security/g/b;)I

    move-result v0

    if-nez v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->c(Lcom/qihoo/security/g/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v2}, Lcom/qihoo/security/g/b;->d(Lcom/qihoo/security/g/b;)Ljava/io/File;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;Ljava/lang/String;Ljava/io/File;)I

    move-result v0

    .line 134
    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 135
    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/g/b$a;->a(I)V

    .line 143
    :cond_1
    :goto_0
    monitor-enter p0

    .line 144
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;Z)Z

    .line 145
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    return-void

    .line 137
    :cond_2
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->b(Lcom/qihoo/security/g/b;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->c(Lcom/qihoo/security/g/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v2}, Lcom/qihoo/security/g/b;->e(Lcom/qihoo/security/g/b;)[B

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;Ljava/lang/String;[B)I

    move-result v0

    .line 139
    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 140
    iget-object v1, p0, Lcom/qihoo/security/g/b$1;->a:Lcom/qihoo/security/g/b;

    invoke-static {v1}, Lcom/qihoo/security/g/b;->a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/g/b$a;->a(I)V

    goto :goto_0

    .line 145
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

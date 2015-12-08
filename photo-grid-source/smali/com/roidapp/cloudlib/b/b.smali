.class final Lcom/roidapp/cloudlib/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/ae;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/a;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;)I

    move-result v0

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/j;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/j;->d()V

    .line 100
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(I)V

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/g;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/g;->d()V

    .line 107
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/b;->a:Lcom/roidapp/cloudlib/b/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(I)V

    goto :goto_0
.end method

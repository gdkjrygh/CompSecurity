.class final Lcom/roidapp/cloudlib/upload/z;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/x;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/x;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/a/h;)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/ab;->a()V

    .line 117
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->b(Lcom/roidapp/cloudlib/upload/x;)V

    .line 124
    :goto_0
    return-void

    .line 121
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;Lcom/roidapp/cloudlib/sns/b/a/h;)V

    goto :goto_0
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/ab;->a()V

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->c(Lcom/roidapp/cloudlib/upload/x;)V

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/x;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 137
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->d(Lcom/roidapp/cloudlib/upload/x;)V

    .line 143
    :goto_0
    return-void

    .line 139
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->b(Lcom/roidapp/cloudlib/upload/x;)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 110
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    .line 1147
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1148
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/z;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/upload/ab;->a()V

    .line 1151
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/upload/z;->a(Lcom/roidapp/cloudlib/sns/b/a/h;)V

    .line 110
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 110
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/upload/z;->a(Lcom/roidapp/cloudlib/sns/b/a/h;)V

    return-void
.end method

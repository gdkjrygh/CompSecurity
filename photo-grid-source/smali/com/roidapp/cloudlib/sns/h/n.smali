.class final Lcom/roidapp/cloudlib/sns/h/n;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;)V
    .locals 0

    .prologue
    .line 1133
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/n;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 1146
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/n;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0, p2}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;Ljava/lang/Exception;)V

    .line 1147
    return-void
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1133
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/x;

    .line 2141
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/n;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1133
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1133
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/x;

    .line 3136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/n;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1133
    return-void
.end method

.class final Lcom/roidapp/cloudlib/sns/r;
.super Lcom/roidapp/cloudlib/sns/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/x",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/w;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 270
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/r;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 270
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/p;

    .line 1273
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/r;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 1274
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/x;->a(Ljava/lang/Object;)V

    .line 270
    return-void
.end method

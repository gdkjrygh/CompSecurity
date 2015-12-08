.class final Lcom/roidapp/imagelib/filter/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/bg;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/bg;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bh;->a:Lcom/roidapp/imagelib/filter/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bh;->a:Lcom/roidapp/imagelib/filter/bg;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/bg;)Lcom/roidapp/imagelib/filter/ad;

    move-result-object v0

    if-nez v0, :cond_0

    .line 106
    :goto_0
    return-void

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bh;->a:Lcom/roidapp/imagelib/filter/bg;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/bg;)Lcom/roidapp/imagelib/filter/ad;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ad;->e()V

    goto :goto_0
.end method

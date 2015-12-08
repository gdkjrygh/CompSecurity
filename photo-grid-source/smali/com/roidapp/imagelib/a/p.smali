.class final Lcom/roidapp/imagelib/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/roidapp/imagelib/a/p;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 324
    iget-object v0, p0, Lcom/roidapp/imagelib/a/p;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/roidapp/imagelib/a/p;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/a/y;->c()V

    .line 327
    :cond_0
    return-void
.end method

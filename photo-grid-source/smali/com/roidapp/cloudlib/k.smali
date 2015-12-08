.class final Lcom/roidapp/cloudlib/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/j;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/j;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/roidapp/cloudlib/k;->a:Lcom/roidapp/cloudlib/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 298
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    iget-object v0, p0, Lcom/roidapp/cloudlib/k;->a:Lcom/roidapp/cloudlib/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/j;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/k;->a(Landroid/content/Context;)V

    .line 299
    iget-object v0, p0, Lcom/roidapp/cloudlib/k;->a:Lcom/roidapp/cloudlib/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/j;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->d(Landroid/content/Context;)V

    .line 300
    iget-object v0, p0, Lcom/roidapp/cloudlib/k;->a:Lcom/roidapp/cloudlib/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/j;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 301
    return-void
.end method

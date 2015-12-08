.class final Lcom/roidapp/cloudlib/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/p;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/p;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lcom/roidapp/cloudlib/r;->a:Lcom/roidapp/cloudlib/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 425
    iget-object v0, p0, Lcom/roidapp/cloudlib/r;->a:Lcom/roidapp/cloudlib/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->g(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 426
    return-void
.end method

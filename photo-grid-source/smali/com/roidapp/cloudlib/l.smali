.class final Lcom/roidapp/cloudlib/l;
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
    .line 304
    iput-object p1, p0, Lcom/roidapp/cloudlib/l;->a:Lcom/roidapp/cloudlib/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/roidapp/cloudlib/l;->a:Lcom/roidapp/cloudlib/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/j;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 310
    return-void
.end method

.class final Lcom/roidapp/cloudlib/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/g;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/g;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/roidapp/cloudlib/i;->a:Lcom/roidapp/cloudlib/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/i;->a:Lcom/roidapp/cloudlib/g;

    iget-object v0, v0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->d(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 253
    return-void
.end method

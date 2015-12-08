.class final Lcom/roidapp/cloudlib/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/AccountMgrActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/roidapp/cloudlib/a;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/a;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->finish()V

    .line 92
    return-void
.end method

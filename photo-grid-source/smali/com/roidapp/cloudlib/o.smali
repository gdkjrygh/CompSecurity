.class final Lcom/roidapp/cloudlib/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/m;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/m;)V
    .locals 0

    .prologue
    .line 360
    iput-object p1, p0, Lcom/roidapp/cloudlib/o;->a:Lcom/roidapp/cloudlib/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/roidapp/cloudlib/o;->a:Lcom/roidapp/cloudlib/m;

    iget-object v0, v0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 367
    return-void
.end method

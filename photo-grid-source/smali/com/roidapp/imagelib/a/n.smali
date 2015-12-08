.class final Lcom/roidapp/imagelib/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 947
    iput-object p1, p0, Lcom/roidapp/imagelib/a/n;->b:Lcom/roidapp/imagelib/a/i;

    iput-object p2, p0, Lcom/roidapp/imagelib/a/n;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 950
    iget-object v0, p0, Lcom/roidapp/imagelib/a/n;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 951
    return-void
.end method

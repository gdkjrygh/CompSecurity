.class final Lcom/roidapp/imagelib/retouch/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/imagelib/retouch/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/a;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/b;->b:Lcom/roidapp/imagelib/retouch/a;

    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/b;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/b;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 219
    return-void
.end method

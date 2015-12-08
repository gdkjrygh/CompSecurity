.class final Lcom/roidapp/photogrid/release/ii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ii;->b:Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ii;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ii;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 205
    return-void
.end method

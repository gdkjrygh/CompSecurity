.class final Lcom/roidapp/photogrid/release/kh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/kg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kg;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kh;->b:Lcom/roidapp/photogrid/release/kg;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/kh;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kh;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 159
    return-void
.end method

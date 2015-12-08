.class final Lcom/roidapp/photogrid/release/jt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 2256
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jt;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 2260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jt;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->H(Lcom/roidapp/photogrid/release/ImageSelector;)V

    .line 2261
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2262
    return-void
.end method

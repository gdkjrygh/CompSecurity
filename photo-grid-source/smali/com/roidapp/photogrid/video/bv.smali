.class final Lcom/roidapp/photogrid/video/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;)V
    .locals 0

    .prologue
    .line 416
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bv;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 419
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 420
    return-void
.end method

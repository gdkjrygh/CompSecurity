.class final Lcom/roidapp/photogrid/video/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 1220
    iput-object p1, p0, Lcom/roidapp/photogrid/video/aw;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 1224
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1225
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aw;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->J(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    .line 1226
    return-void
.end method

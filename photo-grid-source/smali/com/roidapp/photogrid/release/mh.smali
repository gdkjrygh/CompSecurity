.class final Lcom/roidapp/photogrid/release/mh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 0

    .prologue
    .line 4779
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mh;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 4783
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 4784
    return-void
.end method

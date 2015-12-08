.class final Lcom/roidapp/photogrid/cloud/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ai;->a:Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ai;->a:Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->j()V

    .line 67
    return-void
.end method

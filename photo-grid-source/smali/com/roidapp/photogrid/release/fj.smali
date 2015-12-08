.class final Lcom/roidapp/photogrid/release/fj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fi;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fj;->a:Lcom/roidapp/photogrid/release/fi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 101
    new-instance v0, Lcom/roidapp/photogrid/release/fb;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/fb;-><init>()V

    .line 102
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fj;->a:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d03ec

    const-string v3, "FragmentLayout"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 104
    return-void
.end method

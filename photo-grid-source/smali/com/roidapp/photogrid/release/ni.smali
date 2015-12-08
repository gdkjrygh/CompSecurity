.class final Lcom/roidapp/photogrid/release/ni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ng;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ng;)V
    .locals 0

    .prologue
    .line 647
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ni;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 651
    const-string v0, "Video/Preview/Click"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 652
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ni;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ng;->n()V

    .line 653
    return-void
.end method

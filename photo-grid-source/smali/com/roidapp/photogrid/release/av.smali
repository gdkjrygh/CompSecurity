.class final Lcom/roidapp/photogrid/release/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/as;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/as;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/roidapp/photogrid/release/av;->a:Lcom/roidapp/photogrid/release/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/av;->a:Lcom/roidapp/photogrid/release/as;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/as;->dismiss()V

    .line 113
    return-void
.end method

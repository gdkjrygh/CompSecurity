.class final Lcom/roidapp/photogrid/release/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/bg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bg;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bh;->a:Lcom/roidapp/photogrid/release/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bh;->a:Lcom/roidapp/photogrid/release/bg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bg;->a(Lcom/roidapp/photogrid/release/bg;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const-string v0, "110"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bh;->a:Lcom/roidapp/photogrid/release/bg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bg;->b(Lcom/roidapp/photogrid/release/bg;)Landroid/app/Activity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 120
    :cond_0
    return-void
.end method

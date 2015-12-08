.class final Lcom/roidapp/photogrid/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ba;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ba;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/roidapp/photogrid/bc;->a:Lcom/roidapp/photogrid/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 187
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/roidapp/photogrid/bc;->a:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 189
    const/4 v0, 0x1

    .line 191
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

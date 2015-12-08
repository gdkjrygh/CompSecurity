.class final Lcom/roidapp/photogrid/release/rk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ri;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ri;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/roidapp/photogrid/release/rk;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rk;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->b(Lcom/roidapp/photogrid/release/ri;)V

    .line 83
    const/4 v0, 0x1

    .line 85
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

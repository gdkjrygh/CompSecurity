.class final Lcom/roidapp/photogrid/release/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/as;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/as;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/roidapp/photogrid/release/at;->a:Lcom/roidapp/photogrid/release/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/release/at;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->a(Lcom/roidapp/photogrid/release/as;)Z

    move-result v0

    return v0
.end method

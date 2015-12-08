.class final Lcom/roidapp/photogrid/release/eo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lcom/roidapp/photogrid/release/eo;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eo;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->g(Lcom/roidapp/photogrid/release/el;)Z

    .line 264
    return-void
.end method

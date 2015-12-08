.class final Lcom/roidapp/photogrid/release/gh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 1192
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gh;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 1196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gh;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->t(Lcom/roidapp/photogrid/release/ge;)Z

    .line 1198
    return-void
.end method

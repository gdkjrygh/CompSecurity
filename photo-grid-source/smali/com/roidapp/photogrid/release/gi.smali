.class final Lcom/roidapp/photogrid/release/gi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 1214
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gi;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1219
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gi;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->t(Lcom/roidapp/photogrid/release/ge;)Z

    .line 1222
    return-void
.end method

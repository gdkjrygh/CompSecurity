.class final Lcom/roidapp/photogrid/release/gj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1204
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gj;->c:Lcom/roidapp/photogrid/release/ge;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/gj;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/gj;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 1209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gj;->c:Lcom/roidapp/photogrid/release/ge;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gj;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/gj;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V

    .line 1210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gj;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->t(Lcom/roidapp/photogrid/release/ge;)Z

    .line 1211
    return-void
.end method

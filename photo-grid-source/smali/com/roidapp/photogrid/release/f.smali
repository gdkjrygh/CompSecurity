.class final Lcom/roidapp/photogrid/release/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/b;

.field final synthetic b:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;Lcom/roidapp/photogrid/release/b;)V
    .locals 0

    .prologue
    .line 1461
    iput-object p1, p0, Lcom/roidapp/photogrid/release/f;->b:Lcom/roidapp/photogrid/release/c;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/f;->a:Lcom/roidapp/photogrid/release/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/f;->b:Lcom/roidapp/photogrid/release/c;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/f;->a:Lcom/roidapp/photogrid/release/b;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/c;Lcom/roidapp/photogrid/release/b;)V

    .line 1467
    return-void
.end method

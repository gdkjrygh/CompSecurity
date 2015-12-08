.class final Lcom/roidapp/photogrid/common/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/bq;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lcom/roidapp/photogrid/common/cb;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/common/cb;->a:Lcom/roidapp/photogrid/common/bq;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v3, v2}, Lcom/roidapp/photogrid/common/bq;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 251
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->b()V

    .line 252
    return-void
.end method

.class final Lcom/roidapp/photogrid/a/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a/l;

.field final synthetic b:Lcom/roidapp/photogrid/a/n;

.field final synthetic c:Lcom/roidapp/photogrid/a/g;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/a/g;Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/n;)V
    .locals 0

    .prologue
    .line 662
    iput-object p1, p0, Lcom/roidapp/photogrid/a/h;->c:Lcom/roidapp/photogrid/a/g;

    iput-object p2, p0, Lcom/roidapp/photogrid/a/h;->a:Lcom/roidapp/photogrid/a/l;

    iput-object p3, p0, Lcom/roidapp/photogrid/a/h;->b:Lcom/roidapp/photogrid/a/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 664
    iget-object v0, p0, Lcom/roidapp/photogrid/a/h;->c:Lcom/roidapp/photogrid/a/g;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/g;->d:Lcom/roidapp/photogrid/a/k;

    iget-object v1, p0, Lcom/roidapp/photogrid/a/h;->a:Lcom/roidapp/photogrid/a/l;

    iget-object v2, p0, Lcom/roidapp/photogrid/a/h;->b:Lcom/roidapp/photogrid/a/n;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/a/k;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/n;)V

    .line 665
    return-void
.end method

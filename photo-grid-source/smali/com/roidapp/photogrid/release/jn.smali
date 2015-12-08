.class final Lcom/roidapp/photogrid/release/jn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/jm;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/jm;)V
    .locals 0

    .prologue
    .line 362
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jn;->a:Lcom/roidapp/photogrid/release/jm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jn;->a:Lcom/roidapp/photogrid/release/jm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/jm;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->t(Lcom/roidapp/photogrid/release/ImageSelector;)V

    .line 366
    return-void
.end method

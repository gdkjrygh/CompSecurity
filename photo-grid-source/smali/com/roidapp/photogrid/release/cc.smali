.class final Lcom/roidapp/photogrid/release/cc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/by;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/by;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cc;->a:Lcom/roidapp/photogrid/release/by;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cc;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->fullScroll(I)Z

    .line 280
    return-void
.end method

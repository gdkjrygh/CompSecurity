.class public final Lcom/roidapp/photogrid/release/nk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ng;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ng;)V
    .locals 0

    .prologue
    .line 777
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nk;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 778
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nk;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->r(Lcom/roidapp/photogrid/release/ng;)V

    .line 783
    return-void
.end method

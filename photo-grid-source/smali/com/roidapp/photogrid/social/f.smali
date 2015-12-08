.class final Lcom/roidapp/photogrid/social/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/social/d;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/social/d;)V
    .locals 0

    .prologue
    .line 405
    iput-object p1, p0, Lcom/roidapp/photogrid/social/f;->a:Lcom/roidapp/photogrid/social/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/social/f;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;Lcom/facebook/GraphResponse;)V

    .line 409
    return-void
.end method

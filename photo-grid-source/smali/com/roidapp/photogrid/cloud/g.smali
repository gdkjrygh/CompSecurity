.class final Lcom/roidapp/photogrid/cloud/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/upload/ab;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 0

    .prologue
    .line 656
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/g;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 665
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 659
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/g;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/cloud/br;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 660
    return-void
.end method

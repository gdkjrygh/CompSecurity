.class final Lcom/roidapp/photogrid/cloud/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/cloud/cm;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 798
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/aq;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aq;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 811
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aq;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/lang/String;)V

    .line 812
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 801
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aq;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/lang/String;Z)V

    .line 802
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 816
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aq;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f()V

    .line 817
    return-void
.end method

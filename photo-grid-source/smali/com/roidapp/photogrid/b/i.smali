.class final Lcom/roidapp/photogrid/b/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/cm/kinfoc/a/d",
        "<",
        "Lcom/cm/kinfoc/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/b/h;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/b/h;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/roidapp/photogrid/b/i;->a:Lcom/roidapp/photogrid/b/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/cm/kinfoc/a/h;

    .line 1030
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/cm/kinfoc/a/h;->a:Lcom/cm/kinfoc/a/j;

    if-nez v0, :cond_1

    .line 1031
    :cond_0
    :goto_0
    return-void

    .line 1034
    :cond_1
    iget v0, p1, Lcom/cm/kinfoc/a/h;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1037
    :pswitch_0
    iget-object v0, p1, Lcom/cm/kinfoc/a/h;->a:Lcom/cm/kinfoc/a/j;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/h;->b(Lcom/cm/kinfoc/a/j;)V

    goto :goto_0

    .line 1034
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

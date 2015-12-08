.class public abstract Lcom/roidapp/photogrid/cloud/a/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:I

.field protected d:Landroid/content/Context;

.field protected e:Lcom/roidapp/photogrid/cloud/a/t;

.field protected f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/l;->d:Landroid/content/Context;

    .line 29
    iput p2, p0, Lcom/roidapp/photogrid/cloud/a/l;->a:I

    .line 30
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/a/l;->e:Lcom/roidapp/photogrid/cloud/a/t;

    .line 31
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public a()V
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/l;->d:Landroid/content/Context;

    .line 52
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/l;->a:I

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/l;->e:Lcom/roidapp/photogrid/cloud/a/t;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/l;->e:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-interface {v0, p0}, Lcom/roidapp/photogrid/cloud/a/t;->a(Lcom/roidapp/photogrid/cloud/a/l;)V

    .line 48
    :cond_0
    return-void
.end method

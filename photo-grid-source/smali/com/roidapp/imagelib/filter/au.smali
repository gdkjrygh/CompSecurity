.class final Lcom/roidapp/imagelib/filter/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/bd;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/at;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/at;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/au;->a:Lcom/roidapp/imagelib/filter/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 3

    .prologue
    .line 211
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/au;->a:Lcom/roidapp/imagelib/filter/at;

    iget-object v1, v0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/au;->a:Lcom/roidapp/imagelib/filter/at;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/at;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0, p1}, Lcom/roidapp/imagelib/filter/aj;->a(Landroid/widget/FrameLayout;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 212
    return-void
.end method

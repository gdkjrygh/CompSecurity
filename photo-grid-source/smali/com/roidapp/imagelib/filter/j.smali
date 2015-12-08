.class final Lcom/roidapp/imagelib/filter/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

.field final synthetic b:Lcom/roidapp/imagelib/filter/FilterListView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/FilterListView;Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;)V
    .locals 0

    .prologue
    .line 341
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/j;->b:Lcom/roidapp/imagelib/filter/FilterListView;

    iput-object p2, p0, Lcom/roidapp/imagelib/filter/j;->a:Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 347
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/j;->b:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/j;->a:Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 350
    return-void
.end method

.class final Lcom/roidapp/cloudlib/template/c/g;
.super Landroid/support/v7/widget/as;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/template/c/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/c/f;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/g;->a:Lcom/roidapp/cloudlib/template/c/f;

    invoke-direct {p0}, Landroid/support/v7/widget/as;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/g;->a:Lcom/roidapp/cloudlib/template/c/f;

    iget v0, v0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/graphics/Rect;->right:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 153
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/g;->a:Lcom/roidapp/cloudlib/template/c/f;

    iget v0, v0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 154
    return-void
.end method

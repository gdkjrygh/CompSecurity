.class final Lcom/roidapp/cloudlib/google/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/k;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/k;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    .line 69
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

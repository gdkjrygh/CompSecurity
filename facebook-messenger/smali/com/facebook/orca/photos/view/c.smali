.class public Lcom/facebook/orca/photos/view/c;
.super Lcom/facebook/widget/f;
.source "PhotoMessageView.java"


# instance fields
.field private a:Lcom/facebook/widget/images/UrlImage;

.field private b:Lcom/facebook/ui/images/cache/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/view/c;->a(Landroid/content/Context;)V

    .line 25
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 41
    invoke-static {}, Lcom/facebook/ui/images/cache/e;->newBuilder()Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/g;->a(Z)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/cache/f;->MinScaleNonPowerOfTwo:Lcom/facebook/ui/images/cache/f;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/g;->a(Lcom/facebook/ui/images/cache/f;)Lcom/facebook/ui/images/cache/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/g;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/view/c;->b:Lcom/facebook/ui/images/cache/e;

    .line 45
    sget v0, Lcom/facebook/k;->orca_photo_message_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/c;->setContentView(I)V

    .line 46
    sget v0, Lcom/facebook/i;->photo_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/c;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/c;->a:Lcom/facebook/widget/images/UrlImage;

    .line 47
    return-void
.end method


# virtual methods
.method public setPhotoMessageItem(Lcom/facebook/orca/photos/view/b;)V
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/photos/view/c;->a:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {p1}, Lcom/facebook/orca/photos/view/b;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/photos/view/c;->b:Lcom/facebook/ui/images/cache/e;

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 53
    return-void
.end method

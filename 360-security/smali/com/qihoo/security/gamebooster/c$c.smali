.class public Lcom/qihoo/security/gamebooster/c$c;
.super Lcom/qihoo/security/gamebooster/c$b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public c:Lcom/qihoo/security/gamebooster/LocalGamePkg;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 331
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/c$b;-><init>()V

    .line 332
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/gamebooster/c$c;->a:I

    .line 333
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/c$e;)V
    .locals 3

    .prologue
    .line 337
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/c$b;->a(Lcom/qihoo/security/gamebooster/c$e;)V

    .line 338
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 339
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 343
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->h(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 344
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->e(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setTag(Ljava/lang/Object;)V

    .line 345
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->k(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/locale/widget/LocaleTextView;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    .line 346
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->e(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->h(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Landroid/widget/LinearLayout;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    .line 347
    return-void
.end method

.class public Lcom/qihoo/security/gamebooster/c$b;
.super Lcom/qihoo/security/gamebooster/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public b:Lcom/qihoo/security/gamebooster/LocalGamePkg;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 296
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/c$a;-><init>()V

    .line 297
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/gamebooster/c$b;->a:I

    .line 298
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/c$e;)V
    .locals 3

    .prologue
    .line 302
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/c$a;->a(Lcom/qihoo/security/gamebooster/c$e;)V

    .line 303
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 307
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->g(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$b;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 308
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->d(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$b;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setTag(Ljava/lang/Object;)V

    .line 309
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->j(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c$b;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/locale/widget/LocaleTextView;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    .line 310
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->d(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->g(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c$b;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Landroid/widget/LinearLayout;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    .line 311
    return-void
.end method

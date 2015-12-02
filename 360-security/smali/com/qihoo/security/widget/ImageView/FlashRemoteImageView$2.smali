.class Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 123
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/b;->a(Lcom/nineoldandroids/a/a;)V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->b:Z

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->a(Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;I)I

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->invalidate()V

    .line 127
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 116
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/b;->b(Lcom/nineoldandroids/a/a;)V

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->b:Z

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView$2;->a:Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;->invalidate()V

    .line 119
    return-void
.end method
